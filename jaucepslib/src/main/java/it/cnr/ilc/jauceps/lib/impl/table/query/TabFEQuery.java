/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.ADD_LEM;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C01;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C02;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C03;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C04;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C05;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C06;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C07;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C08;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C09;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.C10;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.ENC;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.LES_ID;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabFEDefinition.TAB_FE_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabFEQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE3CodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabFECodMorSet;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *  <P>
 * PORTING</P>
 * <p>
 * porting of query_table_FORME_ECC_alpha.c</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabFEQuery extends ATabFEQuery{
    static final String CLASS_NAME = TabFEQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabFE> tabs = new ArrayList<>();
    private List<TabFE3CodSet> tabscodset = new ArrayList<>();
    private List<TabFECodMorSet> tabscodmorset = new ArrayList<>();
    private boolean Any = false;
    private boolean Any3CodSet = false;
    private boolean AnyCodMorSet = false;

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
    

    /**
     * Constructor
     * @param conn the connection to use
     */
    public TabFEQuery(Connection conn) {
        super(conn);
    }
    
    @Override
    public List<TabFE> getFEset(String les_id) {
        String routine = CLASS_NAME + "/getFEset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabFEQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  %s, %s ,%s"
                + " FROM %s WHERE (%s=\'%s\') LIMIT 1";
        selectRec = String.format(sel,
                LES_ID, ADD_LEM, ENC, TAB_FE_NAME, LES_ID, les_id);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSiQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(resultSet);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabSiQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSiQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;

    }
    
    @Override
    public List<TabFE3CodSet> get3Code_set_fe(String les_id) {
        String routine = CLASS_NAME + "/get3Code_set_fe";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabFEQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  %s, %s, %s,CONCAT(%s, %s ,%s) as codes FROM %s WHERE (%s=%d) ";
        selectRec = String.format(sel, C01, C02, C03,
                C01, C02, C03,
                TAB_FE_NAME, LES_ID, les_id);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabFEQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabscodset = loopOverRSCodSet(resultSet);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabFEQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabFEQuery.java", routine);
            log.debug(logmess);
        }
        return tabscodset;

    }
    
    @Override
    public List<TabFECodMorSet> getCod_morf_set_fe(TravellingTables travellingtables, String les_id) {
        String routine = CLASS_NAME + "/getCod_morf_set_fe";
        String logmess = "";
        String selectRec = "", sel = "";

        //params
        String fe3codes = travellingtables.getTabFe3CodSet().getCodes();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabFEQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  %s, %s, %s,%s,%s,%s,%s, CONCAT(%s, %s ,%s,%s, %s ,%s,%s) as codes "
                + "FROM %s WHERE (%s=%d) AND CONCAT(%s,%s,%s)=\'%s\'";
        selectRec = String.format(sel, C04, C05, C06, C07, C08, C09, C10,
                TAB_FE_NAME, LES_ID, les_id, C01, C02, C03, fe3codes);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabFEQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabscodmorset = loopOverRSCodMorSet(resultSet, les_id);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabFEQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabFEQuery.java", routine);
            log.debug(logmess);
        }
        return tabscodmorset;

    }
    
    /**
     * This function creates N @see TabFE classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabFE> loopOverRS(ResultSet rs) throws SQLException {
        List<TabFE> tabs = new ArrayList<>();
        String lesId = "";
        String addLem = "";
        String encFE = "";
        while (rs.next()) {
            lesId = rs.getString(LES_ID);
            addLem = rs.getString(ADD_LEM);
            encFE = rs.getString(ENC);

            tabs.add(new TabFE(lesId, addLem, encFE));
        }
        return tabs;
    }

    /**
     * This function creates N @see TabFE classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabFE3CodSet> loopOverRSCodSet(ResultSet rs) throws SQLException {
        List<TabFE3CodSet> tabs = new ArrayList<>();
        String codes = "";
        String C01 = "";
        String C02 = "";
        String C03 = "";
        while (rs.next()) {
            codes = rs.getString("codes");
            C01 = rs.getString(C01);
            C02 = rs.getString(C02);
            C03 = rs.getString(C03);

            tabs.add(new TabFE3CodSet(C01, C02, C03, codes));
        }
        return tabs;
    }

    private List<TabFECodMorSet> loopOverRSCodMorSet(ResultSet rs, String lesId) throws SQLException {
        List<TabFECodMorSet> tabs = new ArrayList<>();
        String codes = "";
        String C04 = "";
        String C05 = "";
        String C06 = "";
        String C07 = "";
        String C08 = "";
        String C09 = "";
        String C10 = "";
        while (rs.next()) {
            codes = rs.getString("codes");
            C01 = rs.getString(C01);
            C02 = rs.getString(C02);
            C03 = rs.getString(C03);
            TabFECodMorSet tab = new TabFECodMorSet(C04, C05, C06, C07, C08, C09, C10, codes);
            tab.setLesId(lesId);
            tabs.add(tab);

        }
        return tabs;
    }
    
}
