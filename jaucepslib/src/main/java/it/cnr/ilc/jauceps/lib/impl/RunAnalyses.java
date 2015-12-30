/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_LES;
import it.cnr.ilc.jauceps.lib.structs.Lemmas;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class RunAnalyses {

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

    int loglevel = 0; /* only info */

    static final String CLASS_NAME = RunAnalyses.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    public AucepsResponse initAnalyses(AucepsResponse response, String forma_orig, String forma_alt) {

        String routine = RunAnalyses.class.getName() + "/initAnalyses";
        String logmess = "";
        Analyses init_analyses = new Analyses();

        Analysis cur_analysis = new Analysis();
        //SilType sil = response.getSil();

        // init analyses
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in RunAnalyses.java with parameters: wordforf -%s- alternative form -%s- nun of analysis %d", routine, forma_orig, forma_alt, init_analyses.getNumAnalysis());
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING forma_orig -%s- to analyses.in_form -%s-", forma_orig, init_analyses.getIn_form());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPYING forma_alt -%s- to analyses.alt_form -%s-", forma_orig, init_analyses.getAlt_in_form());
            log.debug(logmess);
        }
        init_analyses.setIn_form(forma_orig);
        init_analyses.setAlt_in_form(forma_alt);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED forma_orig -%s- to analyses.in_form -%s-", forma_orig, init_analyses.getIn_form());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****COPIED forma_alt -%s- to analyses.alt_form -%s-", forma_orig, init_analyses.getAlt_in_form());
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING 0 to analyses.numAnalysis %d", init_analyses.getNumAnalysis());
            log.debug(logmess);
        }
        init_analyses.setNumAnalysis((short) 0); /*fisrt analysis*/

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED 0 to analyses.numAnalysis %d", init_analyses.getNumAnalysis());
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in RunAnalyses.java with parameters: wordforf -%s- alternative form -%s- nun of analysis %d", routine, forma_orig, forma_alt, init_analyses.getNumAnalysis());
            log.debug(logmess);
        }

        response.setAnalyses(init_analyses);
        response.setCur_analysis(cur_analysis);

        return response;

    }

    public AucepsResponse newAnalysis(AucepsResponse response) {
        String routine = RunAnalyses.class.getName() + "/newAnalysis";
        String logmess = "";
        Analyses analyses = response.getAnalyses();
        List<Analysis> alreadyanalyzed = analyses.getListOfAnalysis();
        Analysis cur_analysis = response.getCur_analysis();
        SilType sil = response.getSil();

        int numA;
        String[] silSegs = new String[7]; /* segments from sil */

        String[] anaSegs = new String[7]; /* segments from analysis */

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in RunAnalyses.java", routine);
            log.debug(logmess);
        }
        silSegs = sil.getSegment();
        anaSegs = cur_analysis.getSegments();
        /*
         this is used for checking both logs
         we can use curAnalysis.setSegments(sil.getSegment());
         */
        for (int i = 0; i < silSegs.length; i++) { /* seven segments */

            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPYING sil.segment -%s- to curAnalysis.segment -%s- at index -%d-", silSegs[i], anaSegs[i], i);
                log.debug(logmess);
            }
            anaSegs[i] = silSegs[i];
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****COPIED sil.segment -%s- to curAnalysis.segment -%s- at index -%d-", silSegs[i], anaSegs[i], i);
                log.debug(logmess);
            }
        }
        cur_analysis.setSegments(anaSegs);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in RunAnalyses.java", routine);
            log.debug(logmess);
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING sil.part -%d- to curAnalysis.part -%d-", sil.getPart(), cur_analysis.getPart());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf");
            log.debug(logmess);

        }
        cur_analysis.setPart((short) sil.getPart());
        cur_analysis.setN_cod_morf((short) 0);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED sil.part -%d- to curAnalysis.part -%d-", sil.getPart(), cur_analysis.getPart());
            log.debug(logmess);
            logmess = String.format("DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf");
            log.debug(logmess);

        }

        if (analysisDebug) {

            logmess = String.format("ANALYSIS ****CURRENT ANALYSIS SEGMENTS -%s-", cur_analysis.getSegments().toString());
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING initLemmas in  RunAnalyses.java. CALLER %s", routine);
            log.debug(logmess);
        }
        response = initLemmas(response);

        alreadyanalyzed.add(cur_analysis);
        analyses.setListOfAnalysis(alreadyanalyzed);
        response.setAnalyses(analyses);
        response.setCur_analysis(cur_analysis);
        return response;
    }

    public AucepsResponse initLemmas(AucepsResponse response) {
        String routine = RunAnalyses.class.getName() + "/initLemmas";
        String logmess = "";
        Analysis analysis = response.getCur_analysis();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in RunAnalyses.java", routine);
            log.debug(logmess);
        }
        int numL = 0;
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNING 0  to numL");
            log.debug(logmess);
        }
        Lemmas lemmas = analysis.getLemmas();
        lemmas.setNumL(numL);
        analysis.setLemmas(lemmas);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****ASSIGNED 0  to numL -%d-", lemmas.getNumL());
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in RunAnalyses.java", routine);
            log.debug(logmess);
        }
        response.setCur_analysis(analysis);
        return response;

    }

}
