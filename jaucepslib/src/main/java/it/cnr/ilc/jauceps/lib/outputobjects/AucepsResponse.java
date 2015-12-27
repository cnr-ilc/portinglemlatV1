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

    private Analyses analyses;
    private SilType sil;
    private Analysis cur_analysis;
    private String resId="";

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
        //return "AucepsResponse{" + "analyses=" + analyses.toString() + ", sil=" + sil + ", cur_analysis=" + cur_analysis.toString() + '}';
        return "AucepsResponse{" + "analyses=" + getAnalyses() + ", sil=" + getSil() + ", cur_analysis=" + getCur_analysis() + '}';
    }

    /**
     * @return the resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return the analyses
     */
    public Analyses getAnalyses() {
        return analyses;
    }

    /**
     * @return the sil
     */
    public SilType getSil() {
        return sil;
    }

    /**
     * @return the cur_analysis
     */
    public Analysis getCur_analysis() {
        return cur_analysis;
    }

    /**
     * @param analyses the analyses to set
     */
    public void setAnalyses(Analyses analyses) {
        this.analyses = analyses;
    }

    /**
     * @param sil the sil to set
     */
    public void setSil(SilType sil) {
        this.sil = sil;
    }

    /**
     * @param cur_analysis the cur_analysis to set
     */
    public void setCur_analysis(Analysis cur_analysis) {
        this.cur_analysis = cur_analysis;
    }
    

}
