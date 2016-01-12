/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app;

import it.cnr.ilc.jauceps.app.api.PrintAnalyses;
import it.cnr.ilc.jauceps.lib.impl.InputFunctions;
import it.cnr.ilc.jauceps.lib.impl.Interact;
import it.cnr.ilc.jauceps.lib.impl.Lib;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

import java.io.PrintStream;
import java.sql.Connection;
import org.apache.log4j.*;
import utils.OutFormat;

/**
 *
 * @author riccardo
 */
public class JAucepsApp {

    /**
     * printFormatted assumes 3 different values: c for compact; p for plain; j
     * for json
     */
    static String printFormatted = "p";

    /**
     * input filename
     */
    static String filename = "";

    int loglevel = 0;
    /* only info */

    static final String CLASS_NAME = JAucepsApp.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String routine = JAucepsApp.class.getName() + "/main";

        Vars vars = new Vars();
        SilType sil;
        Lib lib;
        Connection conn;
        TravellingTables travellingtables;
        TravellingQueries travellingqueries;
        InputFunctions inputfunctions;
        AucepsResponse response = null;

        //fields
        PrintStream po = null;
        PrintStream pu = null;
        String wordform = "";
        String logmess = "";

        boolean retIniVal = false;
        int retval = 0;

        // vars
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
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START -%s-", routine);
            log.debug(logmess);

        }

        if (operationDebug) {
            logmess = String.format("OPERATION Instantiating Interact. CALLER: %s", routine);
            log.debug(logmess);
        }
        Interact interact = new Interact();
        if (callerDebug) {
            logmess = String.format("CALLING -startroutine- in Interact.java. CALLER: %s", routine);
            log.debug(logmess);
        }

        interact.startroutine(args);

        if (po == null || pu == null) {
            po = interact.getPo();
            pu = interact.getPu();
        }

//        po.println((interact.getPrintFormatted()) + " " + interact.getSw_file());
//        po.flush();
        if (operationDebug) {
            logmess = String.format("OPERATION Instantiating sil. CALLER: %s", routine);
            log.debug(logmess);
        }

        sil = new SilType();

        if (operationDebug) {
            logmess = String.format("OPERATION Instantiating lib with silId -%s- CALLER: %s", sil.getSilId(), routine);
            log.debug(logmess);
        }
        lib = new Lib(sil);
        if (callerDebug) {
            logmess = String.format("CALLING -initialize- in Lib.java. CALLER: %s", routine);
            //log.debug(logmess);
            log.debug(logmess);
        }
        retIniVal = lib.initialize(lib.APP_DEFAULT_NAME, null, System.out);
        if (retIniVal) {
            conn = lib.getConn();
            sil = lib.getSil();
        } else {
            logmess = String.format("DEEPFLOW EXIT -%s- with init value -%s-", routine, retIniVal);
            log.debug(logmess);
            return;
        }
        // main code //
        if (valueDebug) {
            logmess = String.format("VALUES SilId: -%s- in -%s-", sil.getSilId(), routine);
            log.debug(logmess);
            logmess = String.format("VALUES connection: -%s- in -%s-", conn.toString(), routine);
            log.debug(logmess);
        }

        if (retIniVal) {
            if (operationDebug) {
                logmess = String.format("OPERATION Instantiating TravellingQueries with conn -%s- and id -%s-", conn.toString(), sil.getSilId());
                log.debug(logmess);
                logmess = String.format("OPERATION Instantiating TravellingTables with conn -%s- and id -%s-", conn.toString(), sil.getSilId());
                log.debug(logmess);
            }
            travellingtables = new TravellingTables(conn);
            travellingtables.setTtId(sil.getSilId());
            travellingqueries = new TravellingQueries(conn);
            travellingqueries.setTqId(sil.getSilId());

            if (callerDebug) {
                logmess = String.format("CALLING -prompt- in Interact.java. CALLER: %s", routine);
                log.debug(logmess);
            }

            do {
                if (interact.getSw_file() == 0) {
                    sil=lib.resetSil(sil);
                    wordform = interact.prompt("type the WORD-FORM you wish to analyze. end to exit");
                    if (wordform != null) {

                        if (operationDebug) {
                            logmess = String.format("DEEPFLOW Instantiating AucepsResponse with silId -%s-", sil.getSilId());
                            log.debug(logmess);
                        }
                        
                        response = new AucepsResponse(sil);
                        response.setResId(sil.getSilId());
                        if (operationDebug) {
                            logmess = String.format("DEEPFLOW Instantiating InputFunctions with travellingtables and travellingqueries status -%s- and id -%s-", travellingtables.getStatus(), response.getResId());
                            log.debug(logmess);
                        }
                        if (analysisDebug) {
                            logmess = String.format("ANALYSES DEBUG in -%s- AucepsResponse -%s-", routine, response.toString());
                            log.debug(logmess);

                        }
                        inputfunctions = new InputFunctions(response, travellingtables, travellingqueries);
                        response = inputfunctions.silcall(conn, sil, wordform);

                        try {
                            PrintAnalyses printanalyses = new PrintAnalyses(response,travellingqueries, travellingtables);
                            printanalyses.printAnalyses(OutFormat.OLD_LL, System.out, System.out);
                            sil=new SilType();
                        
                        } catch (Exception e) {
                            e.printStackTrace();

                            System.err.println("EXIT WITH RESPONSE " + e.getMessage());
                        }
                    }

                }
                if (interact.getSw_file() == 1) {
                    System.err.println("LEGGOFILE");
                    wordform = null;
                }

            } while (wordform != null);

            try {
                //System.out.println("XXXX " + response.toString());
                if (callerDebug) {
                    logmess = String.format("CALLING -printAnalyses- in PrintAnalyses.java. CALLER: %s", routine);
                    log.debug(logmess);
                }
                PrintAnalyses printanalyses = new PrintAnalyses(response,travellingqueries, travellingtables);
                printanalyses.printAnalyses(OutFormat.OLD_LL, System.out, System.out);
            } catch (Exception e) {
                System.err.println("EXIT WITH RESPONSE " + e.getMessage());
            }
        }

        // print the results//
        //end//
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW END -%s-", routine);
            log.debug(logmess);

        }
    }

}
