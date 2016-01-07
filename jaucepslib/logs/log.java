2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -qu-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -a-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -ecumque-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -5- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:874 - CALLING analysis (2) with sm1 -1- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qu- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qu- on sil.radical -qua-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qu- on sil.radical -qu-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qu
AAAAAA i
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) --  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:42 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) --  EXIT 1 IF1-ELSE2
2016-01-05 19:30:42 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: --  EXIT TRUE -CONTINUE-
2016-01-05 19:30:42 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:722 - DEEPFLOW ****CHECKED isanysm1 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:726 - CALLING compsm1 with parameters getSPF: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:595 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:42 DEBUG Comparator:619 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 areavs_smv != + and areavs.codles -i- OK
2016-01-05 19:30:42 DEBUG Comparator:629 - CALLING getSF_cod_set with condition -( ( comp_cod_prec='i' ) AND ( pm!='+' ))- getSF -ecumque- getSm_1 -a-, getSm_2 -- and mode -1- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:42 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -( ( comp_cod_prec='i' ) AND ( pm!='+' ))- getSF -ecumque- and mode -1-
2016-01-05 19:30:42 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='ecumque') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )))
2016-01-05 19:30:42 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='ecumque') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )))
2016-01-05 19:30:42 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:42 DEBUG Comparator:634 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -1-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:42 DEBUG InputFunctions:882 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:887 - OPERATIONDEBUG SETTING setSecondListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:896 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:899 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-05 19:30:42 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -4- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20--
2016-01-05 19:30:42 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecumque- and spf1 -0- and spf2 -0 and si-0- and sf -4-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 2 of sil.rad_si -quaecumque- on sil.rad_sf --
2016-01-05 19:30:42 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 2 of sil.rad_si -quaecumque- on sil.rad_sf -qu-
2016-01-05 19:30:42 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -qu-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -aecumque-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -aecumque- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -qu- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -4- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qu- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qu- on sil.radical -qu-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qu- on sil.radical -qu-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qu
AAAAAA i
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) --  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:42 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) --  EXIT 1 IF1-ELSE2
2016-01-05 19:30:42 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: --  EXIT TRUE -CONTINUE-
2016-01-05 19:30:42 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:42 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:42 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='i')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='i')- getSF -aecumque- and mode -0-
2016-01-05 19:30:42 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='aecumque') AND ((comp_cod='i'))
2016-01-05 19:30:42 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='aecumque') AND ((comp_cod='i'))
2016-01-05 19:30:42 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:42 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -1-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:42 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:42 DEBUG InputFunctions:384 - OPERATIONDEBUG SETTING setSecondTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:386 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -0- spf2 -1- si -1- sf -5- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2--
2016-01-05 19:30:42 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -quaecumque- and spf1 -0- and spf2 -1. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:118 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:123 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe quaecumque on sil.rad_spf 
2016-01-05 19:30:42 DEBUG Sillib:130 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe quaecumque on sil.rad_spf quaecum
2016-01-05 19:30:42 DEBUG Sillib:135 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -qu-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value -aecumque-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:484 - OPERATIONDEBUG SETTING setListOfTabSi in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-05 19:30:42 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-05 19:30:42 DEBUG InputFunctions:502 - OPERATIONDEBUG SETTING setTabSI in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:504 - OPERATIONDEBUG SETTING status in travellingtables to 3 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -0- spf2 -1- si -1- sf -5- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3--
2016-01-05 19:30:42 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -quaecum- and spf1 -0- and spf2 -1 and si-1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:189 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:193 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 7 of sil.rad_spf quaecum on sil.rad_si quaecum
2016-01-05 19:30:42 DEBUG Sillib:200 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 7 of sil.rad_spf quaecum on sil.rad_si quaecum
2016-01-05 19:30:42 DEBUG Sillib:204 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -quaecum-
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -1- with value -quaecum-
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:614 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: quaecum
2016-01-05 19:30:42 DEBUG InputFunctions:1051 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecum
2016-01-05 19:30:42 DEBUG InputFunctions:1056 - DEEPFLOW ****COPYING rad_si (str) quaecum on sil.radical qu
2016-01-05 19:30:42 DEBUG InputFunctions:1058 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1060 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1069 - DEEPFLOW ****COPIED rad_si (str) quaecum on sil.radical quaecum
2016-01-05 19:30:42 DEBUG InputFunctions:1071 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1073 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1080 - CALLING getLEset with parameters rad_si: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:42 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:42 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecum'
2016-01-05 19:30:42 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecum'
2016-01-05 19:30:42 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:1086 - OPERATIONDEBUG SETTING setListOfTabLE in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-05 19:30:42 DEBUG InputFunctions:1094 - CALLING getLEset with parameters rad_si: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:42 DEBUG InputFunctions:1098 - ****VALUES of getListOfTabLE  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:1101 - ****VALUES of getListOfTabLE is -0-  LOOP ON TABLE -0-
2016-01-05 19:30:42 DEBUG InputFunctions:1238 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecum
2016-01-05 19:30:42 DEBUG InputFunctions:626 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:42 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:631 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:640 - ****VALUES of getListOfTabSF  -3-
2016-01-05 19:30:42 DEBUG InputFunctions:643 - ****VALUES of getListOfTabSF is -3- ADDITIONAL LOOP SF -3-
2016-01-05 19:30:42 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -1- si -1- sf -5- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20--
2016-01-05 19:30:42 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -0- and spf2 -1 and si-1- and sf -5-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:42 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -quaecum- on sil.rad_sf -quaecum-
2016-01-05 19:30:42 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaecum-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaecum- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -5- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaecum- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecum-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaecum- on sil.radical -quaecum-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaecum- on sil.radical -quaecum-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecum' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecum' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecum-
2016-01-05 19:30:42 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:42 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -1- si -1- sf -6- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20--
2016-01-05 19:30:42 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -0- and spf2 -1 and si-1- and sf -6-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:42 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -quaecum- on sil.rad_sf -quaecu-
2016-01-05 19:30:42 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaecu-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -m-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -m- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaecu- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -6- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaecu- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecu-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaecu- on sil.radical -quaecum-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaecu- on sil.radical -quaecu-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaecu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaecu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaecu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecu' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecu-
2016-01-05 19:30:42 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaecu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:42 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -1- si -1- sf -7- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20--
2016-01-05 19:30:42 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -0- and spf2 -1 and si-1- and sf -7-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:42 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -quaecum- on sil.rad_sf -quaec-
2016-01-05 19:30:42 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaec-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -um-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -que-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -um- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaec- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -7- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaec- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaec-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaec- on sil.radical -quaecu-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaec- on sil.radical -quaec-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaec- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaec-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaec- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaec', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaec' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaec', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaec' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaec-
2016-01-05 19:30:42 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaec-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:42 DEBUG InputFunctions:384 - OPERATIONDEBUG SETTING setSecondTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:386 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -0- spf2 -2- si -2- sf -8- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2--
2016-01-05 19:30:42 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -quaecumque- and spf1 -0- and spf2 -2. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:118 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:123 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 4 of sil.rad_spfe quaecumque on sil.rad_spf 
2016-01-05 19:30:42 DEBUG Sillib:130 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 4 of sil.rad_spfe quaecumque on sil.rad_spf quae
2016-01-05 19:30:42 DEBUG Sillib:135 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -quaec-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value -um-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value -cumque-
2016-01-05 19:30:42 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -quae-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quae',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quae',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:484 - OPERATIONDEBUG SETTING setListOfTabSi in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-05 19:30:42 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-05 19:30:42 DEBUG InputFunctions:502 - OPERATIONDEBUG SETTING setTabSI in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:504 - OPERATIONDEBUG SETTING status in travellingtables to 3 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -0- spf2 -2- si -2- sf -8- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3--
2016-01-05 19:30:42 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -quae- and spf1 -0- and spf2 -2 and si-2-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:189 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:193 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 4 of sil.rad_spf quae on sil.rad_si quae
2016-01-05 19:30:42 DEBUG Sillib:200 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 4 of sil.rad_spf quae on sil.rad_si quae
2016-01-05 19:30:42 DEBUG Sillib:204 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -quae-
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value -cumque-
2016-01-05 19:30:42 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -1- with value -quae-
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -5- with value -cumque-
2016-01-05 19:30:42 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:614 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: quae
2016-01-05 19:30:42 DEBUG InputFunctions:1051 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quae
2016-01-05 19:30:42 DEBUG InputFunctions:1056 - DEEPFLOW ****COPYING rad_si (str) quae on sil.radical quaec
2016-01-05 19:30:42 DEBUG InputFunctions:1058 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1060 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1069 - DEEPFLOW ****COPIED rad_si (str) quae on sil.radical quae
2016-01-05 19:30:42 DEBUG InputFunctions:1071 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1073 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:42 DEBUG InputFunctions:1080 - CALLING getLEset with parameters rad_si: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:42 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:42 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quae'
2016-01-05 19:30:42 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quae'
2016-01-05 19:30:42 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:1086 - OPERATIONDEBUG SETTING setListOfTabLE in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-05 19:30:42 DEBUG InputFunctions:1094 - CALLING getLEset with parameters rad_si: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:42 DEBUG InputFunctions:1098 - ****VALUES of getListOfTabLE  -0-
2016-01-05 19:30:42 DEBUG InputFunctions:1101 - ****VALUES of getListOfTabLE is -0-  LOOP ON TABLE -0-
2016-01-05 19:30:42 DEBUG InputFunctions:1238 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quae
2016-01-05 19:30:42 DEBUG InputFunctions:626 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -quae-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:42 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quae',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quae',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:42 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:631 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:640 - ****VALUES of getListOfTabSF  -3-
2016-01-05 19:30:42 DEBUG InputFunctions:643 - ****VALUES of getListOfTabSF is -3- ADDITIONAL LOOP SF -3-
2016-01-05 19:30:42 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -2- si -2- sf -8- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20--
2016-01-05 19:30:42 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quae- and spf1 -0- and spf2 -2 and si-2- and sf -8-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 4 of sil.rad_si -quae- on sil.rad_sf --
2016-01-05 19:30:42 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 4 of sil.rad_si -quae- on sil.rad_sf -quae-
2016-01-05 19:30:42 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quae-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -cumque-
2016-01-05 19:30:42 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quae- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -8- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quae- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quae-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quae- on sil.radical -quae-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quae- on sil.radical -quae-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quae-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quae',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quae',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:42 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quae', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quae' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quae', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quae' 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA fe
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:42 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:42 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:42 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:42 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:42 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='fe')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='fe')- getSF -- and mode -0-
2016-01-05 19:30:42 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='fe'))
2016-01-05 19:30:42 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='fe'))
2016-01-05 19:30:42 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:42 DEBUG Comparator:1095 - CALLING areacp with tabLes with pr_key: -49777-  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Comparator:1101 - OPERATIONDEBUG SETTING status in travellingtables to 14 in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG Comparator:1103 - OPERATIONDEBUG SETTING setCopiedLessario in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG Comparator:375 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/areacp in Comparator.java with s.pr_key -49777-
2016-01-05 19:30:42 DEBUG Comparator:408 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/areacp in Comparator.java with s.pr_key -49777-
2016-01-05 19:30:42 DEBUG Comparator:1114 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.les -quae- on sil.lemma -null-
2016-01-05 19:30:42 DEBUG Comparator:1116 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles -fe- on sil.codice -null-
2016-01-05 19:30:42 DEBUG Comparator:1125 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.les -quae- on sil.lemma -quae-
2016-01-05 19:30:42 DEBUG Comparator:1127 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles -fe- on sil.codice -fe-
2016-01-05 19:30:42 DEBUG Comparator:1132 - CALLING lemtiz with tabLes with pr_key: -49777- and IPOLEMMA  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Sillib:334 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz in it.cnr.ilc.jauceps.lib.impl.Sillib with s.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:339 - CALLING getFEset les_id=-49777- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG TabFEQuery:80 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:90 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java with query: SELECT  les_id, add_lem ,enc FROM forme_ecc WHERE (les_id='49777') LIMIT 1
2016-01-05 19:30:42 DEBUG TabFEQuery:107 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java with  query: SELECT  les_id, add_lem ,enc FROM forme_ecc WHERE (les_id='49777') LIMIT 1
2016-01-05 19:30:42 DEBUG TabFEQuery:111 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:359 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.codles==fe -fe- a OK
2016-01-05 19:30:42 DEBUG Sillib:361 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE(areal->les_id) -49777- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:366 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE(areal->les_id) -49777- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:376 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE -- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:424 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem =='-' or '='  -quis-  KO
2016-01-05 19:30:42 DEBUG Sillib:426 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem -quis- to sil.lemma -quae-
2016-01-05 19:30:42 DEBUG Sillib:432 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem -quis- to sil.lemma -quis-
2016-01-05 19:30:42 DEBUG Sillib:438 - ****VALUES of sil.lemma -quis- in routine -it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz-
2016-01-05 19:30:42 DEBUG Sillib:444 - CALLING set_codlem3eagles in  Sillib.java. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:664 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles in Sillib.java with s.pr_key -49777- and codice --
2016-01-05 19:30:42 DEBUG Sillib:669 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem !=''  OK IF1
2016-01-05 19:30:42 DEBUG Sillib:671 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem -pr- to sil.codice -fe-
2016-01-05 19:30:42 DEBUG Sillib:677 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem -pr- to sil.codice -pr-
2016-01-05 19:30:42 DEBUG Sillib:682 - CALLING get3EaglesSet cod2search=-- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles and BY_CODLEM
2016-01-05 19:30:42 DEBUG Sillib:687 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles eagles codes  to sil.eagles codes
2016-01-05 19:30:42 DEBUG TabEaglesQuery:69 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java
2016-01-05 19:30:42 DEBUG TabEaglesQuery:90 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java with query: SELECT  codlem,c01, c02 ,c03 FROM eagles WHERE (codlem='') LIMIT 1
2016-01-05 19:30:42 DEBUG TabEaglesQuery:146 - DEEPFLOW 0 record in it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet-(loopOverRS)- in TabEaglesQuery.java: set codes to '-'
2016-01-05 19:30:42 DEBUG TabEaglesQuery:109 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java with  query: SELECT  codlem,c01, c02 ,c03 FROM eagles WHERE (codlem='') LIMIT 1
2016-01-05 19:30:42 DEBUG TabEaglesQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java
2016-01-05 19:30:42 DEBUG Sillib:706 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles eagles codes  to sil.eagles codes
2016-01-05 19:30:42 DEBUG Sillib:762 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles in Sillib.java with s.pr_key -49777- and codice --
2016-01-05 19:30:42 DEBUG Sillib:455 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from set_codlem3eagles in lemtiz in -it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz-
2016-01-05 19:30:42 DEBUG Sillib:464 - CALLING pushLemma in  -it.cnr.ilc.jauceps.lib.impl.Sillib- (IFSB_2). CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:907 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma in -it.cnr.ilc.jauceps.lib.impl.Sillib- with s.pr_key -49777- and lem_type -IPOLEMMA-
2016-01-05 19:30:42 DEBUG Sillib:919 - DEEPFLOW ****COMPARING areavs.codles -fe- -> IF1
2016-01-05 19:30:42 DEBUG Sillib:1076 - CALLING get3Code_set_fe in TabFEQuery.java with parameter: areavs pk -49777-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:125 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:135 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java with query: SELECT  c01, c02, c03,CONCAT(c01, c02 ,c03) as codes FROM forme_ecc WHERE (les_id=49777) 
2016-01-05 19:30:42 DEBUG TabFEQuery:152 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java with  query: SELECT  c01, c02, c03,CONCAT(c01, c02 ,c03) as codes FROM forme_ecc WHERE (les_id=49777) 
2016-01-05 19:30:42 DEBUG TabFEQuery:156 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1082 - OPERATIONDEBUG SETTING setListOfTabFECodSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -null- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -null- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -null- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -null- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -null- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -null- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -null- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -49777- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=49777) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=49777) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q0198- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -quis- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -49777- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q0198- on curLemma.n_id -q0198- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -quis- on curLemma.lemma -quis- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -49777- on curLemma.les_id -49777- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[4, -, P4-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -49777- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=49777) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=49777) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q0198- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -quis- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -49777- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q0198- on curLemma.n_id -q0198- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -quis- on curLemma.lemma -quis- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -49777- on curLemma.les_id -49777- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[4, -, P4-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:478 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz strcmp(areal->codles, fe) THEY ARE EQUAL OK IFSB_3
2016-01-05 19:30:42 DEBUG Sillib:482 - CALLING getAddLem in  Sillib.java. SECOND BLOCK IFSB_3 witn les_id -49777- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:484 - CALLING getLESset in  Sillib.java. SECOND BLOCK IFSB_3 witn addLem -null- and BY_KEY CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:522 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz in Sillib.java with s.pr_key -49777- II BLOCK IFSB_1
2016-01-05 19:30:42 DEBUG Comparator:1142 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf lemtiz -true- TRUE
2016-01-05 19:30:42 DEBUG Comparator:1146 - CALLING lemtiz with tabLes with pr_key: -49777- and IPERLEMMA  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Sillib:785 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemv in Sillib.java with s.pr_key -49777-
2016-01-05 19:30:42 DEBUG Sillib:799 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemv areal.clem==v Or k -- KO
2016-01-05 19:30:42 DEBUG Sillib:806 - CALLING getLESset with parameters n_id: -q0198- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemv 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q0198' AND clem='v'
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q0198' AND clem='v'
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG Sillib:811 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.Sillib/lemv-
2016-01-05 19:30:42 DEBUG Sillib:857 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemv in Sillib.java with s.pr_key -49777-
2016-01-05 19:30:42 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p2
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p3
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p5
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p6
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p7
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p8
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p18
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA fe
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:42 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:42 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:42 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:42 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:42 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='fe')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='fe')- getSF -- and mode -0-
2016-01-05 19:30:42 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='fe'))
2016-01-05 19:30:42 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='fe'))
2016-01-05 19:30:42 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:42 DEBUG Comparator:1095 - CALLING areacp with tabLes with pr_key: -64712-  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Comparator:1101 - OPERATIONDEBUG SETTING status in travellingtables to 14 in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG Comparator:1103 - OPERATIONDEBUG SETTING setCopiedLessario in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:42 DEBUG Comparator:375 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/areacp in Comparator.java with s.pr_key -64712-
2016-01-05 19:30:42 DEBUG Comparator:408 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/areacp in Comparator.java with s.pr_key -64712-
2016-01-05 19:30:42 DEBUG Comparator:1114 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.les -quae- on sil.lemma -quis-
2016-01-05 19:30:42 DEBUG Comparator:1116 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles -fe- on sil.codice -pr-
2016-01-05 19:30:42 DEBUG Comparator:1125 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.les -quae- on sil.lemma -quae-
2016-01-05 19:30:42 DEBUG Comparator:1127 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles -fe- on sil.codice -fe-
2016-01-05 19:30:42 DEBUG Comparator:1132 - CALLING lemtiz with tabLes with pr_key: -64712- and IPOLEMMA  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Sillib:334 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz in it.cnr.ilc.jauceps.lib.impl.Sillib with s.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:339 - CALLING getFEset les_id=-64712- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG TabFEQuery:80 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:90 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java with query: SELECT  les_id, add_lem ,enc FROM forme_ecc WHERE (les_id='64712') LIMIT 1
2016-01-05 19:30:42 DEBUG TabFEQuery:107 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java with  query: SELECT  les_id, add_lem ,enc FROM forme_ecc WHERE (les_id='64712') LIMIT 1
2016-01-05 19:30:42 DEBUG TabFEQuery:111 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getFEset in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:359 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.codles==fe -fe- a OK
2016-01-05 19:30:42 DEBUG Sillib:361 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE(areal->les_id) -64712- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:366 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE(areal->les_id) -64712- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:376 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz getEncFE -- to sil.segment[6]
2016-01-05 19:30:42 DEBUG Sillib:424 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem =='-' or '='  -qui-  KO
2016-01-05 19:30:42 DEBUG Sillib:426 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem -qui- to sil.lemma -quae-
2016-01-05 19:30:42 DEBUG Sillib:432 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz areal.lem -qui- to sil.lemma -qui-
2016-01-05 19:30:42 DEBUG Sillib:438 - ****VALUES of sil.lemma -qui- in routine -it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz-
2016-01-05 19:30:42 DEBUG Sillib:444 - CALLING set_codlem3eagles in  Sillib.java. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:664 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles in Sillib.java with s.pr_key -64712- and codice --
2016-01-05 19:30:42 DEBUG Sillib:669 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem !=''  OK IF1
2016-01-05 19:30:42 DEBUG Sillib:671 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem -pr- to sil.codice -fe-
2016-01-05 19:30:42 DEBUG Sillib:677 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles areal.codlem -pr- to sil.codice -pr-
2016-01-05 19:30:42 DEBUG Sillib:682 - CALLING get3EaglesSet cod2search=-- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles and BY_CODLEM
2016-01-05 19:30:42 DEBUG Sillib:687 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles eagles codes  to sil.eagles codes
2016-01-05 19:30:42 DEBUG TabEaglesQuery:69 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java
2016-01-05 19:30:42 DEBUG TabEaglesQuery:90 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java with query: SELECT  codlem,c01, c02 ,c03 FROM eagles WHERE (codlem='') LIMIT 1
2016-01-05 19:30:42 DEBUG TabEaglesQuery:146 - DEEPFLOW 0 record in it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet-(loopOverRS)- in TabEaglesQuery.java: set codes to '-'
2016-01-05 19:30:42 DEBUG TabEaglesQuery:109 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java with  query: SELECT  codlem,c01, c02 ,c03 FROM eagles WHERE (codlem='') LIMIT 1
2016-01-05 19:30:42 DEBUG TabEaglesQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabEaglesQuery/get3EaglesSet in TabEaglesQuery.java
2016-01-05 19:30:42 DEBUG Sillib:706 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles eagles codes  to sil.eagles codes
2016-01-05 19:30:42 DEBUG Sillib:762 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/set_codlem3eagles in Sillib.java with s.pr_key -64712- and codice --
2016-01-05 19:30:42 DEBUG Sillib:455 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from set_codlem3eagles in lemtiz in -it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz-
2016-01-05 19:30:42 DEBUG Sillib:464 - CALLING pushLemma in  -it.cnr.ilc.jauceps.lib.impl.Sillib- (IFSB_2). CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:907 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma in -it.cnr.ilc.jauceps.lib.impl.Sillib- with s.pr_key -64712- and lem_type -IPOLEMMA-
2016-01-05 19:30:42 DEBUG Sillib:919 - DEEPFLOW ****COMPARING areavs.codles -fe- -> IF1
2016-01-05 19:30:42 DEBUG Sillib:1076 - CALLING get3Code_set_fe in TabFEQuery.java with parameter: areavs pk -64712-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:125 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:135 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java with query: SELECT  c01, c02, c03,CONCAT(c01, c02 ,c03) as codes FROM forme_ecc WHERE (les_id=64712) 
2016-01-05 19:30:42 DEBUG TabFEQuery:152 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java with  query: SELECT  c01, c02, c03,CONCAT(c01, c02 ,c03) as codes FROM forme_ecc WHERE (les_id=64712) 
2016-01-05 19:30:42 DEBUG TabFEQuery:156 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/get3Code_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1082 - OPERATIONDEBUG SETTING setListOfTabFECodSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -64712- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q9410- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -qui- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -64712- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q9410- on curLemma.n_id -q9410- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -qui- on curLemma.lemma -qui- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -64712- on curLemma.les_id -64712- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[7, -, P7-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -64712- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q9410- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -qui- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -64712- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q9410- on curLemma.n_id -q9410- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -qui- on curLemma.lemma -qui- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -64712- on curLemma.les_id -64712- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[7, -, P7-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -64712- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q9410- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -qui- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -64712- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q9410- on curLemma.n_id -q9410- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -qui- on curLemma.lemma -qui- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -64712- on curLemma.les_id -64712- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[7, -, P7-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1090 - OPERATIONDEBUG SETTING setTabSFCodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1092 - OPERATIONDEBUG SETTING status in travellingtables to 10 in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1101 - CALLING newAnalysis. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma  with IPOLEMMA and ELSE IF1 

2016-01-05 19:30:42 DEBUG RunAnalyses:126 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -quae- to curAnalysis.segment -quae- at index -1-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -2-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -3-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -4-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -cumque- to curAnalysis.segment -cumque- at index -5-
2016-01-05 19:30:42 DEBUG RunAnalyses:138 - DEEPFLOW ****COPYING sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:143 - DEEPFLOW ****COPIED sil.segment -- to curAnalysis.segment -- at index -6-
2016-01-05 19:30:42 DEBUG RunAnalyses:150 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:155 - DEEPFLOW ****ASSIGNING sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:157 - DEEPFLOW ****ASSIGNING 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:164 - DEEPFLOW ****ASSIGNED sil.part -0- to curAnalysis.part -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:166 - DEEPFLOW ****ASSIGNED 0 to curAnalysis.n_cod_morf
2016-01-05 19:30:42 DEBUG RunAnalyses:178 - CALLING initLemmas in  RunAnalyses.java. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/newAnalysis
2016-01-05 19:30:42 DEBUG RunAnalyses:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in RunAnalyses.java
2016-01-05 19:30:42 DEBUG RunAnalyses:200 - DEEPFLOW ****ASSIGNING 0  to numL
2016-01-05 19:30:42 DEBUG RunAnalyses:207 - DEEPFLOW ****ASSIGNED 0  to numL -0-
2016-01-05 19:30:42 DEBUG RunAnalyses:211 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initLemmas in it.cnr.ilc.jauceps.lib.impl.RunAnalyses
2016-01-05 19:30:42 DEBUG Sillib:1116 - CALLING getCod_morf_set_fe in TabFEQuery.java with parameter: areavs pk -64712- and tabfe3codes.codes -P-. CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma
2016-01-05 19:30:42 DEBUG TabFEQuery:173 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG TabFEQuery:183 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:200 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java with  query: SELECT  c04, c05, c06,c07,c08,c09,c10, CONCAT(c04, c05 ,c06,c07, c08 ,c09,c10) as codes FROM forme_ecc WHERE (les_id=64712) AND CONCAT(c01,c02,c03)='P'
2016-01-05 19:30:42 DEBUG TabFEQuery:204 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabFEQuery/getCod_morf_set_fe in TabFEQuery.java
2016-01-05 19:30:42 DEBUG Sillib:1122 - OPERATIONDEBUG SETTING setListOfTabFECodMorSet in -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-
2016-01-05 19:30:42 DEBUG Sillib:1160 - CALLING newLemma in Sillib.java with tabFe3CodSet NOT NULL (codes -it.cnr.ilc.jauceps.lib.impl.Sillib/pushLemma-) and lem_type -P-  CALLER IPOLEMMA
2016-01-05 19:30:42 DEBUG Sillib:1327 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1332 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:1338 - DEEPFLOW ****COPYING areal.n_id -q9410- on curLemma.n_id -null- 
2016-01-05 19:30:42 DEBUG Sillib:1340 - DEEPFLOW ****COPYING areal.gen -- on curLemma.gen -null- 
2016-01-05 19:30:42 DEBUG Sillib:1342 - DEEPFLOW ****COPYING areal.codles -fe- on curLemma.codles -null- 
2016-01-05 19:30:42 DEBUG Sillib:1344 - DEEPFLOW ****COPYING sil.lemma -qui- on curLemma.out_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1346 - DEEPFLOW ****COPYING sil.codice -pr- on curLemma.cod_lemma -null- 
2016-01-05 19:30:42 DEBUG Sillib:1348 - DEEPFLOW ****COPYING areal.les_id -64712- on curLemma.les_id -0- 
2016-01-05 19:30:42 DEBUG Sillib:1358 - DEEPFLOW ****COPYING threecod_fe -P- on curLemma.Cod_morf_1_3 -null- 
2016-01-05 19:30:42 DEBUG Sillib:1379 - DEEPFLOW ****COPIED areal.n_id -q9410- on curLemma.n_id -q9410- 
2016-01-05 19:30:42 DEBUG Sillib:1381 - DEEPFLOW ****COPIED areal.gen -- on curLemma.gen -- 
2016-01-05 19:30:42 DEBUG Sillib:1383 - DEEPFLOW ****COPIED areal.codles -fe- on curLemma.codles -fe- 
2016-01-05 19:30:42 DEBUG Sillib:1385 - DEEPFLOW ****COPIED sil.lemma -qui- on curLemma.lemma -qui- 
2016-01-05 19:30:42 DEBUG Sillib:1387 - DEEPFLOW ****COPIED sil.codice -pr- on curLemma.cod_lemma -pr- 
2016-01-05 19:30:42 DEBUG Sillib:1389 - DEEPFLOW ****COPIED areal.les_id -64712- on curLemma.les_id -64712- 
2016-01-05 19:30:42 DEBUG Sillib:1393 - DEEPFLOW ****COPIED sil.3eagles -[-, -, -]- on curLemma.Cod_morf_1_3 -[7, -, P7-]- 
2016-01-05 19:30:42 DEBUG Sillib:1405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/newLemma in Sillib.java with a.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:478 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz strcmp(areal->codles, fe) THEY ARE EQUAL OK IFSB_3
2016-01-05 19:30:42 DEBUG Sillib:482 - CALLING getAddLem in  Sillib.java. SECOND BLOCK IFSB_3 witn les_id -64712- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:484 - CALLING getLESset in  Sillib.java. SECOND BLOCK IFSB_3 witn addLem -null- and BY_KEY CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz
2016-01-05 19:30:42 DEBUG Sillib:522 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemtiz in Sillib.java with s.pr_key -64712- II BLOCK IFSB_1
2016-01-05 19:30:42 DEBUG Comparator:1142 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf lemtiz -true- TRUE
2016-01-05 19:30:42 DEBUG Comparator:1146 - CALLING lemtiz with tabLes with pr_key: -64712- and IPERLEMMA  CALLER it.cnr.ilc.jauceps.lib.impl.Comparator/compsf 
2016-01-05 19:30:42 DEBUG Sillib:785 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemv in Sillib.java with s.pr_key -64712-
2016-01-05 19:30:42 DEBUG Sillib:799 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Sillib/lemv areal.clem==v Or k -- KO
2016-01-05 19:30:42 DEBUG Sillib:806 - CALLING getLESset with parameters n_id: -q9410- CALLER it.cnr.ilc.jauceps.lib.impl.Sillib/lemv 
2016-01-05 19:30:42 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q9410' AND clem='v'
2016-01-05 19:30:42 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q9410' AND clem='v'
2016-01-05 19:30:42 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:42 DEBUG Sillib:811 - OPERATIONDEBUG SETTING setListOfTabLessario in -it.cnr.ilc.jauceps.lib.impl.Sillib/lemv-
2016-01-05 19:30:42 DEBUG Sillib:857 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/lemv in Sillib.java with s.pr_key -64712-
2016-01-05 19:30:42 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:42 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p18
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:42 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -quae- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:42 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter quae
AAAAAA p9
2016-01-05 19:30:42 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:42 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:42 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:42 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:42 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:42 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:42 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:42 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:42 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:42 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:42 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:42 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:42 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -11-  isanyLes -false-
2016-01-05 19:30:42 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quae-
2016-01-05 19:30:42 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quae-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quae',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quae',LENGTH(segment))
2016-01-05 19:30:42 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:42 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-05 19:30:42 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-05 19:30:42 DEBUG InputFunctions:784 - OPERATIONDEBUG SETTING setFirstTabSm in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:786 - OPERATIONDEBUG SETTING status in travellingtables to 21 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:42 DEBUG InputFunctions:823 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -2- si -2- sf -8- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21--
2016-01-05 19:30:42 DEBUG InputFunctions:828 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:837 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:841 - CALLING smric in  Sillib.java with rad_sf -quae- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG Sillib:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
AAAAAA rad_sm -e- quae-
2016-01-05 19:30:42 DEBUG Sillib:284 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf e on sil.rad_sm quae for mode -0-
2016-01-05 19:30:42 DEBUG Sillib:296 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf qua on sil.rad_sm quae for mode -0-
2016-01-05 19:30:42 DEBUG Sillib:301 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-05 19:30:42 DEBUG InputFunctions:848 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:850 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:860 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:862 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -qua-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -e-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -4- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -5- with value -cumque-
2016-01-05 19:30:42 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-05 19:30:42 DEBUG InputFunctions:874 - CALLING analysis (2) with sm1 -2- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qua- FROM LOOP getSFset
2016-01-05 19:30:42 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qua-
2016-01-05 19:30:42 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qua- on sil.radical -quae-
2016-01-05 19:30:42 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qua- on sil.radical -qua-
2016-01-05 19:30:42 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qua-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:42 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:42 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qua', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qua' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qua', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qua' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA fe
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:722 - DEEPFLOW ****CHECKED isanysm1 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:726 - CALLING compsm1 with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:595 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:43 DEBUG Comparator:619 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 areavs_smv != + and areavs.codles -fe- OK
2016-01-05 19:30:43 DEBUG Comparator:629 - CALLING getSF_cod_set with condition -( ( comp_cod_prec='fe' ) AND ( pm!='+' ))- getSF -- getSm_1 -e-, getSm_2 -- and mode -1- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -( ( comp_cod_prec='fe' ) AND ( pm!='+' ))- getSF -- and mode -1-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='fe' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='fe' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:634 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p2
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p3
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p4
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p5
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p6
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p7
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p8
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p18
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA fe
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:722 - DEEPFLOW ****CHECKED isanysm1 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:726 - CALLING compsm1 with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:595 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:43 DEBUG Comparator:619 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 areavs_smv != + and areavs.codles -fe- OK
2016-01-05 19:30:43 DEBUG Comparator:629 - CALLING getSF_cod_set with condition -( ( comp_cod_prec='fe' ) AND ( pm!='+' ))- getSF -- getSm_1 -e-, getSm_2 -- and mode -1- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -( ( comp_cod_prec='fe' ) AND ( pm!='+' ))- getSF -- and mode -1-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='fe' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='fe' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:634 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p18
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p9
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -12-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qua-
2016-01-05 19:30:43 DEBUG InputFunctions:882 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -qua-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:887 - OPERATIONDEBUG SETTING setSecondListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:896 - ****VALUES of getSecondListOfTabSM  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:899 - ****VALUES of getSecondListOfTabSM is -1- LOOP SM2 -1-
2016-01-05 19:30:43 DEBUG InputFunctions:904 - OPERATIONDEBUG SETTING setSecondTabSm in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:906 - OPERATIONDEBUG SETTING status in travellingtables to 22 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:939 - DEEPFLOW LOOP SM2. Counters spf1 -0- spf2 -2- si -2- sf -8- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -true- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22--
2016-01-05 19:30:43 DEBUG InputFunctions:943 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:952 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:956 - CALLING smric in  Sillib.java. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
AAAAAA rad_sm -a- qua-
2016-01-05 19:30:43 DEBUG Sillib:284 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf a on sil.rad_sm quae for mode -1-
2016-01-05 19:30:43 DEBUG Sillib:296 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf qu on sil.rad_sm quae for mode -1-
2016-01-05 19:30:43 DEBUG Sillib:301 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:963 - DEEPFLOW ****ASSIGNING getSm_2 to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:965 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:975 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:977 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -2- with value -a-
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -e-
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -5- with value -cumque-
2016-01-05 19:30:43 DEBUG InputFunctions:983 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:989 - CALLING analysis (3) with sm2 -0-in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qu- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qu- on sil.radical -qua-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qu- on sil.radical -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qu
AAAAAA i
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:698 - DEEPFLOW ****CHECKED isanysm2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:702 - CALLING compsm2 with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:446 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm2 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:43 DEBUG Comparator:470 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsm2 areavs_smv != + and areavs.codles -i- OK
2016-01-05 19:30:43 DEBUG Comparator:480 - CALLING getSF_cod_set with condition -( ( tabsm2.comp_cod_prec='i' ) AND ( tabsm2.pm!='+' ))- getSF -- getSm_1 -e-, getSm_2 -a- and mode -2- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm2-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -( ( tabsm2.comp_cod_prec='i' ) AND ( tabsm2.pm!='+' ))- getSF -- and mode -2-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod,TSM1.comp_cod_prec,TSM1.comp_cod_succ,tabsm2.comp_cod_prec,tabsm2.comp_cod_succ FROM tabsf,tabsm as tabsm2,tabsm as TSM1 WHERE (tabsf.segment='') AND (TSM1.segment='e') AND (tabsm2.segment='a') AND (tabsm2.comp_cod_succ=TSM1.comp_cod_prec) AND (TSM1.comp_cod_succ=IF( LEFT(TSM1.comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(TSM1.comp_cod_succ)), comp_cod ) ) AND (( ( tabsm2.comp_cod_prec='i' ) AND ( tabsm2.pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod,TSM1.comp_cod_prec,TSM1.comp_cod_succ,tabsm2.comp_cod_prec,tabsm2.comp_cod_succ FROM tabsf,tabsm as tabsm2,tabsm as TSM1 WHERE (tabsf.segment='') AND (TSM1.segment='e') AND (tabsm2.segment='a') AND (tabsm2.comp_cod_succ=TSM1.comp_cod_prec) AND (TSM1.comp_cod_succ=IF( LEFT(TSM1.comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(TSM1.comp_cod_succ)), comp_cod ) ) AND (( ( tabsm2.comp_cod_prec='i' ) AND ( tabsm2.pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:486 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm2-
2016-01-05 19:30:43 DEBUG Comparator:558 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm2 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -1-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -2- si -2- sf -9- sm_1 -3- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quae- and spf1 -0- and spf2 -2 and si-2- and sf -9-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 3 of sil.rad_si -quae- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 3 of sil.rad_si -quae- on sil.rad_sf -qua-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -qua-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -e-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -cumque-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -e- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -qua- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -9- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qua- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qua-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qua- on sil.radical -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qua- on sil.radical -qua-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qua-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qua', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qua' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qua', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qua' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA fe
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:43 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:43 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='fe')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='fe')- getSF -e- and mode -0-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='fe'))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='fe'))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p2
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p3
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p4
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p5
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p6
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p7
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p8
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p18
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA fe
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:43 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:43 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='fe')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='fe')- getSF -e- and mode -0-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='fe'))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='fe'))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p18
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qua- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qua
AAAAAA p9
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:291 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning OK
2016-01-05 19:30:43 DEBUG Comparator:297 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0  IF1-IF2
2016-01-05 19:30:43 DEBUG RunAnalyses:650 - DEEPFLOW ****CHECKED compspf in routine cumque in with parameters getSPF2: -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-  EXIT FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:655 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:657 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -12-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qua-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -qua-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-05 19:30:43 DEBUG InputFunctions:784 - OPERATIONDEBUG SETTING setFirstTabSm in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:786 - OPERATIONDEBUG SETTING status in travellingtables to 21 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:823 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -2- si -2- sf -9- sm_1 -3- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21--
2016-01-05 19:30:43 DEBUG InputFunctions:828 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:837 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:841 - CALLING smric in  Sillib.java with rad_sf -qua- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
AAAAAA rad_sm -a- qua-
2016-01-05 19:30:43 DEBUG Sillib:284 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf a on sil.rad_sm qua for mode -0-
2016-01-05 19:30:43 DEBUG Sillib:296 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf qu on sil.rad_sm qua for mode -0-
2016-01-05 19:30:43 DEBUG Sillib:301 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:848 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:850 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:860 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:862 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -a-
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -e-
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -5- with value -cumque-
2016-01-05 19:30:43 DEBUG InputFunctions:868 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:874 - CALLING analysis (2) with sm1 -3- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qu- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qu- on sil.radical -qua-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qu- on sil.radical -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qu
AAAAAA i
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:722 - DEEPFLOW ****CHECKED isanysm1 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:726 - CALLING compsm1 with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:595 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 in Sillib.java with parameters areavs_smv --
2016-01-05 19:30:43 DEBUG Comparator:619 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1 areavs_smv != + and areavs.codles -i- OK
2016-01-05 19:30:43 DEBUG Comparator:629 - CALLING getSF_cod_set with condition -( ( comp_cod_prec='i' ) AND ( pm!='+' ))- getSF -e- getSm_1 -a-, getSm_2 -a- and mode -1- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -( ( comp_cod_prec='i' ) AND ( pm!='+' ))- getSF -e- and mode -1-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='e') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='e') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:634 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.Comparator/compsm1-
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -1-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:882 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:887 - OPERATIONDEBUG SETTING setSecondListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:896 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:899 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -2- si -2- sf -10- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quae- and spf1 -0- and spf2 -2 and si-2- and sf -10-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 2 of sil.rad_si -quae- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 2 of sil.rad_si -quae- on sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -ae-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value -cumque-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -ae- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -qu- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -10- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -qu- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -qu- on sil.radical -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -qu- on sil.radical -qu-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('qu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='qu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:390 - OPERATIONDEBUG SETTING setTabLessario in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:392 - OPERATIONDEBUG SETTING status in travellingtables to 13 in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:400 - CALLING comp with parameters rad: -qu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG RunAnalyses:433 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter qu
AAAAAA i
2016-01-05 19:30:43 DEBUG RunAnalyses:509 - DEEPFLOW ****CHECKED sil.ind_alt -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NULL
2016-01-05 19:30:43 DEBUG RunAnalyses:516 - DEEPFLOW ****CHECKING getSI -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:567 - DEEPFLOW ****CHECKED tabSi.getSI() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:573 - DEEPFLOW ****CHECKING getSPF_1 -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:629 - DEEPFLOW ****CHECKED tabspf_1.getSPF() -- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS ''
2016-01-05 19:30:43 DEBUG RunAnalyses:635 - DEEPFLOW ****CHECKING isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp
2016-01-05 19:30:43 DEBUG RunAnalyses:641 - DEEPFLOW ****CHECKED isanyspf2 -true- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS TRUE
2016-01-05 19:30:43 DEBUG RunAnalyses:645 - CALLING compspf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:268 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 0
2016-01-05 19:30:43 DEBUG Comparator:272 - DEEPFLOW ****ASSIGNING in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0 to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:278 - DEEPFLOW ****ASSIGNED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf 0  to sil.part -0-
2016-01-05 19:30:43 DEBUG Comparator:286 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf getSPF(SPF2) -cumque- (RETURNING TO CALLER) WAS '' (OK) 
2016-01-05 19:30:43 DEBUG Comparator:303 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compspf areavs.spf[0] == 'p' returning KO
2016-01-05 19:30:43 DEBUG Comparator:309 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compspf in Comparator.java with parameters getSPF(SPF1) -cumque-  EXIT 1 IF1-ELSE2
2016-01-05 19:30:43 DEBUG RunAnalyses:669 - DEEPFLOW ****CHECKED compspf in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters getSPF2: -cumque-  EXIT TRUE -CONTINUE-
2016-01-05 19:30:43 DEBUG RunAnalyses:678 - OPERATIONDEBUG SETTING travellingtables after GETTING travellingtables from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:680 - OPERATIONDEBUG SETTING sil after GETTING sil from comparator in compspf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp-
2016-01-05 19:30:43 DEBUG RunAnalyses:715 - DEEPFLOW ****CHECKED isanysm2 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:737 - DEEPFLOW ****CHECKED isanysm1 -false- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS FALSE
2016-01-05 19:30:43 DEBUG RunAnalyses:742 - CALLING compsf with parameters a_gra: --  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG Comparator:1021 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG Comparator:1034 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf areavs.codles[0] = v  KO
2016-01-05 19:30:43 DEBUG Comparator:1053 - DEEPFLOW ****CHECKED in it.cnr.ilc.jauceps.lib.impl.Comparator/compsf cod_noseg --  EMPTY
2016-01-05 19:30:43 DEBUG Comparator:1089 - CALLING getSF_cod_set with condition -(comp_cod='i')- and mode -0- CALLER -it.cnr.ilc.jauceps.lib.impl.Comparator/compsf-
2016-01-05 19:30:43 DEBUG TabSfQuery:305 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with condition -(comp_cod='i')- getSF -ae- and mode -0-
2016-01-05 19:30:43 DEBUG TabSfQuery:384 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java with query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='ae') AND ((comp_cod='i'))
2016-01-05 19:30:43 DEBUG TabSfQuery:401 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSiQuery.java with  query: SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='ae') AND ((comp_cod='i'))
2016-01-05 19:30:43 DEBUG TabSfQuery:405 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSF_cod_set in TabSfQuery.java
2016-01-05 19:30:43 DEBUG Comparator:1165 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compsf in Comparator.java with parameters a_gra --
2016-01-05 19:30:43 DEBUG RunAnalyses:747 - CALLING compsf with parameters getSPF: -cumque-  CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-05 19:30:43 DEBUG RunAnalyses:752 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in Comp.java
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -1-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -qu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:43 DEBUG InputFunctions:275 - OPERATIONDEBUG SETTING setFirstTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:277 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:323 - DEEPFLOW LOOP SPF1. Counters spf1 -1- spf2 -3- si -3- sf -11- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -false- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1--
2016-01-05 19:30:43 DEBUG InputFunctions:327 - DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:334 - DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -1- with value -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -4- with value -ae-
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -5- with value -cumque-
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:346 - CALLING spferic in  it.cnr.ilc.jauceps.lib.impl.InputFunctions.Parameters form -quaecumque-and spf1 -1- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:83 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:90 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 8 of sil.form quaecumque on sil.rad_spfe 
2016-01-05 19:30:43 DEBUG Sillib:97 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 8 of sil.form quaecumque on sil.rad_spfe quaecumq
2016-01-05 19:30:43 DEBUG Sillib:103 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java. rad_spfe quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:360 - CALLING tabspfq_2.getSPFset in TabSpfQuery.java with parameters: rad_spfe -quaecumq- and SPF2 -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-05 19:30:43 DEBUG TabSpfQuery:91 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF2
2016-01-05 19:30:43 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('quaecumq',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('quaecumq',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:366 - OPERATIONDEBUG SETTING setSecondListOfTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:375 - ****VALUES of getSecondListOfTabSpf  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:378 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF2 -1-
2016-01-05 19:30:43 DEBUG InputFunctions:384 - OPERATIONDEBUG SETTING setSecondTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:386 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -1- spf2 -3- si -3- sf -11- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2--
2016-01-05 19:30:43 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -quaecumq- and spf1 -1- and spf2 -3. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:118 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:123 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 8 of sil.rad_spfe quaecumq on sil.rad_spf 
2016-01-05 19:30:43 DEBUG Sillib:130 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 8 of sil.rad_spfe quaecumq on sil.rad_spf quaecumq
2016-01-05 19:30:43 DEBUG Sillib:135 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -qu-
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value -ae-
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -quaecumq-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecumq',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecumq',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:484 - OPERATIONDEBUG SETTING setListOfTabSi in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-05 19:30:43 DEBUG InputFunctions:502 - OPERATIONDEBUG SETTING setTabSI in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:504 - OPERATIONDEBUG SETTING status in travellingtables to 3 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -1- spf2 -3- si -3- sf -11- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3--
2016-01-05 19:30:43 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -quaecumq- and spf1 -1- and spf2 -3 and si-3-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:189 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:193 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 8 of sil.rad_spf quaecumq on sil.rad_si quaecumq
2016-01-05 19:30:43 DEBUG Sillib:200 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 8 of sil.rad_spf quaecumq on sil.rad_si quaecumq
2016-01-05 19:30:43 DEBUG Sillib:204 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -1- with value -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:614 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:1051 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:1056 - DEEPFLOW ****COPYING rad_si (str) quaecumq on sil.radical qu
2016-01-05 19:30:43 DEBUG InputFunctions:1058 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1060 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1069 - DEEPFLOW ****COPIED rad_si (str) quaecumq on sil.radical quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:1071 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1073 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1080 - CALLING getLEset with parameters rad_si: -quaecumq- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:43 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:43 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecumq'
2016-01-05 19:30:43 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecumq'
2016-01-05 19:30:43 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:1086 - OPERATIONDEBUG SETTING setListOfTabLE in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-05 19:30:43 DEBUG InputFunctions:1094 - CALLING getLEset with parameters rad_si: -quaecumq- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:43 DEBUG InputFunctions:1098 - ****VALUES of getListOfTabLE  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:1101 - ****VALUES of getListOfTabLE is -0-  LOOP ON TABLE -0-
2016-01-05 19:30:43 DEBUG InputFunctions:1238 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:626 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -quaecumq-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:43 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecumq',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecumq',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:631 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:640 - ****VALUES of getListOfTabSF  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:643 - ****VALUES of getListOfTabSF is -1- ADDITIONAL LOOP SF -1-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -1- spf2 -3- si -3- sf -11- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecumq- and spf1 -1- and spf2 -3 and si-3- and sf -11-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 8 of sil.rad_si -quaecumq- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 8 of sil.rad_si -quaecumq- on sil.rad_sf -quaecumq-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaecumq- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -11- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaecumq- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecumq-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaecumq- on sil.radical -quaecumq-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaecumq- on sil.radical -quaecumq-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaecumq- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaecumq-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecumq',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecumq',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaecumq- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecumq', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecumq' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecumq', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecumq' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaecumq-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecumq',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecumq',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:43 DEBUG InputFunctions:275 - OPERATIONDEBUG SETTING setFirstTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:277 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:323 - DEEPFLOW LOOP SPF1. Counters spf1 -2- spf2 -4- si -4- sf -12- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -false- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1--
2016-01-05 19:30:43 DEBUG InputFunctions:327 - DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:334 - DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -1- with value -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:346 - CALLING spferic in  it.cnr.ilc.jauceps.lib.impl.InputFunctions.Parameters form -quaecumque-and spf1 -2- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:83 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:90 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 7 of sil.form quaecumque on sil.rad_spfe 
2016-01-05 19:30:43 DEBUG Sillib:97 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 7 of sil.form quaecumque on sil.rad_spfe quaecum
2016-01-05 19:30:43 DEBUG Sillib:103 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java. rad_spfe quaecum
2016-01-05 19:30:43 DEBUG InputFunctions:360 - CALLING tabspfq_2.getSPFset in TabSpfQuery.java with parameters: rad_spfe -quaecum- and SPF2 -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-05 19:30:43 DEBUG TabSpfQuery:91 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF2
2016-01-05 19:30:43 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('quaecum',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('quaecum',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:366 - OPERATIONDEBUG SETTING setSecondListOfTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:375 - ****VALUES of getSecondListOfTabSpf  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:378 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF2 -1-
2016-01-05 19:30:43 DEBUG InputFunctions:384 - OPERATIONDEBUG SETTING setSecondTabSpf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:386 - OPERATIONDEBUG SETTING status in travellingtables to 1 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -2- spf2 -4- si -4- sf -12- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2--
2016-01-05 19:30:43 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -quaecum- and spf1 -2- and spf2 -4. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:118 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:123 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe quaecum on sil.rad_spf 
2016-01-05 19:30:43 DEBUG Sillib:130 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe quaecum on sil.rad_spf quaecum
2016-01-05 19:30:43 DEBUG Sillib:135 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -quaecumq-
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:484 - OPERATIONDEBUG SETTING setListOfTabSi in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-05 19:30:43 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-05 19:30:43 DEBUG InputFunctions:502 - OPERATIONDEBUG SETTING setTabSI in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:504 - OPERATIONDEBUG SETTING status in travellingtables to 3 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -2- spf2 -4- si -4- sf -12- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2-3--
2016-01-05 19:30:43 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -quaecum- and spf1 -2- and spf2 -4 and si-4-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:189 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:193 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 7 of sil.rad_spf quaecum on sil.rad_si quaecum
2016-01-05 19:30:43 DEBUG Sillib:200 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 7 of sil.rad_spf quaecum on sil.rad_si quaecum
2016-01-05 19:30:43 DEBUG Sillib:204 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -quaecum-
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -1- with value -quaecum-
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:609 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:614 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: quaecum
2016-01-05 19:30:43 DEBUG InputFunctions:1051 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecum
2016-01-05 19:30:43 DEBUG InputFunctions:1056 - DEEPFLOW ****COPYING rad_si (str) quaecum on sil.radical quaecumq
2016-01-05 19:30:43 DEBUG InputFunctions:1058 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1060 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1069 - DEEPFLOW ****COPIED rad_si (str) quaecum on sil.radical quaecum
2016-01-05 19:30:43 DEBUG InputFunctions:1071 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1073 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-05 19:30:43 DEBUG InputFunctions:1080 - CALLING getLEset with parameters rad_si: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:43 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:43 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecum'
2016-01-05 19:30:43 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='quaecum'
2016-01-05 19:30:43 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:1086 - OPERATIONDEBUG SETTING setListOfTabLE in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc-
2016-01-05 19:30:43 DEBUG InputFunctions:1094 - CALLING getLEset with parameters rad_si: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-05 19:30:43 DEBUG InputFunctions:1098 - ****VALUES of getListOfTabLE  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:1101 - ****VALUES of getListOfTabLE is -0-  LOOP ON TABLE -0-
2016-01-05 19:30:43 DEBUG InputFunctions:1238 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: quaecum
2016-01-05 19:30:43 DEBUG InputFunctions:626 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:43 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('quaecum',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-05 19:30:43 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:631 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:640 - ****VALUES of getListOfTabSF  -3-
2016-01-05 19:30:43 DEBUG InputFunctions:643 - ****VALUES of getListOfTabSF is -3- ADDITIONAL LOOP SF -3-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -2- spf2 -4- si -4- sf -12- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2-3-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -2- and spf2 -4 and si-4- and sf -12-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -quaecum- on sil.rad_sf -quaecum-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaecum-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaecum- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -12- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaecum- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecum-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaecum- on sil.radical -quaecum-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaecum- on sil.radical -quaecum-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaecum- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecum' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecum' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecum-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaecum-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -2- spf2 -4- si -4- sf -13- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2-3-20-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -2- and spf2 -4 and si-4- and sf -13-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -quaecum- on sil.rad_sf -quaecu-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaecu-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -m-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -m- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaecu- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -13- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaecu- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecu-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaecu- on sil.radical -quaecum-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaecu- on sil.radical -quaecu-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaecu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaecu-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaecu- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaecu', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaecu' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaecu-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaecu-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:43 DEBUG InputFunctions:648 - OPERATIONDEBUG SETTING setTabSf in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:650 - OPERATIONDEBUG SETTING status in travellingtables to 20 in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:690 - DEEPFLOW LOOP SF. Counters spf1 -2- spf2 -4- si -4- sf -14- sm_1 -4- sm_2 -1- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2-3-20-20-20--
2016-01-05 19:30:43 DEBUG InputFunctions:697 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:711 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -quaecum- and spf1 -2- and spf2 -4 and si-4- and sf -14-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG Sillib:152 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG Sillib:158 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -quaecum- on sil.rad_sf --
2016-01-05 19:30:43 DEBUG Sillib:166 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -quaecum- on sil.rad_sf -quaec-
2016-01-05 19:30:43 DEBUG Sillib:171 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-05 19:30:43 DEBUG InputFunctions:721 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -1- with value -quaec-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -4- with value -um-
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:731 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-05 19:30:43 DEBUG InputFunctions:736 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED getSF -um- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getRad_sf -quaec- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG InputFunctions:750 - CALLING analysis (1) with sf -14- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -quaec- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-05 19:30:43 DEBUG RunAnalyses:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaec-
2016-01-05 19:30:43 DEBUG RunAnalyses:250 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -quaec- on sil.radical -quaecu-
2016-01-05 19:30:43 DEBUG RunAnalyses:257 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -quaec- on sil.radical -quaec-
2016-01-05 19:30:43 DEBUG RunAnalyses:261 - CALLING getSAISet radical=-quaec- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:266 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -quaec-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-05 19:30:43 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:272 - OPERATIONDEBUG SETTING setListOfTabSf in -it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis-
2016-01-05 19:30:43 DEBUG RunAnalyses:279 - ****VALUES of getSAIset  -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:282 - ****VALUES of getListOfTabSAI is -0- ADDITIONAL LOOP SAI -0-
2016-01-05 19:30:43 DEBUG RunAnalyses:353 - DEEPFLOW EXIT LOOP SAI. Counter sai -0- les -0- isanySAI -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:366 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:368 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:376 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:378 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-05 19:30:43 DEBUG RunAnalyses:383 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -quaec- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaec', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaec' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('quaec', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='quaec' 
2016-01-05 19:30:43 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-05 19:30:43 DEBUG RunAnalyses:409 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-05 19:30:43 DEBUG RunAnalyses:413 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -quaec-
2016-01-05 19:30:43 DEBUG InputFunctions:762 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -quaec-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-05 19:30:43 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment))
2016-01-05 19:30:43 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-05 19:30:43 DEBUG InputFunctions:767 - OPERATIONDEBUG SETTING setFirstListOfTabSM in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln-
2016-01-05 19:30:43 DEBUG InputFunctions:776 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-05 19:30:43 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-05 19:30:43 DEBUG Interact:131 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java
AucepsResponse AucepsResponse={comp_le=false, comp=false, compai=false, compsi=false, compspfe=false, compspf=true, compsf=false, compsm1=true, compsm2=true, exitInComp_le=false, exitInComp=true, exitInCompai=false, exitInCompsi=false, exitInCompspfe=false, exitInCompspf=false, exitInCompsf=false, exitInCompsm1=false, exitInCompsm2=false, exitInLemtiz=true, exitInLemv=false, executedLemmiEcc=false, analyses=Analyses{in_form=quaecumque, alt_in_form=quaecumque, numAnalysis=0, listOfAnalysis=[Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}]}, sil=SilType{silId=RunID_2016.01.05.19.30.36, radical=quaec, form=quaecumque, lemma=qui, codice=pr, eagles3=[-, -, -], rad_sf=quaec, rad_si=quaecum, rad_spfe=quaecum, rad_spf=quaecum, rad_sm1=qu, rad_sm2=qu, rad_alt=, rad_sai=null, ind_alt=, segment=[, quaec, , , um, , ], part=0, isLE=0}, cur_analysis=Analysis{segments=[, quae, , , , cumque, ], part=0, n_cod_morf=0, cod_morf_4_10=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], lemmas=Lemmas{Lemmas=[Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=quis, cod_lemma=pr, cod_morf_1_3=[4, -, P4-], type=IPOLEMMA, n_id=q0198, gen=, codles=fe, les_id=49777}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}, Lemma{out_lemma=qui, cod_lemma=pr, cod_morf_1_3=[7, -, P7-], type=IPOLEMMA, n_id=q9410, gen=, codles=fe, les_id=64712}], numL=1}}, resId=RunID_2016.01.05.19.30.36, status=0-1-2-3-20-21-20-20-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-2-3-20-20-20-2-3-20-13-16-10-10-13-13-13-13-13-13-13-13-16-10-10-10-10-13-13-21-13-13-13-13-13-13-13-13-13-13-13-13-22-13-20-13-13-13-13-13-13-13-13-13-13-13-13-21-13-20-13-1-2-3-20-1-2-3-20-20-20-}

>type the WORD-FORM you wish to analyze. end to exit

