cd /opt/java/app/jlatmorphV2/jaucepsapp; JAVA_HOME=/usr/lib/jvm/java-8-oracle /opt/java/netbeans-8.1/java/maven/bin/mvn "-Dexec.args=-classpath %classpath it.cnr.ilc.jauceps.app.JAucepsApp" -Dexec.executable=/usr/lib/jvm/java-8-oracle/bin/java org.codehaus.mojo:exec-maven-plugin:1.2.1:exec
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...
                                                                        
------------------------------------------------------------------------
Building jaucepsapp 1.0-SNAPSHOT
------------------------------------------------------------------------

--- exec-maven-plugin:1.2.1:exec (default-cli) @ jaucepsapp ---
2016-01-11 14:06:01 DEBUG JAucepsApp:86 - DEEPFLOW START -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-11 14:06:01 DEBUG JAucepsApp:92 - OPERATION Instantiating Interact. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG JAucepsApp:97 - CALLING -startroutine- in Interact.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG Interact:63 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/startroutine in class Interact.java
2016-01-11 14:06:01 DEBUG Interact:119 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Interact/startroutine in class Interact.java
2016-01-11 14:06:01 DEBUG JAucepsApp:111 - OPERATION Instantiating sil. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG JAucepsApp:118 - OPERATION Instantiating lib with silId -RunID_2016.01.11.14.06.01- CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG JAucepsApp:124 - CALLING -initialize- in Lib.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG Lib:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-11 14:06:01 DEBUG Lib:81 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-11 14:06:01 DEBUG Lib:95 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-11 14:06:01 DEBUG Lib:100 - CALLING -ll_connect- in Lib.java. CALLER: it.cnr.ilc.jauceps.lib.impl.Lib/initialize
2016-01-11 14:06:01 DEBUG DataSource:57 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.DataSource/ll_connect in class DataSource.java
2016-01-11 14:06:01 DEBUG DataSource:62 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.DataSource/ll_connect in class DataSource.java. Connection Id -com.mysql.jdbc.JDBC4Connection@61e717c2-
2016-01-11 14:06:01 DEBUG Lib:110 - DEEPFLOW END Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-11 14:06:01 DEBUG JAucepsApp:138 - VALUES SilId: -RunID_2016.01.11.14.06.01- in -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-11 14:06:01 DEBUG JAucepsApp:140 - VALUES connection: -com.mysql.jdbc.JDBC4Connection@61e717c2- in -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-11 14:06:01 DEBUG JAucepsApp:146 - OPERATION Instantiating TravellingQueries with conn -com.mysql.jdbc.JDBC4Connection@61e717c2- and id -RunID_2016.01.11.14.06.01-
2016-01-11 14:06:01 DEBUG JAucepsApp:148 - OPERATION Instantiating TravellingTables with conn -com.mysql.jdbc.JDBC4Connection@61e717c2- and id -RunID_2016.01.11.14.06.01-
2016-01-11 14:06:01 DEBUG JAucepsApp:157 - CALLING -prompt- in Interact.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-11 14:06:01 DEBUG Lib:128 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-11 14:06:01 DEBUG Lib:134 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-11 14:06:01 DEBUG Lib:150 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-11 14:06:01 DEBUG Interact:131 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java

