package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaximumWhiteTilesCoveredByACarpetTest {

    @Test
    public void test1(){
        MaximumWhiteTilesCoveredByACarpet test = new MaximumWhiteTilesCoveredByACarpet();
        Assert.assertEquals(9, test.maximumWhiteTiles(new int[][]{{1,5},{10,11},{12,18},{20,25},{30,32}}, 10));
    }

    @Test
    public void test2(){
        MaximumWhiteTilesCoveredByACarpet test = new MaximumWhiteTilesCoveredByACarpet();
        Assert.assertEquals(2, test.maximumWhiteTiles(new int[][]{{10,11},{1,1}}, 2));
    }

    @Test
    public void test3(){
        MaximumWhiteTilesCoveredByACarpet test = new MaximumWhiteTilesCoveredByACarpet();
        Assert.assertEquals(9, test.maximumWhiteTiles(new int[][]{{1,5},{7,10}}, 10));
    }

    @Test
    public void test4(){
        MaximumWhiteTilesCoveredByACarpet test = new MaximumWhiteTilesCoveredByACarpet();
        Assert.assertEquals(5476, test.maximumWhiteTiles(new int[][]{{67728,67763},{34967,35013},{57200,57202},{41922,41936},{48784,48784},{42907,42949},{59629,59634},{29316,29335},{47947,47973},{42993,43037},{42584,42615},{40205,40221},{46250,46253},{43997,44004},{48691,48741},{38240,38253},{28970,28979},{33817,33830},{62733,62761},{28284,28325},{37763,37765},{47208,47239},{44032,44036},{56777,56777},{41763,41783},{30740,30790},{62699,62720},{38842,38860},{41714,41717},{45996,46017},{51229,51255},{29369,29379},{45398,45429},{40681,40718},{51318,51356},{58973,58989},{47087,47125},{44423,44443},{65410,65420},{28651,28668},{68682,68687},{57963,58003},{39222,39226},{59486,59524},{68057,68081},{61642,61669},{46844,46869},{32193,32241},{29510,29535},{60652,60654},{65493,65531},{33247,33282},{48858,48888},{60336,60367},{47150,47199},{61436,61478},{53290,53327},{67868,67885},{58427,58455},{48927,48962},{55038,55080},{48073,48091},{65811,65848},{38182,38216},{34945,34955},{35354,35365},{43706,43743},{50224,50262},{31297,31344},{39441,39480},{66623,66661},{33645,33669},{39237,39269},{40245,40271},{53003,53039},{31573,31593},{53628,53663},{67211,67226},{61872,61888},{44265,44299},{57024,57042},{31704,31732},{41250,41294},{67399,67413},{45218,45261},{68176,68219},{67431,67479},{57396,57425},{45890,45896},{66053,66063},{32756,32774},{49869,49899},{42701,42733},{41184,41217},{54865,54887},{54009,54051},{50496,50513},{65709,65721},{51811,51825},{61529,61571},{32460,32464},{63397,63424},{42983,42991},{53465,53513},{39997,40047},{37074,37118},{35375,35376},{42027,42065},{38027,38054},{34863,34896},{47758,47773},{41631,41670},{66533,66560},{36721,36733},{57605,57649},{41910,41915},{67048,67064},{65452,65468},{28245,28268},{53620,53624},{41607,41628},{60145,60159},{30796,30827},{61339,61359},{50652,50685},{65545,65589},{67805,67853},{39634,39678},{57185,57196},{30304,30318},{27693,27710},{50197,50201},{32549,32557},{55535,55563},{60399,60441},{55275,55286},{46585,46586},{42780,42830},{64140,64184},{47824,47828},{43198,43236},{37039,37064},{55224,55235},{32374,32417},{32836,32856},{58581,58631},{67229,67246},{61401,61422},{58730,58773},{67482,67508},{48319,48336},{64553,64600},{36487,36537},{51652,51674},{66360,66402},{49573,49612},{64506,64545},{42437,42467},{65265,65280},{67694,67705},{31792,31831},{55827,55874},{58260,58293},{27839,27871},{55325,55342},{49503,49535},{29083,29101},{57493,57493},{62609,62621},{39205,39216},{47571,47619},{64816,64861},{46182,46202},{65291,65296},{51679,51703},{35813,35863},{37894,37924},{30092,30115},{39712,39751},{53219,53267},{68438,68469},{60042,60078},{56094,56118},{29398,29430},{62506,62511},{39078,39088},{31167,31200},{45519,45519},{60595,60632},{51910,51937},{49912,49945},{62937,62987},{53874,53900},{54923,54973},{28073,28109},{61501,61501},{51128,51134},{32035,32052},{31875,31899},{58345,58376},{39347,39394},{67538,67580},{61972,61985},{46535,46554},{44378,44416},{53196,53214},{64699,64727},{63307,63346},{28014,28059},{32561,32579},{36939,36958},{44653,44666},{27596,27620},{56619,56657},{38289,38318},{54364,54408},{30483,30505},{36890,36912},{45100,45114},{51738,51766},{58024,58045},{37368,37385},{28519,28521},{27921,27966},{56782,56803},{67624,67644},{37629,37663},{50357,50382},{65876,65887},{32141,32188},{38784,38801},{55494,55520},{43811,43848},{59415,59422},{68711,68715},{35205,35214},{42253,42300},{40660,40667},{55930,55974},{50108,50154},{64351,64384},{45469,45500},{33318,33366},{61601,61610},{50401,50423},{63849,63883},{61077,61077},{36832,36864},{62860,62873},{54470,54513},{66706,66715},{51609,51629},{69081,69094},{63182,63188},{48418,48468},{52641,52652},{37125,37137},{47649,47656},{38675,38703},{31941,31970},{40898,40929},{66262,66296},{64887,64906},{31488,31493},{31631,31655},{44717,44747},{35575,35611},{53374,53423},{45134,45140},{52533,52567},{67976,67977},{62232,62281},{53115,53118},{41568,41571},{43408,43422},{46671,46715},{51471,51504},{31382,31400},{68779,68798},{31933,31939},{47417,47421},{28780,28806},{64964,64975},{61899,61904},{60960,60970},{57526,57541},{45849,45880},{29864,29898},{46338,46338},{32962,32990},{42479,42480},{45163,45174},{30906,30946},{55183,55209},{35892,35935},{66920,66966},{51264,51292},{58211,58235},{58418,58419},{45039,45073},{53821,53869},{45757,45805},{55613,55643},{60827,60859},{45946,45987},{59203,59227},{29643,29674},{38099,38132},{57448,57458},{62790,62797},{65610,65627},{53691,53716},{58537,58552},{65991,66003},{41788,41812},{43504,43531},{40354,40371},{49480,49480},{32790,32804},{59425,59475},{46061,46078},{58656,58700},{31036,31073},{40520,40537},{63906,63911},{37804,37812},{52303,52339},{46633,46643},{52049,52096},{33150,33161},{62890,62926},{59675,59725},{67332,67360},{54993,55008},{55394,55444},{61781,61804},{48984,49022},{31082,31127},{40826,40872},{54531,54535},{50776,50792},{46880,46909},{32329,32362},{40081,40102},{41102,41136},{37693,37723},{68359,68400},{69015,69047},{53743,53791},{40463,40495},{43687,43694},{63769,63795},{27650,27661},{46768,46813},{34357,34404},{66831,66876},{42188,42228},{46295,46333},{28139,28173},{68267,68299},{52207,52213},{58884,58895},{62590,62591},{54195,54196},{48197,48239},{68616,68635},{41310,41360},{59098,59126},{42112,42150},{59365,59380},{39768,39783},{37201,37236},{52406,52451},{33948,33951},{57342,57377},{48005,48014},{67020,67028},{56835,56852},{52823,52859},{52601,52615},{38991,39026},{36430,36446},{57655,57705},{33097,33130},{61851,61852},{64907,64933},{36352,36373},{64325,64328},{41047,41068},{51209,51224},{56153,56171},{49704,49753},{54582,54596},{32495,32535},{29788,29788},{33990,33990},{69158,69174},{28843,28889},{43451,43498},{68322,68327},{36770,36807},{58877,58878},{41381,41402},{64748,64791},{45546,45568},{31232,31260},{41440,41482},{31529,31556},{52715,52725},{58082,58105},{44542,44565},{50021,50060},{56389,56423},{33909,33935},{52480,52487},{48109,48150},{62823,62847},{34519,34530},{45608,45618},{35238,35256},{62082,62108},{60734,60763},{38924,38967},{59876,59919},{52144,52164},{56665,56697},{28428,28462},{67264,67292},{38331,38370},{61367,61397},{35127,35156},{52036,52039},{63901,63904},{58163,58174},{60670,60704},{65920,65933},{36020,36031},{49425,49434},{65092,65126},{47705,47749},{32251,32278},{32671,32678},{49073,49106},{68481,68511},{27512,27559},{34298,34317},{54120,54153},{40579,40620},{67082,67121},{68811,68857},{43268,43271},{57064,57112},{57263,57307},{56459,56465},{29259,29262},{49209,49229},{62604,62605},{52112,52114},{55372,55391},{40421,40453},{68541,68563},{31785,31789},{44134,44143},{44852,44872},{44457,44496},{35647,35662},{36609,36649},{50559,50576},{44047,44091},{54087,54110},{62627,62673},{53939,53963},{39803,39833},{60914,60953},{37825,37846},{33706,33736},{43633,43665},{41969,42005},{46406,46449},{64284,64293},{39591,39611},{68130,68166},{59296,59327},{63677,63702},{32282,32328},{46090,46120},{56493,56505},{59245,59283},{35767,35782},{46255,46288},{43362,43371},{31410,31432},{49127,49163},{33035,33072},{28934,28967},{36058,36072},{58918,58958},{27822,27838},{38618,38639},{34780,34828},{42538,42569},{36577,36590},{65479,65491},{63841,63842},{50881,50882},{31995,32000},{34098,34102},{44195,44243},{47888,47907},{34476,34476},{57570,57571},{52366,52393},{33483,33528},{47339,47384},{50907,50956},{54284,54325},{29136,29138},{37672,37675},{52985,52994},{38403,38419},{35396,35406},{63382,63391},{34671,34689},{27758,27799},{29203,29211},{37244,37246},{56321,56367},{28215,28232},{37517,37550},{69121,69153},{45631,45664},{36146,36163},{50596,50610},{38571,38582},{53517,53548},{66761,66798},{64631,64674},{45265,45268},{55798,55824},{52934,52969},{62036,62059},{68599,68600},{34720,34735},{64241,64275},{30633,30679},{49807,49834},{37474,37483},{48033,48051},{57139,57160},{55568,55608},{56255,56301},{42336,42338},{45340,45356},{39519,39529},{35985,36015},{54650,54697},{65659,65692},{36203,36246},{30694,30726},{37944,37989},{36700,36716},{42652,42694},{66446,66494},{35414,35438},{65173,65215},{54747,54775},{36390,36405},{36267,36313},{62307,62328},{49313,49330},{39114,39159},{42856,42862},{63596,63629},{50726,50757},{52266,52300},{63264,63270},{57763,57790},{68893,68922},{52695,52701},{56946,56977},{46032,46053},{50988,51026},{30024,30073},{54599,54648},{60860,60890},{38446,38465},{55743,55751},{56516,56551},{63006,63033},{47073,47084},{53129,53165},{35056,35092},{46142,46164},{39926,39967},{42967,42969},{38485,38527},{39305,39311},{42073,42102},{37580,37580},{58457,58505},{39556,39590},{51943,51993},{31741,31766},{44305,44334},{59794,59844},{56860,56909},{33876,33894},{61229,61248},{68011,68016},{31274,31282},{38900,38913},{60179,60228},{37271,37283},{59171,59181},{60990,61011},{39271,39296},{42486,42488},{38917,38920},{28675,28710},{61672,61704},{34408,34426},{67013,67016},{50293,50327},{32872,32922},{30136,30140},{56203,56212},{37152,37181},{54822,54836},{60084,60101},{59575,59603},{46917,46966},{48643,48666},{36651,36668},{48495,48526},{45017,45035},{41531,41541},{53988,54000},{44923,44962},{64092,64113},{48829,48835},{38141,38161},{46745,46755},{60492,60499},{62415,62458},{47458,47492},{30531,30532},{46556,46556},{32470,32488},{49972,50009},{46987,47028},{29302,29307},{64430,64478},{66580,66611},{30215,30260},{60780,60799},{44987,45002},{55354,55356},{64020,64063},{32710,32724},{48280,48317},{41938,41940},{30429,30451},{54414,54435},{64210,64226},{65429,65451},{38650,38667},{34206,34248},{43911,43958},{63562,63584},{60506,60520},{65329,65378},{66309,66356},{61178,61203},{53270,53286},{61142,61158},{63230,63251},{29471,29471},{52873,52885},{40275,40308},{38603,38606},{28552,28582},{29568,29597},{35262,35309},{51861,51901},{45289,45311},{65022,65053},{46824,46827},{63379,63380},{29978,29982},{44783,44829},{34644,34661},{57712,57724},{48761,48773},{44599,44612},{47866,47874},{62878,62879},{47502,47539},{31444,31457},{55669,55697},{54273,54274},{34151,34189},{61018,61038},{65743,65777},{46479,46520},{49442,49469},{47249,47292},{44894,44911},{58819,58848},{64976,64977},{28121,28129},{32580,32584},{51553,51574},{43600,43602},{40949,40992},{44015,44022},{57840,57870},{61951,61962},{63945,63976},{68940,68989},{62118,62141},{29723,29747},{47813,47820},{57896,57929},{51384,51434},{34038,34046},{63124,63149},{34454,34469},{32601,32635},{58052,58080},{44178,44191},{63523,63548},{43056,43106},{55889,55904},{33408,33448},{43892,43907},{48575,48617},{56711,56750},{28741,28746},{57879,57893},{60539,60556},{38737,38766},{66138,66173},{49244,49287},{45693,45696},{51158,51176},{28475,28479},{62176,62213},{59761,59793},{30578,30595},{63719,63755},{67512,67531},{43308,43337},{34563,34600},{41577,41579},{65938,65950},{66195,66236},{57228,57239},{52760,52804},{50840,50859},{63071,63084},{58136,58147},{33210,33239},{30367,30392},{61744,61775},{36960,36995},{68731,68744},{28371,28407},{54912,54921},{66086,66124},{49632,49657},{33773,33778},{66675,66682},{59967,59997},{41888,41888},{69199,69231},{29833,29863},{53061,53066},{40783,40786},{40730,40736},{61267,61309},{39039,39048},{40173,40179},{51039,51083},{62543,62571},{52221,52240},{62329,62364},{61088,61138},{49765,49803},{39059,39059},{32058,32103},{35484,35524},{29924,29961},{60269,60295},{43747,43795},{40106,40125},{49375,49397},{58300,58338},{63466,63477},{33574,33616},{41000,41013},{46365,46389},{43574,43586},{30989,31023},{67918,67925},{35689,35736},{56585,56603},{29176,29200},{50469,50487},{48384,48415},{56048,56092},{53077,53112},{30951,30970},{45702,45719},{42386,42387},{30862,30898},{47910,47935},{28617,28622},{39844,39878},{29022,29043},{56245,56253},{54219,54237},{67138,67186},{43139,43170},{41850,41885},{55113,55154},{37334,37350},{36113,36134},{30178,30214},{35797,35802},{30566,30570},{37427,37430},{53586,53607},{56003,56036},{34051,34060},{59023,59070}}, 9927));
    }

    @Test
    public void test5(){
        MaximumWhiteTilesCoveredByACarpet test = new MaximumWhiteTilesCoveredByACarpet();
        Assert.assertEquals(1, test.maximumWhiteTiles(new int[][]{{3,4},{1,2}}, 1));
    }

}