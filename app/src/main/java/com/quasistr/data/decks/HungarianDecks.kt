package com.quasistr.data.decks

import com.quasistr.data.models.Deck

object HungarianDecks {
    val decks = mapOf(

        "filmek" to Deck(
            id = "filmek",
            name = "Filmek",
            category = "Szórakozás",
            words = listOf(
                "Titanic", "Eredet", "Avatar", "A keresztapa", "Ponyvaregény", "Gladiátor",
                "Mátrix", "Jurassic Park", "Csillagok háborúja", "A sötét lovag", "A remény rabjai",
                "Vissza a jövőbe", "Harry Potter", "A Gyűrűk Ura", "Bosszúállók", "Pókember",
                "Jégvarázs", "Oroszlánkirály", "Shrek", "Játékháború (Toy Story)", "Cápák",
                "Rocky", "Terminátor", "Némó nyomában", "Aladdin", "Óz, a csodák csodája",
                "Schindler listája", "A remény rabjai (The Shawshank Redemption)", "A bárányok hallgatnak",
                "Casablanca", "Kalifornia álom", "Interstellar – Az intergalaktikus utazó",
                "A tégla (The Departed)", "Paraziták", "Joker", "Mad Max – A harag útja",
                "Fekete Párduc", "Whiplash – Súlyos ütés", "A közösségi háló", "Őrzők (Guardians of the Galaxy)",
                "Egy csodálatos elme", "Tárgyalj ki okosan (Get Out)", "Logan – Farkas",
                "A visszatérő (The Revenant)", "Volt egyszer egy… Hollywood"
            )
        ),

        "színészkedés" to Deck(
            id = "színészkedés",
            name = "Színészkedés",
            category = "Általános",
            instruction = "Ne beszélj! Csak gesztusokat és testbeszédet használj",
            words = listOf(
                "Úszás", "Autóvezetés", "Tánc", "Futás", "Repülés (repülővel)",
                "Gitározás", "Billentyűzet-ütés", "Evés", "Alvás", "Sírás",
                "Nevetés", "Fogmosás", "Mászás", "Ökölvívás", "Horgászat", "Festés",
                "Síelés", "Focizás", "Olvasás", "Lovaglás", "Írás",
                "Főzés", "Mozgás", "Dalszöveg nélküli éneklés", "Kötés", "Zongorázás",
                "Fényképezés", "Borotválkozás", "Sminkelés", "Homokvár építése",
                "Zenekar dirigálása", "Zsonglőrködés", "Gördeszkázás", "Szörfözés",
                "Kertészkedés", "Varrogatás", "Hasogatás", "Sziklamászás", "Kosárlabdázás",
                "Íjászat", "Tekézés", "Fazekasság"
            )
        ),

        "állatok" to Deck(
            id = "állatok",
            name = "Állatok",
            category = "Természet",
            words = listOf(
                "Elefánt", "Tigris", "Kenguru", "Pingvin", "Sas", "Oroszlán", "Zebra", "Delfin",
                "Cápa", "Bálna", "Nyúl", "Béka", "Kígyó", "Farkas", "Medve", "Leopárd",
                "Zsiráf", "Gepárd", "Orrszarvú", "Vízi bivaly", "Teknős", "Krokodil",
                "Kajmán", "Teve", "Ló", "Bárány", "Tehén", "Kecske", "Tyúk", "Kacsa",
                "Papagáj", "Majom", "Csimpánz", "Panda", "Róka", "Mosómedve", "Bagoly",
                "Bölény", "Sas", "Sólyom", "Vidra", "Koala", "Lajhár", "Kacsacsőrű emlős",
                "Sün", "Dögkeselyű"
            )
        ),

        "országok" to Deck(
            id = "országok",
            name = "Országok",
            category = "Oktatás",
            words = listOf(
                "Németország", "Franciaország", "Japán", "Brazília", "Ausztrália", "Kanada",
                "Mexikó", "India", "Kína", "Oroszország", "Dél-Afrika", "Olaszország", "Spanyolország",
                "Portugália", "Svédország", "Norvégia", "Argentína", "Chile", "Egyiptom", "Kenia",
                "Lengyelország", "Görögország", "Izland", "Törökország", "Írország", "Hollandia",
                "Dánia", "Finnország", "Szaúd-Arábia", "Dél-Korea", "Új-Zéland", "Ukrajna",
                "Peru", "Kolumbia", "Thaiföld", "Vietnam", "Malajzia", "Indonézia",
                "Fülöp-szigetek", "Szingapúr", "Belgium", "Ausztria", "Svájc", "Csehország",
                "Magyarország", "Románia", "Marokkó", "Nigéria"
            )
        ),

        "fantasy_szereplők" to Deck(
            id = "fantasy_szereplők",
            name = "Fantasy Szereplők",
            category = "Szórakozás",
            words = listOf(
                "Gandalf", "Jon Snow", "Frodo Kóbor", "Harry Potter", "Hermione Granger",
                "Legolas", "Aslan", "Bilbó Kóbor", "Daenerys Targaryen", "Tyrion Lannister",
                "Arya Stark", "Gollam", "Merlin", "Dumbledore", "Geralt Riviából", "Cersei Lannister",
                "Aragorn", "Hagrid", "Yennefer", "Edmund Pevensie", "Luke Skywalker",
                "Leia Organa", "Darth Vader", "Yoda", "Saruman", "Sauron", "Aang",
                "Jázmin", "Elsa", "Máleficent", "Sirius Black", "Radagast", "Éowyn",
                "Thranduil", "Elrond", "Kili", "Tauriel"
            )
        ),

        "sitcom_szereplők" to Deck(
            id = "sitcom_szereplők",
            name = "Sitcom Szereplők",
            category = "Szórakozás",
            words = listOf(
                "Michael Scott", "Sheldon Cooper", "Ross Geller", "Rachel Green",
                "Chandler Bing", "Joey Tribbiani", "Phoebe Buffay", "Ted Mosby",
                "Barney Stinson", "Dwight Schrute", "Leslie Knope", "Jake Peralta",
                "Ron Swanson", "Marshall Eriksen", "Monica Geller", "Pam Beesly",
                "Jim Halpert", "Amy Farrah Fowler", "April Ludgate", "Howard Wolowitz",
                "Larry David", "Claire Dunphy", "Phil Dunphy", "Jay Pritchett",
                "Cam Tucker", "Mitch Pritchett", "Elaine Benes", "George Costanza",
                "Cosmo Kramer", "Jerry Seinfeld", "Rebecca Bunch", "Dan Conner",
                "Roseanne Conner"
            )
        ),

        "animációs_filmek" to Deck(
            id = "animációs_filmek",
            name = "Animációs Filmek",
            category = "Szórakozás",
            words = listOf(
                "Jégvarázs", "Shrek", "Toy Story", "Oroszlánkirály", "Betonfejek (Inside Out)",
                "Kung Fu Panda", "Zootropolis", "Madagascar", "Így neveld a sárkányodat",
                "Vaiana", "Coco", "Chihiro Szellemországban", "Fel!", "Ratatouille",
                "Szörny Rt.", "Szépség és a Szörnyeteg", "Mulan", "Jégkorszak", "A hihetetlen család",
                "Némó nyomában", "WALL·E", "Merida – A bátor", "Aranyhaj és a nagy gubanc",
                "Hős6os", "Verdák", "Ralph lezúzza a netet", "Gru", "Pókember: Irány a Pókháló Univerzum",
                "Kubo és a varázshúr", "Korallina"
            )
        ),

        "youtube_trendek" to Deck(
            id = "youtube_trendek",
            name = "YouTube Trendek",
            category = "Közösségi Média",
            words = listOf(
                "Unboxing videók", "Mukbang", "Tréfavideók", "Reakcióvideók", "Vlogolás",
                "Játékélő közvetítés", "ASMR", "DIY útmutatók", "Kihívásvideók", "Sminkbemutatók",
                "Életmód-tippek", "Termékértékelések", "Haul-videók", "Főzőcsatornák", "Utazós vlogok",
                "Edzésrutinfelvételek", "Technológiai bemutatók", "Napi vlogok", "Oktatóvideók", "Kérdezz-felelek videók",
                "Élő adások", "Timelapse-videók", "Stop-motion", "Storytime-videók", "Átdolgozott dalok",
                "Tánccoverek", "Animációs rövidfilmek", "Sorozat-útmutatók", "Kompilációk", "Forgatás mögötti videók"
            )
        ),

        "zenei_műfajok" to Deck(
            id = "zenei_műfajok",
            name = "Zenei Műfajok",
            category = "Zene",
            words = listOf(
                "Pop", "Rock", "Hip-Hop", "Jazz", "Klasszikus", "Reggae", "Country", "Blues",
                "EDM", "Dubstep", "R&B", "Metal", "Folk", "K-Pop", "Latin", "Ska", "Gospel",
                "Techno", "Soul", "Punk", "Grunge", "Salsa", "Flamenco", "Afrobeat", "Trance",
                "House", "Bluegrass", "Opera", "Funk", "Disco", "Emo", "Psytrance", "Drum and Bass",
                "Ambient", "Lo-fi"
            )
        ),

        "világkonyha" to Deck(
            id = "világkonyha",
            name = "Világkonyha",
            category = "Életmód",
            words = listOf(
                "Pizza", "Sushi", "Tacos", "Paella", "Curry", "Pho", "Falafel", "Gulyás",
                "Poutine", "Kimchi", "Hummusz", "Baklava", "Lasagne", "Chow Mein", "Krósszán (croissant)",
                "Pierogi", "Burrito", "Kebab", "Dim Sum", "Palacsinta (crepe)", "Biryani", "Ramen",
                "Tapas", "Bratwurst", "Moussaka", "Shakshuka", "Empanada", "Chimichanga", "Satay",
                "Jollof rizs", "Pad Thai", "Sauerbraten", "Valenciai paella"
            )
        ),

        "táji_jellemzők" to Deck(
            id = "táji_jellemzők",
            name = "Táji Jellemzők",
            category = "Természet",
            words = listOf(
                "Hegy", "Völgy", "Vízesés", "Vulkanikus hegy", "Erdő", "Sivatag", "Sziklaszurdok",
                "Sziget", "Jéghegy", "Tó", "Folyó", "Tengerpart", "Barlang", "Szirt", "Mocsár",
                "Síkság", "Domb", "Zátony", "Fennsík", "Lagúna", "Dűne", "Esőerdő", "Szavanna",
                "Mocsárvidék", "Félsziget", "Számosziget", "Gejzír", "Dél-völgy", "Vulkánóriás kráter",
                "Tengeri sziklaoszlop", "Vulkánfennsík", "Szikes síkság"
            )
        ),

        "történelmi_személyek" to Deck(
            id = "történelmi_személyek",
            name = "Történelmi Személyek",
            category = "Oktatás",
            words = listOf(
                "Albert Einstein", "Isaac Newton", "Marie Curie", "Nelson Mandela", "Kleopátra",
                "Julius Caesar", "Napóleon Bonaparte", "Martin Luther King Jr.", "Mahatma Gandhi",
                "Leonardo da Vinci", "Krisztóf Kolumbusz", "Johanna d’Arc", "Nagy Sándor",
                "Abraham Lincoln", "Winston Churchill", "Galileo Galilei", "Victoria királynő",
                "Thomas Edison", "William Shakespeare", "George Washington", "Dzsingisz kán",
                "Karl Marx", "Florence Nightingale", "Vlagyimir Iljics Lenin", "Katalin a Nagy",
                "I. Erzsébet", "Thomas Jefferson", "Simón Bolívar", "Attila hun király",
                "Szulejmán szultán", "Kleiszthenész", "Tutanhamon"
            )
        ),

        "márkák_logók" to Deck(
            id = "márkák_logók",
            name = "Márkák & Logók",
            category = "Életmód",
            words = listOf(
                "Nike", "Adidas", "Coca-Cola", "Apple", "Amazon", "Samsung", "Toyota", "Pepsi",
                "McDonald’s", "Starbucks", "Disney", "Microsoft", "Google", "Netflix", "Ferrari",
                "Gucci", "Louis Vuitton", "Rolex", "Facebook", "Lego", "Intel", "Nvidia", "Honda",
                "BMW", "Mercedes-Benz", "Puma", "H&M", "IKEA", "Dell", "Spotify", "Mastercard", "Visa"
            )
        ),

        "híres_műalkotások" to Deck(
            id = "híres_műalkotások",
            name = "Híres Műalkotások",
            category = "Kultúra",
            words = listOf(
                "Mona Lisa", "Csillagos éj", "A sikoly", "Az utolsó vacsora",
                "A gyöngyfülbevalós lány", "Amerikai gótika", "Guernica",
                "Az emlékezet kitartása", "A Vénusz születése", "Éjjeli őrjárat",
                "Whistler anyja", "A csók", "Ádám teremtése", "Vízililiomok",
                "A gondolkodó", "Las Meninas", "Az athéni iskola", "Napraforgók",
                "A szabadság vezeti a népet", "Kanagavai nagy hullám", "Arnolfini-portré",
                "A szénapadló", "Nighthawks", "A földi örömök kertje",
                "Campbell levestonain", "Ophelia", "Miloszi Vénusz", "Dávid",
                "A Medúza bárkája", "Christina világa", "A táncoló faun"
            )
        ),

        "szuperhősök" to Deck(
            id = "szuperhősök",
            name = "Szuperhősök",
            category = "Szórakozás",
            words = listOf(
                "Superman", "Batman", "Pókember", "Wonder Woman", "Vasember", "Amerika Kapitány",
                "Hulk", "Thor", "Fekete Párduc", "Villám", "Aquaman", "Zöld Lámpás",
                "Doctor Strange", "Farkasember", "Deadpool", "Fekete Özvegy", "Sólyomszem",
                "Marvel Kapitány", "Hangyaember", "Zöld Íjász", "Daredevil", "Luke Cage",
                "Jessica Jones", "Szuperlány", "Vision", "Vörös Boszorkány", "Ciklop",
                "Jean Grey", "Éjvándor", "Professor X", "Magneto", "Rogue", "Vihar"
            )
        ),

        "videójátékok" to Deck(
            id = "videójátékok",
            name = "Videójátékok",
            category = "Szórakozás",
            words = listOf(
                "Minecraft", "Fortnite", "Super Mario Bros", "The Legend of Zelda", "Tetris",
                "Pac-Man", "Grand Theft Auto", "Call of Duty", "FIFA", "Pokémon",
                "World of Warcraft", "Overwatch", "League of Legends", "Counter-Strike",
                "Final Fantasy", "A Sims", "Assassin’s Creed", "Resident Evil", "Among Us",
                "Red Dead Redemption", "Halo", "God of War", "Street Fighter", "Metal Gear Solid",
                "Doom", "Half-Life", "Portal", "Skyrim", "Fallout", "Dark Souls", "Cyberpunk 2077",
                "Animal Crossing", "Splatoon"
            )
        ),

        "könyvek_irodalom" to Deck(
            id = "könyvek_irodalom",
            name = "Könyvek & Irodalom",
            category = "Oktatás",
            words = listOf(
                "Romeó és Júlia", "Büszkeség és balítélet", "A nagy Gatsby",
                "Ne bántsátok a feketerigót", "1984", "Háború és béke", "Bűn és bűnhődés",
                "Odüsszeia", "Moby Dick", "Don Quijote", "A zabhegyező", "Szép új világ",
                "Jane Eyre", "Üvöltő szelek", "A hobbit", "Anna Karenina", "Hamlet", "Macbeth",
                "Monte Cristo grófja", "A nyomorultak", "A Karamazov testvérek",
                "Száz év magány", "Ulysses", "Bovaryné asszony", "Az isteni színjáték",
                "22-es csapdája", "Állatfarm", "Frankenstein", "A kívülálló", "Lolita",
                "A harag szőlője", "A skarlát betű", "Drakula", "A sötétség mélyén"
            )
        ),

        "sportok" to Deck(
            id = "sportok",
            name = "Sportok",
            category = "Tevékenységek",
            words = listOf(
                "Futball", "Kosárlabda", "Tenisz", "Kriki", "Röplabda", "Golf",
                "Jégkorong", "Birkózás", "Úszás", "Kerékpározás", "Síelés", "Snowboardozás",
                "Korcsolyázás", "Box", "Harcművészetek", "Judo", "Karate", "Íjászat",
                "Röplabda", "Asztalitenisz", "Torna", "Szörfözés", "Vitorlázás",
                "Atlétika", "Íjászat", "Súlyemelés", "Birkózás", "Bob", "Szánkózás",
                "BMX", "Triatlon", "Kézilabda", "Vízilabda"
            )
        ),

        "foglalkozások" to Deck(
            id = "foglalkozások",
            name = "Foglalkozások",
            category = "Oktatás",
            words = listOf(
                "Orvos", "Mérnök", "Tanár", "Művész", "Író", "Színész", "Pilóta", "Szakács",
                "Ápoló", "Rendőr", "Tűzoltó", "Fogorvos", "Tudós", "Ügyvéd", "Újságíró",
                "Vízvezeték-szerelő", "Villanyszerelő", "Építész", "Gyógyszerész", "Szerelő",
                "Állatorvos", "Fordító", "Könyvelő", "Terapeuta", "Ács", "Pék", "Gazda",
                "Fényképész", "Zenész", "Tervező", "Űrhajós", "Mentős", "Bíró", "Könyvtáros",
                "Taxi-sofőr"
            )
        ),

        "mítikus_lények" to Deck(
            id = "mítikus_lények",
            name = "Mítikus Lények",
            category = "Fantasy",
            words = listOf(
                "Sárkány", "Unikornis", "Sellő", "Griff", "Főnix", "Kentaur", "Minotaurusz",
                "Farkasember", "Vámpír", "Zombi", "Pegazus", "Szfinx", "Kiklop", "Kraken",
                "Jeti", "Goblin", "Troll", "Tündér", "Óriás", "Hidra", "Baziliszkusz",
                "Cerberus", "Hidra", "Gorgo", "Dzsinn", "Nessie", "Wendigo", "Kelpie",
                "Selkie", "Manticore", "Szatír", "Harpyia", "Banshee", "Kobold"
            )
        ),

        "találmányok" to Deck(
            id = "találmányok",
            name = "Találmányok",
            category = "Oktatás",
            words = listOf(
                "Telefon", "Izzólámpa", "Nyomdagép", "Kerék", "Iránytű", "Televízió",
                "Repülőgép", "Számítógép", "Hűtőszekrény", "Kamera", "Mikrohullámú sütő",
                "Mikroszkóp", "Teleszkóp", "Gőzgép", "Antibiotikum", "Röntgen", "Rádió",
                "Olló", "Akkumulátor", "Kerékpár", "Elektromotor", "Számológép", "GPS",
                "Internet", "Okostelefon", "SSD meghajtó", "Lézer", "3D nyomtató", "Drón",
                "MRI készülék", "Penicillin", "Sugárhajtómű", "Hyperloop"
            )
        ),

        "táncstílusok" to Deck(
            id = "táncstílusok",
            name = "Táncstílusok",
            category = "Szórakozás",
            words = listOf(
                "Balett", "Salsa", "Hip-Hop", "Tánc", "Bécsi keringő", "Breakdance",
                "Kortárs tánc", "Jazz", "Stepptánc", "Flamenco", "Standardtánc", "Swing",
                "Hasztánc", "Rumba", "Cha-Cha-Cha", "Foxtrott", "Samba", "Merengue",
                "Bollywood", "Zumba", "Popping", "Locking", "Krumping", "House", "Disco",
                "Polka", "Samba", "Lindy Hop", "Twerking", "Hula", "Kathak", "Kuchipudi",
                "Bhangra"
            )
        ),

        "fóbiák" to Deck(
            id = "fóbiák",
            name = "Fóbiák",
            category = "Pszichológia",
            words = listOf(
                "Arachnofóbia", "Akrofóbia", "Klaustrofóbia", "Agorafóbia", "Ophidiofóbia",
                "Aerofóbia", "Trypofóbia", "Akvafóbia", "Nyktofóbia", "Haemofóbia",
                "Kynofóbia", "Asztrófóbia", "Misofóbia", "Glosszofóbia", "Nekrofóbia",
                "Koulrofóbia", "Entomofóbia", "Tanatofóbia", "Pirofóbia", "Nomofóbia",
                "Xenofóbia", "Eizoptofóbia", "Pogonofóbia", "Tafofóbia", "Kakofóbia",
                "Geliofóbia", "Nyktotafóbia", "Hapefóbia", "Ablutofóbia", "Aerodromofóbia",
                "Antofóbia", "Bathofóbia", "Chronofóbia", "Denktofóbia"
            )
        ),

        "érzelmek" to Deck(
            id = "érzelmek",
            name = "Érzelmek & Érzések",
            category = "Általános",
            words = listOf(
                "Boldogság", "Szomorúság", "Harag", "Félelem", "Undor", "Meglepetés", "Szerelem",
                "Féltékenység", "Zavarodottság", "Büszkeség", "Szégyen", "Bűntudat", "Izgatottság",
                "Szorongás", "Unalom", "Zavarodottság", "Frusztráció", "Csalódottság", "Remény",
                "Hála", "Nosztalgia", "Magány", "Eufória", "Nyugalom", "Melankólia", "Optimizmus",
                "Pesszimizmus", "Kíváncsiság", "Empátia", "Szimpátia", "Bánat", "Irigység", "Megkönnyebbülés"
            )
        ),

        "tv_sorozatok" to Deck(
            id = "tv_sorozatok",
            name = "TV Sorozatok",
            category = "Szórakozás",
            words = listOf(
                "Jóbarátok", "Totál szívás (Breaking Bad)", "Trónok harca", "The Office",
                "Stranger Things", "Simpson család", "A korona (The Crown)", "A Mandalori",
                "Seinfeld", "Sherlock", "The Walking Dead", "A Big Bang elmélet", "Better Call Saul",
                "Westworld", "Black Mirror", "A pénzrabló (Money Heist)", "Csernobil", "Lost", "Dexter",
                "Grace klinika", "Narcos", "The Witcher", "Mad Men", "Fargo", "Kártyavár (House of Cards)",
                "Ozark", "Peaky Blinders", "True Detective", "Rick és Morty", "BoJack Horseman",
                "Nagy kis hazugságok (Big Little Lies)", "A fiúk (The Boys)", "Utódlás (Succession)",
                "Bridgerton család", "Oz", "Prison Break"
            )
        ),

        "társasjátékok" to Deck(
            id = "társasjátékok",
            name = "Társasjátékok",
            category = "Szórakozás",
            words = listOf(
                "Monopoly", "Sakk", "Scrabble", "Clue (Ki vagyok?)", "Risk", "Torpedó (Battleship)",
                "Trivial Pursuit", "Catan telepesei", "Ticket to Ride (Vasúti világ)", "Pandemic",
                "Candy Land", "Egyszerűen négyet (Connect Four)", "Jenga", "Ki vagyok?", "Othello",
                "Backgammon", "Pictionary", "Uno", "Carcassonne", "Codenames", "Dominion", "Sequence",
                "Scattergories", "Mancala", "Azul", "Twister", "A Catan telepesei", "The Resistance",
                "Exploding Kittens", "Gloomhaven", "Eldritch Horror", "7 csodák", "Terraforming Mars"
            )
        ),

        "gyümölcszöldség" to Deck(
            id = "gyümölcszöldség",
            name = "Gyümölcs & Zöldség",
            category = "Életmód",
            words = listOf(
                "Alma", "Banán", "Répa", "Paradicsom", "Burgonya", "Eper", "Saláta", "Hagyma",
                "Uborka", "Őszibarack", "Körte", "Mangó", "Szőlő", "Görögdinnye", "Brokkoli",
                "Spenót", "Sütőtök", "Cukkini", "Padlizsán", "Paprika", "Ananász", "Áfonya",
                "Málna", "Cseresznye", "Papaya", "Kivi", "Sárgabarack", "Szeder", "Sárgadinnye",
                "Karfiol", "Zeller", "Sparga"
            )
        ),

        "járművek" to Deck(
            id = "járművek",
            name = "Járművek",
            category = "Általános",
            words = listOf(
                "Autó", "Kerékpár", "Repülőgép", "Helikopter", "Vonat", "Hajó", "Motorkerékpár", "Busz",
                "Teherautó", "Robogó", "Tengeralattjáró", "Rakéta", "Traktor", "Léghajó", "Mentőautó",
                "Tűzoltóautó", "Taxi", "Segway", "Jacht", "Komphajó", "Sikló (kabelautó)", "Riksa",
                "Gondola", "Deltarepülő", "Jetski", "Robogó", "Gördeszka", "Hócsúszka", "UAZ", "Szemétszállító",
                "Bulldózer", "Markológép"
            )
        ),

        "tengeri_állatok" to Deck(
            id = "tengeri_állatok",
            name = "Tengeri Állatok",
            category = "Természet",
            words = listOf(
                "Cápa", "Delfin", "Polip", "Medúza", "Bálna", "Tengeri csikó", "Tengeri csillag", "Rák",
                "Homár", "Tengeri teknős", "Vitorláshal", "Barrakuda", "Bohóchal", "Mantarája",
                "Tengeri oroszlán", "Narval", "Angyalhal", "Dugong", "Fóka", "Korall", "Angolna",
                "Tengeri sün", "Tappancsfóka", "Óriáscápa", "Kardhal", "Sardínia", "Kékhátú cet",
                "Kardhal", "Kék bálna", "Kardhal", "Lazac", "Tonhal", "Lepényhal"
            )
        ),

        "virágok" to Deck(
            id = "virágok",
            name = "Virágok",
            category = "Természet",
            words = listOf(
                "Rózsa", "Tulipán", "Napraforgó", "Nárcisz", "Liliom", "Orchidea", "Margitvirág",
                "Körömvirág", "Levendula", "Bazsarózsa", "Chrysanthemum", "Szegfű", "Begónia",
                "Írisz", "Jázmin", "Kerti jázmin", "Hibiszkusz", "Magnólia", "Lótusz", "Mák", "Zínia",
                "Hortenzia", "Kamelia", "Anemone", "Őszirózsa", "Pitypang", "Dália", "Freesia",
                "Geránium", "Orgona", "Kankalin", "Téltemető"
            )
        ),

        "bolygók_űr" to Deck(
            id = "bolygók_űr",
            name = "Bolygók & Űr",
            category = "Oktatás",
            words = listOf(
                "Merkúr", "Vénusz", "Föld", "Mars", "Jupiter", "Szaturnusz", "Uránusz", "Neptunusz",
                "Plútó", "Nap", "Hold", "Kóméták", "Aszteroida", "Meteor", "Galaxis", "Fekete Lyuk",
                "Köd", "Csillag", "Szupernóva", "Pálya", "Tejút", "Androméda", "Hubble Teleszkóp",
                "Űrrepülő", "Műhold", "Napfogyatkozás", "Sarki fény", "Gravitáció", "Rakéta",
                "Űrhajós", "Nemzetközi Űrállomás", "Meteorraj", "Nagy Bumm", "Sötét anyag", "Kvazár"
            )
        ),

        "internet_mémek" to Deck(
            id = "internet_mémek",
            name = "Internet-mémek",
            category = "Közösségi Média",
            words = listOf(
                "Doge", "Grumpy Cat", "Success Kid", "Bad Luck Brian", "Overly Attached Girlfriend",
                "Roll Safe", "Hide the Pain Harold", "Mocking SpongeBob", "Arthur ököl",
                "Nő kiabál a macskával", "This Is Fine", "Philosoraptor", "Pepe the Frog",
                "Salt Bae", "Leo pezsgőt kortyol", "Kermit teázik", "Cinikus Wonka",
                "Ermahgerd", "Y U No", "Epic Fail", "Distracted Boyfriend", "Is This A Pigeon?",
                "Two Buttons", "Mocking SpongeBob", "Galaxy Brain", "Meglepett Pikachu",
                "Change My Mind", "Expanding Brain", "Roll Safe", "Bal Kifjárat 12",
                "One Does Not Simply"
            )
        ),

        "időjárási_jelenségek" to Deck(
            id = "időjárási_jelenségek",
            name = "Időjárási Jelenségek",
            category = "Természet",
            words = listOf(
                "Szivárvány", "Zivatar", "Tornádó", "Hurrikán", "Hófuvallat", "Köd", "Villám",
                "Jégeső", "Tsunami", "Lavina", "Aszály", "Árvíz", "Földrengés", "Vulkánkitörés",
                "Monszun", "Ciklon", "Homokvihar", "Hőhullám", "Fagy", "Sarki fény",
                "Porvihar", "Mikroburst", "Derecho", "Chinook", "Szeiszke", "Havaseső",
                "Fekete jég", "Savas eső", "Füstköd", "Vízörvény (waterspout)", "Pörgő szél",
                "Jégtorlasz"
            )
        ),

        "jóga_pózok" to Deck(
            id = "jóga_pózok",
            name = "Jóga Pózok",
            category = "Wellness",
            words = listOf(
                "Lefelé néző kutya", "Fa póz", "Harcos I", "Harcos II", "Gyermek póz",
                "Kobra póz", "Háromszög póz", "Ülő előrehajlás", "Híd póz", "Varjú póz",
                "Teve póz", "Deszka", "Hajó póz", "Tehén póz", "Macska póz", "Lótusz póz",
                "Fejenállás", "Galamb póz", "Hegyi póz", "Sas póz", "Koszorú póz",
                "Királygalamb póz", "Fekvő összekötött póz", "Oldalsó deszka", "Félhold póz",
                "Vállállvány", "Kerék póz", "Hal póz", "Kölyök póz", "Támogatott fejenállás",
                "Ülő előrehajlás", "Íj póz", "Boldog baba póz"
            )
        ),

        "technikai_kifejezések" to Deck(
            id = "technikai_kifejezések",
            name = "Technikai Kifejezések",
            category = "Oktatás",
            words = listOf(
                "Algoritmus", "API", "Blocklánc", "Felhőalapú számítástechnika", "Kiberbiztonság",
                "Adatbányászat", "Titkosítás", "Tűzfal", "Git", "HTML", "Dolgainternet (IoT)",
                "JavaScript", "Kotlin", "Gépi tanulás", "Nanotechnológia", "Nyílt forráskód",
                "Python", "Kvantumszámítógép", "React", "Szerver nélküli", "UI/UX",
                "Virtuális valóság", "WebAssembly", "XML", "Y2K", "Zero-Day", "Big Data",
                "Konténerizáció", "DevOps", "Edge computing", "Funkcionális programozás",
                "Grafikus feldolgozó egység (GPU)", "Hash-elés", "Internet-protokoll"
            )
        ),

        "társasjáték_genrek" to Deck(
            id = "társasjáték_genrek",
            name = "Társasjáték Genrek",
            category = "Szórakozás",
            words = listOf(
                "Stratégiai", "Eurojáték", "Partijáték", "Kooperatív", "Kártyaépítés",
                "Munkáselhelyezés", "Területkontroll", "Absztrakt", "Kockajáték", "Csempehelyezés",
                "Következtetés", "Kártyaválasztás", "Logikai", "Kvíz", "Szerepjáték", "Minijáték",
                "Családi", "Háborús", "Gazdasági", "Kvíz", "Ügyességi", "Blöffölés",
                "Pont-pont mozgás", "Aukció", "Szerencsejáték", "Csempepakolás", "Gyűjtögetős",
                "Tárgyalás", "Licittelés", "Feltolás", "Egy valós idő alatt"
            )
        ),

        "irodai_felszerelés" to Deck(
            id = "irodai_felszerelés",
            name = "Irodai felszerelés",
            category = "Általános",
            words = listOf(
                "Toll", "Ceruza", "Jegyzetfüzet", "Tűzőgépek", "Irodai gemkapocs", "Szövegkiemelő",
                "Boríték", "Olló", "Ragasztószalag", "Tábla", "Filctoll", "Számológép", "Mappa",
                "Gyűrűskönyv", "Irodai szék", "Íróasztali lámpa", "Nyomtató", "Monitor", "Billentyűzet",
                "Egér", "Pendrive", "Fejhallgató", "Jegyzettömb", "Tervező", "Naptár", "Radír",
                "Vonalzó", "Tűzőgépkiszedő", "Iratcsipesz", "Egérpad", "Szkenner", "Post-it"
            )
        ),

        "társasjáték_összetevők" to Deck(
            id = "társasjáték_összetevők",
            name = "Társasjáték összetevők",
            category = "Szórakozás",
            words = listOf(
                "Kocka", "Bábú", "Kártya", "Jelölő", "Tábla", "Csempe", "Bábu", "Pakli", "Forgókerekes tárcsa",
                "Időmérő", "Pontozófüzet", "Szabálykönyv", "Minifigura", "Csempeállvány", "Zseton",
                "Korong", "Tégla", "Domino", "Pénz", "Láda", "Drágakő", "Gyógyító ital", "Győzelmi pont jelző"
            )
        ),

        "divatkiegészítők" to Deck(
            id = "divatkiegészítők",
            name = "Divatkiegészítők",
            category = "Életmód",
            words = listOf(
                "Magassarkú", "Szűk farmer", "Fekete kis ruha", "Szmoking", "Csokornyakkendő",
                "Bőrkabát", "Kapucnis pulóver", "Nyári ruha", "Balerinacipő", "Bakancs", "Filckalap",
                "Baseballsapka", "Ballonkabát", "Kardigán", "Bikini", "Kámzsapulóver", "Estélyi ruha",
                "Menyasszonyi ruha", "Hasítékos felső", "Zsebes nadrág", "Mini szoknya", "Vintage póló",
                "Tervezői táska", "Sál", "Blézer", "Koktélruha", "Overál", "Flaneling", "Bőr rövidnadrág",
                "Rövidnadrág", "Nadrág", "Hálóing", "Szemüveg", "Léghajó"
            )
        ),

        "ünnepi_hagyományok" to Deck(
            id = "ünnepi_hagyományok",
            name = "Ünnepi hagyományok",
            category = "Kultúra",
            words = listOf(
                "Csokit vagy csínyt", "Karácsonyi énekek", "Ajándékozás", "Tűzijáték",
                "Lakoma", "Húsvéti tojáskeresés", "Hanuka gyertyagyújtás", "Karácsonyfa díszítése",
                "Kwanzaa énekek", "Holdtorta fesztivál", "Diwali lámpák", "Hálaadás felvonulás",
                "Boxing Day sport", "Szent Patrik napi felvonulás", "Oktoberfest", "Halottak napi oltárok",
                "Kínai újév sárkánytánc", "Karneváli maskarák", "Halloween jelmezverseny",
                "Függetlenség napi BBQ", "Szilveszteri visszaszámlálás", "Szellemház Halloween",
                "Valentin-napi lapok", "Mardi Gras gyöngyök", "Nagypénteki körmenet",
                "Ramadán iftár", "Rós hásáná imák", "Jom Kippur böjt", "Holi színes ünnep",
                "Kupala éjszaka", "Húsvéti nyuszi", "Lammas ünnep", "Középső ősz holdtorták",
                "Mindenszentek gyertyái", "Seollal rizskása leves", "Nowruz Haft-Sin asztal"
            )
        ),
        "acting_extended" to Deck(
            id = "acting_extended",
            name = "Színjátszás (Kiterjesztett)",
            category = "Általános",
            instruction = "Ne beszélj – csak gesztusokat és testmozdulatokat használj",
            words = listOf(
                // Napközbeni tevékenységek
                "Fogmosás",
                "Tésztafőzés",
                "Billentyűzeten gépelés",
                "Könyvolvasás",
                "Levélírás",
                "Mosogatás",
                "Padlósöprés",
                "Porszívózás",
                "Mosás (ruhák hajtogatása)",
                "Ing vasalása",
                "Ágyazás",
                "Kertészkedés (növényöntözés)",
                "Kutyasétáltatás",
                "Baba etetése",
                "Izzó cseréje",
                "Fal festése",
                "Szivárgó csap javítása",
                "Kerékpározás",
                "Gördeszkázás",
                "Görkorcsolyázás",
                "Ugrókötelezés",
                "Hullahopp",
                "Jóga (lefelé néző kutya póz)",
                "Zongorázás",
                "Gitározás",
                "Kosárlabda pattogtatása",
                "Kosárra dobás",
                "Focilabda rúgása",
                "Baseballütő lendítése",
                "Teniszszerva",
                "Golfütés",
                "Bowling",
                "Horgászat",
                "Hegymászás",
                "Ballettánc",
                "Hip-hop tánc",
                "Úszás",
                "Szörfözés",
                "Jégkorcsolyázás",
                "Síelés",
                "Snowboardozás",
                "Csónakevezés",
                "Kajakozás",
                "Sziklamászás",
                "Teniszezés",
                "Röplabdázás",
                "Ökölvívás",
                "Zsonglőrködés",
                "Judo dobás",
                "Karateütés",
                "Gördeszka trükk",
                // Foglalkozások és szakmák
                "Séf (főzés a tűzhelyen)",
                "Professzor (írás a táblára)",
                "Fotós (kép készítése)",
                "Orvos (pulzus ellenőrzése)",
                "Ápoló (infúzió beállítása)",
                "Tűzoltó (tűzoltócső használata)",
                "Rendőr (bilincs használata)",
                "Villanyszerelő (izzó cseréje)",
                "Szerelő (kerék szerelése csavarkulccsal)",
                "Művész (festés vászonra)",
                "Zenész (hegedűjáték)",
                "Színész (mímelés a színpadon)",
                "Pénztáros (áruk beolvasása)",
                "Pincér (tálca tartása)",
                "Pilóta (repülőgép vezetése)",
                "Űrhajós (súlytalanságban lebegés)",
                "Tudós (mikroszkóp alatt nézés)",
                "Séf (palacsinta megfordítása)",
                "Fogorvos (fogak vizsgálata)",
                "Borbély (hajvágás)",
                "Fodrász (hajszárítás)",
                "Mentőtiszt (újraélesztés végzése)",
                "Gazda (tehén fejése)",
                "Építőmunkás (szög beverése)",
                "Könyvtáros (könyvek polcra helyezése)",
                "Bíró (kalapács leütése)",
                "Ügyvéd (papírra mutatás)",
                "Újságíró (hangrögzítés)",
                "Taxi sofőr (kormány kezelése)",
                "Edző (sípszó fújása)",
                "Pék (tészta dagasztása)",
                "Hentes (hús felaprítása)",
                "Virágkötő (virágok rendezése)",
                "Ács (fa fűrészelése)",
                "Vízvezeték-szerelő (cső meghúzása)",
                "Villanyszerelő (vezetékek tesztelése)",
                "Fotós (film előhívása)",
                "Színész (meghajlás)",
                "Táncos (piruett végrehajtása)",
                "Zenész (gitár pengetése)",
                "Tengerész (vitorla felhúzása)"
            )
        ),

        "singing_recent" to Deck(
            id = "singing_recent",
            name = "Dalok (az elmúlt 15 évből)",
            category = "Zene",
            instruction = "Énekeld vagy dúdold a dallamot – szöveg nélkül!",
            words = listOf(
                "Gangnam Style",
                "Despacito",
                "Uptown Funk",
                "Shape of You",
                "Blinding Lights",
                "Lean On",
                "Señorita",
                "Old Town Road",
                "Roar",
                "Shake It Off",
                "Call Me Maybe",
                "Blurred Lines",
                "Hello",
                "Counting Stars",
                "Happy",
                "Wake Me Up",
                "See You Again",
                "Rockabye",
                "Havana",
                "Bad Guy",
                "Drivers License",
                "Peaches",
                "Stay",
                "Easy On Me",
                "As It Was",
                "Flowers"
            )
        ),

        "sound_effects_extended" to Deck(
            id = "sound_effects_extended",
            name = "Hangok (szó nélkül)",
            category = "Általános",
            instruction = "Keltse el a hanghatást – semmi beszéd vagy beszélgetés!",
            words = listOf(
                // Állatok
                "Macska dorombolás",
                "Kutya ugatás",
                "Tehén bőgés",
                "Oroszlán üvöltés",
                "Elefánt trombitálás",
                "Béka brekegés",
                "Madár csiripelés",
                "Farkas vonyítása",
                "Ló nyerítése",
                "Birka bégetés",
                // Háztartási
                "Ébresztőóra csörgése",
                "Turmixgép zümmögése",
                "Porszívó zümmögése",
                "Ajtó nyikorgása",
                "Teáskanna fütyülése",
                "Víz forrása",
                "Szemétprés hangja",
                "Mosógép zakatolása",
                "Mikrohullámú sütő pittyegése",
                "Mosogatógép öblítése",
                // Járművek és gépek
                "Autó motorjának zúgása",
                "Motorbicikli motorjának zúgása",
                "Repülőgép felszállása",
                "Vonat füttyögése",
                "Mentőautó szirénája",
                "Fűnyíró zaja",
                "Láncfűrész zaja",
                "Fúrókalapács zaja",
                "Hajó kürtje",
                "Daru zúgása",
                // Természet és időjárás
                "Eső hullása",
                "Mennydörgés",
                "Szél süvítése",
                "Hullámok csapódása",
                "Tűz sercegése",
                "Levelek susogása",
                "Folyó csobogása",
                "Madárcsiripelés hajnalban",
                "Földrengés morajlása",
                "Vulkánkitörés",
                // Vegyes
                "Lépések kavicson",
                "Billentyűzet gépelése",
                "Kopogás az ajtón",
                "Tapsolás",
                "Dallam fütyülése",
                "Tüsszentés",
                "Köhögés",
                "Horkolás",
                "Üveg törése",
                "Papír susogása",
                "Telefon csörgése",
                "Pénztárgép csengetése",
                "Fényképezőgép zár kattanása",
                "Ajtócsengő",
                "Autóduda dudálása",
                "Lift csengője",
                "Szívverés",
                "Óra ketyegése",
                "Jég repedése",
                "Ablaktörlő hangja"
            )
        )

    )
}