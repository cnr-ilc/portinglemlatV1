/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.api;

import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import utils.OutFormat;
import static utils.OutFormat.COMPLETE;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class PrintAnalyses {

    AucepsResponse response;

    public PrintAnalyses(AucepsResponse response) {
        this.response = response;
    }

    public void printAnalyses(OutFormat f, PrintStream po, PrintStream pu) {
        switch (f) {
            case COMPLETE:
                printComplete(response, po);
                break;
            case OLD_LL:
                conOutLemmas(response, po, pu);
        }
    }

    private void printComplete(AucepsResponse response, PrintStream ps) {
        Analyses analyses = response.getAnalyses();
        List<Analysis> lofanalyses = analyses.getListOfAnalysis();
        int numL = 0;
        int numanalysis = 0;
        String statStr = "";
        numanalysis = analyses.getListOfAnalysis().size();
        for (Analysis analysis : lofanalyses) {
            numL = numL + analysis.getLemmas().getLemmas().size();
        }
        statStr = String.format("# of Analysis for word -%s- -%d- and # lemmas -%d-", response.getAnalyses().getIn_form(), numanalysis, numL);

        // print stats #analysis and # lemmas 
        ps.println("AAAAAAAAAAAAAAAAAAAAA " + statStr);

    }

    /**
     * This function prints the output in the format
     *
     * @param response
     * @param po
     * @param pu
     */
    private void conOutLemmas(AucepsResponse response, PrintStream po, PrintStream pu) {
        Analyses analyses = response.getAnalyses();
        Analysis curAnalysis;
        String header = "";
        String anaHeader = "", codmorfHeader = "";
        String footer = "";
        String segStr = "SEGMENTS:\t %s";
        String outSegStr = "";
        String in_form, alt_form;
        int numAnalyses = 0;
        String[] segments = new String[7];
        in_form = analyses.getIn_form();
        alt_form = analyses.getAlt_in_form();
        String enc = "", part = "";
        int hasPart = 0;
        String[] codmofs = new String[20];
        numAnalyses = (int) analyses.getNumAnalysis();

        header = String.format("Input wordform : -%s-\nAnalyzed wordform : -%s-\nNumber of Analyses : -%d-", in_form, alt_form, numAnalyses);
        po.println(header);
        for (int a = 0; a < numAnalyses; a++) {
            curAnalysis = analyses.getListOfAnalysis().get(a);
            segments = curAnalysis.getSegments();
            enc = segments[6];
            part = segments[5];
            hasPart = curAnalysis.getPart();
            if (a == 1) {
                anaHeader = String.format("\n============================RESULTS OF ANALYSIS %d==============================\n", a + 1);
            } else {
                anaHeader = String.format("\n============================RESULT OF ANALYSIS %d==============================\n", a + 1);
            }
            if (!"".equals(enc)) {
                String encStr = String.format("enclitica : -%s-\n", enc);
                po.println(encStr);

            }

            if (hasPart == 1) {
                String partStr = String.format("particella : -%s-\n", part);
                po.println(partStr);

            }
            // SEGMENTS

            if (!"".equals(segments[0])) {
                outSegStr = segments[0] + "*";
            }
            outSegStr = outSegStr + segments[1];

            for (int s = 2; s < 5; s++) {
                if (!"".equals(segments[s])) {
                    outSegStr = outSegStr + " -" + segments[s];
                }
            }
            if (hasPart == 0 && !"".equals(part)) {
                outSegStr = outSegStr + " -" + part;
            }
            segStr = String.format(segStr, outSegStr);
            po.println(anaHeader);
            po.println(segStr);
            

            //"------------------------codici morf. %u-------------------\n"
            for (short i = 0; i < curAnalysis.getN_cod_morf(); i++) {
                codmorfHeader = String.format("------------------------codici morf. %d-------------------", i + 1);
                String temp=curAnalysis.getCod_morf_4_10()[i];
                po.println(codmorfHeader);
                po.println(temp);
            }
            
            // lemmasur
            String temp=curAnalysis.getLemmas().getLemmas().toString();
            String lems=String.format("lemmas -%s- ",temp);
            
            po.println(lems);

        }
        footer = String.format("\n%s\n", "This is the end my friend");

        po.println(footer);
        po.flush();

        /*
        
        if (analyses.numAnalysis > 1)
            fprintf(po, "\n============================RESULTS OF ANALYSIS %u==============================\n", a + 1);
        else
            fprintf(po, "\n============================RESULT OF ANALYSIS ================================\n");
        //segmentazione
        if (*(curAnalysis->segments[6])) {
            fprintf(po, "enclitica : %s\n", curAnalysis->segments[6]);
            fprintf(po, "----------------------------------------------------------\n");
        }
         */
    }

}
