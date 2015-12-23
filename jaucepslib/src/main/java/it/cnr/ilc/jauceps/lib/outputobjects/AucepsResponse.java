/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.outputobjects;

import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.SilType;

/**
 * This class contains the update @SilType and the last @see Analysis and @see
 * Analyses
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class AucepsResponse {

    Analyses analyses;
    SilType sil;
    Analysis cur_analysis;

    public AucepsResponse(Analyses analyses, SilType sil, Analysis cur_analysis) {
        this.analyses = analyses;
        this.sil = sil;
        this.cur_analysis = cur_analysis;
    }

    public AucepsResponse(SilType sil) {
        this.sil = sil;
    }

    @Override
    public String toString() {
        return "AucepsResponse{" + "analyses=" + analyses.toString() + ", sil=" + sil + ", cur_analysis=" + cur_analysis.toString() + '}';
    }
    

}
