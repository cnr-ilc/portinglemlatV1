
 CALLING analysis (2) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (2) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1 qu FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad qu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qu on sil.radical qu
CALLING getSAIset with parameters: rad :qu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9209 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49421 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0001
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les qu
        ****COPIED in getLES curLES[q_mode][7] on rec->codles i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 --

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
    ****CHECKED in compspf getSPF(SPF2) OK 
    ****CHECKED in compspf areavs.spf[0] == 'p' returning 1 KO 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) OK
CALLING compsm1 CALLER comp in sillib.c GNILLAC

START Executing compsm1 in sillib.c TRATS
    ****CHECKED in compsm1 areavs.smv = + and areavs.codles i KO
CALLING getSF_cod_set CALLER compsm1 
CALLING getSF_cod_set with condition ( ( comp_cod_prec='i' ) AND ( pm!='+' ))  and mode 1 CALLER compsm1 

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( ( comp_cod_prec='i' ) AND ( pm!='+' ))  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='ecumque') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )) ) CASE 1 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( ( comp_cod_prec='i' ) AND ( pm!='+' ))  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='ecumque') AND (tabsm.segment='a') AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='i' ) AND ( pm!='+' )) ) CASE 1 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 POTS

START Executing isanySF_cod in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF_cod in query_table_TABSF_alpha.c  POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1: qu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 2 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 2 of sil.rad_si quaecumque on sil.rad_sf qu 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:qu SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:aecumque SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:qu SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:aecumque SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf qu FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad qu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qu on sil.radical qu
CALLING getSAIset with parameters: rad :qu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0001 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49421 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0001
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les qu
        ****COPIED in getLES curLES[q_mode][7] on rec->codles i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 --

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
    ****CHECKED in compspf getSPF(SPF2) OK 
    ****CHECKED in compspf areavs.spf[0] == 'p' returning 1 KO 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) KO
CALLING compsf CALLER comp in sillib.c GNILLAC

START Executing compsf in sillib.c TRATS
    ****CHECKED in compsf areavs.codles)[0] == 'v' KO
    ****CHECKED in compsf areavs.cod_noseg KO and areavs.pt (null) 
CALLING getSF_cod_set. CALLER compsf in sillib.c GNILLAC
CALLING getSF_cod_set. CALLER compsf in sillib.c with condition: (comp_cod='i') and mode 0 GNILLAC

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 TRATS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='i') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='aecumque') AND ((comp_cod='i'))  CASE 0 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='i') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='aecumque') AND ((comp_cod='i')) CASE 0 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 POTS
CALLING clearSF_cod_set. CALLER compsf in sillib.c

START Executing clearSF_cod_set in query_table_TABSF_alpha.c TRATS
STOP Executing clearSF_cod_set in query_table_TABSF_alpha.c POTS
STOP Executing compsf in sillib.c POTS
STOP Executing comp in sillib.c POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: qu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SI. Counters:spf1 -0- spf2 -0- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF2. Counters:spf1 -0- spf2 -1- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -que- 1: -p9-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -que- 1: -p9-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SPF2. Counters:spf1 -0- spf2 -1- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[0]
        ****ASSIGNED EOS to sil.segment[0] 
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_2 GNILLAC

START Executing spfric in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: que TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: que STOP
        ****COPYING in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDIND in spfric '        ****COPIED in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDED in spfric 'STOP Executing spfric in sillib.c. POTS
STOP Executing spfric in sillib.c. POTS
        ****ASSIGNING getSPF(SPF2) to sil.segment[5]

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: que TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: que STOP
        ****ASSIGNED getSPF(SPF2) to sil.segment[5]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[5]:que SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[5]:que SEULAV
 CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  GNILLAC
CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  with parameter: quaecum GNILLAC

SQL Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment)) ORDER BY LENGTH(segment) SQL
LQS Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment)) ORDER BY LENGTH(segment) LQS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -que- 1: -p9-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SI. Counters:spf1 -0- spf2 -1- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 
CALLING siric in sillib.c CALLER siln GNILLAC

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing siric in sillib.c TRAST
        ****COPYING in siric  sil.rad_spf + length 0 on sil.rad_si 
        ****COPIED in siric  sil.rad_spf (null) + length -1210636321 on sil.rad_si quaecum 
STOP Executing siric in sillib.c POTS
        ****ASSIGNING getSI to sil.segment[0]

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
        ****ASSIGNED getSI to sil.segment[0]
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNING sil.rad_si to sil.segment[1]
        ****ASSIGNED '        ****ASSIGNED '        ****ASSIGNED sil.rad_si quaecum to sil.segment[1]
        ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:quaecum SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]: SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]:que SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
         ****VALUES IN LOOP getSIset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[1]:quaecum SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[3]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[5]:que SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[6]: SEULAV
 CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecum GNILLAC
QUI
START Executing lemmi_ecc in input_functions_alpha.c TRAST

START Executing lemmi_ecc in input_functions_alpha.c Parameter quaecum TRAST
        ***COPYING quaecum to sil.radical
        ***ASSIGNING EOS to sil.ind_alt
        ***ASSIGNING EOS to sil.rad_alt
        ***COPIED quaecum to sil.radical quaecum
        ***ASSIGNED EOS to sil.ind_alt 
        ***ASSIGNED EOS to sil.rad_alt 
CALLING getLEset CALLER lemmi_ecc in input_functions_alpha.c GNILLAC
CALLING getLEset with parameters: str :quaecum  CALLER lemmi_ecc in input_functions_alpha.c GNILLAC

SQL Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecum' SQL
LQS Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecum' LQS

