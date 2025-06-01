package com.quasistr.data.languagelearning

import com.quasistr.data.models.LanguageLearningDeck

object HungarianLearningDecks {
    val decks = mapOf(
        // A1-Level Decks
        "hungarian_a1_family" to LanguageLearningDeck(
            id = "hungarian_a1_family",
            targetLanguage = "hu",
            level = "A1",
            topic = "Család",
            instruction = "Tanuld meg a családdal kapcsolatos szavakat magyarul! Mutasd be vagy írd le a családi viszonyokat",
            words = listOf(
                "az apa", "az anya", "a fiú", "a lány", "a báty", "a nővér",
                "a nagymama", "a nagypapa", "a szülők", "a gyerekek", "a család", "a férj",
                "a feleség", "a gyermek", "a nagybácsi", "a nagynéni", "az unokatestvér (fiú)", "az unokatestvér (lány)",
                "a férj", "a feleség", "a testvérek", "a nagyszülők", "az unokaöcs", "az unokahúg",
                "a rokonok", "házas", "nőtlen", "elvált", "egyszülős", "mostohaapa",
                "mostohaanya", "mostohabáty", "mostohanővér", "öviphőn", "öviphnő",
                "nagybácsi (férj)", "nagynéni (feleség)", "az unoka", "az unokahúg", "a dédapának", "a dédmama",
                "a nevelt gyermek", "a nevelőszülők", "a keresztanya", "a keresztapa"
            )
        ),

        "hungarian_a1_colors" to LanguageLearningDeck(
            id = "hungarian_a1_colors",
            targetLanguage = "hu",
            level = "A1",
            topic = "Színek",
            words = listOf(
                "piros", "kék", "zöld", "sárga", "fekete", "fehér", "narancssárga", "lila", "rózsaszín", "barna",
                "szürke", "tarka", "világos", "sötét", "a szín", "festeni", "színezni", "a piros", "a kék",
                "a zöld", "a sárga", "vöröses", "kékes", "zöldes", "sárgás", "szivárvány", "színes", "színtelen",
                "többszínű", "pasztell", "neon", "tűzpiros", "mélykék", "világoszöld", "sötétszürke", "ezüst", "arany",
                "bézs", "türkiz", "ibolya", "mentazöld"
            )
        ),

        "hungarian_a1_numbers" to LanguageLearningDeck(
            id = "hungarian_a1_numbers",
            targetLanguage = "hu",
            level = "A1",
            topic = "Számok",
            words = listOf(
                "nulla", "egy", "kettő", "három", "négy", "öt", "hat", "hét", "nyolc", "kilenc",
                "tíz", "tizenegy", "tizenkettő", "tizenhárom", "tizennégy", "tizenöt", "tizenhat", "tizenhét",
                "tizennyolc", "tizenkilenc", "húsz", "huszonegy", "huszonkettő", "harminc", "negyven",
                "ötven", "hatvan", "hetven", "nyolcvan", "kilencven", "száz", "kétszáz", "háromszáz",
                "ezer", "kétezer", "harminc (ismételt)", "negyven (ismételt)", "ötven (ismételt)", "hatvan (ismételt)",
                "hetven (ismételt)", "nyolcvan (ismételt)", "kilencven (ismételt)", "százezer", "millió"
            )
        ),

        "hungarian_a1_greetings" to LanguageLearningDeck(
            id = "hungarian_a1_greetings",
            targetLanguage = "hu",
            level = "A1",
            topic = "Köszönések & Alapvető Kifejezések",
            words = listOf(
                "Szia", "Jó reggelt", "Jó napot", "Jó estét", "Jó éjszakát", "Viszlát", "Viszontlátásra",
                "Később találkozunk", "Holnap találkozunk", "Kérem", "Köszönöm", "Nagyon köszönöm", "Elnézést",
                "Sajnálom", "Igen", "Nem", "Talán", "Hogy vagy?", "Jól, köszönöm", "És te?", "Jól vagyok",
                "Szívesen", "Semmi gond", "Rendben", "Örülök, hogy megismertelek", "A nevem...",
                "Nagyon örvendek", "Üdvözöllek", "Szívesen látnak", "Szép napot kívánok", "Jó szórakozást",
                "Kellemes utat", "Vigyázz magadra", "Egészségedre (koccintáskor)", "Boldog karácsonyt",
                "Boldog új évet", "Sok szerencsét", "Gratulálok"
            )
        ),

        "hungarian_a1_days_months" to LanguageLearningDeck(
            id = "hungarian_a1_days_months",
            targetLanguage = "hu",
            level = "A1",
            topic = "Napok & Hónapok",
            words = listOf(
                "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap",
                "január", "február", "március", "április", "májusi", "június", "július", "augusztus",
                "szeptember", "október", "november", "december", "tegnap", "ma", "holnap", "holnapután",
                "tegnapelőtt", "hét", "hónap", "év", "dátum", "időpont", "másodperc", "perc", "óra",
                "tavasz", "nyár", "ősz", "tél", "hétvége", "munkanap", "ünnepnap", "születésnap",
                "születési dátum", "naptár", "évszak"
            )
        ),

        "hungarian_a1_clothing" to LanguageLearningDeck(
            id = "hungarian_a1_clothing",
            targetLanguage = "hu",
            level = "A1",
            topic = "Ruházat",
            words = listOf(
                "az ing", "a nadrág", "a szoknya", "a ruha", "a dzseki", "a kabát", "a cipő",
                "a csizma", "a zokni", "a kalap", "a sapka", "a sál", "a kesztyű",
                "a blúz", "a pulóver", "a póló", "a farmer", "a öltöny", "a nyakkendő",
                "az öv", "az alsónemű", "a melltartó", "a zokni (ismételt)", "a cipő (ismételt)",
                "a szandál", "a harisnya", "a rövidnadrág", "a fürdőnadrág", "a fürdőruha", "a pizsama",
                "a hálóruha", "az alsógatya", "a dzseki (ismételt)", "az esőkabát", "a parka",
                "a tréningnadrág", "a tréningfelső", "a sportruházat", "a hátizsák", "a táska", "a pénztárca",
                "a sapka (ismételt)", "a kesztyű (ismételt)", "a szemüveg"
            )
        ),

        "hungarian_a1_animals" to LanguageLearningDeck(
            id = "hungarian_a1_animals",
            targetLanguage = "hu",
            level = "A1",
            topic = "Állatok",
            words = listOf(
                "a kutya", "a macska", "a madár", "a hal", "a ló", "a tehén", "a sertés",
                "a juh", "a kecske", "a nyúl", "az egér", "a patkány", "az elefánt", "az oroszlán",
                "a tigris", "a medve", "a majom", "a nyúl (ismételt)", "a krokodil", "a béka",
                "a kígyó", "a teknős", "a madár (ismételt)", "a nyúl (ismételt)", "a légy",
                "a méh", "a hangya", "a hőlégballon", "a madár (ismételt)", "a zsiráf", "a zebra",
                "az orrszarvú", "az orrszarvú (ismételt)", "a róka", "a farkas", "a szarvas",
                "az őz", "a kacsa", "a liba", "a hattyú", "a galamb", "a veréb", "a bagoly", "a denevér"
            )
        ),

        "hungarian_a1_bodyparts" to LanguageLearningDeck(
            id = "hungarian_a1_bodyparts",
            targetLanguage = "hu",
            level = "A1",
            topic = "Testtájak",
            words = listOf(
                "a fej", "az arc", "a szem", "a fül", "az orr", "a száj", "a fog",
                "a nyak", "a váll", "a kar", "a könyök", "a kéz", "az ujj", "a hüvelykujj",
                "a mellkas", "a hát", "a has", "a láb", "a lábujj", "a comb", "a térd",
                "a boka", "a hát (ismételt)", "a szív", "a tüdő", "a gyomor", "a máj",
                "a vese", "az agy", "a bőr", "a haj", "a lábujj (ismételt)", "a könyök (ismételt)",
                "a váll (ismételt)", "a derék", "a csípő", "az arc (ismételt)", "az áll", "a homlok"
            )
        ),

        "hungarian_a1_common_verbs" to LanguageLearningDeck(
            id = "hungarian_a1_common_verbs",
            targetLanguage = "hu",
            level = "A1",
            topic = "Gyakori Igék",
            words = listOf(
                "lenni", "birtokolni", "menni", "jönni", "látni", "hallani", "beszélni", "enni", "inni",
                "lakni", "élni", "aludni", "vezetni", "futni", "dolgozni", "játszani", "olvasni",
                "írni", "venni", "eladni", "adni", "venni (ismételt)", "csinálni", "találni",
                "elveszíteni", "gondolni", "hinni", "tudni", "érteni", "tanulni", "tanulni (ismételt)",
                "segíteni", "várni", "szükségelni", "kedvelni", "szeretni", "akarni", "tud (képes)",
                "szabad", "kell", "kell (ismételt)", "akarni (ismételt)"
            )
        ),

        "hungarian_a1_prepositions" to LanguageLearningDeck(
            id = "hungarian_a1_prepositions",
            targetLanguage = "hu",
            level = "A1",
            topic = "Elöljárószók",
            words = listOf(
                "ban/ben", "ra/re", "alatt", "fölött", "mellett", "között", "mögött", "előtt", "nál/nél", "nál/nél (ismétlés)",
                "val/vel", "nélkül", "ért", "ellen", "körül", "ig", "után", "tól/től", "ból/ből", "óta",
                "keresztül", "ellenére", "alatt (ismételt)", "miatt", "belül", "kívül", "hosszan", "szemben",
                "vagy ... vagy", "is ... is", "sem ... sem", "helyett", "helyettesítve", "érdekében", "függetlenül",
                "ellentétesen", "szerint", "rendelkezés szerint", "következtében", "hiányában", "segítségével",
                "következtében"
            )
        ),

        "hungarian_a1_adjectives_basic" to LanguageLearningDeck(
            id = "hungarian_a1_adjectives_basic",
            targetLanguage = "hu",
            level = "A1",
            topic = "Alapvető Melléknevek",
            words = listOf(
                "jó", "rossz", "nagy", "kicsi", "lassú", "gyors", "hideg", "meleg", "langyos",
                "hűvös", "nehéz", "könnyű", "idős", "fiatal", "új", "régi", "drága", "olcsó",
                "szép", "csúnya", "hangos", "csendes", "erős", "gyenge", "világos", "sötét",
                "kerek", "szögletes", "sima", "érdes", "tiszta", "piszkos", "barátságos", "barátságtalan",
                "boldog", "szomorú", "érdekes", "unalmas", "éhes", "szomjas", "fáradt", "egészséges",
                "beteg", "gazdag", "szegény"
            )
        ),

        "hungarian_a2_food" to LanguageLearningDeck(
            id = "hungarian_a2_food",
            targetLanguage = "hu",
            level = "A2",
            topic = "Étel",
            words = listOf(
                "kenyér", "sajt", "felvágott", "hús", "zöldség", "alma",
                "tej", "víz", "kávé", "tea", "sör", "bor", "vaj",
                "tojás", "hal", "csirke", "krumpli", "paradicsom", "hagyma", "saláta",
                "leves", "tészta", "rizs", "gyümölcs", "banán", "narancs", "csokoládé",
                "torta", "fagylalt", "cukor", "só", "bors", "édes", "savanyú",
                "sós", "keserű", "fűszeres", "zsíros", "egészséges", "egészségtelen",
                "tengeri gyümölcsök", "bab", "burgonya (válogatott)", "paprika", "répa",
                "cukkini", "padlizsán"
            )
        ),

        "hungarian_a2_travel" to LanguageLearningDeck(
            id = "hungarian_a2_travel",
            targetLanguage = "hu",
            level = "A2",
            topic = "Utazás",
            words = listOf(
                "az utazás", "a nyaralás", "a repülő", "a pályaudvar", "a vonat", "a busz",
                "az autó", "a taxi", "a metró", "a jegy", "a szálloda", "az ifjúsági szállás",
                "a foglalás", "a poggyász", "a bőrönd", "a hátizsák", "a menetjegy", "az útlevél",
                "az érkezés", "az indulás", "a késés", "az elutazás", "az odaút", "a vízum",
                "az útlevél (ismételt)", "a határellenőrzés", "a biztonsági ellenőrzés", "a vám",
                "az útvonal", "az idegenvezető", "a látványosság", "a múzeum", "a galéria",
                "a strand", "a város", "ország", "a turizmus", "a légitársaság", "a becsekkolás",
                "a kijelentkezés", "a kétágyas szoba", "az egyágyas szoba", "a lift", "a recepció",
                "a reggeli", "félpanzió", "teljes ellátás"
            )
        ),

        "hungarian_a2_directions" to LanguageLearningDeck(
            id = "hungarian_a2_directions",
            targetLanguage = "hu",
            level = "A2",
            topic = "Irányok & Közlekedés",
            words = listOf(
                "balra", "jobbra", "egyenesen", "fel", "le", "felett", "alatt",
                "mellett", "között", "szemben", "a kereszteződés", "a lámpa", "az utca",
                "az út", "az elágazás", "a bejárat", "a kijárat", "a körforgalom", "a híd",
                "alagút", "járda", "megálló", "állomás", "tábla", "forgalom", "út",
                "autópálya", "főútvonal", "egysávos út", "gyors út", "benzinkút",
                "műhely", "parkoló", "órás parkoló", "jegy", "díj", "dugó",
                "rövidítés", "kerülőút", "térkép", "iránytű", "irány", "tájékozódás",
                "távolság", "kilométer", "mérföld", "a kereszteződés (ismételt)"
            )
        ),

        "hungarian_a2_health" to LanguageLearningDeck(
            id = "hungarian_a2_health",
            targetLanguage = "hu",
            level = "A2",
            topic = "Egészség & Test",
            words = listOf(
                "orvos", "orvosnő", "klinika", "kórház", "rendelő", "gyógyszertár",
                "gyógyszer", "tabletta", "injekció", "oltás", "betegség", "influenza",
                "köhögés", "nátha", "láz", "fájdalom", "fájdalmak", "sérülés",
                "seb", "kötés", "műtét", "kezelés", "vizsgálat", "diagnózis",
                "terápia", "beteg", "betegnő", "fogorvos", "fogfájás", "vérvizsgálat",
                "vérnyomás", "pulzus", "légzés", "lazítás", "táplálkozás", "diéta",
                "mozgás", "sport", "edzés", "fitneszterem", "edző", "gyakorlat",
                "pihenés", "rehabilitáció", "megelőző vizsgálat", "táppénz", "egészség"
            )
        ),

        "hungarian_a2_housing" to LanguageLearningDeck(
            id = "hungarian_a2_housing",
            targetLanguage = "hu",
            level = "A2",
            topic = "Lakhatás & Otthon",
            words = listOf(
                "ház", "lakás", "szoba", "konyha", "fürdőszoba", "hálószoba",
                "nappali", "erkély", "kert", "terasz", "garázs", "pince",
                "padlás", "lépcsőház", "folyosó", "ajó", "ablak", "fal",
                "padló", "mennyezet", "asztal", "szék", "ágy", "szekrény",
                "íróasztal", "hűtő", "tűzhely", "fűtés", "klíma", "lámpa",
                "konnektor", "csap", "zuhany", "fürdőkád", "WC", "mosdó",
                "mosogató", "tűzhely (ismételt)", "mosogatógép", "mosógép",
                "szárítógép", "porszívó", "kanapé", "fotel", "szőnyeg",
                "tükör", "könyvespolc"
            )
        ),

        "hungarian_a2_time" to LanguageLearningDeck(
            id = "hungarian_a2_time",
            targetLanguage = "hu",
            level = "A2",
            topic = "Idő Kifejezések",
            words = listOf(
                "óra", "perc", "másodperc", "nap", "hét", "hónap", "év",
                "évszázad", "reggel", "délelőtt", "dél", "délután", "este",
                "éjjel", "ma", "tegnap", "holnap", "holnapután", "tegnapelőtt",
                "most", "hamarosan", "később", "azonnal", "rögtön", "jelen", "távol",
                "pontosan", "késve", "korán", "korábban", "későn", "mindig",
                "soha", "néha", "gyakran", "ritkán", "alkalmanként", "még mindig",
                "már", "még", "meddig?", "mióta?", "mennyi ideig?", "alatt", "előtt",
                "után", "heti", "havi", "éves", "napi"
            )
        ),

        "hungarian_a2_weather" to LanguageLearningDeck(
            id = "hungarian_a2_weather",
            targetLanguage = "hu",
            level = "A2",
            topic = "Időjárás",
            words = listOf(
                "időjárás", "nap", "felhő", "eső", "hó", "hideg", "meleg",
                "szél", "vihar", "köd", "fagy", "jégeső", "dörgés", "villám",
                "hőmérséklet", "időjárás-jelentés", "meteorológiai állomás", "légnyomás",
                "páratartalom", "napsütés", "esernyő", "esőkabát", "kabát", "időjárás térkép",
                "órási előrejelzés", "szivárvány", "hurrikán", "szellő", "zivatar",
                "aszály", "árvíz", "szökőár", "délelőtt", "délután", "reggel",
                "tiszta", "felhős", "esős", "viharos", "napos", "havazik", "fagy",
                "olvad", "30 °C felett", "0 °C alatt"
            )
        ),

        "hungarian_a2_shopping" to LanguageLearningDeck(
            id = "hungarian_a2_shopping",
            targetLanguage = "hu",
            level = "A2",
            topic = "Vásárlás & Pénz",
            words = listOf(
                "bolt", "bevásárlóközpont", "piac", "ár", "költség",
                "kedvezmény", "pénztár", "blokk", "akció", "kereslet",
                "eladó", "eladónő", "vásárló", "vásárlónő", "árú", "termék",
                "márka", "méret", "szín", "próbafülke", "bevásárlókocsi",
                "bevásárlótáska", "pénztárca", "érme", "bankjegy", "hitelkártya",
                "bankkártya", "utalvány", "jegyzet", "ingyenes", "drága",
                "olcsó", "kifizethető", "felbecsülhetetlen", "számla", "díj",
                "összeg", "egyenleg", "költségvetés", "hitelképesség",
                "adósság", "befektetés", "hozam"
            )
        ),

        "hungarian_a2_emotions" to LanguageLearningDeck(
            id = "hungarian_a2_emotions",
            targetLanguage = "hu",
            level = "A2",
            topic = "Érzelmek & Érzések",
            words = listOf(
                "boldog", "szomorú", "dühös", "mérges", "aggódó", "félelemben", "lazult",
                "stresszes", "izgatott", "unalmas", "érdeklődő", "elégedett", "elégedetlen",
                "reményteljes", "kétségbeesett", "büszke", "szégyenkező", "bűntudatos",
                "kíváncsi", "féltékeny", "félénk", "magabiztos", "barátságos", "barátságtalan",
                "türelmes", "türelmetlen", "hálás", "hálátlan", "együttérző", "empatikus",
                "szimpatikus", "ingerlékeny", "motivált", "demotivált", "optimizmus", "pesszimizmus",
                "lemondó", "szenvedélyes", "közönyös", "gyengéd", "keserű", "eufórikus",
                "melankolikus", "meglepett", "paranoid", "távolságtartó", "kapcsolódó", "szerető",
                "veszélyes"
            )
        ),

        "hungarian_a2_transport" to LanguageLearningDeck(
            id = "hungarian_a2_transport",
            targetLanguage = "hu",
            level = "A2",
            topic = "Közlekedés & Járművek",
            words = listOf(
                "autóbusz", "vasút", "kerékpár", "autó", "taxi", "sofőr",
                "sofőrnő", "mozdonyvezető", "menetrend", "utajegy automata",
                "jegy", "bérlet", "megálló", "pályaudvar", "repülőtér",
                "repülőgép", "pilóta", "pilóta (nő)", "légiutaskísérő",
                "utas", "bőrönd", "szalag", "futópálya", "kapu", "repülőjegy",
                "beszállókártya", "poggyász", "hátizsák", "navigáció", "kormány",
                "gázpedál", "fékm pedal", "kuplung", "sebességváltó", "motor",
                "jármű", "gumi", "autópálya", "közút", "forgalom", "közlekedési eszközök",
                "parkoló", "mélygarázs", "benzinkút", "dízel", "benzin", "e-roll­er",
                "robogó"
            )
        ),

        // B1-Level Decks
        "hungarian_b1_work_career" to LanguageLearningDeck(
            id = "hungarian_b1_work_career",
            targetLanguage = "hu",
            level = "B1",
            topic = "Munka & Karrier",
            words = listOf(
                "foglalkozás", "karrier", "előléptetés", "felmondás", "munkanélküliség",
                "önéletrajz", "állásinterjú", "pályázat", "képzettség", "továbbképzés",
                "gyakorlat", "kolléga", "kolléganő", "felettes", "munkarend",
                "műszakos munka", "részmunkaidő", "teljes munkaidő", "fizetés", "bérezés",
                "társadalombiztosítás", "nyugdíj", "nyugellátás", "adóbevallás", "adóbevallás (ismétlés)",
                "üzemi megállapodás", "szakszervezet", "munkakörülmények", "felelősség",
                "munkavégzés igazolása", "munkaerő", "ágazat", "vállalat", "telephely",
                "központ", "vezetés", "menedzsment", "felelősség (ismételt)", "továbbképzési kurzus",
                "közmunka", "munkaszerződés", "munkáltató", "munkavállaló",
                "csapatmunka", "projektvezetés", "bérszámfejtés", "munkateher",
                "felmondási idő"
            )
        ),

        "hungarian_b1_travel_tourism" to LanguageLearningDeck(
            id = "hungarian_b1_travel_tourism",
            targetLanguage = "hu",
            level = "B1",
            topic = "Utazás & Turizmus",
            words = listOf(
                "utazás", "nyaralás", "szállás", "ifjúsági szállás", "foglalás",
                "poggyász", "bőrönd", "hátizsák", "látnivaló", "utazási iroda",
                "idegenvezető", "turista", "túra", "idegenforgalmi vezető",
                "légitársaság", "becsekkolás", "kijelentkezés", "ketteságyas szoba",
                "egyágyas szoba", "félpanzió", "teljes panzió", "reggelis büfé",
                "szobadíj", "recepció", "lift", "minibár", "széf", "klímaberendezés",
                "vendégértékelés", "várostérkép", "navigációs eszköz", "útvonal",
                "poggyásztároló", "transzferszolgáltatás", "shuttle szolgáltatás",
                "itiner", "kirándulási célpontok", "útdokumentumok", "vízum",
                "útlevél", "határellenőrzés", "biztonsági ellenőrzés", "jegy",
                "bérlet", "menetinfo", "késés", "érkezés", "indulás", "kapu",
                "csomagkiadás", "duty-free bolt"
            )
        ),

        "hungarian_b1_health_body" to LanguageLearningDeck(
            id = "hungarian_b1_health_body",
            targetLanguage = "hu",
            level = "B1",
            topic = "Egészség & Test",
            words = listOf(
                "orvos", "orvosnő", "klinika", "kórház", "rendelő", "gyógyszertár",
                "gyógyszer", "tabletta", "injekció", "oltás", "kezelés", "vizsgálat",
                "diagnózis", "terápia", "vérvizsgálat", "vérnyomás", "pulzus", "szívverés",
                "tüdő", "vese", "máj", "gyomor", "bél", "agy", "idegrendszer",
                "immunrendszer", "bőr", "csontváz", "izom", "ízület", "csonttörés",
                "seb", "kötés", "műtét", "altatás", "rehabilitáció", "allergia",
                "fertőzés", "influenza", "nátha", "láz", "köhögés", "nátha (ismételt)",
                "gyulladás", "fájdalom", "fejfájás", "hányinger", "hasmenés", "egészség",
                "szűrővizsgálat", "TB biztosítás", "társadalombiztosítás"
            )
        ),

        "hungarian_b1_shopping_money" to LanguageLearningDeck(
            id = "hungarian_b1_shopping_money",
            targetLanguage = "hu",
            level = "B1",
            topic = "Vásárlás & Pénz",
            words = listOf(
                "bolt", "áruház", "bevásárlóközpont", "reklám", "kupon",
                "kedvezmény", "árengedmény", "számla", "blokk", "pénztár",
                "blokktömb", "próbafülke", "felpróbálás", "visszavétel", "csere",
                "eladó", "eladónő", "vásárló", "vásárlónő", "árukészlet",
                "választék", "minőség", "márkás", "no-name", "gyártó",
                "gyártás", "szállítás", "kiszállítás", "online vásárlás", "webshop",
                "kosár", "fizetési mód", "hitelkártya", "bankkártya", "csekk",
                "készpénz", "bankautomata", "bankfiók", "folyószámla", "megtakarítási számla",
                "átutalás", "havidíjas beszedés", "díj", "összeg", "mérleg",
                "költségvetés", "hitelminősítés", "adósság", "befektetés", "hozam"
            )
        ),

        "hungarian_b1_housing_home" to LanguageLearningDeck(
            id = "hungarian_b1_housing_home",
            targetLanguage = "hu",
            level = "B1",
            topic = "Lakhatás & Otthon",
            words = listOf(
                "ház", "lakás", "bérleti szerződés", "bérleti díj", "rezsiköltség",
                "kaució", "lakáshirdetés", "ingatlanügynök", "jutalék", "ingatlan",
                "tulajdonos", "bérlő", "bérbeadó", "társasházi lakás", "ikerház",
                "családi ház", "építés", "építési engedély", "felújítás",
                "felszereltség", "beépített konyha", "padlóburkolat", "fűtés",
                "központi fűtés", "padlófűtés", "klíma", "szellőzés", "tető",
                "homlokzat", "hőszigetelés", "napelem", "áramcsatlakozás", "elektromos hálózat",
                "vízvezeték", "vízvezeték-szerelés", "fürdőszoba", "fürdőkád", "zuhany",
                "WC", "mosógép", "szárítógép", "hűtőszekrény", "tűzhely", "sütő",
                "mosogatógép", "garázs", "parkolóhely", "kert", "terasz"
            )
        ),

        "hungarian_b1_daily_routines" to LanguageLearningDeck(
            id = "hungarian_b1_daily_routines",
            targetLanguage = "hu",
            level = "B1",
            topic = "Mindennapi Tevékenységek",
            words = listOf(
                "felkelni", "ébredni", "mosakodni", "fogat mosni", "felöltözni",
                "reggelit készíteni", "reggelizni", "dolgozni menni", "iskolába menni",
                "dolgozni", "tanulni", "szünetet tartani", "ebédelni", "visszatérni",
                "hazajönni", "vacsorát készíteni", "vacsorázni", "tévét nézni", "olvasni",
                "lefeküdni", "pihenni", "sportolni", "futni menni", "edzőterembe menni",
                "bevásárolni", "mosni", "porszívózni", "házi feladatot csinálni",
                "vendégeket fogadni", "telefonálni", "lehetőségeket megragadni",
                "időpontot egyeztetni", "a napot megtervezni", "tükörtojás", "teendők listája",
                "szokás", "hobbi"
            )
        ),

        "hungarian_b1_technology_internet" to LanguageLearningDeck(
            id = "hungarian_b1_technology_internet",
            targetLanguage = "hu",
            level = "B1",
            topic = "Technológia & Internet",
            words = listOf(
                "számítógép", "laptop", "tablet", "okostelefon", "alkalmazás",
                "szoftver", "operációs rendszer", "billentyűzet", "egér", "képernyő",
                "fájl", "mappa", "menteni", "betölteni", "letölteni", "feltölteni",
                "weboldal", "böngésző", "keresőmotor", "jelszó", "tűzfal", "hálózat",
                "router", "Wi-Fi", "internetkapcsolat", "streamelni", "felhő", "közösségi háló",
                "felhasználónév", "adatvédelem", "vírus", "vírusirtó", "adatbázis", "frissítés",
                "alkalmazás letöltése", "alkalmazás telepítése", "biztonsági mentés", "mentés helyreállítása",
                "fejlesztő", "programozás", "programozási nyelv", "forráskód", "hibaüzenet"
            )
        ),

        "hungarian_b1_environment_nature" to LanguageLearningDeck(
            id = "hungarian_b1_environment_nature",
            targetLanguage = "hu",
            level = "B1",
            topic = "Környezet & Természet",
            words = listOf(
                "környezet", "környezeti védelem", "klímaváltozás", "globális felmelegedés",
                "üvegházhatású gáz", "CO₂ kibocsátás", "megújuló energia", "napenergia",
                "szélenergia", "vízenergia", "fotovoltaika", "újrahasznosítás", "hulladék",
                "szelektív hulladékgyűjtés", "szennyezés", "levegőszennyezés", "vizek szennyezése",
                "savas eső", "esőerdő", "erdő", "óceán", "tengeri szennyezés",
                "klímavédelem", "természetvédelem", "vadvédelmi terület", "fajvédelem",
                "biodiverzitás", "megőrzés", "ökorendszer", "élőhely", "fenntarthatóság",
                "erőforrás", "újrahasznosított papír", "műanyag palack", "méhpusztulás",
                "méhraj", "élőhelyvesztés", "veszélyeztetett faj", "környezeti katasztrófa"
            )
        ),

        // B2-Level Decks
        "hungarian_b2_politics_society" to LanguageLearningDeck(
            id = "hungarian_b2_politics_society",
            targetLanguage = "hu",
            level = "B2",
            topic = "Politika & Társadalom",
            words = listOf(
                "demokrácia", "parlament", "kormány", "vezető", "ellenzék",
                "szavazás", "választás", "választási kampány", "választási eredmény", "koalíció",
                "többség", "kisebbség", "ellenzék (ismételt)", "törvényhozás", "törvény",
                "alkotmány", "szólásszabadság", "sajtószabadság", "gyülekezési szabadság",
                "tüntetés", "tiltakozás", "népszavazás", "vita", "beszéd",
                "lobbi", "lobbista", "politikai kiábrándultság", "korrupció", "botrány",
                "átláthatóság", "felelősség", "etika", "moralitás", "integráció",
                "migráció", "globalizáció", "környezetpolitika", "éghajlatváltozás",
                "fenntarthatóság", "társadalmi igazságosság", "szegénység elleni küzdelem",
                "szociális ellátórendszer", "egészségügyi reform", "oktatáspolitika",
                "munkaerőpiac", "munkanélküliségi ráta", "szakszervezet"
            )
        ),

        "hungarian_b2_business_finance" to LanguageLearningDeck(
            id = "hungarian_b2_business_finance",
            targetLanguage = "hu",
            level = "B2",
            topic = "Üzlet & Pénzügy",
            words = listOf(
                "gazdaság", "bruttó hazai termék", "infláció", "defláció",
                "recesszió", "expanzió", "export", "import", "kereskedelmi mérleg",
                "külső kereskedelmi hiány", "valuta", "euró", "dollár", "tőzsde",
                "részvény", "kötvény", "befektető", "befektető (nő)", "portfólió",
                "kockázatkezelés", "adóhivatal", "adó", "ÁFA", "személyi jövedelemadó",
                "társasági adó", "nyereség", "veszteség", "mérleg", "eredménykimutatás",
                "bérjegyzék", "munkaerőköltség", "költségvetés", "hitel", "jelzálog",
                "kamatláb", "hozam", "osztalék", "adósság", "likviditás", "csőd",
                "átstrukturálás", "fúzió", "felvásárlás", "start-up kultúra",
                "üzleti modell", "piackutatás", "ügyfélmegtartás", "értékesítés"
            )
        ),

        "hungarian_b2_education_learning" to LanguageLearningDeck(
            id = "hungarian_b2_education_learning",
            targetLanguage = "hu",
            level = "B2",
            topic = "Oktatás & Tanulás",
            words = listOf(
                "oktatás", "iskolarendszer", "egyetem", "műszaki főiskola",
                "főiskola", "tandíj", "ösztöndíj", "felvétel", "beiratkozás",
                "félév", "vizsga követelmények", "zárthelyi dolgozat", "házi feladat",
                "projektmunka", "dizertáció", "doktorandusz dolgozat", "professzor",
                "professzornő", "oktató", "oktatónő", "hallgató", "hallgatónő",
                "kolléga", "kolléganő", "órarend", "tanterv", "tananyag", "pedagógia",
                "didaktika", "módszertan", "tanulási stratégia", "önfegyelem",
                "vizsgára való felkészülés", "tanulmányi terhelés", "tanácsadás",
                "csereprogram", "Erasmus program", "szakképzés", "duális képzés",
                "továbbképzés", "képzés", "tanúsítvány", "jóváhagyás", "oklevél",
                "jegy", "értékelés", "jelenléti óra", "online kurzus", "e-learning"
            )
        ),

        "hungarian_b2_culture_literature" to LanguageLearningDeck(
            id = "hungarian_b2_culture_literature",
            targetLanguage = "hu",
            level = "B2",
            topic = "Kultúra & Irodalom",
            words = listOf(
                "irodalom", "regény", "novella", "vers", "kisregény",
                "drámaíró", "drámaírónő", "dráma", "tragédia", "vígjáték",
                "színház", "opera", "színpad", "rendezés", "szövegkönyv",
                "rendezés (tev.)", "rendező", "rendezőnő", "közönség", "kritika",
                "recenzió", "allegória", "metafora", "szimbólum", "főhős",
                "ellenség", "cselekmény", "csúcspont", "poén", "irónia",
                "szatíra", "szatíra (ismételt)", "epika", "líra", "mese", "példabeszéd",
                "esszé", "életrajz", "önéletrajz", "bestseller", "felolvasóest",
                "irodalomtörténet", "romantika", "felvilágosodás", "expresszionizmus",
                "modernizmus"
            )
        ),

        "hungarian_b2_science_research" to LanguageLearningDeck(
            id = "hungarian_b2_science_research",
            targetLanguage = "hu",
            level = "B2",
            topic = "Tudomány & Kutatás",
            words = listOf(
                "kutatás", "tudós", "tudósnő", "labor", "kísérlet", "hipotézis",
                "elmélet", "tanulmány", "adatok", "statisztika", "módszer",
                "kísérleti személy", "mintavétel", "publikáció", "tudományos folyóirat",
                "lektorálás", "felfedezés", "innováció", "fejlesztés", "technológia",
                "biológia", "kémia", "fizika", "geológia", "csillagászat", "orvostudomány",
                "genetika", "neurológia", "pszichológia", "szociológia", "antropológia",
                "etika", "kutatási projekt", "finanszírozás", "támogatás", "pályázat",
                "doktori disszertáció", "postdoktor pozíció", "professzúra", "tanszék",
                "konferencia", "előadás", "prezentáció", "együttműködés", "kooperáció",
                "folyóirat", "idézet", "eredeti cikk"
            )
        ),

        "hungarian_b2_art_music" to LanguageLearningDeck(
            id = "hungarian_b2_art_music",
            targetLanguage = "hu",
            level = "B2",
            topic = "Művészet & Zene",
            words = listOf(
                "művészet", "művész", "művésznő", "festmény", "szobor", "kiállítás",
                "galéria", "múzeum", "vászon", "festék", "ecset", "festészet",
                "fotográfia", "montázs", "kerámia", "építészet", "építész", "építészeti örökség",
                "koncert", "opera", "zenekar", "karmester", "karmester (nő)", "zongora",
                "hegedű", "gitár", "dob", "dobos", "hang", "énekes", "énekesnő",
                "kompozíció", "zeneszerző", "zeneszerzőnő", "dal", "melódia", "ritmus",
                "ütem", "harmónia", "disszonancia", "dzsessz", "klasszikus zene", "rockzene",
                "popzene", "videoklip", "hangfelvétel", "bakelit", "CD", "streaming szolgáltatás",
                "fesztivál", "előadás", "próba", "turné", "jelenet", "művészeti stílus"
            )
        ),

        "hungarian_b2_law_order" to LanguageLearningDeck(
            id = "hungarian_b2_law_order",
            targetLanguage = "hu",
            level = "B2",
            topic = "Jog & Rend",
            words = listOf(
                "törvény", "rendelet", "jogrend", "bíró", "bíró (nő)", "ügyvéd",
                "ügyvédnő", "ügyvédi iroda", "ügyfél", "ügyfél (nő)", "kereset",
                "kereset benyújtása", "tárgyalás", "ítélet", "határozat", "fellebbezés",
                "fellebbviteli bíróság", "büntetőbíróság", "ügyészség", "ügyész",
                "ügyésznő", "vádlottnak", "vádlottnő", "védelem", "védőnő", "büntető törvénykönyv",
                "polgári jog", "büntetőjog", "munkaügyi jog", "családjog", "öröklési jog",
                "bérleti jog", "szerződési jog", "szerződéses szabadság", "kártérítés",
                "kártérítési igény", "bírósági költségek", "elévülés", "közbiztonság",
                "büntetőeljárás", "börtönbüntetés", "pénzbírság", "felfüggesztett szabadságvesztés",
                "jogvita", "tanúkihallgatás", "beismerés", "tanúvallomás", "bizonyítékgyűjtés", "bizonyítási teher"
            )
        ),

        // C1-Level Decks
        "hungarian_c1_politics_society_advanced" to LanguageLearningDeck(
            id = "hungarian_c1_politics_society_advanced",
            targetLanguage = "hu",
            level = "C1",
            topic = "Politika & Társadalom (Haladó)",
            words = listOf(
                "párttárs", "koalíciós tárgyalások", "választási részvétel", "politikai legitimitás", "populizmus",
                "államfő", "alkotmánybíróság", "alapjogok", "kisebbségi jogok", "lobbizás",
                "egyenlőségi elv", "demokratizálás", "jogállamiság", "puccs", "diktatúra",
                "ellenzéki politika", "szankciós intézkedések", "háborús bűncselekmény", "emberi jogsértés",
                "emberi jogi bizottság", "államháztartás", "átláthatósági törvény", "függetlenségi nyilatkozat",
                "önrendelkezési jog", "államadósság", "gazdasági szankció", "diplomáciai csatorna",
                "küspolitika", "belpolitika", "állami látogatás", "vendéglátó kultúra", "ingatlanpiaci buborék", "növekedéspolitika",
                "társadalmi kohézió", "jövedelmi egyenlőtlenség", "szociális ellátórendszer", "menekültügyi válság",
                "menekültügyi eljárás", "tartózkodási jog", "kivándorló", "állampolgársági igazolás", "vallásszabadság",
                "véleménypluralizmus", "sajtócenzúra", "információszabadság", "korrupcióellenes törvény",
                "pártadományozási szabály", "választási finanszírozás", "pártprogram", "választókerület", "kancellárjelölt",
                "képviselői indítvány", "törvényjavaslat", "országgyűlési zárszavazás", "szavazati jog korlátozása"
            )
        ),

        "hungarian_c1_science_technology_advanced" to LanguageLearningDeck(
            id = "hungarian_c1_science_technology_advanced",
            targetLanguage = "hu",
            level = "C1",
            topic = "Tudomány & Technológia (Haladó)",
            words = listOf(
                "kvantumfizika", "részecskegyorsító", "gravitációs hullám", "sötét anyag",
                "relativitáselmélet", "magfúzió", "géntan", "CRISPR/Cas9", "telomeráz aktivitás",
                "epigenetika", "génexpressziós profil", "őssejt kutatás", "klónozás",
                "neurotranszmisszió", "neurotudomány", "agyplaszticitás", "biokompatibilitás",
                "biomarker", "protézisvezérlés", "szerv-a-chip rendszer", "nanorobot", "nanorészecske",
                "kvantumszámítógép", "algoritmuskomplexitás", "gépi tanulás keretrendszer", "neurális hálózat",
                "mélytanulás", "adatbázis-kezelés", "kriptográfia", "blokklánc technológia",
                "dolgok internete", "kiberfizikai rendszer", "mesterséges intelligencia", "objektumfelismerés",
                "beszédfelismerés", "kiterjesztett valóság", "virtuális valóság", "augmentáció", "3D nyomtatás",
                "gyors prototípus-készítés", "robotsebészet", "bioprintelés", "bioinformatika", "klímamodellezés",
                "légkörtudomány", "adatvizualizáció", "analitikai kémia", "molekuláris diagnosztika",
                "napelem cella", "akkumulátortechnológia", "energitatárolás", "vízierőmű",
                "geotermikus energia", "fúziós energia", "űrtávcső", "műholdas kommunikáció"
            )
        ),

        "hungarian_c1_business_finance_advanced" to LanguageLearningDeck(
            id = "hungarian_c1_business_finance_advanced",
            targetLanguage = "hu",
            level = "C1",
            topic = "Üzlet & Pénzügy (Haladó)",
            words = listOf(
                "piaci kapitalizáció", "tőzsdeindex", "árfolyamkockázat", "devizakereskedelem",
                "kockázatitőke-befektetés", "vállalatértékelés", "összeolvadási és felvásárlási stratégia",
                "átvilágítás", "értékpapír-tájékoztató", "részvény-visszavásárlási program",
                "sajáttőke-arányos megtérülés", "ultragyors hatékonyság", "pénzügyi derivatíva",
                "opciós kötvény", "határidős ügylet", "swap szerződés", "küldetésnyilatkozat",
                "versenytárs-elemzés", "értéklánc", "belső ellenőrzés", "compliance irányelv",
                "vállalatirányítás", "érintetti menedzsment", "crowdfunding platform", "startup értékelés",
                "pitch deck", "növekedési stratégia", "diverzifikációs stratégia", "piaci behatolás",
                "portfólió-optimalizálás", "likviditáskezelés", "mérlegelemzés", "indikátormutatók elemzése",
                "hozamelvárás", "finanszírozási struktúra", "tőzsdéi instrumentum", "swap kamatláb",
                "inflációvédelem", "devizaswap", "rövid eladás", "eszközfedezetes kötvény", "veszteségátviteli tétel",
                "adóoptimalizáció", "osztalékstratégia", "korlátozott részvényegység", "ösztönző rendszer",
                "vezetői javadalmazás", "belső ellenőrzési rendszer", "üzletvezetési siker"
            )
        ),

        "hungarian_c1_culture_art_literature" to LanguageLearningDeck(
            id = "hungarian_c1_culture_art_literature",
            targetLanguage = "hu",
            level = "C1",
            topic = "Kultúra, Művészet & Irodalom (Haladó)",
            words = listOf(
                "expresszionizmus", "impresszionizmus", "szürrealizmus", "dadaizmus", "valóságmenekülés",
                "egzisztencializmus", "romantika", "felvilágosodás", "naturalizmus", "modernizmus",
                "posztmodern", "avantgárd", "esztétikai diskurzus", "dekonstrukció", "irodalomkritika",
                "irodalomtudomány", "narratív perspektíva", "stíluseszköz", "szimbolizmus", "allegória",
                "szatíra", "paródia", "ironizálás", "metaforahasználat", "intertextualitás",
                "álomelemzés", "pszichoanalízis", "regényépítés", "karakterfejlődés", "cselekményvezetések",
                "drámai írás", "jelenetelemzés", "rendezői koncepció", "díszletterv", "jelmeztervezés",
                "kamerahasználat", "jelenetírás", "filmkritika", "dokumentumfilm", "rövidfilmgyártás",
                "hanginstalláció", "performanszművészet", "installációs művészet", "konceptuális művészet",
                "utcai művészet", "fotóriport", "építészeti elemzés", "műemlékvédelem"
            )
        ),

        "hungarian_c1_philosophy_ethics" to LanguageLearningDeck(
            id = "hungarian_c1_philosophy_ethics",
            targetLanguage = "hu",
            level = "C1",
            topic = "Filozófia & Etika (Haladó)",
            words = listOf(
                "metafizika", "ontológia", "epistemológia", "teleológia", "egzisztencializmus",
                "fenomenológia", "hermeneutika", "dialektika", "szókratészi módszer", "kategorikus imperatívusz",
                "utilitarizmus", "pluralizmus", "relativizmus", "determináció", "indetermináció",
                "dualizmus", "monizmus", "konstruktivizmus", "idealizmus", "realizmus",
                "szkepticizmus", "deontológia", "teleologikus etika", "erényetika",
                "normatív etika", "metaetika", "igazságosságelmélet", "társadalmi szerződés", "szándéketika",
                "felelősségetika", "etikai bizottság", "lelkiismereti döntés", "erkölcsi törvény",
                "emberi méltóság", "autonómia elve", "elvetikai etika", "cselekvésindoklás",
                "filozófiai antropológia", "világnézet", "életfilozófia", "nyelvfilozófia",
                "szellemtörténet", "logikai pozitivizmus", "pragmatizmus", "filozófiai realizmus",
                "feminista etika", "környezeti etika", "bioetika", "állat-etika"
            )
        ),

        // C2-Level Decks
        "hungarian_c2_academic_research" to LanguageLearningDeck(
            id = "hungarian_c2_academic_research",
            targetLanguage = "hu",
            level = "C2",
            topic = "Akadémiai Kutatás (Szakértő)",
            words = listOf(
                "lektorálási folyamat", "kutatási támogatás", "kutatói együttműködés", "publikálási kényszer",
                "open access irányelv", "szakfolyóirat", "impact faktor", "metaanalízis", "szakértői kérdőív",
                "terepi kutatás", "laboratóriumi napló", "adatfeldolgozás", "kvalitatív kutatás", "kvantitatív kutatás",
                "longitudinális tanulmány", "keresztmetszeti tanulmány", "esettanulmány", "randomizált kontrollcsoportos vizsgálat",
                "placebohatás", "vakteszt", "kettős vakteszt", "intervenciós vizsgálat", "etikai bizottság", "anonimizálás",
                "adatvédelmi rendelet", "kutatási tervezés", "cselekvési keret", "módszertani transzfer", "interdiszciplinaritás",
                "kutatási paradigma", "hipotézispontozás", "szignifikancia szint", "konfidencia-intervallum", "I. és II. fajta hiba",
                "varianciaanalízis", "regresszióanalízis", "faktoranalízis", "klaszteranalízis", "gépi tanulás", "big data elemzés",
                "szövegelemzési technikák", "tartalomelemzés", "diszkurzusanalízis", "hermeneutikai elemzés", "reflexív validitás",
                "reliabilitási teszt", "reprodukálhatóság", "kutatási jelentés", "doktori disszertáció", "habilitációs mű",
                "helyettesítő oktatás", "szakmai konferencia", "szakmai találkozó", "poszterbemutató", "előadáskivonat", "publikációs etika"
            )
        ),

        "hungarian_c2_legal_jurisprudence" to LanguageLearningDeck(
            id = "hungarian_c2_legal_jurisprudence",
            targetLanguage = "hu",
            level = "C2",
            topic = "Jogi Tudomány (Szakértő)",
            words = listOf(
                "jogszakértői vélemény", "perközbeni költségtérítés", "büntetővédelmi képviselet", "vádirat",
                "védekező szónoklat", "ítélet indoklása", "bírói függetlenség", "tanúkihallgatás",
                "szakvélemény", "jogerősítési eljárás", "semmisségi kereset", "alkotmányjogi panasz",
                "Alkotmánybíróság", "Európai Unió Bírósága", "választottbíróság", "nemzetközi szerződés",
                "diplomáciai mentesség", "hontalansági jogkör", "nemzetközi magánjog", "nemzetközi büntetőjog",
                "emberi jogi egyezmények", "szokásjog", "tudományos gyakorlat", "társasági jog",
                "társasági szerződés", "részvénytársaság", "Betéti Társaság alapítása", "szövetkezeti jog",
                "tagi vita", "felelősségkorlátozás", "tőkenövelés", "osztalékdöntés", "cégbírósági bejegyzés",
                "versenyjogi ellenőrzés", "pénzmosás elleni jogszabály", "adatvédelmi jog", "szerzői jogi jogsértés",
                "szabadalomvitás", "védjegyjogsérelmek", "versenykorlátozás", "ÁSZF felülvizsgálat", "munkavégzési szerződés",
                "szolgáltatásnyújtás", "szerződésszegési bírság", "kártérítési igény", "felelősség kizáró záradék"
            )
        ),

        "hungarian_c2_medical_health_advanced" to LanguageLearningDeck(
            id = "hungarian_c2_medical_health_advanced",
            targetLanguage = "hu",
            level = "C2",
            topic = "Orvostudomány & Egészség (Szakértő)",
            words = listOf(
                "differenciáldiagnózis", "multimodális terápia", "antibiotikum-terápia", "fertőzésmegelőzés",
                "kórházi fertőzés", "kórházi kórokozó", "immunmoduláció", "autoimmun betegség",
                "immunterápia", "sebészeti reszekció", "minimálisan invazív műtét", "transzplantációs sebészet",
                "szervadományozási eljárás", "donor kiválasztási kritérium", "onkológiai kezelés", "kemoterápiás indikáció",
                "sugárterápia tervezés", "sugárvédelmi előírás", "palliatív medicina", "fájdalomterápia",
                "geriátriai rehabilitáció", "neonatológiai intenzív osztály", "neonatológia", "perinatológia",
                "kardiovaszkuláris beavatkozás", "stentbeültetés", "bypass-műtét", "EKG értékelés", "kardioverter-defibrillátor",
                "szívátültetés", "dialízis eljárás", "vesehelyettesítő terápia", "hemodialízis", "peritoneális dialízis",
                "endoszkópos vizsgálat", "gasztroszkópia", "orvos-beteg kommunikáció", "TB által elismert kezelések",
                "rehabilitációs protokoll", "egészség-gazdaságtan", "ellátáskutatás", "egészségügyi struktúra törvény",
                "kórházfinanszírozás", "DRG rendszer", "ápolási fokozat", "komplex ápolási tevékenység", "praxis szoftver",
                "telemedicina", "egészség-informatika", "elektronikus betegkarton", "egészségügyi alkalmazások", "orvosi etika"
            )
        ),

        "hungarian_c2_environment_sustainability" to LanguageLearningDeck(
            id = "hungarian_c2_environment_sustainability",
            targetLanguage = "hu",
            level = "C2",
            topic = "Környezet & Fenntarthatóság (Szakértő)",
            words = listOf(
                "klímavédelmi jogszabály", "üvegházhatású gázkibocsátás", "klímavédelmi politika", "szénlábnyom",
                "szénsemlegesség", "szénadó", "kibocsátási kereskedelmi rendszer", "kibocsátási engedély",
                "megújuló energia törvény", "napelemtámogatás", "szélfarm-engedélyezés", "geotermikus feltárás",
                "életciklus-elemzés", "életciklus-elemzés (ismételt)", "erőforrás-hatékonyság", "körforgásos gazdaság",
                "hulladékcsökkentési stratégia", "upcycling folyamat", "downcycling", "újrahasznosítási arány",
                "hulladéklerakó kezelés", "iszaphasznosítás", "helyettesítő anyag", "ökológiai fülke",
                "biodiverzitási stratégia", "fajvédelmi program", "rekultivációs intézkedés", "településrendezési terv",
                "természeti terület", "védett terület kezelése", "vízgyűjtő keretirányelv", "tengeri oltalom alatt álló terület",
                "környezeti hatásvizsgálat", "építési engedélyezési eljárás", "veszélyelemzés", "anyagáramlás-menedzsment",
                "fenntarthatósági tanúsítás", "környezeti ellenőrzés", "ökocímke", "vállalati társadalmi felelősségvállalás",
                "zöldmosás elleni védelem", "klímaváltozáshoz való alkalmazkodási stratégia", "katasztrófamegelőzési terv",
                "aszálykezelés", "árvízvédelmi koncepció", "tengerparti árvízvédelem", "talajsavanyodás",
                "savanyodási fok"
            )
        ),

        "hungarian_c2_economics_global_markets" to LanguageLearningDeck(
            id = "hungarian_c2_economics_global_markets",
            targetLanguage = "hu",
            level = "C2",
            topic = "Közgazdaságtan & Globális Piacok (Szakértő)",
            words = listOf(
                "világgazdasági csúcs", "WTO (Világkereskedelmi Szervezet)", "szabadkereskedelmi megállapodás",
                "kereskedelmi mérleg egyensúlytalanság", "pénzügyi válságmegelőzés", "rendszerkockázat", "bankfelügyelet",
                "tőkemegfelelési követelmény", "Bázeli III szabályozás", "makroprudenciális politika", "mennyiségi lazítás",
                "központi banki politika", "inflációs cél", "negatív kamatkörnyezet", "devizaárfolyam-ingadozás",
                "hitelkockázati modell", "hitelminősítés", "hitelesítő ügynökség", "hitelesítési fokozat",
                "alkotmányos adósságfék", "államháztartási hiány", "államkötvény", "hozamszintek", "tőkeforgalom-szabályozás",
                "devizatartalékok", "devizapiaci beavatkozás", "aranyalap", "pénzpiaci átláthatóság", "pénzügyi stabilitás",
                "gazdasági mutató", "GDP (bruttó hazai termék)", "GNI (bruttó nemzeti jövedelem)", "reálbérindex",
                "vásárlóerő-paritás", "munkanélküliségi ráta", "foglalkoztatási ráta", "jövedelemeloszlás",
                "Gini mutató", "szegénységi kockázati mutató", "szociális mobilitás", "digitalizációs offenzíva",
                "Ipar 4.0", "platformgazdaság", "megosztáson alapuló gazdaság", "közösségi finanszírozás",
                "start-up inkubátor", "kockázati tőkealap", "globális befektetési stratégia", "impact befektetés",
                "vállalatirányítási kódex", "pénzügyi oktatási kezdeményezés", "gazdasági szeminárium", "válságmenedzsment koncepció"
            )
        )
    )
}
