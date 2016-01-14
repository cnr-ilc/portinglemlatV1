/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.utils;

import it.cnr.ilc.jauceps.lib.outputobjects.AucepsResponse;
import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.Lemma;
import java.math.BigDecimal;
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
        ResponseManager manager = new ResponseManager();
        String ret = "";
        JsonObjectBuilder responseBuilder = Json.createObjectBuilder();

        JsonArrayBuilder analysesArrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder analysisObjBuilder;//= Json.createArrayBuilder();

        JsonArrayBuilder lemmasArrayBuilder;// = Json.createArrayBuilder();
        JsonObjectBuilder lemmaObjBuilder;//=Json.createObjectBuilder();

        JsonObjectBuilder lemmaMorfCode;
        JsonArrayBuilder formMorfCodesBuilder;// = Json.createArrayBuilder();

        JsonArrayBuilder lemmaMorfCodesArrayBuilder;
        JsonObjectBuilder lemmaObjMorfCodesBuilder;// = Json.createArrayBuilder();

        Analyses analyses = response.getAnalyses();
        String labelInForm = "input_wordform";
        String labelAltForm = "analyzed_wordform";
        String labelnumA = "number_of_analyses";
        String labelFound = "found";
        String labelAnalysis = "analyses";
        String labelSegments = "segments";
        String labelId = "id";
        String labelEnc = "enclitica";
        String labelPart = "part";
        String labelNumL = "num_lemma";
        String labelLemmas = "lemmas";
        String labelLemma = "lemma";
        String labelValues = "values";
        String labelMorfCodes = "morpho_codes";

        String[] segs;

        responseBuilder.add(labelInForm, analyses.getIn_form());
        responseBuilder.add(labelAltForm, analyses.getAlt_in_form());
        responseBuilder.add(labelnumA, (int) (analyses.getNumAnalysis() - 1));
        if (analyses.getNumAnalysis() == 0) {
            responseBuilder.add(labelFound, "false");
        } else {
            responseBuilder.add(labelFound, "true");
        }
        int id = 1;
        for (Analysis analysis : analyses.getListOfAnalysis()) {
            lemmasArrayBuilder = Json.createArrayBuilder();

            analysisObjBuilder = Json.createObjectBuilder();
            segs = manager.segmentizer(analysis.getSegments(), analysis.getPart());

            analysisObjBuilder.add(labelId, id);
            if (!"".equals(segs[0])) {
                analysisObjBuilder.add(labelEnc, segs[0]);
            }
            if (!"".equals(segs[1])) {
                analysisObjBuilder.add(labelPart, segs[1]);
            }
            analysisObjBuilder.add(labelNumL, analysis.getLemmas().getNumL());
            analysisObjBuilder.add(labelSegments, segs[2]);
            // lemmas
            int l = 1;
            for (Lemma lemma : analysis.getLemmas().getLemmas()) {
                lemmaObjBuilder = Json.createObjectBuilder();
                lemmaObjBuilder.add(labelId, l);
                lemmaObjBuilder.add(labelLemma, lemma.getOut_lemma());
                
                // morfocodes
                lemmaObjMorfCodesBuilder=Json.createObjectBuilder();
                lemmaMorfCodesArrayBuilder=Json.createArrayBuilder();
                
                lemmaObjMorfCodesBuilder.add(labelValues, manager.getlemmaMorfCodes(lemma.getCod_morf_1_3()));
                
                lemmaMorfCodesArrayBuilder.add(lemmaObjMorfCodesBuilder);
                lemmaObjBuilder.add(labelMorfCodes, lemmaMorfCodesArrayBuilder);
                
                lemmasArrayBuilder.add(lemmaObjBuilder);
                l++;
            }
            analysisObjBuilder.add(labelLemmas, lemmasArrayBuilder);

            analysesArrayBuilder.add(analysisObjBuilder);
            id++;
        }

        responseBuilder.add(labelAnalysis, analysesArrayBuilder);
        JsonObject obj = responseBuilder.build();
        return obj.toString();
    }

}