START Executing isanyLE in query_table_TABLE_ECC_alpha.c TRATS
STOP Executing isanyLE in query_table_TABLE_ECC_alpha.c  POTS
STOP Executing lemmi_ecc in input_functions_alpha.c POTS
STOP Executing lemmi_ecc in input_functions_alpha.c Parameter quaecum POTS
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecum GNILLAC

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 7 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 7 of sil.rad_si quaecum on sil.rad_sf quaecum 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaecum SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]:que SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaecum SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:que SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaecum FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaecum TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaecum on sil.radical quaecum
CALLING getSAIset with parameters: rad :quaecum  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaecum POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaecum and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecum'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecum'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaecum GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 6 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 6 of sil.rad_si quaecum on sil.rad_sf quaecu 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaecu SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:m SEULAV
     ****VALUES Segment sil.segment[5]:que SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaecu SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:m SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:que SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaecu FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaecu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaecu on sil.radical quaecu
CALLING getSAIset with parameters: rad :quaecu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaecu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaecu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaecu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 5 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 5 of sil.rad_si quaecum on sil.rad_sf quaec 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaec SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:um SEULAV
     ****VALUES Segment sil.segment[5]:que SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaec SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:um SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:que SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaec FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaec TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaec on sil.radical quaec
CALLING getSAIset with parameters: rad :quaec  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaec POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaec and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaec', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaec'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaec', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaec'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaec GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -que- 1: -p9-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SI. Counters:spf1 -0- spf2 -1- si-2- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -que- 1: -p9-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF2. Counters:spf1 -0- spf2 -2- si-2- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SPF2. Counters:spf1 -0- spf2 -2- si-2- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[0]
        ****ASSIGNED EOS to sil.segment[0] 
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_2 GNILLAC

START Executing spfric in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
        ****COPYING in spfric N chars 4 of sil.rad_spfe on sil.rad_spf 
        ****ADDIND in spfric '        ****COPIED in spfric N chars 4 of sil.rad_spfe on sil.rad_spf 
        ****ADDED in spfric 'STOP Executing spfric in sillib.c. POTS
STOP Executing spfric in sillib.c. POTS
        ****ASSIGNING getSPF(SPF2) to sil.segment[5]

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
        ****ASSIGNED getSPF(SPF2) to sil.segment[5]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[5]:cumque SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[5]:cumque SEULAV
 CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  GNILLAC
CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  with parameter: quae GNILLAC

SQL Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quae',LENGTH(segment)) ORDER BY LENGTH(segment) SQL
LQS Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quae',LENGTH(segment)) ORDER BY LENGTH(segment) LQS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SI. Counters:spf1 -0- spf2 -2- si-2- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 
CALLING siric in sillib.c CALLER siln GNILLAC

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing siric in sillib.c TRAST
        ****COPYING in siric  sil.rad_spf + length 0 on sil.rad_si 
        ****COPIED in siric  sil.rad_spf (null) + length -1210636321 on sil.rad_si quae 
STOP Executing siric in sillib.c POTS
        ****ASSIGNING getSI to sil.segment[0]

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
        ****ASSIGNED getSI to sil.segment[0]
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNING sil.rad_si to sil.segment[1]
        ****ASSIGNED '        ****ASSIGNED '        ****ASSIGNED sil.rad_si quae to sil.segment[1]
        ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:quae SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]: SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]:cumque SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
         ****VALUES IN LOOP getSIset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[1]:quae SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[3]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[5]:cumque SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[6]: SEULAV
 CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quae GNILLAC
QUI
START Executing lemmi_ecc in input_functions_alpha.c TRAST

START Executing lemmi_ecc in input_functions_alpha.c Parameter quae TRAST
        ***COPYING quae to sil.radical
        ***ASSIGNING EOS to sil.ind_alt
        ***ASSIGNING EOS to sil.rad_alt
        ***COPIED quae to sil.radical quae
        ***ASSIGNED EOS to sil.ind_alt 
        ***ASSIGNED EOS to sil.rad_alt 
CALLING getLEset CALLER lemmi_ecc in input_functions_alpha.c GNILLAC
CALLING getLEset with parameters: str :quae  CALLER lemmi_ecc in input_functions_alpha.c GNILLAC

SQL Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quae' SQL
LQS Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quae' LQS

START Executing isanyLE in query_table_TABLE_ECC_alpha.c TRATS
STOP Executing isanyLE in query_table_TABLE_ECC_alpha.c  POTS
STOP Executing lemmi_ecc in input_functions_alpha.c POTS
STOP Executing lemmi_ecc in input_functions_alpha.c Parameter quae POTS
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quae GNILLAC

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 4 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 4 of sil.rad_si quae on sil.rad_sf quae 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quae SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]:cumque SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quae SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:cumque SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quae FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quae TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quae on sil.radical quae
CALLING getSAIset with parameters: rad :quae  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quae',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quae',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quae POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quae and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quae', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quae'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quae', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quae'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0001 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49777 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0198
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0198 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50017 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9202
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p2
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quidam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9202 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50045 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9203
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p3
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p3
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quispiam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9203 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50098 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9205
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p5
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p5
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9205 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50126 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9206
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p6
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p6
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quilibet
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9206 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50155 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p7
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p7
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quicumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) OK 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) KO
CALLING compsf CALLER comp in sillib.c GNILLAC

START Executing compsf in sillib.c TRATS
    ****CHECKED in compsf areavs.codles)[0] == 'v' KO
    ****CHECKED in compsf areavs.cod_noseg KO and areavs.pt (null) 
CALLING getSF_cod_set. CALLER compsf in sillib.c GNILLAC
CALLING getSF_cod_set. CALLER compsf in sillib.c with condition: (comp_cod='p7') and mode 0 GNILLAC

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 TRATS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='p7') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='p7'))  CASE 0 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='p7') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='') AND ((comp_cod='p7')) CASE 0 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 POTS
CALLING areacp CALLER compsf in sillib.c 

