/*******************************************************************************
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.lmf.model.enums;

/**
 * Enumeration of unique language identifiers specified in ISO 639.
 * @author Zijad Maksuti
 * @author Christian M. Meyer
 */
public enum ELanguageIdentifier {
	
	/** @deprecated Use iso639_deu instead. */
	@Deprecated
	de,
	/** @deprecated Use iso639_eng instead. */
	@Deprecated
	en,
	
	iso639_aaa, // Ghotuo
	iso639_aab, // Alumu-Tesu
	iso639_aac, // Ari
	iso639_aad, // Amal
	iso639_aae, // Arbëreshë Albanian
	iso639_aaf, // Aranadan
	iso639_aag, // Ambrak
	iso639_aah, // Abu' Arapesh
	iso639_aai, // Arifama-Miniafia
	iso639_aak, // Ankave
	iso639_aal, // Afade
	iso639_aam, // Aramanik
	iso639_aan, // Anambé
	iso639_aao, // Algerian Saharan Arabic
	iso639_aap, // Pará Arára
	iso639_aaq, // Eastern Abnaki
	iso639_aar, // Afar
	iso639_aas, // Aasáx
	iso639_aat, // Arvanitika Albanian
	iso639_aau, // Abau
	iso639_aaw, // Solong
	iso639_aax, // Mandobo Atas
	iso639_aaz, // Amarasi
	iso639_aba, // Abé
	iso639_abb, // Bankon
	iso639_abc, // Ambala Ayta
	iso639_abd, // Manide
	iso639_abe, // Western Abnaki
	iso639_abf, // Abai Sungai
	iso639_abg, // Abaga
	iso639_abh, // Tajiki Arabic
	iso639_abi, // Abidji
	iso639_abj, // Aka-Bea
	iso639_abk, // Abkhazian
	iso639_abl, // Lampung Nyo
	iso639_abm, // Abanyom
	iso639_abn, // Abua
	iso639_abo, // Abon
	iso639_abp, // Abellen Ayta
	iso639_abq, // Abaza
	iso639_abr, // Abron
	iso639_abs, // Ambonese Malay
	iso639_abt, // Ambulas
	iso639_abu, // Abure
	iso639_abv, // Baharna Arabic
	iso639_abw, // Pal
	iso639_abx, // Inabaknon
	iso639_aby, // Aneme Wake
	iso639_abz, // Abui
	iso639_aca, // Achagua
	iso639_acb, // Áncá
	iso639_acd, // Gikyode
	iso639_ace, // Achinese
	iso639_acf, // Saint Lucian Creole French
	iso639_ach, // Acoli
	iso639_aci, // Aka-Cari
	iso639_ack, // Aka-Kora
	iso639_acl, // Akar-Bale
	iso639_acm, // Mesopotamian Arabic
	iso639_acn, // Achang
	iso639_acp, // Eastern Acipa
	iso639_acq, // Ta'izzi-Adeni Arabic
	iso639_acr, // Achi
	iso639_acs, // Acroá
	iso639_act, // Achterhoeks
	iso639_acu, // Achuar-Shiwiar
	iso639_acv, // Achumawi
	iso639_acw, // Hijazi Arabic
	iso639_acx, // Omani Arabic
	iso639_acy, // Cypriot Arabic
	iso639_acz, // Acheron
	iso639_ada, // Adangme
	iso639_adb, // Adabe
	iso639_add, // Dzodinka
	iso639_ade, // Adele
	iso639_adf, // Dhofari Arabic
	iso639_adg, // Andegerebinha
	iso639_adh, // Adhola
	iso639_adi, // Adi
	iso639_adj, // Adioukrou
	iso639_adl, // Galo
	iso639_adn, // Adang
	iso639_ado, // Abu
	iso639_adp, // Adap
	iso639_adq, // Adangbe
	iso639_adr, // Adonara
	iso639_ads, // Adamorobe Sign Language
	iso639_adt, // Adnyamathanha
	iso639_adu, // Aduge
	iso639_adw, // Amundava
	iso639_adx, // Amdo Tibetan
	iso639_ady, // Adyghe
	iso639_adz, // Adzera
	iso639_aea, // Areba
	iso639_aeb, // Tunisian Arabic
	iso639_aec, // Saidi Arabic
	iso639_aed, // Argentine Sign Language
	iso639_aee, // Northeast Pashayi
	iso639_aek, // Haeke
	iso639_ael, // Ambele
	iso639_aem, // Arem
	iso639_aen, // Armenian Sign Language
	iso639_aeq, // Aer
	iso639_aer, // Eastern Arrernte
	iso639_aes, // Alsea
	iso639_aeu, // Akeu
	iso639_aew, // Ambakich
	iso639_aey, // Amele
	iso639_aez, // Aeka
	iso639_afb, // Gulf Arabic
	iso639_afd, // Andai
	iso639_afe, // Putukwam
	iso639_afg, // Afghan Sign Language
	iso639_afh, // Afrihili
	iso639_afi, // Akrukay
	iso639_afk, // Nanubae
	iso639_afn, // Defaka
	iso639_afo, // Eloyi
	iso639_afp, // Tapei
	iso639_afr, // Afrikaans
	iso639_afs, // Afro-Seminole Creole
	iso639_aft, // Afitti
	iso639_afu, // Awutu
	iso639_afz, // Obokuitai
	iso639_aga, // Aguano
	iso639_agb, // Legbo
	iso639_agc, // Agatu
	iso639_agd, // Agarabi
	iso639_age, // Angal
	iso639_agf, // Arguni
	iso639_agg, // Angor
	iso639_agh, // Ngelima
	iso639_agi, // Agariya
	iso639_agj, // Argobba
	iso639_agk, // Isarog Agta
	iso639_agl, // Fembe
	iso639_agm, // Angaataha
	iso639_agn, // Agutaynen
	iso639_ago, // Tainae
	iso639_agq, // Aghem
	iso639_agr, // Aguaruna
	iso639_ags, // Esimbi
	iso639_agt, // Central Cagayan Agta
	iso639_agu, // Aguacateco
	iso639_agv, // Remontado Dumagat
	iso639_agw, // Kahua
	iso639_agx, // Aghul
	iso639_agy, // Southern Alta
	iso639_agz, // Mt. Iriga Agta
	iso639_aha, // Ahanta
	iso639_ahb, // Axamb
	iso639_ahg, // Qimant
	iso639_ahh, // Aghu
	iso639_ahi, // Tiagbamrin Aizi
	iso639_ahk, // Akha
	iso639_ahl, // Igo
	iso639_ahm, // Mobumrin Aizi
	iso639_ahn, // Àhàn
	iso639_aho, // Ahom
	iso639_ahp, // Aproumu Aizi
	iso639_ahr, // Ahirani
	iso639_ahs, // Ashe
	iso639_aht, // Ahtena
	iso639_aia, // Arosi
	iso639_aib, // Ainu (China)
	iso639_aic, // Ainbai
	iso639_aid, // Alngith
	iso639_aie, // Amara
	iso639_aif, // Agi
	iso639_aig, // Antigua and Barbuda Creole English
	iso639_aih, // Ai-Cham
	iso639_aii, // Assyrian Neo-Aramaic
	iso639_aij, // Lishanid Noshan
	iso639_aik, // Ake
	iso639_ail, // Aimele
	iso639_aim, // Aimol
	iso639_ain, // Ainu (Japan)
	iso639_aio, // Aiton
	iso639_aip, // Burumakok
	iso639_aiq, // Aimaq
	iso639_air, // Airoran
	iso639_ais, // Nataoran Amis
	iso639_ait, // Arikem
	iso639_aiw, // Aari
	iso639_aix, // Aighon
	iso639_aiy, // Ali
	iso639_aja, // Aja (Sudan)
	iso639_ajg, // Aja (Benin)
	iso639_aji, // Ajië
	iso639_ajn, // Andajin
	iso639_ajp, // South Levantine Arabic
	iso639_ajt, // Judeo-Tunisian Arabic
	iso639_aju, // Judeo-Moroccan Arabic
	iso639_ajw, // Ajawa
	iso639_ajz, // Amri Karbi
	iso639_aka, // Akan
	iso639_akb, // Batak Angkola
	iso639_akc, // Mpur
	iso639_akd, // Ukpet-Ehom
	iso639_ake, // Akawaio
	iso639_akf, // Akpa
	iso639_akg, // Anakalangu
	iso639_akh, // Angal Heneng
	iso639_aki, // Aiome
	iso639_akj, // Aka-Jeru
	iso639_akk, // Akkadian
	iso639_akl, // Aklanon
	iso639_akm, // Aka-Bo
	iso639_ako, // Akurio
	iso639_akp, // Siwu
	iso639_akq, // Ak
	iso639_akr, // Araki
	iso639_aks, // Akaselem
	iso639_akt, // Akolet
	iso639_aku, // Akum
	iso639_akv, // Akhvakh
	iso639_akw, // Akwa
	iso639_akx, // Aka-Kede
	iso639_aky, // Aka-Kol
	iso639_akz, // Alabama
	iso639_ala, // Alago
	iso639_alc, // Qawasqar
	iso639_ald, // Alladian
	iso639_ale, // Aleut
	iso639_alf, // Alege
	iso639_alh, // Alawa
	iso639_ali, // Amaimon
	iso639_alj, // Alangan
	iso639_alk, // Alak
	iso639_all, // Allar
	iso639_alm, // Amblong
	iso639_aln, // Gheg Albanian
	iso639_alo, // Larike-Wakasihu
	iso639_alp, // Alune
	iso639_alq, // Algonquin
	iso639_alr, // Alutor
	iso639_als, // Tosk Albanian
	iso639_alt, // Southern Altai
	iso639_alu, // 'Are'are
	iso639_alw, // Alaba-K’abeena
	iso639_alx, // Amol
	iso639_aly, // Alyawarr
	iso639_alz, // Alur
	iso639_ama, // Amanayé
	iso639_amb, // Ambo
	iso639_amc, // Amahuaca
	iso639_ame, // Yanesha'
	iso639_amf, // Hamer-Banna
	iso639_amg, // Amurdak
	iso639_amh, // Amharic
	iso639_ami, // Amis
	iso639_amj, // Amdang
	iso639_amk, // Ambai
	iso639_aml, // War-Jaintia
	iso639_amm, // Ama (Papua New Guinea)
	iso639_amn, // Amanab
	iso639_amo, // Amo
	iso639_amp, // Alamblak
	iso639_amq, // Amahai
	iso639_amr, // Amarakaeri
	iso639_ams, // Southern Amami-Oshima
	iso639_amt, // Amto
	iso639_amu, // Guerrero Amuzgo
	iso639_amv, // Ambelau
	iso639_amw, // Western Neo-Aramaic
	iso639_amx, // Anmatyerre
	iso639_amy, // Ami
	iso639_amz, // Atampaya
	iso639_ana, // Andaqui
	iso639_anb, // Andoa
	iso639_anc, // Ngas
	iso639_and, // Ansus
	iso639_ane, // Xârâcùù
	iso639_anf, // Animere
	iso639_ang, // Old English
	iso639_anh, // Nend
	iso639_ani, // Andi
	iso639_anj, // Anor
	iso639_ank, // Goemai
	iso639_anl, // Anu-Hkongso Chin
	iso639_anm, // Anal
	iso639_ann, // Obolo
	iso639_ano, // Andoque
	iso639_anp, // Angika
	iso639_anq, // Jarawa (India)
	iso639_anr, // Andh
	iso639_ans, // Anserma
	iso639_ant, // Antakarinya
	iso639_anu, // Anuak
	iso639_anv, // Denya
	iso639_anw, // Anaang
	iso639_anx, // Andra-Hus
	iso639_any, // Anyin
	iso639_anz, // Anem
	iso639_aoa, // Angolar
	iso639_aob, // Abom
	iso639_aoc, // Pemon
	iso639_aod, // Andarum
	iso639_aoe, // Angal Enen
	iso639_aof, // Bragat
	iso639_aog, // Angoram
	iso639_aoh, // Arma
	iso639_aoi, // Anindilyakwa
	iso639_aoj, // Mufian
	iso639_aok, // Arhö
	iso639_aol, // Alor
	iso639_aom, // Ömie
	iso639_aon, // Bumbita Arapesh
	iso639_aor, // Aore
	iso639_aos, // Taikat
	iso639_aot, // A'tong
	iso639_aou, // A'ou
	iso639_aox, // Atorada
	iso639_aoz, // Uab Meto
	iso639_apb, // Sa'a
	iso639_apc, // North Levantine Arabic
	iso639_apd, // Sudanese Arabic
	iso639_ape, // Bukiyip
	iso639_apf, // Pahanan Agta
	iso639_apg, // Ampanang
	iso639_aph, // Athpariya
	iso639_api, // Apiaká
	iso639_apj, // Jicarilla Apache
	iso639_apk, // Kiowa Apache
	iso639_apl, // Lipan Apache
	iso639_apm, // Mescalero-Chiricahua Apache
	iso639_apn, // Apinayé
	iso639_apo, // Ambul
	iso639_app, // Apma
	iso639_apq, // A-Pucikwar
	iso639_apr, // Arop-Lokep
	iso639_aps, // Arop-Sissano
	iso639_apt, // Apatani
	iso639_apu, // Apurinã
	iso639_apv, // Alapmunte
	iso639_apw, // Western Apache
	iso639_apx, // Aputai
	iso639_apy, // Apalaí
	iso639_apz, // Safeyoka
	iso639_aqc, // Archi
	iso639_aqd, // Ampari Dogon
	iso639_aqg, // Arigidi
	iso639_aqm, // Atohwaim
	iso639_aqn, // Northern Alta
	iso639_aqp, // Atakapa
	iso639_aqr, // Arhâ
	iso639_aqz, // Akuntsu
	iso639_ara, // Arabic
	iso639_arb, // Standard Arabic
	iso639_arc, // Aramaic
	iso639_ard, // Arabana
	iso639_are, // Western Arrarnta
	iso639_arg, // Aragonese
	iso639_arh, // Arhuaco
	iso639_ari, // Arikara
	iso639_arj, // Arapaso
	iso639_ark, // Arikapú
	iso639_arl, // Arabela
	iso639_arn, // Mapudungun
	iso639_aro, // Araona
	iso639_arp, // Arapaho
	iso639_arq, // Algerian Arabic
	iso639_arr, // Karo (Brazil)
	iso639_ars, // Najdi Arabic
	iso639_aru, // Aruá (Amazonas State)
	iso639_arv, // Arbore
	iso639_arw, // Arawak
	iso639_arx, // Aruá (Rodonia State)
	iso639_ary, // Moroccan Arabic
	iso639_arz, // Egyptian Arabic
	iso639_asa, // Asu (Tanzania)
	iso639_asb, // Assiniboine
	iso639_asc, // Casuarina Coast Asmat
	iso639_asd, // Asas
	iso639_ase, // American Sign Language
	iso639_asf, // Australian Sign Language
	iso639_asg, // Cishingini
	iso639_ash, // Abishira
	iso639_asi, // Buruwai
	iso639_asj, // Nsari
	iso639_ask, // Ashkun
	iso639_asl, // Asilulu
	iso639_asm, // Assamese
	iso639_asn, // Xingú Asuriní
	iso639_aso, // Dano
	iso639_asp, // Algerian Sign Language
	iso639_asq, // Austrian Sign Language
	iso639_asr, // Asuri
	iso639_ass, // Ipulo
	iso639_ast, // Asturian
	iso639_asu, // Tocantins Asurini
	iso639_asv, // Asoa
	iso639_asw, // Australian Aborigines Sign Language
	iso639_asx, // Muratayak
	iso639_asy, // Yaosakor Asmat
	iso639_asz, // As
	iso639_ata, // Pele-Ata
	iso639_atb, // Zaiwa
	iso639_atc, // Atsahuaca
	iso639_atd, // Ata Manobo
	iso639_ate, // Atemble
	iso639_atg, // Ivbie North-Okpela-Arhe
	iso639_ati, // Attié
	iso639_atj, // Atikamekw
	iso639_atk, // Ati
	iso639_atl, // Mt. Iraya Agta
	iso639_atm, // Ata
	iso639_atn, // Ashtiani
	iso639_ato, // Atong
	iso639_atp, // Pudtol Atta
	iso639_atq, // Aralle-Tabulahan
	iso639_atr, // Waimiri-Atroari
	iso639_ats, // Gros Ventre
	iso639_att, // Pamplona Atta
	iso639_atu, // Reel
	iso639_atv, // Northern Altai
	iso639_atw, // Atsugewi
	iso639_atx, // Arutani
	iso639_aty, // Aneityum
	iso639_atz, // Arta
	iso639_aua, // Asumboa
	iso639_aub, // Alugu
	iso639_auc, // Waorani
	iso639_aud, // Anuta
	iso639_aue, // =/Kx'au//'ein
	iso639_aug, // Aguna
	iso639_auh, // Aushi
	iso639_aui, // Anuki
	iso639_auj, // Awjilah
	iso639_auk, // Heyo
	iso639_aul, // Aulua
	iso639_aum, // Asu (Nigeria)
	iso639_aun, // Molmo One
	iso639_auo, // Auyokawa
	iso639_aup, // Makayam
	iso639_auq, // Anus
	iso639_aur, // Aruek
	iso639_aut, // Austral
	iso639_auu, // Auye
	iso639_auw, // Awyi
	iso639_aux, // Aurá
	iso639_auy, // Awiyaana
	iso639_auz, // Uzbeki Arabic
	iso639_ava, // Avaric
	iso639_avb, // Avau
	iso639_avd, // Alviri-Vidari
	iso639_ave, // Avestan
	iso639_avi, // Avikam
	iso639_avk, // Kotava
	iso639_avl, // Eastern Egyptian Bedawi Arabic
	iso639_avm, // Angkamuthi
	iso639_avn, // Avatime
	iso639_avo, // Agavotaguerra
	iso639_avs, // Aushiri
	iso639_avt, // Au
	iso639_avu, // Avokaya
	iso639_avv, // Avá-Canoeiro
	iso639_awa, // Awadhi
	iso639_awb, // Awa (Papua New Guinea)
	iso639_awc, // Cicipu
	iso639_awe, // Awetí
	iso639_awg, // Anguthimri
	iso639_awh, // Awbono
	iso639_awi, // Aekyom
	iso639_awk, // Awabakal
	iso639_awm, // Arawum
	iso639_awn, // Awngi
	iso639_awo, // Awak
	iso639_awr, // Awera
	iso639_aws, // South Awyu
	iso639_awt, // Araweté
	iso639_awu, // Central Awyu
	iso639_awv, // Jair Awyu
	iso639_aww, // Awun
	iso639_awx, // Awara
	iso639_awy, // Edera Awyu
	iso639_axb, // Abipon
	iso639_axe, // Ayerrerenge
	iso639_axg, // Mato Grosso Arára
	iso639_axk, // Yaka (Central African Republic)
	iso639_axm, // Middle Armenian
	iso639_axx, // Xaragure
	iso639_aya, // Awar
	iso639_ayb, // Ayizo Gbe
	iso639_ayc, // Southern Aymara
	iso639_ayd, // Ayabadhu
	iso639_aye, // Ayere
	iso639_ayg, // Ginyanga
	iso639_ayh, // Hadrami Arabic
	iso639_ayi, // Leyigha
	iso639_ayk, // Akuku
	iso639_ayl, // Libyan Arabic
	iso639_aym, // Aymara
	iso639_ayn, // Sanaani Arabic
	iso639_ayo, // Ayoreo
	iso639_ayp, // North Mesopotamian Arabic
	iso639_ayq, // Ayi (Papua New Guinea)
	iso639_ayr, // Central Aymara
	iso639_ays, // Sorsogon Ayta
	iso639_ayt, // Magbukun Ayta
	iso639_ayu, // Ayu
	iso639_ayy, // Tayabas Ayta
	iso639_ayz, // Mai Brat
	iso639_aza, // Azha
	iso639_azb, // South Azerbaijani
	iso639_azd, // Eastern Durango Nahuatl
	iso639_aze, // Azerbaijani
	iso639_azg, // San Pedro Amuzgos Amuzgo
	iso639_azj, // North Azerbaijani
	iso639_azm, // Ipalapa Amuzgo
	iso639_azn, // Western Durango Nahuatl
	iso639_azo, // Awing
	iso639_azt, // Faire Atta
	iso639_azz, // Highland Puebla Nahuatl
	iso639_baa, // Babatana
	iso639_bab, // Bainouk-Gunyuño
	iso639_bac, // Badui
	iso639_bae, // Baré
	iso639_baf, // Nubaca
	iso639_bag, // Tuki
	iso639_bah, // Bahamas Creole English
	iso639_baj, // Barakai
	iso639_bak, // Bashkir
	iso639_bal, // Baluchi
	iso639_bam, // Bambara
	iso639_ban, // Balinese
	iso639_bao, // Waimaha
	iso639_bap, // Bantawa
	iso639_bar, // Bavarian
	iso639_bas, // Basa (Cameroon)
	iso639_bau, // Bada (Nigeria)
	iso639_bav, // Vengo
	iso639_baw, // Bambili-Bambui
	iso639_bax, // Bamun
	iso639_bay, // Batuley
	iso639_bba, // Baatonum
	iso639_bbb, // Barai
	iso639_bbc, // Batak Toba
	iso639_bbd, // Bau
	iso639_bbe, // Bangba
	iso639_bbf, // Baibai
	iso639_bbg, // Barama
	iso639_bbh, // Bugan
	iso639_bbi, // Barombi
	iso639_bbj, // Ghomálá'
	iso639_bbk, // Babanki
	iso639_bbl, // Bats
	iso639_bbm, // Babango
	iso639_bbn, // Uneapa
	iso639_bbo, // Northern Bobo Madaré
	iso639_bbp, // West Central Banda
	iso639_bbq, // Bamali
	iso639_bbr, // Girawa
	iso639_bbs, // Bakpinka
	iso639_bbt, // Mburku
	iso639_bbu, // Kulung (Nigeria)
	iso639_bbv, // Karnai
	iso639_bbw, // Baba
	iso639_bbx, // Bubia
	iso639_bby, // Befang
	iso639_bbz, // Babalia Creole Arabic
	iso639_bca, // Central Bai
	iso639_bcb, // Bainouk-Samik
	iso639_bcc, // Southern Balochi
	iso639_bcd, // North Babar
	iso639_bce, // Bamenyam
	iso639_bcf, // Bamu
	iso639_bcg, // Baga Binari
	iso639_bch, // Bariai
	iso639_bci, // Baoulé
	iso639_bcj, // Bardi
	iso639_bck, // Bunaba
	iso639_bcl, // Central Bikol
	iso639_bcm, // Bannoni
	iso639_bcn, // Bali (Nigeria)
	iso639_bco, // Kaluli
	iso639_bcp, // Bali (Democratic Republic of Congo)
	iso639_bcq, // Bench
	iso639_bcr, // Babine
	iso639_bcs, // Kohumono
	iso639_bct, // Bendi
	iso639_bcu, // Awad Bing
	iso639_bcv, // Shoo-Minda-Nye
	iso639_bcw, // Bana
	iso639_bcy, // Bacama
	iso639_bcz, // Bainouk-Gunyaamolo
	iso639_bda, // Bayot
	iso639_bdb, // Basap
	iso639_bdc, // Emberá-Baudó
	iso639_bdd, // Bunama
	iso639_bde, // Bade
	iso639_bdf, // Biage
	iso639_bdg, // Bonggi
	iso639_bdh, // Baka (Sudan)
	iso639_bdi, // Burun
	iso639_bdj, // Bai
	iso639_bdk, // Budukh
	iso639_bdl, // Indonesian Bajau
	iso639_bdm, // Buduma
	iso639_bdn, // Baldemu
	iso639_bdo, // Morom
	iso639_bdp, // Bende
	iso639_bdq, // Bahnar
	iso639_bdr, // West Coast Bajau
	iso639_bds, // Burunge
	iso639_bdt, // Bokoto
	iso639_bdu, // Oroko
	iso639_bdv, // Bodo Parja
	iso639_bdw, // Baham
	iso639_bdx, // Budong-Budong
	iso639_bdy, // Bandjalang
	iso639_bdz, // Badeshi
	iso639_bea, // Beaver
	iso639_beb, // Bebele
	iso639_bec, // Iceve-Maci
	iso639_bed, // Bedoanas
	iso639_bee, // Byangsi
	iso639_bef, // Benabena
	iso639_beg, // Belait
	iso639_beh, // Biali
	iso639_bei, // Bekati'
	iso639_bej, // Beja
	iso639_bek, // Bebeli
	iso639_bel, // Belarusian
	iso639_bem, // Bemba (Zambia)
	iso639_ben, // Bengali
	iso639_beo, // Beami
	iso639_bep, // Besoa
	iso639_beq, // Beembe
	iso639_bes, // Besme
	iso639_bet, // Guiberoua Béte
	iso639_beu, // Blagar
	iso639_bev, // Daloa Bété
	iso639_bew, // Betawi
	iso639_bex, // Jur Modo
	iso639_bey, // Beli (Papua New Guinea)
	iso639_bez, // Bena (Tanzania)
	iso639_bfa, // Bari
	iso639_bfb, // Pauri Bareli
	iso639_bfc, // Northern Bai
	iso639_bfd, // Bafut
	iso639_bfe, // Betaf
	iso639_bff, // Bofi
	iso639_bfg, // Busang Kayan
	iso639_bfh, // Blafe
	iso639_bfi, // British Sign Language
	iso639_bfj, // Bafanji
	iso639_bfk, // Ban Khor Sign Language
	iso639_bfl, // Banda-Ndélé
	iso639_bfm, // Mmen
	iso639_bfn, // Bunak
	iso639_bfo, // Malba Birifor
	iso639_bfp, // Beba
	iso639_bfq, // Badaga
	iso639_bfr, // Bazigar
	iso639_bfs, // Southern Bai
	iso639_bft, // Balti
	iso639_bfu, // Gahri
	iso639_bfw, // Bondo
	iso639_bfx, // Bantayanon
	iso639_bfy, // Bagheli
	iso639_bfz, // Mahasu Pahari
	iso639_bga, // Gwamhi-Wuri
	iso639_bgb, // Bobongko
	iso639_bgc, // Haryanvi
	iso639_bgd, // Rathwi Bareli
	iso639_bge, // Bauria
	iso639_bgf, // Bangandu
	iso639_bgg, // Bugun
	iso639_bgi, // Giangan
	iso639_bgj, // Bangolan
	iso639_bgk, // Bit
	iso639_bgl, // Bo (Laos)
	iso639_bgm, // Baga Mboteni
	iso639_bgn, // Western Balochi
	iso639_bgo, // Baga Koga
	iso639_bgp, // Eastern Balochi
	iso639_bgq, // Bagri
	iso639_bgr, // Bawm Chin
	iso639_bgs, // Tagabawa
	iso639_bgt, // Bughotu
	iso639_bgu, // Mbongno
	iso639_bgv, // Warkay-Bipim
	iso639_bgw, // Bhatri
	iso639_bgx, // Balkan Gagauz Turkish
	iso639_bgy, // Benggoi
	iso639_bgz, // Banggai
	iso639_bha, // Bharia
	iso639_bhb, // Bhili
	iso639_bhc, // Biga
	iso639_bhd, // Bhadrawahi
	iso639_bhe, // Bhaya
	iso639_bhf, // Odiai
	iso639_bhg, // Binandere
	iso639_bhh, // Bukharic
	iso639_bhi, // Bhilali
	iso639_bhj, // Bahing
	iso639_bhl, // Bimin
	iso639_bhm, // Bathari
	iso639_bhn, // Bohtan Neo-Aramaic
	iso639_bho, // Bhojpuri
	iso639_bhp, // Bima
	iso639_bhq, // Tukang Besi South
	iso639_bhr, // Bara Malagasy
	iso639_bhs, // Buwal
	iso639_bht, // Bhattiyali
	iso639_bhu, // Bhunjia
	iso639_bhv, // Bahau
	iso639_bhw, // Biak
	iso639_bhx, // Bhalay
	iso639_bhy, // Bhele
	iso639_bhz, // Bada (Indonesia)
	iso639_bia, // Badimaya
	iso639_bib, // Bissa
	iso639_bic, // Bikaru
	iso639_bid, // Bidiyo
	iso639_bie, // Bepour
	iso639_bif, // Biafada
	iso639_big, // Biangai
	iso639_bij, // Vaghat-Ya-Bijim-Legeri
	iso639_bik, // Bikol
	iso639_bil, // Bile
	iso639_bim, // Bimoba
	iso639_bin, // Bini
	iso639_bio, // Nai
	iso639_bip, // Bila
	iso639_biq, // Bipi
	iso639_bir, // Bisorio
	iso639_bis, // Bislama
	iso639_bit, // Berinomo
	iso639_biu, // Biete
	iso639_biv, // Southern Birifor
	iso639_biw, // Kol (Cameroon)
	iso639_bix, // Bijori
	iso639_biy, // Birhor
	iso639_biz, // Baloi
	iso639_bja, // Budza
	iso639_bjb, // Banggarla
	iso639_bjc, // Bariji
	iso639_bje, // Biao-Jiao Mien
	iso639_bjf, // Barzani Jewish Neo-Aramaic
	iso639_bjg, // Bidyogo
	iso639_bjh, // Bahinemo
	iso639_bji, // Burji
	iso639_bjj, // Kanauji
	iso639_bjk, // Barok
	iso639_bjl, // Bulu (Papua New Guinea)
	iso639_bjm, // Bajelani
	iso639_bjn, // Banjar
	iso639_bjo, // Mid-Southern Banda
	iso639_bjr, // Binumarien
	iso639_bjs, // Bajan
	iso639_bjt, // Balanta-Ganja
	iso639_bju, // Busuu
	iso639_bjv, // Bedjond
	iso639_bjw, // Bakwé
	iso639_bjx, // Banao Itneg
	iso639_bjy, // Bayali
	iso639_bjz, // Baruga
	iso639_bka, // Kyak
	iso639_bkc, // Baka (Cameroon)
	iso639_bkd, // Binukid
	iso639_bkf, // Beeke
	iso639_bkg, // Buraka
	iso639_bkh, // Bakoko
	iso639_bki, // Baki
	iso639_bkj, // Pande
	iso639_bkk, // Brokskat
	iso639_bkl, // Berik
	iso639_bkm, // Kom (Cameroon)
	iso639_bkn, // Bukitan
	iso639_bko, // Kwa'
	iso639_bkp, // Boko (Democratic Republic of Congo)
	iso639_bkq, // Bakairí
	iso639_bkr, // Bakumpai
	iso639_bks, // Northern Sorsoganon
	iso639_bkt, // Boloki
	iso639_bku, // Buhid
	iso639_bkv, // Bekwarra
	iso639_bkw, // Bekwel
	iso639_bkx, // Baikeno
	iso639_bky, // Bokyi
	iso639_bkz, // Bungku
	iso639_bla, // Siksika
	iso639_blb, // Bilua
	iso639_blc, // Bella Coola
	iso639_bld, // Bolango
	iso639_ble, // Balanta-Kentohe
	iso639_blf, // Buol
	iso639_blg, // Balau
	iso639_blh, // Kuwaa
	iso639_bli, // Bolia
	iso639_blj, // Bolongan
	iso639_blk, // Pa'o Karen
	iso639_bll, // Biloxi
	iso639_blm, // Beli (Sudan)
	iso639_bln, // Southern Catanduanes Bikol
	iso639_blo, // Anii
	iso639_blp, // Blablanga
	iso639_blq, // Baluan-Pam
	iso639_blr, // Blang
	iso639_bls, // Balaesang
	iso639_blt, // Tai Dam
	iso639_blv, // Bolo
	iso639_blw, // Balangao
	iso639_blx, // Mag-Indi Ayta
	iso639_bly, // Notre
	iso639_blz, // Balantak
	iso639_bma, // Lame
	iso639_bmb, // Bembe
	iso639_bmc, // Biem
	iso639_bmd, // Baga Manduri
	iso639_bme, // Limassa
	iso639_bmf, // Bom
	iso639_bmg, // Bamwe
	iso639_bmh, // Kein
	iso639_bmi, // Bagirmi
	iso639_bmj, // Bote-Majhi
	iso639_bmk, // Ghayavi
	iso639_bml, // Bomboli
	iso639_bmm, // Northern Betsimisaraka Malagasy
	iso639_bmn, // Bina (Papua New Guinea)
	iso639_bmo, // Bambalang
	iso639_bmp, // Bulgebi
	iso639_bmq, // Bomu
	iso639_bmr, // Muinane
	iso639_bms, // Bilma Kanuri
	iso639_bmt, // Biao Mon
	iso639_bmu, // Somba-Siawari
	iso639_bmv, // Bum
	iso639_bmw, // Bomwali
	iso639_bmx, // Baimak
	iso639_bmy, // Bemba (Democratic Republic of Congo)
	iso639_bmz, // Baramu
	iso639_bna, // Bonerate
	iso639_bnb, // Bookan
	iso639_bnc, // Bontok
	iso639_bnd, // Banda (Indonesia)
	iso639_bne, // Bintauna
	iso639_bnf, // Masiwang
	iso639_bng, // Benga
	iso639_bni, // Bangi
	iso639_bnj, // Eastern Tawbuid
	iso639_bnk, // Bierebo
	iso639_bnl, // Boon
	iso639_bnm, // Batanga
	iso639_bnn, // Bunun
	iso639_bno, // Bantoanon
	iso639_bnp, // Bola
	iso639_bnq, // Bantik
	iso639_bnr, // Butmas-Tur
	iso639_bns, // Bundeli
	iso639_bnu, // Bentong
	iso639_bnv, // Bonerif
	iso639_bnw, // Bisis
	iso639_bnx, // Bangubangu
	iso639_bny, // Bintulu
	iso639_bnz, // Beezen
	iso639_boa, // Bora
	iso639_bob, // Aweer
	iso639_bod, // Tibetan
	iso639_boe, // Mundabli
	iso639_bof, // Bolon
	iso639_bog, // Bamako Sign Language
	iso639_boh, // Boma
	iso639_boi, // Barbareño
	iso639_boj, // Anjam
	iso639_bok, // Bonjo
	iso639_bol, // Bole
	iso639_bom, // Berom
	iso639_bon, // Bine
	iso639_boo, // Tiemacèwè Bozo
	iso639_bop, // Bonkiman
	iso639_boq, // Bogaya
	iso639_bor, // Borôro
	iso639_bos, // Bosnian
	iso639_bot, // Bongo
	iso639_bou, // Bondei
	iso639_bov, // Tuwuli
	iso639_bow, // Rema
	iso639_box, // Buamu
	iso639_boy, // Bodo (Central African Republic)
	iso639_boz, // Tiéyaxo Bozo
	iso639_bpa, // Dakaka
	iso639_bpb, // Barbacoas
	iso639_bpd, // Banda-Banda
	iso639_bpg, // Bonggo
	iso639_bph, // Botlikh
	iso639_bpi, // Bagupi
	iso639_bpj, // Binji
	iso639_bpk, // Orowe
	iso639_bpl, // Broome Pearling Lugger Pidgin
	iso639_bpm, // Biyom
	iso639_bpn, // Dzao Min
	iso639_bpo, // Anasi
	iso639_bpp, // Kaure
	iso639_bpq, // Banda Malay
	iso639_bpr, // Koronadal Blaan
	iso639_bps, // Sarangani Blaan
	iso639_bpt, // Barrow Point
	iso639_bpu, // Bongu
	iso639_bpv, // Bian Marind
	iso639_bpw, // Bo (Papua New Guinea)
	iso639_bpx, // Palya Bareli
	iso639_bpy, // Bishnupriya
	iso639_bpz, // Bilba
	iso639_bqa, // Tchumbuli
	iso639_bqb, // Bagusa
	iso639_bqc, // Boko (Benin)
	iso639_bqd, // Bung
	iso639_bqf, // Baga Kaloum
	iso639_bqg, // Bago-Kusuntu
	iso639_bqh, // Baima
	iso639_bqi, // Bakhtiari
	iso639_bqj, // Bandial
	iso639_bqk, // Banda-Mbrès
	iso639_bql, // Bilakura
	iso639_bqm, // Wumboko
	iso639_bqn, // Bulgarian Sign Language
	iso639_bqo, // Balo
	iso639_bqp, // Busa
	iso639_bqq, // Biritai
	iso639_bqr, // Burusu
	iso639_bqs, // Bosngun
	iso639_bqt, // Bamukumbit
	iso639_bqu, // Boguru
	iso639_bqv, // Koro Wachi
	iso639_bqw, // Buru (Nigeria)
	iso639_bqx, // Baangi
	iso639_bqy, // Bengkala Sign Language
	iso639_bqz, // Bakaka
	iso639_bra, // Braj
	iso639_brb, // Lave
	iso639_brc, // Berbice Creole Dutch
	iso639_brd, // Baraamu
	iso639_bre, // Breton
	iso639_brf, // Bera
	iso639_brg, // Baure
	iso639_brh, // Brahui
	iso639_bri, // Mokpwe
	iso639_brj, // Bieria
	iso639_brk, // Birked
	iso639_brl, // Birwa
	iso639_brm, // Barambu
	iso639_brn, // Boruca
	iso639_bro, // Brokkat
	iso639_brp, // Barapasi
	iso639_brq, // Breri
	iso639_brr, // Birao
	iso639_brs, // Baras
	iso639_brt, // Bitare
	iso639_bru, // Eastern Bru
	iso639_brv, // Western Bru
	iso639_brw, // Bellari
	iso639_brx, // Bodo (India)
	iso639_bry, // Burui
	iso639_brz, // Bilbil
	iso639_bsa, // Abinomn
	iso639_bsb, // Brunei Bisaya
	iso639_bsc, // Bassari
	iso639_bse, // Wushi
	iso639_bsf, // Bauchi
	iso639_bsg, // Bashkardi
	iso639_bsh, // Kati
	iso639_bsi, // Bassossi
	iso639_bsj, // Bangwinji
	iso639_bsk, // Burushaski
	iso639_bsl, // Basa-Gumna
	iso639_bsm, // Busami
	iso639_bsn, // Barasana-Eduria
	iso639_bso, // Buso
	iso639_bsp, // Baga Sitemu
	iso639_bsq, // Bassa
	iso639_bsr, // Bassa-Kontagora
	iso639_bss, // Akoose
	iso639_bst, // Basketo
	iso639_bsu, // Bahonsuai
	iso639_bsv, // Baga Sobané
	iso639_bsw, // Baiso
	iso639_bsx, // Yangkam
	iso639_bsy, // Sabah Bisaya
	iso639_bta, // Bata
	iso639_btc, // Bati (Cameroon)
	iso639_btd, // Batak Dairi
	iso639_bte, // Gamo-Ningi
	iso639_btf, // Birgit
	iso639_btg, // Gagnoa Bété
	iso639_bth, // Biatah Bidayuh
	iso639_bti, // Burate
	iso639_btj, // Bacanese Malay
	iso639_btl, // Bhatola
	iso639_btm, // Batak Mandailing
	iso639_btn, // Ratagnon
	iso639_bto, // Rinconada Bikol
	iso639_btp, // Budibud
	iso639_btq, // Batek
	iso639_btr, // Baetora
	iso639_bts, // Batak Simalungun
	iso639_btt, // Bete-Bendi
	iso639_btu, // Batu
	iso639_btv, // Bateri
	iso639_btw, // Butuanon
	iso639_btx, // Batak Karo
	iso639_bty, // Bobot
	iso639_btz, // Batak Alas-Kluet
	iso639_bua, // Buriat
	iso639_bub, // Bua
	iso639_buc, // Bushi
	iso639_bud, // Ntcham
	iso639_bue, // Beothuk
	iso639_buf, // Bushoong
	iso639_bug, // Buginese
	iso639_buh, // Younuo Bunu
	iso639_bui, // Bongili
	iso639_buj, // Basa-Gurmana
	iso639_buk, // Bugawac
	iso639_bul, // Bulgarian
	iso639_bum, // Bulu (Cameroon)
	iso639_bun, // Sherbro
	iso639_buo, // Terei
	iso639_bup, // Busoa
	iso639_buq, // Brem
	iso639_bus, // Bokobaru
	iso639_but, // Bungain
	iso639_buu, // Budu
	iso639_buv, // Bun
	iso639_buw, // Bubi
	iso639_bux, // Boghom
	iso639_buy, // Bullom So
	iso639_buz, // Bukwen
	iso639_bva, // Barein
	iso639_bvb, // Bube
	iso639_bvc, // Baelelea
	iso639_bvd, // Baeggu
	iso639_bve, // Berau Malay
	iso639_bvf, // Boor
	iso639_bvg, // Bonkeng
	iso639_bvh, // Bure
	iso639_bvi, // Belanda Viri
	iso639_bvj, // Baan
	iso639_bvk, // Bukat
	iso639_bvl, // Bolivian Sign Language
	iso639_bvm, // Bamunka
	iso639_bvn, // Buna
	iso639_bvo, // Bolgo
	iso639_bvq, // Birri
	iso639_bvr, // Burarra
	iso639_bvt, // Bati (Indonesia)
	iso639_bvu, // Bukit Malay
	iso639_bvv, // Baniva
	iso639_bvw, // Boga
	iso639_bvx, // Dibole
	iso639_bvy, // Baybayanon
	iso639_bvz, // Bauzi
	iso639_bwa, // Bwatoo
	iso639_bwb, // Namosi-Naitasiri-Serua
	iso639_bwc, // Bwile
	iso639_bwd, // Bwaidoka
	iso639_bwe, // Bwe Karen
	iso639_bwf, // Boselewa
	iso639_bwg, // Barwe
	iso639_bwh, // Bishuo
	iso639_bwi, // Baniwa
	iso639_bwj, // Láá Láá Bwamu
	iso639_bwk, // Bauwaki
	iso639_bwl, // Bwela
	iso639_bwm, // Biwat
	iso639_bwn, // Wunai Bunu
	iso639_bwo, // Boro (Ethiopia)
	iso639_bwp, // Mandobo Bawah
	iso639_bwq, // Southern Bobo Madaré
	iso639_bwr, // Bura-Pabir
	iso639_bws, // Bomboma
	iso639_bwt, // Bafaw-Balong
	iso639_bwu, // Buli (Ghana)
	iso639_bww, // Bwa
	iso639_bwx, // Bu-Nao Bunu
	iso639_bwy, // Cwi Bwamu
	iso639_bwz, // Bwisi
	iso639_bxa, // Bauro
	iso639_bxb, // Belanda Bor
	iso639_bxc, // Molengue
	iso639_bxd, // Pela
	iso639_bxe, // Birale
	iso639_bxf, // Bilur
	iso639_bxg, // Bangala
	iso639_bxh, // Buhutu
	iso639_bxi, // Pirlatapa
	iso639_bxj, // Bayungu
	iso639_bxk, // Bukusu
	iso639_bxl, // Jalkunan
	iso639_bxm, // Mongolia Buriat
	iso639_bxn, // Burduna
	iso639_bxo, // Barikanchi
	iso639_bxp, // Bebil
	iso639_bxq, // Beele
	iso639_bxr, // Russia Buriat
	iso639_bxs, // Busam
	iso639_bxu, // China Buriat
	iso639_bxv, // Berakou
	iso639_bxw, // Bankagooma
	iso639_bxx, // Borna (Democratic Republic of Congo)
	iso639_bxz, // Binahari
	iso639_bya, // Batak
	iso639_byb, // Bikya
	iso639_byc, // Ubaghara
	iso639_byd, // Benyadu'
	iso639_bye, // Pouye
	iso639_byf, // Bete
	iso639_byg, // Baygo
	iso639_byh, // Bhujel
	iso639_byi, // Buyu
	iso639_byj, // Bina (Nigeria)
	iso639_byk, // Biao
	iso639_byl, // Bayono
	iso639_bym, // Bidyara
	iso639_byn, // Bilin
	iso639_byo, // Biyo
	iso639_byp, // Bumaji
	iso639_byq, // Basay
	iso639_byr, // Baruya
	iso639_bys, // Burak
	iso639_byt, // Berti
	iso639_byv, // Medumba
	iso639_byw, // Belhariya
	iso639_byx, // Qaqet
	iso639_byy, // Buya
	iso639_byz, // Banaro
	iso639_bza, // Bandi
	iso639_bzb, // Andio
	iso639_bzc, // Southern Betsimisaraka Malagasy
	iso639_bzd, // Bribri
	iso639_bze, // Jenaama Bozo
	iso639_bzf, // Boikin
	iso639_bzg, // Babuza
	iso639_bzh, // Mapos Buang
	iso639_bzi, // Bisu
	iso639_bzj, // Belize Kriol English
	iso639_bzk, // Nicaragua Creole English
	iso639_bzl, // Boano (Sulawesi)
	iso639_bzm, // Bolondo
	iso639_bzn, // Boano (Maluku)
	iso639_bzo, // Bozaba
	iso639_bzp, // Kemberano
	iso639_bzq, // Buli (Indonesia)
	iso639_bzr, // Biri
	iso639_bzs, // Brazilian Sign Language
	iso639_bzt, // Brithenig
	iso639_bzu, // Burmeso
	iso639_bzv, // Bebe
	iso639_bzw, // Basa (Nigeria)
	iso639_bzx, // Kɛlɛngaxo Bozo
	iso639_bzy, // Obanliku
	iso639_bzz, // Evant
	iso639_caa, // Chortí
	iso639_cab, // Garifuna
	iso639_cac, // Chuj
	iso639_cad, // Caddo
	iso639_cae, // Lehar
	iso639_caf, // Southern Carrier
	iso639_cag, // Nivaclé
	iso639_cah, // Cahuarano
	iso639_caj, // Chané
	iso639_cak, // Kaqchikel
	iso639_cal, // Carolinian
	iso639_cam, // Cemuhî
	iso639_can, // Chambri
	iso639_cao, // Chácobo
	iso639_cap, // Chipaya
	iso639_caq, // Car Nicobarese
	iso639_car, // Galibi Carib
	iso639_cas, // Tsimané
	iso639_cat, // Catalan
	iso639_cav, // Cavineña
	iso639_caw, // Callawalla
	iso639_cax, // Chiquitano
	iso639_cay, // Cayuga
	iso639_caz, // Canichana
	iso639_cbb, // Cabiyarí
	iso639_cbc, // Carapana
	iso639_cbd, // Carijona
	iso639_cbe, // Chipiajes
	iso639_cbg, // Chimila
	iso639_cbh, // Cagua
	iso639_cbi, // Chachi
	iso639_cbj, // Ede Cabe
	iso639_cbk, // Chavacano
	iso639_cbl, // Bualkhaw Chin
	iso639_cbn, // Nyahkur
	iso639_cbo, // Izora
	iso639_cbr, // Cashibo-Cacataibo
	iso639_cbs, // Cashinahua
	iso639_cbt, // Chayahuita
	iso639_cbu, // Candoshi-Shapra
	iso639_cbv, // Cacua
	iso639_cbw, // Kinabalian
	iso639_cby, // Carabayo
	iso639_cca, // Cauca
	iso639_ccc, // Chamicuro
	iso639_ccd, // Cafundo Creole
	iso639_cce, // Chopi
	iso639_ccg, // Samba Daka
	iso639_cch, // Atsam
	iso639_ccj, // Kasanga
	iso639_ccl, // Cutchi-Swahili
	iso639_ccm, // Malaccan Creole Malay
	iso639_cco, // Comaltepec Chinantec
	iso639_ccp, // Chakma
	iso639_ccr, // Cacaopera
	iso639_cda, // Choni
	iso639_cde, // Chenchu
	iso639_cdf, // Chiru
	iso639_cdg, // Chamari
	iso639_cdh, // Chambeali
	iso639_cdi, // Chodri
	iso639_cdj, // Churahi
	iso639_cdm, // Chepang
	iso639_cdn, // Chaudangsi
	iso639_cdo, // Min Dong Chinese
	iso639_cdr, // Cinda-Regi-Tiyal
	iso639_cds, // Chadian Sign Language
	iso639_cdy, // Chadong
	iso639_cdz, // Koda
	iso639_cea, // Lower Chehalis
	iso639_ceb, // Cebuano
	iso639_ceg, // Chamacoco
	iso639_cek, // Eastern Khumi Chin
	iso639_cen, // Cen
	iso639_ces, // Czech
	iso639_cet, // Centúúm
	iso639_cfa, // Dijim-Bwilim
	iso639_cfd, // Cara
	iso639_cfg, // Como Karim
	iso639_cfm, // Falam Chin
	iso639_cga, // Changriwa
	iso639_cgc, // Kagayanen
	iso639_cgg, // Chiga
	iso639_cgk, // Chocangacakha
	iso639_cha, // Chamorro
	iso639_chb, // Chibcha
	iso639_chc, // Catawba
	iso639_chd, // Highland Oaxaca Chontal
	iso639_che, // Chechen
	iso639_chf, // Tabasco Chontal
	iso639_chg, // Chagatai
	iso639_chh, // Chinook
	iso639_chj, // Ojitlán Chinantec
	iso639_chk, // Chuukese
	iso639_chl, // Cahuilla
	iso639_chm, // Mari (Russia)
	iso639_chn, // Chinook jargon
	iso639_cho, // Choctaw
	iso639_chp, // Chipewyan
	iso639_chq, // Quiotepec Chinantec
	iso639_chr, // Cherokee
	iso639_cht, // Cholón
	iso639_chu, // Church Slavic
	iso639_chv, // Chuvash
	iso639_chw, // Chuwabu
	iso639_chx, // Chantyal
	iso639_chy, // Cheyenne
	iso639_chz, // Ozumacín Chinantec
	iso639_cia, // Cia-Cia
	iso639_cib, // Ci Gbe
	iso639_cic, // Chickasaw
	iso639_cid, // Chimariko
	iso639_cie, // Cineni
	iso639_cih, // Chinali
	iso639_cik, // Chitkuli Kinnauri
	iso639_cim, // Cimbrian
	iso639_cin, // Cinta Larga
	iso639_cip, // Chiapanec
	iso639_cir, // Tiri
	iso639_ciw, // Chippewa
	iso639_ciy, // Chaima
	iso639_cja, // Western Cham
	iso639_cje, // Chru
	iso639_cjh, // Upper Chehalis
	iso639_cji, // Chamalal
	iso639_cjk, // Chokwe
	iso639_cjm, // Eastern Cham
	iso639_cjn, // Chenapian
	iso639_cjo, // Ashéninka Pajonal
	iso639_cjp, // Cabécar
	iso639_cjs, // Shor
	iso639_cjv, // Chuave
	iso639_cjy, // Jinyu Chinese
	iso639_ckb, // Central Kurdish
	iso639_ckh, // Chak
	iso639_ckl, // Cibak
	iso639_ckn, // Kaang Chin
	iso639_cko, // Anufo
	iso639_ckq, // Kajakse
	iso639_ckr, // Kairak
	iso639_cks, // Tayo
	iso639_ckt, // Chukot
	iso639_cku, // Koasati
	iso639_ckv, // Kavalan
	iso639_ckx, // Caka
	iso639_cky, // Cakfem-Mushere
	iso639_ckz, // Cakchiquel-Quiché Mixed Language
	iso639_cla, // Ron
	iso639_clc, // Chilcotin
	iso639_cld, // Chaldean Neo-Aramaic
	iso639_cle, // Lealao Chinantec
	iso639_clh, // Chilisso
	iso639_cli, // Chakali
	iso639_clj, // Laitu Chin
	iso639_clk, // Idu-Mishmi
	iso639_cll, // Chala
	iso639_clm, // Clallam
	iso639_clo, // Lowland Oaxaca Chontal
	iso639_clt, // Lautu Chin
	iso639_clu, // Caluyanun
	iso639_clw, // Chulym
	iso639_cly, // Eastern Highland Chatino
	iso639_cma, // Maa
	iso639_cme, // Cerma
	iso639_cmg, // Classical Mongolian
	iso639_cmi, // Emberá-Chamí
	iso639_cml, // Campalagian
	iso639_cmm, // Michigamea
	iso639_cmn, // Mandarin Chinese
	iso639_cmo, // Central Mnong
	iso639_cmr, // Mro-Khimi Chin
	iso639_cms, // Messapic
	iso639_cmt, // Camtho
	iso639_cna, // Changthang
	iso639_cnb, // Chinbon Chin
	iso639_cnc, // Côông
	iso639_cng, // Northern Qiang
	iso639_cnh, // Haka Chin
	iso639_cni, // Asháninka
	iso639_cnk, // Khumi Chin
	iso639_cnl, // Lalana Chinantec
	iso639_cno, // Con
	iso639_cns, // Central Asmat
	iso639_cnt, // Tepetotutla Chinantec
	iso639_cnu, // Chenoua
	iso639_cnw, // Ngawn Chin
	iso639_cnx, // Middle Cornish
	iso639_coa, // Cocos Islands Malay
	iso639_cob, // Chicomuceltec
	iso639_coc, // Cocopa
	iso639_cod, // Cocama-Cocamilla
	iso639_coe, // Koreguaje
	iso639_cof, // Colorado
	iso639_cog, // Chong
	iso639_coh, // Chonyi-Dzihana-Kauma
	iso639_coj, // Cochimi
	iso639_cok, // Santa Teresa Cora
	iso639_col, // Columbia-Wenatchi
	iso639_com, // Comanche
	iso639_con, // Cofán
	iso639_coo, // Comox
	iso639_cop, // Coptic
	iso639_coq, // Coquille
	iso639_cor, // Cornish
	iso639_cos, // Corsican
	iso639_cot, // Caquinte
	iso639_cou, // Wamey
	iso639_cov, // Cao Miao
	iso639_cow, // Cowlitz
	iso639_cox, // Nanti
	iso639_coy, // Coyaima
	iso639_coz, // Chochotec
	iso639_cpa, // Palantla Chinantec
	iso639_cpb, // Ucayali-Yurúa Ashéninka
	iso639_cpc, // Ajyíninka Apurucayali
	iso639_cpg, // Cappadocian Greek
	iso639_cpi, // Chinese Pidgin English
	iso639_cpn, // Cherepon
	iso639_cps, // Capiznon
	iso639_cpu, // Pichis Ashéninka
	iso639_cpx, // Pu-Xian Chinese
	iso639_cpy, // South Ucayali Ashéninka
	iso639_cqd, // Chuanqiandian Cluster Miao
	iso639_cqu, // Chilean Quechua
	iso639_cra, // Chara
	iso639_crb, // Island Carib
	iso639_crc, // Lonwolwol
	iso639_crd, // Coeur d'Alene
	iso639_cre, // Cree
	iso639_crf, // Caramanta
	iso639_crg, // Michif
	iso639_crh, // Crimean Tatar
	iso639_cri, // Sãotomense
	iso639_crj, // Southern East Cree
	iso639_crk, // Plains Cree
	iso639_crl, // Northern East Cree
	iso639_crm, // Moose Cree
	iso639_crn, // El Nayar Cora
	iso639_cro, // Crow
	iso639_crq, // Iyo'wujwa Chorote
	iso639_crr, // Carolina Algonquian
	iso639_crs, // Seselwa Creole French
	iso639_crt, // Iyojwa'ja Chorote
	iso639_crv, // Chaura
	iso639_crw, // Chrau
	iso639_crx, // Carrier
	iso639_cry, // Cori
	iso639_crz, // Cruzeño
	iso639_csa, // Chiltepec Chinantec
	iso639_csb, // Kashubian
	iso639_csc, // Catalan Sign Language
	iso639_csd, // Chiangmai Sign Language
	iso639_cse, // Czech Sign Language
	iso639_csf, // Cuba Sign Language
	iso639_csg, // Chilean Sign Language
	iso639_csh, // Asho Chin
	iso639_csi, // Coast Miwok
	iso639_csk, // Jola-Kasa
	iso639_csl, // Chinese Sign Language
	iso639_csm, // Central Sierra Miwok
	iso639_csn, // Colombian Sign Language
	iso639_cso, // Sochiapam Chinantec
	iso639_csq, // Croatia Sign Language
	iso639_csr, // Costa Rican Sign Language
	iso639_css, // Southern Ohlone
	iso639_cst, // Northern Ohlone
	iso639_csv, // Sumtu Chin
	iso639_csw, // Swampy Cree
	iso639_csy, // Siyin Chin
	iso639_csz, // Coos
	iso639_cta, // Tataltepec Chatino
	iso639_ctc, // Chetco
	iso639_ctd, // Tedim Chin
	iso639_cte, // Tepinapa Chinantec
	iso639_ctg, // Chittagonian
	iso639_cth, // Thaiphum Chin
	iso639_ctl, // Tlacoatzintepec Chinantec
	iso639_ctm, // Chitimacha
	iso639_ctn, // Chhintange
	iso639_cto, // Emberá-Catío
	iso639_ctp, // Western Highland Chatino
	iso639_cts, // Northern Catanduanes Bikol
	iso639_ctt, // Wayanad Chetti
	iso639_ctu, // Chol
	iso639_ctz, // Zacatepec Chatino
	iso639_cua, // Cua
	iso639_cub, // Cubeo
	iso639_cuc, // Usila Chinantec
	iso639_cug, // Cung
	iso639_cuh, // Chuka
	iso639_cui, // Cuiba
	iso639_cuj, // Mashco Piro
	iso639_cuk, // San Blas Kuna
	iso639_cul, // Culina
	iso639_cum, // Cumeral
	iso639_cuo, // Cumanagoto
	iso639_cup, // Cupeño
	iso639_cuq, // Cun
	iso639_cur, // Chhulung
	iso639_cut, // Teutila Cuicatec
	iso639_cuu, // Tai Ya
	iso639_cuv, // Cuvok
	iso639_cuw, // Chukwa
	iso639_cux, // Tepeuxila Cuicatec
	iso639_cvg, // Chug
	iso639_cvn, // Valle Nacional Chinantec
	iso639_cwa, // Kabwa
	iso639_cwb, // Maindo
	iso639_cwd, // Woods Cree
	iso639_cwe, // Kwere
	iso639_cwg, // Chewong
	iso639_cwt, // Kuwaataay
	iso639_cya, // Nopala Chatino
	iso639_cyb, // Cayubaba
	iso639_cym, // Welsh
	iso639_cyo, // Cuyonon
	iso639_czh, // Huizhou Chinese
	iso639_czk, // Knaanic
	iso639_czn, // Zenzontepec Chatino
	iso639_czo, // Min Zhong Chinese
	iso639_czt, // Zotung Chin
	iso639_daa, // Dangaléat
	iso639_dac, // Dambi
	iso639_dad, // Marik
	iso639_dae, // Duupa
	iso639_daf, // Dan
	iso639_dag, // Dagbani
	iso639_dah, // Gwahatike
	iso639_dai, // Day
	iso639_daj, // Dar Fur Daju
	iso639_dak, // Dakota
	iso639_dal, // Dahalo
	iso639_dam, // Damakawa
	iso639_dan, // Danish
	iso639_dao, // Daai Chin
	iso639_daq, // Dandami Maria
	iso639_dar, // Dargwa
	iso639_das, // Daho-Doo
	iso639_dau, // Dar Sila Daju
	iso639_dav, // Taita
	iso639_daw, // Davawenyo
	iso639_dax, // Dayi
	iso639_daz, // Dao
	iso639_dba, // Bangi Me
	iso639_dbb, // Deno
	iso639_dbd, // Dadiya
	iso639_dbe, // Dabe
	iso639_dbf, // Edopi
	iso639_dbg, // Dogul Dom Dogon
	iso639_dbi, // Doka
	iso639_dbj, // Ida'an
	iso639_dbl, // Dyirbal
	iso639_dbm, // Duguri
	iso639_dbn, // Duriankere
	iso639_dbo, // Dulbu
	iso639_dbp, // Duwai
	iso639_dbq, // Daba
	iso639_dbr, // Dabarre
	iso639_dbt, // Ben Tey Dogon
	iso639_dbu, // Bondum Dom Dogon
	iso639_dbv, // Dungu
	iso639_dbw, // Bankan Tey Dogon
	iso639_dby, // Dibiyaso
	iso639_dcc, // Deccan
	iso639_dcr, // Negerhollands
	iso639_dda, // Dadi Dadi
	iso639_ddd, // Dongotono
	iso639_dde, // Doondo
	iso639_ddg, // Fataluku
	iso639_ddi, // West Goodenough
	iso639_ddj, // Jaru
	iso639_ddn, // Dendi (Benin)
	iso639_ddo, // Dido
	iso639_ddr, // Dhudhuroa
	iso639_dds, // Donno So Dogon
	iso639_ddw, // Dawera-Daweloor
	iso639_dec, // Dagik
	iso639_ded, // Dedua
	iso639_dee, // Dewoin
	iso639_def, // Dezfuli
	iso639_deg, // Degema
	iso639_deh, // Dehwari
	iso639_dei, // Demisa
	iso639_dek, // Dek
	iso639_del, // Delaware
	iso639_dem, // Dem
	iso639_den, // Slave (Athapascan)
	iso639_dep, // Pidgin Delaware
	iso639_deq, // Dendi (Central African Republic)
	iso639_der, // Deori
	iso639_des, // Desano
	iso639_deu, // German
	iso639_dev, // Domung
	iso639_dez, // Dengese
	iso639_dga, // Southern Dagaare
	iso639_dgb, // Bunoge Dogon
	iso639_dgc, // Casiguran Dumagat Agta
	iso639_dgd, // Dagaari Dioula
	iso639_dge, // Degenan
	iso639_dgg, // Doga
	iso639_dgh, // Dghwede
	iso639_dgi, // Northern Dagara
	iso639_dgk, // Dagba
	iso639_dgl, // Andaandi
	iso639_dgn, // Dagoman
	iso639_dgo, // Dogri (individual language)
	iso639_dgr, // Dogrib
	iso639_dgs, // Dogoso
	iso639_dgt, // Ndrag'ngith
	iso639_dgu, // Degaru
	iso639_dgw, // Daungwurrung
	iso639_dgx, // Doghoro
	iso639_dgz, // Daga
	iso639_dhd, // Dhundari
	iso639_dhg, // Dhangu
	iso639_dhi, // Dhimal
	iso639_dhl, // Dhalandji
	iso639_dhm, // Zemba
	iso639_dhn, // Dhanki
	iso639_dho, // Dhodia
	iso639_dhr, // Dhargari
	iso639_dhs, // Dhaiso
	iso639_dhu, // Dhurga
	iso639_dhv, // Dehu
	iso639_dhw, // Dhanwar (Nepal)
	iso639_dia, // Dia
	iso639_dib, // South Central Dinka
	iso639_dic, // Lakota Dida
	iso639_did, // Didinga
	iso639_dif, // Dieri
	iso639_dig, // Digo
	iso639_dih, // Kumiai
	iso639_dii, // Dimbong
	iso639_dij, // Dai
	iso639_dik, // Southwestern Dinka
	iso639_dil, // Dilling
	iso639_dim, // Dime
	iso639_din, // Dinka
	iso639_dio, // Dibo
	iso639_dip, // Northeastern Dinka
	iso639_diq, // Dimli (individual language)
	iso639_dir, // Dirim
	iso639_dis, // Dimasa
	iso639_dit, // Dirari
	iso639_diu, // Diriku
	iso639_div, // Dhivehi
	iso639_diw, // Northwestern Dinka
	iso639_dix, // Dixon Reef
	iso639_diy, // Diuwe
	iso639_diz, // Ding
	iso639_dja, // Djadjawurrung
	iso639_djb, // Djinba
	iso639_djc, // Dar Daju Daju
	iso639_djd, // Djamindjung
	iso639_dje, // Zarma
	iso639_djf, // Djangun
	iso639_dji, // Djinang
	iso639_djj, // Djeebbana
	iso639_djk, // Eastern Maroon Creole
	iso639_djl, // Djiwarli
	iso639_djm, // Jamsay Dogon
	iso639_djn, // Djauan
	iso639_djo, // Jangkang
	iso639_djr, // Djambarrpuyngu
	iso639_dju, // Kapriman
	iso639_djw, // Djawi
	iso639_dka, // Dakpakha
	iso639_dkk, // Dakka
	iso639_dkr, // Kuijau
	iso639_dks, // Southeastern Dinka
	iso639_dkx, // Mazagway
	iso639_dlg, // Dolgan
	iso639_dlm, // Dalmatian
	iso639_dln, // Darlong
	iso639_dma, // Duma
	iso639_dmb, // Mombo Dogon
	iso639_dmc, // Dimir
	iso639_dmd, // Madhi Madhi
	iso639_dme, // Dugwor
	iso639_dmg, // Upper Kinabatangan
	iso639_dmk, // Domaaki
	iso639_dml, // Dameli
	iso639_dmm, // Dama
	iso639_dmo, // Kemedzung
	iso639_dmr, // East Damar
	iso639_dms, // Dampelas
	iso639_dmu, // Dubu
	iso639_dmv, // Dumpas
	iso639_dmx, // Dema
	iso639_dmy, // Demta
	iso639_dna, // Upper Grand Valley Dani
	iso639_dnd, // Daonda
	iso639_dne, // Ndendeule
	iso639_dng, // Dungan
	iso639_dni, // Lower Grand Valley Dani
	iso639_dnk, // Dengka
	iso639_dnn, // Dzùùngoo
	iso639_dnr, // Danaru
	iso639_dnt, // Mid Grand Valley Dani
	iso639_dnu, // Danau
	iso639_dnv, // Danu
	iso639_dnw, // Western Dani
	iso639_dny, // Dení
	iso639_doa, // Dom
	iso639_dob, // Dobu
	iso639_doc, // Northern Dong
	iso639_doe, // Doe
	iso639_dof, // Domu
	iso639_doh, // Dong
	iso639_doi, // Dogri (macrolanguage)
	iso639_dok, // Dondo
	iso639_dol, // Doso
	iso639_don, // Toura (Papua New Guinea)
	iso639_doo, // Dongo
	iso639_dop, // Lukpa
	iso639_doq, // Dominican Sign Language
	iso639_dor, // Dori'o
	iso639_dos, // Dogosé
	iso639_dot, // Dass
	iso639_dov, // Dombe
	iso639_dow, // Doyayo
	iso639_dox, // Bussa
	iso639_doy, // Dompo
	iso639_doz, // Dorze
	iso639_dpp, // Papar
	iso639_drb, // Dair
	iso639_drc, // Minderico
	iso639_drd, // Darmiya
	iso639_dre, // Dolpo
	iso639_drg, // Rungus
	iso639_dri, // C'lela
	iso639_drl, // Paakantyi
	iso639_drn, // West Damar
	iso639_dro, // Daro-Matu Melanau
	iso639_drq, // Dura
	iso639_drr, // Dororo
	iso639_drs, // Gedeo
	iso639_drt, // Drents
	iso639_dru, // Rukai
	iso639_dry, // Darai
	iso639_dsb, // Lower Sorbian
	iso639_dse, // Dutch Sign Language
	iso639_dsh, // Daasanach
	iso639_dsi, // Disa
	iso639_dsl, // Danish Sign Language
	iso639_dsn, // Dusner
	iso639_dso, // Desiya
	iso639_dsq, // Tadaksahak
	iso639_dta, // Daur
	iso639_dtb, // Labuk-Kinabatangan Kadazan
	iso639_dtd, // Ditidaht
	iso639_dth, // Adithinngithigh
	iso639_dti, // Ana Tinga Dogon
	iso639_dtk, // Tene Kan Dogon
	iso639_dtm, // Tomo Kan Dogon
	iso639_dto, // Tommo So Dogon
	iso639_dtp, // Central Dusun
	iso639_dtr, // Lotud
	iso639_dts, // Toro So Dogon
	iso639_dtt, // Toro Tegu Dogon
	iso639_dtu, // Tebul Ure Dogon
	iso639_dty, // Dotyali
	iso639_dua, // Duala
	iso639_dub, // Dubli
	iso639_duc, // Duna
	iso639_dud, // Hun-Saare
	iso639_due, // Umiray Dumaget Agta
	iso639_duf, // Dumbea
	iso639_dug, // Duruma
	iso639_duh, // Dungra Bhil
	iso639_dui, // Dumun
	iso639_duj, // Dhuwal
	iso639_duk, // Uyajitaya
	iso639_dul, // Alabat Island Agta
	iso639_dum, // Middle Dutch
	iso639_dun, // Dusun Deyah
	iso639_duo, // Dupaninan Agta
	iso639_dup, // Duano
	iso639_duq, // Dusun Malang
	iso639_dur, // Dii
	iso639_dus, // Dumi
	iso639_duu, // Drung
	iso639_duv, // Duvle
	iso639_duw, // Dusun Witu
	iso639_dux, // Duungooma
	iso639_duy, // Dicamay Agta
	iso639_duz, // Duli
	iso639_dva, // Duau
	iso639_dwa, // Diri
	iso639_dwr, // Dawro
	iso639_dws, // Dutton World Speedwords
	iso639_dww, // Dawawa
	iso639_dya, // Dyan
	iso639_dyb, // Dyaberdyaber
	iso639_dyd, // Dyugun
	iso639_dyg, // Villa Viciosa Agta
	iso639_dyi, // Djimini Senoufo
	iso639_dym, // Yanda Dom Dogon
	iso639_dyn, // Dyangadi
	iso639_dyo, // Jola-Fonyi
	iso639_dyu, // Dyula
	iso639_dyy, // Dyaabugay
	iso639_dza, // Tunzu
	iso639_dzd, // Daza
	iso639_dzg, // Dazaga
	iso639_dzl, // Dzalakha
	iso639_dzn, // Dzando
	iso639_dzo, // Dzongkha
	iso639_ebg, // Ebughu
	iso639_ebk, // Eastern Bontok
	iso639_ebo, // Teke-Ebo
	iso639_ebr, // Ebrié
	iso639_ebu, // Embu
	iso639_ecr, // Eteocretan
	iso639_ecs, // Ecuadorian Sign Language
	iso639_ecy, // Eteocypriot
	iso639_eee, // E
	iso639_efa, // Efai
	iso639_efe, // Efe
	iso639_efi, // Efik
	iso639_ega, // Ega
	iso639_egl, // Emilian
	iso639_ego, // Eggon
	iso639_egy, // Egyptian
	iso639_ehu, // Ehueun
	iso639_eip, // Eipomek
	iso639_eit, // Eitiep
	iso639_eiv, // Askopan
	iso639_eja, // Ejamat
	iso639_eka, // Ekajuk
	iso639_eke, // Ekit
	iso639_ekg, // Ekari
	iso639_eki, // Eki
	iso639_ekk, // Standard Estonian
	iso639_ekl, // Kol (Bangladesh)
	iso639_ekm, // Elip
	iso639_eko, // Koti
	iso639_ekp, // Ekpeye
	iso639_ekr, // Yace
	iso639_eky, // Eastern Kayah
	iso639_ele, // Elepi
	iso639_elh, // El Hugeirat
	iso639_eli, // Nding
	iso639_elk, // Elkei
	iso639_ell, // Greek
	iso639_elm, // Eleme
	iso639_elo, // El Molo
	iso639_elu, // Elu
	iso639_elx, // Elamite
	iso639_ema, // Emai-Iuleha-Ora
	iso639_emb, // Embaloh
	iso639_eme, // Emerillon
	iso639_emg, // Eastern Meohang
	iso639_emi, // Mussau-Emira
	iso639_emk, // Eastern Maninkakan
	iso639_emm, // Mamulique
	iso639_emn, // Eman
	iso639_emo, // Emok
	iso639_emp, // Northern Emberá
	iso639_ems, // Pacific Gulf Yupik
	iso639_emu, // Eastern Muria
	iso639_emw, // Emplawas
	iso639_emx, // Erromintxela
	iso639_emy, // Epigraphic Mayan
	iso639_ena, // Apali
	iso639_enb, // Markweeta
	iso639_enc, // En
	iso639_end, // Ende
	iso639_enf, // Forest Enets
	iso639_eng, // English
	iso639_enh, // Tundra Enets
	iso639_enm, // Middle English
	iso639_enn, // Engenni
	iso639_eno, // Enggano
	iso639_enq, // Enga
	iso639_enr, // Emumu
	iso639_enu, // Enu
	iso639_env, // Enwan (Edu State)
	iso639_enw, // Enwan (Akwa Ibom State)
	iso639_eot, // Beti (Côte d'Ivoire)
	iso639_epi, // Epie
	iso639_epo, // Esperanto
	iso639_era, // Eravallan
	iso639_erg, // Sie
	iso639_erh, // Eruwa
	iso639_eri, // Ogea
	iso639_erk, // South Efate
	iso639_ero, // Horpa
	iso639_err, // Erre
	iso639_ers, // Ersu
	iso639_ert, // Eritai
	iso639_erw, // Erokwanas
	iso639_ese, // Ese Ejja
	iso639_esh, // Eshtehardi
	iso639_esi, // North Alaskan Inupiatun
	iso639_esk, // Northwest Alaska Inupiatun
	iso639_esl, // Egypt Sign Language
	iso639_esm, // Esuma
	iso639_esn, // Salvadoran Sign Language
	iso639_eso, // Estonian Sign Language
	iso639_esq, // Esselen
	iso639_ess, // Central Siberian Yupik
	iso639_est, // Estonian
	iso639_esu, // Central Yupik
	iso639_etb, // Etebi
	iso639_etc, // Etchemin
	iso639_eth, // Ethiopian Sign Language
	iso639_etn, // Eton (Vanuatu)
	iso639_eto, // Eton (Cameroon)
	iso639_etr, // Edolo
	iso639_ets, // Yekhee
	iso639_ett, // Etruscan
	iso639_etu, // Ejagham
	iso639_etx, // Eten
	iso639_etz, // Semimi
	iso639_eus, // Basque
	iso639_eve, // Even
	iso639_evh, // Uvbie
	iso639_evn, // Evenki
	iso639_ewe, // Ewe
	iso639_ewo, // Ewondo
	iso639_ext, // Extremaduran
	iso639_eya, // Eyak
	iso639_eyo, // Keiyo
	iso639_eze, // Uzekwe
	iso639_faa, // Fasu
	iso639_fab, // Fa D'ambu
	iso639_fad, // Wagi
	iso639_faf, // Fagani
	iso639_fag, // Finongan
	iso639_fah, // Baissa Fali
	iso639_fai, // Faiwol
	iso639_faj, // Faita
	iso639_fak, // Fang (Cameroon)
	iso639_fal, // South Fali
	iso639_fam, // Fam
	iso639_fan, // Fang (Equatorial Guinea)
	iso639_fao, // Faroese
	iso639_fap, // Palor
	iso639_far, // Fataleka
	iso639_fas, // Persian
	iso639_fat, // Fanti
	iso639_fau, // Fayu
	iso639_fax, // Fala
	iso639_fay, // Southwestern Fars
	iso639_faz, // Northwestern Fars
	iso639_fbl, // West Albay Bikol
	iso639_fcs, // Quebec Sign Language
	iso639_fer, // Feroge
	iso639_ffi, // Foia Foia
	iso639_ffm, // Maasina Fulfulde
	iso639_fgr, // Fongoro
	iso639_fia, // Nobiin
	iso639_fie, // Fyer
	iso639_fij, // Fijian
	iso639_fil, // Filipino
	iso639_fin, // Finnish
	iso639_fip, // Fipa
	iso639_fir, // Firan
	iso639_fit, // Tornedalen Finnish
	iso639_fiw, // Fiwaga
	iso639_fkk, // Kirya-Konzəl
	iso639_fkv, // Kven Finnish
	iso639_fla, // Kalispel-Pend d'Oreille
	iso639_flh, // Foau
	iso639_fli, // Fali
	iso639_fll, // North Fali
	iso639_fln, // Flinders Island
	iso639_flr, // Fuliiru
	iso639_fly, // Tsotsitaal
	iso639_fmp, // Fe'fe'
	iso639_fmu, // Far Western Muria
	iso639_fng, // Fanagalo
	iso639_fni, // Fania
	iso639_fod, // Foodo
	iso639_foi, // Foi
	iso639_fom, // Foma
	iso639_fon, // Fon
	iso639_for, // Fore
	iso639_fos, // Siraya
	iso639_fpe, // Fernando Po Creole English
	iso639_fqs, // Fas
	iso639_fra, // French
	iso639_frc, // Cajun French
	iso639_frd, // Fordata
	iso639_frk, // Frankish
	iso639_frm, // Middle French
	iso639_fro, // Old French
	iso639_frp, // Arpitan
	iso639_frq, // Forak
	iso639_frr, // Northern Frisian
	iso639_frs, // Eastern Frisian
	iso639_frt, // Fortsenal
	iso639_fry, // Western Frisian
	iso639_fse, // Finnish Sign Language
	iso639_fsl, // French Sign Language
	iso639_fss, // Finland-Swedish Sign Language
	iso639_fub, // Adamawa Fulfulde
	iso639_fuc, // Pulaar
	iso639_fud, // East Futuna
	iso639_fue, // Borgu Fulfulde
	iso639_fuf, // Pular
	iso639_fuh, // Western Niger Fulfulde
	iso639_fui, // Bagirmi Fulfulde
	iso639_fuj, // Ko
	iso639_ful, // Fulah
	iso639_fum, // Fum
	iso639_fun, // Fulniô
	iso639_fuq, // Central-Eastern Niger Fulfulde
	iso639_fur, // Friulian
	iso639_fut, // Futuna-Aniwa
	iso639_fuu, // Furu
	iso639_fuv, // Nigerian Fulfulde
	iso639_fuy, // Fuyug
	iso639_fvr, // Fur
	iso639_fwa, // Fwâi
	iso639_fwe, // Fwe
	iso639_gaa, // Ga
	iso639_gab, // Gabri
	iso639_gac, // Mixed Great Andamanese
	iso639_gad, // Gaddang
	iso639_gae, // Guarequena
	iso639_gaf, // Gende
	iso639_gag, // Gagauz
	iso639_gah, // Alekano
	iso639_gai, // Borei
	iso639_gaj, // Gadsup
	iso639_gak, // Gamkonora
	iso639_gal, // Galoli
	iso639_gam, // Kandawo
	iso639_gan, // Gan Chinese
	iso639_gao, // Gants
	iso639_gap, // Gal
	iso639_gaq, // Gata'
	iso639_gar, // Galeya
	iso639_gas, // Adiwasi Garasia
	iso639_gat, // Kenati
	iso639_gau, // Mudhili Gadaba
	iso639_gaw, // Nobonob
	iso639_gax, // Borana-Arsi-Guji Oromo
	iso639_gay, // Gayo
	iso639_gaz, // West Central Oromo
	iso639_gba, // Gbaya (Central African Republic)
	iso639_gbb, // Kaytetye
	iso639_gbd, // Karadjeri
	iso639_gbe, // Niksek
	iso639_gbf, // Gaikundi
	iso639_gbg, // Gbanziri
	iso639_gbh, // Defi Gbe
	iso639_gbi, // Galela
	iso639_gbj, // Bodo Gadaba
	iso639_gbk, // Gaddi
	iso639_gbl, // Gamit
	iso639_gbm, // Garhwali
	iso639_gbn, // Mo'da
	iso639_gbo, // Northern Grebo
	iso639_gbp, // Gbaya-Bossangoa
	iso639_gbq, // Gbaya-Bozoum
	iso639_gbr, // Gbagyi
	iso639_gbs, // Gbesi Gbe
	iso639_gbu, // Gagadu
	iso639_gbv, // Gbanu
	iso639_gbx, // Eastern Xwla Gbe
	iso639_gby, // Gbari
	iso639_gbz, // Zoroastrian Dari
	iso639_gcc, // Mali
	iso639_gcd, // Ganggalida
	iso639_gce, // Galice
	iso639_gcf, // Guadeloupean Creole French
	iso639_gcl, // Grenadian Creole English
	iso639_gcn, // Gaina
	iso639_gcr, // Guianese Creole French
	iso639_gct, // Colonia Tovar German
	iso639_gda, // Gade Lohar
	iso639_gdb, // Pottangi Ollar Gadaba
	iso639_gdc, // Gugu Badhun
	iso639_gdd, // Gedaged
	iso639_gde, // Gude
	iso639_gdf, // Guduf-Gava
	iso639_gdg, // Ga'dang
	iso639_gdh, // Gadjerawang
	iso639_gdi, // Gundi
	iso639_gdj, // Gurdjar
	iso639_gdk, // Gadang
	iso639_gdl, // Dirasha
	iso639_gdm, // Laal
	iso639_gdn, // Umanakaina
	iso639_gdo, // Ghodoberi
	iso639_gdq, // Mehri
	iso639_gdr, // Wipi
	iso639_gds, // Ghandruk Sign Language
	iso639_gdu, // Gudu
	iso639_gdx, // Godwari
	iso639_gea, // Geruma
	iso639_geb, // Kire
	iso639_gec, // Gboloo Grebo
	iso639_ged, // Gade
	iso639_geg, // Gengle
	iso639_geh, // Hutterite German
	iso639_gei, // Gebe
	iso639_gej, // Gen
	iso639_gek, // Yiwom
	iso639_gel, // ut-Ma'in
	iso639_geq, // Geme
	iso639_ges, // Geser-Gorom
	iso639_gew, // Gera
	iso639_gex, // Garre
	iso639_gey, // Enya
	iso639_gez, // Geez
	iso639_gfk, // Patpatar
	iso639_gft, // Gafat
	iso639_gfx, // Mangetti Dune !Xung
	iso639_gga, // Gao
	iso639_ggb, // Gbii
	iso639_ggd, // Gugadj
	iso639_gge, // Guragone
	iso639_ggg, // Gurgula
	iso639_ggk, // Kungarakany
	iso639_ggl, // Ganglau
	iso639_ggn, // Eastern Gurung
	iso639_ggo, // Southern Gondi
	iso639_ggr, // Aghu Tharnggalu
	iso639_ggt, // Gitua
	iso639_ggu, // Gagu
	iso639_ggw, // Gogodala
	iso639_gha, // Ghadamès
	iso639_ghc, // Hiberno-Scottish Gaelic
	iso639_ghe, // Southern Ghale
	iso639_ghh, // Northern Ghale
	iso639_ghk, // Geko Karen
	iso639_ghl, // Ghulfan
	iso639_ghn, // Ghanongga
	iso639_gho, // Ghomara
	iso639_ghr, // Ghera
	iso639_ghs, // Guhu-Samane
	iso639_ght, // Kuke
	iso639_gia, // Kitja
	iso639_gib, // Gibanawa
	iso639_gic, // Gail
	iso639_gid, // Gidar
	iso639_gig, // Goaria
	iso639_gil, // Gilbertese
	iso639_gim, // Gimi (Eastern Highlands)
	iso639_gin, // Hinukh
	iso639_gip, // Gimi (West New Britain)
	iso639_giq, // Green Gelao
	iso639_gir, // Red Gelao
	iso639_gis, // North Giziga
	iso639_git, // Gitxsan
	iso639_giu, // Mulao
	iso639_giw, // White Gelao
	iso639_gix, // Gilima
	iso639_giy, // Giyug
	iso639_giz, // South Giziga
	iso639_gji, // Geji
	iso639_gjk, // Kachi Koli
	iso639_gjn, // Gonja
	iso639_gju, // Gujari
	iso639_gka, // Guya
	iso639_gke, // Ndai
	iso639_gkn, // Gokana
	iso639_gko, // Kok-Nar
	iso639_gkp, // Guinea Kpelle
	iso639_gla, // Scottish Gaelic
	iso639_glc, // Bon Gula
	iso639_gld, // Nanai
	iso639_gle, // Irish
	iso639_glg, // Galician
	iso639_glh, // Northwest Pashayi
	iso639_gli, // Guliguli
	iso639_glj, // Gula Iro
	iso639_glk, // Gilaki
	iso639_glo, // Galambu
	iso639_glr, // Glaro-Twabo
	iso639_glu, // Gula (Chad)
	iso639_glv, // Manx
	iso639_glw, // Glavda
	iso639_gly, // Gule
	iso639_gma, // Gambera
	iso639_gmb, // Gula'alaa
	iso639_gmd, // Mághdì
	iso639_gmh, // Middle High German
	iso639_gml, // Middle Low German
	iso639_gmm, // Gbaya-Mbodomo
	iso639_gmn, // Gimnime
	iso639_gmu, // Gumalu
	iso639_gmv, // Gamo
	iso639_gmx, // Magoma
	iso639_gmy, // Mycenaean Greek
	iso639_gna, // Kaansa
	iso639_gnb, // Gangte
	iso639_gnc, // Guanche
	iso639_gnd, // Zulgo-Gemzek
	iso639_gne, // Ganang
	iso639_gng, // Ngangam
	iso639_gnh, // Lere
	iso639_gni, // Gooniyandi
	iso639_gnk, // //Gana
	iso639_gnl, // Gangulu
	iso639_gnm, // Ginuman
	iso639_gnn, // Gumatj
	iso639_gno, // Northern Gondi
	iso639_gnq, // Gana
	iso639_gnr, // Gureng Gureng
	iso639_gnt, // Guntai
	iso639_gnu, // Gnau
	iso639_gnw, // Western Bolivian Guaraní
	iso639_gnz, // Ganzi
	iso639_goa, // Guro
	iso639_gob, // Playero
	iso639_goc, // Gorakor
	iso639_god, // Godié
	iso639_goe, // Gongduk
	iso639_gof, // Gofa
	iso639_gog, // Gogo
	iso639_goh, // Old High German
	iso639_goi, // Gobasi
	iso639_goj, // Gowlan
	iso639_gok, // Gowli
	iso639_gol, // Gola
	iso639_gom, // Goan Konkani
	iso639_gon, // Gondi
	iso639_goo, // Gone Dau
	iso639_gop, // Yeretuar
	iso639_goq, // Gorap
	iso639_gor, // Gorontalo
	iso639_gos, // Gronings
	iso639_got, // Gothic
	iso639_gou, // Gavar
	iso639_gow, // Gorowa
	iso639_gox, // Gobu
	iso639_goy, // Goundo
	iso639_goz, // Gozarkhani
	iso639_gpa, // Gupa-Abawa
	iso639_gpe, // Ghanaian Pidgin English
	iso639_gpn, // Taiap
	iso639_gqa, // Ga'anda
	iso639_gqi, // Guiqiong
	iso639_gqn, // Guana (Brazil)
	iso639_gqr, // Gor
	iso639_gqu, // Qau
	iso639_gra, // Rajput Garasia
	iso639_grb, // Grebo
	iso639_grc, // Ancient Greek
	iso639_grd, // Guruntum-Mbaaru
	iso639_grg, // Madi
	iso639_grh, // Gbiri-Niragu
	iso639_gri, // Ghari
	iso639_grj, // Southern Grebo
	iso639_grm, // Kota Marudu Talantang
	iso639_grn, // Guarani
	iso639_gro, // Groma
	iso639_grq, // Gorovu
	iso639_grr, // Taznatit
	iso639_grs, // Gresi
	iso639_grt, // Garo
	iso639_gru, // Kistane
	iso639_grv, // Central Grebo
	iso639_grw, // Gweda
	iso639_grx, // Guriaso
	iso639_gry, // Barclayville Grebo
	iso639_grz, // Guramalum
	iso639_gse, // Ghanaian Sign Language
	iso639_gsg, // German Sign Language
	iso639_gsl, // Gusilay
	iso639_gsm, // Guatemalan Sign Language
	iso639_gsn, // Gusan
	iso639_gso, // Southwest Gbaya
	iso639_gsp, // Wasembo
	iso639_gss, // Greek Sign Language
	iso639_gsw, // Swiss German
	iso639_gta, // Guató
	iso639_gti, // Gbati-ri
	iso639_gua, // Shiki
	iso639_gub, // Guajajára
	iso639_guc, // Wayuu
	iso639_gud, // Yocoboué Dida
	iso639_gue, // Gurinji
	iso639_guf, // Gupapuyngu
	iso639_gug, // Paraguayan Guaraní
	iso639_guh, // Guahibo
	iso639_gui, // Eastern Bolivian Guaraní
	iso639_guj, // Gujarati
	iso639_guk, // Gumuz
	iso639_gul, // Sea Island Creole English
	iso639_gum, // Guambiano
	iso639_gun, // Mbyá Guaraní
	iso639_guo, // Guayabero
	iso639_gup, // Gunwinggu
	iso639_guq, // Aché
	iso639_gur, // Farefare
	iso639_gus, // Guinean Sign Language
	iso639_gut, // Maléku Jaíka
	iso639_guu, // Yanomamö
	iso639_guv, // Gey
	iso639_guw, // Gun
	iso639_gux, // Gourmanchéma
	iso639_guz, // Gusii
	iso639_gva, // Guana (Paraguay)
	iso639_gvc, // Guanano
	iso639_gve, // Duwet
	iso639_gvf, // Golin
	iso639_gvj, // Guajá
	iso639_gvl, // Gulay
	iso639_gvm, // Gurmana
	iso639_gvn, // Kuku-Yalanji
	iso639_gvo, // Gavião Do Jiparaná
	iso639_gvp, // Pará Gavião
	iso639_gvr, // Western Gurung
	iso639_gvs, // Gumawana
	iso639_gvy, // Guyani
	iso639_gwa, // Mbato
	iso639_gwb, // Gwa
	iso639_gwc, // Kalami
	iso639_gwd, // Gawwada
	iso639_gwe, // Gweno
	iso639_gwf, // Gowro
	iso639_gwg, // Moo
	iso639_gwi, // Gwichʼin
	iso639_gwj, // /Gwi
	iso639_gwm, // Awngthim
	iso639_gwn, // Gwandara
	iso639_gwr, // Gwere
	iso639_gwt, // Gawar-Bati
	iso639_gwu, // Guwamu
	iso639_gww, // Kwini
	iso639_gwx, // Gua
	iso639_gxx, // Wè Southern
	iso639_gya, // Northwest Gbaya
	iso639_gyb, // Garus
	iso639_gyd, // Kayardild
	iso639_gye, // Gyem
	iso639_gyf, // Gungabula
	iso639_gyg, // Gbayi
	iso639_gyi, // Gyele
	iso639_gyl, // Gayil
	iso639_gym, // Ngäbere
	iso639_gyn, // Guyanese Creole English
	iso639_gyr, // Guarayu
	iso639_gyy, // Gunya
	iso639_gza, // Ganza
	iso639_gzi, // Gazi
	iso639_gzn, // Gane
	iso639_haa, // Han
	iso639_hab, // Hanoi Sign Language
	iso639_hac, // Gurani
	iso639_had, // Hatam
	iso639_hae, // Eastern Oromo
	iso639_haf, // Haiphong Sign Language
	iso639_hag, // Hanga
	iso639_hah, // Hahon
	iso639_hai, // Haida
	iso639_haj, // Hajong
	iso639_hak, // Hakka Chinese
	iso639_hal, // Halang
	iso639_ham, // Hewa
	iso639_han, // Hangaza
	iso639_hao, // Hakö
	iso639_hap, // Hupla
	iso639_haq, // Ha
	iso639_har, // Harari
	iso639_has, // Haisla
	iso639_hat, // Haitian
	iso639_hau, // Hausa
	iso639_hav, // Havu
	iso639_haw, // Hawaiian
	iso639_hax, // Southern Haida
	iso639_hay, // Haya
	iso639_haz, // Hazaragi
	iso639_hba, // Hamba
	iso639_hbb, // Huba
	iso639_hbn, // Heiban
	iso639_hbo, // Ancient Hebrew
	iso639_hbs, // Serbo-Croatian
	iso639_hbu, // Habu
	iso639_hca, // Andaman Creole Hindi
	iso639_hch, // Huichol
	iso639_hdn, // Northern Haida
	iso639_hds, // Honduras Sign Language
	iso639_hdy, // Hadiyya
	iso639_hea, // Northern Qiandong Miao
	iso639_heb, // Hebrew
	iso639_hed, // Herdé
	iso639_heg, // Helong
	iso639_heh, // Hehe
	iso639_hei, // Heiltsuk
	iso639_hem, // Hemba
	iso639_her, // Herero
	iso639_hgm, // Hai//om
	iso639_hgw, // Haigwai
	iso639_hhi, // Hoia Hoia
	iso639_hhr, // Kerak
	iso639_hhy, // Hoyahoya
	iso639_hia, // Lamang
	iso639_hib, // Hibito
	iso639_hid, // Hidatsa
	iso639_hif, // Fiji Hindi
	iso639_hig, // Kamwe
	iso639_hih, // Pamosu
	iso639_hii, // Hinduri
	iso639_hij, // Hijuk
	iso639_hik, // Seit-Kaitetu
	iso639_hil, // Hiligaynon
	iso639_hin, // Hindi
	iso639_hio, // Tsoa
	iso639_hir, // Himarimã
	iso639_hit, // Hittite
	iso639_hiw, // Hiw
	iso639_hix, // Hixkaryána
	iso639_hji, // Haji
	iso639_hka, // Kahe
	iso639_hke, // Hunde
	iso639_hkk, // Hunjara-Kaina Ke
	iso639_hks, // Hong Kong Sign Language
	iso639_hla, // Halia
	iso639_hlb, // Halbi
	iso639_hld, // Halang Doan
	iso639_hle, // Hlersu
	iso639_hlt, // Matu Chin
	iso639_hlu, // Hieroglyphic Luwian
	iso639_hma, // Southern Mashan Hmong
	iso639_hmb, // Humburi Senni Songhay
	iso639_hmc, // Central Huishui Hmong
	iso639_hmd, // Large Flowery Miao
	iso639_hme, // Eastern Huishui Hmong
	iso639_hmf, // Hmong Don
	iso639_hmg, // Southwestern Guiyang Hmong
	iso639_hmh, // Southwestern Huishui Hmong
	iso639_hmi, // Northern Huishui Hmong
	iso639_hmj, // Ge
	iso639_hmk, // Maek
	iso639_hml, // Luopohe Hmong
	iso639_hmm, // Central Mashan Hmong
	iso639_hmn, // Hmong
	iso639_hmo, // Hiri Motu
	iso639_hmp, // Northern Mashan Hmong
	iso639_hmq, // Eastern Qiandong Miao
	iso639_hmr, // Hmar
	iso639_hms, // Southern Qiandong Miao
	iso639_hmt, // Hamtai
	iso639_hmu, // Hamap
	iso639_hmv, // Hmong Dô
	iso639_hmw, // Western Mashan Hmong
	iso639_hmy, // Southern Guiyang Hmong
	iso639_hmz, // Hmong Shua
	iso639_hna, // Mina (Cameroon)
	iso639_hnd, // Southern Hindko
	iso639_hne, // Chhattisgarhi
	iso639_hnh, // //Ani
	iso639_hni, // Hani
	iso639_hnj, // Hmong Njua
	iso639_hnn, // Hanunoo
	iso639_hno, // Northern Hindko
	iso639_hns, // Caribbean Hindustani
	iso639_hnu, // Hung
	iso639_hoa, // Hoava
	iso639_hob, // Mari (Madang Province)
	iso639_hoc, // Ho
	iso639_hod, // Holma
	iso639_hoe, // Horom
	iso639_hoh, // Hobyót
	iso639_hoi, // Holikachuk
	iso639_hoj, // Hadothi
	iso639_hol, // Holu
	iso639_hom, // Homa
	iso639_hoo, // Holoholo
	iso639_hop, // Hopi
	iso639_hor, // Horo
	iso639_hos, // Ho Chi Minh City Sign Language
	iso639_hot, // Hote
	iso639_hov, // Hovongan
	iso639_how, // Honi
	iso639_hoy, // Holiya
	iso639_hoz, // Hozo
	iso639_hpo, // Hpon
	iso639_hps, // Hawai'i Pidgin Sign Language
	iso639_hra, // Hrangkhol
	iso639_hre, // Hre
	iso639_hrk, // Haruku
	iso639_hrm, // Horned Miao
	iso639_hro, // Haroi
	iso639_hrt, // Hértevin
	iso639_hru, // Hruso
	iso639_hrv, // Croatian
	iso639_hrx, // Hunsrik
	iso639_hrz, // Harzani
	iso639_hsb, // Upper Sorbian
	iso639_hsh, // Hungarian Sign Language
	iso639_hsl, // Hausa Sign Language
	iso639_hsn, // Xiang Chinese
	iso639_hss, // Harsusi
	iso639_hti, // Hoti
	iso639_hto, // Minica Huitoto
	iso639_hts, // Hadza
	iso639_htu, // Hitu
	iso639_htx, // Middle Hittite
	iso639_hub, // Huambisa
	iso639_huc, // =/Hua
	iso639_hud, // Huaulu
	iso639_hue, // San Francisco Del Mar Huave
	iso639_huf, // Humene
	iso639_hug, // Huachipaeri
	iso639_huh, // Huilliche
	iso639_hui, // Huli
	iso639_huj, // Northern Guiyang Hmong
	iso639_huk, // Hulung
	iso639_hul, // Hula
	iso639_hum, // Hungana
	iso639_hun, // Hungarian
	iso639_huo, // Hu
	iso639_hup, // Hupa
	iso639_huq, // Tsat
	iso639_hur, // Halkomelem
	iso639_hus, // Huastec
	iso639_hut, // Humla
	iso639_huu, // Murui Huitoto
	iso639_huv, // San Mateo Del Mar Huave
	iso639_huw, // Hukumina
	iso639_hux, // Nüpode Huitoto
	iso639_huy, // Hulaulá
	iso639_huz, // Hunzib
	iso639_hvc, // Haitian Vodoun Culture Language
	iso639_hve, // San Dionisio Del Mar Huave
	iso639_hvk, // Haveke
	iso639_hvn, // Sabu
	iso639_hvv, // Santa María Del Mar Huave
	iso639_hwa, // Wané
	iso639_hwc, // Hawai'i Creole English
	iso639_hwo, // Hwana
	iso639_hya, // Hya
	iso639_hye, // Armenian
	iso639_iai, // Iaai
	iso639_ian, // Iatmul
	iso639_iap, // Iapama
	iso639_iar, // Purari
	iso639_iba, // Iban
	iso639_ibb, // Ibibio
	iso639_ibd, // Iwaidja
	iso639_ibe, // Akpes
	iso639_ibg, // Ibanag
	iso639_ibl, // Ibaloi
	iso639_ibm, // Agoi
	iso639_ibn, // Ibino
	iso639_ibo, // Igbo
	iso639_ibr, // Ibuoro
	iso639_ibu, // Ibu
	iso639_iby, // Ibani
	iso639_ica, // Ede Ica
	iso639_ich, // Etkywan
	iso639_icl, // Icelandic Sign Language
	iso639_icr, // Islander Creole English
	iso639_ida, // Idakho-Isukha-Tiriki
	iso639_idb, // Indo-Portuguese
	iso639_idc, // Idon
	iso639_idd, // Ede Idaca
	iso639_ide, // Idere
	iso639_idi, // Idi
	iso639_ido, // Ido
	iso639_idr, // Indri
	iso639_ids, // Idesa
	iso639_idt, // Idaté
	iso639_idu, // Idoma
	iso639_ifa, // Amganad Ifugao
	iso639_ifb, // Batad Ifugao
	iso639_ife, // Ifè
	iso639_iff, // Ifo
	iso639_ifk, // Tuwali Ifugao
	iso639_ifm, // Teke-Fuumu
	iso639_ifu, // Mayoyao Ifugao
	iso639_ify, // Keley-I Kallahan
	iso639_igb, // Ebira
	iso639_ige, // Igede
	iso639_igg, // Igana
	iso639_igl, // Igala
	iso639_igm, // Kanggape
	iso639_ign, // Ignaciano
	iso639_igo, // Isebe
	iso639_igs, // Interglossa
	iso639_igw, // Igwe
	iso639_ihb, // Iha Based Pidgin
	iso639_ihi, // Ihievbe
	iso639_ihp, // Iha
	iso639_ihw, // Bidhawal
	iso639_iii, // Sichuan Yi
	iso639_ijc, // Izon
	iso639_ije, // Biseni
	iso639_ijj, // Ede Ije
	iso639_ijn, // Kalabari
	iso639_ijs, // Southeast Ijo
	iso639_ike, // Eastern Canadian Inuktitut
	iso639_iki, // Iko
	iso639_ikk, // Ika
	iso639_ikl, // Ikulu
	iso639_iko, // Olulumo-Ikom
	iso639_ikp, // Ikpeshi
	iso639_ikt, // Inuinnaqtun
	iso639_iku, // Inuktitut
	iso639_ikv, // Iku-Gora-Ankwa
	iso639_ikw, // Ikwere
	iso639_ikx, // Ik
	iso639_ikz, // Ikizu
	iso639_ila, // Ile Ape
	iso639_ilb, // Ila
	iso639_ile, // Interlingue
	iso639_ilg, // Garig-Ilgar
	iso639_ili, // Ili Turki
	iso639_ilk, // Ilongot
	iso639_ill, // Iranun
	iso639_ilo, // Iloko
	iso639_ils, // International Sign
	iso639_ilu, // Ili'uun
	iso639_ilv, // Ilue
	iso639_ilw, // Talur
	iso639_ima, // Mala Malasar
	iso639_ime, // Imeraguen
	iso639_imi, // Anamgura
	iso639_iml, // Miluk
	iso639_imn, // Imonda
	iso639_imo, // Imbongu
	iso639_imr, // Imroing
	iso639_ims, // Marsian
	iso639_imy, // Milyan
	iso639_ina, // Interlingua
	iso639_inb, // Inga
	iso639_ind, // Indonesian
	iso639_ing, // Degexit'an
	iso639_inh, // Ingush
	iso639_inj, // Jungle Inga
	iso639_inl, // Indonesian Sign Language
	iso639_inm, // Minaean
	iso639_inn, // Isinai
	iso639_ino, // Inoke-Yate
	iso639_inp, // Iñapari
	iso639_ins, // Indian Sign Language
	iso639_int, // Intha
	iso639_inz, // Ineseño
	iso639_ior, // Inor
	iso639_iou, // Tuma-Irumu
	iso639_iow, // Iowa-Oto
	iso639_ipi, // Ipili
	iso639_ipk, // Inupiaq
	iso639_ipo, // Ipiko
	iso639_iqu, // Iquito
	iso639_ire, // Iresim
	iso639_irh, // Irarutu
	iso639_iri, // Irigwe
	iso639_irk, // Iraqw
	iso639_irn, // Irántxe
	iso639_irr, // Ir
	iso639_iru, // Irula
	iso639_irx, // Kamberau
	iso639_iry, // Iraya
	iso639_isa, // Isabi
	iso639_isc, // Isconahua
	iso639_isd, // Isnag
	iso639_ise, // Italian Sign Language
	iso639_isg, // Irish Sign Language
	iso639_ish, // Esan
	iso639_isi, // Nkem-Nkum
	iso639_isk, // Ishkashimi
	iso639_isl, // Icelandic
	iso639_ism, // Masimasi
	iso639_isn, // Isanzu
	iso639_iso, // Isoko
	iso639_isr, // Israeli Sign Language
	iso639_ist, // Istriot
	iso639_isu, // Isu (Menchum Division)
	iso639_ita, // Italian
	iso639_itb, // Binongan Itneg
	iso639_ite, // Itene
	iso639_iti, // Inlaod Itneg
	iso639_itk, // Judeo-Italian
	iso639_itl, // Itelmen
	iso639_itm, // Itu Mbon Uzo
	iso639_ito, // Itonama
	iso639_itr, // Iteri
	iso639_its, // Isekiri
	iso639_itt, // Maeng Itneg
	iso639_itv, // Itawit
	iso639_itw, // Ito
	iso639_itx, // Itik
	iso639_ity, // Moyadan Itneg
	iso639_itz, // Itzá
	iso639_ium, // Iu Mien
	iso639_ivb, // Ibatan
	iso639_ivv, // Ivatan
	iso639_iwk, // I-Wak
	iso639_iwm, // Iwam
	iso639_iwo, // Iwur
	iso639_iws, // Sepik Iwam
	iso639_ixc, // Ixcatec
	iso639_ixl, // Ixil
	iso639_iya, // Iyayu
	iso639_iyo, // Mesaka
	iso639_iyx, // Yaka (Congo)
	iso639_izh, // Ingrian
	iso639_izi, // Izi-Ezaa-Ikwo-Mgbo
	iso639_izr, // Izere
	iso639_jaa, // Jamamadí
	iso639_jab, // Hyam
	iso639_jac, // Popti'
	iso639_jad, // Jahanka
	iso639_jae, // Yabem
	iso639_jaf, // Jara
	iso639_jah, // Jah Hut
	iso639_jaj, // Zazao
	iso639_jak, // Jakun
	iso639_jal, // Yalahatan
	iso639_jam, // Jamaican Creole English
	iso639_jan, // Jandai
	iso639_jao, // Yanyuwa
	iso639_jaq, // Yaqay
	iso639_jas, // New Caledonian Javanese
	iso639_jat, // Jakati
	iso639_jau, // Yaur
	iso639_jav, // Javanese
	iso639_jax, // Jambi Malay
	iso639_jay, // Yan-nhangu
	iso639_jaz, // Jawe
	iso639_jbe, // Judeo-Berber
	iso639_jbj, // Arandai
	iso639_jbk, // Barikewa
	iso639_jbn, // Nafusi
	iso639_jbo, // Lojban
	iso639_jbr, // Jofotek-Bromnya
	iso639_jbt, // Jabutí
	iso639_jbu, // Jukun Takum
	iso639_jbw, // Yawijibaya
	iso639_jcs, // Jamaican Country Sign Language
	iso639_jct, // Krymchak
	iso639_jda, // Jad
	iso639_jdg, // Jadgali
	iso639_jdt, // Judeo-Tat
	iso639_jeb, // Jebero
	iso639_jee, // Jerung
	iso639_jeg, // Jeng
	iso639_jeh, // Jeh
	iso639_jei, // Yei
	iso639_jek, // Jeri Kuo
	iso639_jel, // Yelmek
	iso639_jen, // Dza
	iso639_jer, // Jere
	iso639_jet, // Manem
	iso639_jeu, // Jonkor Bourmataguil
	iso639_jgb, // Ngbee
	iso639_jge, // Judeo-Georgian
	iso639_jgk, // Gwak
	iso639_jgo, // Ngomba
	iso639_jhi, // Jehai
	iso639_jhs, // Jhankot Sign Language
	iso639_jia, // Jina
	iso639_jib, // Jibu
	iso639_jic, // Tol
	iso639_jid, // Bu
	iso639_jie, // Jilbe
	iso639_jig, // Djingili
	iso639_jih, // sTodsde
	iso639_jii, // Jiiddu
	iso639_jil, // Jilim
	iso639_jim, // Jimi (Cameroon)
	iso639_jio, // Jiamao
	iso639_jiq, // Guanyinqiao
	iso639_jit, // Jita
	iso639_jiu, // Youle Jinuo
	iso639_jiv, // Shuar
	iso639_jiy, // Buyuan Jinuo
	iso639_jjr, // Bankal
	iso639_jkm, // Mobwa Karen
	iso639_jko, // Kubo
	iso639_jkp, // Paku Karen
	iso639_jkr, // Koro (India)
	iso639_jku, // Labir
	iso639_jle, // Ngile
	iso639_jls, // Jamaican Sign Language
	iso639_jma, // Dima
	iso639_jmb, // Zumbun
	iso639_jmc, // Machame
	iso639_jmd, // Yamdena
	iso639_jmi, // Jimi (Nigeria)
	iso639_jml, // Jumli
	iso639_jmn, // Makuri Naga
	iso639_jmr, // Kamara
	iso639_jms, // Mashi (Nigeria)
	iso639_jmw, // Mouwase
	iso639_jmx, // Western Juxtlahuaca Mixtec
	iso639_jna, // Jangshung
	iso639_jnd, // Jandavra
	iso639_jng, // Yangman
	iso639_jni, // Janji
	iso639_jnj, // Yemsa
	iso639_jnl, // Rawat
	iso639_jns, // Jaunsari
	iso639_job, // Joba
	iso639_jod, // Wojenaka
	iso639_jor, // Jorá
	iso639_jos, // Jordanian Sign Language
	iso639_jow, // Jowulu
	iso639_jpa, // Jewish Palestinian Aramaic
	iso639_jpn, // Japanese
	iso639_jpr, // Judeo-Persian
	iso639_jqr, // Jaqaru
	iso639_jra, // Jarai
	iso639_jrb, // Judeo-Arabic
	iso639_jrr, // Jiru
	iso639_jrt, // Jorto
	iso639_jru, // Japrería
	iso639_jsl, // Japanese Sign Language
	iso639_jua, // Júma
	iso639_jub, // Wannu
	iso639_juc, // Jurchen
	iso639_jud, // Worodougou
	iso639_juh, // Hõne
	iso639_jui, // Ngadjuri
	iso639_juk, // Wapan
	iso639_jul, // Jirel
	iso639_jum, // Jumjum
	iso639_jun, // Juang
	iso639_juo, // Jiba
	iso639_jup, // Hupdë
	iso639_jur, // Jurúna
	iso639_jus, // Jumla Sign Language
	iso639_jut, // Jutish
	iso639_juu, // Ju
	iso639_juw, // Wãpha
	iso639_juy, // Juray
	iso639_jvd, // Javindo
	iso639_jvn, // Caribbean Javanese
	iso639_jwi, // Jwira-Pepesa
	iso639_jya, // Jiarong
	iso639_jye, // Judeo-Yemeni Arabic
	iso639_jyy, // Jaya
	iso639_kaa, // Kara-Kalpak
	iso639_kab, // Kabyle
	iso639_kac, // Kachin
	iso639_kad, // Adara
	iso639_kae, // Ketangalan
	iso639_kaf, // Katso
	iso639_kag, // Kajaman
	iso639_kah, // Kara (Central African Republic)
	iso639_kai, // Karekare
	iso639_kaj, // Jju
	iso639_kak, // Kayapa Kallahan
	iso639_kal, // Kalaallisut
	iso639_kam, // Kamba (Kenya)
	iso639_kan, // Kannada
	iso639_kao, // Xaasongaxango
	iso639_kap, // Bezhta
	iso639_kaq, // Capanahua
	iso639_kas, // Kashmiri
	iso639_kat, // Georgian
	iso639_kau, // Kanuri
	iso639_kav, // Katukína
	iso639_kaw, // Kawi
	iso639_kax, // Kao
	iso639_kay, // Kamayurá
	iso639_kaz, // Kazakh
	iso639_kba, // Kalarko
	iso639_kbb, // Kaxuiâna
	iso639_kbc, // Kadiwéu
	iso639_kbd, // Kabardian
	iso639_kbe, // Kanju
	iso639_kbf, // Kakauhua
	iso639_kbg, // Khamba
	iso639_kbh, // Camsá
	iso639_kbi, // Kaptiau
	iso639_kbj, // Kari
	iso639_kbk, // Grass Koiari
	iso639_kbl, // Kanembu
	iso639_kbm, // Iwal
	iso639_kbn, // Kare (Central African Republic)
	iso639_kbo, // Keliko
	iso639_kbp, // Kabiyè
	iso639_kbq, // Kamano
	iso639_kbr, // Kafa
	iso639_kbs, // Kande
	iso639_kbt, // Abadi
	iso639_kbu, // Kabutra
	iso639_kbv, // Dera (Indonesia)
	iso639_kbw, // Kaiep
	iso639_kbx, // Ap Ma
	iso639_kby, // Manga Kanuri
	iso639_kbz, // Duhwa
	iso639_kca, // Khanty
	iso639_kcb, // Kawacha
	iso639_kcc, // Lubila
	iso639_kcd, // Ngkâlmpw Kanum
	iso639_kce, // Kaivi
	iso639_kcf, // Ukaan
	iso639_kcg, // Tyap
	iso639_kch, // Vono
	iso639_kci, // Kamantan
	iso639_kcj, // Kobiana
	iso639_kck, // Kalanga
	iso639_kcl, // Kela (Papua New Guinea)
	iso639_kcm, // Gula (Central African Republic)
	iso639_kcn, // Nubi
	iso639_kco, // Kinalakna
	iso639_kcp, // Kanga
	iso639_kcq, // Kamo
	iso639_kcr, // Katla
	iso639_kcs, // Koenoem
	iso639_kct, // Kaian
	iso639_kcu, // Kami (Tanzania)
	iso639_kcv, // Kete
	iso639_kcw, // Kabwari
	iso639_kcx, // Kachama-Ganjule
	iso639_kcy, // Korandje
	iso639_kcz, // Konongo
	iso639_kda, // Worimi
	iso639_kdc, // Kutu
	iso639_kdd, // Yankunytjatjara
	iso639_kde, // Makonde
	iso639_kdf, // Mamusi
	iso639_kdg, // Seba
	iso639_kdh, // Tem
	iso639_kdi, // Kumam
	iso639_kdj, // Karamojong
	iso639_kdk, // Numee
	iso639_kdl, // Tsikimba
	iso639_kdm, // Kagoma
	iso639_kdn, // Kunda
	iso639_kdp, // Kaningdon-Nindem
	iso639_kdq, // Koch
	iso639_kdr, // Karaim
	iso639_kdt, // Kuy
	iso639_kdu, // Kadaru
	iso639_kdw, // Koneraw
	iso639_kdx, // Kam
	iso639_kdy, // Keder
	iso639_kdz, // Kwaja
	iso639_kea, // Kabuverdianu
	iso639_keb, // Kélé
	iso639_kec, // Keiga
	iso639_ked, // Kerewe
	iso639_kee, // Eastern Keres
	iso639_kef, // Kpessi
	iso639_keg, // Tese
	iso639_keh, // Keak
	iso639_kei, // Kei
	iso639_kej, // Kadar
	iso639_kek, // Kekchí
	iso639_kel, // Kela (Democratic Republic of Congo)
	iso639_kem, // Kemak
	iso639_ken, // Kenyang
	iso639_keo, // Kakwa
	iso639_kep, // Kaikadi
	iso639_keq, // Kamar
	iso639_ker, // Kera
	iso639_kes, // Kugbo
	iso639_ket, // Ket
	iso639_keu, // Akebu
	iso639_kev, // Kanikkaran
	iso639_kew, // West Kewa
	iso639_kex, // Kukna
	iso639_key, // Kupia
	iso639_kez, // Kukele
	iso639_kfa, // Kodava
	iso639_kfb, // Northwestern Kolami
	iso639_kfc, // Konda-Dora
	iso639_kfd, // Korra Koraga
	iso639_kfe, // Kota (India)
	iso639_kff, // Koya
	iso639_kfg, // Kudiya
	iso639_kfh, // Kurichiya
	iso639_kfi, // Kannada Kurumba
	iso639_kfj, // Kemiehua
	iso639_kfk, // Kinnauri
	iso639_kfl, // Kung
	iso639_kfm, // Khunsari
	iso639_kfn, // Kuk
	iso639_kfo, // Koro (Côte d'Ivoire)
	iso639_kfp, // Korwa
	iso639_kfq, // Korku
	iso639_kfr, // Kachchi
	iso639_kfs, // Bilaspuri
	iso639_kft, // Kanjari
	iso639_kfu, // Katkari
	iso639_kfv, // Kurmukar
	iso639_kfw, // Kharam Naga
	iso639_kfx, // Kullu Pahari
	iso639_kfy, // Kumaoni
	iso639_kfz, // Koromfé
	iso639_kga, // Koyaga
	iso639_kgb, // Kawe
	iso639_kgc, // Kasseng
	iso639_kgd, // Kataang
	iso639_kge, // Komering
	iso639_kgf, // Kube
	iso639_kgg, // Kusunda
	iso639_kgi, // Selangor Sign Language
	iso639_kgj, // Gamale Kham
	iso639_kgk, // Kaiwá
	iso639_kgl, // Kunggari
	iso639_kgm, // Karipúna
	iso639_kgn, // Karingani
	iso639_kgo, // Krongo
	iso639_kgp, // Kaingang
	iso639_kgq, // Kamoro
	iso639_kgr, // Abun
	iso639_kgs, // Kumbainggar
	iso639_kgt, // Somyev
	iso639_kgu, // Kobol
	iso639_kgv, // Karas
	iso639_kgw, // Karon Dori
	iso639_kgx, // Kamaru
	iso639_kgy, // Kyerung
	iso639_kha, // Khasi
	iso639_khb, // Lü
	iso639_khc, // Tukang Besi North
	iso639_khd, // Bädi Kanum
	iso639_khe, // Korowai
	iso639_khf, // Khuen
	iso639_khg, // Khams Tibetan
	iso639_khh, // Kehu
	iso639_khj, // Kuturmi
	iso639_khk, // Halh Mongolian
	iso639_khl, // Lusi
	iso639_khm, // Central Khmer
	iso639_khn, // Khandesi
	iso639_kho, // Khotanese
	iso639_khp, // Kapori
	iso639_khq, // Koyra Chiini Songhay
	iso639_khr, // Kharia
	iso639_khs, // Kasua
	iso639_kht, // Khamti
	iso639_khu, // Nkhumbi
	iso639_khv, // Khvarshi
	iso639_khw, // Khowar
	iso639_khx, // Kanu
	iso639_khy, // Kele (Democratic Republic of Congo)
	iso639_khz, // Keapara
	iso639_kia, // Kim
	iso639_kib, // Koalib
	iso639_kic, // Kickapoo
	iso639_kid, // Koshin
	iso639_kie, // Kibet
	iso639_kif, // Eastern Parbate Kham
	iso639_kig, // Kimaama
	iso639_kih, // Kilmeri
	iso639_kii, // Kitsai
	iso639_kij, // Kilivila
	iso639_kik, // Kikuyu
	iso639_kil, // Kariya
	iso639_kim, // Karagas
	iso639_kin, // Kinyarwanda
	iso639_kio, // Kiowa
	iso639_kip, // Sheshi Kham
	iso639_kiq, // Kosadle
	iso639_kir, // Kirghiz
	iso639_kis, // Kis
	iso639_kit, // Agob
	iso639_kiu, // Kirmanjki (individual language)
	iso639_kiv, // Kimbu
	iso639_kiw, // Northeast Kiwai
	iso639_kix, // Khiamniungan Naga
	iso639_kiy, // Kirikiri
	iso639_kiz, // Kisi
	iso639_kja, // Mlap
	iso639_kjb, // Q'anjob'al
	iso639_kjc, // Coastal Konjo
	iso639_kjd, // Southern Kiwai
	iso639_kje, // Kisar
	iso639_kjf, // Khalaj
	iso639_kjg, // Khmu
	iso639_kjh, // Khakas
	iso639_kji, // Zabana
	iso639_kjj, // Khinalugh
	iso639_kjk, // Highland Konjo
	iso639_kjl, // Western Parbate Kham
	iso639_kjm, // Kháng
	iso639_kjn, // Kunjen
	iso639_kjo, // Harijan Kinnauri
	iso639_kjp, // Pwo Eastern Karen
	iso639_kjq, // Western Keres
	iso639_kjr, // Kurudu
	iso639_kjs, // East Kewa
	iso639_kjt, // Phrae Pwo Karen
	iso639_kju, // Kashaya
	iso639_kjx, // Ramopa
	iso639_kjy, // Erave
	iso639_kjz, // Bumthangkha
	iso639_kka, // Kakanda
	iso639_kkb, // Kwerisa
	iso639_kkc, // Odoodee
	iso639_kkd, // Kinuku
	iso639_kke, // Kakabe
	iso639_kkf, // Kalaktang Monpa
	iso639_kkg, // Mabaka Valley Kalinga
	iso639_kkh, // Khün
	iso639_kki, // Kagulu
	iso639_kkj, // Kako
	iso639_kkk, // Kokota
	iso639_kkl, // Kosarek Yale
	iso639_kkm, // Kiong
	iso639_kkn, // Kon Keu
	iso639_kko, // Karko
	iso639_kkp, // Gugubera
	iso639_kkq, // Kaiku
	iso639_kkr, // Kir-Balar
	iso639_kks, // Giiwo
	iso639_kkt, // Koi
	iso639_kku, // Tumi
	iso639_kkv, // Kangean
	iso639_kkw, // Teke-Kukuya
	iso639_kkx, // Kohin
	iso639_kky, // Guguyimidjir
	iso639_kkz, // Kaska
	iso639_kla, // Klamath-Modoc
	iso639_klb, // Kiliwa
	iso639_klc, // Kolbila
	iso639_kld, // Gamilaraay
	iso639_kle, // Kulung (Nepal)
	iso639_klf, // Kendeje
	iso639_klg, // Tagakaulo
	iso639_klh, // Weliki
	iso639_kli, // Kalumpang
	iso639_klj, // Turkic Khalaj
	iso639_klk, // Kono (Nigeria)
	iso639_kll, // Kagan Kalagan
	iso639_klm, // Migum
	iso639_kln, // Kalenjin
	iso639_klo, // Kapya
	iso639_klp, // Kamasa
	iso639_klq, // Rumu
	iso639_klr, // Khaling
	iso639_kls, // Kalasha
	iso639_klt, // Nukna
	iso639_klu, // Klao
	iso639_klv, // Maskelynes
	iso639_klw, // Lindu
	iso639_klx, // Koluwawa
	iso639_kly, // Kalao
	iso639_klz, // Kabola
	iso639_kma, // Konni
	iso639_kmb, // Kimbundu
	iso639_kmc, // Southern Dong
	iso639_kmd, // Majukayang Kalinga
	iso639_kme, // Bakole
	iso639_kmf, // Kare (Papua New Guinea)
	iso639_kmg, // Kâte
	iso639_kmh, // Kalam
	iso639_kmi, // Kami (Nigeria)
	iso639_kmj, // Kumarbhag Paharia
	iso639_kmk, // Limos Kalinga
	iso639_kml, // Tanudan Kalinga
	iso639_kmm, // Kom (India)
	iso639_kmn, // Awtuw
	iso639_kmo, // Kwoma
	iso639_kmp, // Gimme
	iso639_kmq, // Kwama
	iso639_kmr, // Northern Kurdish
	iso639_kms, // Kamasau
	iso639_kmt, // Kemtuik
	iso639_kmu, // Kanite
	iso639_kmv, // Karipúna Creole French
	iso639_kmw, // Komo (Democratic Republic of Congo)
	iso639_kmx, // Waboda
	iso639_kmy, // Koma
	iso639_kmz, // Khorasani Turkish
	iso639_kna, // Dera (Nigeria)
	iso639_knb, // Lubuagan Kalinga
	iso639_knc, // Central Kanuri
	iso639_knd, // Konda
	iso639_kne, // Kankanaey
	iso639_knf, // Mankanya
	iso639_kng, // Koongo
	iso639_kni, // Kanufi
	iso639_knj, // Western Kanjobal
	iso639_knk, // Kuranko
	iso639_knl, // Keninjal
	iso639_knm, // Kanamarí
	iso639_knn, // Konkani (individual language)
	iso639_kno, // Kono (Sierra Leone)
	iso639_knp, // Kwanja
	iso639_knq, // Kintaq
	iso639_knr, // Kaningra
	iso639_kns, // Kensiu
	iso639_knt, // Panoan Katukína
	iso639_knu, // Kono (Guinea)
	iso639_knv, // Tabo
	iso639_knw, // Kung-Ekoka
	iso639_knx, // Kendayan
	iso639_kny, // Kanyok
	iso639_knz, // Kalamsé
	iso639_koa, // Konomala
	iso639_koc, // Kpati
	iso639_kod, // Kodi
	iso639_koe, // Kacipo-Balesi
	iso639_kof, // Kubi
	iso639_kog, // Cogui
	iso639_koh, // Koyo
	iso639_koi, // Komi-Permyak
	iso639_koj, // Sara Dunjo
	iso639_kok, // Konkani
	iso639_kol, // Kol (Papua New Guinea)
	iso639_kom, // Komi
	iso639_kon, // Kongo
	iso639_koo, // Konzo
	iso639_kop, // Waube
	iso639_koq, // Kota (Gabon)
	iso639_kor, // Korean
	iso639_kos, // Kosraean
	iso639_kot, // Lagwan
	iso639_kou, // Koke
	iso639_kov, // Kudu-Camo
	iso639_kow, // Kugama
	iso639_kox, // Coxima
	iso639_koy, // Koyukon
	iso639_koz, // Korak
	iso639_kpa, // Kutto
	iso639_kpb, // Mullu Kurumba
	iso639_kpc, // Curripaco
	iso639_kpd, // Koba
	iso639_kpe, // Kpelle
	iso639_kpf, // Komba
	iso639_kpg, // Kapingamarangi
	iso639_kph, // Kplang
	iso639_kpi, // Kofei
	iso639_kpj, // Karajá
	iso639_kpk, // Kpan
	iso639_kpl, // Kpala
	iso639_kpm, // Koho
	iso639_kpn, // Kepkiriwát
	iso639_kpo, // Ikposo
	iso639_kpq, // Korupun-Sela
	iso639_kpr, // Korafe-Yegha
	iso639_kps, // Tehit
	iso639_kpt, // Karata
	iso639_kpu, // Kafoa
	iso639_kpv, // Komi-Zyrian
	iso639_kpw, // Kobon
	iso639_kpx, // Mountain Koiali
	iso639_kpy, // Koryak
	iso639_kpz, // Kupsabiny
	iso639_kqa, // Mum
	iso639_kqb, // Kovai
	iso639_kqc, // Doromu-Koki
	iso639_kqd, // Koy Sanjaq Surat
	iso639_kqe, // Kalagan
	iso639_kqf, // Kakabai
	iso639_kqg, // Khe
	iso639_kqh, // Kisankasa
	iso639_kqi, // Koitabu
	iso639_kqj, // Koromira
	iso639_kqk, // Kotafon Gbe
	iso639_kql, // Kyenele
	iso639_kqm, // Khisa
	iso639_kqn, // Kaonde
	iso639_kqo, // Eastern Krahn
	iso639_kqp, // Kimré
	iso639_kqq, // Krenak
	iso639_kqr, // Kimaragang
	iso639_kqs, // Northern Kissi
	iso639_kqt, // Klias River Kadazan
	iso639_kqu, // Seroa
	iso639_kqv, // Okolod
	iso639_kqw, // Kandas
	iso639_kqx, // Mser
	iso639_kqy, // Koorete
	iso639_kqz, // Korana
	iso639_kra, // Kumhali
	iso639_krb, // Karkin
	iso639_krc, // Karachay-Balkar
	iso639_krd, // Kairui-Midiki
	iso639_kre, // Panará
	iso639_krf, // Koro (Vanuatu)
	iso639_krh, // Kurama
	iso639_kri, // Krio
	iso639_krj, // Kinaray-A
	iso639_krk, // Kerek
	iso639_krl, // Karelian
	iso639_krm, // Krim
	iso639_krn, // Sapo
	iso639_krp, // Korop
	iso639_krr, // Kru'ng 2
	iso639_krs, // Gbaya (Sudan)
	iso639_krt, // Tumari Kanuri
	iso639_kru, // Kurukh
	iso639_krv, // Kavet
	iso639_krw, // Western Krahn
	iso639_krx, // Karon
	iso639_kry, // Kryts
	iso639_krz, // Sota Kanum
	iso639_ksa, // Shuwa-Zamani
	iso639_ksb, // Shambala
	iso639_ksc, // Southern Kalinga
	iso639_ksd, // Kuanua
	iso639_kse, // Kuni
	iso639_ksf, // Bafia
	iso639_ksg, // Kusaghe
	iso639_ksh, // Kölsch
	iso639_ksi, // Krisa
	iso639_ksj, // Uare
	iso639_ksk, // Kansa
	iso639_ksl, // Kumalu
	iso639_ksm, // Kumba
	iso639_ksn, // Kasiguranin
	iso639_kso, // Kofa
	iso639_ksp, // Kaba
	iso639_ksq, // Kwaami
	iso639_ksr, // Borong
	iso639_kss, // Southern Kisi
	iso639_kst, // Winyé
	iso639_ksu, // Khamyang
	iso639_ksv, // Kusu
	iso639_ksw, // S'gaw Karen
	iso639_ksx, // Kedang
	iso639_ksy, // Kharia Thar
	iso639_ksz, // Kodaku
	iso639_kta, // Katua
	iso639_ktb, // Kambaata
	iso639_ktc, // Kholok
	iso639_ktd, // Kokata
	iso639_kte, // Nubri
	iso639_ktf, // Kwami
	iso639_ktg, // Kalkutung
	iso639_kth, // Karanga
	iso639_kti, // North Muyu
	iso639_ktj, // Plapo Krumen
	iso639_ktk, // Kaniet
	iso639_ktl, // Koroshi
	iso639_ktm, // Kurti
	iso639_ktn, // Karitiâna
	iso639_kto, // Kuot
	iso639_ktp, // Kaduo
	iso639_ktq, // Katabaga
	iso639_ktr, // Kota Marudu Tinagas
	iso639_kts, // South Muyu
	iso639_ktt, // Ketum
	iso639_ktu, // Kituba (Democratic Republic of Congo)
	iso639_ktv, // Eastern Katu
	iso639_ktw, // Kato
	iso639_ktx, // Kaxararí
	iso639_kty, // Kango (Bas-Uélé District)
	iso639_ktz, // Ju/'hoan
	iso639_kua, // Kuanyama
	iso639_kub, // Kutep
	iso639_kuc, // Kwinsu
	iso639_kud, // 'Auhelawa
	iso639_kue, // Kuman
	iso639_kuf, // Western Katu
	iso639_kug, // Kupa
	iso639_kuh, // Kushi
	iso639_kui, // Kuikúro-Kalapálo
	iso639_kuj, // Kuria
	iso639_kuk, // Kepo'
	iso639_kul, // Kulere
	iso639_kum, // Kumyk
	iso639_kun, // Kunama
	iso639_kuo, // Kumukio
	iso639_kup, // Kunimaipa
	iso639_kuq, // Karipuna
	iso639_kur, // Kurdish
	iso639_kus, // Kusaal
	iso639_kut, // Kutenai
	iso639_kuu, // Upper Kuskokwim
	iso639_kuv, // Kur
	iso639_kuw, // Kpagua
	iso639_kux, // Kukatja
	iso639_kuy, // Kuuku-Ya'u
	iso639_kuz, // Kunza
	iso639_kva, // Bagvalal
	iso639_kvb, // Kubu
	iso639_kvc, // Kove
	iso639_kvd, // Kui (Indonesia)
	iso639_kve, // Kalabakan
	iso639_kvf, // Kabalai
	iso639_kvg, // Kuni-Boazi
	iso639_kvh, // Komodo
	iso639_kvi, // Kwang
	iso639_kvj, // Psikye
	iso639_kvk, // Korean Sign Language
	iso639_kvl, // Kayaw
	iso639_kvm, // Kendem
	iso639_kvn, // Border Kuna
	iso639_kvo, // Dobel
	iso639_kvp, // Kompane
	iso639_kvq, // Geba Karen
	iso639_kvr, // Kerinci
	iso639_kvs, // Kunggara
	iso639_kvt, // Lahta Karen
	iso639_kvu, // Yinbaw Karen
	iso639_kvv, // Kola
	iso639_kvw, // Wersing
	iso639_kvx, // Parkari Koli
	iso639_kvy, // Yintale Karen
	iso639_kvz, // Tsakwambo
	iso639_kwa, // Dâw
	iso639_kwb, // Kwa
	iso639_kwc, // Likwala
	iso639_kwd, // Kwaio
	iso639_kwe, // Kwerba
	iso639_kwf, // Kwara'ae
	iso639_kwg, // Sara Kaba Deme
	iso639_kwh, // Kowiai
	iso639_kwi, // Awa-Cuaiquer
	iso639_kwj, // Kwanga
	iso639_kwk, // Kwakiutl
	iso639_kwl, // Kofyar
	iso639_kwm, // Kwambi
	iso639_kwn, // Kwangali
	iso639_kwo, // Kwomtari
	iso639_kwp, // Kodia
	iso639_kwq, // Kwak
	iso639_kwr, // Kwer
	iso639_kws, // Kwese
	iso639_kwt, // Kwesten
	iso639_kwu, // Kwakum
	iso639_kwv, // Sara Kaba Náà
	iso639_kww, // Kwinti
	iso639_kwx, // Khirwar
	iso639_kwy, // San Salvador Kongo
	iso639_kwz, // Kwadi
	iso639_kxa, // Kairiru
	iso639_kxb, // Krobu
	iso639_kxc, // Konso
	iso639_kxd, // Brunei
	iso639_kxe, // Kakihum
	iso639_kxf, // Manumanaw Karen
	iso639_kxh, // Karo (Ethiopia)
	iso639_kxi, // Keningau Murut
	iso639_kxj, // Kulfa
	iso639_kxk, // Zayein Karen
	iso639_kxl, // Nepali Kurux
	iso639_kxm, // Northern Khmer
	iso639_kxn, // Kanowit-Tanjong Melanau
	iso639_kxo, // Kanoé
	iso639_kxp, // Wadiyara Koli
	iso639_kxq, // Smärky Kanum
	iso639_kxr, // Koro (Papua New Guinea)
	iso639_kxs, // Kangjia
	iso639_kxt, // Koiwat
	iso639_kxu, // Kui (India)
	iso639_kxv, // Kuvi
	iso639_kxw, // Konai
	iso639_kxx, // Likuba
	iso639_kxy, // Kayong
	iso639_kxz, // Kerewo
	iso639_kya, // Kwaya
	iso639_kyb, // Butbut Kalinga
	iso639_kyc, // Kyaka
	iso639_kyd, // Karey
	iso639_kye, // Krache
	iso639_kyf, // Kouya
	iso639_kyg, // Keyagana
	iso639_kyh, // Karok
	iso639_kyi, // Kiput
	iso639_kyj, // Karao
	iso639_kyk, // Kamayo
	iso639_kyl, // Kalapuya
	iso639_kym, // Kpatili
	iso639_kyn, // Northern Binukidnon
	iso639_kyo, // Kelon
	iso639_kyp, // Kang
	iso639_kyq, // Kenga
	iso639_kyr, // Kuruáya
	iso639_kys, // Baram Kayan
	iso639_kyt, // Kayagar
	iso639_kyu, // Western Kayah
	iso639_kyv, // Kayort
	iso639_kyw, // Kudmali
	iso639_kyx, // Rapoisi
	iso639_kyy, // Kambaira
	iso639_kyz, // Kayabí
	iso639_kza, // Western Karaboro
	iso639_kzb, // Kaibobo
	iso639_kzc, // Bondoukou Kulango
	iso639_kzd, // Kadai
	iso639_kze, // Kosena
	iso639_kzf, // Da'a Kaili
	iso639_kzg, // Kikai
	iso639_kzi, // Kelabit
	iso639_kzj, // Coastal Kadazan
	iso639_kzk, // Kazukuru
	iso639_kzl, // Kayeli
	iso639_kzm, // Kais
	iso639_kzn, // Kokola
	iso639_kzo, // Kaningi
	iso639_kzp, // Kaidipang
	iso639_kzq, // Kaike
	iso639_kzr, // Karang
	iso639_kzs, // Sugut Dusun
	iso639_kzt, // Tambunan Dusun
	iso639_kzu, // Kayupulau
	iso639_kzv, // Komyandaret
	iso639_kzw, // Karirí-Xocó
	iso639_kzx, // Kamarian
	iso639_kzy, // Kango (Tshopo District)
	iso639_kzz, // Kalabra
	iso639_laa, // Southern Subanen
	iso639_lab, // Linear A
	iso639_lac, // Lacandon
	iso639_lad, // Ladino
	iso639_lae, // Pattani
	iso639_laf, // Lafofa
	iso639_lag, // Langi
	iso639_lah, // Lahnda
	iso639_lai, // Lambya
	iso639_laj, // Lango (Uganda)
	iso639_lak, // Laka (Nigeria)
	iso639_lal, // Lalia
	iso639_lam, // Lamba
	iso639_lan, // Laru
	iso639_lao, // Lao
	iso639_lap, // Laka (Chad)
	iso639_laq, // Qabiao
	iso639_lar, // Larteh
	iso639_las, // Lama (Togo)
	iso639_lat, // Latin
	iso639_lau, // Laba
	iso639_lav, // Latvian
	iso639_law, // Lauje
	iso639_lax, // Tiwa
	iso639_lay, // Lama (Myanmar)
	iso639_laz, // Aribwatsa
	iso639_lba, // Lui
	iso639_lbb, // Label
	iso639_lbc, // Lakkia
	iso639_lbe, // Lak
	iso639_lbf, // Tinani
	iso639_lbg, // Laopang
	iso639_lbi, // La'bi
	iso639_lbj, // Ladakhi
	iso639_lbk, // Central Bontok
	iso639_lbl, // Libon Bikol
	iso639_lbm, // Lodhi
	iso639_lbn, // Lamet
	iso639_lbo, // Laven
	iso639_lbq, // Wampar
	iso639_lbr, // Lohorung
	iso639_lbs, // Libyan Sign Language
	iso639_lbt, // Lachi
	iso639_lbu, // Labu
	iso639_lbv, // Lavatbura-Lamusong
	iso639_lbw, // Tolaki
	iso639_lbx, // Lawangan
	iso639_lby, // Lamu-Lamu
	iso639_lbz, // Lardil
	iso639_lcc, // Legenyem
	iso639_lcd, // Lola
	iso639_lce, // Loncong
	iso639_lcf, // Lubu
	iso639_lch, // Luchazi
	iso639_lcl, // Lisela
	iso639_lcm, // Tungag
	iso639_lcp, // Western Lawa
	iso639_lcs, // Lisabata-Nuniali
	iso639_ldb, // Dũya
	iso639_ldd, // Luri
	iso639_ldg, // Lenyima
	iso639_ldh, // Lamja-Dengsa-Tola
	iso639_ldi, // Laari
	iso639_ldj, // Lemoro
	iso639_ldk, // Leelau
	iso639_ldl, // Kaan
	iso639_ldm, // Landoma
	iso639_ldn, // Láadan
	iso639_ldo, // Loo
	iso639_ldp, // Tso
	iso639_ldq, // Lufu
	iso639_lea, // Lega-Shabunda
	iso639_leb, // Lala-Bisa
	iso639_lec, // Leco
	iso639_led, // Lendu
	iso639_lee, // Lyélé
	iso639_lef, // Lelemi
	iso639_leg, // Lengua
	iso639_leh, // Lenje
	iso639_lei, // Lemio
	iso639_lej, // Lengola
	iso639_lek, // Leipon
	iso639_lel, // Lele (Democratic Republic of Congo)
	iso639_lem, // Nomaande
	iso639_len, // Lenca
	iso639_leo, // Leti (Cameroon)
	iso639_lep, // Lepcha
	iso639_leq, // Lembena
	iso639_ler, // Lenkau
	iso639_les, // Lese
	iso639_let, // Lesing-Gelimi
	iso639_leu, // Kara (Papua New Guinea)
	iso639_lev, // Lamma
	iso639_lew, // Ledo Kaili
	iso639_lex, // Luang
	iso639_ley, // Lemolang
	iso639_lez, // Lezghian
	iso639_lfa, // Lefa
	iso639_lfn, // Lingua Franca Nova
	iso639_lga, // Lungga
	iso639_lgb, // Laghu
	iso639_lgg, // Lugbara
	iso639_lgh, // Laghuu
	iso639_lgi, // Lengilu
	iso639_lgk, // Lingarak
	iso639_lgl, // Wala
	iso639_lgm, // Lega-Mwenga
	iso639_lgn, // Opuuo
	iso639_lgq, // Logba
	iso639_lgr, // Lengo
	iso639_lgt, // Pahi
	iso639_lgu, // Longgu
	iso639_lgz, // Ligenza
	iso639_lha, // Laha (Viet Nam)
	iso639_lhh, // Laha (Indonesia)
	iso639_lhi, // Lahu Shi
	iso639_lhl, // Lahul Lohar
	iso639_lhm, // Lhomi
	iso639_lhn, // Lahanan
	iso639_lhp, // Lhokpu
	iso639_lhs, // Mlahsö
	iso639_lht, // Lo-Toga
	iso639_lhu, // Lahu
	iso639_lia, // West-Central Limba
	iso639_lib, // Likum
	iso639_lic, // Hlai
	iso639_lid, // Nyindrou
	iso639_lie, // Likila
	iso639_lif, // Limbu
	iso639_lig, // Ligbi
	iso639_lih, // Lihir
	iso639_lii, // Lingkhim
	iso639_lij, // Ligurian
	iso639_lik, // Lika
	iso639_lil, // Lillooet
	iso639_lim, // Limburgan
	iso639_lin, // Lingala
	iso639_lio, // Liki
	iso639_lip, // Sekpele
	iso639_liq, // Libido
	iso639_lir, // Liberian English
	iso639_lis, // Lisu
	iso639_lit, // Lithuanian
	iso639_liu, // Logorik
	iso639_liv, // Liv
	iso639_liw, // Col
	iso639_lix, // Liabuku
	iso639_liy, // Banda-Bambari
	iso639_liz, // Libinza
	iso639_lje, // Rampi
	iso639_lji, // Laiyolo
	iso639_ljl, // Li'o
	iso639_ljp, // Lampung Api
	iso639_lka, // Lakalei
	iso639_lkb, // Kabras
	iso639_lkc, // Kucong
	iso639_lkd, // Lakondê
	iso639_lke, // Kenyi
	iso639_lkh, // Lakha
	iso639_lki, // Laki
	iso639_lkj, // Remun
	iso639_lkl, // Laeko-Libuat
	iso639_lkn, // Lakon
	iso639_lko, // Khayo
	iso639_lkr, // Päri
	iso639_lks, // Kisa
	iso639_lkt, // Lakota
	iso639_lky, // Lokoya
	iso639_lla, // Lala-Roba
	iso639_llb, // Lolo
	iso639_llc, // Lele (Guinea)
	iso639_lld, // Ladin
	iso639_lle, // Lele (Papua New Guinea)
	iso639_llf, // Hermit
	iso639_llg, // Lole
	iso639_llh, // Lamu
	iso639_lli, // Teke-Laali
	iso639_llj, // Ladji Ladji
	iso639_llk, // Lelak
	iso639_lll, // Lilau
	iso639_llm, // Lasalimu
	iso639_lln, // Lele (Chad)
	iso639_llo, // Khlor
	iso639_llp, // North Efate
	iso639_llq, // Lolak
	iso639_lls, // Lithuanian Sign Language
	iso639_llu, // Lau
	iso639_llx, // Lauan
	iso639_lma, // East Limba
	iso639_lmb, // Merei
	iso639_lmc, // Limilngan
	iso639_lmd, // Lumun
	iso639_lme, // Pévé
	iso639_lmf, // South Lembata
	iso639_lmg, // Lamogai
	iso639_lmh, // Lambichhong
	iso639_lmi, // Lombi
	iso639_lmj, // West Lembata
	iso639_lmk, // Lamkang
	iso639_lml, // Hano
	iso639_lmm, // Lamam
	iso639_lmn, // Lambadi
	iso639_lmo, // Lombard
	iso639_lmp, // Limbum
	iso639_lmq, // Lamatuka
	iso639_lmr, // Lamalera
	iso639_lmu, // Lamenu
	iso639_lmv, // Lomaiviti
	iso639_lmw, // Lake Miwok
	iso639_lmx, // Laimbue
	iso639_lmy, // Lamboya
	iso639_lmz, // Lumbee
	iso639_lna, // Langbashe
	iso639_lnb, // Mbalanhu
	iso639_lnd, // Lundayeh
	iso639_lng, // Langobardic
	iso639_lnh, // Lanoh
	iso639_lni, // Daantanai'
	iso639_lnj, // Leningitij
	iso639_lnl, // South Central Banda
	iso639_lnm, // Langam
	iso639_lnn, // Lorediakarkar
	iso639_lno, // Lango (Sudan)
	iso639_lns, // Lamnso'
	iso639_lnu, // Longuda
	iso639_lnz, // Lonzo
	iso639_loa, // Loloda
	iso639_lob, // Lobi
	iso639_loc, // Inonhan
	iso639_loe, // Saluan
	iso639_lof, // Logol
	iso639_log, // Logo
	iso639_loh, // Narim
	iso639_loi, // Loma (Côte d'Ivoire)
	iso639_loj, // Lou
	iso639_lok, // Loko
	iso639_lol, // Mongo
	iso639_lom, // Loma (Liberia)
	iso639_lon, // Malawi Lomwe
	iso639_loo, // Lombo
	iso639_lop, // Lopa
	iso639_loq, // Lobala
	iso639_lor, // Téén
	iso639_los, // Loniu
	iso639_lot, // Otuho
	iso639_lou, // Louisiana Creole French
	iso639_lov, // Lopi
	iso639_low, // Tampias Lobu
	iso639_lox, // Loun
	iso639_loy, // Loke
	iso639_loz, // Lozi
	iso639_lpa, // Lelepa
	iso639_lpe, // Lepki
	iso639_lpn, // Long Phuri Naga
	iso639_lpo, // Lipo
	iso639_lpx, // Lopit
	iso639_lra, // Rara Bakati'
	iso639_lrc, // Northern Luri
	iso639_lre, // Laurentian
	iso639_lrg, // Laragia
	iso639_lri, // Marachi
	iso639_lrk, // Loarki
	iso639_lrl, // Lari
	iso639_lrm, // Marama
	iso639_lrn, // Lorang
	iso639_lro, // Laro
	iso639_lrr, // Southern Yamphu
	iso639_lrt, // Larantuka Malay
	iso639_lrv, // Larevat
	iso639_lrz, // Lemerig
	iso639_lsa, // Lasgerdi
	iso639_lsd, // Lishana Deni
	iso639_lse, // Lusengo
	iso639_lsg, // Lyons Sign Language
	iso639_lsh, // Lish
	iso639_lsi, // Lashi
	iso639_lsl, // Latvian Sign Language
	iso639_lsm, // Saamia
	iso639_lso, // Laos Sign Language
	iso639_lsp, // Panamanian Sign Language
	iso639_lsr, // Aruop
	iso639_lss, // Lasi
	iso639_lst, // Trinidad and Tobago Sign Language
	iso639_lsy, // Mauritian Sign Language
	iso639_ltc, // Late Middle Chinese
	iso639_ltg, // Latgalian
	iso639_lti, // Leti (Indonesia)
	iso639_ltn, // Latundê
	iso639_lto, // Tsotso
	iso639_lts, // Tachoni
	iso639_ltu, // Latu
	iso639_ltz, // Luxembourgish
	iso639_lua, // Luba-Lulua
	iso639_lub, // Luba-Katanga
	iso639_luc, // Aringa
	iso639_lud, // Ludian
	iso639_lue, // Luvale
	iso639_luf, // Laua
	iso639_lug, // Ganda
	iso639_lui, // Luiseno
	iso639_luj, // Luna
	iso639_luk, // Lunanakha
	iso639_lul, // Olu'bo
	iso639_lum, // Luimbi
	iso639_lun, // Lunda
	iso639_luo, // Luo (Kenya and Tanzania)
	iso639_lup, // Lumbu
	iso639_luq, // Lucumi
	iso639_lur, // Laura
	iso639_lus, // Lushai
	iso639_lut, // Lushootseed
	iso639_luu, // Lumba-Yakkha
	iso639_luv, // Luwati
	iso639_luw, // Luo (Cameroon)
	iso639_luy, // Luyia
	iso639_luz, // Southern Luri
	iso639_lva, // Maku'a
	iso639_lvk, // Lavukaleve
	iso639_lvs, // Standard Latvian
	iso639_lvu, // Levuka
	iso639_lwa, // Lwalu
	iso639_lwe, // Lewo Eleng
	iso639_lwg, // Wanga
	iso639_lwh, // White Lachi
	iso639_lwl, // Eastern Lawa
	iso639_lwm, // Laomian
	iso639_lwo, // Luwo
	iso639_lwt, // Lewotobi
	iso639_lww, // Lewo
	iso639_lya, // Layakha
	iso639_lyg, // Lyngngam
	iso639_lyn, // Luyana
	iso639_lzh, // Literary Chinese
	iso639_lzl, // Litzlitz
	iso639_lzn, // Leinong Naga
	iso639_lzz, // Laz
	iso639_maa, // San Jerónimo Tecóatl Mazatec
	iso639_mab, // Yutanduchi Mixtec
	iso639_mad, // Madurese
	iso639_mae, // Bo-Rukul
	iso639_maf, // Mafa
	iso639_mag, // Magahi
	iso639_mah, // Marshallese
	iso639_mai, // Maithili
	iso639_maj, // Jalapa De Díaz Mazatec
	iso639_mak, // Makasar
	iso639_mal, // Malayalam
	iso639_mam, // Mam
	iso639_man, // Mandingo
	iso639_maq, // Chiquihuitlán Mazatec
	iso639_mar, // Marathi
	iso639_mas, // Masai
	iso639_mat, // San Francisco Matlatzinca
	iso639_mau, // Huautla Mazatec
	iso639_mav, // Sateré-Mawé
	iso639_maw, // Mampruli
	iso639_max, // North Moluccan Malay
	iso639_maz, // Central Mazahua
	iso639_mba, // Higaonon
	iso639_mbb, // Western Bukidnon Manobo
	iso639_mbc, // Macushi
	iso639_mbd, // Dibabawon Manobo
	iso639_mbe, // Molale
	iso639_mbf, // Baba Malay
	iso639_mbh, // Mangseng
	iso639_mbi, // Ilianen Manobo
	iso639_mbj, // Nadëb
	iso639_mbk, // Malol
	iso639_mbl, // Maxakalí
	iso639_mbm, // Ombamba
	iso639_mbn, // Macaguán
	iso639_mbo, // Mbo (Cameroon)
	iso639_mbp, // Malayo
	iso639_mbq, // Maisin
	iso639_mbr, // Nukak Makú
	iso639_mbs, // Sarangani Manobo
	iso639_mbt, // Matigsalug Manobo
	iso639_mbu, // Mbula-Bwazza
	iso639_mbv, // Mbulungish
	iso639_mbw, // Maring
	iso639_mbx, // Mari (East Sepik Province)
	iso639_mby, // Memoni
	iso639_mbz, // Amoltepec Mixtec
	iso639_mca, // Maca
	iso639_mcb, // Machiguenga
	iso639_mcc, // Bitur
	iso639_mcd, // Sharanahua
	iso639_mce, // Itundujia Mixtec
	iso639_mcf, // Matsés
	iso639_mcg, // Mapoyo
	iso639_mch, // Maquiritari
	iso639_mci, // Mese
	iso639_mcj, // Mvanip
	iso639_mck, // Mbunda
	iso639_mcl, // Macaguaje
	iso639_mcm, // Malaccan Creole Portuguese
	iso639_mcn, // Masana
	iso639_mco, // Coatlán Mixe
	iso639_mcp, // Makaa
	iso639_mcq, // Ese
	iso639_mcr, // Menya
	iso639_mcs, // Mambai
	iso639_mct, // Mengisa
	iso639_mcu, // Cameroon Mambila
	iso639_mcv, // Minanibai
	iso639_mcw, // Mawa (Chad)
	iso639_mcx, // Mpiemo
	iso639_mcy, // South Watut
	iso639_mcz, // Mawan
	iso639_mda, // Mada (Nigeria)
	iso639_mdb, // Morigi
	iso639_mdc, // Male (Papua New Guinea)
	iso639_mdd, // Mbum
	iso639_mde, // Maba (Chad)
	iso639_mdf, // Moksha
	iso639_mdg, // Massalat
	iso639_mdh, // Maguindanaon
	iso639_mdi, // Mamvu
	iso639_mdj, // Mangbetu
	iso639_mdk, // Mangbutu
	iso639_mdl, // Maltese Sign Language
	iso639_mdm, // Mayogo
	iso639_mdn, // Mbati
	iso639_mdp, // Mbala
	iso639_mdq, // Mbole
	iso639_mdr, // Mandar
	iso639_mds, // Maria (Papua New Guinea)
	iso639_mdt, // Mbere
	iso639_mdu, // Mboko
	iso639_mdv, // Santa Lucía Monteverde Mixtec
	iso639_mdw, // Mbosi
	iso639_mdx, // Dizin
	iso639_mdy, // Male (Ethiopia)
	iso639_mdz, // Suruí Do Pará
	iso639_mea, // Menka
	iso639_meb, // Ikobi
	iso639_mec, // Mara
	iso639_med, // Melpa
	iso639_mee, // Mengen
	iso639_mef, // Megam
	iso639_meg, // Mea
	iso639_meh, // Southwestern Tlaxiaco Mixtec
	iso639_mei, // Midob
	iso639_mej, // Meyah
	iso639_mek, // Mekeo
	iso639_mel, // Central Melanau
	iso639_mem, // Mangala
	iso639_men, // Mende (Sierra Leone)
	iso639_meo, // Kedah Malay
	iso639_mep, // Miriwung
	iso639_meq, // Merey
	iso639_mer, // Meru
	iso639_mes, // Masmaje
	iso639_met, // Mato
	iso639_meu, // Motu
	iso639_mev, // Mann
	iso639_mew, // Maaka
	iso639_mey, // Hassaniyya
	iso639_mez, // Menominee
	iso639_mfa, // Pattani Malay
	iso639_mfb, // Bangka
	iso639_mfc, // Mba
	iso639_mfd, // Mendankwe-Nkwen
	iso639_mfe, // Morisyen
	iso639_mff, // Naki
	iso639_mfg, // Mixifore
	iso639_mfh, // Matal
	iso639_mfi, // Wandala
	iso639_mfj, // Mefele
	iso639_mfk, // North Mofu
	iso639_mfl, // Putai
	iso639_mfm, // Marghi South
	iso639_mfn, // Cross River Mbembe
	iso639_mfo, // Mbe
	iso639_mfp, // Makassar Malay
	iso639_mfq, // Moba
	iso639_mfr, // Marithiel
	iso639_mfs, // Mexican Sign Language
	iso639_mft, // Mokerang
	iso639_mfu, // Mbwela
	iso639_mfv, // Mandjak
	iso639_mfw, // Mulaha
	iso639_mfx, // Melo
	iso639_mfy, // Mayo
	iso639_mfz, // Mabaan
	iso639_mga, // Middle Irish
	iso639_mgb, // Mararit
	iso639_mgc, // Morokodo
	iso639_mgd, // Moru
	iso639_mge, // Mango
	iso639_mgf, // Maklew
	iso639_mgg, // Mpumpong
	iso639_mgh, // Makhuwa-Meetto
	iso639_mgi, // Lijili
	iso639_mgj, // Abureni
	iso639_mgk, // Mawes
	iso639_mgl, // Maleu-Kilenge
	iso639_mgm, // Mambae
	iso639_mgn, // Mbangi
	iso639_mgo, // Meta'
	iso639_mgp, // Eastern Magar
	iso639_mgq, // Malila
	iso639_mgr, // Mambwe-Lungu
	iso639_mgs, // Manda (Tanzania)
	iso639_mgt, // Mongol
	iso639_mgu, // Mailu
	iso639_mgv, // Matengo
	iso639_mgw, // Matumbi
	iso639_mgy, // Mbunga
	iso639_mgz, // Mbugwe
	iso639_mha, // Manda (India)
	iso639_mhb, // Mahongwe
	iso639_mhc, // Mocho
	iso639_mhd, // Mbugu
	iso639_mhe, // Besisi
	iso639_mhf, // Mamaa
	iso639_mhg, // Margu
	iso639_mhh, // Maskoy Pidgin
	iso639_mhi, // Ma'di
	iso639_mhj, // Mogholi
	iso639_mhk, // Mungaka
	iso639_mhl, // Mauwake
	iso639_mhm, // Makhuwa-Moniga
	iso639_mhn, // Mócheno
	iso639_mho, // Mashi (Zambia)
	iso639_mhp, // Balinese Malay
	iso639_mhq, // Mandan
	iso639_mhr, // Eastern Mari
	iso639_mhs, // Buru (Indonesia)
	iso639_mht, // Mandahuaca
	iso639_mhu, // Digaro-Mishmi
	iso639_mhw, // Mbukushu
	iso639_mhx, // Maru
	iso639_mhy, // Ma'anyan
	iso639_mhz, // Mor (Mor Islands)
	iso639_mia, // Miami
	iso639_mib, // Atatláhuca Mixtec
	iso639_mic, // Mi'kmaq
	iso639_mid, // Mandaic
	iso639_mie, // Ocotepec Mixtec
	iso639_mif, // Mofu-Gudur
	iso639_mig, // San Miguel El Grande Mixtec
	iso639_mih, // Chayuco Mixtec
	iso639_mii, // Chigmecatitlán Mixtec
	iso639_mij, // Abar
	iso639_mik, // Mikasuki
	iso639_mil, // Peñoles Mixtec
	iso639_mim, // Alacatlatzala Mixtec
	iso639_min, // Minangkabau
	iso639_mio, // Pinotepa Nacional Mixtec
	iso639_mip, // Apasco-Apoala Mixtec
	iso639_miq, // Mískito
	iso639_mir, // Isthmus Mixe
	iso639_mis, // Uncoded languages
	iso639_mit, // Southern Puebla Mixtec
	iso639_miu, // Cacaloxtepec Mixtec
	iso639_miw, // Akoye
	iso639_mix, // Mixtepec Mixtec
	iso639_miy, // Ayutla Mixtec
	iso639_miz, // Coatzospan Mixtec
	iso639_mjc, // San Juan Colorado Mixtec
	iso639_mjd, // Northwest Maidu
	iso639_mje, // Muskum
	iso639_mjg, // Tu
	iso639_mjh, // Mwera (Nyasa)
	iso639_mji, // Kim Mun
	iso639_mjj, // Mawak
	iso639_mjk, // Matukar
	iso639_mjl, // Mandeali
	iso639_mjm, // Medebur
	iso639_mjn, // Ma (Papua New Guinea)
	iso639_mjo, // Malankuravan
	iso639_mjp, // Malapandaram
	iso639_mjq, // Malaryan
	iso639_mjr, // Malavedan
	iso639_mjs, // Miship
	iso639_mjt, // Sauria Paharia
	iso639_mju, // Manna-Dora
	iso639_mjv, // Mannan
	iso639_mjw, // Karbi
	iso639_mjx, // Mahali
	iso639_mjy, // Mahican
	iso639_mjz, // Majhi
	iso639_mka, // Mbre
	iso639_mkb, // Mal Paharia
	iso639_mkc, // Siliput
	iso639_mkd, // Macedonian
	iso639_mke, // Mawchi
	iso639_mkf, // Miya
	iso639_mkg, // Mak (China)
	iso639_mki, // Dhatki
	iso639_mkj, // Mokilese
	iso639_mkk, // Byep
	iso639_mkl, // Mokole
	iso639_mkm, // Moklen
	iso639_mkn, // Kupang Malay
	iso639_mko, // Mingang Doso
	iso639_mkp, // Moikodi
	iso639_mkq, // Bay Miwok
	iso639_mkr, // Malas
	iso639_mks, // Silacayoapan Mixtec
	iso639_mkt, // Vamale
	iso639_mku, // Konyanka Maninka
	iso639_mkv, // Mafea
	iso639_mkw, // Kituba (Congo)
	iso639_mkx, // Kinamiging Manobo
	iso639_mky, // East Makian
	iso639_mkz, // Makasae
	iso639_mla, // Malo
	iso639_mlb, // Mbule
	iso639_mlc, // Cao Lan
	iso639_mld, // Malakhel
	iso639_mle, // Manambu
	iso639_mlf, // Mal
	iso639_mlg, // Malagasy
	iso639_mlh, // Mape
	iso639_mli, // Malimpung
	iso639_mlj, // Miltu
	iso639_mlk, // Ilwana
	iso639_mll, // Malua Bay
	iso639_mlm, // Mulam
	iso639_mln, // Malango
	iso639_mlo, // Mlomp
	iso639_mlp, // Bargam
	iso639_mlq, // Western Maninkakan
	iso639_mlr, // Vame
	iso639_mls, // Masalit
	iso639_mlt, // Maltese
	iso639_mlu, // To'abaita
	iso639_mlv, // Motlav
	iso639_mlw, // Moloko
	iso639_mlx, // Malfaxal
	iso639_mlz, // Malaynon
	iso639_mma, // Mama
	iso639_mmb, // Momina
	iso639_mmc, // Michoacán Mazahua
	iso639_mmd, // Maonan
	iso639_mme, // Mae
	iso639_mmf, // Mundat
	iso639_mmg, // North Ambrym
	iso639_mmh, // Mehináku
	iso639_mmi, // Musar
	iso639_mmj, // Majhwar
	iso639_mmk, // Mukha-Dora
	iso639_mml, // Man Met
	iso639_mmm, // Maii
	iso639_mmn, // Mamanwa
	iso639_mmo, // Mangga Buang
	iso639_mmp, // Siawi
	iso639_mmq, // Musak
	iso639_mmr, // Western Xiangxi Miao
	iso639_mmt, // Malalamai
	iso639_mmu, // Mmaala
	iso639_mmv, // Miriti
	iso639_mmw, // Emae
	iso639_mmx, // Madak
	iso639_mmy, // Migaama
	iso639_mmz, // Mabaale
	iso639_mna, // Mbula
	iso639_mnb, // Muna
	iso639_mnc, // Manchu
	iso639_mnd, // Mondé
	iso639_mne, // Naba
	iso639_mnf, // Mundani
	iso639_mng, // Eastern Mnong
	iso639_mnh, // Mono (Democratic Republic of Congo)
	iso639_mni, // Manipuri
	iso639_mnj, // Munji
	iso639_mnk, // Mandinka
	iso639_mnl, // Tiale
	iso639_mnm, // Mapena
	iso639_mnn, // Southern Mnong
	iso639_mnp, // Min Bei Chinese
	iso639_mnq, // Minriq
	iso639_mnr, // Mono (USA)
	iso639_mns, // Mansi
	iso639_mnt, // Maykulan
	iso639_mnu, // Mer
	iso639_mnv, // Rennell-Bellona
	iso639_mnw, // Mon
	iso639_mnx, // Manikion
	iso639_mny, // Manyawa
	iso639_mnz, // Moni
	iso639_moa, // Mwan
	iso639_moc, // Mocoví
	iso639_mod, // Mobilian
	iso639_moe, // Montagnais
	iso639_mog, // Mongondow
	iso639_moh, // Mohawk
	iso639_moi, // Mboi
	iso639_moj, // Monzombo
	iso639_mok, // Morori
	iso639_mom, // Mangue
	iso639_mon, // Mongolian
	iso639_moo, // Monom
	iso639_mop, // Mopán Maya
	iso639_moq, // Mor (Bomberai Peninsula)
	iso639_mor, // Moro
	iso639_mos, // Mossi
	iso639_mot, // Barí
	iso639_mou, // Mogum
	iso639_mov, // Mohave
	iso639_mow, // Moi (Congo)
	iso639_mox, // Molima
	iso639_moy, // Shekkacho
	iso639_moz, // Mukulu
	iso639_mpa, // Mpoto
	iso639_mpb, // Mullukmulluk
	iso639_mpc, // Mangarayi
	iso639_mpd, // Machinere
	iso639_mpe, // Majang
	iso639_mpg, // Marba
	iso639_mph, // Maung
	iso639_mpi, // Mpade
	iso639_mpj, // Martu Wangka
	iso639_mpk, // Mbara (Chad)
	iso639_mpl, // Middle Watut
	iso639_mpm, // Yosondúa Mixtec
	iso639_mpn, // Mindiri
	iso639_mpo, // Miu
	iso639_mpp, // Migabac
	iso639_mpq, // Matís
	iso639_mpr, // Vangunu
	iso639_mps, // Dadibi
	iso639_mpt, // Mian
	iso639_mpu, // Makuráp
	iso639_mpv, // Mungkip
	iso639_mpw, // Mapidian
	iso639_mpx, // Misima-Panaeati
	iso639_mpy, // Mapia
	iso639_mpz, // Mpi
	iso639_mqa, // Maba (Indonesia)
	iso639_mqb, // Mbuko
	iso639_mqc, // Mangole
	iso639_mqe, // Matepi
	iso639_mqf, // Momuna
	iso639_mqg, // Kota Bangun Kutai Malay
	iso639_mqh, // Tlazoyaltepec Mixtec
	iso639_mqi, // Mariri
	iso639_mqj, // Mamasa
	iso639_mqk, // Rajah Kabunsuwan Manobo
	iso639_mql, // Mbelime
	iso639_mqm, // South Marquesan
	iso639_mqn, // Moronene
	iso639_mqo, // Modole
	iso639_mqp, // Manipa
	iso639_mqq, // Minokok
	iso639_mqr, // Mander
	iso639_mqs, // West Makian
	iso639_mqt, // Mok
	iso639_mqu, // Mandari
	iso639_mqv, // Mosimo
	iso639_mqw, // Murupi
	iso639_mqx, // Mamuju
	iso639_mqy, // Manggarai
	iso639_mqz, // Pano
	iso639_mra, // Mlabri
	iso639_mrb, // Marino
	iso639_mrc, // Maricopa
	iso639_mrd, // Western Magar
	iso639_mre, // Martha's Vineyard Sign Language
	iso639_mrf, // Elseng
	iso639_mrg, // Mising
	iso639_mrh, // Mara Chin
	iso639_mri, // Maori
	iso639_mrj, // Western Mari
	iso639_mrk, // Hmwaveke
	iso639_mrl, // Mortlockese
	iso639_mrm, // Merlav
	iso639_mrn, // Cheke Holo
	iso639_mro, // Mru
	iso639_mrp, // Morouas
	iso639_mrq, // North Marquesan
	iso639_mrr, // Maria (India)
	iso639_mrs, // Maragus
	iso639_mrt, // Marghi Central
	iso639_mru, // Mono (Cameroon)
	iso639_mrv, // Mangareva
	iso639_mrw, // Maranao
	iso639_mrx, // Maremgi
	iso639_mry, // Mandaya
	iso639_mrz, // Marind
	iso639_msa, // Malay
	iso639_msb, // Masbatenyo
	iso639_msc, // Sankaran Maninka
	iso639_msd, // Yucatec Maya Sign Language
	iso639_mse, // Musey
	iso639_msf, // Mekwei
	iso639_msg, // Moraid
	iso639_msh, // Masikoro Malagasy
	iso639_msi, // Sabah Malay
	iso639_msj, // Ma (Democratic Republic of Congo)
	iso639_msk, // Mansaka
	iso639_msl, // Molof
	iso639_msm, // Agusan Manobo
	iso639_msn, // Vurës
	iso639_mso, // Mombum
	iso639_msp, // Maritsauá
	iso639_msq, // Caac
	iso639_msr, // Mongolian Sign Language
	iso639_mss, // West Masela
	iso639_msu, // Musom
	iso639_msv, // Maslam
	iso639_msw, // Mansoanka
	iso639_msx, // Moresada
	iso639_msy, // Aruamu
	iso639_msz, // Momare
	iso639_mta, // Cotabato Manobo
	iso639_mtb, // Anyin Morofo
	iso639_mtc, // Munit
	iso639_mtd, // Mualang
	iso639_mte, // Mono (Solomon Islands)
	iso639_mtf, // Murik (Papua New Guinea)
	iso639_mtg, // Una
	iso639_mth, // Munggui
	iso639_mti, // Maiwa (Papua New Guinea)
	iso639_mtj, // Moskona
	iso639_mtk, // Mbe'
	iso639_mtl, // Montol
	iso639_mtm, // Mator
	iso639_mtn, // Matagalpa
	iso639_mto, // Totontepec Mixe
	iso639_mtp, // Wichí Lhamtés Nocten
	iso639_mtq, // Muong
	iso639_mtr, // Mewari
	iso639_mts, // Yora
	iso639_mtt, // Mota
	iso639_mtu, // Tututepec Mixtec
	iso639_mtv, // Asaro'o
	iso639_mtw, // Southern Binukidnon
	iso639_mtx, // Tidaá Mixtec
	iso639_mty, // Nabi
	iso639_mua, // Mundang
	iso639_mub, // Mubi
	iso639_muc, // Mbu'
	iso639_mud, // Mednyj Aleut
	iso639_mue, // Media Lengua
	iso639_mug, // Musgu
	iso639_muh, // Mündü
	iso639_mui, // Musi
	iso639_muj, // Mabire
	iso639_muk, // Mugom
	iso639_mul, // Multiple languages
	iso639_mum, // Maiwala
	iso639_muo, // Nyong
	iso639_mup, // Malvi
	iso639_muq, // Eastern Xiangxi Miao
	iso639_mur, // Murle
	iso639_mus, // Creek
	iso639_mut, // Western Muria
	iso639_muu, // Yaaku
	iso639_muv, // Muthuvan
	iso639_mux, // Bo-Ung
	iso639_muy, // Muyang
	iso639_muz, // Mursi
	iso639_mva, // Manam
	iso639_mvb, // Mattole
	iso639_mvd, // Mamboru
	iso639_mve, // Marwari (Pakistan)
	iso639_mvf, // Peripheral Mongolian
	iso639_mvg, // Yucuañe Mixtec
	iso639_mvh, // Mulgi
	iso639_mvi, // Miyako
	iso639_mvk, // Mekmek
	iso639_mvl, // Mbara (Australia)
	iso639_mvm, // Muya
	iso639_mvn, // Minaveha
	iso639_mvo, // Marovo
	iso639_mvp, // Duri
	iso639_mvq, // Moere
	iso639_mvr, // Marau
	iso639_mvs, // Massep
	iso639_mvt, // Mpotovoro
	iso639_mvu, // Marfa
	iso639_mvv, // Tagal Murut
	iso639_mvw, // Machinga
	iso639_mvx, // Meoswar
	iso639_mvy, // Indus Kohistani
	iso639_mvz, // Mesqan
	iso639_mwa, // Mwatebu
	iso639_mwb, // Juwal
	iso639_mwc, // Are
	iso639_mwd, // Mudbura
	iso639_mwe, // Mwera (Chimwera)
	iso639_mwf, // Murrinh-Patha
	iso639_mwg, // Aiklep
	iso639_mwh, // Mouk-Aria
	iso639_mwi, // Labo
	iso639_mwj, // Maligo
	iso639_mwk, // Kita Maninkakan
	iso639_mwl, // Mirandese
	iso639_mwm, // Sar
	iso639_mwn, // Nyamwanga
	iso639_mwo, // Central Maewo
	iso639_mwp, // Kala Lagaw Ya
	iso639_mwq, // Mün Chin
	iso639_mwr, // Marwari
	iso639_mws, // Mwimbi-Muthambi
	iso639_mwt, // Moken
	iso639_mwu, // Mittu
	iso639_mwv, // Mentawai
	iso639_mww, // Hmong Daw
	iso639_mwx, // Mediak
	iso639_mwy, // Mosiro
	iso639_mwz, // Moingi
	iso639_mxa, // Northwest Oaxaca Mixtec
	iso639_mxb, // Tezoatlán Mixtec
	iso639_mxc, // Manyika
	iso639_mxd, // Modang
	iso639_mxe, // Mele-Fila
	iso639_mxf, // Malgbe
	iso639_mxg, // Mbangala
	iso639_mxh, // Mvuba
	iso639_mxi, // Mozarabic
	iso639_mxj, // Miju-Mishmi
	iso639_mxk, // Monumbo
	iso639_mxl, // Maxi Gbe
	iso639_mxm, // Meramera
	iso639_mxn, // Moi (Indonesia)
	iso639_mxo, // Mbowe
	iso639_mxp, // Tlahuitoltepec Mixe
	iso639_mxq, // Juquila Mixe
	iso639_mxr, // Murik (Malaysia)
	iso639_mxs, // Huitepec Mixtec
	iso639_mxt, // Jamiltepec Mixtec
	iso639_mxu, // Mada (Cameroon)
	iso639_mxv, // Metlatónoc Mixtec
	iso639_mxw, // Namo
	iso639_mxx, // Mahou
	iso639_mxy, // Southeastern Nochixtlán Mixtec
	iso639_mxz, // Central Masela
	iso639_mya, // Burmese
	iso639_myb, // Mbay
	iso639_myc, // Mayeka
	iso639_myd, // Maramba
	iso639_mye, // Myene
	iso639_myf, // Bambassi
	iso639_myg, // Manta
	iso639_myh, // Makah
	iso639_myi, // Mina (India)
	iso639_myj, // Mangayat
	iso639_myk, // Mamara Senoufo
	iso639_myl, // Moma
	iso639_mym, // Me'en
	iso639_myo, // Anfillo
	iso639_myp, // Pirahã
	iso639_myq, // Forest Maninka
	iso639_myr, // Muniche
	iso639_mys, // Mesmes
	iso639_myu, // Mundurukú
	iso639_myv, // Erzya
	iso639_myw, // Muyuw
	iso639_myx, // Masaaba
	iso639_myy, // Macuna
	iso639_myz, // Classical Mandaic
	iso639_mza, // Santa María Zacatepec Mixtec
	iso639_mzb, // Tumzabt
	iso639_mzc, // Madagascar Sign Language
	iso639_mzd, // Malimba
	iso639_mze, // Morawa
	iso639_mzg, // Monastic Sign Language
	iso639_mzh, // Wichí Lhamtés Güisnay
	iso639_mzi, // Ixcatlán Mazatec
	iso639_mzj, // Manya
	iso639_mzk, // Nigeria Mambila
	iso639_mzl, // Mazatlán Mixe
	iso639_mzm, // Mumuye
	iso639_mzn, // Mazanderani
	iso639_mzo, // Matipuhy
	iso639_mzp, // Movima
	iso639_mzq, // Mori Atas
	iso639_mzr, // Marúbo
	iso639_mzs, // Macanese
	iso639_mzt, // Mintil
	iso639_mzu, // Inapang
	iso639_mzv, // Manza
	iso639_mzw, // Deg
	iso639_mzx, // Mawayana
	iso639_mzy, // Mozambican Sign Language
	iso639_mzz, // Maiadomu
	iso639_naa, // Namla
	iso639_nab, // Southern Nambikuára
	iso639_nac, // Narak
	iso639_nad, // Nijadali
	iso639_nae, // Naka'ela
	iso639_naf, // Nabak
	iso639_nag, // Naga Pidgin
	iso639_naj, // Nalu
	iso639_nak, // Nakanai
	iso639_nal, // Nalik
	iso639_nam, // Ngan'gityemerri
	iso639_nan, // Min Nan Chinese
	iso639_nao, // Naaba
	iso639_nap, // Neapolitan
	iso639_naq, // Nama (Namibia)
	iso639_nar, // Iguta
	iso639_nas, // Naasioi
	iso639_nat, // Hungworo
	iso639_nau, // Nauru
	iso639_nav, // Navajo
	iso639_naw, // Nawuri
	iso639_nax, // Nakwi
	iso639_nay, // Narrinyeri
	iso639_naz, // Coatepec Nahuatl
	iso639_nba, // Nyemba
	iso639_nbb, // Ndoe
	iso639_nbc, // Chang Naga
	iso639_nbd, // Ngbinda
	iso639_nbe, // Konyak Naga
	iso639_nbg, // Nagarchal
	iso639_nbh, // Ngamo
	iso639_nbi, // Mao Naga
	iso639_nbj, // Ngarinman
	iso639_nbk, // Nake
	iso639_nbl, // South Ndebele
	iso639_nbm, // Ngbaka Ma'bo
	iso639_nbn, // Kuri
	iso639_nbo, // Nkukoli
	iso639_nbp, // Nnam
	iso639_nbq, // Nggem
	iso639_nbr, // Numana-Nunku-Gbantu-Numbu
	iso639_nbs, // Namibian Sign Language
	iso639_nbt, // Na
	iso639_nbu, // Rongmei Naga
	iso639_nbv, // Ngamambo
	iso639_nbw, // Southern Ngbandi
	iso639_nbx, // Ngura
	iso639_nby, // Ningera
	iso639_nca, // Iyo
	iso639_ncb, // Central Nicobarese
	iso639_ncc, // Ponam
	iso639_ncd, // Nachering
	iso639_nce, // Yale
	iso639_ncf, // Notsi
	iso639_ncg, // Nisga'a
	iso639_nch, // Central Huasteca Nahuatl
	iso639_nci, // Classical Nahuatl
	iso639_ncj, // Northern Puebla Nahuatl
	iso639_nck, // Nakara
	iso639_ncl, // Michoacán Nahuatl
	iso639_ncm, // Nambo
	iso639_ncn, // Nauna
	iso639_nco, // Sibe
	iso639_ncp, // Ndaktup
	iso639_ncr, // Ncane
	iso639_ncs, // Nicaraguan Sign Language
	iso639_nct, // Chothe Naga
	iso639_ncu, // Chumburung
	iso639_ncx, // Central Puebla Nahuatl
	iso639_ncz, // Natchez
	iso639_nda, // Ndasa
	iso639_ndb, // Kenswei Nsei
	iso639_ndc, // Ndau
	iso639_ndd, // Nde-Nsele-Nta
	iso639_nde, // North Ndebele
	iso639_ndf, // Nadruvian
	iso639_ndg, // Ndengereko
	iso639_ndh, // Ndali
	iso639_ndi, // Samba Leko
	iso639_ndj, // Ndamba
	iso639_ndk, // Ndaka
	iso639_ndl, // Ndolo
	iso639_ndm, // Ndam
	iso639_ndn, // Ngundi
	iso639_ndo, // Ndonga
	iso639_ndp, // Ndo
	iso639_ndq, // Ndombe
	iso639_ndr, // Ndoola
	iso639_nds, // Low German
	iso639_ndt, // Ndunga
	iso639_ndu, // Dugun
	iso639_ndv, // Ndut
	iso639_ndw, // Ndobo
	iso639_ndx, // Nduga
	iso639_ndy, // Lutos
	iso639_ndz, // Ndogo
	iso639_nea, // Eastern Ngad'a
	iso639_neb, // Toura (Côte d'Ivoire)
	iso639_nec, // Nedebang
	iso639_ned, // Nde-Gbite
	iso639_nee, // Nêlêmwa-Nixumwak
	iso639_nef, // Nefamese
	iso639_neg, // Negidal
	iso639_neh, // Nyenkha
	iso639_nei, // Neo-Hittite
	iso639_nej, // Neko
	iso639_nek, // Neku
	iso639_nem, // Nemi
	iso639_nen, // Nengone
	iso639_neo, // Ná-Meo
	iso639_nep, // Nepali
	iso639_neq, // North Central Mixe
	iso639_ner, // Yahadian
	iso639_nes, // Bhoti Kinnauri
	iso639_net, // Nete
	iso639_neu, // Neo
	iso639_nev, // Nyaheun
	iso639_new, // Newari
	iso639_nex, // Neme
	iso639_ney, // Neyo
	iso639_nez, // Nez Perce
	iso639_nfa, // Dhao
	iso639_nfd, // Ahwai
	iso639_nfl, // Ayiwo
	iso639_nfr, // Nafaanra
	iso639_nfu, // Mfumte
	iso639_nga, // Ngbaka
	iso639_ngb, // Northern Ngbandi
	iso639_ngc, // Ngombe (Democratic Republic of Congo)
	iso639_ngd, // Ngando (Central African Republic)
	iso639_nge, // Ngemba
	iso639_ngg, // Ngbaka Manza
	iso639_ngh, // N/u
	iso639_ngi, // Ngizim
	iso639_ngj, // Ngie
	iso639_ngk, // Ngalkbun
	iso639_ngl, // Lomwe
	iso639_ngm, // Ngatik Men's Creole
	iso639_ngn, // Ngwo
	iso639_ngo, // Ngoni
	iso639_ngp, // Ngulu
	iso639_ngq, // Ngurimi
	iso639_ngr, // Engdewu
	iso639_ngs, // Gvoko
	iso639_ngt, // Ngeq
	iso639_ngu, // Guerrero Nahuatl
	iso639_ngv, // Nagumi
	iso639_ngw, // Ngwaba
	iso639_ngx, // Nggwahyi
	iso639_ngy, // Tibea
	iso639_ngz, // Ngungwel
	iso639_nha, // Nhanda
	iso639_nhb, // Beng
	iso639_nhc, // Tabasco Nahuatl
	iso639_nhd, // Chiripá
	iso639_nhe, // Eastern Huasteca Nahuatl
	iso639_nhf, // Nhuwala
	iso639_nhg, // Tetelcingo Nahuatl
	iso639_nhh, // Nahari
	iso639_nhi, // Zacatlán-Ahuacatlán-Tepetzintla Nahuatl
	iso639_nhk, // Isthmus-Cosoleacaque Nahuatl
	iso639_nhm, // Morelos Nahuatl
	iso639_nhn, // Central Nahuatl
	iso639_nho, // Takuu
	iso639_nhp, // Isthmus-Pajapan Nahuatl
	iso639_nhq, // Huaxcaleca Nahuatl
	iso639_nhr, // Naro
	iso639_nht, // Ometepec Nahuatl
	iso639_nhu, // Noone
	iso639_nhv, // Temascaltepec Nahuatl
	iso639_nhw, // Western Huasteca Nahuatl
	iso639_nhx, // Isthmus-Mecayapan Nahuatl
	iso639_nhy, // Northern Oaxaca Nahuatl
	iso639_nhz, // Santa María La Alta Nahuatl
	iso639_nia, // Nias
	iso639_nib, // Nakame
	iso639_nid, // Ngandi
	iso639_nie, // Niellim
	iso639_nif, // Nek
	iso639_nig, // Ngalakan
	iso639_nih, // Nyiha (Tanzania)
	iso639_nii, // Nii
	iso639_nij, // Ngaju
	iso639_nik, // Southern Nicobarese
	iso639_nil, // Nila
	iso639_nim, // Nilamba
	iso639_nin, // Ninzo
	iso639_nio, // Nganasan
	iso639_niq, // Nandi
	iso639_nir, // Nimboran
	iso639_nis, // Nimi
	iso639_nit, // Southeastern Kolami
	iso639_niu, // Niuean
	iso639_niv, // Gilyak
	iso639_niw, // Nimo
	iso639_nix, // Hema
	iso639_niy, // Ngiti
	iso639_niz, // Ningil
	iso639_nja, // Nzanyi
	iso639_njb, // Nocte Naga
	iso639_njd, // Ndonde Hamba
	iso639_njh, // Lotha Naga
	iso639_nji, // Gudanji
	iso639_njj, // Njen
	iso639_njl, // Njalgulgule
	iso639_njm, // Angami Naga
	iso639_njn, // Liangmai Naga
	iso639_njo, // Ao Naga
	iso639_njr, // Njerep
	iso639_njs, // Nisa
	iso639_njt, // Ndyuka-Trio Pidgin
	iso639_nju, // Ngadjunmaya
	iso639_njx, // Kunyi
	iso639_njy, // Njyem
	iso639_njz, // Nyishi
	iso639_nka, // Nkoya
	iso639_nkb, // Khoibu Naga
	iso639_nkc, // Nkongho
	iso639_nkd, // Koireng
	iso639_nke, // Duke
	iso639_nkf, // Inpui Naga
	iso639_nkg, // Nekgini
	iso639_nkh, // Khezha Naga
	iso639_nki, // Thangal Naga
	iso639_nkj, // Nakai
	iso639_nkk, // Nokuku
	iso639_nkm, // Namat
	iso639_nkn, // Nkangala
	iso639_nko, // Nkonya
	iso639_nkp, // Niuatoputapu
	iso639_nkq, // Nkami
	iso639_nkr, // Nukuoro
	iso639_nks, // North Asmat
	iso639_nkt, // Nyika (Tanzania)
	iso639_nku, // Bouna Kulango
	iso639_nkv, // Nyika (Malawi and Zambia)
	iso639_nkw, // Nkutu
	iso639_nkx, // Nkoroo
	iso639_nkz, // Nkari
	iso639_nla, // Ngombale
	iso639_nlc, // Nalca
	iso639_nld, // Dutch
	iso639_nle, // East Nyala
	iso639_nlg, // Gela
	iso639_nli, // Grangali
	iso639_nlj, // Nyali
	iso639_nlk, // Ninia Yali
	iso639_nll, // Nihali
	iso639_nlo, // Ngul
	iso639_nlr, // Ngarla
	iso639_nlu, // Nchumbulu
	iso639_nlv, // Orizaba Nahuatl
	iso639_nlx, // Nahali
	iso639_nly, // Nyamal
	iso639_nlz, // Nalögo
	iso639_nma, // Maram Naga
	iso639_nmb, // Big Nambas
	iso639_nmc, // Ngam
	iso639_nmd, // Ndumu
	iso639_nme, // Mzieme Naga
	iso639_nmf, // Tangkhul Naga (India)
	iso639_nmg, // Kwasio
	iso639_nmh, // Monsang Naga
	iso639_nmi, // Nyam
	iso639_nmj, // Ngombe (Central African Republic)
	iso639_nmk, // Namakura
	iso639_nml, // Ndemli
	iso639_nmm, // Manangba
	iso639_nmn, // !Xóõ
	iso639_nmo, // Moyon Naga
	iso639_nmp, // Nimanbur
	iso639_nmq, // Nambya
	iso639_nmr, // Nimbari
	iso639_nms, // Letemboi
	iso639_nmt, // Namonuito
	iso639_nmu, // Northeast Maidu
	iso639_nmv, // Ngamini
	iso639_nmw, // Nimoa
	iso639_nmx, // Nama (Papua New Guinea)
	iso639_nmy, // Namuyi
	iso639_nmz, // Nawdm
	iso639_nna, // Nyangumarta
	iso639_nnb, // Nande
	iso639_nnc, // Nancere
	iso639_nnd, // West Ambae
	iso639_nne, // Ngandyera
	iso639_nnf, // Ngaing
	iso639_nng, // Maring Naga
	iso639_nnh, // Ngiemboon
	iso639_nni, // North Nuaulu
	iso639_nnj, // Nyangatom
	iso639_nnk, // Nankina
	iso639_nnl, // Northern Rengma Naga
	iso639_nnm, // Namia
	iso639_nnn, // Ngete
	iso639_nno, // Norwegian Nynorsk
	iso639_nnp, // Wancho Naga
	iso639_nnq, // Ngindo
	iso639_nnr, // Narungga
	iso639_nns, // Ningye
	iso639_nnt, // Nanticoke
	iso639_nnu, // Dwang
	iso639_nnv, // Nugunu (Australia)
	iso639_nnw, // Southern Nuni
	iso639_nnx, // Ngong
	iso639_nny, // Nyangga
	iso639_nnz, // Nda'nda'
	iso639_noa, // Woun Meu
	iso639_nob, // Norwegian Bokmål
	iso639_noc, // Nuk
	iso639_nod, // Northern Thai
	iso639_noe, // Nimadi
	iso639_nof, // Nomane
	iso639_nog, // Nogai
	iso639_noh, // Nomu
	iso639_noi, // Noiri
	iso639_noj, // Nonuya
	iso639_nok, // Nooksack
	iso639_nom, // Nocamán
	iso639_non, // Old Norse
	iso639_nop, // Numanggang
	iso639_noq, // Ngongo
	iso639_nor, // Norwegian
	iso639_nos, // Eastern Nisu
	iso639_not, // Nomatsiguenga
	iso639_nou, // Ewage-Notu
	iso639_nov, // Novial
	iso639_now, // Nyambo
	iso639_noy, // Noy
	iso639_noz, // Nayi
	iso639_npa, // Nar Phu
	iso639_npb, // Nupbikha
	iso639_npg, // Ponyo-Gongwang Naga
	iso639_nph, // Phom Naga
	iso639_npi, // Nepali (individual language)
	iso639_npl, // Southeastern Puebla Nahuatl
	iso639_npn, // Mondropolon
	iso639_npo, // Pochuri Naga
	iso639_nps, // Nipsan
	iso639_npu, // Puimei Naga
	iso639_npy, // Napu
	iso639_nqg, // Southern Nago
	iso639_nqk, // Kura Ede Nago
	iso639_nqm, // Ndom
	iso639_nqn, // Nen
	iso639_nqo, // N'Ko
	iso639_nqy, // Akyaung Ari Naga
	iso639_nra, // Ngom
	iso639_nrb, // Nara
	iso639_nrc, // Noric
	iso639_nre, // Southern Rengma Naga
	iso639_nrg, // Narango
	iso639_nri, // Chokri Naga
	iso639_nrl, // Ngarluma
	iso639_nrm, // Narom
	iso639_nrn, // Norn
	iso639_nrp, // North Picene
	iso639_nrr, // Norra
	iso639_nrt, // Northern Kalapuya
	iso639_nru, // Narua
	iso639_nrx, // Ngurmbur
	iso639_nrz, // Lala
	iso639_nsa, // Sangtam Naga
	iso639_nsc, // Nshi
	iso639_nsd, // Southern Nisu
	iso639_nse, // Nsenga
	iso639_nsf, // Northwestern Nisu
	iso639_nsg, // Ngasa
	iso639_nsh, // Ngoshie
	iso639_nsi, // Nigerian Sign Language
	iso639_nsk, // Naskapi
	iso639_nsl, // Norwegian Sign Language
	iso639_nsm, // Sumi Naga
	iso639_nsn, // Nehan
	iso639_nso, // Pedi
	iso639_nsp, // Nepalese Sign Language
	iso639_nsq, // Northern Sierra Miwok
	iso639_nsr, // Maritime Sign Language
	iso639_nss, // Nali
	iso639_nst, // Tase Naga
	iso639_nsu, // Sierra Negra Nahuatl
	iso639_nsv, // Southwestern Nisu
	iso639_nsw, // Navut
	iso639_nsx, // Nsongo
	iso639_nsy, // Nasal
	iso639_nsz, // Nisenan
	iso639_nte, // Nathembo
	iso639_nti, // Natioro
	iso639_ntj, // Ngaanyatjarra
	iso639_ntk, // Ikoma-Nata-Isenye
	iso639_ntm, // Nateni
	iso639_nto, // Ntomba
	iso639_ntp, // Northern Tepehuan
	iso639_ntr, // Delo
	iso639_nts, // Natagaimas
	iso639_ntu, // Natügu
	iso639_ntw, // Nottoway
	iso639_ntx, // Tangkhul Naga (Myanmar)
	iso639_nty, // Mantsi
	iso639_ntz, // Natanzi
	iso639_nua, // Yuaga
	iso639_nuc, // Nukuini
	iso639_nud, // Ngala
	iso639_nue, // Ngundu
	iso639_nuf, // Nusu
	iso639_nug, // Nungali
	iso639_nuh, // Ndunda
	iso639_nui, // Ngumbi
	iso639_nuj, // Nyole
	iso639_nuk, // Nuu-chah-nulth
	iso639_nul, // Nusa Laut
	iso639_num, // Niuafo'ou
	iso639_nun, // Anong
	iso639_nuo, // Nguôn
	iso639_nup, // Nupe-Nupe-Tako
	iso639_nuq, // Nukumanu
	iso639_nur, // Nukuria
	iso639_nus, // Nuer
	iso639_nut, // Nung (Viet Nam)
	iso639_nuu, // Ngbundu
	iso639_nuv, // Northern Nuni
	iso639_nuw, // Nguluwan
	iso639_nux, // Mehek
	iso639_nuy, // Nunggubuyu
	iso639_nuz, // Tlamacazapa Nahuatl
	iso639_nvh, // Nasarian
	iso639_nvm, // Namiae
	iso639_nvo, // Nyokon
	iso639_nwa, // Nawathinehena
	iso639_nwb, // Nyabwa
	iso639_nwc, // Classical Newari
	iso639_nwe, // Ngwe
	iso639_nwg, // Ngayawung
	iso639_nwi, // Southwest Tanna
	iso639_nwm, // Nyamusa-Molo
	iso639_nwo, // Nauo
	iso639_nwr, // Nawaru
	iso639_nwx, // Middle Newar
	iso639_nwy, // Nottoway-Meherrin
	iso639_nxa, // Nauete
	iso639_nxd, // Ngando (Democratic Republic of Congo)
	iso639_nxe, // Nage
	iso639_nxg, // Ngad'a
	iso639_nxi, // Nindi
	iso639_nxk, // Koki Naga
	iso639_nxl, // South Nuaulu
	iso639_nxm, // Numidian
	iso639_nxn, // Ngawun
	iso639_nxq, // Naxi
	iso639_nxr, // Ninggerum
	iso639_nxu, // Narau
	iso639_nxx, // Nafri
	iso639_nya, // Nyanja
	iso639_nyb, // Nyangbo
	iso639_nyc, // Nyanga-li
	iso639_nyd, // Nyore
	iso639_nye, // Nyengo
	iso639_nyf, // Giryama
	iso639_nyg, // Nyindu
	iso639_nyh, // Nyigina
	iso639_nyi, // Ama (Sudan)
	iso639_nyj, // Nyanga
	iso639_nyk, // Nyaneka
	iso639_nyl, // Nyeu
	iso639_nym, // Nyamwezi
	iso639_nyn, // Nyankole
	iso639_nyo, // Nyoro
	iso639_nyp, // Nyang'i
	iso639_nyq, // Nayini
	iso639_nyr, // Nyiha (Malawi)
	iso639_nys, // Nyunga
	iso639_nyt, // Nyawaygi
	iso639_nyu, // Nyungwe
	iso639_nyv, // Nyulnyul
	iso639_nyw, // Nyaw
	iso639_nyx, // Nganyaywana
	iso639_nyy, // Nyakyusa-Ngonde
	iso639_nza, // Tigon Mbembe
	iso639_nzb, // Njebi
	iso639_nzi, // Nzima
	iso639_nzk, // Nzakara
	iso639_nzm, // Zeme Naga
	iso639_nzs, // New Zealand Sign Language
	iso639_nzu, // Teke-Nzikou
	iso639_nzy, // Nzakambay
	iso639_nzz, // Nanga Dama Dogon
	iso639_oaa, // Orok
	iso639_oac, // Oroch
	iso639_oar, // Old Aramaic (up to 700 BCE)
	iso639_oav, // Old Avar
	iso639_obi, // Obispeño
	iso639_obk, // Southern Bontok
	iso639_obl, // Oblo
	iso639_obm, // Moabite
	iso639_obo, // Obo Manobo
	iso639_obr, // Old Burmese
	iso639_obt, // Old Breton
	iso639_obu, // Obulom
	iso639_oca, // Ocaina
	iso639_och, // Old Chinese
	iso639_oci, // Occitan
	iso639_oco, // Old Cornish
	iso639_ocu, // Atzingo Matlatzinca
	iso639_oda, // Odut
	iso639_odk, // Od
	iso639_odt, // Old Dutch
	iso639_odu, // Odual
	iso639_ofo, // Ofo
	iso639_ofs, // Old Frisian
	iso639_ofu, // Efutop
	iso639_ogb, // Ogbia
	iso639_ogc, // Ogbah
	iso639_oge, // Old Georgian
	iso639_ogg, // Ogbogolo
	iso639_ogo, // Khana
	iso639_ogu, // Ogbronuagum
	iso639_oht, // Old Hittite
	iso639_ohu, // Old Hungarian
	iso639_oia, // Oirata
	iso639_oin, // Inebu One
	iso639_ojb, // Northwestern Ojibwa
	iso639_ojc, // Central Ojibwa
	iso639_ojg, // Eastern Ojibwa
	iso639_oji, // Ojibwa
	iso639_ojp, // Old Japanese
	iso639_ojs, // Severn Ojibwa
	iso639_ojv, // Ontong Java
	iso639_ojw, // Western Ojibwa
	iso639_oka, // Okanagan
	iso639_okb, // Okobo
	iso639_okd, // Okodia
	iso639_oke, // Okpe (Southwestern Edo)
	iso639_okg, // Koko Babangk
	iso639_okh, // Koresh-e Rostam
	iso639_oki, // Okiek
	iso639_okj, // Oko-Juwoi
	iso639_okk, // Kwamtim One
	iso639_okl, // Old Kentish Sign Language
	iso639_okm, // Middle Korean
	iso639_okn, // Oki-No-Erabu
	iso639_oko, // Old Korean (3rd-9th cent.)
	iso639_okr, // Kirike
	iso639_oks, // Oko-Eni-Osayen
	iso639_oku, // Oku
	iso639_okv, // Orokaiva
	iso639_okx, // Okpe (Northwestern Edo)
	iso639_ola, // Walungge
	iso639_old, // Mochi
	iso639_ole, // Olekha
	iso639_olm, // Oloma
	iso639_olo, // Livvi
	iso639_olr, // Olrat
	iso639_oma, // Omaha-Ponca
	iso639_omb, // East Ambae
	iso639_omc, // Mochica
	iso639_ome, // Omejes
	iso639_omg, // Omagua
	iso639_omi, // Omi
	iso639_omk, // Omok
	iso639_oml, // Ombo
	iso639_omn, // Minoan
	iso639_omo, // Utarmbung
	iso639_omp, // Old Manipuri
	iso639_omr, // Old Marathi
	iso639_omt, // Omotik
	iso639_omu, // Omurano
	iso639_omw, // South Tairora
	iso639_omx, // Old Mon
	iso639_ona, // Ona
	iso639_onb, // Lingao
	iso639_one, // Oneida
	iso639_ong, // Olo
	iso639_oni, // Onin
	iso639_onj, // Onjob
	iso639_onk, // Kabore One
	iso639_onn, // Onobasulu
	iso639_ono, // Onondaga
	iso639_onp, // Sartang
	iso639_onr, // Northern One
	iso639_ons, // Ono
	iso639_ont, // Ontenu
	iso639_onu, // Unua
	iso639_onw, // Old Nubian
	iso639_onx, // Onin Based Pidgin
	iso639_ood, // Tohono O'odham
	iso639_oog, // Ong
	iso639_oon, // Önge
	iso639_oor, // Oorlams
	iso639_oos, // Old Ossetic
	iso639_opa, // Okpamheri
	iso639_opk, // Kopkaka
	iso639_opm, // Oksapmin
	iso639_opo, // Opao
	iso639_opt, // Opata
	iso639_opy, // Ofayé
	iso639_ora, // Oroha
	iso639_orc, // Orma
	iso639_ore, // Orejón
	iso639_org, // Oring
	iso639_orh, // Oroqen
	iso639_ori, // Oriya
	iso639_orm, // Oromo
	iso639_orn, // Orang Kanaq
	iso639_oro, // Orokolo
	iso639_orr, // Oruma
	iso639_ors, // Orang Seletar
	iso639_ort, // Adivasi Oriya
	iso639_oru, // Ormuri
	iso639_orv, // Old Russian
	iso639_orw, // Oro Win
	iso639_orx, // Oro
	iso639_ory, // Oriya (individual language)
	iso639_orz, // Ormu
	iso639_osa, // Osage
	iso639_osc, // Oscan
	iso639_osi, // Osing
	iso639_oso, // Ososo
	iso639_osp, // Old Spanish
	iso639_oss, // Ossetian
	iso639_ost, // Osatu
	iso639_osu, // Southern One
	iso639_osx, // Old Saxon
	iso639_ota, // Ottoman Turkish
	iso639_otb, // Old Tibetan
	iso639_otd, // Ot Danum
	iso639_ote, // Mezquital Otomi
	iso639_oti, // Oti
	iso639_otk, // Old Turkish
	iso639_otl, // Tilapa Otomi
	iso639_otm, // Eastern Highland Otomi
	iso639_otn, // Tenango Otomi
	iso639_otq, // Querétaro Otomi
	iso639_otr, // Otoro
	iso639_ots, // Estado de México Otomi
	iso639_ott, // Temoaya Otomi
	iso639_otu, // Otuke
	iso639_otw, // Ottawa
	iso639_otx, // Texcatepec Otomi
	iso639_oty, // Old Tamil
	iso639_otz, // Ixtenco Otomi
	iso639_oua, // Tagargrent
	iso639_oub, // Glio-Oubi
	iso639_oue, // Oune
	iso639_oui, // Old Uighur
	iso639_oum, // Ouma
	iso639_oun, // !O!ung
	iso639_owi, // Owiniga
	iso639_owl, // Old Welsh
	iso639_oyb, // Oy
	iso639_oyd, // Oyda
	iso639_oym, // Wayampi
	iso639_oyy, // Oya'oya
	iso639_ozm, // Koonzime
	iso639_pab, // Parecís
	iso639_pac, // Pacoh
	iso639_pad, // Paumarí
	iso639_pae, // Pagibete
	iso639_paf, // Paranawát
	iso639_pag, // Pangasinan
	iso639_pah, // Tenharim
	iso639_pai, // Pe
	iso639_pak, // Parakanã
	iso639_pal, // Pahlavi
	iso639_pam, // Pampanga
	iso639_pan, // Panjabi
	iso639_pao, // Northern Paiute
	iso639_pap, // Papiamento
	iso639_paq, // Parya
	iso639_par, // Panamint
	iso639_pas, // Papasena
	iso639_pat, // Papitalai
	iso639_pau, // Palauan
	iso639_pav, // Pakaásnovos
	iso639_paw, // Pawnee
	iso639_pax, // Pankararé
	iso639_pay, // Pech
	iso639_paz, // Pankararú
	iso639_pbb, // Páez
	iso639_pbc, // Patamona
	iso639_pbe, // Mezontla Popoloca
	iso639_pbf, // Coyotepec Popoloca
	iso639_pbg, // Paraujano
	iso639_pbh, // E'ñapa Woromaipu
	iso639_pbi, // Parkwa
	iso639_pbl, // Mak (Nigeria)
	iso639_pbn, // Kpasam
	iso639_pbo, // Papel
	iso639_pbp, // Badyara
	iso639_pbr, // Pangwa
	iso639_pbs, // Central Pame
	iso639_pbt, // Southern Pashto
	iso639_pbu, // Northern Pashto
	iso639_pbv, // Pnar
	iso639_pby, // Pyu
	iso639_pca, // Santa Inés Ahuatempan Popoloca
	iso639_pcb, // Pear
	iso639_pcc, // Bouyei
	iso639_pcd, // Picard
	iso639_pce, // Ruching Palaung
	iso639_pcf, // Paliyan
	iso639_pcg, // Paniya
	iso639_pch, // Pardhan
	iso639_pci, // Duruwa
	iso639_pcj, // Parenga
	iso639_pck, // Paite Chin
	iso639_pcl, // Pardhi
	iso639_pcm, // Nigerian Pidgin
	iso639_pcn, // Piti
	iso639_pcp, // Pacahuara
	iso639_pcr, // Panang
	iso639_pcw, // Pyapun
	iso639_pda, // Anam
	iso639_pdc, // Pennsylvania German
	iso639_pdi, // Pa Di
	iso639_pdn, // Podena
	iso639_pdo, // Padoe
	iso639_pdt, // Plautdietsch
	iso639_pdu, // Kayan
	iso639_pea, // Peranakan Indonesian
	iso639_peb, // Eastern Pomo
	iso639_ped, // Mala (Papua New Guinea)
	iso639_pee, // Taje
	iso639_pef, // Northeastern Pomo
	iso639_peg, // Pengo
	iso639_peh, // Bonan
	iso639_pei, // Chichimeca-Jonaz
	iso639_pej, // Northern Pomo
	iso639_pek, // Penchal
	iso639_pel, // Pekal
	iso639_pem, // Phende
	iso639_peo, // Old Persian
	iso639_pep, // Kunja
	iso639_peq, // Southern Pomo
	iso639_pes, // Iranian Persian
	iso639_pev, // Pémono
	iso639_pex, // Petats
	iso639_pey, // Petjo
	iso639_pez, // Eastern Penan
	iso639_pfa, // Pááfang
	iso639_pfe, // Peere
	iso639_pfl, // Pfaelzisch
	iso639_pga, // Sudanese Creole Arabic
	iso639_pgg, // Pangwali
	iso639_pgi, // Pagi
	iso639_pgk, // Rerep
	iso639_pgl, // Primitive Irish
	iso639_pgn, // Paelignian
	iso639_pgs, // Pangseng
	iso639_pgu, // Pagu
	iso639_pha, // Pa-Hng
	iso639_phd, // Phudagi
	iso639_phg, // Phuong
	iso639_phh, // Phukha
	iso639_phk, // Phake
	iso639_phl, // Phalura
	iso639_phm, // Phimbi
	iso639_phn, // Phoenician
	iso639_pho, // Phunoi
	iso639_phq, // Phana'
	iso639_phr, // Pahari-Potwari
	iso639_pht, // Phu Thai
	iso639_phu, // Phuan
	iso639_phv, // Pahlavani
	iso639_phw, // Phangduwali
	iso639_pia, // Pima Bajo
	iso639_pib, // Yine
	iso639_pic, // Pinji
	iso639_pid, // Piaroa
	iso639_pie, // Piro
	iso639_pif, // Pingelapese
	iso639_pig, // Pisabo
	iso639_pih, // Pitcairn-Norfolk
	iso639_pii, // Pini
	iso639_pij, // Pijao
	iso639_pil, // Yom
	iso639_pim, // Powhatan
	iso639_pin, // Piame
	iso639_pio, // Piapoco
	iso639_pip, // Pero
	iso639_pir, // Piratapuyo
	iso639_pis, // Pijin
	iso639_pit, // Pitta Pitta
	iso639_piu, // Pintupi-Luritja
	iso639_piv, // Pileni
	iso639_piw, // Pimbwe
	iso639_pix, // Piu
	iso639_piy, // Piya-Kwonci
	iso639_piz, // Pije
	iso639_pjt, // Pitjantjatjara
	iso639_pka, // Ardhamāgadhī Prākrit
	iso639_pkb, // Pokomo
	iso639_pkc, // Paekche
	iso639_pkg, // Pak-Tong
	iso639_pkh, // Pankhu
	iso639_pkn, // Pakanha
	iso639_pko, // Pökoot
	iso639_pkp, // Pukapuka
	iso639_pkr, // Attapady Kurumba
	iso639_pks, // Pakistan Sign Language
	iso639_pkt, // Maleng
	iso639_pku, // Paku
	iso639_pla, // Miani
	iso639_plb, // Polonombauk
	iso639_plc, // Central Palawano
	iso639_pld, // Polari
	iso639_ple, // Palu'e
	iso639_plg, // Pilagá
	iso639_plh, // Paulohi
	iso639_pli, // Pali
	iso639_plj, // Polci
	iso639_plk, // Kohistani Shina
	iso639_pll, // Shwe Palaung
	iso639_pln, // Palenquero
	iso639_plo, // Oluta Popoluca
	iso639_plp, // Palpa
	iso639_plq, // Palaic
	iso639_plr, // Palaka Senoufo
	iso639_pls, // San Marcos Tlalcoyalco Popoloca
	iso639_plt, // Plateau Malagasy
	iso639_plu, // Palikúr
	iso639_plv, // Southwest Palawano
	iso639_plw, // Brooke's Point Palawano
	iso639_ply, // Bolyu
	iso639_plz, // Paluan
	iso639_pma, // Paama
	iso639_pmb, // Pambia
	iso639_pmc, // Palumata
	iso639_pmd, // Pallanganmiddang
	iso639_pme, // Pwaamei
	iso639_pmf, // Pamona
	iso639_pmh, // Māhārāṣṭri Prākrit
	iso639_pmi, // Northern Pumi
	iso639_pmj, // Southern Pumi
	iso639_pmk, // Pamlico
	iso639_pml, // Lingua Franca
	iso639_pmm, // Pomo
	iso639_pmn, // Pam
	iso639_pmo, // Pom
	iso639_pmq, // Northern Pame
	iso639_pmr, // Paynamar
	iso639_pms, // Piemontese
	iso639_pmt, // Tuamotuan
	iso639_pmu, // Mirpur Panjabi
	iso639_pmw, // Plains Miwok
	iso639_pmx, // Poumei Naga
	iso639_pmy, // Papuan Malay
	iso639_pmz, // Southern Pame
	iso639_pna, // Punan Bah-Biau
	iso639_pnb, // Western Panjabi
	iso639_pnc, // Pannei
	iso639_pne, // Western Penan
	iso639_png, // Pongu
	iso639_pnh, // Penrhyn
	iso639_pni, // Aoheng
	iso639_pnk, // Paunaka
	iso639_pnm, // Punan Batu 1
	iso639_pnn, // Pinai-Hagahai
	iso639_pno, // Panobo
	iso639_pnp, // Pancana
	iso639_pnq, // Pana (Burkina Faso)
	iso639_pnr, // Panim
	iso639_pns, // Ponosakan
	iso639_pnt, // Pontic
	iso639_pnu, // Jiongnai Bunu
	iso639_pnv, // Pinigura
	iso639_pnw, // Panytyima
	iso639_pnx, // Phong-Kniang
	iso639_pny, // Pinyin
	iso639_pnz, // Pana (Central African Republic)
	iso639_poc, // Poqomam
	iso639_pod, // Ponares
	iso639_poe, // San Juan Atzingo Popoloca
	iso639_pof, // Poke
	iso639_pog, // Potiguára
	iso639_poh, // Poqomchi'
	iso639_poi, // Highland Popoluca
	iso639_pok, // Pokangá
	iso639_pol, // Polish
	iso639_pom, // Southeastern Pomo
	iso639_pon, // Pohnpeian
	iso639_poo, // Central Pomo
	iso639_pop, // Pwapwa
	iso639_poq, // Texistepec Popoluca
	iso639_por, // Portuguese
	iso639_pos, // Sayula Popoluca
	iso639_pot, // Potawatomi
	iso639_pov, // Upper Guinea Crioulo
	iso639_pow, // San Felipe Otlaltepec Popoloca
	iso639_pox, // Polabian
	iso639_poy, // Pogolo
	iso639_ppa, // Pao
	iso639_ppe, // Papi
	iso639_ppi, // Paipai
	iso639_ppk, // Uma
	iso639_ppl, // Pipil
	iso639_ppm, // Papuma
	iso639_ppn, // Papapana
	iso639_ppo, // Folopa
	iso639_ppp, // Pelende
	iso639_ppq, // Pei
	iso639_ppr, // Piru
	iso639_pps, // San Luís Temalacayuca Popoloca
	iso639_ppt, // Pare
	iso639_ppu, // Papora
	iso639_pqa, // Pa'a
	iso639_pqm, // Malecite-Passamaquoddy
	iso639_prb, // Lua'
	iso639_prc, // Parachi
	iso639_prd, // Parsi-Dari
	iso639_pre, // Principense
	iso639_prf, // Paranan
	iso639_prg, // Prussian
	iso639_prh, // Porohanon
	iso639_pri, // Paicî
	iso639_prk, // Parauk
	iso639_prl, // Peruvian Sign Language
	iso639_prm, // Kibiri
	iso639_prn, // Prasuni
	iso639_pro, // Old Provençal
	iso639_prp, // Parsi
	iso639_prq, // Ashéninka Perené
	iso639_prr, // Puri
	iso639_prs, // Dari
	iso639_prt, // Phai
	iso639_pru, // Puragi
	iso639_prw, // Parawen
	iso639_prx, // Purik
	iso639_pry, // Pray 3
	iso639_prz, // Providencia Sign Language
	iso639_psa, // Asue Awyu
	iso639_psc, // Persian Sign Language
	iso639_psd, // Plains Indian Sign Language
	iso639_pse, // Central Malay
	iso639_psg, // Penang Sign Language
	iso639_psh, // Southwest Pashayi
	iso639_psi, // Southeast Pashayi
	iso639_psl, // Puerto Rican Sign Language
	iso639_psm, // Pauserna
	iso639_psn, // Panasuan
	iso639_pso, // Polish Sign Language
	iso639_psp, // Philippine Sign Language
	iso639_psq, // Pasi
	iso639_psr, // Portuguese Sign Language
	iso639_pss, // Kaulong
	iso639_pst, // Central Pashto
	iso639_psu, // Sauraseni Prākrit
	iso639_psw, // Port Sandwich
	iso639_psy, // Piscataway
	iso639_pta, // Pai Tavytera
	iso639_pth, // Pataxó Hã-Ha-Hãe
	iso639_pti, // Pintiini
	iso639_ptn, // Patani
	iso639_pto, // Zo'é
	iso639_ptp, // Patep
	iso639_ptr, // Piamatsina
	iso639_ptt, // Enrekang
	iso639_ptu, // Bambam
	iso639_ptv, // Port Vato
	iso639_ptw, // Pentlatch
	iso639_pty, // Pathiya
	iso639_pua, // Western Highland Purepecha
	iso639_pub, // Purum
	iso639_puc, // Punan Merap
	iso639_pud, // Punan Aput
	iso639_pue, // Puelche
	iso639_puf, // Punan Merah
	iso639_pug, // Phuie
	iso639_pui, // Puinave
	iso639_puj, // Punan Tubu
	iso639_puk, // Pu Ko
	iso639_pum, // Puma
	iso639_puo, // Puoc
	iso639_pup, // Pulabu
	iso639_puq, // Puquina
	iso639_pur, // Puruborá
	iso639_pus, // Pushto
	iso639_put, // Putoh
	iso639_puu, // Punu
	iso639_puw, // Puluwatese
	iso639_pux, // Puare
	iso639_puy, // Purisimeño
	iso639_puz, // Purum Naga
	iso639_pwa, // Pawaia
	iso639_pwb, // Panawa
	iso639_pwg, // Gapapaiwa
	iso639_pwm, // Molbog
	iso639_pwn, // Paiwan
	iso639_pwo, // Pwo Western Karen
	iso639_pwr, // Powari
	iso639_pww, // Pwo Northern Karen
	iso639_pxm, // Quetzaltepec Mixe
	iso639_pye, // Pye Krumen
	iso639_pym, // Fyam
	iso639_pyn, // Poyanáwa
	iso639_pys, // Paraguayan Sign Language
	iso639_pyu, // Puyuma
	iso639_pyx, // Pyu (Myanmar)
	iso639_pyy, // Pyen
	iso639_pzn, // Para Naga
	iso639_qua, // Quapaw
	iso639_qub, // Huallaga Huánuco Quechua
	iso639_quc, // K'iche'
	iso639_qud, // Calderón Highland Quichua
	iso639_que, // Quechua
	iso639_quf, // Lambayeque Quechua
	iso639_qug, // Chimborazo Highland Quichua
	iso639_quh, // South Bolivian Quechua
	iso639_qui, // Quileute
	iso639_quk, // Chachapoyas Quechua
	iso639_qul, // North Bolivian Quechua
	iso639_qum, // Sipacapense
	iso639_qun, // Quinault
	iso639_qup, // Southern Pastaza Quechua
	iso639_quq, // Quinqui
	iso639_qur, // Yanahuanca Pasco Quechua
	iso639_qus, // Santiago del Estero Quichua
	iso639_quv, // Sacapulteco
	iso639_quw, // Tena Lowland Quichua
	iso639_qux, // Yauyos Quechua
	iso639_quy, // Ayacucho Quechua
	iso639_quz, // Cusco Quechua
	iso639_qva, // Ambo-Pasco Quechua
	iso639_qvc, // Cajamarca Quechua
	iso639_qve, // Eastern Apurímac Quechua
	iso639_qvh, // Huamalíes-Dos de Mayo Huánuco Quechua
	iso639_qvi, // Imbabura Highland Quichua
	iso639_qvj, // Loja Highland Quichua
	iso639_qvl, // Cajatambo North Lima Quechua
	iso639_qvm, // Margos-Yarowilca-Lauricocha Quechua
	iso639_qvn, // North Junín Quechua
	iso639_qvo, // Napo Lowland Quechua
	iso639_qvp, // Pacaraos Quechua
	iso639_qvs, // San Martín Quechua
	iso639_qvw, // Huaylla Wanca Quechua
	iso639_qvy, // Queyu
	iso639_qvz, // Northern Pastaza Quichua
	iso639_qwa, // Corongo Ancash Quechua
	iso639_qwc, // Classical Quechua
	iso639_qwh, // Huaylas Ancash Quechua
	iso639_qwm, // Kuman (Russia)
	iso639_qws, // Sihuas Ancash Quechua
	iso639_qwt, // Kwalhioqua-Tlatskanai
	iso639_qxa, // Chiquián Ancash Quechua
	iso639_qxc, // Chincha Quechua
	iso639_qxh, // Panao Huánuco Quechua
	iso639_qxl, // Salasaca Highland Quichua
	iso639_qxn, // Northern Conchucos Ancash Quechua
	iso639_qxo, // Southern Conchucos Ancash Quechua
	iso639_qxp, // Puno Quechua
	iso639_qxq, // Qashqa'i
	iso639_qxr, // Cañar Highland Quichua
	iso639_qxs, // Southern Qiang
	iso639_qxt, // Santa Ana de Tusi Pasco Quechua
	iso639_qxu, // Arequipa-La Unión Quechua
	iso639_qxw, // Jauja Wanca Quechua
	iso639_qya, // Quenya
	iso639_qyp, // Quiripi
	iso639_raa, // Dungmali
	iso639_rab, // Camling
	iso639_rac, // Rasawa
	iso639_rad, // Rade
	iso639_raf, // Western Meohang
	iso639_rag, // Logooli
	iso639_rah, // Rabha
	iso639_rai, // Ramoaaina
	iso639_raj, // Rajasthani
	iso639_rak, // Tulu-Bohuai
	iso639_ral, // Ralte
	iso639_ram, // Canela
	iso639_ran, // Riantana
	iso639_rao, // Rao
	iso639_rap, // Rapanui
	iso639_raq, // Saam
	iso639_rar, // Rarotongan
	iso639_ras, // Tegali
	iso639_rat, // Razajerdi
	iso639_rau, // Raute
	iso639_rav, // Sampang
	iso639_raw, // Rawang
	iso639_rax, // Rang
	iso639_ray, // Rapa
	iso639_raz, // Rahambuu
	iso639_rbb, // Rumai Palaung
	iso639_rbk, // Northern Bontok
	iso639_rbl, // Miraya Bikol
	iso639_rbp, // Barababaraba
	iso639_rcf, // Réunion Creole French
	iso639_rdb, // Rudbari
	iso639_rea, // Rerau
	iso639_reb, // Rembong
	iso639_ree, // Rejang Kayan
	iso639_reg, // Kara (Tanzania)
	iso639_rei, // Reli
	iso639_rej, // Rejang
	iso639_rel, // Rendille
	iso639_rem, // Remo
	iso639_ren, // Rengao
	iso639_rer, // Rer Bare
	iso639_res, // Reshe
	iso639_ret, // Retta
	iso639_rey, // Reyesano
	iso639_rga, // Roria
	iso639_rge, // Romano-Greek
	iso639_rgk, // Rangkas
	iso639_rgn, // Romagnol
	iso639_rgr, // Resígaro
	iso639_rgs, // Southern Roglai
	iso639_rgu, // Ringgou
	iso639_rhg, // Rohingya
	iso639_rhp, // Yahang
	iso639_ria, // Riang (India)
	iso639_rie, // Rien
	iso639_rif, // Tarifit
	iso639_ril, // Riang (Myanmar)
	iso639_rim, // Nyaturu
	iso639_rin, // Nungu
	iso639_rir, // Ribun
	iso639_rit, // Ritarungo
	iso639_riu, // Riung
	iso639_rjg, // Rajong
	iso639_rji, // Raji
	iso639_rjs, // Rajbanshi
	iso639_rka, // Kraol
	iso639_rkb, // Rikbaktsa
	iso639_rkh, // Rakahanga-Manihiki
	iso639_rki, // Rakhine
	iso639_rkm, // Marka
	iso639_rkt, // Rangpuri
	iso639_rma, // Rama
	iso639_rmb, // Rembarunga
	iso639_rmc, // Carpathian Romani
	iso639_rmd, // Traveller Danish
	iso639_rme, // Angloromani
	iso639_rmf, // Kalo Finnish Romani
	iso639_rmg, // Traveller Norwegian
	iso639_rmh, // Murkim
	iso639_rmi, // Lomavren
	iso639_rmk, // Romkun
	iso639_rml, // Baltic Romani
	iso639_rmm, // Roma
	iso639_rmn, // Balkan Romani
	iso639_rmo, // Sinte Romani
	iso639_rmp, // Rempi
	iso639_rmq, // Caló
	iso639_rms, // Romanian Sign Language
	iso639_rmt, // Domari
	iso639_rmu, // Tavringer Romani
	iso639_rmv, // Romanova
	iso639_rmw, // Welsh Romani
	iso639_rmx, // Romam
	iso639_rmy, // Vlax Romani
	iso639_rmz, // Marma
	iso639_rna, // Runa
	iso639_rnd, // Ruund
	iso639_rng, // Ronga
	iso639_rnl, // Ranglong
	iso639_rnn, // Roon
	iso639_rnp, // Rongpo
	iso639_rnr, // Nari Nari
	iso639_rnw, // Rungwa
	iso639_rob, // Tae'
	iso639_roc, // Cacgia Roglai
	iso639_rod, // Rogo
	iso639_roe, // Ronji
	iso639_rof, // Rombo
	iso639_rog, // Northern Roglai
	iso639_roh, // Romansh
	iso639_rol, // Romblomanon
	iso639_rom, // Romany
	iso639_ron, // Romanian
	iso639_roo, // Rotokas
	iso639_rop, // Kriol
	iso639_ror, // Rongga
	iso639_rou, // Runga
	iso639_row, // Dela-Oenale
	iso639_rpn, // Repanbitip
	iso639_rpt, // Rapting
	iso639_rri, // Ririo
	iso639_rro, // Waima
	iso639_rrt, // Arritinngithigh
	iso639_rsb, // Romano-Serbian
	iso639_rsi, // Rennellese Sign Language
	iso639_rsl, // Russian Sign Language
	iso639_rtc, // Rungtu Chin
	iso639_rth, // Ratahan
	iso639_rtm, // Rotuman
	iso639_rtw, // Rathawi
	iso639_rub, // Gungu
	iso639_ruc, // Ruuli
	iso639_rue, // Rusyn
	iso639_ruf, // Luguru
	iso639_rug, // Roviana
	iso639_ruh, // Ruga
	iso639_rui, // Rufiji
	iso639_ruk, // Che
	iso639_run, // Rundi
	iso639_ruo, // Istro Romanian
	iso639_rup, // Macedo-Romanian
	iso639_ruq, // Megleno Romanian
	iso639_rus, // Russian
	iso639_rut, // Rutul
	iso639_ruu, // Lanas Lobu
	iso639_ruy, // Mala (Nigeria)
	iso639_ruz, // Ruma
	iso639_rwa, // Rawo
	iso639_rwk, // Rwa
	iso639_rwm, // Amba (Uganda)
	iso639_rwo, // Rawa
	iso639_rwr, // Marwari (India)
	iso639_ryn, // Northern Amami-Oshima
	iso639_rys, // Yaeyama
	iso639_ryu, // Central Okinawan
	iso639_saa, // Saba
	iso639_sab, // Buglere
	iso639_sac, // Meskwaki
	iso639_sad, // Sandawe
	iso639_sae, // Sabanê
	iso639_saf, // Safaliba
	iso639_sag, // Sango
	iso639_sah, // Yakut
	iso639_saj, // Sahu
	iso639_sak, // Sake
	iso639_sam, // Samaritan Aramaic
	iso639_san, // Sanskrit
	iso639_sao, // Sause
	iso639_sap, // Sanapaná
	iso639_saq, // Samburu
	iso639_sar, // Saraveca
	iso639_sas, // Sasak
	iso639_sat, // Santali
	iso639_sau, // Saleman
	iso639_sav, // Saafi-Saafi
	iso639_saw, // Sawi
	iso639_sax, // Sa
	iso639_say, // Saya
	iso639_saz, // Saurashtra
	iso639_sba, // Ngambay
	iso639_sbb, // Simbo
	iso639_sbc, // Kele (Papua New Guinea)
	iso639_sbd, // Southern Samo
	iso639_sbe, // Saliba
	iso639_sbf, // Shabo
	iso639_sbg, // Seget
	iso639_sbh, // Sori-Harengan
	iso639_sbi, // Seti
	iso639_sbj, // Surbakhal
	iso639_sbk, // Safwa
	iso639_sbl, // Botolan Sambal
	iso639_sbm, // Sagala
	iso639_sbn, // Sindhi Bhil
	iso639_sbo, // Sabüm
	iso639_sbp, // Sangu (Tanzania)
	iso639_sbq, // Sileibi
	iso639_sbr, // Sembakung Murut
	iso639_sbs, // Subiya
	iso639_sbt, // Kimki
	iso639_sbu, // Stod Bhoti
	iso639_sbv, // Sabine
	iso639_sbw, // Simba
	iso639_sbx, // Seberuang
	iso639_sby, // Soli
	iso639_sbz, // Sara Kaba
	iso639_scb, // Chut
	iso639_sce, // Dongxiang
	iso639_scf, // San Miguel Creole French
	iso639_scg, // Sanggau
	iso639_sch, // Sakachep
	iso639_sci, // Sri Lankan Creole Malay
	iso639_sck, // Sadri
	iso639_scl, // Shina
	iso639_scn, // Sicilian
	iso639_sco, // Scots
	iso639_scp, // Helambu Sherpa
	iso639_scq, // Sa'och
	iso639_scs, // North Slavey
	iso639_scu, // Shumcho
	iso639_scv, // Sheni
	iso639_scw, // Sha
	iso639_scx, // Sicel
	iso639_sda, // Toraja-Sa'dan
	iso639_sdb, // Shabak
	iso639_sdc, // Sassarese Sardinian
	iso639_sde, // Surubu
	iso639_sdf, // Sarli
	iso639_sdg, // Savi
	iso639_sdh, // Southern Kurdish
	iso639_sdj, // Suundi
	iso639_sdk, // Sos Kundi
	iso639_sdl, // Saudi Arabian Sign Language
	iso639_sdm, // Semandang
	iso639_sdn, // Gallurese Sardinian
	iso639_sdo, // Bukar-Sadung Bidayuh
	iso639_sdp, // Sherdukpen
	iso639_sdr, // Oraon Sadri
	iso639_sds, // Sened
	iso639_sdt, // Shuadit
	iso639_sdu, // Sarudu
	iso639_sdx, // Sibu Melanau
	iso639_sdz, // Sallands
	iso639_sea, // Semai
	iso639_seb, // Shempire Senoufo
	iso639_sec, // Sechelt
	iso639_sed, // Sedang
	iso639_see, // Seneca
	iso639_sef, // Cebaara Senoufo
	iso639_seg, // Segeju
	iso639_seh, // Sena
	iso639_sei, // Seri
	iso639_sej, // Sene
	iso639_sek, // Sekani
	iso639_sel, // Selkup
	iso639_sen, // Nanerigé Sénoufo
	iso639_seo, // Suarmin
	iso639_sep, // Sìcìté Sénoufo
	iso639_seq, // Senara Sénoufo
	iso639_ser, // Serrano
	iso639_ses, // Koyraboro Senni Songhai
	iso639_set, // Sentani
	iso639_seu, // Serui-Laut
	iso639_sev, // Nyarafolo Senoufo
	iso639_sew, // Sewa Bay
	iso639_sey, // Secoya
	iso639_sez, // Senthang Chin
	iso639_sfb, // Langue des signes de Belgique Francophone
	iso639_sfe, // Eastern Subanen
	iso639_sfm, // Small Flowery Miao
	iso639_sfs, // South African Sign Language
	iso639_sfw, // Sehwi
	iso639_sga, // Old Irish
	iso639_sgb, // Mag-antsi Ayta
	iso639_sgc, // Kipsigis
	iso639_sgd, // Surigaonon
	iso639_sge, // Segai
	iso639_sgg, // Swiss-German Sign Language
	iso639_sgh, // Shughni
	iso639_sgi, // Suga
	iso639_sgj, // Surgujia
	iso639_sgk, // Sangkong
	iso639_sgm, // Singa
	iso639_sgo, // Songa
	iso639_sgp, // Singpho
	iso639_sgr, // Sangisari
	iso639_sgs, // Samogitian
	iso639_sgt, // Brokpake
	iso639_sgu, // Salas
	iso639_sgw, // Sebat Bet Gurage
	iso639_sgx, // Sierra Leone Sign Language
	iso639_sgy, // Sanglechi
	iso639_sgz, // Sursurunga
	iso639_sha, // Shall-Zwall
	iso639_shb, // Ninam
	iso639_shc, // Sonde
	iso639_shd, // Kundal Shahi
	iso639_she, // Sheko
	iso639_shg, // Shua
	iso639_shh, // Shoshoni
	iso639_shi, // Tachelhit
	iso639_shj, // Shatt
	iso639_shk, // Shilluk
	iso639_shl, // Shendu
	iso639_shm, // Shahrudi
	iso639_shn, // Shan
	iso639_sho, // Shanga
	iso639_shp, // Shipibo-Conibo
	iso639_shq, // Sala
	iso639_shr, // Shi
	iso639_shs, // Shuswap
	iso639_sht, // Shasta
	iso639_shu, // Chadian Arabic
	iso639_shv, // Shehri
	iso639_shw, // Shwai
	iso639_shx, // She
	iso639_shy, // Tachawit
	iso639_shz, // Syenara Senoufo
	iso639_sia, // Akkala Sami
	iso639_sib, // Sebop
	iso639_sid, // Sidamo
	iso639_sie, // Simaa
	iso639_sif, // Siamou
	iso639_sig, // Paasaal
	iso639_sih, // Zire
	iso639_sii, // Shom Peng
	iso639_sij, // Numbami
	iso639_sik, // Sikiana
	iso639_sil, // Tumulung Sisaala
	iso639_sim, // Mende (Papua New Guinea)
	iso639_sin, // Sinhala
	iso639_sip, // Sikkimese
	iso639_siq, // Sonia
	iso639_sir, // Siri
	iso639_sis, // Siuslaw
	iso639_siu, // Sinagen
	iso639_siv, // Sumariup
	iso639_siw, // Siwai
	iso639_six, // Sumau
	iso639_siy, // Sivandi
	iso639_siz, // Siwi
	iso639_sja, // Epena
	iso639_sjb, // Sajau Basap
	iso639_sjd, // Kildin Sami
	iso639_sje, // Pite Sami
	iso639_sjg, // Assangori
	iso639_sjk, // Kemi Sami
	iso639_sjl, // Sajalong
	iso639_sjm, // Mapun
	iso639_sjn, // Sindarin
	iso639_sjo, // Xibe
	iso639_sjp, // Surjapuri
	iso639_sjr, // Siar-Lak
	iso639_sjs, // Senhaja De Srair
	iso639_sjt, // Ter Sami
	iso639_sju, // Ume Sami
	iso639_sjw, // Shawnee
	iso639_ska, // Skagit
	iso639_skb, // Saek
	iso639_skc, // Ma Manda
	iso639_skd, // Southern Sierra Miwok
	iso639_ske, // Seke (Vanuatu)
	iso639_skf, // Sakirabiá
	iso639_skg, // Sakalava Malagasy
	iso639_skh, // Sikule
	iso639_ski, // Sika
	iso639_skj, // Seke (Nepal)
	iso639_skk, // Sok
	iso639_skm, // Kutong
	iso639_skn, // Kolibugan Subanon
	iso639_sko, // Seko Tengah
	iso639_skp, // Sekapan
	iso639_skq, // Sininkere
	iso639_skr, // Seraiki
	iso639_sks, // Maia
	iso639_skt, // Sakata
	iso639_sku, // Sakao
	iso639_skv, // Skou
	iso639_skw, // Skepi Creole Dutch
	iso639_skx, // Seko Padang
	iso639_sky, // Sikaiana
	iso639_skz, // Sekar
	iso639_slc, // Sáliba
	iso639_sld, // Sissala
	iso639_sle, // Sholaga
	iso639_slf, // Swiss-Italian Sign Language
	iso639_slg, // Selungai Murut
	iso639_slh, // Southern Puget Sound Salish
	iso639_sli, // Lower Silesian
	iso639_slj, // Salumá
	iso639_slk, // Slovak
	iso639_sll, // Salt-Yui
	iso639_slm, // Pangutaran Sama
	iso639_sln, // Salinan
	iso639_slp, // Lamaholot
	iso639_slq, // Salchuq
	iso639_slr, // Salar
	iso639_sls, // Singapore Sign Language
	iso639_slt, // Sila
	iso639_slu, // Selaru
	iso639_slv, // Slovenian
	iso639_slw, // Sialum
	iso639_slx, // Salampasu
	iso639_sly, // Selayar
	iso639_slz, // Ma'ya
	iso639_sma, // Southern Sami
	iso639_smb, // Simbari
	iso639_smc, // Som
	iso639_smd, // Sama
	iso639_sme, // Northern Sami
	iso639_smf, // Auwe
	iso639_smg, // Simbali
	iso639_smh, // Samei
	iso639_smj, // Lule Sami
	iso639_smk, // Bolinao
	iso639_sml, // Central Sama
	iso639_smm, // Musasa
	iso639_smn, // Inari Sami
	iso639_smo, // Samoan
	iso639_smp, // Samaritan
	iso639_smq, // Samo
	iso639_smr, // Simeulue
	iso639_sms, // Skolt Sami
	iso639_smt, // Simte
	iso639_smu, // Somray
	iso639_smv, // Samvedi
	iso639_smw, // Sumbawa
	iso639_smx, // Samba
	iso639_smy, // Semnani
	iso639_smz, // Simeku
	iso639_sna, // Shona
	iso639_snb, // Sebuyau
	iso639_snc, // Sinaugoro
	iso639_snd, // Sindhi
	iso639_sne, // Bau Bidayuh
	iso639_snf, // Noon
	iso639_sng, // Sanga (Democratic Republic of Congo)
	iso639_snh, // Shinabo
	iso639_sni, // Sensi
	iso639_snj, // Riverain Sango
	iso639_snk, // Soninke
	iso639_snl, // Sangil
	iso639_snm, // Southern Ma'di
	iso639_snn, // Siona
	iso639_sno, // Snohomish
	iso639_snp, // Siane
	iso639_snq, // Sangu (Gabon)
	iso639_snr, // Sihan
	iso639_sns, // South West Bay
	iso639_snu, // Senggi
	iso639_snv, // Sa'ban
	iso639_snw, // Selee
	iso639_snx, // Sam
	iso639_sny, // Saniyo-Hiyewe
	iso639_snz, // Sinsauru
	iso639_soa, // Thai Song
	iso639_sob, // Sobei
	iso639_soc, // So (Democratic Republic of Congo)
	iso639_sod, // Songoora
	iso639_soe, // Songomeno
	iso639_sog, // Sogdian
	iso639_soh, // Aka
	iso639_soi, // Sonha
	iso639_soj, // Soi
	iso639_sok, // Sokoro
	iso639_sol, // Solos
	iso639_som, // Somali
	iso639_soo, // Songo
	iso639_sop, // Songe
	iso639_soq, // Kanasi
	iso639_sor, // Somrai
	iso639_sos, // Seeku
	iso639_sot, // Southern Sotho
	iso639_sou, // Southern Thai
	iso639_sov, // Sonsorol
	iso639_sow, // Sowanda
	iso639_sox, // Swo
	iso639_soy, // Miyobe
	iso639_soz, // Temi
	iso639_spa, // Spanish
	iso639_spb, // Sepa (Indonesia)
	iso639_spc, // Sapé
	iso639_spd, // Saep
	iso639_spe, // Sepa (Papua New Guinea)
	iso639_spg, // Sian
	iso639_spi, // Saponi
	iso639_spk, // Sengo
	iso639_spl, // Selepet
	iso639_spm, // Akukem
	iso639_spo, // Spokane
	iso639_spp, // Supyire Senoufo
	iso639_spq, // Loreto-Ucayali Spanish
	iso639_spr, // Saparua
	iso639_sps, // Saposa
	iso639_spt, // Spiti Bhoti
	iso639_spu, // Sapuan
	iso639_spv, // Sambalpuri
	iso639_spx, // South Picene
	iso639_spy, // Sabaot
	iso639_sqa, // Shama-Sambuga
	iso639_sqh, // Shau
	iso639_sqi, // Albanian
	iso639_sqk, // Albanian Sign Language
	iso639_sqm, // Suma
	iso639_sqn, // Susquehannock
	iso639_sqo, // Sorkhei
	iso639_sqq, // Sou
	iso639_sqr, // Siculo Arabic
	iso639_sqs, // Sri Lankan Sign Language
	iso639_sqt, // Soqotri
	iso639_squ, // Squamish
	iso639_sra, // Saruga
	iso639_srb, // Sora
	iso639_src, // Logudorese Sardinian
	iso639_srd, // Sardinian
	iso639_sre, // Sara
	iso639_srf, // Nafi
	iso639_srg, // Sulod
	iso639_srh, // Sarikoli
	iso639_sri, // Siriano
	iso639_srk, // Serudung Murut
	iso639_srl, // Isirawa
	iso639_srm, // Saramaccan
	iso639_srn, // Sranan Tongo
	iso639_sro, // Campidanese Sardinian
	iso639_srp, // Serbian
	iso639_srq, // Sirionó
	iso639_srr, // Serer
	iso639_srs, // Sarsi
	iso639_srt, // Sauri
	iso639_sru, // Suruí
	iso639_srv, // Southern Sorsoganon
	iso639_srw, // Serua
	iso639_srx, // Sirmauri
	iso639_sry, // Sera
	iso639_srz, // Shahmirzadi
	iso639_ssb, // Southern Sama
	iso639_ssc, // Suba-Simbiti
	iso639_ssd, // Siroi
	iso639_sse, // Balangingi
	iso639_ssf, // Thao
	iso639_ssg, // Seimat
	iso639_ssh, // Shihhi Arabic
	iso639_ssi, // Sansi
	iso639_ssj, // Sausi
	iso639_ssk, // Sunam
	iso639_ssl, // Western Sisaala
	iso639_ssm, // Semnam
	iso639_ssn, // Waata
	iso639_sso, // Sissano
	iso639_ssp, // Spanish Sign Language
	iso639_ssq, // So'a
	iso639_ssr, // Swiss-French Sign Language
	iso639_sss, // Sô
	iso639_sst, // Sinasina
	iso639_ssu, // Susuami
	iso639_ssv, // Shark Bay
	iso639_ssw, // Swati
	iso639_ssx, // Samberigi
	iso639_ssy, // Saho
	iso639_ssz, // Sengseng
	iso639_sta, // Settla
	iso639_stb, // Northern Subanen
	iso639_std, // Sentinel
	iso639_ste, // Liana-Seti
	iso639_stf, // Seta
	iso639_stg, // Trieng
	iso639_sth, // Shelta
	iso639_sti, // Bulo Stieng
	iso639_stj, // Matya Samo
	iso639_stk, // Arammba
	iso639_stl, // Stellingwerfs
	iso639_stm, // Setaman
	iso639_stn, // Owa
	iso639_sto, // Stoney
	iso639_stp, // Southeastern Tepehuan
	iso639_stq, // Saterfriesisch
	iso639_str, // Straits Salish
	iso639_sts, // Shumashti
	iso639_stt, // Budeh Stieng
	iso639_stu, // Samtao
	iso639_stv, // Silt'e
	iso639_stw, // Satawalese
	iso639_sua, // Sulka
	iso639_sub, // Suku
	iso639_suc, // Western Subanon
	iso639_sue, // Suena
	iso639_sug, // Suganga
	iso639_sui, // Suki
	iso639_suj, // Shubi
	iso639_suk, // Sukuma
	iso639_sun, // Sundanese
	iso639_suq, // Suri
	iso639_sur, // Mwaghavul
	iso639_sus, // Susu
	iso639_sut, // Subtiaba
	iso639_suv, // Puroik
	iso639_suw, // Sumbwa
	iso639_sux, // Sumerian
	iso639_suy, // Suyá
	iso639_suz, // Sunwar
	iso639_sva, // Svan
	iso639_svb, // Ulau-Suain
	iso639_svc, // Vincentian Creole English
	iso639_sve, // Serili
	iso639_svk, // Slovakian Sign Language
	iso639_svr, // Savara
	iso639_svs, // Savosavo
	iso639_svx, // Skalvian
	iso639_swa, // Swahili
	iso639_swb, // Maore Comorian
	iso639_swc, // Congo Swahili
	iso639_swe, // Swedish
	iso639_swf, // Sere
	iso639_swg, // Swabian
	iso639_swh, // Swahili (individual language)
	iso639_swi, // Sui
	iso639_swj, // Sira
	iso639_swk, // Malawi Sena
	iso639_swl, // Swedish Sign Language
	iso639_swm, // Samosa
	iso639_swn, // Sawknah
	iso639_swo, // Shanenawa
	iso639_swp, // Suau
	iso639_swq, // Sharwa
	iso639_swr, // Saweru
	iso639_sws, // Seluwasan
	iso639_swt, // Sawila
	iso639_swu, // Suwawa
	iso639_swv, // Shekhawati
	iso639_sww, // Sowa
	iso639_swx, // Suruahá
	iso639_swy, // Sarua
	iso639_sxb, // Suba
	iso639_sxc, // Sicanian
	iso639_sxe, // Sighu
	iso639_sxg, // Shixing
	iso639_sxk, // Southern Kalapuya
	iso639_sxl, // Selian
	iso639_sxm, // Samre
	iso639_sxn, // Sangir
	iso639_sxo, // Sorothaptic
	iso639_sxr, // Saaroa
	iso639_sxs, // Sasaru
	iso639_sxu, // Upper Saxon
	iso639_sxw, // Saxwe Gbe
	iso639_sya, // Siang
	iso639_syb, // Central Subanen
	iso639_syc, // Classical Syriac
	iso639_syi, // Seki
	iso639_syk, // Sukur
	iso639_syl, // Sylheti
	iso639_sym, // Maya Samo
	iso639_syn, // Senaya
	iso639_syo, // Suoy
	iso639_syr, // Syriac
	iso639_sys, // Sinyar
	iso639_syw, // Kagate
	iso639_syy, // Al-Sayyid Bedouin Sign Language
	iso639_sza, // Semelai
	iso639_szb, // Ngalum
	iso639_szc, // Semaq Beri
	iso639_szd, // Seru
	iso639_sze, // Seze
	iso639_szg, // Sengele
	iso639_szl, // Silesian
	iso639_szn, // Sula
	iso639_szp, // Suabo
	iso639_szv, // Isu (Fako Division)
	iso639_szw, // Sawai
	iso639_taa, // Lower Tanana
	iso639_tab, // Tabassaran
	iso639_tac, // Lowland Tarahumara
	iso639_tad, // Tause
	iso639_tae, // Tariana
	iso639_taf, // Tapirapé
	iso639_tag, // Tagoi
	iso639_tah, // Tahitian
	iso639_taj, // Eastern Tamang
	iso639_tak, // Tala
	iso639_tal, // Tal
	iso639_tam, // Tamil
	iso639_tan, // Tangale
	iso639_tao, // Yami
	iso639_tap, // Taabwa
	iso639_taq, // Tamasheq
	iso639_tar, // Central Tarahumara
	iso639_tas, // Tay Boi
	iso639_tat, // Tatar
	iso639_tau, // Upper Tanana
	iso639_tav, // Tatuyo
	iso639_taw, // Tai
	iso639_tax, // Tamki
	iso639_tay, // Atayal
	iso639_taz, // Tocho
	iso639_tba, // Aikanã
	iso639_tbb, // Tapeba
	iso639_tbc, // Takia
	iso639_tbd, // Kaki Ae
	iso639_tbe, // Tanimbili
	iso639_tbf, // Mandara
	iso639_tbg, // North Tairora
	iso639_tbh, // Thurawal
	iso639_tbi, // Gaam
	iso639_tbj, // Tiang
	iso639_tbk, // Calamian Tagbanwa
	iso639_tbl, // Tboli
	iso639_tbm, // Tagbu
	iso639_tbn, // Barro Negro Tunebo
	iso639_tbo, // Tawala
	iso639_tbp, // Taworta
	iso639_tbr, // Tumtum
	iso639_tbs, // Tanguat
	iso639_tbt, // Tembo (Kitembo)
	iso639_tbu, // Tubar
	iso639_tbv, // Tobo
	iso639_tbw, // Tagbanwa
	iso639_tbx, // Kapin
	iso639_tby, // Tabaru
	iso639_tbz, // Ditammari
	iso639_tca, // Ticuna
	iso639_tcb, // Tanacross
	iso639_tcc, // Datooga
	iso639_tcd, // Tafi
	iso639_tce, // Southern Tutchone
	iso639_tcf, // Malinaltepec Me'phaa
	iso639_tcg, // Tamagario
	iso639_tch, // Turks And Caicos Creole English
	iso639_tci, // Wára
	iso639_tck, // Tchitchege
	iso639_tcl, // Taman (Myanmar)
	iso639_tcm, // Tanahmerah
	iso639_tcn, // Tichurong
	iso639_tco, // Taungyo
	iso639_tcp, // Tawr Chin
	iso639_tcq, // Kaiy
	iso639_tcs, // Torres Strait Creole
	iso639_tct, // T'en
	iso639_tcu, // Southeastern Tarahumara
	iso639_tcw, // Tecpatlán Totonac
	iso639_tcx, // Toda
	iso639_tcy, // Tulu
	iso639_tcz, // Thado Chin
	iso639_tda, // Tagdal
	iso639_tdb, // Panchpargania
	iso639_tdc, // Emberá-Tadó
	iso639_tdd, // Tai Nüa
	iso639_tde, // Tiranige Diga Dogon
	iso639_tdf, // Talieng
	iso639_tdg, // Western Tamang
	iso639_tdh, // Thulung
	iso639_tdi, // Tomadino
	iso639_tdj, // Tajio
	iso639_tdk, // Tambas
	iso639_tdl, // Sur
	iso639_tdn, // Tondano
	iso639_tdo, // Teme
	iso639_tdq, // Tita
	iso639_tdr, // Todrah
	iso639_tds, // Doutai
	iso639_tdt, // Tetun Dili
	iso639_tdu, // Tempasuk Dusun
	iso639_tdv, // Toro
	iso639_tdx, // Tandroy-Mahafaly Malagasy
	iso639_tdy, // Tadyawan
	iso639_tea, // Temiar
	iso639_teb, // Tetete
	iso639_tec, // Terik
	iso639_ted, // Tepo Krumen
	iso639_tee, // Huehuetla Tepehua
	iso639_tef, // Teressa
	iso639_teg, // Teke-Tege
	iso639_teh, // Tehuelche
	iso639_tei, // Torricelli
	iso639_tek, // Ibali Teke
	iso639_tel, // Telugu
	iso639_tem, // Timne
	iso639_ten, // Tama (Colombia)
	iso639_teo, // Teso
	iso639_tep, // Tepecano
	iso639_teq, // Temein
	iso639_ter, // Tereno
	iso639_tes, // Tengger
	iso639_tet, // Tetum
	iso639_teu, // Soo
	iso639_tev, // Teor
	iso639_tew, // Tewa (USA)
	iso639_tex, // Tennet
	iso639_tey, // Tulishi
	iso639_tfi, // Tofin Gbe
	iso639_tfn, // Tanaina
	iso639_tfo, // Tefaro
	iso639_tfr, // Teribe
	iso639_tft, // Ternate
	iso639_tga, // Sagalla
	iso639_tgb, // Tobilung
	iso639_tgc, // Tigak
	iso639_tgd, // Ciwogai
	iso639_tge, // Eastern Gorkha Tamang
	iso639_tgf, // Chalikha
	iso639_tgg, // Tangga
	iso639_tgh, // Tobagonian Creole English
	iso639_tgi, // Lawunuia
	iso639_tgj, // Tagin
	iso639_tgk, // Tajik
	iso639_tgl, // Tagalog
	iso639_tgn, // Tandaganon
	iso639_tgo, // Sudest
	iso639_tgp, // Tangoa
	iso639_tgq, // Tring
	iso639_tgr, // Tareng
	iso639_tgs, // Nume
	iso639_tgt, // Central Tagbanwa
	iso639_tgu, // Tanggu
	iso639_tgv, // Tingui-Boto
	iso639_tgw, // Tagwana Senoufo
	iso639_tgx, // Tagish
	iso639_tgy, // Togoyo
	iso639_tgz, // Tagalaka
	iso639_tha, // Thai
	iso639_thc, // Tai Hang Tong
	iso639_thd, // Thayore
	iso639_the, // Chitwania Tharu
	iso639_thf, // Thangmi
	iso639_thh, // Northern Tarahumara
	iso639_thi, // Tai Long
	iso639_thk, // Tharaka
	iso639_thl, // Dangaura Tharu
	iso639_thm, // Aheu
	iso639_thn, // Thachanadan
	iso639_thp, // Thompson
	iso639_thq, // Kochila Tharu
	iso639_thr, // Rana Tharu
	iso639_ths, // Thakali
	iso639_tht, // Tahltan
	iso639_thu, // Thuri
	iso639_thv, // Tahaggart Tamahaq
	iso639_thw, // Thudam
	iso639_thx, // The
	iso639_thy, // Tha
	iso639_thz, // Tayart Tamajeq
	iso639_tia, // Tidikelt Tamazight
	iso639_tic, // Tira
	iso639_tid, // Tidong
	iso639_tif, // Tifal
	iso639_tig, // Tigre
	iso639_tih, // Timugon Murut
	iso639_tii, // Tiene
	iso639_tij, // Tilung
	iso639_tik, // Tikar
	iso639_til, // Tillamook
	iso639_tim, // Timbe
	iso639_tin, // Tindi
	iso639_tio, // Teop
	iso639_tip, // Trimuris
	iso639_tiq, // Tiéfo
	iso639_tir, // Tigrinya
	iso639_tis, // Masadiit Itneg
	iso639_tit, // Tinigua
	iso639_tiu, // Adasen
	iso639_tiv, // Tiv
	iso639_tiw, // Tiwi
	iso639_tix, // Southern Tiwa
	iso639_tiy, // Tiruray
	iso639_tiz, // Tai Hongjin
	iso639_tja, // Tajuasohn
	iso639_tjg, // Tunjung
	iso639_tji, // Northern Tujia
	iso639_tjl, // Tai Laing
	iso639_tjm, // Timucua
	iso639_tjn, // Tonjon
	iso639_tjo, // Temacine Tamazight
	iso639_tjs, // Southern Tujia
	iso639_tju, // Tjurruru
	iso639_tka, // Truká
	iso639_tkb, // Buksa
	iso639_tkd, // Tukudede
	iso639_tke, // Takwane
	iso639_tkf, // Tukumanféd
	iso639_tkg, // Tesaka Malagasy
	iso639_tkl, // Tokelau
	iso639_tkm, // Takelma
	iso639_tkn, // Toku-No-Shima
	iso639_tkp, // Tikopia
	iso639_tkq, // Tee
	iso639_tkr, // Tsakhur
	iso639_tks, // Takestani
	iso639_tkt, // Kathoriya Tharu
	iso639_tku, // Upper Necaxa Totonac
	iso639_tkw, // Teanu
	iso639_tkx, // Tangko
	iso639_tkz, // Takua
	iso639_tla, // Southwestern Tepehuan
	iso639_tlb, // Tobelo
	iso639_tlc, // Yecuatla Totonac
	iso639_tld, // Talaud
	iso639_tlf, // Telefol
	iso639_tlg, // Tofanma
	iso639_tlh, // Klingon
	iso639_tli, // Tlingit
	iso639_tlj, // Talinga-Bwisi
	iso639_tlk, // Taloki
	iso639_tll, // Tetela
	iso639_tlm, // Tolomako
	iso639_tln, // Talondo'
	iso639_tlo, // Talodi
	iso639_tlp, // Filomena Mata-Coahuitlán Totonac
	iso639_tlq, // Tai Loi
	iso639_tlr, // Talise
	iso639_tls, // Tambotalo
	iso639_tlt, // Teluti
	iso639_tlu, // Tulehu
	iso639_tlv, // Taliabu
	iso639_tlx, // Khehek
	iso639_tly, // Talysh
	iso639_tma, // Tama (Chad)
	iso639_tmb, // Katbol
	iso639_tmc, // Tumak
	iso639_tmd, // Haruai
	iso639_tme, // Tremembé
	iso639_tmf, // Toba-Maskoy
	iso639_tmg, // Ternateño
	iso639_tmh, // Tamashek
	iso639_tmi, // Tutuba
	iso639_tmj, // Samarokena
	iso639_tmk, // Northwestern Tamang
	iso639_tml, // Tamnim Citak
	iso639_tmm, // Tai Thanh
	iso639_tmn, // Taman (Indonesia)
	iso639_tmo, // Temoq
	iso639_tmp, // Tai Mène
	iso639_tmq, // Tumleo
	iso639_tmr, // Jewish Babylonian Aramaic (ca. 200-1200 CE)
	iso639_tms, // Tima
	iso639_tmt, // Tasmate
	iso639_tmu, // Iau
	iso639_tmv, // Tembo (Motembo)
	iso639_tmw, // Temuan
	iso639_tmy, // Tami
	iso639_tmz, // Tamanaku
	iso639_tna, // Tacana
	iso639_tnb, // Western Tunebo
	iso639_tnc, // Tanimuca-Retuarã
	iso639_tnd, // Angosturas Tunebo
	iso639_tne, // Tinoc Kallahan
	iso639_tng, // Tobanga
	iso639_tnh, // Maiani
	iso639_tni, // Tandia
	iso639_tnk, // Kwamera
	iso639_tnl, // Lenakel
	iso639_tnm, // Tabla
	iso639_tnn, // North Tanna
	iso639_tno, // Toromono
	iso639_tnp, // Whitesands
	iso639_tnq, // Taino
	iso639_tnr, // Bedik
	iso639_tns, // Tenis
	iso639_tnt, // Tontemboan
	iso639_tnu, // Tay Khang
	iso639_tnv, // Tangchangya
	iso639_tnw, // Tonsawang
	iso639_tnx, // Tanema
	iso639_tny, // Tongwe
	iso639_tnz, // Tonga (Thailand)
	iso639_tob, // Toba
	iso639_toc, // Coyutla Totonac
	iso639_tod, // Toma
	iso639_toe, // Tomedes
	iso639_tof, // Gizrra
	iso639_tog, // Tonga (Nyasa)
	iso639_toh, // Gitonga
	iso639_toi, // Tonga (Zambia)
	iso639_toj, // Tojolabal
	iso639_tol, // Tolowa
	iso639_tom, // Tombulu
	iso639_ton, // Tonga (Tonga Islands)
	iso639_too, // Xicotepec De Juárez Totonac
	iso639_top, // Papantla Totonac
	iso639_toq, // Toposa
	iso639_tor, // Togbo-Vara Banda
	iso639_tos, // Highland Totonac
	iso639_tou, // Tho
	iso639_tov, // Upper Taromi
	iso639_tow, // Jemez
	iso639_tox, // Tobian
	iso639_toy, // Topoiyo
	iso639_toz, // To
	iso639_tpa, // Taupota
	iso639_tpc, // Azoyú Me'phaa
	iso639_tpe, // Tippera
	iso639_tpf, // Tarpia
	iso639_tpg, // Kula
	iso639_tpi, // Tok Pisin
	iso639_tpj, // Tapieté
	iso639_tpk, // Tupinikin
	iso639_tpl, // Tlacoapa Me'phaa
	iso639_tpm, // Tampulma
	iso639_tpn, // Tupinambá
	iso639_tpo, // Tai Pao
	iso639_tpp, // Pisaflores Tepehua
	iso639_tpq, // Tukpa
	iso639_tpr, // Tuparí
	iso639_tpt, // Tlachichilco Tepehua
	iso639_tpu, // Tampuan
	iso639_tpv, // Tanapag
	iso639_tpw, // Tupí
	iso639_tpx, // Acatepec Me'phaa
	iso639_tpy, // Trumai
	iso639_tpz, // Tinputz
	iso639_tqb, // Tembé
	iso639_tql, // Lehali
	iso639_tqm, // Turumsa
	iso639_tqn, // Tenino
	iso639_tqo, // Toaripi
	iso639_tqp, // Tomoip
	iso639_tqq, // Tunni
	iso639_tqr, // Torona
	iso639_tqt, // Western Totonac
	iso639_tqu, // Touo
	iso639_tqw, // Tonkawa
	iso639_tra, // Tirahi
	iso639_trb, // Terebu
	iso639_trc, // Copala Triqui
	iso639_trd, // Turi
	iso639_tre, // East Tarangan
	iso639_trf, // Trinidadian Creole English
	iso639_trg, // Lishán Didán
	iso639_trh, // Turaka
	iso639_tri, // Trió
	iso639_trj, // Toram
	iso639_trl, // Traveller Scottish
	iso639_trm, // Tregami
	iso639_trn, // Trinitario
	iso639_tro, // Tarao Naga
	iso639_trp, // Kok Borok
	iso639_trq, // San Martín Itunyoso Triqui
	iso639_trr, // Taushiro
	iso639_trs, // Chicahuaxtla Triqui
	iso639_trt, // Tunggare
	iso639_tru, // Turoyo
	iso639_trv, // Taroko
	iso639_trw, // Torwali
	iso639_trx, // Tringgus-Sembaan Bidayuh
	iso639_try, // Turung
	iso639_trz, // Torá
	iso639_tsa, // Tsaangi
	iso639_tsb, // Tsamai
	iso639_tsc, // Tswa
	iso639_tsd, // Tsakonian
	iso639_tse, // Tunisian Sign Language
	iso639_tsf, // Southwestern Tamang
	iso639_tsg, // Tausug
	iso639_tsh, // Tsuvan
	iso639_tsi, // Tsimshian
	iso639_tsj, // Tshangla
	iso639_tsk, // Tseku
	iso639_tsl, // Ts'ün-Lao
	iso639_tsm, // Turkish Sign Language
	iso639_tsn, // Tswana
	iso639_tso, // Tsonga
	iso639_tsp, // Northern Toussian
	iso639_tsq, // Thai Sign Language
	iso639_tsr, // Akei
	iso639_tss, // Taiwan Sign Language
	iso639_tst, // Tondi Songway Kiini
	iso639_tsu, // Tsou
	iso639_tsv, // Tsogo
	iso639_tsw, // Tsishingini
	iso639_tsx, // Mubami
	iso639_tsy, // Tebul Sign Language
	iso639_tsz, // Purepecha
	iso639_tta, // Tutelo
	iso639_ttb, // Gaa
	iso639_ttc, // Tektiteko
	iso639_ttd, // Tauade
	iso639_tte, // Bwanabwana
	iso639_ttf, // Tuotomb
	iso639_ttg, // Tutong
	iso639_tth, // Upper Ta'oih
	iso639_tti, // Tobati
	iso639_ttj, // Tooro
	iso639_ttk, // Totoro
	iso639_ttl, // Totela
	iso639_ttm, // Northern Tutchone
	iso639_ttn, // Towei
	iso639_tto, // Lower Ta'oih
	iso639_ttp, // Tombelala
	iso639_ttq, // Tawallammat Tamajaq
	iso639_ttr, // Tera
	iso639_tts, // Northeastern Thai
	iso639_ttt, // Muslim Tat
	iso639_ttu, // Torau
	iso639_ttv, // Titan
	iso639_ttw, // Long Wat
	iso639_tty, // Sikaritai
	iso639_ttz, // Tsum
	iso639_tua, // Wiarumus
	iso639_tub, // Tübatulabal
	iso639_tuc, // Mutu
	iso639_tud, // Tuxá
	iso639_tue, // Tuyuca
	iso639_tuf, // Central Tunebo
	iso639_tug, // Tunia
	iso639_tuh, // Taulil
	iso639_tui, // Tupuri
	iso639_tuj, // Tugutil
	iso639_tuk, // Turkmen
	iso639_tul, // Tula
	iso639_tum, // Tumbuka
	iso639_tun, // Tunica
	iso639_tuo, // Tucano
	iso639_tuq, // Tedaga
	iso639_tur, // Turkish
	iso639_tus, // Tuscarora
	iso639_tuu, // Tututni
	iso639_tuv, // Turkana
	iso639_tux, // Tuxináwa
	iso639_tuy, // Tugen
	iso639_tuz, // Turka
	iso639_tva, // Vaghua
	iso639_tvd, // Tsuvadi
	iso639_tve, // Te'un
	iso639_tvk, // Southeast Ambrym
	iso639_tvl, // Tuvalu
	iso639_tvm, // Tela-Masbuar
	iso639_tvn, // Tavoyan
	iso639_tvo, // Tidore
	iso639_tvs, // Taveta
	iso639_tvt, // Tutsa Naga
	iso639_tvu, // Tunen
	iso639_tvw, // Sedoa
	iso639_tvy, // Timor Pidgin
	iso639_twa, // Twana
	iso639_twb, // Western Tawbuid
	iso639_twc, // Teshenawa
	iso639_twd, // Twents
	iso639_twe, // Tewa (Indonesia)
	iso639_twf, // Northern Tiwa
	iso639_twg, // Tereweng
	iso639_twh, // Tai Dón
	iso639_twi, // Twi
	iso639_twl, // Tawara
	iso639_twm, // Tawang Monpa
	iso639_twn, // Twendi
	iso639_two, // Tswapong
	iso639_twp, // Ere
	iso639_twq, // Tasawaq
	iso639_twr, // Southwestern Tarahumara
	iso639_twt, // Turiwára
	iso639_twu, // Termanu
	iso639_tww, // Tuwari
	iso639_twx, // Tewe
	iso639_twy, // Tawoyan
	iso639_txa, // Tombonuo
	iso639_txb, // Tokharian B
	iso639_txc, // Tsetsaut
	iso639_txe, // Totoli
	iso639_txg, // Tangut
	iso639_txh, // Thracian
	iso639_txi, // Ikpeng
	iso639_txm, // Tomini
	iso639_txn, // West Tarangan
	iso639_txo, // Toto
	iso639_txq, // Tii
	iso639_txr, // Tartessian
	iso639_txs, // Tonsea
	iso639_txt, // Citak
	iso639_txu, // Kayapó
	iso639_txx, // Tatana
	iso639_txy, // Tanosy Malagasy
	iso639_tya, // Tauya
	iso639_tye, // Kyenga
	iso639_tyh, // O'du
	iso639_tyi, // Teke-Tsaayi
	iso639_tyj, // Tai Do
	iso639_tyl, // Thu Lao
	iso639_tyn, // Kombai
	iso639_typ, // Thaypan
	iso639_tyr, // Tai Daeng
	iso639_tys, // Tày Sa Pa
	iso639_tyt, // Tày Tac
	iso639_tyu, // Kua
	iso639_tyv, // Tuvinian
	iso639_tyx, // Teke-Tyee
	iso639_tyz, // Tày
	iso639_tza, // Tanzanian Sign Language
	iso639_tzh, // Tzeltal
	iso639_tzj, // Tz'utujil
	iso639_tzm, // Central Atlas Tamazight
	iso639_tzn, // Tugun
	iso639_tzo, // Tzotzil
	iso639_tzx, // Tabriak
	iso639_uam, // Uamué
	iso639_uan, // Kuan
	iso639_uar, // Tairuma
	iso639_uba, // Ubang
	iso639_ubi, // Ubi
	iso639_ubl, // Buhi'non Bikol
	iso639_ubr, // Ubir
	iso639_ubu, // Umbu-Ungu
	iso639_uby, // Ubykh
	iso639_uda, // Uda
	iso639_ude, // Udihe
	iso639_udg, // Muduga
	iso639_udi, // Udi
	iso639_udj, // Ujir
	iso639_udl, // Wuzlam
	iso639_udm, // Udmurt
	iso639_udu, // Uduk
	iso639_ues, // Kioko
	iso639_ufi, // Ufim
	iso639_uga, // Ugaritic
	iso639_ugb, // Kuku-Ugbanh
	iso639_uge, // Ughele
	iso639_ugn, // Ugandan Sign Language
	iso639_ugo, // Ugong
	iso639_ugy, // Uruguayan Sign Language
	iso639_uha, // Uhami
	iso639_uhn, // Damal
	iso639_uig, // Uighur
	iso639_uis, // Uisai
	iso639_uiv, // Iyive
	iso639_uji, // Tanjijili
	iso639_uka, // Kaburi
	iso639_ukg, // Ukuriguma
	iso639_ukh, // Ukhwejo
	iso639_ukl, // Ukrainian Sign Language
	iso639_ukp, // Ukpe-Bayobiri
	iso639_ukq, // Ukwa
	iso639_ukr, // Ukrainian
	iso639_uks, // Urubú-Kaapor Sign Language
	iso639_uku, // Ukue
	iso639_ukw, // Ukwuani-Aboh-Ndoni
	iso639_uky, // Kuuk-Yak
	iso639_ula, // Fungwa
	iso639_ulb, // Ulukwumi
	iso639_ulc, // Ulch
	iso639_ulf, // Usku
	iso639_uli, // Ulithian
	iso639_ulk, // Meriam
	iso639_ull, // Ullatan
	iso639_ulm, // Ulumanda'
	iso639_uln, // Unserdeutsch
	iso639_ulu, // Uma' Lung
	iso639_ulw, // Ulwa
	iso639_uma, // Umatilla
	iso639_umb, // Umbundu
	iso639_umc, // Marrucinian
	iso639_umd, // Umbindhamu
	iso639_umg, // Umbuygamu
	iso639_umi, // Ukit
	iso639_umm, // Umon
	iso639_umn, // Makyan Naga
	iso639_umo, // Umotína
	iso639_ump, // Umpila
	iso639_umr, // Umbugarla
	iso639_ums, // Pendau
	iso639_umu, // Munsee
	iso639_una, // North Watut
	iso639_und, // Undetermined
	iso639_une, // Uneme
	iso639_ung, // Ngarinyin
	iso639_unk, // Enawené-Nawé
	iso639_unm, // Unami
	iso639_unr, // Mundari
	iso639_unx, // Munda
	iso639_unz, // Unde Kaili
	iso639_uok, // Uokha
	iso639_upi, // Umeda
	iso639_upv, // Uripiv-Wala-Rano-Atchin
	iso639_ura, // Urarina
	iso639_urb, // Urubú-Kaapor
	iso639_urc, // Urningangg
	iso639_urd, // Urdu
	iso639_ure, // Uru
	iso639_urf, // Uradhi
	iso639_urg, // Urigina
	iso639_urh, // Urhobo
	iso639_uri, // Urim
	iso639_urk, // Urak Lawoi'
	iso639_url, // Urali
	iso639_urm, // Urapmin
	iso639_urn, // Uruangnirin
	iso639_uro, // Ura (Papua New Guinea)
	iso639_urp, // Uru-Pa-In
	iso639_urr, // Lehalurup
	iso639_urt, // Urat
	iso639_uru, // Urumi
	iso639_urv, // Uruava
	iso639_urw, // Sop
	iso639_urx, // Urimo
	iso639_ury, // Orya
	iso639_urz, // Uru-Eu-Wau-Wau
	iso639_usa, // Usarufa
	iso639_ush, // Ushojo
	iso639_usi, // Usui
	iso639_usk, // Usaghade
	iso639_usp, // Uspanteco
	iso639_usu, // Uya
	iso639_uta, // Otank
	iso639_ute, // Ute-Southern Paiute
	iso639_utp, // Amba (Solomon Islands)
	iso639_utr, // Etulo
	iso639_utu, // Utu
	iso639_uum, // Urum
	iso639_uun, // Kulon-Pazeh
	iso639_uur, // Ura (Vanuatu)
	iso639_uuu, // U
	iso639_uve, // West Uvean
	iso639_uvh, // Uri
	iso639_uvl, // Lote
	iso639_uwa, // Kuku-Uwanh
	iso639_uya, // Doko-Uyanga
	iso639_uzb, // Uzbek
	iso639_uzn, // Northern Uzbek
	iso639_uzs, // Southern Uzbek
	iso639_vaa, // Vaagri Booli
	iso639_vae, // Vale
	iso639_vaf, // Vafsi
	iso639_vag, // Vagla
	iso639_vah, // Varhadi-Nagpuri
	iso639_vai, // Vai
	iso639_vaj, // Vasekela Bushman
	iso639_val, // Vehes
	iso639_vam, // Vanimo
	iso639_van, // Valman
	iso639_vao, // Vao
	iso639_vap, // Vaiphei
	iso639_var, // Huarijio
	iso639_vas, // Vasavi
	iso639_vau, // Vanuma
	iso639_vav, // Varli
	iso639_vay, // Wayu
	iso639_vbb, // Southeast Babar
	iso639_vbk, // Southwestern Bontok
	iso639_vec, // Venetian
	iso639_ved, // Veddah
	iso639_vel, // Veluws
	iso639_vem, // Vemgo-Mabas
	iso639_ven, // Venda
	iso639_veo, // Ventureño
	iso639_vep, // Veps
	iso639_ver, // Mom Jango
	iso639_vgr, // Vaghri
	iso639_vgt, // Vlaamse Gebarentaal
	iso639_vic, // Virgin Islands Creole English
	iso639_vid, // Vidunda
	iso639_vie, // Vietnamese
	iso639_vif, // Vili
	iso639_vig, // Viemo
	iso639_vil, // Vilela
	iso639_vin, // Vinza
	iso639_vis, // Vishavan
	iso639_vit, // Viti
	iso639_viv, // Iduna
	iso639_vka, // Kariyarra
	iso639_vki, // Ija-Zuba
	iso639_vkj, // Kujarge
	iso639_vkk, // Kaur
	iso639_vkl, // Kulisusu
	iso639_vkm, // Kamakan
	iso639_vko, // Kodeoha
	iso639_vkp, // Korlai Creole Portuguese
	iso639_vkt, // Tenggarong Kutai Malay
	iso639_vku, // Kurrama
	iso639_vlp, // Valpei
	iso639_vls, // Vlaams
	iso639_vma, // Martuyhunira
	iso639_vmb, // Mbabaram
	iso639_vmc, // Juxtlahuaca Mixtec
	iso639_vmd, // Mudu Koraga
	iso639_vme, // East Masela
	iso639_vmf, // Mainfränkisch
	iso639_vmg, // Minigir
	iso639_vmh, // Maraghei
	iso639_vmi, // Miwa
	iso639_vmj, // Ixtayutla Mixtec
	iso639_vmk, // Makhuwa-Shirima
	iso639_vml, // Malgana
	iso639_vmm, // Mitlatongo Mixtec
	iso639_vmp, // Soyaltepec Mazatec
	iso639_vmq, // Soyaltepec Mixtec
	iso639_vmr, // Marenje
	iso639_vms, // Moksela
	iso639_vmu, // Muluridyi
	iso639_vmv, // Valley Maidu
	iso639_vmw, // Makhuwa
	iso639_vmx, // Tamazola Mixtec
	iso639_vmy, // Ayautla Mazatec
	iso639_vmz, // Mazatlán Mazatec
	iso639_vnk, // Vano
	iso639_vnm, // Vinmavis
	iso639_vnp, // Vunapu
	iso639_vol, // Volapük
	iso639_vor, // Voro
	iso639_vot, // Votic
	iso639_vra, // Vera'a
	iso639_vro, // Võro
	iso639_vrs, // Varisi
	iso639_vrt, // Burmbar
	iso639_vsi, // Moldova Sign Language
	iso639_vsl, // Venezuelan Sign Language
	iso639_vsv, // Valencian Sign Language
	iso639_vto, // Vitou
	iso639_vum, // Vumbu
	iso639_vun, // Vunjo
	iso639_vut, // Vute
	iso639_vwa, // Awa (China)
	iso639_waa, // Walla Walla
	iso639_wab, // Wab
	iso639_wac, // Wasco-Wishram
	iso639_wad, // Wandamen
	iso639_wae, // Walser
	iso639_waf, // Wakoná
	iso639_wag, // Wa'ema
	iso639_wah, // Watubela
	iso639_wai, // Wares
	iso639_waj, // Waffa
	iso639_wal, // Wolaytta
	iso639_wam, // Wampanoag
	iso639_wan, // Wan
	iso639_wao, // Wappo
	iso639_wap, // Wapishana
	iso639_waq, // Wageman
	iso639_war, // Waray (Philippines)
	iso639_was, // Washo
	iso639_wat, // Kaninuwa
	iso639_wau, // Waurá
	iso639_wav, // Waka
	iso639_waw, // Waiwai
	iso639_wax, // Watam
	iso639_way, // Wayana
	iso639_waz, // Wampur
	iso639_wba, // Warao
	iso639_wbb, // Wabo
	iso639_wbe, // Waritai
	iso639_wbf, // Wara
	iso639_wbh, // Wanda
	iso639_wbi, // Vwanji
	iso639_wbj, // Alagwa
	iso639_wbk, // Waigali
	iso639_wbl, // Wakhi
	iso639_wbm, // Wa
	iso639_wbp, // Warlpiri
	iso639_wbq, // Waddar
	iso639_wbr, // Wagdi
	iso639_wbt, // Wanman
	iso639_wbv, // Wajarri
	iso639_wbw, // Woi
	iso639_wca, // Yanomámi
	iso639_wci, // Waci Gbe
	iso639_wdd, // Wandji
	iso639_wdg, // Wadaginam
	iso639_wdj, // Wadjiginy
	iso639_wdu, // Wadjigu
	iso639_wea, // Wewaw
	iso639_wec, // Wè Western
	iso639_wed, // Wedau
	iso639_weh, // Weh
	iso639_wei, // Kiunum
	iso639_wem, // Weme Gbe
	iso639_weo, // Wemale
	iso639_wep, // Westphalien
	iso639_wer, // Weri
	iso639_wes, // Cameroon Pidgin
	iso639_wet, // Perai
	iso639_weu, // Rawngtu Chin
	iso639_wew, // Wejewa
	iso639_wfg, // Yafi
	iso639_wga, // Wagaya
	iso639_wgb, // Wagawaga
	iso639_wgg, // Wangganguru
	iso639_wgi, // Wahgi
	iso639_wgo, // Waigeo
	iso639_wgu, // Wirangu
	iso639_wgy, // Warrgamay
	iso639_wha, // Manusela
	iso639_whg, // North Wahgi
	iso639_whk, // Wahau Kenyah
	iso639_whu, // Wahau Kayan
	iso639_wib, // Southern Toussian
	iso639_wic, // Wichita
	iso639_wie, // Wik-Epa
	iso639_wif, // Wik-Keyangan
	iso639_wig, // Wik-Ngathana
	iso639_wih, // Wik-Me'anha
	iso639_wii, // Minidien
	iso639_wij, // Wik-Iiyanh
	iso639_wik, // Wikalkan
	iso639_wil, // Wilawila
	iso639_wim, // Wik-Mungkan
	iso639_win, // Ho-Chunk
	iso639_wir, // Wiraféd
	iso639_wit, // Wintu
	iso639_wiu, // Wiru
	iso639_wiv, // Vitu
	iso639_wiy, // Wiyot
	iso639_wja, // Waja
	iso639_wji, // Warji
	iso639_wka, // Kw'adza
	iso639_wkb, // Kumbaran
	iso639_wkd, // Wakde
	iso639_wkl, // Kalanadi
	iso639_wku, // Kunduvadi
	iso639_wkw, // Wakawaka
	iso639_wla, // Walio
	iso639_wlc, // Mwali Comorian
	iso639_wle, // Wolane
	iso639_wlg, // Kunbarlang
	iso639_wli, // Waioli
	iso639_wlk, // Wailaki
	iso639_wll, // Wali (Sudan)
	iso639_wlm, // Middle Welsh
	iso639_wln, // Walloon
	iso639_wlo, // Wolio
	iso639_wlr, // Wailapa
	iso639_wls, // Wallisian
	iso639_wlu, // Wuliwuli
	iso639_wlv, // Wichí Lhamtés Vejoz
	iso639_wlw, // Walak
	iso639_wlx, // Wali (Ghana)
	iso639_wly, // Waling
	iso639_wma, // Mawa (Nigeria)
	iso639_wmb, // Wambaya
	iso639_wmc, // Wamas
	iso639_wmd, // Mamaindé
	iso639_wme, // Wambule
	iso639_wmh, // Waima'a
	iso639_wmi, // Wamin
	iso639_wmm, // Maiwa (Indonesia)
	iso639_wmn, // Waamwang
	iso639_wmo, // Wom (Papua New Guinea)
	iso639_wms, // Wambon
	iso639_wmt, // Walmajarri
	iso639_wmw, // Mwani
	iso639_wmx, // Womo
	iso639_wnb, // Wanambre
	iso639_wnc, // Wantoat
	iso639_wnd, // Wandarang
	iso639_wne, // Waneci
	iso639_wng, // Wanggom
	iso639_wni, // Ndzwani Comorian
	iso639_wnk, // Wanukaka
	iso639_wnm, // Wanggamala
	iso639_wno, // Wano
	iso639_wnp, // Wanap
	iso639_wnu, // Usan
	iso639_wny, // Wanyi
	iso639_woa, // Tyaraity
	iso639_wob, // Wè Northern
	iso639_woc, // Wogeo
	iso639_wod, // Wolani
	iso639_woe, // Woleaian
	iso639_wof, // Gambian Wolof
	iso639_wog, // Wogamusin
	iso639_woi, // Kamang
	iso639_wok, // Longto
	iso639_wol, // Wolof
	iso639_wom, // Wom (Nigeria)
	iso639_won, // Wongo
	iso639_woo, // Manombai
	iso639_wor, // Woria
	iso639_wos, // Hanga Hundi
	iso639_wow, // Wawonii
	iso639_woy, // Weyto
	iso639_wpc, // Maco
	iso639_wra, // Warapu
	iso639_wrb, // Warluwara
	iso639_wrd, // Warduji
	iso639_wrg, // Warungu
	iso639_wrh, // Wiradhuri
	iso639_wri, // Wariyangga
	iso639_wrk, // Garrwa
	iso639_wrl, // Warlmanpa
	iso639_wrm, // Warumungu
	iso639_wrn, // Warnang
	iso639_wro, // Worrorra
	iso639_wrp, // Waropen
	iso639_wrr, // Wardaman
	iso639_wrs, // Waris
	iso639_wru, // Waru
	iso639_wrv, // Waruna
	iso639_wrw, // Gugu Warra
	iso639_wrx, // Wae Rana
	iso639_wry, // Merwari
	iso639_wrz, // Waray (Australia)
	iso639_wsa, // Warembori
	iso639_wsi, // Wusi
	iso639_wsk, // Waskia
	iso639_wsr, // Owenia
	iso639_wss, // Wasa
	iso639_wsu, // Wasu
	iso639_wsv, // Wotapuri-Katarqalai
	iso639_wtf, // Watiwa
	iso639_wti, // Berta
	iso639_wtk, // Watakataui
	iso639_wtm, // Mewati
	iso639_wtw, // Wotu
	iso639_wua, // Wikngenchera
	iso639_wub, // Wunambal
	iso639_wud, // Wudu
	iso639_wuh, // Wutunhua
	iso639_wul, // Silimo
	iso639_wum, // Wumbvu
	iso639_wun, // Bungu
	iso639_wur, // Wurrugu
	iso639_wut, // Wutung
	iso639_wuu, // Wu Chinese
	iso639_wuv, // Wuvulu-Aua
	iso639_wux, // Wulna
	iso639_wuy, // Wauyai
	iso639_wwa, // Waama
	iso639_wwb, // Wakabunga
	iso639_wwo, // Wetamut
	iso639_wwr, // Warrwa
	iso639_www, // Wawa
	iso639_wxa, // Waxianghua
	iso639_wya, // Wyandot
	iso639_wyb, // Wangaaybuwan-Ngiyambaa
	iso639_wym, // Wymysorys
	iso639_wyr, // Wayoró
	iso639_wyy, // Western Fijian
	iso639_xaa, // Andalusian Arabic
	iso639_xab, // Sambe
	iso639_xac, // Kachari
	iso639_xad, // Adai
	iso639_xae, // Aequian
	iso639_xag, // Aghwan
	iso639_xai, // Kaimbé
	iso639_xal, // Kalmyk
	iso639_xam, // /Xam
	iso639_xan, // Xamtanga
	iso639_xao, // Khao
	iso639_xap, // Apalachee
	iso639_xaq, // Aquitanian
	iso639_xar, // Karami
	iso639_xas, // Kamas
	iso639_xat, // Katawixi
	iso639_xau, // Kauwera
	iso639_xav, // Xavánte
	iso639_xaw, // Kawaiisu
	iso639_xay, // Kayan Mahakam
	iso639_xba, // Kamba (Brazil)
	iso639_xbb, // Lower Burdekin
	iso639_xbc, // Bactrian
	iso639_xbi, // Kombio
	iso639_xbm, // Middle Breton
	iso639_xbn, // Kenaboi
	iso639_xbo, // Bolgarian
	iso639_xbr, // Kambera
	iso639_xbw, // Kambiwá
	iso639_xbx, // Kabixí
	iso639_xcb, // Cumbric
	iso639_xcc, // Camunic
	iso639_xce, // Celtiberian
	iso639_xcg, // Cisalpine Gaulish
	iso639_xch, // Chemakum
	iso639_xcl, // Classical Armenian
	iso639_xcm, // Comecrudo
	iso639_xcn, // Cotoname
	iso639_xco, // Chorasmian
	iso639_xcr, // Carian
	iso639_xct, // Classical Tibetan
	iso639_xcu, // Curonian
	iso639_xcv, // Chuvantsy
	iso639_xcw, // Coahuilteco
	iso639_xcy, // Cayuse
	iso639_xdc, // Dacian
	iso639_xdm, // Edomite
	iso639_xdy, // Malayic Dayak
	iso639_xeb, // Eblan
	iso639_xed, // Hdi
	iso639_xeg, // //Xegwi
	iso639_xel, // Kelo
	iso639_xem, // Kembayan
	iso639_xep, // Epi-Olmec
	iso639_xer, // Xerénte
	iso639_xes, // Kesawai
	iso639_xet, // Xetá
	iso639_xeu, // Keoru-Ahia
	iso639_xfa, // Faliscan
	iso639_xga, // Galatian
	iso639_xgb, // Gbin
	iso639_xgf, // Gabrielino-Fernandeño
	iso639_xgl, // Galindan
	iso639_xgr, // Garza
	iso639_xgu, // Unggumi
	iso639_xha, // Harami
	iso639_xhc, // Hunnic
	iso639_xhd, // Hadrami
	iso639_xhe, // Khetrani
	iso639_xho, // Xhosa
	iso639_xhr, // Hernican
	iso639_xht, // Hattic
	iso639_xhu, // Hurrian
	iso639_xhv, // Khua
	iso639_xia, // Xiandao
	iso639_xib, // Iberian
	iso639_xii, // Xiri
	iso639_xil, // Illyrian
	iso639_xin, // Xinca
	iso639_xip, // Xipináwa
	iso639_xir, // Xiriâna
	iso639_xiv, // Indus Valley Language
	iso639_xiy, // Xipaya
	iso639_xka, // Kalkoti
	iso639_xkb, // Northern Nago
	iso639_xkc, // Kho'ini
	iso639_xkd, // Mendalam Kayan
	iso639_xke, // Kereho
	iso639_xkf, // Khengkha
	iso639_xkg, // Kagoro
	iso639_xkh, // Karahawyana
	iso639_xki, // Kenyan Sign Language
	iso639_xkj, // Kajali
	iso639_xkk, // Kaco'
	iso639_xkl, // Mainstream Kenyah
	iso639_xkn, // Kayan River Kayan
	iso639_xko, // Kiorr
	iso639_xkp, // Kabatei
	iso639_xkq, // Koroni
	iso639_xkr, // Xakriabá
	iso639_xks, // Kumbewaha
	iso639_xkt, // Kantosi
	iso639_xku, // Kaamba
	iso639_xkv, // Kgalagadi
	iso639_xkw, // Kembra
	iso639_xkx, // Karore
	iso639_xky, // Uma' Lasan
	iso639_xkz, // Kurtokha
	iso639_xla, // Kamula
	iso639_xlb, // Loup B
	iso639_xlc, // Lycian
	iso639_xld, // Lydian
	iso639_xle, // Lemnian
	iso639_xlg, // Ligurian (Ancient)
	iso639_xli, // Liburnian
	iso639_xln, // Alanic
	iso639_xlo, // Loup A
	iso639_xlp, // Lepontic
	iso639_xls, // Lusitanian
	iso639_xlu, // Cuneiform Luwian
	iso639_xly, // Elymian
	iso639_xma, // Mushungulu
	iso639_xmb, // Mbonga
	iso639_xmc, // Makhuwa-Marrevone
	iso639_xmd, // Mbudum
	iso639_xme, // Median
	iso639_xmf, // Mingrelian
	iso639_xmg, // Mengaka
	iso639_xmh, // Kuku-Muminh
	iso639_xmj, // Majera
	iso639_xmk, // Ancient Macedonian
	iso639_xml, // Malaysian Sign Language
	iso639_xmm, // Manado Malay
	iso639_xmn, // Manichaean Middle Persian
	iso639_xmo, // Morerebi
	iso639_xmp, // Kuku-Mu'inh
	iso639_xmq, // Kuku-Mangk
	iso639_xmr, // Meroitic
	iso639_xms, // Moroccan Sign Language
	iso639_xmt, // Matbat
	iso639_xmu, // Kamu
	iso639_xmv, // Antankarana Malagasy
	iso639_xmw, // Tsimihety Malagasy
	iso639_xmx, // Maden
	iso639_xmy, // Mayaguduna
	iso639_xmz, // Mori Bawah
	iso639_xna, // Ancient North Arabian
	iso639_xnb, // Kanakanabu
	iso639_xng, // Middle Mongolian
	iso639_xnh, // Kuanhua
	iso639_xnn, // Northern Kankanay
	iso639_xno, // Anglo-Norman
	iso639_xnr, // Kangri
	iso639_xns, // Kanashi
	iso639_xnt, // Narragansett
	iso639_xnz, // Kenzi
	iso639_xoc, // O'chi'chi'
	iso639_xod, // Kokoda
	iso639_xog, // Soga
	iso639_xoi, // Kominimung
	iso639_xok, // Xokleng
	iso639_xom, // Komo (Sudan)
	iso639_xon, // Konkomba
	iso639_xoo, // Xukurú
	iso639_xop, // Kopar
	iso639_xor, // Korubo
	iso639_xow, // Kowaki
	iso639_xpc, // Pecheneg
	iso639_xpe, // Liberia Kpelle
	iso639_xpg, // Phrygian
	iso639_xpi, // Pictish
	iso639_xpj, // Mpalitjanh
	iso639_xpk, // Kulina Pano
	iso639_xpm, // Pumpokol
	iso639_xpn, // Kapinawá
	iso639_xpo, // Pochutec
	iso639_xpp, // Puyo-Paekche
	iso639_xpq, // Mohegan-Pequot
	iso639_xpr, // Parthian
	iso639_xps, // Pisidian
	iso639_xpu, // Punic
	iso639_xpy, // Puyo
	iso639_xqa, // Karakhanid
	iso639_xqt, // Qatabanian
	iso639_xra, // Krahô
	iso639_xrb, // Eastern Karaboro
	iso639_xre, // Kreye
	iso639_xri, // Krikati-Timbira
	iso639_xrm, // Armazic
	iso639_xrn, // Arin
	iso639_xrr, // Raetic
	iso639_xrt, // Aranama-Tamique
	iso639_xru, // Marriammu
	iso639_xrw, // Karawa
	iso639_xsa, // Sabaean
	iso639_xsb, // Sambal
	iso639_xsc, // Scythian
	iso639_xsd, // Sidetic
	iso639_xse, // Sempan
	iso639_xsh, // Shamang
	iso639_xsi, // Sio
	iso639_xsj, // Subi
	iso639_xsl, // South Slavey
	iso639_xsm, // Kasem
	iso639_xsn, // Sanga (Nigeria)
	iso639_xso, // Solano
	iso639_xsp, // Silopi
	iso639_xsq, // Makhuwa-Saka
	iso639_xsr, // Sherpa
	iso639_xss, // Assan
	iso639_xsu, // Sanumá
	iso639_xsv, // Sudovian
	iso639_xsy, // Saisiyat
	iso639_xta, // Alcozauca Mixtec
	iso639_xtb, // Chazumba Mixtec
	iso639_xtc, // Katcha-Kadugli-Miri
	iso639_xtd, // Diuxi-Tilantongo Mixtec
	iso639_xte, // Ketengban
	iso639_xtg, // Transalpine Gaulish
	iso639_xti, // Sinicahua Mixtec
	iso639_xtj, // San Juan Teita Mixtec
	iso639_xtl, // Tijaltepec Mixtec
	iso639_xtm, // Magdalena Peñasco Mixtec
	iso639_xtn, // Northern Tlaxiaco Mixtec
	iso639_xto, // Tokharian A
	iso639_xtp, // San Miguel Piedras Mixtec
	iso639_xtq, // Tumshuqese
	iso639_xtr, // Early Tripuri
	iso639_xts, // Sindihui Mixtec
	iso639_xtt, // Tacahua Mixtec
	iso639_xtu, // Cuyamecalco Mixtec
	iso639_xtw, // Tawandê
	iso639_xty, // Yoloxochitl Mixtec
	iso639_xtz, // Tasmanian
	iso639_xua, // Alu Kurumba
	iso639_xub, // Betta Kurumba
	iso639_xud, // Umiida
	iso639_xug, // Kunigami
	iso639_xuj, // Jennu Kurumba
	iso639_xum, // Umbrian
	iso639_xun, // Unggarranggu
	iso639_xuo, // Kuo
	iso639_xup, // Upper Umpqua
	iso639_xur, // Urartian
	iso639_xut, // Kuthant
	iso639_xuu, // Kxoe
	iso639_xve, // Venetic
	iso639_xvi, // Kamviri
	iso639_xvn, // Vandalic
	iso639_xvo, // Volscian
	iso639_xvs, // Vestinian
	iso639_xwa, // Kwaza
	iso639_xwc, // Woccon
	iso639_xwe, // Xwela Gbe
	iso639_xwg, // Kwegu
	iso639_xwl, // Western Xwla Gbe
	iso639_xwo, // Written Oirat
	iso639_xwr, // Kwerba Mamberamo
	iso639_xxb, // Boro (Ghana)
	iso639_xxk, // Ke'o
	iso639_xxr, // Koropó
	iso639_xxt, // Tambora
	iso639_xyl, // Yalakalore
	iso639_xyy, // Yorta Yorta
	iso639_xzh, // Zhang-Zhung
	iso639_xzm, // Zemgalian
	iso639_xzp, // Ancient Zapotec
	iso639_yaa, // Yaminahua
	iso639_yab, // Yuhup
	iso639_yac, // Pass Valley Yali
	iso639_yad, // Yagua
	iso639_yae, // Pumé
	iso639_yaf, // Yaka (Democratic Republic of Congo)
	iso639_yag, // Yámana
	iso639_yah, // Yazgulyam
	iso639_yai, // Yagnobi
	iso639_yaj, // Banda-Yangere
	iso639_yak, // Yakama
	iso639_yal, // Yalunka
	iso639_yam, // Yamba
	iso639_yan, // Mayangna
	iso639_yao, // Yao
	iso639_yap, // Yapese
	iso639_yaq, // Yaqui
	iso639_yar, // Yabarana
	iso639_yas, // Nugunu (Cameroon)
	iso639_yat, // Yambeta
	iso639_yau, // Yuwana
	iso639_yav, // Yangben
	iso639_yaw, // Yawalapití
	iso639_yax, // Yauma
	iso639_yay, // Agwagwune
	iso639_yaz, // Lokaa
	iso639_yba, // Yala
	iso639_ybb, // Yemba
	iso639_ybe, // West Yugur
	iso639_ybh, // Yakha
	iso639_ybi, // Yamphu
	iso639_ybj, // Hasha
	iso639_ybk, // Bokha
	iso639_ybl, // Yukuben
	iso639_ybm, // Yaben
	iso639_ybn, // Yabaâna
	iso639_ybo, // Yabong
	iso639_ybx, // Yawiyo
	iso639_yby, // Yaweyuha
	iso639_ych, // Chesu
	iso639_ycl, // Lolopo
	iso639_ycn, // Yucuna
	iso639_ycp, // Chepya
	iso639_ydd, // Eastern Yiddish
	iso639_yde, // Yangum Dey
	iso639_ydg, // Yidgha
	iso639_ydk, // Yoidik
	iso639_yds, // Yiddish Sign Language
	iso639_yea, // Ravula
	iso639_yec, // Yeniche
	iso639_yee, // Yimas
	iso639_yei, // Yeni
	iso639_yej, // Yevanic
	iso639_yel, // Yela
	iso639_yer, // Tarok
	iso639_yes, // Nyankpa
	iso639_yet, // Yetfa
	iso639_yeu, // Yerukula
	iso639_yev, // Yapunda
	iso639_yey, // Yeyi
	iso639_yga, // Malyangapa
	iso639_ygl, // Yangum Gel
	iso639_ygm, // Yagomi
	iso639_ygp, // Gepo
	iso639_ygr, // Yagaria
	iso639_ygw, // Yagwoia
	iso639_yha, // Baha Buyang
	iso639_yhd, // Judeo-Iraqi Arabic
	iso639_yhl, // Hlepho Phowa
	iso639_yia, // Yinggarda
	iso639_yid, // Yiddish
	iso639_yif, // Ache
	iso639_yig, // Wusa Nasu
	iso639_yih, // Western Yiddish
	iso639_yii, // Yidiny
	iso639_yij, // Yindjibarndi
	iso639_yik, // Dongshanba Lalo
	iso639_yil, // Yindjilandji
	iso639_yim, // Yimchungru Naga
	iso639_yin, // Yinchia
	iso639_yip, // Pholo
	iso639_yiq, // Miqie
	iso639_yir, // North Awyu
	iso639_yis, // Yis
	iso639_yit, // Eastern Lalu
	iso639_yiu, // Awu
	iso639_yiv, // Northern Nisu
	iso639_yix, // Axi Yi
	iso639_yiy, // Yir Yoront
	iso639_yiz, // Azhe
	iso639_yka, // Yakan
	iso639_ykg, // Northern Yukaghir
	iso639_yki, // Yoke
	iso639_ykk, // Yakaikeke
	iso639_ykl, // Khlula
	iso639_ykm, // Kap
	iso639_ykn, // Kua-nsi
	iso639_yko, // Yasa
	iso639_ykr, // Yekora
	iso639_ykt, // Kathu
	iso639_yku, // Kuamasi
	iso639_yky, // Yakoma
	iso639_yla, // Yaul
	iso639_ylb, // Yaleba
	iso639_yle, // Yele
	iso639_ylg, // Yelogu
	iso639_yli, // Angguruk Yali
	iso639_yll, // Yil
	iso639_ylm, // Limi
	iso639_yln, // Langnian Buyang
	iso639_ylo, // Naluo Yi
	iso639_ylr, // Yalarnnga
	iso639_ylu, // Aribwaung
	iso639_yly, // Nyâlayu
	iso639_ymb, // Yambes
	iso639_ymc, // Southern Muji
	iso639_ymd, // Muda
	iso639_yme, // Yameo
	iso639_ymg, // Yamongeri
	iso639_ymh, // Mili
	iso639_ymi, // Moji
	iso639_ymk, // Makwe
	iso639_yml, // Iamalele
	iso639_ymm, // Maay
	iso639_ymn, // Yamna
	iso639_ymo, // Yangum Mon
	iso639_ymp, // Yamap
	iso639_ymq, // Qila Muji
	iso639_ymr, // Malasar
	iso639_yms, // Mysian
	iso639_ymt, // Mator-Taygi-Karagas
	iso639_ymx, // Northern Muji
	iso639_ymz, // Muzi
	iso639_yna, // Aluo
	iso639_ynd, // Yandruwandha
	iso639_yne, // Lang'e
	iso639_yng, // Yango
	iso639_ynh, // Yangho
	iso639_ynk, // Naukan Yupik
	iso639_ynl, // Yangulam
	iso639_ynn, // Yana
	iso639_yno, // Yong
	iso639_ynq, // Yendang
	iso639_yns, // Yansi
	iso639_ynu, // Yahuna
	iso639_yob, // Yoba
	iso639_yog, // Yogad
	iso639_yoi, // Yonaguni
	iso639_yok, // Yokuts
	iso639_yol, // Yola
	iso639_yom, // Yombe
	iso639_yon, // Yongkom
	iso639_yor, // Yoruba
	iso639_yos, // Yos
	iso639_yot, // Yotti
	iso639_yox, // Yoron
	iso639_yoy, // Yoy
	iso639_ypa, // Phala
	iso639_ypb, // Labo Phowa
	iso639_ypg, // Phola
	iso639_yph, // Phupha
	iso639_ypm, // Phuma
	iso639_ypn, // Ani Phowa
	iso639_ypo, // Alo Phola
	iso639_ypp, // Phupa
	iso639_ypz, // Phuza
	iso639_yra, // Yerakai
	iso639_yrb, // Yareba
	iso639_yre, // Yaouré
	iso639_yri, // Yarí
	iso639_yrk, // Nenets
	iso639_yrl, // Nhengatu
	iso639_yrn, // Yerong
	iso639_yrs, // Yarsun
	iso639_yrw, // Yarawata
	iso639_ysc, // Yassic
	iso639_ysd, // Samatao
	iso639_ysg, // Sonaga
	iso639_ysl, // Yugoslavian Sign Language
	iso639_ysn, // Sani
	iso639_yso, // Nisi (China)
	iso639_ysp, // Southern Lolopo
	iso639_ysr, // Sirenik Yupik
	iso639_yss, // Yessan-Mayo
	iso639_ysy, // Sanie
	iso639_yta, // Talu
	iso639_ytl, // Tanglang
	iso639_ytp, // Thopho
	iso639_ytw, // Yout Wam
	iso639_yua, // Yucateco
	iso639_yub, // Yugambal
	iso639_yuc, // Yuchi
	iso639_yud, // Judeo-Tripolitanian Arabic
	iso639_yue, // Yue Chinese
	iso639_yuf, // Havasupai-Walapai-Yavapai
	iso639_yug, // Yug
	iso639_yui, // Yurutí
	iso639_yuj, // Karkar-Yuri
	iso639_yuk, // Yuki
	iso639_yul, // Yulu
	iso639_yum, // Quechan
	iso639_yun, // Bena (Nigeria)
	iso639_yup, // Yukpa
	iso639_yuq, // Yuqui
	iso639_yur, // Yurok
	iso639_yut, // Yopno
	iso639_yuu, // Yugh
	iso639_yuw, // Yau (Morobe Province)
	iso639_yux, // Southern Yukaghir
	iso639_yuy, // East Yugur
	iso639_yuz, // Yuracare
	iso639_yva, // Yawa
	iso639_yvt, // Yavitero
	iso639_ywa, // Kalou
	iso639_ywl, // Western Lalu
	iso639_ywn, // Yawanawa
	iso639_ywq, // Wuding-Luquan Yi
	iso639_ywr, // Yawuru
	iso639_ywt, // Xishanba Lalo
	iso639_ywu, // Wumeng Nasu
	iso639_yww, // Yawarawarga
	iso639_yxg, // Yagara
	iso639_yxy, // Yabula Yabula
	iso639_yyu, // Yau (Sandaun Province)
	iso639_yyz, // Ayizi
	iso639_yzg, // E'ma Buyang
	iso639_yzk, // Zokhuo
	iso639_zaa, // Sierra de Juárez Zapotec
	iso639_zab, // San Juan Guelavía Zapotec
	iso639_zac, // Ocotlán Zapotec
	iso639_zad, // Cajonos Zapotec
	iso639_zae, // Yareni Zapotec
	iso639_zaf, // Ayoquesco Zapotec
	iso639_zag, // Zaghawa
	iso639_zah, // Zangwal
	iso639_zai, // Isthmus Zapotec
	iso639_zaj, // Zaramo
	iso639_zak, // Zanaki
	iso639_zal, // Zauzou
	iso639_zam, // Miahuatlán Zapotec
	iso639_zao, // Ozolotepec Zapotec
	iso639_zap, // Zapotec
	iso639_zaq, // Aloápam Zapotec
	iso639_zar, // Rincón Zapotec
	iso639_zas, // Santo Domingo Albarradas Zapotec
	iso639_zat, // Tabaa Zapotec
	iso639_zau, // Zangskari
	iso639_zav, // Yatzachi Zapotec
	iso639_zaw, // Mitla Zapotec
	iso639_zax, // Xadani Zapotec
	iso639_zay, // Zayse-Zergulla
	iso639_zaz, // Zari
	iso639_zbc, // Central Berawan
	iso639_zbe, // East Berawan
	iso639_zbl, // Blissymbols
	iso639_zbt, // Batui
	iso639_zbw, // West Berawan
	iso639_zca, // Coatecas Altas Zapotec
	iso639_zch, // Central Hongshuihe Zhuang
	iso639_zdj, // Ngazidja Comorian
	iso639_zea, // Zeeuws
	iso639_zeg, // Zenag
	iso639_zeh, // Eastern Hongshuihe Zhuang
	iso639_zen, // Zenaga
	iso639_zga, // Kinga
	iso639_zgb, // Guibei Zhuang
	iso639_zgm, // Minz Zhuang
	iso639_zgn, // Guibian Zhuang
	iso639_zgr, // Magori
	iso639_zha, // Zhuang
	iso639_zhb, // Zhaba
	iso639_zhd, // Dai Zhuang
	iso639_zhi, // Zhire
	iso639_zhn, // Nong Zhuang
	iso639_zho, // Chinese
	iso639_zhw, // Zhoa
	iso639_zia, // Zia
	iso639_zib, // Zimbabwe Sign Language
	iso639_zik, // Zimakani
	iso639_zil, // Zialo
	iso639_zim, // Mesme
	iso639_zin, // Zinza
	iso639_zir, // Ziriya
	iso639_ziw, // Zigula
	iso639_ziz, // Zizilivakan
	iso639_zka, // Kaimbulawa
	iso639_zkb, // Koibal
	iso639_zkd, // Kadu
	iso639_zkg, // Koguryo
	iso639_zkh, // Khorezmian
	iso639_zkk, // Karankawa
	iso639_zkn, // Kanan
	iso639_zko, // Kott
	iso639_zkp, // São Paulo Kaingáng
	iso639_zkr, // Zakhring
	iso639_zkt, // Kitan
	iso639_zku, // Kaurna
	iso639_zkv, // Krevinian
	iso639_zkz, // Khazar
	iso639_zlj, // Liujiang Zhuang
	iso639_zlm, // Malay (individual language)
	iso639_zln, // Lianshan Zhuang
	iso639_zlq, // Liuqian Zhuang
	iso639_zma, // Manda (Australia)
	iso639_zmb, // Zimba
	iso639_zmc, // Margany
	iso639_zmd, // Maridan
	iso639_zme, // Mangerr
	iso639_zmf, // Mfinu
	iso639_zmg, // Marti Ke
	iso639_zmh, // Makolkol
	iso639_zmi, // Negeri Sembilan Malay
	iso639_zmj, // Maridjabin
	iso639_zmk, // Mandandanyi
	iso639_zml, // Madngele
	iso639_zmm, // Marimanindji
	iso639_zmn, // Mbangwe
	iso639_zmo, // Molo
	iso639_zmp, // Mpuono
	iso639_zmq, // Mituku
	iso639_zmr, // Maranunggu
	iso639_zms, // Mbesa
	iso639_zmt, // Maringarr
	iso639_zmu, // Muruwari
	iso639_zmv, // Mbariman-Gudhinma
	iso639_zmw, // Mbo (Democratic Republic of Congo)
	iso639_zmx, // Bomitaba
	iso639_zmy, // Mariyedi
	iso639_zmz, // Mbandja
	iso639_zna, // Zan Gula
	iso639_zne, // Zande (individual language)
	iso639_zng, // Mang
	iso639_znk, // Manangkari
	iso639_zns, // Mangas
	iso639_zoc, // Copainalá Zoque
	iso639_zoh, // Chimalapa Zoque
	iso639_zom, // Zou
	iso639_zoo, // Asunción Mixtepec Zapotec
	iso639_zoq, // Tabasco Zoque
	iso639_zor, // Rayón Zoque
	iso639_zos, // Francisco León Zoque
	iso639_zpa, // Lachiguiri Zapotec
	iso639_zpb, // Yautepec Zapotec
	iso639_zpc, // Choapan Zapotec
	iso639_zpd, // Southeastern Ixtlán Zapotec
	iso639_zpe, // Petapa Zapotec
	iso639_zpf, // San Pedro Quiatoni Zapotec
	iso639_zpg, // Guevea De Humboldt Zapotec
	iso639_zph, // Totomachapan Zapotec
	iso639_zpi, // Santa María Quiegolani Zapotec
	iso639_zpj, // Quiavicuzas Zapotec
	iso639_zpk, // Tlacolulita Zapotec
	iso639_zpl, // Lachixío Zapotec
	iso639_zpm, // Mixtepec Zapotec
	iso639_zpn, // Santa Inés Yatzechi Zapotec
	iso639_zpo, // Amatlán Zapotec
	iso639_zpp, // El Alto Zapotec
	iso639_zpq, // Zoogocho Zapotec
	iso639_zpr, // Santiago Xanica Zapotec
	iso639_zps, // Coatlán Zapotec
	iso639_zpt, // San Vicente Coatlán Zapotec
	iso639_zpu, // Yalálag Zapotec
	iso639_zpv, // Chichicapan Zapotec
	iso639_zpw, // Zaniza Zapotec
	iso639_zpx, // San Baltazar Loxicha Zapotec
	iso639_zpy, // Mazaltepec Zapotec
	iso639_zpz, // Texmelucan Zapotec
	iso639_zqe, // Qiubei Zhuang
	iso639_zra, // Kara (Korea)
	iso639_zrg, // Mirgan
	iso639_zrn, // Zerenkel
	iso639_zro, // Záparo
	iso639_zrp, // Zarphatic
	iso639_zrs, // Mairasi
	iso639_zsa, // Sarasira
	iso639_zsk, // Kaskean
	iso639_zsl, // Zambian Sign Language
	iso639_zsm, // Standard Malay
	iso639_zsr, // Southern Rincon Zapotec
	iso639_zsu, // Sukurum
	iso639_zte, // Elotepec Zapotec
	iso639_ztg, // Xanaguía Zapotec
	iso639_ztl, // Lapaguía-Guivini Zapotec
	iso639_ztm, // San Agustín Mixtepec Zapotec
	iso639_ztn, // Santa Catarina Albarradas Zapotec
	iso639_ztp, // Loxicha Zapotec
	iso639_ztq, // Quioquitani-Quierí Zapotec
	iso639_zts, // Tilquiapan Zapotec
	iso639_ztt, // Tejalapan Zapotec
	iso639_ztu, // Güilá Zapotec
	iso639_ztx, // Zaachila Zapotec
	iso639_zty, // Yatee Zapotec
	iso639_zua, // Zeem
	iso639_zuh, // Tokano
	iso639_zul, // Zulu
	iso639_zum, // Kumzari
	iso639_zun, // Zuni
	iso639_zuy, // Zumaya
	iso639_zwa, // Zay
	iso639_zxx, // No linguistic content
	iso639_zyb, // Yongbei Zhuang
	iso639_zyg, // Yang Zhuang
	iso639_zyj, // Youjiang Zhuang
	iso639_zyn, // Yongnan Zhuang
	iso639_zyp, // Zyphe
	iso639_zza, // Zaza
	iso639_zzj, // Zuojiang Zhuang
	
