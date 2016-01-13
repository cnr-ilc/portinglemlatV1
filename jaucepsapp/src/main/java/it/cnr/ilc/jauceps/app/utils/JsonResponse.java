/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.utils;

import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class JsonResponse {

    AucepsResponse response;

    public JsonResponse(AucepsResponse response) {
        this.response = response;
    }

    public String dump() {
        String ret="";
        JsonObjectBuilder responseBuilder = Json.createObjectBuilder();
        JsonArrayBuilder analysesBuilder = Json.createArrayBuilder();
        JsonArrayBuilder lemmasBuilder = Json.createArrayBuilder();
        JsonArrayBuilder formMorfCodesBuilder = Json.createArrayBuilder();
        JsonArrayBuilder lemmaMorfCodesBuilder = Json.createArrayBuilder();
        
        Analyses analyses = response.getAnalyses();
        String labelInForm="input_wordform";
        String labelAltForm="analyzed_wordform";
        String labelnumA="number_of_analyses";
        responseBuilder.add(labelInForm,analyses.getIn_form());
        responseBuilder.add(labelAltForm,analyses.getAlt_in_form());
        responseBuilder.add(labelnumA,analyses.getNumAnalysis());
        JsonObject obj=responseBuilder.build();
        return obj.toString();
    }

}