START Executing areacp in sillib.c TRATS
        ****COPYING in areacp s->n_id on t->n_id 
        ****ASSIGNING in areacp s->gen to t->gen 
        ****ASSIGNING in areacp s->clem to t->clem 
        ****ASSIGNING in areacp s->si to t->si 
        ****ASSIGNING in areacp s->smv to t->smv 
        ****COPYING in areacp s->spf on t->spf 
        ****COPYING in areacp s->codles on t->codles 
        ****COPYING in areacp s->les on t->les 
        ****COPYING in areacp s->lem on t->lem 
        ****COPYING in areacp s->s_omo on t->s_omo 
        ****ASSIGNING in areacp s->piu to t->piu 
        ****COPYING in areacp s->codlem on t->codlem 
        ****ASSIGNING in areacp s->type to t->type 
        ****ASSIGNING in areacp s->cod_noseg to t->cod_noseg 
        ****ASSIGNING in areacp pt to t->pt 
        ****COPYING in areacp s->a_gra on t->a_gra 
        ****ASSIGNING in areacp s->gra_u to t->gra_u 
        ****ASSIGNING in areacp s->les_id to t->les_id 
        ****COPIED in areacp s->n_id q9207 on t->n_id q9207 
        ****ASSIGNED in areacp s->gen  to t->gen 
        ****ASSIGNED in areacp s->clem  to t->clem  
        ****ASSIGNED in areacp s->si (null) to t->si (null) 
        ****ASSIGNED in areacp s->smv to t->smv 
        ****COPIED in areacp s->spf p7 on t->spf p7 
        ****COPIED in areacp s->codles p7 on t->codles p7 
        ****COPIED in areacp s->les quae on t->les quae 
        ****COPIED in areacp s->lem quicumque on t->lem quicumque 
        ****COPIED in areacp s->s_omo  on t->s_omo  
        ****ASSIGNED in areacp s->piu (null) to t->piu (null) 
        ****COPIED in areacp s->codlem pr on t->codlem pr 
        ****ASSIGNED in areacp s->type (null) to t->type (null) 
        ****ASSIGNED in areacp s->cod_noseg  to t->cod_noseg  
        ****ASSIGNED in areacp s->pt (null) to t->pt (null) 
        ****COPIED in areacp s->a_gra  on t->a_gra  
        ****ASSIGNED in areacp s->gra_u x to t->gra_u x����� 
        ****ASSIGNED in areacp s->les_id 50155 to t->les_id 50155 
STOP Executing areacp in sillib.c POTS
    ****COPYING in compsf areal.les to sil.lemma 
    ****COPYING in compsf areal.codles to sil.codice 
    ****COPIED in compsf areal.les quae to sil.lemma quae 
    ****COPIED in compsf areal.codles p7 to sil.codice p7 
CALLING lemtiz. CALLER compsf in sillib.c with areal: q9207 and IPOLEMMA GNILLAC

START Executing lemtiz in sillib.c TRATS
        ****CHECKED in lemtiz areal.lem != ' ' and ='=' and ='-' KO ELSESB_2 
        ****COPIED in lemtiz sil.lemma quicumque
CALLING set_codlem3eagles CALLER lemtiz in sillib.c SECOND BLOCK IFSB_1

START Executing set_codlem3eagles in sillib.c TRATS 
        ****CHECKING resultset in get3eagles
        ****CHECKED resultset in get3eagles OK
        ****ASSIGNING in get3eagles cur_eagles3[0] to c01
        ****ASSIGNING in get3eagles cur_eagles3[1] to c02
        ****ASSIGNING in get3eagles cur_eagles3[2] to c03
        ****ASSIGNED in get3eagles cur_eagles3[0] to c01 P*-quae
        ****ASSIGNED in get3eagles cur_eagles3[1] to c02 *-quae
        ****ASSIGNED in get3eagles cur_eagles3[2] to c03 -quae
LQS Executing get3eagles in query_table_EAGLES_alpha.c with query: SELECT c01,c02,c03 FROM eagles WHERE codlem='pr' LIMIT 1 LQS
STOP Executing set_codlem3eagles in sillib.c POTS 
CALLING pushLemma CALLER lemtiz in sillib.c SECOND BLOCK IFSB_1

START Executing pushLemma input_functions_alpha.c with IPOLEMMA TRATS
        ****COMPARING areavs.codles -> IF1
CALLING get3code_set_fe in query_table_FORME_ECC_alpha.c CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and ELSE1 

SQL Executing get3code_set_fe in query_table_FORME_ECC_alpha.c with query: SELECT DISTINCT CONCAT(c01,c02,c03) FROM forme_ecc WHERE (les_id=50155)  SQL
LQS Executing get3code_set_fe in query_table_FORME_ECC_alpha.c with query: SELECT DISTINCT CONCAT(c01,c02,c03) FROM forme_ecc WHERE (les_id=50155)  LQS

START Executing isany3code_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isany3code_fe in query_table_FORME_ECC_alpha.c  POTS
CALLING newAnalysis. CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and ELSE1 IN LOOP get3code_set_fe 