>type the WORD-FORM you wish to analyze. end to exit
adcommodator
2016-01-11 14:06:08 DEBUG Interact:164 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java. Wordform: adcommodator
2016-01-11 14:06:08 DEBUG JAucepsApp:168 - DEEPFLOW Instantiating AucepsResponse with silId -RunID_2016.01.11.14.06.01-
2016-01-11 14:06:08 DEBUG JAucepsApp:175 - DEEPFLOW Instantiating InputFunctions with travellingtables and travellingqueries status -0-- and id -RunID_2016.01.11.14.06.01-
2016-01-11 14:06:08 DEBUG InputFunctions:98 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall in InputFunctions.java
2016-01-11 14:06:08 DEBUG InputFunctions:109 - DEEPFLOW ****CHANGING wordform -adcommodator- to lowercase
2016-01-11 14:06:08 DEBUG InputFunctions:114 - DEEPFLOW ****CHANGED wordform -adcommodator- to lowercase
2016-01-11 14:06:08 DEBUG InputFunctions:120 - DEEPFLOW ****CHANGING wordform -adcommodator- v-> u and j->i
2016-01-11 14:06:08 DEBUG InputFunctions:128 - DEEPFLOW ****CHANGED wordform -adcommodator- v-> u and j->i
2016-01-11 14:06:08 DEBUG InputFunctions:134 - DEEPFLOW ****COPYING wordform adcommodator to sil.form --
2016-01-11 14:06:08 DEBUG InputFunctions:141 - DEEPFLOW ****COPIED wordform adcommodator to sil.form -adcommodator-
2016-01-11 14:06:08 DEBUG InputFunctions:146 - CALLING initAnalyses in  RunAnalyses.java CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall
2016-01-11 14:06:08 DEBUG RunAnalyses:68 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initAnalyses in RunAnalyses.java with parameters: wordform -adcommodator- alternative form -adcommodator- nun of analysis 0
2016-01-11 14:06:08 DEBUG RunAnalyses:72 - DEEPFLOW ****COPYING forma_orig -adcommodator- to analyses.in_form -null-
2016-01-11 14:06:08 DEBUG RunAnalyses:74 - DEEPFLOW ****COPYING forma_alt -adcommodator- to analyses.alt_form -null-
2016-01-11 14:06:08 DEBUG RunAnalyses:80 - DEEPFLOW ****COPIED forma_orig -adcommodator- to analyses.in_form -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:82 - DEEPFLOW ****COPIED forma_alt -adcommodator- to analyses.alt_form -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:86 - DEEPFLOW ****ASSIGNING 0 to analyses.numAnalysis 0
2016-01-11 14:06:08 DEBUG RunAnalyses:92 - DEEPFLOW ****ASSIGNED 0 to analyses.numAnalysis 0
2016-01-11 14:06:08 DEBUG RunAnalyses:97 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initAnalyses in RunAnalyses.java with parameters: wordforf -adcommodator- alternative form -adcommodator- nun of analysis 0
2016-01-11 14:06:08 DEBUG InputFunctions:165 - CALLING siln in  InputFunctions.java. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall
2016-01-11 14:06:08 DEBUG InputFunctions:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln in InputFunctions.java
2016-01-11 14:06:08 DEBUG InputFunctions:252 - CALLING tabspfq_1.getSPFset in TabSpfQuery.java with parameters: form -adcommodator- and SPF1 -0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-11 14:06:08 DEBUG TabSpfQuery:76 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF1
2016-01-11 14:06:08 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:0 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  AND (LEFT(comp_cod,1)='e' OR comp_cod='')  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:0 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  AND (LEFT(comp_cod,1)='e' OR comp_cod='')  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:259 - OPERATIONDEBUG SETTING setFirstListOfTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:267 - ****VALUES of getFirstListOfTabSpf  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:270 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF1 -1-
2016-01-11 14:06:08 DEBUG InputFunctions:275 - OPERATIONDEBUG SETTING setFirstTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:277 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:323 - DEEPFLOW LOOP SPF1. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -false- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1--
2016-01-11 14:06:08 DEBUG InputFunctions:327 - DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:334 - DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -0- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -1- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -2- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -3- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -4- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -5- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:346 - CALLING spferic in  it.cnr.ilc.jauceps.lib.impl.InputFunctions.Parameters form -adcommodator-and spf1 -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:84 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:91 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 12 of sil.form adcommodator on sil.rad_spfe 
2016-01-11 14:06:08 DEBUG Sillib:98 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 12 of sil.form adcommodator on sil.rad_spfe adcommodator
2016-01-11 14:06:08 DEBUG Sillib:104 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java. rad_spfe adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:360 - CALLING tabspfq_2.getSPFset in TabSpfQuery.java with parameters: rad_spfe -adcommodator- and SPF2 -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-11 14:06:08 DEBUG TabSpfQuery:91 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF2
2016-01-11 14:06:08 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:366 - OPERATIONDEBUG SETTING setSecondListOfTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:375 - ****VALUES of getSecondListOfTabSpf  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:378 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF2 -1-
2016-01-11 14:06:08 DEBUG InputFunctions:384 - OPERATIONDEBUG SETTING setSecondTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:386 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2--
2016-01-11 14:06:08 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -adcommodator- and spf1 -0- and spf2 -0. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:119 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:124 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 12 of sil.rad_spfe adcommodator on sil.rad_spf 
2016-01-11 14:06:08 DEBUG Sillib:131 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 12 of sil.rad_spfe adcommodator on sil.rad_spf adcommodator
2016-01-11 14:06:08 DEBUG Sillib:136 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value -null-
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -adcommodator-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('adcommodator',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('adcommodator',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:484 - OPERATIONDEBUG SETTING setListOfTabSi in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-11 14:06:08 DEBUG InputFunctions:502 - OPERATIONDEBUG SETTING setTabSI in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:504 - OPERATIONDEBUG SETTING status in travellingtables to 3 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3--
2016-01-11 14:06:08 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -adcommodator- and spf1 -0- and spf2 -0 and si-0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:190 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:194 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 12 of sil.rad_spf adcommodator on sil.rad_si adcommodator
2016-01-11 14:06:08 DEBUG Sillib:201 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 12 of sil.rad_spf adcommodator on sil.rad_si adcommodator
2016-01-11 14:06:08 DEBUG Sillib:205 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -adcommodator-
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -1- with value -adcommodator-
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:614 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:1056 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:1061 - DEEPFLOW ****COPYING rad_si (str) adcommodator on sil.radical null
2016-01-11 14:06:08 DEBUG InputFunctions:1063 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-11 14:06:08 DEBUG InputFunctions:1065 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-11 14:06:08 DEBUG InputFunctions:1074 - DEEPFLOW ****COPIED rad_si (str) adcommodator on sil.radical adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:1076 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-11 14:06:08 DEBUG InputFunctions:1078 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-11 14:06:08 DEBUG InputFunctions:1085 - CALLING getLEset with parameters rad_si: -adcommodator- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-11 14:06:08 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-11 14:06:08 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='adcommodator'
2016-01-11 14:06:08 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='adcommodator'
2016-01-11 14:06:08 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:1091 - OPERATIONDEBUG SETTING setListOfTabLE in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1099 - CALLING getLEset with parameters rad_si: -adcommodator- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-11 14:06:08 DEBUG InputFunctions:1103 - ****VALUES of getListOfTabLE  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:1106 - ****VALUES of getListOfTabLE is -1-  LOOP ON TABLE -1-
2016-01-11 14:06:08 DEBUG InputFunctions:1112 - OPERATIONDEBUG SETTING setTabLe in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1114 - OPERATIONDEBUG SETTING status in travellingtables to 4 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1148 - DEEPFLOW LOOP LE IN LEMMI_ECC. Counters le -0- lessario -0- isanyLE -false- isanyLES -false- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4--
2016-01-11 14:06:08 DEBUG InputFunctions:1154 - CALLING getLESset with parameters les_id: -600- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE pr_key=600 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE pr_key=600 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:1161 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1168 - ****VALUES of getListOfTabLessario  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:1179 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1181 - OPERATIONDEBUG SETTING status in travellingtables to 5 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-11 14:06:08 DEBUG InputFunctions:1213 - DEEPFLOW LOOP LESSARIO IN LEMMI_ECC. Counters le -0- lessario -0- isanyLE -false- isanyLES -false- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5--
2016-01-11 14:06:08 DEBUG InputFunctions:1217 - CALLING comp_le in  it.cnr.ilc.jauceps.lib.impl.InputFunctions. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-11 14:06:08 DEBUG InputFunctions:1272 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le in InputFunctions.java. Parameter adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:1286 - DEEPFLOW ****CHECKING sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le
2016-01-11 14:06:08 DEBUG InputFunctions:1293 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le: WAS NOT NULL
2016-01-11 14:06:08 DEBUG InputFunctions:1297 - CALLING compai with parameters a_gra: -d01- and SAI_cod -- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le 
2016-01-11 14:06:08 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -d01- and cod --
2016-01-11 14:06:08 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -d01- and cod -- EXIT 0
2016-01-11 14:06:08 DEBUG InputFunctions:1303 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le in with parameters a_gra: -d01- and SAI_cod -- EXIT FALSE 
2016-01-11 14:06:08 DEBUG InputFunctions:1308 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compai in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/comp_le- BRANCH FALSE
2016-01-11 14:06:08 DEBUG InputFunctions:1243 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: adcommodator
2016-01-11 14:06:08 DEBUG InputFunctions:626 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -adcommodator-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-11 14:06:08 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('adcommodator',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-11 14:06:08 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:631 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:640 - ****VALUES of getListOfTabSF  -5-
2016-01-11 14:06:08 DEBUG InputFunctions:643 - ****VALUES of getListOfTabSF is -5- ADDITIONAL LOOP SF -5-
2016-01-11 14:06:08 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20--
2016-01-11 14:06:08 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adcommodator- and spf1 -0- and spf2 -0 and si-0- and sf -0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 12 of sil.rad_si -adcommodator- on sil.rad_sf --
2016-01-11 14:06:08 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 12 of sil.rad_si -adcommodator- on sil.rad_sf -adcommodator-
2016-01-11 14:06:08 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adcommodator-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -adcommodator- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -0- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommodator- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommodator- on sil.radical -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommodator- on sil.radical -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommodator- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommodator-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodator',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodator',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommodator- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodator on sil.rad_sai null
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodator on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommodator- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodator', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodator' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodator', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodator' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodator-
2016-01-11 14:06:08 DEBUG InputFunctions:763 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adcommodator-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodator',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodator',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:768 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:777 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-11 14:06:08 DEBUG InputFunctions:780 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-11 14:06:08 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -1- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20--
2016-01-11 14:06:08 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adcommodator- and spf1 -0- and spf2 -0 and si-0- and sf -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 11 of sil.rad_si -adcommodator- on sil.rad_sf --
2016-01-11 14:06:08 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 11 of sil.rad_si -adcommodator- on sil.rad_sf -adcommodato-
2016-01-11 14:06:08 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adcommodato-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -r-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -r- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -adcommodato- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -1- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommodato- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodato-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommodato- on sil.radical -adcommodator-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommodato- on sil.radical -adcommodato-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommodato- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommodato-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodato',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodato',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommodato- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodato on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodato on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommodato- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodato', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodato' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodato', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodato' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodato-
2016-01-11 14:06:08 DEBUG InputFunctions:763 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adcommodato-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodato',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodato',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:768 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:777 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-11 14:06:08 DEBUG InputFunctions:780 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-11 14:06:08 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -2- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20-11-20--
2016-01-11 14:06:08 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adcommodator- and spf1 -0- and spf2 -0 and si-0- and sf -2-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 10 of sil.rad_si -adcommodator- on sil.rad_sf --
2016-01-11 14:06:08 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 10 of sil.rad_si -adcommodator- on sil.rad_sf -adcommodat-
2016-01-11 14:06:08 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adcommodat-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -or-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -or- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -adcommodat- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -2- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommodat- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodat-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommodat- on sil.radical -adcommodato-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommodat- on sil.radical -adcommodat-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommodat- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommodat-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodat',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommodat',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommodat- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodat on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommodat on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommodat- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodat', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodat' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommodat', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommodat' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommodat-
2016-01-11 14:06:08 DEBUG InputFunctions:763 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adcommodat-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodat',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommodat',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:768 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:777 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:780 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-11 14:06:08 DEBUG InputFunctions:785 - OPERATIONDEBUG SETTING setFirstTabSm in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:787 - OPERATIONDEBUG SETTING status in travellingtables to 21 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:824 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -0- si -0- sf -2- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20-11-20-11-21--
2016-01-11 14:06:08 DEBUG InputFunctions:829 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:838 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:842 - CALLING smric in  Sillib.java with rad_sf -adcommodat- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:269 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:285 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf at on sil.rad_sm adcommodat for mode -0-
2016-01-11 14:06:08 DEBUG Sillib:297 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf adcommod on sil.rad_sm adcommodat for mode -0-
2016-01-11 14:06:08 DEBUG Sillib:302 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:849 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:851 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:861 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:863 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -at-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -or-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:875 - CALLING analysis (2) with sm1 -0- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommod- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommod- on sil.radical -adcommodat-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommod- on sil.radical -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:885 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:890 - OPERATIONDEBUG SETTING setSecondListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:899 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-11 14:06:08 DEBUG InputFunctions:902 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-11 14:06:08 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -3- sm_1 -1- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20-11-20-11-21-11-20--
2016-01-11 14:06:08 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adcommodator- and spf1 -0- and spf2 -0 and si-0- and sf -3-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 9 of sil.rad_si -adcommodator- on sil.rad_sf --
2016-01-11 14:06:08 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 9 of sil.rad_si -adcommodator- on sil.rad_sf -adcommoda-
2016-01-11 14:06:08 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adcommoda-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -tor-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -tor- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -adcommoda- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -3- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommoda- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommoda-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommoda- on sil.radical -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommoda- on sil.radical -adcommoda-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommoda- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommoda-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommoda',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommoda',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommoda- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommoda on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommoda on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommoda- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommoda', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommoda' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommoda', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommoda' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommoda-
2016-01-11 14:06:08 DEBUG InputFunctions:763 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adcommoda-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommoda',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommoda',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:768 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:777 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-11 14:06:08 DEBUG InputFunctions:780 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-11 14:06:08 DEBUG InputFunctions:785 - OPERATIONDEBUG SETTING setFirstTabSm in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:787 - OPERATIONDEBUG SETTING status in travellingtables to 21 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:824 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -0- si -0- sf -3- sm_1 -1- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20-11-20-11-21-11-20-11-21--
2016-01-11 14:06:08 DEBUG InputFunctions:829 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:838 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:842 - CALLING smric in  Sillib.java with rad_sf -adcommoda- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:269 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:285 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf a on sil.rad_sm adcommoda for mode -0-
2016-01-11 14:06:08 DEBUG Sillib:297 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf adcommod on sil.rad_sm adcommoda for mode -0-
2016-01-11 14:06:08 DEBUG Sillib:302 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:849 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:851 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:861 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:863 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -a-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -tor-
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:869 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:875 - CALLING analysis (2) with sm1 -1- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommod- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommod- on sil.radical -adcommoda-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommod- on sil.radical -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:885 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:890 - OPERATIONDEBUG SETTING setSecondListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:899 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-11 14:06:08 DEBUG InputFunctions:902 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-11 14:06:08 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -4- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-4-5-20-11-20-11-20-11-21-11-20-11-21-11-20--
2016-01-11 14:06:08 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adcommodator- and spf1 -0- and spf2 -0 and si-0- and sf -4-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 8 of sil.rad_si -adcommodator- on sil.rad_sf --
2016-01-11 14:06:08 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 8 of sil.rad_si -adcommodator- on sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-11 14:06:08 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -ator-
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-11 14:06:08 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -ator- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -adcommod- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -4- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adcommod- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-11 14:06:08 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adcommod- on sil.radical -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adcommod- on sil.radical -adcommod-
2016-01-11 14:06:08 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adcommod',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-11 14:06:08 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:290 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -1- ADDITIONAL LOOP SAI -1-
2016-01-11 14:06:08 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:311 - OPERATIONDEBUG SETTING setTabSAI in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:313 - OPERATIONDEBUG SETTING status in travellingtables to 11 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:321 - CALLING sairic radical=-adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG Sillib:220 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-11 14:06:08 DEBUG Sillib:225 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:227 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt 
2016-01-11 14:06:08 DEBUG Sillib:229 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt 
2016-01-11 14:06:08 DEBUG Sillib:247 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adcommod on sil.rad_sai adc
2016-01-11 14:06:08 DEBUG Sillib:249 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d01- on sil.ind_alt d01
2016-01-11 14:06:08 DEBUG Sillib:251 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -acc- on sil.rad_alt accadc
2016-01-11 14:06:08 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -accadc- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('accadc', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='accadc' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:335 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-11 14:06:08 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -1- les -0- isanySAI -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-11 14:06:08 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adcommod- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adcommod', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adcommod' 
2016-01-11 14:06:08 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-11 14:06:08 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-11 14:06:08 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adcommod-
2016-01-11 14:06:08 DEBUG InputFunctions:763 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adcommod-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-11 14:06:08 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adcommod',LENGTH(segment))
2016-01-11 14:06:08 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-11 14:06:08 DEBUG InputFunctions:768 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-11 14:06:08 DEBUG InputFunctions:777 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-11 14:06:08 DEBUG InputFunctions:780 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
Input wordform : -adcommodator-
Analyzed wordform : -adcommodator-
Number of Analyses : -0-

This is the end my friend

2016-01-11 14:06:08 DEBUG Lib:128 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-11 14:06:08 DEBUG Lib:134 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-11 14:06:08 DEBUG Lib:150 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-11 14:06:08 DEBUG Interact:131 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java

>type the WORD-FORM you wish to analyze. end to exit
