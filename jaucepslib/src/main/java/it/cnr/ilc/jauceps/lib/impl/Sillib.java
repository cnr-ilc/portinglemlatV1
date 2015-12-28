/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery;
import it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery;
import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_KEY;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingQueries;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;
import it.cnr.ilc.latmorphlib.structs.LEM_TYPE;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta
 * @mail riccardo.delgratta@{gmail.com|ilc.cnr.it}
 */
public class Sillib {

    static final String CLASS_NAME = Sillib.class.getName();

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
    boolean operationDebug = vars.isOperationDebug();
    String EOS = vars.getEOS();

    public SilType spferic(SilType sil, TabSPF tab) {

        String routine = Sillib.class.getName() + "/spferic";
        String logmess = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        int length = 0;
        String rad_spfe = "";
        length = sil.getForm().length() - tab.getSPF().length();
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.form %s on sil.rad_spfe %s", routine, length, sil.getForm(), rad_spfe);
            log.debug(logmess);

        }
        rad_spfe = sil.getForm().substring(0, length);
        sil.setRad_spfe(rad_spfe);
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.form %s on sil.rad_spfe %s", routine, length, sil.getForm(), rad_spfe);
            log.debug(logmess);

        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java. rad_spfe %s", routine, rad_spfe);
            log.debug(logmess);
        }

        return sil;
    }

    public SilType spfric(SilType sil, TabSPF tab) {
        String routine = Sillib.class.getName() + "/spfric";
        String logmess = "";
        int length;
        String rad_spf = "";

        length = sil.getRad_spfe().length() - tab.getSPF().length();
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.rad_spfe %s on sil.rad_spf %s", routine, length, sil.getRad_spfe(), rad_spf);
            log.debug(logmess);
        }
        rad_spf = sil.getRad_spfe().substring(0, length);
        sil.setRad_spf(rad_spf);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.rad_spfe %s on sil.rad_spf %s", routine, length, sil.getRad_spfe(), rad_spf);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        return sil;
    }

    public SilType siric(SilType sil, TabSI tab) {
        String routine = Sillib.class.getName() + "/siric";
        String logmess = "";
        int length;
        String rad_si = "", rad_spf = "";

        rad_spf = sil.getRad_spf();
        length = rad_spf.length();
        rad_si = rad_spf.substring(0, length);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPYING in %s N chars %d of sil.rad_spf %s on sil.rad_si %s", routine, length, sil.getRad_spf(), rad_si);
            log.debug(logmess);
        }

        sil.setRad_si(rad_si);

        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****COPIED in %s N chars %d of sil.rad_spf %s on sil.rad_si %s", routine, length, sil.getRad_spf(), rad_si);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in Sillib.java", routine);
            log.debug(logmess);
        }

        return sil;
    } // end siric
    
    public AucepsResponse lemtiz(AucepsResponse response, TravellingTables travellingtables, TravellingQueries travellingqueries, LEM_TYPE lem_type) {
        String routine = CLASS_NAME + "/lemtiz";
        String logmess = "";
        TabLessario areal_add;
        String[] segments = new String[7];
        String encFE, les_id, add_lem;
        return response;
    } // end lmtiz
    

}