START Executing newAnalysis in input_functions_alpha.c TRATS
        ****ASSIGNING curAnalysis: analysis 
        ****ASSIGNED curAnalysis: analysis 
        ****ASSIGNING EOS to  sil.segment[6] 
        ****ASSIGNED**** EOS to  sil.segment[6] 
        ****VALUES curAnalysis->segments[i] : SEULAV 0 
        ****COPYING segment[i]:  at index i: 0 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 0 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 1 
        ****COPYING segment[i]: quae at index i: 1 IN IF input_functions_alpha.c
        ****COPIED segment[i]: quae at index i: 1 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 2 
        ****COPYING segment[i]:  at index i: 2 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 2 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 3 
        ****COPYING segment[i]:  at index i: 3 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 3 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 4 
        ****COPYING segment[i]:  at index i: 4 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 4 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 5 
        ****COPYING segment[i]: cumque at index i: 5 IN IF input_functions_alpha.c
        ****COPIED segment[i]: cumque at index i: 5 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 6 
        ****COPYING segment[i]:  at index i: 6 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 6 IN IF input_functions_alpha.c
        ****ASSIGNING sil.part to curAnalysis->part
        ****ASSIGNING 0 to curAnalysis->n_cod_morf
        ****ASSIGNED sil.part to curAnalysis->part
        ****ASSIGNED 0 to curAnalysis->n_cod_morf
CALLING initLemmas in input_functions_alpha.c CALLER newAnalysis in input_functions_alpha.c

START Executing initLemmas input_functions_alpha.c TRATS
        ****ASSIGNING numL=0 to curAnalysis->lemmas.numL
        ****ASSIGNED numL=0 to curAnalysis->lemmas.numL 0
STOP Executing initLemmas input_functions_alpha.c POTS
STOP Executing newAnalysis in input_functions_alpha.c POTS
CALLING getCod_morf_set_fe. CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and ELSE1 IN LOOP get3code_set_fe 

START Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c POTS
        ****(MEM)COPYING 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 

START Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nfs-- TRATS
STOP Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nfs-- POTS
        ****(MEM)COPIED 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 --nfs--

START Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c POTS

START Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c POTS
        ****(MEM)COPYING 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 

START Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nfp-- TRATS
STOP Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nfp-- POTS
        ****(MEM)COPIED 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 --nfp--

START Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c POTS

START Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c POTS
        ****(MEM)COPYING 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 

START Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nnp-- TRATS
STOP Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --nnp-- POTS
        ****(MEM)COPIED 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 --nnp--

START Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c POTS

START Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c POTS
        ****(MEM)COPYING 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 

START Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --anp-- TRATS
STOP Executing getCod_morf_fe in query_table_FORME_ECC_alpha.c with curCod_morf_fe[0]: --anp-- POTS
        ****(MEM)COPIED 7 of getCod_morf_fe() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf]-> ELSE1 --anp--

START Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing nextCod_morf_fe in query_table_FORME_ECC_alpha.c POTS

START Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isanyCod_morf_fe in query_table_FORME_ECC_alpha.c POTS
CALLING newLemma. CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and ELSE1 

START Executing newLemma input_functions_alpha.c TRATS
        ****ASSIGNING curLemma: lemma 
        ****ASSIGNING curLemma: lem_type 
        ****ASSIGNED curLemma: lemma 
        ****ASSIGNED curLemma: lem_type
        ****COPYING a->n_id on curLemma->n_id 
        ****ASSIGNING a->gen to curLemma->gen 
        ****COPYING a->codles on curLemma->codles 
        ****COPYING sil.lemma on curLemma->out_lemma 
        ****COPYING sil.codice on curLemma->cod_lemma 
        ****ASSIGNING a->les_id to curLemma->les_id 
        ****COPIED a->n_id q9207 on curLemma->n_id q9207
        ****ASSIGNED a->gen  to curLemma->gen 
        ****COPIED a->codles p7 on curLemma->codles p7 
        ****COPIED sil.lemma quicumque on curLemma->out_lemma quicumque
        ****COPIED sil.codice pr on curLemma->cod_lemma pr 
        ****ASSIGNED a->les_id 50155 to curLemma->les_id 50155 
STOP Executing newLemma input_functions_alpha.c POTS
        ****(MEM)COPYING 3 of get3code_fe() to curLemma->cod_morf_1_3 -> IF1 

START Executing get3code_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing get3code_fe in query_table_FORME_ECC_alpha.c  POTS
        ****(MEM)COPIED 3 of get3code_fe() to curLemma->cod_morf_1_3 -> IF1 P2- 

START Executing next3code_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing next3code_fe in query_table_FORME_ECC_alpha.c  POTS

START Executing isany3code_fe in query_table_FORME_ECC_alpha.c TRATS
STOP Executing isany3code_fe in query_table_FORME_ECC_alpha.c  POTS
STOP Executing pushLemma input_functions_alpha.c with IPOLEMMA POTS
STOP Executing lemtiz in sillib.c returning  1  IFSB_1 POTS
        ****CHECKED in compsf lemtiz(&areal, IPOLEMMA) OK 
CALLING lemv. CALLER compsf in sillib.c with areal: q9207 and IPOLEMMA GNILLAC

START Executing lemv in sillib.c TRATS
    ****CHECKED areavs.clem  KO 
CALLING getLESset CALLER lemv

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q9207' AND clem='v' and BY_CLEM SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='q9207' AND clem='v' and BY_CLEM LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 1 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 1 POTS
STOP Executing lemv in sillib.c with areavs.clem:  POTS
CALLING clearSF_cod_set. CALLER compsf in sillib.c

START Executing clearSF_cod_set in query_table_TABSF_alpha.c TRATS
STOP Executing clearSF_cod_set in query_table_TABSF_alpha.c POTS
STOP Executing compsf in sillib.c POTS
STOP Executing comp in sillib.c POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9207 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50183 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9208
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p8
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p8
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuiscumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9208 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50235 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9210
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quinam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9210 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64712 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9410
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem qui
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9410 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64951 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9225
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisnam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9225 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 100067 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9209
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p9
        ****COPIED in getLES curLES[q_mode][6] on rec->les quae
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p9
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quae GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quae',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quae',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[2]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c with parameters sil.rad_sf, sil.rad_sm1, SM1 GNILLAC

