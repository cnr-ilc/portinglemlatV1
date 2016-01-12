/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.api;

import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodMorfDescr;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabCodMorfQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.Lemma;
import it.cnr.ilc.jauceps.lib.structs.Lemmas;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPERLEMMA_INT;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.IPOLEMMA;
import static it.cnr.ilc.latmorphlib.structs.LEM_TYPE.LEMMA_AGG;
import java.io.PrintStream;
import java.util.List;
import org.apache.log4j.Logger;
import utils.OutFormat;
import static utils.OutFormat.COMPLETE;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class PrintAnalyses {

    AucepsResponse response;
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

    static final String CLASS_NAME = PrintAnalyses.class.getName();
    static Logger log = Logger.getLogger(CLASS_NAME);

    TravellingQueries travellingqueries;
    TravellingTables travellingtables;

    public PrintAnalyses(AucepsResponse response, TravellingQueries travellingqueries, TravellingTables travellingtables) {
        this.response = response;
        this.travellingtables = travellingtables;
        this.travellingqueries = travellingqueries;
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
        String routine = CLASS_NAME + "/conOutLemmas";
        String logmess = "";
        Analyses analyses = response.getAnalyses();
        Analysis curAnalysis;
        Lemmas lemmas;
        Lemma lemma;
        String header = "";
        String anaHeader = "", codmorfHeader = "";
        String footer = "";
        String segStr = "SEGMENTS:\t %s";
        String outSegStr = "";
        String in_form, alt_form;
        int numAnalyses = 0;
        String[] segments;// = new String[7];

        in_form = analyses.getIn_form();
        alt_form = analyses.getAlt_in_form();
        String enc = "", part = "";
        int hasPart = 0;
        int numeroLemmi = 0, numeroLemmi_agg = 0;
        String[] codmofs = new String[20];
        numAnalyses = (int) analyses.getListOfAnalysis().size();
        String eagles = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }

        header = String.format("\nInput wordform : -%s-\nAnalyzed wordform : -%s-\nNumber of Analyses : -%d-", in_form, alt_form, numAnalyses);
        po.println(header);
        if (numAnalyses == 0) {
            pu.println(header);
            pu.flush();
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW STOP NOT-FOUND Executing %s in %s ", routine, CLASS_NAME);
                log.debug(logmess);
            }

        }
        TabCodMorfQuery tabcodmordescq = travellingqueries.getTabcodmorfq();
        tabcodmordescq.setConn(travellingqueries.getConn());
        for (int a = 0; a < numAnalyses; a++) {
            segments = null;
            curAnalysis = analyses.getListOfAnalysis().get(a);
            segments = curAnalysis.getSegments();
            //System.err.println("SEGS " + Arrays.toString(segments) + " " + a);
            enc = segments[6];
            part = segments[5];
            hasPart = curAnalysis.getPart();
            outSegStr = "";
            segStr = "SEGMENTS:\t %s";

            if (numAnalyses > 1) {
                anaHeader = String.format("\n============================RESULTS OF ANALYSIS %d==============================", a + 1);
            } else {
                anaHeader = String.format("\n============================RESULT  OF ANALYSIS   ==============================", a + 1);
            }
            if (!"".equals(enc)) {
                String encStr = String.format("\nenclitica : -%s-", enc);
                po.println(encStr);

            }

            if (hasPart == 1) {
                String partStr = String.format("particella : -%s-", part);
                po.println(partStr);

            }
            // SEGMENTS

            if (!"".equals(segments[0])) {
                outSegStr = segments[0] + "*";
            }
            outSegStr = outSegStr + segments[1];
            //po.println("SEGS " + Arrays.toString(segments) + " " + outSegStr);

            for (int s = 2; s < 5; s++) {
                if (!"".equals(segments[s])) {
                    //System.err.println("SEGS " + Arrays.toString(segments) + " " + segments[s] + " " + outSegStr + " " + a);
                    outSegStr = outSegStr + " -" + curAnalysis.getSegments()[s];
                }
            }
            //po.println(outSegStr);
            if (hasPart == 1 && !"".equals(part)) {
                outSegStr = outSegStr + " -" + part;
            }
            segStr = String.format(segStr, outSegStr);
            po.println(anaHeader);
            po.println(segStr);

            //"------------------------codici morf. %u-------------------\n"
            for (short i = 0; i < curAnalysis.getN_cod_morf(); i++) {
                codmorfHeader = String.format("------------------------codici morf. %d-------------------", i + 1);
                String temp = curAnalysis.getCod_morf_4_10()[i];
                po.println(codmorfHeader);
                po.println(temp + "\n");
                String[] codes;// = new String[7];
                codes = curAnalysis.getCod_morf_4_10()[i].split("");
                for (int k = 0; k < 7; k++) {
                    if (!"-".equals(codes[k])) {
                        List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(k + 4, codes[k]);
                        for (TabCodMorfDescr tab : tabs) {
                            po.println(String.format("%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                        }
                    }
                }
            }

            // lemmasur
            for (int l = 0; l < curAnalysis.getLemmas().getNumL(); l++) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                switch (lemma.getType()) {
                    case IPERLEMMA:
                    case IPOLEMMA:
                    case IPERLEMMA_INT:
                        numeroLemmi++;
                        break;
                    case LEMMA_AGG:
                        numeroLemmi_agg++;
                }
            }

            if (curAnalysis.getLemmas().getNumL() > 1) {
                po.println("\nLEMMI:");
            }
            int l = 0;
            for (l = 0; l < curAnalysis.getLemmas().getNumL(); l++) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                eagles = "";

                if ((lemma.getType() == IPERLEMMA) || (lemma.getType() == IPOLEMMA)
                        || (lemma.getType() == IPERLEMMA_INT)) {
                    if (curAnalysis.getLemmas().getNumL() > 1) {
                        if (lemma.getType() == IPERLEMMA) {
                            po.println(String.format("\t============================LEMMA %d: IPER=========================", l + 1));
                        } else {
                            po.println(String.format("\t============================LEMMA %d: IPO =========================", l + 1));
                        }
                    } else {
                        po.println("\t============================LEMMA ================================");
                    }

                    po.println(String.format("\t%-30s%-5s%-6s%s\n",
                            lemma.getOut_lemma(),
                            lemma.getCod_lemma(),
                            lemma.getN_id(),
                            lemma.getGen()));

                    //codici morfologici
                    if ((lemma.getType() == IPERLEMMA) || (curAnalysis.getLemmas().getNumL() == 1)) {
                        po.println("\t------------------------codici morfologici---------------------\n\t");
                        for (int j = 0; j < 3; j++) {
                            eagles = eagles + lemma.getCod_morf_1_3()[j];
                        }
                        po.print(String.format("\t%-30s", eagles));
                        po.println("\n");

                        for (int j = 0; j < 3; j++) {
                            String code = lemma.getCod_morf_1_3()[j];

                            //System.err.println("ASAAA " + j + " " + code);//+ " "+codes[w]);
                            if (!"-".equals(code)) {
                                List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(j + 1, code);
                                for (TabCodMorfDescr tab : tabs) {
                                    po.println(String.format("\t%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                                }
                            }

                        }

                    }

                }
            } // rof numlems

            if (numeroLemmi_agg > 1) {
                lemmas = curAnalysis.getLemmas();
                lemma = lemmas.getLemmas().get(l);
                eagles = "";

                if (lemma.getType() == LEMMA_AGG) {
                    po.println("\t============================LEMMA================================");
                    po.println(String.format("\t%-30s%-5s%-6s%s\n",
                            lemma.getOut_lemma(),
                            lemma.getCod_lemma(),
                            lemma.getN_id(),
                            lemma.getGen()));
                    po.println("\t------------------------codici morfologici---------------------\n\t");
                    for (int j = 0; j < 3; j++) {
                        eagles = eagles + lemma.getCod_morf_1_3()[j];
                    }
                    po.print(String.format("\t%-30s", eagles));
                    po.println("\n");
                    for (int j = 0; j < 3; j++) {
                        String code = lemma.getCod_morf_1_3()[j];

                        //System.err.println("ASAAA " + j + " " + code);//+ " "+codes[w]);
                        if (!"-".equals(code)) {
                            List<TabCodMorfDescr> tabs = tabcodmordescq.getCodMorfDescrSet(j + 1, code);
                            for (TabCodMorfDescr tab : tabs) {
                                po.println(String.format("\t%s:\t%s", tab.getField_descr(), tab.getValue_descr()));
                            }
                        }

                    }

                }
            }
//            String temp = curAnalysis.getLemmas().getLemmas().toString();
//            String lems = String.format("lemmas -%s- ", temp);
//
//            po.println(lems);

        } //rof analyses
        footer = String.format("\n%s\n", "This is the end my friend");

        //po.println(footer);

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
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in %s ", routine, CLASS_NAME);
            log.debug(logmess);
        }
    }
}
