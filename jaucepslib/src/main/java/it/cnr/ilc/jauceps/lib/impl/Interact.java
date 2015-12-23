/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.headers.AInteract;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Interact extends AInteract{
    
    int loglevel = 0; /* only info */
    static final String CLASS_NAME=Interact.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);
    

    private File piFile;
    private File poFile;
    private File puFile;

    private PrintStream po = System.out;
    private PrintStream pu = System.out;

    /* Init the Vars */
    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean valueDebug = vars.isValueDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
    private final boolean printSplash = vars.isPrintSplash();
    private final boolean callerDebug = vars.isCallerDebug();
    private final boolean analysisDebug = vars.isAnalysisDebug();
    private final boolean printStructDebug = vars.isPrintStructDebug();
    private int printFormatted = vars.getPrintFormatted();
    private final boolean debugJson = vars.isDebugJson();
    private final boolean useInPipe = vars.isUseInPipe();

    private String filename = "";
    private int sw_file = 0;
    private String wordform = "";
    
    @Override
    public void startroutine(String[] args) {
        boolean fileFound = false;
        String unk = ".unk";
        String lem = ".lem";
        String routine = Interact.class.getName() + "/startroutine";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }
        int i = 0;
        for (String a : args) {

            switch (a) {
                case "+f":
                    filename = args[i + 1];
                    fileFound = true;
                //break;
                case "+p":
                    printFormatted = 0;
                    break;
                case "+c":
                    printFormatted = 1;
                    break;
                case "+j":
                    printFormatted = 2;
                    break;
                default:
                    printFormatted = 0;

            }
            i++;
        }
        if (fileFound) {
            sw_file = fileExist(filename);
        } else {
            sw_file = 0;
        }

        if (sw_file == 1) {
            // get the file with NO ext
            poFile = new File(fileWithoutExt(filename).concat(lem));
            puFile = new File(fileWithoutExt(filename).concat(unk));
            try {
                po = new PrintStream(poFile);
                pu = new PrintStream(puFile);
            } catch (FileNotFoundException e) {
                if (flowDebug || deepFlowDebug) {
                    logmess = String.format("DEEPFLOW STOP Executing %s in class Interact.java", routine);
                    log.debug(logmess);
                }
                sw_file = 0;
                po = System.out;
                pu = System.out;

            }
        }
        setPrintFormatted(printFormatted);
        setSw_file(sw_file);
        setPo(po);
        setPu(pu);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }

    } // end startroutine

    @Override
    public String prompt(String message) {
        String phrase = "";
        String routine = Interact.class.getName() + "/prompt";
        String logmess="";
        if (flowDebug || deepFlowDebug) {
            logmess=String.format("DEEPFLOW START Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }

        if (useInPipe) {
            message = "";
        } else {
            message = "\n>" + message;
        }
        try {
            System.out.println(message);
            BufferedReader br
                    = new BufferedReader(new InputStreamReader(System.in));

            String input;
            input = br.readLine();
            if (input.equalsIgnoreCase("end")) {
                phrase = null;
            } else {
                phrase = input.toLowerCase().trim();

            }

        } catch (IOException e) {
            if (flowDebug || deepFlowDebug) {
                logmess=String.format("DEEPFLOW SOME  ERRORS ON IO: %s", e.getMessage());
                log.fatal(logmess);
            }
            return null;
        }

        if (flowDebug || deepFlowDebug) {
            
            logmess=String.format("DEEPFLOW STOP Executing %s in class Interact.java. Wordform: %s", routine,phrase);
            log.debug(logmess);
        }
        return phrase;

    } // end prompt

    /**
     * @param filename
     * @return
     */
    private int fileExist(String filename) {
        int ret = 0;
        File f = new File(filename);
        if (f.exists() && !f.isDirectory()) {
            ret = 1;
        } else {
            ret = 0;
        }

        return ret;

    }

    /**
     * Remove the extension from filename
     *
     * @param filename the filename
     * @return
     */
    private String fileWithoutExt(String filename) {
        String ret = "";
        int dotInd = 0;
        dotInd = filename.lastIndexOf('.');

        // if dot is in the first position,
        // we are dealing with a hidden file rather than an extension
        ret = (dotInd > 0) ? filename.substring(0, dotInd) : filename;

        return ret;
    }

    /**
     * @return the printFormatted
     */
    public int getPrintFormatted() {
        return printFormatted;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param printFormatted the printFormatted to set
     */
    public void setPrintFormatted(int printFormatted) {
        this.printFormatted = printFormatted;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the po
     */
    public PrintStream getPo() {
        return po;
    }

    /**
     * @return the pu
     */
    public PrintStream getPu() {
        return pu;
    }

    /**
     * @param po the po to set
     */
    public void setPo(PrintStream po) {
        this.po = po;
    }

    /**
     * @param pu the pu to set
     */
    public void setPu(PrintStream pu) {
        this.pu = pu;
    }

    /**
     *
     * @return sw_file 0 interactive,1 from file
     */
    public int getSw_file() {
        return sw_file;
    }

    /**
     * set the sw_file
     *
     * @param sw_file the sw_file to set
     */
    public void setSw_file(int sw_file) {
        this.sw_file = sw_file;
    }

    /**
     *
     * @return the wordform typed
     */
    public String getWordform() {
        return wordform;
    }

    /**
     * set the wordform
     *
     * @param wordform the wordform to set
     */
    public void setWordform(String wordform) {
        this.wordform = wordform;
    }

    
}