START Executing smric in sillib.c TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****COPYING in smric N chars 3 of radi_si on rado (SM=sm_n 0)
        ****ADDIND in smric '        ****COPIED in smric N chars 3 of radi quae on rado qua (SM=sm_n 0)
        ****ADDED in smric 'STOP Executing smric in sillib.c POTS
STOP Executing smric in sillib.c POTS
        ****ASSIGNING getSM(SM1) to sil.segment[3]
        ****ASSIGNING sil.rad_sm1 to sil.segment[1]

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNED getSM(SM1) to sil.segment[3]
        ****ASSIGNED sil.rad_sm1 to sil.segment[1]
        ****VALUES IN LOOP getSMset_1 (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[1]:qua SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[3]:e SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[5]:cumque SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[6]: SEULAV
         ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:qua SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]:e SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]:cumque SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
 CALLING analysis (2) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (2) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1 qua FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad qua TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qua on sil.radical qua
CALLING getSAIset with parameters: rad :qua  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qua POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qua and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qua', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qua'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qua', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qua'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9209 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49775 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0198
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0198 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50016 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9202
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p2
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quidam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9202 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50044 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9203
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p3
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quispiam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9203 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50072 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9204
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p4
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p4
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisquam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9204 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50097 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9205
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p5
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p5
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9205 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50125 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9206
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p6
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p6
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quilibet
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9206 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50154 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p7
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p7
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quicumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) OK 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) OK
CALLING compsm1 CALLER comp in sillib.c GNILLAC

START Executing compsm1 in sillib.c TRATS
    ****CHECKED in compsm1 areavs.smv = + and areavs.codles p7 KO
CALLING getSF_cod_set CALLER compsm1 
CALLING getSF_cod_set with condition ( ( comp_cod_prec='p7' ) AND ( pm!='+' ))  and mode 1 CALLER compsm1 

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( ( comp_cod_prec='p7' ) AND ( pm!='+' ))  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') 	AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='p7' ) AND ( pm!='+' )) ) CASE 1 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( ( comp_cod_prec='p7' ) AND ( pm!='+' ))  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ FROM tabsf,tabsm WHERE (tabsf.segment='') AND (tabsm.segment='e') 	AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( ( comp_cod_prec='p7' ) AND ( pm!='+' )) ) CASE 1 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 POTS

START Executing isanySF_cod in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF_cod in query_table_TABSF_alpha.c  POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9207 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50182 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9208
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p8
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p8
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuiscumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9208 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50234 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9210
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quinam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9210 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64711 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9410
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem qui
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9410 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64950 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9225
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisnam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9225 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 100064 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9209
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p9
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p9
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1: qua GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c with parameters sil.rad_sm1 qua, sil.rad_sm2 , SM2 GNILLAC

START Executing smric in sillib.c TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:1 POTS
        ****COPYING in smric N chars 2 of radi_si on rado (SM=sm_n 1)
        ****ADDIND in smric '        ****COPIED in smric N chars 2 of radi qua on rado qu (SM=sm_n 1)
        ****ADDED in smric 'STOP Executing smric in sillib.c POTS
STOP Executing smric in sillib.c POTS
        ****ASSIGNING getSM(SM2) to sil.segment[2]
        ****ASSIGNING sil.rad_sm2 to sil.segment[1]

START Executing getSM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:1 POTS
        ****ASSIGNED getSM(SM2) to sil.segment[2]
        ****ASSIGNED sil.rad_sm2 to sil.segment[1]
    ****VALUES IN LOOP getSMset_2 (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSMset_2 (CHANGED) Segment sil.segment[1]:qu SEULAV
     ****VALUES IN LOOP getSMset_2 (CHANGED) Segment sil.segment[2]:a SEULAV
     ****VALUES IN LOOP getSMset_2 (CHANGED IN LOOP getSMset_1) Segment sil.segment[3]:e SEULAV
     ****VALUES IN LOOP getSMset_2 Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSMset_2 Segment sil.segment[5]:cumque SEULAV
     ****VALUES IN LOOP getSMset_2 Segment sil.segment[6]: SEULAV
     ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:qu SEULAV
     ****VALUES Segment sil.segment[2]:a SEULAV
     ****VALUES Segment sil.segment[3]:e SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]:cumque SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
 CALLING analysis (3) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (3) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm2 qu FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad qu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qu on sil.radical qu
CALLING getSAIset with parameters: rad :qu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9209 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49421 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0001
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les qu
        ****COPIED in getLES curLES[q_mode][7] on rec->codles i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:1 and curSMset[sm_n]:  and curSM[sm_n]: 13733240 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:1 and curSMset[sm_n]:  and curSM[sm_n]: 13733240 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 3 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 3 of sil.rad_si quae on sil.rad_sf qua 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:qua SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:e SEULAV
     ****VALUES Segment sil.segment[5]:cumque SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:qua SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:e SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:cumque SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf qua FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad qua TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qua on sil.radical qua
CALLING getSAIset with parameters: rad :qua  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qua',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qua POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qua and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qua', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qua'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qua', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qua'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0001 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49775 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0198
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0198 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50016 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9202
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p2
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quidam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9202 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50044 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9203
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p3
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quispiam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9203 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50072 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9204
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p4
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p4
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisquam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9204 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50097 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9205
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p5
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p5
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuis
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9205 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50125 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9206
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p6
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p6
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quilibet
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9206 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50154 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p7
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p7
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quicumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) OK 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) KO
CALLING compsf CALLER comp in sillib.c GNILLAC

START Executing compsf in sillib.c TRATS
    ****CHECKED in compsf areavs.codles)[0] == 'v' KO
    ****CHECKED in compsf areavs.cod_noseg KO and areavs.pt (null) 
