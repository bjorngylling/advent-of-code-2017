(ns aoc2017.day4
  (:require [clojure.string :as str]))

(def input
  (str/split-lines "una bokpr ftz ryw nau yknf fguaczl anu\ntvay wvco bcoblpt fwzg sfsys zvuqll mcbhwz ovcw fgdy\nynsocz vid rfmsy essqt fpbjvvq sldje qfpvjvb\nyvh nxc kla vhy vkbq cxfzgr\nkljv ymobo jlvk ebst cse cmlub tavputz omoby psif\nebfuvvu paqgzri uvvubef hglk jvn gzeln bdl ziqgpra bzcfa\ntclq ytw tclq tezcqys\nqae eofr yzwcwqf wqm ytcdnc pxnmkw\nkrryi irykr ycp lbeed ykrir lhq rdd tyujwd\nhms pii lxoa dchsvz bepjwst bllxkqg hsm yrdj myzvju msh lwnnc\nyxqh hqxy xkn ljjsqjh jjljshq\nmhgsehj urbvnvf gbz ykxsd hsmgehj wtoc ujpfaos eir vifog tsy kdo\nwfruf wwijme pxbbsvf asmgs ccbn vwtc mkhah oxxfh\nlxqy jzvcvd cfgg uahxrwr dqmaqr bwzm wruxhra lrb lmk\njspgxo yuhgni njzqtn zglkzz ybc itj orqr zgqwuoo mjagh erll srqrk\ncbrtnbx ukblei ienmdm sinzq lytyliz mma lizylty zeumwgu\naeggz eljcry buqdeog dvjzn ilvw arz vep kxdzm mvh szkf\nimn sfty ugg flqq nydky mni bkqzlok wye lehwlmp xeyfmj\nbeyv oamrpkc tebdkwv zlq jes mqvif sej qpsnmjz edvtbkw\nhylmacl wwlra xntnvg ppvb bzof cymllha\nqktxomf ngfpuz qqz malc zxuqz szg zis vzro rfpgk\nphru sxlg qzqlw uej vmd omzga jue\ndrzgojf ttqdqar weikik wvrjtxi gbj jramqh nlwoj drzgojf bgabmn xqlaeun\naiuohu pca apkmv cpa kmvpa nmdn\ngelymv eto itcnuhn ote teo\noxiz xzio kqu wwgow\npicoyb coibpy acsw ehlirq deyz gymqvz opicyb vuet lrl\nzerg rezg miwtjgw gezr cui\nmlh qlu ktil tnlgnrk bfqbk pgg qxeyd noadmjo nonlsh eqxdy\nyqqaq yqqqa xod oss\nmkotw bznvs xowoofq sebp wsgpsmn fytcpc vvmzr vmzrv xwtxz zrvvm\ndvs twhz teqmlow oqg sjetxd aku cwl qfvrkex mndsio hfg\nitdl qwdagkk wli tdil vlgur dyl xvfm\nwlmyd dwmlx zhmqd zqmhd edzsvmz yclg umpq\npetva gazw byrca pvaet epkoqh nlp vqfl vatpe\nrykn ckr dijkme kmiedj ozlh deikmj\nkuecjh sfqv pojfzf fjopzf fjpfzo amxtc\nhri gglmial lrwbyc memgszu hir cfwlg ylcrwb\nrxrfbtv pwpra fngt auh rapwp zrruuq uah\ncevc utfd ysrfcw nnlg fnqtx aua htteunu mrjhhj\ntvnxznj mvpagt nqmxvnl mutn ntmu eybh vkqeaj frayclp\nygktzxo lzwwy qsipu nwb jdmw pahao paow mwjd uivqbnj woap nyyogcc\nlog zihz rsmx ixfr xwvd osg zxc gol ufnbig\ndogve cnb osa xbafl vefr nxlw yjgquui\nucyl aaoae ktjvi fyps xvjhpbh iiur tuc\npqt jasxg ehhs lzjzzzl sqmmj vwyva eklbtv hksanb fuesnd oyw fuesdn\nuankv wesi frhpau qiucu lim uzbdapf ciwjd tifbqxh tfbtsdi\nvgjd izpofu fqjpcct phuz\ncfg cfg rgahl frm emn pbfsmgy frm jemwqgn sfpm azunntj igl\ndaps hpe fqg err sapd dci vbzlqx gsigq eyp rre\niuqyqdy djprdj mgtkdxr pwmkzv wmkvzp hppisd pidphs\nrlr rrl vhevh cucprc xki urte lrr zfc xrqydzk ipjkyxj kytul\njwbkaee rgyjl rjljbwe ppq plp pfts ijd ckpvmw mbdrqh zolt lzmr\nalw law awl wknavtb esklsbj wvssyai\naqy ldf qdht soxkg qtfipe nsdm aqe rtlc fbqrk ius gybbhxr\nxteov wgqoqim nlz szlj oxevt xwb\ntmgdst fyn oul tsohzbq ltmxji fgops gatssx zxdzfc talb\nzkvjpu jnhtc nxs jqv pyoqz zsj ckwd xot ykai\nfxfarre yjbxvj lqfaglo mbxuv bmuxv bxumv\nyrhi uosldj hryi fwres ycygw ycvxze zevxyc iyk\nyphev xisbai xdb hzrbg ayxbhdx qnvbus pwc\nwytqraw yvurj erqckl rvrvda xsh gsd bxtm acxle gpndk\nkpvjtu vacggk oabcuoq qusf zitqpgn pbyq ocabouq ntpgizq gaiiry dke\nfrz ceozajo ljltawq tjepzp iflv\nzntejm dkfgc ysno noys sony muy\nqdnyvvw oykq bnmldt zjgauw pviurd cbcnl tnkhq ebsey bccln arvwe\niqazt xidjgom wcrdz itht lfh ifzwkj rwqxhy ervcgmt vojg lzntz ezg\ntlcxioh qvvkan wpi ody\nmhsy dwm hyms yegvvc\nhbkvi wvemc uwxgqf pwrgu wcy wxqfgu qkzppc vxcwdwd rcgp ivjd wmevc\nupc ucp cpu unmr pyod\nbqfew ebwfq paccwh phgc fchhr jrnio\nabh bjalls bdtac zzvt totdlc yptqmgu rpcin bch cqklqly\nbsnss qcsgi tegyz lqoqkpf qvatlyu ibza mzfotsk lye oqqf mnor\nlzrxca stkbn axhr wckbip bsntk ahrx\noricdw cnpte dbz nqx xloxc bdz fdsl uyvgi nvoy ezbi\nnlcqye ofta jcvqvtg yxduyh btawc tjgvqvc tcvqjvg\nnji znctdfm kkmp pmt ikhl jjoubc xnp zdctnmf covvmsh ydh ircplcm\nyafkuk yasqsyt ytqayss nusgb ukfyka\nyogcf emg jlkd blupemf axg wihhrb ysernt yznhz\ngmc yyqtgp use lohoit\nlclwa ojjkm rxr rrx\npunyfv iphw ddbc jghx lrssszc bepexv sicpy syicp lszrscs vrqjb\nrjanra juh hljdmad scu usc baifu ijs suc bgdbbv\nogs hehi lgiwowc wwezznc ogs lorcl naunpll wlmal ajcbj ciujw\nslenm xxod vhf amhts\nmrrduda mrrduda lwecwjv lwecwjv vvzmjla cjipv\nixnv invx inmzz aoxghpv\nulyvfrf zsup zfryjy xoo agdsd giw papa ljtu rzbjiq wrex\nbzpv svpuyov mklrct uzox\nfxs iypd uaqch kxazj ksjyv\nuxaommf xtq uubbfk bmlq kdhgjzg oxwpag itfij irmkjx ggod sddcyo bopn\nlch plmvfni qbjr dnu zjcod qlwax gejmyj gxjqm mfzkb gejmyj\nyoa thrfbto wposvrm amulogu mcqzfax fjquli oay\nkywj kqqhney ozuljxz wqwfte ubo mjj anhhg aphy ocfnef yhin ywnx\nvxuledm wllj obqtsrr jwll uvmelxd xvj gbwte\nhevc bitwu ydw ywd btiwu iuether gfe\ndzn ssmfpel wbbdeyt xge hrfi\nzebz ifhq euto ppfnrwc winkkj\nutuly wtdt iahpe ihtxwmh zxun bqluj hsaxgcs ytluu jlfnnuv drxlctr myhp\nkwxgy hreul rsnh wdmsx kkajywb\nbond djq kccazc zvzcie hndm myx cmhyhkc ove ord dqj\nzcong tekgn pbzs ywqgqgu eizrx ypydeku yqyjdjp dwsu zxire zcgon iggnvf\ntkioh hflkm fsjz gisjbi otikh\nccdqqm fdabbne fyd lbyqm cyzgtd puitvjz nluf hirrpxd tgxrg vvl\nhjnygbz fnu twwbp xqw pfdlt uoalyme rsd muayeol ezcq\nkubeooi bxgwoun paogjs twvwlji opsajg higbdfi aazo evmj\nsfipxe mqbkmrn plwqd zvq nmvom fyfbs nbs qkrbmmn eym kqnrmbm\nruhsp hurps mqws umm sphru\nksjs pgpxh qozg enplxbn oqzg rvjnaje sjsk\nrbwbvog mhgtgg uld twrqz rbf kpop\nlwho lohw ylhd dej lydh vsfffsm\nicljgu gluijc vthqx orynv xhvqt\nbiav elxkct mtaw nlafk snyr cbqdwim blim rtrqmc wze cxktel\nfgpeia ebkhga azlfsr bsj pipvwsd nry bayrjzl ftth ynr mfhd\nymlowur nighqgk yjv pyxf nan xamb ohm jvy owrxbg icbz\niyyt linaqu httt zyfeo udap mllq pdxo lpl djhqaou zkit llp\ndxspk yge kcqjqpz ulb hoe mfx nwayo\nrdnmmh gyqd qhxrzj dgizu lyittbv txngpdg fiu mwd ndp oks vxnxybi\neul ztpe evnz yxx iuwon rkbbsw liy mqhxt\nqahp zwn ualtk txbt cbthj xchqy pirucp povdwq\nmqwu mwww muiafa miaafu hzripx wmww\nauw hyyi ylewfi ihva jknbrry voxzooq xaos xymv qzzjw hjc\nenpb jqa ajciy cbeopfs tqrlqj ecudb gso cyjai gxoet\nyohkjj yohjjk xapawgo rtgnjj\nlnlxxn nxllnx vhjrev uoew zts smkd kynlrg\nbkblpr vgafcy alju aiyqe eebtsyu buve hdesodl pspbohw\naacmw qpndwo tcwsfqy qecnms wondpq sto\nwdsyxe edsxyw jnzruiw pfqdrhi\npfgxekl vswgxhb qyn mykn jimiatq zkcz jimiatq kaexgxm mykn\nxegwn upudt dew uqjrcl abyof hbtiko wxgne sorgno etm\nxzojs zxsjo szjox gumjtwi\ngttngkk bwdgce bhuw fgo rcbf byw\nngtzwqx ptx xodmy ctmtf oioahmm qajlhje jzilpk cvypp ijaefz\narlx slcugvm hyuo zoptsh emyr tndx rroecp tdnx xea rtkpd\nsfckdx ktyrjju ruwjtp zhqznj vncun\noqqh xpc itrdg gtrid hoqq tuo yijh ncp suvck jic\nbrrlqu twdt urblrq twtd\nbrfuh arwtkpu mzlj wdyqk\npmag dtwnva nect azld axqrwy apgm xbv gdq ienubsy andvwt\nhqb qbh gxdl mwjn cmfsmik\nyiwma utlor qxjfjsn aomlvu gxp ryj rfkdsw kuguhyi qxxpg\nifq wcvcgly jdalgzx lgcycwv rajmnqw\nlatakk yxxbw evy vey\nodkvw ojgveb jhg qwhkyoh btvu qbfot nouv owgtsi pdwbmfn pmvcv dnqbo\ntmka qqnty knz swi fyvmt ikcdu jfjzsfu dshgi cosacuj szjjuff\neanet uua fbztk bzkft\njepi hyo jgzplr jyqk zzcs iepj hfamvu bfgbz sjsnf lprgzj\nmlca ywko mtg vkfv ojka zbelq qkaujs simt kafq qtycfzo\nsqh omv llvra ecvxmtx dpnafv llvszx xzlsvl quj ufnhvod faraf fivmnl\npvxlls fzeoav ahgv uhq nodcr cohy vqisgaj jsfcyur dbohh\nztccbwk okv vok kov ywel\nxyu cmaikc jgqu ozccdzk ybn yoeq fky aetrkj eyoyvla laiu cermo\nsssnb kxly mgvaz jpffkq bysbwwu rfnkm eycp ipyd hyi wjew\nobdfqmh flkm semednj iafewg lvh uwa ciepe\nzmldp ykffe gtehz qlmvule edrtzg prund oagwto qia bvyxur\nkjok neno qbxh wqgkkt ympclso poyclsm cajgnnn\npaqili kur sfit jbqchzx bhjqzxc\nfhghm ubtaana qbn autnaab aaaunbt vmz\nexlrl hfnpq zgdwx smix nyg ogccrhj iimhhwc uhcldo oydwxp kqc jxxpycv\nwtdqjfh ialoqr zeej ipoh qtjdwhf wdhqftj\njcgug cmtvmu ynhnilj txlv uemowyu cvrool oolcvr njr cxqntdh\nuhtwtp tgnc jmmjl utiu jfxtsoz cxwqcz\nqntxl lyownp tsp tps mixyge rqfqumc bxjiry zmaj azjm\nabt bat tftvm nyjs jyns\nhzsdh pwthfvm cedg hzsdh rsxtehn owh cedg\nhcoiny aqbeme eeuigt pocpvox tiugee rwb tvgmyc ojg hgdaf\nmzlwcfc uoobo bouoo tvgvmiu evsfkm popgm evmfsk ehxvits vebxbmd qhmz jzj\nmypgg jbpx vgeb ahvjl zbm ancdzfy wytkcq\nbivscw zmzmjxu jzm fwb ujefxp jzsiskp cgx atcj sszikjp cxg nqvxga\nvvurbxp iry zlz gfnlpuy npyugfl\nfpmee mhj iul lui liu\nxjoesn ggsdc vnisnmw kyxmmv xphfq\nzcsml ngzlpy udaoab eotbv ylca bfmums izx\npdi bpyoep cofsy qazl oaovek fvfbe sotc lfdmaea smvs\nzajm bskaqhj qxyiptb bdyeuqr dqjrekn iywj\nhzhky hukvpve iqcbwju nyiwb rvutxlb hyuah urnhxg savicaw hexr ptedk\nqndji wrr sin ljogf ncrb zvt tvz\nkvfke tjpzhrl zvd doq kxyw fdgr oqd egkybdh rqpfxks nja\nescstpv ccc ryzdv gxkjuyt gkhw jxnfda awpzg csestpv\ncpcd onxeae nimbrpt zyji qnuo ktxgwbj vtjfglz skcozd zgii zgii nimbrpt\nlwq iue hfbv hgbg aeqc\nvzgbod yjkoc ckt bpiaz\neyco ecoy uzousjp faxj utu yoec\nfhqdi myd tvex bzizkcx pifcfhz fczhpif eofzv bqzd knbhbgj dok ffcizhp\nqlqlgmz hofmnc cwtk ahgnpne acn prwdh hwdrp rfofhl atavrf afkcbk\nsgl apyfr pwxzptv osuwy vmqqh soyuw lqilked oinhh\neglqdox gcxfxql ejtnwu wvho can eyu uetwnj elgdxqo atvpkk eailsnn cwosyn\nmylxhuj kbc apnllw qbmtj sqy hxtnvoe ins iyudo aagezrq nsi ikvn\nlpmzo tkdeg zilkm vdkmtf yulbdd dkfmtv\nfzrv grq zfvr ychga gqr\nvdjxx wew pdxgp cjywsc meoffrj pgpdx chxmw eizgz ruea\niaklyhx btqqik tbiqqk ynmq laxykhi qatrnsh lnmtm plz\nsfogup jtdsx tsxjd wwzkyy wzywky vgdsgr\npaupqb kyy bccklmr vopviup lctcxza yyk yky\ngduuia doek hqcr upvb szeewnu rrrdz\nlhnsaf lut kzf allu dvj tyngx zkf aqsgz rtkzzdz\nxxqj msg xxqj ezmm tmyji msg cco tain ctpel\npvcfzv rhn hlhxyu bghzzpx dlhvr hrvdl lhuxhy\nnpzhkp voghdv rvezqff hvgvdo jndf gpa wevrwpu\nfaixq aecax hxdouer yqlngzd grf wid iwd cce xnmmr\nifqwiah dib ibd dtvkwqj mpn dtwjkqv kyntq xwlv\nrwoiz dja cvv lvza kfdblq bgtwgh ongdub wggthb lvaz\nxajf eyasx rupsyqx wubjwx bsrqi ripghci sbzxp sbz dhooax\nydnv tvhwgp uvrh yryhl yxdlwa ladwxy awi mkwyn ghvpwt\nqrl vwdvwic ocbhpi bcmz dor lrq hokg gokh\nadz echnlju ebnmw twjl cfw loq fqklyyq clgqq jtgpsu wltj\nvwlgisb murtsw ldkacqv wxfcke vcqkald ldhh gsl kpzn\nitnvo lyddd saewfse spnri vtmst iblx\nqsgv qni wvqiih mneg lkpb quhbkyi\nefwaaa huu fslzwpc uuh szflwpc\nsgmj ajh vcwpcua enltaks aquooh bwoda txbuve\nvbe astgezx xqbxkdj evb bev yuuesdc fvohzq\ngpn oqxfz pbwibjw gljdbf gbldfj sis dpk iss\npha ebybvye ntxhs wcuce\nodnnywv qpcjll aslxqjm injfs vkbturz atxi\nzzncfj kbhk jzzvnwf kqipx qkxpi rzb czfnzj\nygu vqpnxkw trdtv rrte\nhrutley ljxuuq yonbpmk hmpc etyrhlu\nodxp fpvizzx dxop jjbr skhxq mpzawhe zptdxuu erxk adbbuk zfzipvx\nqjovasi yutjpg rcp bykpctm fqmmg pckbymt hqj\nssqc cype tkowxb fbh rsluu zjk scrukwv pkuexk qlgjtdq oulrke\nbkcd nnf hdj sdlweyr uyf kmvzq\nsgeg moy png blv bblree ufe uqknuqd lnjwbh\nsnpex hrbcfok pffv cwrvhcs fpk uprhn gbpy zkxyi esug ccnnj\nbmwue dugcrdu uifiy clid rdmodec jodp hti xptj tpopl vuwhdyi hnoq\ncwlkg qsz nnp lfyk pwn dpe oeuzp jusxxkq qlnchc\ntsmkvge pxauyc cxypua boi hybq rzf iioyi rtedkc gjmk iob mqb\ncvip wgbjhe ulwg jckkwd gdu bmaoisp\ndrpl xbliszf rpld ngnvgxl xnrd xsmd oetrcmn xvfohp mtocren\nhabmf dmfxq qitw xxtybla cxvb colcvpj sowoeuh bhmfa plccvjo naftjgw\ncix soo icx ahx cdrjyxe htcnp\nacoksaf cgahlg tdj euchwnj bdn lunouq aewrk uktre kklwqy lnouuq\nibsel hwjbah vxuk bjxa dvzbpq tffqvo bjax qfoftv\niynms tzv jakuuw cmz cjnyr ddibtd gcb\ntmgerk pvwizc lxoma ergmtk xmg loaxm\najazon yjwt viyemnk wobzwwm jcucn nopymyq znaajo qcjtmlq ccjun ywvt oqczod\nkdhgnv kdnvgh rpyrxx xpyrxr\nqftmshx hrbr kcggxw jwtuk qxbzkn\nddi fjekwxs xxua cmmkrso\nptrsv favvfh innnnx nninnx\nkzsnd pnf evtazgw wmjk gvxp bslajo\nnphqtka umlxu ymw whqiab whqiab vwigkz pevtps\nvhje cnu uzfzum rwucy mxr wyrdqfi gnkuwz dkrwc otfc vbfc\nubtzio vlijsst anruj qyntadb fnic klz ywqq fnic vlijsst\nrprj ybyqawb tgeieih nzcr rjpr bjfpozh tpevsx flvjdq\nkvqqzvm cfdm wzjmkq sbcfx vzmkvqq\nzqtt elpg eglp uoe glep\nlqv madhtch xevl fal ijmx chcpra lzl afl cndbvnq\nyjx jyx xjy otwklfj\ncur egsdzaz ocbx wvky coxb pgiysbh lclhvy gfu oxbc vqyjvhh\ngtd pytdaz kecsku nkiud ytt bmgobx tyt pfleji ebqlifv lqp ytzadp\nbopfdvy eovszvw krgu jhuhyqi kaczafr krgu zlfxtl\nyixprs zqai oprgw vcsjoc pgorw ypx ijo urjcjqv\nestg oqnhw xgwajp mpbsag ibzi\nzggbt jmmtkru sye ybd ztggb\ntzryuqb blyxnnu sjpmf yxe zimf uyzqtbr qbyrtzu\nrzivz rxn invxqd nazw efzun bwnw ywx rfuda jhnoww mketav\nzxfw zcaqi qaciz ktefiwk xwzf\nntougl fvyaxfr obml obml bjkm lgsqj yfcggdu rqcpgt ntougl nveto\nrma dakifg pvfc ticvff iffctv difkga\nwpnt eclov vmmoqh qvw mljlvnj hxrx\nijnpo uhgxrfe xxopw xuzwyd powlpo ctduj eepw gubnepv\nrxcmve myxckxk ecid nxe xevrmc juzaonr ilkx zpb pbz mvgos yzr\nyfecm wqkh defqqa mnzgx nwe ixxg rjdhe new\nawztgx vqgnfd iwcakr ajaiwn jiwnaa uqfrim wrgbjon ufqrmi vdu yjwy gwkdc\nvrqf yzmvnr jkjji ghya pdlye ygha qlcm twmkex frqv\nhjb xgypw vtr mgj asa owcuks fnllp ommrhng senv iix\nusw iyuatv ondiwh neac ttge tzw bvjkfe neac usw\nqwehwhj idrwo vex zopkjd lrcc sfqyz smte qrfh lccr qwjhewh vlb\nefnlhsj ltm xirn nctwio cin\nzocc cpfo czoc oiz tftk\nrlzvqe inivone kptyumn eatw urjxc aetw\nqavvqa jvvc yux cvvj\nbfr fcpc xpkphcf irak bfr nuhsooj nniugf bfr gllq ipo\nekd dydxs rnmgb dek yowk\nipdll wdgx gjiigd uleiwg buvv vdhuzg gigidj gkyigmx lpdli lzyode fqdpvms\nycna rhyz bsipz lit rmc mrofb cyan mrc wujk\ntjrk cwdsvf srkdjy lsyvryj nko syjvlry fgqq srdykj pgb koh dyle\nsflcxt wmgdgej akllaoa bbsvve nsxnt nsxnt kgm akllaoa btqbez\nbzmoci agemx mdtiol pyohvf zwtx aqblx oibmcz ypcmz lfg ckssn ozx\ncuojke joekcu eusr dxqk xxwob klpsm\nbyspz lyunt eojrx ubh rjxoe ypzsb\nibok bkrtut wzcdk ppm qekhvy aupaic vswwul lmlxrv ainigy sasurbx\njeigcyc cycgjie resio ncz\nxvxr lmlaje ebmtn cvms xrvx vsmc\ncfjbffj xvo hpsbu nfm jhlsk mnf fmn\nxncxo iwuon voj aebv jks nynzl hwjwo womejo ugzmr tdfaep olpdiaf\njlnusc hgpprf nulcjs kwiwypu kitjjbj snlcju\nbuqzm kpuoxel ajlqke qqdur jecuibn leajqk qudrq usi\nahbnjf uuzecdv yfyrsxv eoqey oonue vyyrxfs jixmvao\nwjdi cfgurdl usdnlk jmao qnus cicxnux vtdxxkx nusq\nmlvfz twu unj mar qpiz fhjczpz ytl npwjys ppq koa\nippdky pvwthzj qlkhl pvwthzj\nkfm lcedomr xgdkrzo hfxyoe rafcby uwe pzjyuja weu nso erdwc fjvc\npeep oufzlb fsgn kxj uge xvufb zsnrxss lere gfsn gvwajkj fmh\nmexvi kgkktz kgkktz auyln ghvqc mexvi\nwit qxtewrk qdaz oljeb wowb suergyt hxq pfnfbei rdu qrxkwte fyw\nqjjzkd oxedeu uoxbehs zder vvjnn ocxkiz wkblzy eyzksc waiiqo fut raak\ndhojys qkusuxs kzicui dcsxo\nhsnexb yoz inza gqxtbc rya jqfe ufzlqva\nscpquf gbloz ceol eclo qpvzavo rwfnxa\njyg edqf vdpsihl edqf\nmbyjg yjgbm mgybj mhgi grw\nler oxssrel jhw jwh sfa hdhlo gng auzoan\nhmkuis iaxf muhisk ikshum\neodbpo prajasi zsu hyb npr tbcntup uzs bxchne\nzpyr kxmvz frlzwnb tzqrw vdh ndbwqmu cadwsv adq bzfnrwl qfgf\ndybnn dmarc mknr fovokgj ukrp cuwag\nkhweq eljs rllijp pizevm lwws kehqw mkjcu otqodz\nfvsrb kzbjbcc kzbjbcc mee dhyedb kzbjbcc\ncnlmjd dvnd vhlvsa rsrtc scrrt tqhx vke jqmxpd udkjqc qxriw pfqpk\ntyureg urteyg rutyge rmoihs\npccxeak tkmyane qqggpr tbdmpi ieb\nwjucbi wjm hais pcxjd kkzh qns hmf mhf mnsv ifigsc\nlqeyr pnopcig cpgoinp pncpigo mjfkjus cko zedvvyq\nofsnspv goj wqm ynolb qczly brl lrupzg buof zladwte\nxzn zxn yaseulw qwhxb easyluw vvlmh\naiybip ydfczwh wkl rjsu xreokl qov mko pna fkfu\nzjlwozs nxke ozwlzjs jybx jpsxp qtkll idsrad savpoe\nxph lpvkmvy afq uqhg qqjgm smg tmhem mxdyqx bvhot lpvmkyv\njxkkzil pkjheow fewr ggbfy fuol cuzud wnx fxujfwh srjsmic\nlzbjx vfx sncis xuv unoa nlgs stdhf oibxsgk uhogsb\nhfqzkms bzyfnz npcd yhfdo myqukug pjq adle sqkfhmz\nczhainb iazcnhb hhaqr cyrwj zzow luuvt zdyhnh uppysr\nfyw dulbxa drewqsr tldlaac kyaw datclal ylplup hdzbj\nkiiv tly gua lfg\ngphbvwc lqdd jqja ffpkz hafal eiapksw wsikpea vphgbcw lkcpm zjxcx\nviapp rxt vdgbm ezphp pcqr bll mklgx epzhp\nfavz bwmczgg zoyns pens wpgi mrwxel\nozwjjn kbzaozc cuaa igbfyq swi uypx bczaozk pyux odvawqx\nnpnpw nwppn egnpj fkzh wppnn\nasu mlqmwa npewa cjluw qmalmw newpa fznx dzypi yiy\nhleh usw bgmgscg cqc fijfuw idtyh cgmsbgg zjhr wus hymbju\ntmre fvm cgowgb eduyfla ttez vdzp vtmtaog ezxsfi gyxgzi pvzd\nacvarlu hkmfzdg jsnil hpv wjj rljpk pygl wjhhohk rkplj spvgx psgvx\nwyz rvuobq kbmhaf bec bec\nzosyz psuo lgihdo mjtftk fjkttm ddmcd\npqm qpswpb opviwxg ppqsbw waco jpx\nyzgumgq kqv hqjghnl jixhoyg ufer kvq lzi rojm gbhvsd urd tuy\nsxc jndqc ozpex wkchpu tmwv utcxzd piecpma cmppeia\nifjc lttj tltj rxmgxqa jcif lzhxkg zqb mdq kbjavv\nisyxn zjbj uiw avziqxf zpezazx iuw\nrjaudu amtpuk gufogys xiqs\ngau sndrkv cmiolti cdxm ikkcisu xusnfbp jxffy ffcizj psye sgd\nmvx onzmy oynzm mwfgvs\nmrdg roanty dljs jlil gzcj dqitnfb gxb vzzqf ooweeh pgs oyntra\nyna xgok fvbdl xgko udqp sorfo hmhl yan\nkycl ule blupejp kycl fhpkoe pqkptw cfzpv nkncl\nsnugkyw zfdbsfs aehb olq kkoi xpsvy jqcspf lajjyu jtm\nhifhfa mii clukcbc fhhifa wcts tgai vvqsyr kclcbcu\nordjftj dokk hdhytwc fjodrtj ojrjfdt san ajxrwy ked jfrqc\neylx cohd biswq xgiibz gzcptbf eylx icunv bfg jqanbv rntp sbfkiey\nkub gdpbdms qnnto bit visqop\ntywk clicj daics cbuewkx yyjjjka vxzk afsdyqg\nbmxzll wqjnyr mxlzbl yutkaa qmpz hiqkf lqqqle jagj qlqelq\njgdeatg qubj jsu bhgbm swmgy lwgnuh qjbu dqwiikp mgwys\nryisldg asrrhz vxvrnk ibjr kebyx dwbx qdrpa tgakt\ndfvgzk hifan dpjdnqc ncnvf xmqjjao npjq vobt evtaety kvufds pcugx oyjo\nezionjg ioznegj cykxy igeojzn ezm\ndkv dkv vfqyl dkv dtjhrem\nxfgh brsjcdw auvq fibb gcbecl\neet qdnrymr ndqmyrr tpfqxoi kbkxw\nqhmaj maukf uygg hqmaj tfmtv irao wsari\nofoywus wxs leemkn wfko dwzqv txg qsiiiss aiiffe fadmdq zjtaovt\nfgfms oazi sam msgff qif evxca reho\ngpzhy qxh sco qeax wtabxwv sjd oev\nxsmpi wskvku xspmi smipx\nghgf tbpeun qdivuvq dump umdp khxcxtx laljpv lownp egovve\nvhmu eziabt hnz neko nkz hfmizn\nvqhb lax zzyf lxa lik jrqynr rgcos\nzjgbfzv ieufyz kjxad qxeuewx\nufl drkaac hoyic pqutop wqzdk eewabsr mqspcr ewarbse dzqkw\nbgatanj xmddwv mwlmw scgzboo myignm lkfl fsqr\nxkrx otjzfk wek dpbwk cromg fclmhg pkvw wsln\nyyqjs lifg gifl cfv lfig fycza\ndfup fkfeiqq rcmuv dly iforzi lngkjc rzifio oiifrz mlhor puwm qrthoa\nnzfaeto punt rtmlg dwdk hyig\nmds ueoyclh lxb axgea wqt wwqqglf tqw yvzji ryr dst bojf\nayoj yzj lyctgnc woxz gqltw lkzkwte wysb mjyeu hrwso\ngymmvtt lhskza lsb nhlijnt men zphurrw oftksy zxs ykerwue hnijltn iknqyz\nxuaxkc lgzeef fwb nlzzhjj lsieg qdr ews rue rdq\nxnf lljcmod kyuercp kvlvd lkvh ncn afaq\nbjytofa ltz mkyy bwt uxca somiz rhgdg keaqu ybr\naipljn qpq nilajp udgkchc dirvxg rrbmi mxfxkk kmfxkx\nsfzjemk hjsvnmb hfd hprfmvg pbhkc\ncvxi srj ucy yuc euswuns jpox\ntajlnn ivuecv fdfce rakjq bfuxirh eibde tajnln nlajtn\nndvm mlnhy bfqlzn nmdv ohto\njysyvwy xbcyt lbbm osoye swwtwa emfznci qnzc qsgk\nxcm jbqsuo xmc mtrk bojuqs\nukshrrh xhfl ooxgq vadlcrg ydva hugplg mnqbd wkyouq\nmnmqys bhws megar krgoke modxe krgoke clovh dlo\nejl qzc agxph jcn zcq zqc\njgh yhh hjg jhg\ntarm jboyg gbyjo pgalg xugzt bph mart\nyur wrrahr fnnfqu rwhrar cdq\nmukod gueg guge epalg xjkctt\nhub hbu hbzul buh sqfl\nxyrly lvpitr xfzn jjcl uvcnz dnpdyzq ifaiwe zlvzcx\nwxzsf tgd khvwp cmd mzv bsvjvjm wvhpk ublnqyz mvbjvjs peishcb\nzunmk hxpney nphxey znmku\nbfxlgur wftcw xfkf fsik xkff ffxk\nsxyjzr ugcscx uiovqx ldzhord xgxbfph ldzhord prdhg rhdhzd ugcscx\nudg drb apyjq dgyevo fuxjhg\nqshbe aigfdp wyvz xfcos wve dgfrufw dwimmb jfh wfrjbzk nwgrigr sbrpbb\nahpn xnzeof wxbv chxpcu jmso age ojsm bqonfki hqhrkw\nmfupm vvig ndqbbm jlw\nejqh ebcrytj zpiqtpp ogznd\nwkwkae odq rsrnqk nslczz hiyyhur kuw mjbuwll vduvod ryhuhiy swo tsos\nznkufyx jejrdno knr wkx ikrlly tnxtj\niizdiw iizdiw hukep rwj eaq ptm klta rwj onaz\nznb egqy qqnc igqr ikza ojgzkr xaen kurb pyckxvt wqx\npbohpw bphowp dajwdpp kotevs\nhmuvxu zdnguk jhcmj gccyxiu cxgiycu uyxcgic akxi demeff\nzjr lupzwcy puva rzj\ncdn wee iqkbhl jwxo nhl cqd mqgqf ltdfg\nphwco ggcj cggj ergpqmc kcz\naryjl wqwmkc aklktpz kptnroc mckqww\njadydt atjdyd tajdyd owswsgm\ndshqt kacoge sdqth ylobih\nkdnik knkdi dinkk xwvqa gvii\ncifbkpt zye xhwnrhm fctibpk sbn pdqry emkye kzyjpa plzkc btkfcip gcchi\nkekfr fufp dfy eqebgko obbn nuh\nzixfbus skuf bea gimbqq caubhto eba uvkovz xisfzub peukmyn\nokihcgh gazrc slee vlnwyg geviex eesl nmnvk rcbv ycupyw\ntcvlgqs wxe lusvwzy unr yzluwvs wsylvzu zkwth qdykv\nhyenkj ugao vlwgb putcepr lyeccs fqdotx burf aqew fje rfbu\nuhmnc zgnkarz gylqawm abl zimcz qbs zzmic\npxkbpn zuxlwtt rlbhegv zlxuwtt ooxpr pgjx\nleg wavgps fcplfpc xvxih ueskmi dvu wbiq nvtia pwjojw usiemk ojwwjp\nzmrpknx xrfpq avque tvoyqp\nlyposyj mckyoub sqbl olpsjyy hjafzi wmojb nvezofd\nyflxrg egi aij qvc yflxrg typbs yflxrg kliexy eqnj jqrr\ngggt sht kdajvz sht gkqwaot sht vout\nahl aucpih feig man umtchcv ceqabr tfptb\nftlywun voaorf kde ilwt hlpoe pksqxyh vpg cxo xgq fdkkl sgxhnq\nzzekhfi akb lupta sgtd qapznzf lgidsx lidsgx akgmq ettuwjq xyumf\ndxhpku lwoxpim gwb lhjmoh gxqapd ntmvc rvwwszg pvin lwoxpim coubc\nqia bxmremo rjf vaeio eqexwz wuoz sguf bsbusof xqeewz\niczzz krf hbq tsgrih mzjabrt sfnwrm djignf zwac cwaz dgc nsrfmw\nyvarsva zzpbp yai und kkbinr zlyj nyxxof ggrgu vyk eib\nnepzm yrrgr vrlhbv hykmiog natrqx jvpq nbyhe zuo grx nwl\ncfboeev hcn yfobyx cqvlo obctww xxaux ofybxy wouguq avuztl xmgqq xyofby\ntikv uvzp oxopqy reh uzvp wefka vli kied gngks vbz thfsxyt\nexxvknp pucbdyl dboto tzat qze xyinygz mhzl ubahr ekxbtk\njcz ufszbi pknsfgb ivok ijau okxolj etecn aurun zsa gbxs uryx\nypnb ousd osg mvset ipffzdn dfinfpz ltescx\ntaeoct aoetct aocett ttda fcdqnxv\nbimtlk ssax bmrifkr vfxdmq hglp rgzr zpvk zhxtq rndwy mmr arkr\nbwvdb axxbhzk nwfmbbu kzuc sahv cvas wdac acsv\nxavkwou yvx ouwkxva otbe uzr mmw atq yiy ghavd qta pqlhv\nomzht vsdsc zhtmo hmotz\neqt wtveez syift shtfnc hmckjxa apwbvn yme okdl hbihdtv hxahns eetvwz\nrokdg ndjw hprxjc viys mbcctod dbvd\nlhzb fyxf xaslmi sjd vqp grxhmfe snetfv mgivd uaknj givkdi\ngxkxl kqcdnl rna jhcuepd npiedg djcpheu huce njryw bjluhq bvedvl kqxu\nsogh uym atpzuwx vjgbe xgrvkg thgbyn mptcebt rkro\ntnpxw uxrqxd lajmsmr tnnlt vrvbf deret hkmvrs eubvkn kks hjq\nrcdoa zfja vod supip dvo\nzbxdo xglqv how mgoq jqrdou pwrminc lidi nfs xglqv lidi\nldmnp dnqn ahhr tha mvsbsfh rpm rgus faf tjash\newrdol jqhfpf rckj mrxlwj redjg bmxprx grla\nrhr jksebwa vtu skwaejb vut\nwrx iqvrjh atrt xrw vtqo tkcasd xedjh zkqrh vvhj\nowc qlzygar uajwwe obzl inxawur\ncrbtrf phvy nzipo rctbfr trrcbf\nvwuun wcfhhzo vxxjdt fbf bqtmmhs bffqcna\nwkxfxmv zmrkyh sggw whwcw zukynw\nlsdiy lnbn kblxi qfyib irfl mymrr zqbl\ngwdkeu ghn afry zxoz fary uzntlnk kee xtnop ptnox zngoran\nlgs lsg sgeseiz gsl\nerpoqpi svtnv vsogl uym amzxbs\njtmodqx yjcsfcl zosugm jrekfdw xxbdqnx fcha\nvio tlfxokx xaoq pydeiq glxsuzm honifvf maiuzsy uizsyam eco\nophcui saka qyt ltti syw\nqff qff sde ryv\neiii jazx nlehtx tnhvxl rzvsjo qkupif feypppe tefxr wdjmlc\npdrr mwuy wccd rxla drpr enbbap\npclml ubwdbz hfudj gdpujfm ovabv\nuink ffebi wdvhqzs qiympf lqxihty vnsp wdvhqzs hutxkcs lxfuos hutxkcs\nfycoaw palkpz yrkg kappzl ncjym mergg kryg\neqy npvgh ghafkro piqnogb polacs qye hnvpg\ndxyy udhmz jij tqsuic qxz erctv\nurum nmbr cgek eetmhj gxr oxgukf wzdmvi oibzt fxkoug rcrywcr rglx\njkp ofej waibl opqhmww ifnczcg jdtkbc lil isc ill mylvuv\nvqbcosk yhhsy gasmj bspx peakt cjtekw hvzo ywe qcvbosk ohzv qddt\nedq llbvsx vedyvlm gou wkecank rkgf ziyrr belgo tbz\nwbome vhzf ztk zaxiu ywjb supuf beq sxq spuuf pufus\nfemu ymkdoew kjynct aia\nyjymr orovqj aremii licw bdtnc\nuyade fbx duaye ujtvpn\nyzvp pvzgjp yofcvya gvkkoh cafyvoy mhsm okhkvg\nxuh qkaf dmi imd tzmlce mqkxj qilrc dim cadotvy\nazpqgb kyc aflgyaf laagffy kesmk jzyzaer taf bpkbzdg\nogd dbdlh dqt zaaloh\nexal vgnfx omu omepvwf szcwq snz bptite bzqyxl khmblyc sse emg\nyqcbwsn aihhf tqck tcqk wqwqy cfez xahpn\nqqbuf lil ies tqu pyxhqp mnfuk azj\nvwma rzdtgl mxbasw nwgjav mwav\nitpjfq rrgyt hralwm fqrig btwcod\nydjd kmk fvwr wrfv yvhw mkk\nxbsxub yhsj xzbuf ace xubbsx fzuxb vxk\nttsist vubpf mhwkmtx vlj hdsva kmmhtwx ukxr upfvb tbma fxsrnxl hzwufho\nwckjvz unmtev egxts ihw topvw ptowv rnihhmq\ngpdtl kcric nwg ssbs qah aarp ydsdty ngw\nlzhxbbq oktvcw xbasqe owtmwgp koa gumjie sodwrp hqsw aqh dtgsbb\nxjbyy mxfxa ogvk nqiy qyni ldqwryj niyq jjixc\nuhbul daccgva xtiz dim uhbul yjmakv yjmakv\nhuo esajup ouj oju ujo\neeeu hwvsk jfkmds okhi pogskfm itdlbll\nlpyubo dylpfb iehwug decj ntidy cuygyg lalkb iutu oxgm imnx"))

(defn phrase-to-vector [phrase]
  (str/split phrase #" "))

(defn contains-duplicate-words? [passphrase]
  (= (count (set (phrase-to-vector passphrase))) (count (phrase-to-vector passphrase))))

(defn contains-anagrams? [passphrase]
  true)

(defn -main []
  (println "Part 1: " (count (filter contains-duplicate-words? input)))
  (println "Part 2: " (count (filter #(and (contains-duplicate-words? %) (contains-anagrams? %)) input))))