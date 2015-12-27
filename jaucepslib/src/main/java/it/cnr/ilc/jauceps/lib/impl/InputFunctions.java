/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.sql.Connection;
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
    SilType sil;
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

        response = runanalyses.initAnalyses(response,origWf, wordform);
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

        //siln(conn, sil);
        response.setSil(sil);
        setResponse(response);

        return 0;

    }

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