CALLING getSF_cod_set. CALLER compsf in sillib.c GNILLAC
CALLING getSF_cod_set. CALLER compsf in sillib.c with condition: (comp_cod='p7') and mode 0 GNILLAC

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 TRATS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='p7') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='p7'))  CASE 0 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:(comp_cod='p7') and mode: 0 and query:SELECT DISTINCT comp_cod FROM tabsf WHERE (segment='e') AND ((comp_cod='p7')) CASE 0 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 POTS
CALLING clearSF_cod_set. CALLER compsf in sillib.c

START Executing clearSF_cod_set in query_table_TABSF_alpha.c TRATS
STOP Executing clearSF_cod_set in query_table_TABSF_alpha.c POTS
STOP Executing compsf in sillib.c POTS
STOP Executing comp in sillib.c POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9207 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50182 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9208
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p8
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p8
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quiuiscumque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u x
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9208 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 50234 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9210
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quinam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9210 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64711 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9410
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 3
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles fe
        ****COPIED in getLES curLES[q_mode][8] on rec->lem qui
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9410 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 64950 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9225
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p18
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p18
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisnam
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9225 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 100064 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q9209
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf p9
        ****COPIED in getLES curLES[q_mode][6] on rec->les qua
        ****COPIED in getLES curLES[q_mode][7] on rec->codles p9
        ****COPIED in getLES curLES[q_mode][8] on rec->lem quisque
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem pr
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: qua GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qua',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[2]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c with parameters sil.rad_sf, sil.rad_sm1, SM1 GNILLAC

START Executing smric in sillib.c TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****COPYING in smric N chars 2 of radi_si on rado (SM=sm_n 0)
        ****ADDIND in smric '        ****COPIED in smric N chars 2 of radi qua on rado qu (SM=sm_n 0)
        ****ADDED in smric 'STOP Executing smric in sillib.c POTS
STOP Executing smric in sillib.c POTS
        ****ASSIGNING getSM(SM1) to sil.segment[3]
        ****ASSIGNING sil.rad_sm1 to sil.segment[1]

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNED getSM(SM1) to sil.segment[3]
        ****ASSIGNED sil.rad_sm1 to sil.segment[1]
        ****VALUES IN LOOP getSMset_1 (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[1]:qu SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[3]:a SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[4]:e SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[5]:cumque SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[6]: SEULAV
         ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:qu SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]:a SEULAV
         ****VALUES Segment sil.segment[4]:e SEULAV
         ****VALUES Segment sil.segment[5]:cumque SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
 CALLING analysis (2) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (2) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1 qu FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad qu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qu on sil.radical qu
CALLING getSAIset with parameters: rad :qu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q9209 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49421 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0001
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les qu
        ****COPIED in getLES curLES[q_mode][7] on rec->codles i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1: qu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 13716888 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 2 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 2 of sil.rad_si quae on sil.rad_sf qu 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:qu SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:ae SEULAV
     ****VALUES Segment sil.segment[5]:cumque SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:qu SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:ae SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]:cumque SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf qu FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad qu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad qu on sil.radical qu
CALLING getSAIset with parameters: rad :qu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('qu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad qu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical qu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('qu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='qu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs q0001 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 49421 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id q0001
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les qu
        ****COPIED in getLES curLES[q_mode][7] on rec->codles i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id -1210636012 

START Executing comp in sillib.c

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 -cumque-

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value: cumque STOP
    ****CHECKED in compspf getSPF(SPF2) KO 

START Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 TRAST
STOP Executing getSPF_cod in query_table_TABSPF_alpha.c with spf_n:1 and value: p7 STOP
    ****CHECKED in compspf areavs.spf, getSPF_cod(SPF2)) KO 
STOP Executing compspf in sillib.c AT THE END returning 0 POTS
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) OK 

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: qu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('qu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SI. Counters:spf1 -0- spf2 -2- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -cumque- 1: -p7-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF2. Counters:spf1 -0- spf2 -3- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF1. Counters:spf1 -1- spf2 -3- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
LOOP SPF1. Counters:spf1 -1- spf2 -3- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[6]
        ****ASSIGNED EOS to sil.segment[6] 
        ****VALUES IN LOOP getSPFset_1 Segments sil.segment[6]:-- SEULAV
 CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_1 GNILLAC

START Executing spferic in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value: ue TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value: ue STOP
        ****COPYING in spferic N chars 8 of sil.form on sil.rad_spfe 
        ****ADDIND in spferic '        ****COPIED in spferic N chars 8 of sil.form quaecumque on sil.rad_spfe quaecumq
        ****ADDED in spferic 'STOP Executing spferic in sillib.c POTS 
STOP Executing spferic in sillib.c POTS 

CALLING getSPFset (SPF2) in query_table_TABSPF_alpha.c CALLER siln GNILLAC
CALLING getSPFset in query_table_TABSPF_alpha.c with parameters: rad_spfe :quaecumq and SPF2 :1. CALLER siln in input_functions_alpha.c  GNILLAC

START Executing getSPFset in query_table_TABSF_alpha.c CASE SPF2 TRATS

SQL Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 	FROM tabspf WHERE segment=RIGHT('quaecumq',LENGTH(segment)) 	AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) SQL
LQS Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 	FROM tabspf WHERE segment=RIGHT('quaecumq',LENGTH(segment)) 	AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) LQS

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
LOOP SPF2. Counters:spf1 -1- spf2 -3- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[0]
        ****ASSIGNED EOS to sil.segment[0] 
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_2 GNILLAC

START Executing spfric in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****COPYING in spfric N chars 8 of sil.rad_spfe on sil.rad_spf 
        ****ADDIND in spfric '        ****COPIED in spfric N chars 8 of sil.rad_spfe on sil.rad_spf 
        ****ADDED in spfric 'STOP Executing spfric in sillib.c. POTS
