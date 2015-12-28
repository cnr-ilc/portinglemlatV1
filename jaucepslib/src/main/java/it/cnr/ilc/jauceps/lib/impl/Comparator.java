/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class Comparator {

    private TravellingTables travellingtables;
    private SilType sil;
    static final String CLASS_NAME = Comparator.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

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
    String EOS = vars.getEOS();

    public boolean compai(TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compai";
        String logmess = "";
        String buffer = "";
        String SAI_cod = travellingtables.getTabSAI().getSAI_cod();

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSI tabSi = travellingtables.getTabSI();

        String a_gra = tabLes.getA_gra();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s-", routine, a_gra, SAI_cod);
            log.debug(logmess);
        }

        /*
         if (!strcmp(areavs.a_gra, getSAI_cod())) {
         */
        if (SAI_cod != null && a_gra.compareTo(SAI_cod) == 0) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDING in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPYING in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            //buffer=new StringBuilder(tabSi.getSIcod()).toString();
            /* add the les of lessario to the initial segment and then set the les to
             this new value
             */
            buffer = tabSi.getSI();
            buffer = buffer + tabLes.getLes();
            tabLes.setLes(buffer);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDED in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPIED in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            travellingtables.setTabLessario(tabLes);
            setTravellingtables(travellingtables);

            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s- EXIT 1", routine, a_gra, SAI_cod);
                log.debug(logmess);
            }

            return true;

        }

        travellingtables.setTabLessario(tabLes);
        setTravellingtables(travellingtables);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters a_gra -%s- and cod -%s- EXIT 0", routine, a_gra, SAI_cod);
            log.debug(logmess);
        }

        return false;

    }

    public boolean compsi(TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compsi";
        String logmess = "";
        String buffer = "";

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSI tabSi = travellingtables.getTabSI();

        String lesSi = tabLes.getSi();
        String getSIcod = tabSi.getSI_cod();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSI -%s-", routine, lesSi);
            log.debug(logmess);
        }


        /*
         if (!strcmp(areavs.a_gra, getSAI_cod())) {
         */
        if (lesSi.compareTo(getSIcod) == 0) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDING in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPYING in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }

            //buffer=new StringBuilder(tabSi.getSIcod()).toString();
            /* add the les of lessario to the initial segment and then set the les to
             this new value
             */
            buffer = tabSi.getSI();
            buffer = buffer + tabLes.getLes();
            tabLes.setLes(buffer);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED in function %s. From getSI -%s- to buffer-%s-", routine, tabSi.getSI(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****APPENDED in function %s. From areavs.les -%s-  to buffer -%s-", routine, tabLes.getLes(), buffer);
                log.debug(logmess);
                logmess = String.format("DEEPFLOW ****COPIED in function %s.From buffer -%s- to areavs.les -%s-", routine, buffer, tabLes.getLes());
                log.debug(logmess);
            }
            travellingtables.setTabLessario(tabLes);
            //setLessario(tabLes);
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters lesSi -%s-  EXIT 1", routine, lesSi);
                log.debug(logmess);
            }
            setTravellingtables(travellingtables);
            return true;

        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters lesSi -%s-  EXIT 0", routine, lesSi);
            log.debug(logmess);
        }

        travellingtables.setTabLessario(tabLes);
        setTravellingtables(travellingtables);
        return false;

    } // end compsi

    public boolean compspfe(SilType sil, TravellingTables travellingtables) {
        String routine = Comparator.class
                .getName() + "/compspfe";
        String logmess = "";
        String[] segments = new String[7];

        // get the last updated tables
        TabLessario tabLes = travellingtables.getTabLessario();
        TabSPF tabspf_1 = travellingtables.getFirstTabSpf();
        //tabSi = travellingtables.getTabSI();

        String spf1 = tabspf_1.getSPF();
        String areavs_spf_0 = tabLes.getSpf();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf1);
            log.debug(logmess);
        }

        if ((spf1.compareTo("que") == 0) && (areavs_spf_0.compareTo("3") == 0)) {

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF1) -%s- = 'que' and areavs.spf[0] -%s- == '3' (RETURNING TO CALLER) OK", routine, spf1, areavs_spf_0);
                log.debug(logmess);
            }
            setTravellingtables(travellingtables);
            setSil(sil);
            return false;

        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s getSPF(SPF1) -%s- to sil.segment[6]", routine, spf1);
            log.debug(logmess);
        }
        segments = sil.getSegment();
        segments[6] = spf1;

        sil.setSegment(segments);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s getSPF(SPF1) -%s- to sil.segment[6]", routine, spf1);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf1);
            log.debug(logmess);
        }
        setTravellingtables(travellingtables);
        setSil(sil);

        return true;
    }// end compspfe

    public boolean compspf(SilType sil, TravellingTables travellingtables) {
        String routine = CLASS_NAME + "/compspf";
        String logmess = "";
        String[] segments = new String[7];
        // get the last updated tables

        TabLessario tabLes = travellingtables.getTabLessario();
        TabSPF tabspf_2 = travellingtables.getSecondTabSpf();

        String spf2 = tabspf_2.getSPF();
        String areavs_spf_0 = tabLes.getSpf();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf2);
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING in %s 0 to sil.part -%d-", routine, sil.getPart());
            log.debug(logmess);
        }

        sil.setPart(0);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED in %s 0  to sil.part -%d-", routine, sil.getPart());
            log.debug(logmess);
        }

        if (spf2.equals("")) {// if getSPF(SPF2)==""
            //if (!( * getSPF(SPF2))) { 
            //if (!(getSPF(SPF2)))
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2) -%s- (RETURNING TO CALLER) WAS '' (OK) ", routine, spf2);
                log.debug(logmess);
            }
            if (areavs_spf_0.compareTo("p") == 0) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] == 'p' returning OK", routine);
                    log.debug(logmess);
                }
                setTravellingtables(travellingtables);
                setSil(sil);
                return false;
            } else {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] == 'p' returning KO", routine);
                    log.debug(logmess);
                }
                setTravellingtables(travellingtables);
                setSil(sil);
                return true;
            }
        } else {// else getSPF(SPF2)
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2) -%s- (RETURNING TO CALLER) WAS NOT '' (KO) ", routine, spf2);
                log.debug(logmess);
            }// end else getSPF(SPF2)        // second block
        }
        if (areavs_spf_0.compareTo(tabspf_2.getSPF_cod()) == 0) {
            //if (!strcmp(areavs.spf, getSPF_cod(SPF2))) { // if areavs.spf, getSPF_cod(SPF2
            if (deepFlowDebug) {

                logmess = String.format("DEEPFLOW ****CHECKED in %s getSPF(SPF2)_cod -%s- and area_spf OK", routine, tabspf_2.getSPF_cod(), areavs_spf_0);
                log.debug(logmess);

            }
            if (areavs_spf_0.compareTo("p") != 0) {
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s areavs.spf[0] != 'p' returning OK", routine);
                    log.debug(logmess);
                }
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNING in %s 1  to sil.part -%d-", routine, sil.getPart());
                    log.debug(logmess);
                }
                sil.setPart(1);
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****ASSIGNED in %s 1  to sil.part -%d-", routine, sil.getPart());
                    log.debug(logmess);
                }
            }
            setTravellingtables(travellingtables);
            return true;
        } else {// else areavs.spf, getSPF_cod(SPF2

            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with parameters getSPF(SPF1) -%s-  EXIT 0", routine, spf2);
                log.debug(logmess);
            }
        }
        setTravellingtables(travellingtables);
        setSil(sil);
        return false;
    } // compspf
    
    public TabLessario areacp(TabLessario s) {
        String routine = CLASS_NAME + "/areacp";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Comparator.java with s.pr_key -%s-", routine, s.getPr_key());
            log.debug(logmess);
        }
        TabLessario t;
        String n_id = s.getN_id();
        String gen = s.getGen();
        String clem = s.getClem();
        String si = s.getSi();
        String smv = s.getSmv();
        String spf = s.getSpf();
        String les = s.getLes();
        String codles = s.getCodles();
        String lem = s.getLem();
        String s_omo = s.getS_omo();
        String piu = s.getPiu();
        String type = s.getType();
        String codLE = s.getCodLE();
        /*codLe*/

        String pt = s.getPt();
        String a_gra = s.getA_gra();
        String gra_u = s.getGra_u();
        String pr_key = s.getPr_key();
        /*pr_key*/

        t = new TabLessario(n_id, gen, clem, si, smv,
                spf, les, codles, lem, s_omo, piu,
                codles, type, codLE, pt, a_gra, gra_u,
                pr_key);

        

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Comparator.java with s.pr_key -%s-", routine, s.getPr_key());
            log.debug(logmess);
        }
        
        return t;
    }

    /**
     * @return the travellingtables
     */
    public TravellingTables getTravellingtables() {
        return travellingtables;
    }

    /**
     * @param travellingtables the travellingtables to set
     */
    public void setTravellingtables(TravellingTables travellingtables) {
        this.travellingtables = travellingtables;
    }

    /**
     * @return the sil
     */
    public SilType getSil() {
        return sil;
    }

    /**
     * @param sil the sil to set
     */
    public void setSil(SilType sil) {
        this.sil = sil;
    }

}
