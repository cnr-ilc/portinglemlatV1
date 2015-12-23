package it.cnr.ilc.jauceps.lib.structs;

import it.cnr.ilc.jauceps.lib.impl.table.Tab3Eagles;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLem3Eagles;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE;
import it.cnr.ilc.jauceps.lib.impl.table.TabFE3CodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabFECodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import it.cnr.ilc.jauceps.lib.impl.table.TabLemmaEnding;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


/**
 * This class contains all table and codes updated at runtime. Use it instead of
 * sending various values as input parameters.
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TravellingTables {

    /**
     * different values according to different loops</br>
     * <ul>
     * <li>0 init</li>
     * <li>1 loop tabspf1</li>
     * <li>2 loop tabspf2</li>
     * <li>3 loop tabsi</li>
     * <li>4 loop table (in lemmi_ecc)</li>
     * <li>5 loop tablessario (in lemmi_ecc)</li>
     * <li>6 loop tabSAI (in comp_le)</li>
     * <li>7 loop CodLe (in pushLemma)</li>
     * <li>8 loop tablessario (in lemv sillib)</li>
     * <li>9 loop tabcodmorset (in pushlemma sillib)</li>
     * <li>10 loop 3cod_set from fe (in pushlemma sillib)</li>
     * <li>11 loop cod_mor_set_fe from fe (in pushlemma sillib)</li>
     * </ul>
     *
     */
    private int status = 0;
    private String ttId="";

    // connection
    private Connection conn;

    // void constructor
    public TravellingTables() {
    }

    /**
     * Constructor with connection
     *
     * @param conn
     */
    public TravellingTables(Connection conn) {
        this.conn = conn;
    }
    // tables

    /**
     * SEGMENTI INIZIALI
     */
    TabSI tabSI = new TabSI();
    /**
     * SEGMENTI ALTERNATIVI INIZIALI (ACC-ADC)
     */
    private TabSAI tabSAI = new TabSAI();

    /**
     * Lessario
     */
    TabLessario tabLessario;

    /**
     * Copy of tabLessario
     */
    TabLessario copiedLessario = new TabLessario();

    /**
     * Tab TAB_LE
     */
    private TabLE tabLe = new TabLE();

    /**
     * SEGMENTI POST FINALI 1
     */
    private TabSPF FirstTabSpf = new TabSPF();

    /**
     * SEGMENTI POST FINALI 2
     */
    private TabSPF SecondTabSpf = new TabSPF();

    /**
     * SEGMENTI MEDIANI 1
     */
    private TabSM FirstTabSm = new TabSM();

    /**
     * SEGMENTI MEDIANI 1
     */
    private TabSM SecondTabSm = new TabSM();

    /**
     * FORME ECCEZIONALI
     */
    TabFE tabFe = new TabFE();

    /**
     * FORME ECCEZIONALI COD SET
     */
    TabFE3CodSet tabFe3CodSet = new TabFE3CodSet();

    /**
     * TabCodLem3Eagles REDUNDANT
     */
    TabCodLem3Eagles tabCodLem3Eagles = new TabCodLem3Eagles();

    /**
     * FORME ECCEZIONALI COD MOR
     */
    private TabFECodMorSet tabFeCodMorSet = new TabFECodMorSet();

    /**
     * TAB 3 CODES EAGLES
     */
    Tab3Eagles tab3e = new Tab3Eagles();

    /**
     * TAB CODES FROM COD_LE
     */
    TabCodLE tabCodLe = new TabCodLE();

    /**
     * SEGMENTI FINALI
     */
    TabSF tabSf = new TabSF();

    /**
     * COD MORF FROM TABSF AND/OR TABSM
     */
    TabSFCodMorSet tabSFCodMorSet = new TabSFCodMorSet();

    /**
     * LEMMA ENDING
     */
    private TabLemmaEnding tabLemmaEnding = new TabLemmaEnding();

    /**
     * COD FROM TABSF AND/OR TABSM
     *
     */
    private TabSFCodSet tabSfCodSet = new TabSFCodSet();

    // list of tables
    private List<Tab3Eagles> ListOfTab3Eagles = new ArrayList<>();
    private List<TabCodLE> ListOfTabCodLe = new ArrayList<>();
    private List<TabCodLem3Eagles> ListOfTabCodLem3Eagles = new ArrayList<>();
    private List<TabFE> ListOfTabFE = new ArrayList<>();
    private List<TabFE3CodSet> ListOfTabFE3CodSet = new ArrayList<>();
    private List<TabFECodMorSet> ListOfTabFECodMorSet = new ArrayList<>();
    private List<TabLE> ListOfTabLE = new ArrayList<>();
    private List<TabLemmaEnding> ListOfTabLemmaEnding = new ArrayList<>();
    private List<TabLessario> ListOfTabLessario = new ArrayList<>();
    private List<TabSAI> ListOfTabSAI = new ArrayList<>();
    private List<TabSF> ListOfTabSF = new ArrayList<>();
    private List<TabSFCodMorSet> ListOfTabSFCodMorSet = new ArrayList<>();
    private List<TabSFCodSet> ListOfTabSFCodSet = new ArrayList<>();
    private List<TabSI> ListOfTabSI = new ArrayList<>();
    private List<TabSM> FirstListOfTabSM = new ArrayList<>();
    private List<TabSM> SecondListOfTabSM = new ArrayList<>();
    private List<TabSPF> FirstListOfTabSpf = new ArrayList<>();
    private List<TabSPF> SecondListOfTabSpf = new ArrayList<>();

    //booleans to check if the
    boolean isanySI = false;
    boolean isanySAI = false;
    boolean isanyLes = false;
    boolean isanyLE = false;
    boolean isanySPF1 = false;
    boolean isanySPF2 = false;
    boolean isanySM1 = false;
    boolean isanySM2 = false;
    boolean isanyFE = false;
    boolean isanyFE3CodSet = false;
    boolean isanyFECodMorSet = false;
    boolean isany3E = false;
    boolean isanyCodle = false;
    boolean isanySF = false;
    boolean isanySFCodMorSet = false;
    boolean isanySFCodSet = false;
    boolean isanyLemmaEnding = false;
    private boolean isanyTabCodLem3Eagles = false;

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the tabSAI
     */
    public TabSAI getTabSAI() {
        return tabSAI;
    }

    /**
     * @param tabSAI the tabSAI to set
     */
    public void setTabSAI(TabSAI tabSAI) {
        this.tabSAI = tabSAI;
    }

    /**
     * @return the tabLessario
     */
    public TabLessario getTabLessario() {
        return tabLessario;
    }

    /**
     * @param tabLessario the tabLessario to set
     */
    public void setTabLessario(TabLessario tabLessario) {
        this.tabLessario = tabLessario;
    }

    /**
     * @return the copiedLessario
     */
    public TabLessario getCopiedLessario() {
        return copiedLessario;
    }

    /**
     * @param copiedLessario the copiedLessario to set
     */
    public void setCopiedLessario(TabLessario copiedLessario) {
        this.copiedLessario = copiedLessario;
    }

    /**
     * @return the tabLe
     */
    public TabLE getTabLe() {
        return tabLe;
    }

    /**
     * @param tabLe the tabLe to set
     */
    public void setTabLe(TabLE tabLe) {
        this.tabLe = tabLe;
    }

    /**
     * @return the tabSpf_1
     */
    public TabSPF getFirstTabSpf() {
        return FirstTabSpf;
    }

    /**
     * @param FirstTabSpf the tabSpf_1 to set
     */
    public void setFirstTabSpf(TabSPF FirstTabSpf) {
        this.FirstTabSpf = FirstTabSpf;
    }

    /**
     * @return the tabSpf_2
     */
    public TabSPF getSecondTabSpf() {
        return SecondTabSpf;
    }

    /**
     * @param SecondTabSpf the tabSpf_2 to set
     */
    public void setSecondTabSpf(TabSPF SecondTabSpf) {
        this.SecondTabSpf = SecondTabSpf;
    }

    /**
     * @return the tabSm_1
     */
    public TabSM getFirstTabSm() {
        return FirstTabSm;
    }

    /**
     * @param FirstTabSm the tabSm_1 to set
     */
    public void setFirstTabSm(TabSM FirstTabSm) {
        this.FirstTabSm = FirstTabSm;
    }

    /**
     * @return the tabSm_2
     */
    public TabSM getSecondTabSm() {
        return SecondTabSm;
    }

    /**
     * @param SecondTabSm the tabSm_2 to set
     */
    public void setSecondTabSm(TabSM SecondTabSm) {
        this.SecondTabSm = SecondTabSm;
    }

    /**
     * @return the ListOfTabSAI
     */
    public List<TabSAI> getListOfTabSAI() {
        return ListOfTabSAI;
    }

    /**
     * @param ListOfTabSAI the ListOfTabSAI to set
     */
    public void setListOfTabSAI(List<TabSAI> ListOfTabSAI) {
        this.ListOfTabSAI = ListOfTabSAI;
    }

    /**
     * @return the ListOfTabLessario
     */
    public List<TabLessario> getListOfTabLessario() {
        return ListOfTabLessario;
    }

    /**
     * @param ListOfTabLessario the ListOfTabLessario to set
     */
    public void setListOfTabLessario(List<TabLessario> ListOfTabLessario) {
        this.ListOfTabLessario = ListOfTabLessario;
    }

    /**
     * @return the ListOfTabLE
     */
    public List<TabLE> getListOfTabLE() {
        return ListOfTabLE;
    }

    /**
     * @param ListOfTabLE the ListOfTabLE to set
     */
    public void setListOfTabLE(List<TabLE> ListOfTabLE) {
        this.ListOfTabLE = ListOfTabLE;
    }

    /**
     * @return the FirstListOfTabSpf
     */
    public List<TabSPF> getFirstListOfTabSpf() {
        return FirstListOfTabSpf;
    }

    /**
     * @param FirstListOfTabSpf the FirstListOfTabSpf to set
     */
    public void setFirstListOfTabSpf(List<TabSPF> FirstListOfTabSpf) {
        this.FirstListOfTabSpf = FirstListOfTabSpf;
    }

    /**
     * @return the SecondListOfTabSpf
     */
    public List<TabSPF> getSecondListOfTabSpf() {
        return SecondListOfTabSpf;
    }

    /**
     * @param SecondListOfTabSpf the SecondListOfTabSpf to set
     */
    public void setSecondListOfTabSpf(List<TabSPF> SecondListOfTabSpf) {
        this.SecondListOfTabSpf = SecondListOfTabSpf;
    }

    /**
     * @return the FirstListOfTabSM
     */
    public List<TabSM> getFirstListOfTabSM() {
        return FirstListOfTabSM;
    }

    /**
     * @param FirstListOfTabSM the FirstListOfTabSM to set
     */
    public void setFirstListOfTabSM(List<TabSM> FirstListOfTabSM) {
        this.FirstListOfTabSM = FirstListOfTabSM;
    }

    /**
     * @return the SecondListOfTabSM
     */
    public List<TabSM> getSecondListOfTabSM() {
        return SecondListOfTabSM;
    }

    /**
     * @param SecondListOfTabSM the SecondListOfTabSM to set
     */
    public void setSecondListOfTabSM(List<TabSM> SecondListOfTabSM) {
        this.SecondListOfTabSM = SecondListOfTabSM;
    }

    // getter & setter
    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySAI() {
        return !getListOfTabSAI().isEmpty();
    }

    /**
     * @param isanySAI the isanySAI to set
     */
    public void setIsanySAI(boolean isanySAI) {
        this.isanySAI = isanySAI;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyLes() {
        return !getListOfTabLessario().isEmpty();
    }

    /**
     * @param isanyLes the isanyLes to set
     */
    public void setIsanyLes(boolean isanyLes) {
        this.isanyLes = isanyLes;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyLE() {
        return !getListOfTabLE().isEmpty();
    }

    /**
     * @param isanyLE the isanyLE to set
     */
    public void setIsanyLE(boolean isanyLE) {
        this.isanyLE = isanyLE;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySPF1() {
        return !getFirstListOfTabSpf().isEmpty();
    }

    /**
     * @param isanySPF1 the isanySPF1 to set
     */
    public void setIsanySPF1(boolean isanySPF1) {
        this.isanySPF1 = isanySPF1;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySPF2() {
        return !getSecondListOfTabSpf().isEmpty();
    }

    /**
     * @param isanySPF2 the isanySPF2 to set
     */
    public void setIsanySPF2(boolean isanySPF2) {
        this.isanySPF2 = isanySPF2;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySM1() {
        return !getFirstListOfTabSM().isEmpty();
    }

    /**
     * @param isanySM1 the isanySM1 to set
     */
    public void setIsanySM1(boolean isanySM1) {
        this.isanySM1 = isanySM1;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySM2() {
        return !getSecondListOfTabSM().isEmpty();
    }

    /**
     * @param isanySM2 the isanySM2 to set
     */
    public void setIsanySM2(boolean isanySM2) {
        this.isanySM2 = isanySM2;
    }

    /**
     * @return the tabSI
     */
    public TabSI getTabSI() {
        return tabSI;
    }

    /**
     * @param tabSI the tabSI to set
     */
    public void setTabSI(TabSI tabSI) {
        this.tabSI = tabSI;
    }

    /**
     * @return the ListOfTabSI
     */
    public List<TabSI> getListOfTabSI() {
        return ListOfTabSI;
    }

    /**
     * @param ListOfTabSI the ListOfTabSI to set
     */
    public void setListOfTabSI(List<TabSI> ListOfTabSI) {
        this.ListOfTabSI = ListOfTabSI;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySI() {

        return !getListOfTabSI().isEmpty();
    }

    /**
     * @param isanySI the isanySI to set
     */
    public void setIsanySI(boolean isanySI) {
        this.isanySI = isanySI;
    }

    /**
     * @return the tabFe
     */
    public TabFE getTabFe() {
        return tabFe;
    }

    /**
     * @param tabFe the tabFe to set
     */
    public void setTabFe(TabFE tabFe) {
        this.tabFe = tabFe;
    }

    /**
     * @return the ListOfTabFE
     */
    public List<TabFE> getListOfTabFE() {
        return ListOfTabFE;
    }

    /**
     * @param ListOfTabFE the ListOfTabFE to set
     */
    public void setListOfTabFE(List<TabFE> ListOfTabFE) {
        this.ListOfTabFE = ListOfTabFE;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyFE() {
        return !getListOfTabFE().isEmpty();
    }

    /**
     * @param isanyFE the isanyFE to set
     */
    public void setIsanyFE(boolean isanyFE) {
        this.isanyFE = isanyFE;
    }

    /**
     * @return the tab3e
     */
    public Tab3Eagles getTab3e() {
        return tab3e;
    }

    /**
     * @param tab3e the tab3e to set
     */
    public void setTab3e(Tab3Eagles tab3e) {
        this.tab3e = tab3e;
    }

    /**
     * @return the ListOfTab3e
     */
    public List<Tab3Eagles> getListOfTab3Eagles() {
        return ListOfTab3Eagles;
    }

    /**
     * @param ListOfTab3Eagles the ListOfTab3e to set
     */
    public void setListOfTab3Eagles(List<Tab3Eagles> ListOfTab3Eagles) {
        this.ListOfTab3Eagles = ListOfTab3Eagles;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsany3E() {
        return !getListOfTab3Eagles().isEmpty();
    }

    /**
     * @param isany3E the isany3E to set
     */
    public void setIsany3E(boolean isany3E) {
        this.isany3E = isany3E;
    }

    /**
     * @return the tabCodLe
     */
    public TabCodLE getTabCodLe() {
        return tabCodLe;
    }

    /**
     * @param tabCodLe the tabCodLe to set
     */
    public void setTabCodLe(TabCodLE tabCodLe) {
        this.tabCodLe = tabCodLe;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyCodle() {
        return !getListOfTabCodLe().isEmpty();
    }

    /**
     * @param isanyCodle the isanyCodle to set
     */
    public void setIsanyCodle(boolean isanyCodle) {
        this.isanyCodle = isanyCodle;
    }

    /**
     * @return the ListOfTabCodLe
     */
    public List<TabCodLE> getListOfTabCodLe() {
        return ListOfTabCodLe;
    }

    /**
     * @param ListOfTabCodLe the ListOfTabCodLe to set
     */
    public void setListOfTabCodLe(List<TabCodLE> ListOfTabCodLe) {
        this.ListOfTabCodLe = ListOfTabCodLe;
    }

    /**
     * @return the tabSf
     */
    public TabSF getTabSf() {
        return tabSf;
    }

    /**
     * @param tabSf the tabSf to set
     */
    public void setTabSf(TabSF tabSf) {
        this.tabSf = tabSf;
    }

    /**
     * @return the ListOfTabSF
     */
    public List<TabSF> getListOfTabSF() {
        return ListOfTabSF;
    }

    /**
     * @param ListOfTabSF the ListOfTabSF to set
     */
    public void setListOfTabSF(List<TabSF> ListOfTabSF) {
        this.ListOfTabSF = ListOfTabSF;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySF() {
        return !ListOfTabSF.isEmpty();
    }

    /**
     * @param isanySF the isanySF to set
     */
    public void setIsanySF(boolean isanySF) {
        this.isanySF = isanySF;
    }

    /**
     * @return the tabSFCodMorSet
     */
    public TabSFCodMorSet getTabSFCodMorSet() {
        return tabSFCodMorSet;
    }

    /**
     * @param tabSFCodMorSet the tabSFCodMorSet to set
     */
    public void setTabSFCodMorSet(TabSFCodMorSet tabSFCodMorSet) {
        this.tabSFCodMorSet = tabSFCodMorSet;
    }

    /**
     * @return the ListOfTabSFCodMorSet
     */
    public List<TabSFCodMorSet> getListOfTabSFCodMorSet() {
        return ListOfTabSFCodMorSet;
    }

    /**
     * @param ListOfTabSFCodMorSet the ListOfTabSFCodMorSet to set
     */
    public void setListOfTabSFCodMorSet(List<TabSFCodMorSet> ListOfTabSFCodMorSet) {
        this.ListOfTabSFCodMorSet = ListOfTabSFCodMorSet;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySFCodMorSet() {
        return !getListOfTabSFCodMorSet().isEmpty();
    }

    /**
     * @param isanySFCodMorSet the isanySFCodMorSet to set
     */
    public void setIsanySFCodMorSet(boolean isanySFCodMorSet) {
        this.isanySFCodMorSet = isanySFCodMorSet;
    }

    /**
     * @return the tabSfCodSet
     */
    public TabSFCodSet getTabSfCodSet() {
        return tabSfCodSet;
    }

    /**
     * @param tabSfCodSet the tabSfCodSet to set
     */
    public void setTabSfCodSet(TabSFCodSet tabSfCodSet) {
        this.tabSfCodSet = tabSfCodSet;
    }

    /**
     * @return the ListOfTabSFCodSet
     */
    public List<TabSFCodSet> getListOfTabSFCodSet() {
        return ListOfTabSFCodSet;
    }

    /**
     * @param ListOfTabSFCodSet the ListOfTabSFCodSet to set
     */
    public void setListOfTabSFCodSet(List<TabSFCodSet> ListOfTabSFCodSet) {
        this.ListOfTabSFCodSet = ListOfTabSFCodSet;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanySFCodSet() {
        return !ListOfTabSFCodSet.isEmpty();
    }

    /**
     * @param isanySFCodSet the isanySFCodSet to set
     */
    public void setIsanySFCodSet(boolean isanySFCodSet) {
        this.isanySFCodSet = isanySFCodSet;
    }

    /**
     * @return the tabFe3CodSet
     */
    public TabFE3CodSet getTabFe3CodSet() {
        return tabFe3CodSet;
    }

    /**
     * @param tabFe3CodSet the tabFe3CodSet to set
     */
    public void setTabFe3CodSet(TabFE3CodSet tabFe3CodSet) {
        this.tabFe3CodSet = tabFe3CodSet;
    }

    /**
     * @return the ListOfTabFE3CodSet
     */
    public List<TabFE3CodSet> getListOfTabFE3CodSet() {
        return ListOfTabFE3CodSet;
    }

    /**
     * @param ListOfTabFE3CodSet the ListOfTabFE3CodSet to set
     */
    public void setListOfTabFE3CodSet(List<TabFE3CodSet> ListOfTabFE3CodSet) {
        this.ListOfTabFE3CodSet = ListOfTabFE3CodSet;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyFE3CodSet() {
        return !ListOfTabFE3CodSet.isEmpty();
    }

    /**
     * @param isanyFE3CodSet the isanyFE3CodSet to set
     */
    public void setIsanyFE3CodSet(boolean isanyFE3CodSet) {
        this.isanyFE3CodSet = isanyFE3CodSet;
    }

    /**
     * @return the tabFeCodMorSet
     */
    public TabFECodMorSet getTabFeCodMorSet() {
        return tabFeCodMorSet;
    }

    /**
     * @param tabFeCodMorSet the tabFeCodMorSet to set
     */
    public void setTabFeCodMorSet(TabFECodMorSet tabFeCodMorSet) {
        this.tabFeCodMorSet = tabFeCodMorSet;
    }

    /**
     * @return the ListOfTabFECodMorSet
     */
    public List<TabFECodMorSet> getListOfTabFECodMorSet() {
        return ListOfTabFECodMorSet;
    }

    /**
     * @param ListOfTabFECodMorSet the ListOfTabFECodMorSet to set
     */
    public void setListOfTabFECodMorSet(List<TabFECodMorSet> ListOfTabFECodMorSet) {
        this.ListOfTabFECodMorSet = ListOfTabFECodMorSet;
    }

    /**
     * @return true is the list contains elements
     */
    public boolean isIsanyFECodMorSet() {
        return ListOfTabFECodMorSet.isEmpty();
    }

    /**
     * @param isanyFECodMorSet the isanyFECodMorSet to set
     */
    public void setIsanyFECodMorSet(boolean isanyFECodMorSet) {
        this.isanyFECodMorSet = isanyFECodMorSet;
    }

    /**
     * @return the tabLemmaEnding
     */
    public TabLemmaEnding getTabLemmaEnding() {
        return tabLemmaEnding;
    }

    /**
     * @param tabLemmaEnding the tabLemmaEnding to set
     */
    public void setTabLemmaEnding(TabLemmaEnding tabLemmaEnding) {
        this.tabLemmaEnding = tabLemmaEnding;
    }

    /**
     * @return the ListOfLemmaEnding
     */
    public List<TabLemmaEnding> getListOfTabLemmaEnding() {
        return ListOfTabLemmaEnding;
    }

    /**
     * @param ListOfTabLemmaEnding the ListOfLemmaEnding to set
     */
    public void setListOfTabLemmaEnding(List<TabLemmaEnding> ListOfTabLemmaEnding) {
        this.ListOfTabLemmaEnding = ListOfTabLemmaEnding;
    }

    /**
     * @return the isanyLemmaEnding
     */
    public boolean isIsanyLemmaEnding() {
        return !ListOfTabLemmaEnding.isEmpty();
    }

    /**
     * @param isanyLemmaEnding the isanyLemmaEnding to set
     */
    public void setIsanyLemmaEnding(boolean isanyLemmaEnding) {
        this.isanyLemmaEnding = isanyLemmaEnding;
    }

    /**
     * @return the ListOfTabCodLem3Eagles
     */
    public List<TabCodLem3Eagles> getListOfTabCodLem3Eagles() {
        return ListOfTabCodLem3Eagles;
    }

    /**
     * @param ListOfTabCodLem3Eagles the ListOfTabCodLem3Eagles to set
     */
    public void setListOfTabCodLem3Eagles(List<TabCodLem3Eagles> ListOfTabCodLem3Eagles) {
        this.ListOfTabCodLem3Eagles = ListOfTabCodLem3Eagles;
    }

    /**
     * @return the isanyTabCodLem3Eagles
     */
    public boolean isIsanyTabCodLem3Eagles() {
        return !ListOfTabCodLem3Eagles.isEmpty();
    }

    /**
     * @param isanyTabCodLem3Eagles the isanyTabCodLem3Eagles to set
     */
    public void setIsanyTabCodLem3Eagles(boolean isanyTabCodLem3Eagles) {
        this.isanyTabCodLem3Eagles = isanyTabCodLem3Eagles;
    }

    /**
     * @return the ttId
     */
    public String getTtId() {
        return ttId;
    }

    /**
     * @param ttId the ttId to set
     */
    public void setTtId(String ttId) {
        this.ttId = ttId;
    }
}