STOP Executing spfric in sillib.c. POTS
        ****ASSIGNING getSPF(SPF2) to sil.segment[5]

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****ASSIGNED getSPF(SPF2) to sil.segment[5]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[5]: SEULAV
 CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  GNILLAC
CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  with parameter: quaecumq GNILLAC

SQL Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecumq',LENGTH(segment)) ORDER BY LENGTH(segment) SQL
LQS Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecumq',LENGTH(segment)) ORDER BY LENGTH(segment) LQS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
LOOP SI. Counters:spf1 -1- spf2 -3- si-3- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 
CALLING siric in sillib.c CALLER siln GNILLAC

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing siric in sillib.c TRAST
        ****COPYING in siric  sil.rad_spf + length 0 on sil.rad_si 
        ****COPIED in siric  sil.rad_spf (null) + length -1210636321 on sil.rad_si quaecumq 
STOP Executing siric in sillib.c POTS
        ****ASSIGNING getSI to sil.segment[0]

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
        ****ASSIGNED getSI to sil.segment[0]
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNING sil.rad_si to sil.segment[1]
        ****ASSIGNED '        ****ASSIGNED '        ****ASSIGNED sil.rad_si quaecumq to sil.segment[1]
        ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:quaecumq SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]: SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]: SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
         ****VALUES IN LOOP getSIset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[1]:quaecumq SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[3]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[5]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[6]: SEULAV
 CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecumq GNILLAC
QUI
START Executing lemmi_ecc in input_functions_alpha.c TRAST

START Executing lemmi_ecc in input_functions_alpha.c Parameter quaecumq TRAST
        ***COPYING quaecumq to sil.radical
        ***ASSIGNING EOS to sil.ind_alt
        ***ASSIGNING EOS to sil.rad_alt
        ***COPIED quaecumq to sil.radical quaecumq
        ***ASSIGNED EOS to sil.ind_alt 
        ***ASSIGNED EOS to sil.rad_alt 
CALLING getLEset CALLER lemmi_ecc in input_functions_alpha.c GNILLAC
CALLING getLEset with parameters: str :quaecumq  CALLER lemmi_ecc in input_functions_alpha.c GNILLAC

SQL Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecumq' SQL
LQS Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecumq' LQS

START Executing isanyLE in query_table_TABLE_ECC_alpha.c TRATS
STOP Executing isanyLE in query_table_TABLE_ECC_alpha.c  POTS
STOP Executing lemmi_ecc in input_functions_alpha.c POTS
STOP Executing lemmi_ecc in input_functions_alpha.c Parameter quaecumq POTS
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecumq GNILLAC

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 8 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 8 of sil.rad_si quaecumq on sil.rad_sf quaecumq 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaecumq SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaecumq SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaecumq FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaecumq TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaecumq on sil.radical quaecumq
CALLING getSAIset with parameters: rad :quaecumq  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecumq',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecumq',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaecumq POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaecumq and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecumq', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecumq'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecumq', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecumq'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaecumq GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecumq',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecumq',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
EXITING LOOP SI. Counters:spf1 -1- spf2 -3- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
EXITING LOOP SPF2. Counters:spf1 -1- spf2 -4- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -ue- 1: -e-
EXITING LOOP SPF1. Counters:spf1 -2- spf2 -4- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
LOOP SPF1. Counters:spf1 -2- spf2 -4- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[6]
        ****ASSIGNED EOS to sil.segment[6] 
        ****VALUES IN LOOP getSPFset_1 Segments sil.segment[6]:-- SEULAV
 CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_1 GNILLAC

START Executing spferic in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value: que TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value: que STOP
        ****COPYING in spferic N chars 7 of sil.form on sil.rad_spfe 
        ****ADDIND in spferic '        ****COPIED in spferic N chars 7 of sil.form quaecumque on sil.rad_spfe quaecum
        ****ADDED in spferic 'STOP Executing spferic in sillib.c POTS 
STOP Executing spferic in sillib.c POTS 

CALLING getSPFset (SPF2) in query_table_TABSPF_alpha.c CALLER siln GNILLAC
CALLING getSPFset in query_table_TABSPF_alpha.c with parameters: rad_spfe :quaecum and SPF2 :1. CALLER siln in input_functions_alpha.c  GNILLAC

START Executing getSPFset in query_table_TABSF_alpha.c CASE SPF2 TRATS

SQL Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 	FROM tabspf WHERE segment=RIGHT('quaecum',LENGTH(segment)) 	AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) SQL
LQS Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 	FROM tabspf WHERE segment=RIGHT('quaecum',LENGTH(segment)) 	AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) LQS

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
LOOP SPF2. Counters:spf1 -2- spf2 -4- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[0]
        ****ASSIGNED EOS to sil.segment[0] 
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_2 GNILLAC

START Executing spfric in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****COPYING in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDIND in spfric '        ****COPIED in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDED in spfric 'STOP Executing spfric in sillib.c. POTS
STOP Executing spfric in sillib.c. POTS
        ****ASSIGNING getSPF(SPF2) to sil.segment[5]

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****ASSIGNED getSPF(SPF2) to sil.segment[5]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[5]: SEULAV
 CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  GNILLAC
CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  with parameter: quaecum GNILLAC

SQL Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment)) ORDER BY LENGTH(segment) SQL
LQS Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod FROM tabsi WHERE segment=LEFT('quaecum',LENGTH(segment)) ORDER BY LENGTH(segment) LQS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
LOOP SI. Counters:spf1 -2- spf2 -4- si-4- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 
CALLING siric in sillib.c CALLER siln GNILLAC

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing siric in sillib.c TRAST
        ****COPYING in siric  sil.rad_spf + length 0 on sil.rad_si 
        ****COPIED in siric  sil.rad_spf (null) + length -1210636321 on sil.rad_si quaecum 