	iso639_afa, // Afro-Asiatic languages
	iso639_alg, // Algonquian languages
	iso639_apa, // Apache languages
	iso639_art, // Artificial languages
	iso639_ath, // Athapascan languages
	iso639_aus, // Australian languages
	iso639_bad, // Banda languages
	iso639_bai, // Bamileke languages
	iso639_bat, // Baltic languages
	iso639_ber, // Berber languages
	iso639_bih, // Bihari languages
	iso639_bnt, // Bantu languages
	iso639_btk, // Batak languages
	iso639_cai, // Central American Indian languages
	iso639_cau, // Caucasian languages
	iso639_cel, // Celtic languages
	iso639_cmc, // Chamic languages
	iso639_cpe, // Creoles and pidgins, English based
	iso639_cpf, // Creoles and pidgins, French-based
	iso639_cpp, // Creoles and pidgins, Portuguese-based
	iso639_crp, // Creoles and pidgins
	iso639_cus, // Cushitic languages
	iso639_day, // Land Dayak languages
	iso639_dra, // Dravidian languages
	iso639_fiu, // Finno-Ugrian languages
	iso639_gem, // Germanic languages
	iso639_him, // Himachali languages
	iso639_ijo, // Ijo languages
	iso639_inc, // Indic languages
	iso639_ine, // Indo-European languages
	iso639_ira, // Iranian languages
	iso639_iro, // Iroquoian languages
	iso639_kar, // Karen languages
	iso639_khi, // Khoisan languages
	iso639_kro, // Kru languages
	iso639_map, // Austronesian languages
	iso639_mkh, // Mon-Khmer languages
	iso639_mno, // Manobo languages
	iso639_mun, // Munda languages
	iso639_myn, // Mayan languages
	iso639_nah, // Nahuatl languages
	iso639_nai, // North American Indian languages
	iso639_nic, // Niger-Kordofanian languages
	iso639_nub, // Nubian languages
	iso639_oto, // Otomian languages
	iso639_paa, // Papuan languages
	iso639_phi, // Philippine languages
	iso639_pra, // Prakrit languages
	iso639_qaa_qtz, // Reserved for local use
	iso639_roa, // Romance languages
	iso639_sai, // South American Indian languages
	iso639_sal, // Salishan languages
	iso639_sem, // Semitic languages
	iso639_sgn, // Sign Languages
	iso639_sio, // Siouan languages
	iso639_sit, // Sino-Tibetan languages
	iso639_sla, // Slavic languages
	iso639_smi, // Sami languages
	iso639_son, // Songhai languages
	iso639_ssa, // Nilo-Saharan languages
	iso639_tai, // Tai languages
	iso639_tup, // Tupi languages
	iso639_tut, // Altaic languages
	iso639_wak, // Wakashan languages
	iso639_wen, // Sorbian languages
	iso639_ypk, // Yupik languages
	iso639_znd, // Zande languages
	
	nonstd_art_eur, // Europanto
	nonstd_art_rom, // Romanica
	nonstd_art_tok, // Toki Pona
	nonstd_ast_leo, // Leonese
	nonstd_bat_smg, // Samogitian
	nonstd_bns, // Binisayâ
	nonstd_chs, // Chumash
	nonstd_dog, // Dogon
	nonstd_ell_gri, // Salentine Greek
	nonstd_eml, // Romagnolo
	nonstd_fra_jer, // Jèrriais
	nonstd_glo, // Glosa
	nonstd_kjl_zkm, // Maikoti
	nonstd_mul, // Translingual
	nonstd_nap_cal, // Calabrese
	nonstd_oci_prv, // Provençal
	nonstd_por_br, // Brasilian Portuguese
	nonstd_sic, // Malinguat
	nonstd_simple, // Simple English
	nonstd_str_saa, // Saanich
	nonstd_twf_tao, // Taos
	nonstd_yue_can, // Cantonese	
	
	/** @deprecated Use <code>null</code> instead. */
	@Deprecated
	unknown; // All other languages
	
}
