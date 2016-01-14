/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.app.utils;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class ResponseManager {

    public String[] segmentizer(String[] segments, short hasPart) {
        String[] retStr = new String[3];// 
        //init 
        retStr[0] = ""; // part
        retStr[1] = "";//enc
        retStr[2] = "";//segments

        String enc = segments[6];
        String part = segments[5];
        String outSegStr = "";

        if (!"".equals(enc)) {
            retStr[0] = enc;

        }

        if (hasPart == 1) {
            retStr[1] = part;
        }

        if (!"".equals(segments[0])) {
            outSegStr = segments[0] + "*";
        }
        outSegStr = outSegStr + segments[1];

        for (int s = 2; s < 5; s++) {
            if (!"".equals(segments[s])) {
                //System.err.println("SEGS " + Arrays.toString(segments) + " " + segments[s] + " " + outSegStr + " " + a);
                outSegStr = outSegStr + " -" + segments[s];
            }
        }
        //po.println(outSegStr);
        if (hasPart == 1 && !"".equals(part)) {
            outSegStr = outSegStr + " -" + part;
        }

        retStr[2] = outSegStr;

        return retStr;
    }

    public String getlemmaMorfCodes(String[] codes) {
        String ret = "";
        for (String code : codes) {
            ret = ret + code;
        }
        return ret;
    }

}