STOP Executing siric in sillib.c POTS
        ****ASSIGNING getSI to sil.segment[0]

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
        ****ASSIGNED getSI to sil.segment[0]
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNING sil.rad_si to sil.segment[1]
        ****ASSIGNED '        ****ASSIGNED '        ****ASSIGNED sil.rad_si quaecum to sil.segment[1]
        ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:quaecum SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]: SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]: SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
         ****VALUES IN LOOP getSIset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[1]:quaecum SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[3]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[5]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[6]: SEULAV
 CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecum GNILLAC
QUI
START Executing lemmi_ecc in input_functions_alpha.c TRAST

START Executing lemmi_ecc in input_functions_alpha.c Parameter quaecum TRAST
        ***COPYING quaecum to sil.radical
        ***ASSIGNING EOS to sil.ind_alt
        ***ASSIGNING EOS to sil.rad_alt
        ***COPIED quaecum to sil.radical quaecum
        ***ASSIGNED EOS to sil.ind_alt 
        ***ASSIGNED EOS to sil.rad_alt 
CALLING getLEset CALLER lemmi_ecc in input_functions_alpha.c GNILLAC
CALLING getLEset with parameters: str :quaecum  CALLER lemmi_ecc in input_functions_alpha.c GNILLAC

SQL Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecum' SQL
LQS Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='quaecum' LQS

START Executing isanyLE in query_table_TABLE_ECC_alpha.c TRATS
STOP Executing isanyLE in query_table_TABLE_ECC_alpha.c  POTS
STOP Executing lemmi_ecc in input_functions_alpha.c POTS
STOP Executing lemmi_ecc in input_functions_alpha.c Parameter quaecum POTS
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: quaecum GNILLAC

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 7 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 7 of sil.rad_si quaecum on sil.rad_sf quaecum 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaecum SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaecum SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaecum FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaecum TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaecum on sil.radical quaecum
CALLING getSAIset with parameters: rad :quaecum  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecum',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaecum POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaecum and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecum'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecum', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecum'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaecum GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecum',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 6 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 6 of sil.rad_si quaecum on sil.rad_sf quaecu 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaecu SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:m SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaecu SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:m SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaecu FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaecu TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaecu on sil.radical quaecu
CALLING getSAIset with parameters: rad :quaecu  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaecu',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaecu POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaecu and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecu'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaecu', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaecu'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaecu GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaecu',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 5 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 5 of sil.rad_si quaecum on sil.rad_sf quaec 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:quaec SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:um SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:quaec SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:um SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf quaec FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad quaec TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad quaec on sil.radical quaec
CALLING getSAIset with parameters: rad :quaec  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('quaec',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad quaec POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical quaec and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaec', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaec'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 	les=REPLACE('quaec', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 	FROM lessario WHERE les='quaec'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: quaec GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('quaec',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
EXITING LOOP SI. Counters:spf1 -2- spf2 -4- si-5- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
EXITING LOOP SPF2. Counters:spf1 -2- spf2 -5- si-5- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -que- 1: -e3-
EXITING LOOP SPF1. Counters:spf1 -3- spf2 -5- si-5- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
NULL in  isanySPF and spf -0-
STOP Executing siln in input_functions_alpha.c POTS
STOP Executing silcall in input_functions_alpha.c POTS


CALLING conOutLemmas in  interact.c. CALLER  main.c  GNILLAC

START Executing conOutLemmas in routine interact.c TRATS
Input  wordform : quaecumque
Analized wordform : quaecumque

============================RESULT OF ANALYSIS ================================

SEGMENTS:	quae -cumque

------------------------codici morf. 1-------------------
--nfs--


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Caso  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Nominativo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') LQS
Caso:	Nominativo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('f') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Genere  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Femminile 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('f') LQS
Genere:	Femminile

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('s') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Numero  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Singolare 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('s') LQS
Numero:	Singolare
------------------------codici morf. 2-------------------
--nfp--


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Caso  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Nominativo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') LQS
Caso:	Nominativo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('f') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Genere  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Femminile 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('f') LQS
Genere:	Femminile

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Numero  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Plurale 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') LQS
Numero:	Plurale
------------------------codici morf. 3-------------------
--nnp--


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Caso  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Nominativo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('n') LQS
Caso:	Nominativo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('n') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Genere  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Neutro 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('n') LQS
Genere:	Neutro

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Numero  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Plurale 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') LQS
Numero:	Plurale
------------------------codici morf. 4-------------------
--anp--


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('a') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Caso  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Accusativo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=6 AND value=LOWER('a') LQS
Caso:	Accusativo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('n') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Genere  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Neutro 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=7 AND value=LOWER('n') LQS
Genere:	Neutro

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Numero  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Plurale 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=8 AND value=LOWER('p') LQS
Numero:	Plurale
	============================LEMMA ================================
	quicumque                     pr   q9207 
	------------------------codici morfologici---------------------
	P2-


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=1 AND value=LOWER('P') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr PoS  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Pronominale 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=1 AND value=LOWER('P') LQS
	PoS:	Pronominale

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=2 AND value=LOWER('2') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Type  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Indefin/Relativ 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr FROM cod_morf WHERE field_pos=2 AND value=LOWER('2') LQS
	Type:	Indefin/Relativ
STOP Executing conOutLemmas in routine interact.c  POTS

CALLING prompt in  interact.c. CALLER  main.c . Parameter sw_file: 1 GNILLAC

START Executing prompt in routine interact.c TRATS

type the WORD-FORM you wish to analyze. end to exit>

