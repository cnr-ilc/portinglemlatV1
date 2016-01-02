/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_LES;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public final class RunStaticAnalyses {

    /**
     * @return the travellingtables
     */
    public static TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @param aTravellingtables the travellingtables to set
     */
    public static void setTravellingtables(TravellingTables aTravellingtables) {
        travellingtables = aTravellingtables;
    }

    private RunStaticAnalyses() {
    }
    private static TravellingTables travellingtables;

    private static final boolean sqlDebug = StaticVars.isSqlDebug();
    private static final boolean flowDebug = StaticVars.isFlowDebug();
    private static final boolean valueDebug = StaticVars.isValueDebug();
    private static final boolean deepFlowDebug = StaticVars.isDeepFlowDebug();
    private static final boolean printSplash = StaticVars.isPrintSplash();
    private static final boolean callerDebug = StaticVars.isCallerDebug();
    private static final boolean analysisDebug = StaticVars.isAnalysisDebug();
    private static final boolean printStructDebug = StaticVars.isPrintStructDebug();
    private static final int printFormatted = StaticVars.getPrintFormatted();
    private static final boolean debugJson = StaticVars.isDebugJson();
    private static final boolean useInPipe = StaticVars.isUseInPipe();
    private static final boolean operationDebug = StaticVars.isOperationDebug();
    private static final  String EOS = StaticVars.getEOS();

    int loglevel = 0; /* only info */

    static final String CLASS_NAME = RunStaticAnalyses.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    public static AucepsResponse analysis(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, String rad) {

        String routine = CLASS_NAME + "/analysis";
        String logmess = "";
        String rad_alt = "";

        int sai = 0, les = 0;
        SilType sil = response.getSil();
        

        /*queries*/
        TabLessarioQuery tablessarioq = travellingqueries.getTablessarioq();
        tablessarioq.setConn(travellingqueries.getConn());

        TabSaiQuery tabSaiq = travellingqueries.getTabsaiq();
        tabSaiq.setConn(travellingqueries.getConn());

        // lists
        List<TabLessario> tabsLessario;
        List<TabSAI> tabsSai;

        boolean isanySAI = false;
        boolean isanyLES = false;
        TabLessario areavs;

        /*LESSARIO*/
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java with sil.rad_sf -%s-", routine, rad);
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW COPYING in %s in Sillib.java rad -%s- on sil.radical -%s-", routine, rad, sil.getRadical());
            log.debug(logmess);
 
        }
        sil.setRadical(rad);
        response.setSil(sil);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW COPIED in %s in Sillib.java rad -%s- on sil.radical -%s-", routine, rad, sil.getRadical());
            log.debug(logmess);
        }
        if (callerDebug || deepFlowDebug) {
            logmess = String.format("CALLING getSAISet radical=-%s- CALLER %s", sil.getRadical(), routine);
            log.debug(logmess);
        }

        if (callerDebug || deepFlowDebug) {
            logmess = String.format("CALLING getSAIset in TabSaiQuery.java with parameters: radical -%s-. CALLER %s", sil.getRadical(), routine);
            log.debug(logmess);
        }
        tabsSai = tabSaiq.getSAIset(sil.getRadical());

        if (operationDebug) {
            logmess = String.format("OPERATIONDEBUG SETTING setListOfTabSf in -%s-", routine);
            log.debug(logmess);

        }
        travellingtables.setListOfTabSAI(tabsSai);
        isanySAI = travellingtables.isIsanySAI();
        for (TabSAI tabSai : tabsSai) {
            //for (Iterator<TabSAI> TabSAIit = tabsSai.iterator(); TabSAIit.hasNext();) { // LOOP SAI
            //tabSai = TabSAIit.next();
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW LOOP SAI. Counter sai -%d-  isanySAI -%s-", sai, isanySAI);
                log.debug(logmess);
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setTabSAI in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 11 in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setTabSAI(tabSai);
            travellingtables.setStatus("11");
            if (callerDebug || deepFlowDebug) {
                logmess = String.format("CALLING sairic radical=-%s- CALLER %s", sil.getRadical(), routine);
                log.debug(logmess);
            }
            Sillib sillib = new Sillib();
            sil = sillib.sairic(sil, tabSai);
            response.setSil(sil);
            rad_alt = sil.getRad_alt();
            /* loop over lessario */
            if (callerDebug) {
                logmess = String.format("CALLING getLESset with parameters rad_alt: -%s- CALLER %s ", rad_alt, routine);
                log.debug(logmess);
            }
            tabsLessario = tablessarioq.getLESset(rad_alt, BY_LES);
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING setListOfTabLessario in -%s-", routine);
                log.debug(logmess);

            }
            travellingtables.setListOfTabLessario(tabsLessario);
            isanyLES = travellingtables.isIsanyLes();
            for (TabLessario tabLessario : tabsLessario) {
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setTabLessario in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 12 in -%s-", routine);
                    log.debug(logmess);

                }
                //areavs = tabLessario;
                travellingtables.setTabLessario(tabLessario);
                travellingtables.setStatus("12");
                if (callerDebug) {
                    logmess = String.format("CALLING comp with parameters rad: -%s- CALLER %s ", rad, routine);
                    log.debug(logmess);
                }
                response = comp(response, travellingtables, travellingqueries, rad);
                les++;
            }// rof getLES
            travellingtables.setIsanyLes(false);
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW EXIT LOOP LES. Counter les -%d-  isanyLes -%s-", les, isanyLES);
                log.debug(logmess);
            }

            sai++;
        } // rof TABSAI
        travellingtables.setIsanySAI(false);

        /*records in tabsai*/
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW EXIT LOOP SAI. Counter sai -%d-  isanySAI -%s-", sai, isanySAI);
            log.debug(logmess);
        }

        if (les > 0) {
            response.setSil(sil);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with sil.rad_sf -%s-", routine, rad);
                log.debug(logmess);
            }
        } else {
            // no records in tabsai.Do something similar
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine %s", routine);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine %s", routine);
                log.debug(logmess);
            }
            sil.setInd_alt(EOS);
            sil.setRad_alt(EOS);
            response.setSil(sil);

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine %s", routine);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine %s", routine);
                log.debug(logmess);
            }
            /* loop over lessario */
            if (callerDebug) {
                logmess = String.format("CALLING getLESset with parameters radical: -%s- CALLER %s OUTSIDE TABSAI", sil.getRadical(), routine);
                log.debug(logmess);
            }
            tabsLessario = tablessarioq.getLESset(sil.getRadical(), BY_LES);
            for (TabLessario tabLessario : tabsLessario) {
                //for (Iterator<TabLessario> TabLESit = tabsLessario.iterator(); TabLESit.hasNext();) {
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING setTabLessario in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING status in travellingtables to 13 in -%s-", routine);
                    log.debug(logmess);

                }
                //areavs = tabLessario;
                travellingtables.setTabLessario(tabLessario);
                travellingtables.setStatus("13");
                if (callerDebug) {
                    logmess = String.format("CALLING comp with parameters rad: -%s- CALLER %s ", rad, routine);
                    log.debug(logmess);
                }
                response = comp(response, travellingtables, travellingqueries, rad);

                les++;
            }// rof getLES 
            travellingtables.setIsanyLes(false);
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -%d-  isanyLes -%s-", les, isanyLES);
                log.debug(logmess);
            }
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java with sil.rad_sf -%s- and radical -%s-", routine, rad, sil.getRadical());
                log.debug(logmess);
            }
            //setSil(lsil);
        }

        return response;
    }

    

    //public boolean comp(TabLE tabLe, TabSF tabSf, TabSM tabSm_1, TabSM tabSm_2, String rad_sf, boolean isanyspf1, boolean isanyspf2, boolean isanysi, boolean isanysm1, boolean isanysm2) {
    public static AucepsResponse comp(AucepsResponse response, TravellingTables travellingtables,
            TravellingQueries travellingqueries, String rad_sf) {
        String routine = CLASS_NAME + "/comp";
        String logmess = "";
        String a_gra = "";
        String SAI_cod = "";
        Comparator comparator = new Comparator();
        SilType sil = response.getSil();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in RunStaticAnalyses.java. Parameter %s", routine, rad_sf);
            log.debug(logmess);
        }

        // queries
        TabSaiQuery inisaiq = travellingqueries.getTabsaiq();
        inisaiq.setConn(travellingqueries.getConn());
        //List<TabSAI> tabsSai = inisaiq.getSAIset("-"); /* maybe sil.radical???*/

        // tables
        TabLessario tabLessario = travellingtables.getTabLessario();
        TabSAI tabSai = travellingtables.getTabSAI();
        TabSI tabSi = travellingtables.getTabSI();
        TabSPF tabspf_1 = travellingtables.getFirstTabSpf();
        TabSPF tabspf_2 = travellingtables.getSecondTabSpf();
        TabSM tabsm_1 = travellingtables.getFirstTabSm();
        TabSM tabsm_2 = travellingtables.getSecondTabSm();

        a_gra = tabLessario.getA_gra();
        SAI_cod = tabSai.getSAI_cod();

        /* SAIset is 0 or 1 record
         for (Iterator<TabSAI> TabSAIit = tabsSai.iterator(); TabSAIit.hasNext();) {
         TabSAI tabsai = TabSAIit.next();
         SAI_cod = tabsai.getSAI_cod();
         }
         */
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING sil.ind_alt -%s- in %s", sil.getInd_alt(), routine);
            log.debug(logmess);
        }
        //if (!sil.getInd_alt().equals("")) {
        //if (sil.getInd_alt().equals(EOS) || sil.getInd_alt().length()>=0) { /*ind_alt !='\0' check initialized */ 
        if (sil.getInd_alt() != null) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED sil.ind_alt -%s- in %s: WAS NOT NULL", sil.getInd_alt(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compai with parameters a_gra: -%s- and SAI_cod -%s- CALLER %s ", a_gra, rad_sf, routine);
                log.debug(logmess);
            }

            if (!comparator.compai(travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compai in routine %s in with parameters a_gra: -%s- and SAI_cod -%s- EXIT FALSE ", routine, a_gra, SAI_cod);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compai in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setExitInCompai(true);
                response.setCompai(false);
                return response;
            } else { //else compai
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compai in routine %s in with parameters a_gra: -%s- and SAI_cod -%s- EXIT TRUE -CONTINUE-", routine, a_gra, SAI_cod);
                    log.debug(logmess);
                }
                response.setCompai(true);
                response.setExitInCompai(false);
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING  travellingtables after GETTING travellingtables from comparator in compai in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compai in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            //tabLessario = travellingtables.getTabLessario();

        } else {// else sil.ind_alt
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED sil.ind_alt -%s- in %s: WAS NULL", sil.getInd_alt(), routine);
                log.debug(logmess);
            }

        } // end /*ind_alt !='\0'*/
        // getSI
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING getSI -%s- in %s", tabSi.getSI(), routine);
            log.debug(logmess);
        }

        //System.err.println("SPF: "+tabspf_2.getSPF());
        if (travellingtables.isIsanySI() && !tabSi.getSI().equals("")) {// getSI
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabSi.getSI() -%s- in %s: WAS NOT ''", tabSi.getSI(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compsi with parameters getSI: -%s-  CALLER %s ", tabSi.getSI(), routine);
                log.debug(logmess);
            }
            if (!comparator.compsi(travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compsi in routine %s in with parameters getSI: -%s-  EXIT FALSE", tabSi.getSI(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compsi in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compsi in -%s-", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setCompsi(false);
                response.setExitInCompsi(true);
                return response;
            } else { //else compsi
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compsi in routine %s in with parameters getSI: -%s-  EXIT TRUE -CONTINUE-", routine, tabSi.getSI());
                    log.debug(logmess);
                }
                response.setCompsi(true);
                response.setExitInCompsi(false);
            }

            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compsi in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG GETTING tabLessario getTabLessario after compsi in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            //tabLessario = travellingtables.getTabLessario();
        } else { // else  getSI
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabSi.getSI() -%s- in %s: WAS ''", tabSi.getSI(), routine);
                log.debug(logmess);
            }
        } // end getSI

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING getSPF_1 -%s- in %s", tabspf_1.getSPF(), routine);
            log.debug(logmess);
        }
        if (travellingtables.isIsanySPF1() && !tabspf_1.getSPF().equals("")) { // getSPF_1
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabspf_1.getSPF() -%s- in %s: WAS NOT ''", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compspfe with parameters getSPFE: -%s-  CALLER %s ", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            }
            if (!comparator.compspfe(sil, travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspfe in routine %s in with parameters getSI: -%s-  EXIT FALSE", tabspf_1.getSPF(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspfe in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);

                    logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspfe in -%s- BRANCH FALSE", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                response.setCompspfe(false);
                response.setExitInCompspfe(true);
                sil = comparator.getSil();
                response.setSil(sil);

                return response;
            } else { //else compspfe
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspfe in routine %s in with parameters getSPF1: -%s-  EXIT TRUE -CONTINUE-", routine, tabspf_1.getSPF());
                    log.debug(logmess);
                }
                sil = comparator.getSil();
                response.setSil(sil);

                response.setCompspfe(true);
                response.setExitInCompspfe(false);
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspfe in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspfe in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            sil = comparator.getSil();
            response.setSil(sil);
        } else { // else  getSPF_1
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED tabspf_1.getSPF() -%s- in %s: WAS ''", tabspf_1.getSPF(), routine);
                log.debug(logmess);
            }
        } // end getSPF_1

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKING isanyspf2 -%s- in %s", travellingtables.isIsanySPF2(), routine);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySPF2()) { // getSPF_2
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanyspf2 -%s- in %s: WAS TRUE", travellingtables.isIsanySPF2(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compspf with parameters getSPF: -%s-  CALLER %s ", tabspf_2.getSPF(), routine);
                log.debug(logmess);
            }
            if (!comparator.compspf(sil, travellingtables)) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspf in routine %s in with parameters getSPF2: -%s-  EXIT FALSE", tabspf_2.getSPF(), routine);
                    log.debug(logmess);
                }
                // RETURN 0 FALSE
                if (operationDebug) {
                    logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -%s-", routine);
                    log.debug(logmess);
                    logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -%s-", routine);
                    log.debug(logmess);
                }
                travellingtables = comparator.getTravellingtables();
                setTravellingtables(travellingtables);
                sil = comparator.getSil();
                response.setSil(sil);
                response.setCompspf(false);
                response.setExitInCompspf(true);
                return response;
            } else { //else compspf
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED compspf in routine %s in with parameters getSPF2: -%s-  EXIT TRUE -CONTINUE-", routine, tabspf_2.getSPF());
                    log.debug(logmess);
                }
                sil = comparator.getSil();
                response.setSil(sil);
                response.setCompspf(true);
                response.setExitInCompspf(false);
            }
            if (operationDebug) {
                logmess = String.format("OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -%s-", routine);
                log.debug(logmess);
                logmess = String.format("OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -%s-", routine);
                log.debug(logmess);
            }
            travellingtables = comparator.getTravellingtables();
            setTravellingtables(travellingtables);
            sil = comparator.getSil();
            response.setSil(sil);
        } else { // else  getSPF_2
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanyspf2 -%s- in %s: WAS FALSE", travellingtables.isIsanySPF2(), routine);
                log.debug(logmess);
            }
        } // end getSPF_2

        /*Segmenti Medi */
        if (travellingtables.isIsanySM2()) { // getSM_2
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanysm2 -%s- in %s: WAS TRUE", travellingtables.isIsanySM2(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compsm2 with parameters getSPF: -%s-  CALLER %s ", tabspf_2.getSPF(), routine);
                log.debug(logmess);
            }
            response = comparator.compsm2(response, travellingtables, travellingqueries);
            travellingtables = comparator.getTravellingtables();
            //comparator.compsm2(tabLe, tabLessario, tabSf, tabSm_1, tabSm_2, isanysm1, isanysm2);

            // RETURN 0 TRUE
            response.setExitInComp(true);
            response.setCompsm2(true);
            return response;
        } else { //else compspfe
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanysm2 -%s- in %s: WAS FALSE", travellingtables.isIsanySM2(), routine);
                log.debug(logmess);
            }
        }
        //if (true){ 
        if (travellingtables.isIsanySM1()) { // getSM_1
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanysm1 -%s- in %s: WAS TRUE", travellingtables.isIsanySM1(), routine);
                log.debug(logmess);
            }
            if (callerDebug) {
                logmess = String.format("CALLING compsm1 with parameters getSPF: -%s-  CALLER %s ", tabspf_2.getSPF(), routine);
                log.debug(logmess);
            }
            response = comparator.compsm1(response, travellingtables, travellingqueries);
            travellingtables = comparator.getTravellingtables();
            // RETURN 0 TRUE
            response.setExitInComp(true);
            response.setCompsm1(true);
            return response;
        } else { //else getSM_2
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED isanysm2 -%s- in %s: WAS FALSE", travellingtables.isIsanySM1(), routine);
                log.debug(logmess);
            }
        }
        if (callerDebug) {
            logmess = String.format("CALLING compsf with parameters a_gra: -%s-  CALLER %s ", a_gra, routine);
            log.debug(logmess);
        }
        response = comparator.compsf(response, travellingtables, travellingqueries);
        if (callerDebug) {
            logmess = String.format("CALLING compsf with parameters getSPF: -%s-  CALLER %s ", tabspf_2.getSPF(), routine);
            log.debug(logmess);
        }
        //comparator.compsf();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comp.java", routine);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);
        response.setExitInComp(true);

        return response;
    } // end comp
}
