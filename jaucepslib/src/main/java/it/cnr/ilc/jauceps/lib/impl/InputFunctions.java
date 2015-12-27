/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.Segments;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF1;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF2;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.sql.Connection;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class InputFunctions {

    private AucepsResponse response;
    private TravellingTables travellingtables;
    private TravellingQueries travellingqueries;

    /**
     *
     * @param response
     * @param travellingtables
     * @param travellingqueries
     */
    public InputFunctions(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries) {
        this.response = response;
        this.travellingtables = travellingtables;
        this.travellingqueries = travellingqueries;
    }

    Analyses analyses;

    Analysis cur_analysis;
    private RunAnalyses runanalyses = new RunAnalyses();

    Vars vars = new Vars();
    boolean sqlDebug = vars.isSqlDebug();
    boolean flowDebug = vars.isFlowDebug();
    boolean valueDebug = vars.isValueDebug();
    boolean deepFlowDebug = vars.isDeepFlowDebug();
    boolean printSplash = vars.isPrintSplash();
    boolean callerDebug = vars.isCallerDebug();
    boolean analysisDebug = vars.isAnalysisDebug();
    boolean printStructDebug = vars.isPrintStructDebug();
    int printFormatted = vars.getPrintFormatted();
    boolean debugJson = vars.isDebugJson();
    boolean useInPipe = vars.isUseInPipe();
    boolean operationDebug = vars.isOperationDebug();
    String EOS = vars.getEOS();

    // log4j
    int loglevel = 0;
    /* only info */

    static final String CLASS_NAME = InputFunctions.class.getName();
    static Logger log = Logger.getLogger(CLASS_NAME);

    public Integer silcall(Connection conn, SilType sil, String wordform) {
        String routine = InputFunctions.class.getName() + "/silcall";
        String logmess = "";
        String origWf = wordform;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java", routine);
            log.debug(logmess);
        }
        /*
         1- Change wordform to lowercase
         2- Change wordform v -> u
         3- Change wordfom j->i 
         4- Assign changed wordform to sil.form
         */
        /*1*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGING wordform -%s- to lowercase", wordform);
            log.debug(logmess);
        }
        wordform = wordform.toLowerCase();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGED wordform -%s- to lowercase", wordform);
            log.debug(logmess);
        }

        /*2&3*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGING wordform -%s- v-> and j->i", wordform);
            log.debug(logmess);
        }

        wordform = wordform.replaceAll("v", "u");
        wordform = wordform.replaceAll("j", "i");

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHANGED wordform -%s- v-> and j->i", wordform);
            log.debug(logmess);
        }

        /*4*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING wordform %s to sil.form -%s-", wordform, sil.getForm());
            log.debug(logmess);
        }

        sil.setForm(wordform);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED wordform %s to sil.form -%s-", wordform, sil.getForm());
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING initAnalyses in  RunAnalyses.java CALLER %s", routine);
            log.debug(logmess);

        }

        response = runanalyses.initAnalyses(response, origWf, wordform);
//        runanalyses.setAnalyses(analyses);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****SETTING RUNANALYSES  in sillib");
            log.debug(logmess);
        }
        //getSillib().setRunanalyses(getRunanalyses());

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****SET RUNANALYSES in sillib");
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING siln in  InputFunctions.java. CALLER %s", routine);
            log.debug(logmess);

        }

        siln(response, travellingtables, travellingqueries);
        response.setSil(sil);
        setResponse(response);

        return 0;

    }

    /**
     * loops spf_1 spf_2 si sf sm_1 sm_2
     *
     * @param response
     * @param travellingtables
     * @param travellingqueries
     * @return
     */
    public AucepsResponse siln(AucepsResponse response,
            TravellingTables travellingtables,
            TravellingQueries travellingqueries) {
        String routine = InputFunctions.class.getName() + "/siln";
        String logmess = "";
        SilType sil = response.getSil();
        String[] segment = new String[7];

        // sillib for managing radicals
        Sillib sillib = new Sillib();

        // queries
        TabSpfQuery tabspfq_1 = travellingqueries.getFirstTabSpfq();
        tabspfq_1.setConn(travellingqueries.getConn());

        TabSpfQuery tabspfq_2 = travellingqueries.getSecondTabSpfq();
        tabspfq_2.setConn(travellingqueries.getConn());

        // list of tables
        List<TabSPF> tabsSpf_1;
        List<TabSPF> tabsSpf_2;
        List<TabSI> tabsSi;
        List<TabSF> tabsSf;
        List<TabSM> tabsSm_1;
        List<TabSM> tabsSm_2;

        //indicators
        boolean isanySpf_1 = travellingtables.isIsanySPF1();
        boolean isanySpf_2 = travellingtables.isIsanySPF2();
        boolean isanySi = travellingtables.isIsanySI();
        boolean isanySf = travellingtables.isIsanySF();
        boolean isanySm_1 = travellingtables.isIsanySM1();
        boolean isanySm_2 = travellingtables.isIsanySM2();

        // loop counters
        int spf_1 = 0;
        int spf_2 = 0;
        int si = 0;
        int sf = 0;
        int sm_1 = 0;
        int sm_2 = 0;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in InputFunctions.java", routine);
            log.debug(logmess);
        }
        while (sil.getForm() != null) { // start while on form

            if (callerDebug || deepFlowDebug) {
                logmess = String.format("CALLING getSPFset in TabSpfQuery.java with parameters: form -%s- and SPF1 -%d-. CALLER %s", sil.getForm(), Segments.SPF1, routine);
                log.debug(logmess);

            }

            tabsSpf_1 = tabspfq_1.getSPFset(sil.getForm(), SPF1);
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setFirstListOfTabSpf in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setFirstListOfTabSpf(tabsSpf_1);
            isanySpf_1 = travellingtables.isIsanySPF1();
            if (valueDebug) {
                logmess = String.format("****VALUES of getFirstListOfTabSpf  -%d-", travellingtables.getFirstListOfTabSpf().size());
                log.debug(logmess);

                logmess = String.format("****VALUES of getFirstListOfTabSpf is -%d- ADDITIONAL LOOP SPF1 -%d-", travellingtables.getFirstListOfTabSpf().size(), travellingtables.getFirstListOfTabSpf().size());
                log.debug(logmess);
            }
            for (TabSPF tabSpf_1 : tabsSpf_1) {
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setFirstTabSpf in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 1 in -%s-", routine);
                    log.debug(logmess);

                }
                travellingtables.setFirstTabSpf(tabSpf_1);
                travellingtables.setStatus(1);
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW LOOP SPF1. "
                            + "Counters spf1 -%d- "
                            + "spf2 -%d- "
                            + "si -%d- "
                            + "sf -%d- "
                            + "sm_1 -%d- "
                            + "sm_2 -%d- "
                            + "isanySPF1 -%s- "
                            + "isanySPF2 -%s- "
                            + "isanySI -%s- "
                            + "isanySF -%s- "
                            + "isanySM1 -%s- "
                            + "isanySM2 -%s- "
                            + "travellingtabes.status -%d-",
                            spf_1,
                            spf_2,
                            si,
                            sf,
                            sm_1,
                            sm_2,
                            isanySpf_1,
                            isanySpf_2,
                            isanySi,
                            isanySf,
                            isanySm_1,
                            isanySm_2,
                            travellingtables.getStatus());
                    log.debug(logmess);
                }
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine %s", routine);
                    log.debug(logmess);
                }
                segment = sil.getSegment();
                segment[6] = EOS;
                sil.setSegment(segment);
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine %s", routine);
                    log.debug(logmess);
                }
                if (valueDebug) {
                    segment = sil.getSegment();
                    for (int i = 0; i < segment.length; i++) {
                        logmess = String.format("****VALUES IN LOOP getSPFset_1 Segment at index -%d- with value -%s-", i, segment[i]);
                        log.debug(logmess);
                    }
                }
                if (callerDebug) {
                    logmess = String.format("CALLING spferic in  Sillib.java. CALLER %s", routine);
                    log.debug(logmess);

                }

                /* call spferic and update sil */
                sil = sillib.spferic(sil, tabSpf_1);
                response.setSil(sil);
                if (callerDebug || deepFlowDebug) {
                    logmess = String.format("CALLING getSPFset in TabSpfQuery.java with parameters: rad_spfe -%s- and SPF2 -%d-. CALLER %s", sil.getRad_spfe(), SPF2, routine);
                    log.debug(logmess);
                }

                tabsSpf_2 = tabspfq_2.getSPFset(sil.getRad_spfe(), SPF2);
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setSecondListOfTabSpf in -%s-", routine);
                    log.debug(logmess);

                }
                travellingtables.setSecondListOfTabSpf(tabsSpf_2);
                isanySpf_2 = travellingtables.isIsanySPF2();
                // loop over resultset from tabspf with SPF2
                if (valueDebug) {
                    logmess = String.format("****VALUES of getSecondListOfTabSpf  -%d-", travellingtables.getSecondListOfTabSpf().size());
                    log.debug(logmess);

                    logmess = String.format("****VALUES of getFirstListOfTabSpf is -%d- ADDITIONAL LOOP SPF2 -%d-", travellingtables.getSecondListOfTabSpf().size(), travellingtables.getSecondListOfTabSpf().size());
                    log.debug(logmess);

                }
                for (TabSPF tabSpf_2 : tabsSpf_2) {
                    if (operationDebug) {
                        logmess = String.format("OPERATIONDEBUG SETTING setSecondTabSpf in -%s-", routine);
                        log.debug(logmess);
                        logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 1 in -%s-", routine);
                        log.debug(logmess);

                    }
                    travellingtables.setSecondTabSpf(tabSpf_2);
                    travellingtables.setStatus(2);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW LOOP SPF2. "
                                + "Counters spf1 -%d- "
                                + "spf2 -%d- "
                                + "si -%d- "
                                + "sf -%d- "
                                + "sm_1 -%d- "
                                + "sm_2 -%d- "
                                + "isanySPF1 -%s- "
                                + "isanySPF2 -%s- "
                                + "isanySI -%s- "
                                + "isanySF -%s- "
                                + "isanySM1 -%s- "
                                + "isanySM2 -%s- "
                                + "travellingtabes.status -%d-",
                                spf_1,
                                spf_2,
                                si,
                                sf,
                                sm_1,
                                sm_2,
                                isanySpf_1,
                                isanySpf_2,
                                isanySi,
                                isanySf,
                                isanySm_1,
                                isanySm_2,
                                travellingtables.getStatus());
                        log.debug(logmess);
                    }
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine %s", routine);
                        log.debug(logmess);
                    }
                    segment = sil.getSegment();
                    segment[0] = EOS;

                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine %s", routine);
                        log.debug(logmess);
                    }

                    if (callerDebug) {
                        logmess = String.format("CALLING spfric in  Sillib.java. CALLER %s", routine);
                        log.debug(logmess);
                    }
                    /* call spfric and update sil*/
                    sil = sillib.spfric(sil,tabSpf_2);
                    response.setSil(sil);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine %s", routine);
                        log.debug(logmess);
                    }

                    segment[5] = tabSpf_2.getSPF();
                    sil.setSegment(segment);
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine %s", routine);
                        log.debug(logmess);
                    }
                    if (valueDebug) {
                        segment = sil.getSegment();
                        for (int i = 0; i < segment.length; i++) {
                            logmess = String.format("****VALUES IN LOOP getSPFset_2 Segment at index -%d- with value -%s-", i, segment[i]);
                            log.debug(logmess);
                        }
                    }

                    if (callerDebug || deepFlowDebug) {
                        logmess = String.format("CALLING getSIset in TabSiQuery.java with parameters: rad_spf -%s-. CALLER %s", sil.getRad_spf(), routine);
                        log.debug(logmess);
                    }
                    spf_2++;

                } //  rof tabSpf_2
                travellingtables.setIsanySPF2(false);
                spf_1++;
            } //  rof tabSpf_1
            travellingtables.setIsanySPF1(false);

            break;

        } // end while

        response.setStatus(travellingtables.getStatus());
        return response;

    } // end siln

    /**
     * @return the response
     */
    public AucepsResponse getResponse() {
        return response;
    }

    /**
     * @return the travellingtables
     */
    public TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @return the travellingqueries
     */
    public TravellingQueries getTravellingqueries() {
        return travellingqueries;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(AucepsResponse response) {
        this.response = response;
    }

    /**
     * @param travellingtables the travellingtables to set
     */
    public void setTravellingtables(TravellingTables travellingtables) {
        this.travellingtables = travellingtables;
    }

    /**
     * @param travellingqueries the travellingqueries to set
     */
    public void setTravellingqueries(TravellingQueries travellingqueries) {
        this.travellingqueries = travellingqueries;
    }

}
