package com.quasistr.data.decks

import com.quasistr.data.models.Deck

object GermanDecks {
    val decks = mapOf(
        "filme" to Deck(
            id = "filme",
            name = "Filme",
            category = "Unterhaltung",
            words = listOf(
                "Titanic", "Inception", "Avatar", "Der Pate", "Pulp Fiction", "Gladiator",
                "Matrix", "Jurassic Park", "Krieg der Sterne", "The Dark Knight", "Forrest Gump",
                "Zurück in die Zukunft", "Harry Potter", "Der Herr der Ringe", "The Avengers",
                "Spider-Man", "Die Eiskönigin", "Der König der Löwen", "Shrek", "Toy Story",
                "Der weiße Hai", "Rocky", "Terminator", "Findet Nemo", "Aladdin",
                "Der Zauberer von Oz", "Schindlers Liste", "Die Verurteilten", "Das Schweigen der Lämmer",
                "Casablanca", "La La Land", "Interstellar", "Departed – Unter Feinden", "Parasite",
                "Joker", "Mad Max: Fury Road", "Black Panther", "Whiplash", "The Social Network",
                "Guardians of the Galaxy", "A Beautiful Mind", "Get Out", "Logan", "The Revenant",
                "Once Upon a Time in Hollywood"
            )
        ),

        "schauspiel" to Deck(
            id = "schauspiel",
            name = "Schauspiel",
            category = "Allgemein",
            instruction = "Nicht sprechen! Nur Gestik und Körpersprache verwenden",
            words = listOf(
                "Schwimmen", "Auto fahren", "Tanzen", "Laufen", "Fliegen (Flugzeug)",
                "Gitarre spielen", "Tastatur tippen", "Essen", "Schlafen", "Weinen",
                "Lachen", "Zähne putzen", "Klettern", "Boxen", "Angeln", "Malen",
                "Ski fahren", "Fußball spielen", "Lesen", "Pferd reiten", "Schreiben",
                "Kochen", "Sport treiben", "Singen", "Stricken", "Klavier spielen",
                "Ein Foto machen", "Rasieren", "Make-up auftragen", "Sandburg bauen",
                "Orchester dirigieren", "Jonglieren", "Skateboard fahren", "Surfen",
                "Gärtnern", "Nähen", "Holzhacken", "Klettern (Berghang)", "Basketball spielen",
                "Bogenschießen", "Bowling", "Töpfern"
            )
        ),

        "tiere" to Deck(
            id = "tiere",
            name = "Tiere",
            category = "Natur",
            words = listOf(
                "Elefant", "Tiger", "Känguru", "Pinguin", "Adler", "Löwe", "Zebra", "Delfin",
                "Hai", "Wal", "Kaninchen", "Frosch", "Schlange", "Wolf", "Bär", "Leopard",
                "Giraffe", "Gepard", "Nashorn", "Flusspferd", "Schildkröte", "Krokodil",
                "Alligator", "Kamel", "Pferd", "Schaf", "Kuh", "Ziege", "Huhn", "Ente",
                "Papagei", "Affe", "Schimpanse", "Panda", "Fuchs", "Waschbär", "Eule",
                "Bison", "Habicht", "Falke", "Otter", "Koala", "Faultier", "Schnabeltier",
                "Igel", "Stachelschwein"
            )
        ),

        "länder" to Deck(
            id = "länder",
            name = "Länder",
            category = "Bildung",
            words = listOf(
                "Deutschland", "Frankreich", "Japan", "Brasilien", "Australien", "Kanada",
                "Mexiko", "Indien", "China", "Russland", "Südafrika", "Italien", "Spanien",
                "Portugal", "Schweden", "Norwegen", "Argentinien", "Chile", "Ägypten",
                "Kenia", "Polen", "Griechenland", "Island", "Türkei", "Irland", "Niederlande",
                "Dänemark", "Finnland", "Saudi-Arabien", "Südkorea", "Neuseeland", "Ukraine",
                "Peru", "Kolumbien", "Thailand", "Vietnam", "Malaysia", "Indonesien",
                "Philippinen", "Singapur", "Belgien", "Österreich", "Schweiz",
                "Tschechien", "Ungarn", "Rumänien", "Marokko", "Nigeria"
            )
        ),

        "fantasie_charaktere" to Deck(
            id = "fantasie_charaktere",
            name = "Fantasy-Charaktere",
            category = "Unterhaltung",
            words = listOf(
                "Gandalf", "Jon Schnee", "Frodo Beutlin", "Harry Potter", "Hermine Granger",
                "Legolas", "Aslan", "Bilbo Beutlin", "Daenerys Targaryen", "Tyrion Lannister",
                "Arya Stark", "Gollum", "Merlin", "Dumbledore", "Geralt von Riva",
                "Cersei Lannister", "Aragorn", "Hagrid", "Yennefer", "Edmund Pevensie",
                "Luke Skywalker", "Prinzessin Leia", "Darth Vader", "Yoda", "Saruman",
                "Sauron", "Aang", "Jasmin", "Elsa", "Maleficent", "Sirius Black", "Radagast",
                "Éowyn", "Thranduil", "Elrond", "Kili", "Tauriel"
            )
        ),

        "sitcom_charaktere" to Deck(
            id = "sitcom_charaktere",
            name = "Sitcom-Charaktere",
            category = "Unterhaltung",
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

        "animationsfilme" to Deck(
            id = "animationsfilme",
            name = "Animationsfilme",
            category = "Unterhaltung",
            words = listOf(
                "Die Eiskönigin", "Shrek", "Toy Story", "Der König der Löwen", "Alles steht Kopf",
                "Kung Fu Panda", "Zoomania", "Madagascar", "Drachenzähmen leicht gemacht",
                "Vaiana", "Coco", "Chihiros Reise ins Zauberland", "Oben", "Ratatouille",
                "Die Monster AG", "Die Schöne und das Biest", "Mulan", "Ice Age", "Die Unglaublichen",
                "Findet Dorie", "WALL·E", "Merida – Legende der Highlands", "Rapunzel – Neu verföhnt",
                "Baymax – Riesiges Robowabohu", "Cars", "Ralph reichts", "Ich – Einfach unverbesserlich",
                "Spider-Man: A New Universe", "Kubo – Der tapfere Samurai", "Coraline"
            )
        ),

        "youtube_trends" to Deck(
            id = "youtube_trends",
            name = "YouTube-Trends",
            category = "Soziale Medien",
            words = listOf(
                "Unboxing-Videos", "Mukbang", "Prank-Videos", "Reaction-Videos", "Vlogging",
                "Gaming-Streams", "ASMR", "DIY-Anleitungen", "Challenge-Videos", "Make-up-Tutorials",
                "Life Hacks", "Produktbewertungen", "Haul-Videos", "Kochkanäle", "Reise-Vlogs",
                "Fitness-Routinen", "Tech-Reviews", "Daily Vlogs", "Bildungsvideos", "Q&A-Videos",
                "Live-Streams", "Timelapse-Videos", "Stop-Motion", "Storytime-Videos",
                "Cover-Songs", "Tanz-Cover", "Animationskurzfilme", "Tutorial-Serien",
                "Zusammenstellungsvideos", "Behind-the-Scenes"
            )
        ),

        "musik_genres" to Deck(
            id = "musik_genres",
            name = "Musikgenres",
            category = "Musik",
            words = listOf(
                "Pop", "Rock", "Hip-Hop", "Jazz", "Klassik", "Reggae", "Country", "Blues",
                "EDM", "Dubstep", "R&B", "Metal", "Folk", "K-Pop", "Latin", "Ska", "Gospel",
                "Techno", "Soul", "Punk", "Grunge", "Salsa", "Flamenco", "Afrobeat", "Trance",
                "House", "Bluegrass", "Oper", "Funk", "Disco", "Emo", "Psytrance", "Drum and Bass",
                "Ambient", "Lo-fi"
            )
        ),

        "weltküche" to Deck(
            id = "weltküche",
            name = "Weltküche",
            category = "Freizeit",
            words = listOf(
                "Pizza", "Sushi", "Tacos", "Paella", "Curry", "Pho", "Falafel", "Gulasch",
                "Poutine", "Kimchi", "Hummus", "Baklava", "Lasagne", "Chow Mein", "Croissant",
                "Pierogi", "Burrito", "Kebab", "Dim Sum", "Crepe", "Biryani", "Ramen",
                "Tapas", "Bratwurst", "Moussaka", "Shakshuka", "Empanada", "Chimichanga",
                "Satay", "Jollof-Reis", "Pad Thai", "Sauerbraten", "Paella Valenciana"
            )
        ),

        "landschaftsmerkmale" to Deck(
            id = "landschaftsmerkmale",
            name = "Landschaftsmerkmale",
            category = "Natur",
            words = listOf(
                "Berg", "Tal", "Wasserfall", "Vulkan", "Wald", "Wüste", "Schlucht", "Insel",
                "Gletscher", "See", "Fluss", "Strand", "Höhle", "Kliff", "Sumpf", "Prärie",
                "Hügel", "Riff", "Hochebene", "Lagune", "Düne", "Regenwald", "Savanne",
                "Marschland", "Halbinsel", "Archipel", "Geysir", "Delta", "Vulkankrater",
                "Felsnadel", "Vulkanplateau", "Badlands"
            )
        ),

        "historische_personen" to Deck(
            id = "historische_personen",
            name = "Historische Personen",
            category = "Bildung",
            words = listOf(
                "Albert Einstein", "Isaac Newton", "Marie Curie", "Nelson Mandela", "Kleopatra",
                "Julius Caesar", "Napoleon Bonaparte", "Martin Luther King Jr.", "Mahatma Gandhi",
                "Leonardo da Vinci", "Christoph Kolumbus", "Johanna von Orléans", "Alexander der Große",
                "Abraham Lincoln", "Winston Churchill", "Galileo Galilei", "Königin Victoria",
                "Thomas Edison", "William Shakespeare", "George Washington", "Dschingis Khan",
                "Karl Marx", "Florence Nightingale", "Wladimir Lenin", "Katharina die Große",
                "Elisabeth I.", "Thomas Jefferson", "Simón Bolívar", "Attila der Hunne",
                "Süleyman der Prächtige", "Kleisthenes", "Tutanchamun"
            )
        ),

        "marken_logos" to Deck(
            id = "marken_logos",
            name = "Marken & Logos",
            category = "Freizeit",
            words = listOf(
                "Nike", "Adidas", "Coca-Cola", "Apple", "Amazon", "Samsung", "Toyota", "Pepsi",
                "McDonald's", "Starbucks", "Disney", "Microsoft", "Google", "Netflix", "Ferrari",
                "Gucci", "Louis Vuitton", "Rolex", "Facebook", "Lego", "Intel", "Nvidia", "Honda",
                "BMW", "Mercedes-Benz", "Puma", "H&M", "IKEA", "Dell", "Spotify", "Mastercard", "Visa"
            )
        ),

        "berühmte_kunstwerke" to Deck(
            id = "berühmte_kunstwerke",
            name = "Berühmte Kunstwerke",
            category = "Kultur",
            words = listOf(
                "Mona Lisa", "Sternennacht", "Der Schrei", "Das letzte Abendmahl",
                "Mädchen mit dem Perlenohrring", "Amerikanischer Gótico", "Guernica",
                "Die Beständigkeit der Erinnerung", "Die Geburt der Venus", "Die Nachtwache",
                "Whistlers Mutter", "Der Kuss", "Erschaffung Adams", "Seerosen", "Der Denker",
                "Las Meninas", "Die Schule von Athen", "Sonnenblumen", "Die Freiheit führt das Volk",
                "Die große Welle vor Kanagawa", "Das Arnolfini-Porträt", "Die Heuwagen", "Nighthawks",
                "Der Garten der Lüste", "Campbell’s Soup Dosen", "Ophelia", "Venus von Milo",
                "David", "Das Floß der Medusa", "Christinas Welt", "Der tanzende Faun"
            )
        ),

        "superhelden" to Deck(
            id = "superhelden",
            name = "Superhelden",
            category = "Unterhaltung",
            words = listOf(
                "Superman", "Batman", "Spider-Man", "Wonder Woman", "Iron Man", "Captain America",
                "Hulk", "Thor", "Black Panther", "Flash", "Aquaman", "Green Lantern",
                "Doctor Strange", "Wolverine", "Deadpool", "Black Widow", "Hawkeye",
                "Captain Marvel", "Ant-Man", "Green Arrow", "Daredevil", "Luke Cage",
                "Jessica Jones", "Supergirl", "Vision", "Scarlet Witch", "Cyclops", "Jean Grey",
                "Nightcrawler", "Professor X", "Magneto", "Rogue", "Storm"
            )
        ),

        "videospiele" to Deck(
            id = "videospiele",
            name = "Videospiele",
            category = "Unterhaltung",
            words = listOf(
                "Minecraft", "Fortnite", "Super Mario Bros", "The Legend of Zelda", "Tetris",
                "Pac-Man", "Grand Theft Auto", "Call of Duty", "FIFA", "Pokémon",
                "World of Warcraft", "Overwatch", "League of Legends", "Counter-Strike",
                "Final Fantasy", "The Sims", "Assassin's Creed", "Resident Evil", "Among Us",
                "Red Dead Redemption", "Halo", "God of War", "Street Fighter", "Metal Gear Solid",
                "Doom", "Half-Life", "Portal", "Skyrim", "Fallout", "Dark Souls", "Cyberpunk 2077",
                "Animal Crossing", "Splatoon"
            )
        ),

        "bücher_literatur" to Deck(
            id = "bücher_literatur",
            name = "Bücher & Literatur",
            category = "Bildung",
            words = listOf(
                "Romeo und Julia", "Stolz und Vorurteil", "Der große Gatsby",
                "Wer die Nachtigall stört", "1984", "Krieg und Frieden", "Schuld und Sühne",
                "Die Odyssee", "Moby Dick", "Don Quijote", "Der Fänger im Roggen", "Schöne neue Welt",
                "Jane Eyre", "Sturmhöhe", "Der Hobbit", "Anna Karenina", "Hamlet", "Macbeth",
                "Der Graf von Monte Christo", "Die Elenden", "Die Brüder Karamasow",
                "Hundert Jahre Einsamkeit", "Ulysses", "Madame Bovary",
                "Die göttliche Komödie", "Catch-22", "Animal Farm", "Frankenstein",
                "Der Fremde", "Lolita", "Früchte des Zorns", "Der scharlachrote Buchstabe",
                "Dracula", "Herz der Finsternis"
            )
        ),

        "sportarten" to Deck(
            id = "sportarten",
            name = "Sportarten",
            category = "Aktivitäten",
            words = listOf(
                "Fußball", "Basketball", "Tennis", "Cricket", "Baseball", "Rugby", "Golf",
                "Eishockey", "Badminton", "Schwimmen", "Radfahren", "Skifahren", "Snowboarden",
                "Eislaufen", "Boxen", "Kampfsport", "Judo", "Karate", "Bogenschießen", "Volleyball",
                "Tischtennis", "Turnen", "Surfen", "Segeln", "Leichtathletik", "Fechten",
                "Gewichtheben", "Ringen", "Bobfahren", "Rodeln", "BMX", "Triathlon", "Handball",
                "Wasserball"
            )
        ),

        "berufe" to Deck(
            id = "berufe",
            name = "Berufe",
            category = "Bildung",
            words = listOf(
                "Arzt", "Ingenieur", "Lehrer", "Künstler", "Schriftsteller", "Schauspieler",
                "Pilot", "Koch", "Krankenschwester", "Polizist", "Feuerwehrmann", "Zahnarzt",
                "Wissenschaftler", "Rechtsanwalt", "Journalist", "Klempner", "Elektriker",
                "Architekt", "Apotheker", "Mechaniker", "Tierarzt", "Übersetzer", "Buchhalter",
                "Therapeut", "Zimmermann", "Bäcker", "Bauer", "Fotograf", "Musiker", "Designer",
                "Astronaut", "Sanitäter", "Richter", "Bibliothekar", "Taxifahrer"
            )
        ),

        "mythische_wesen" to Deck(
            id = "mythische_wesen",
            name = "Mythische Wesen",
            category = "Fantasy",
            words = listOf(
                "Drache", "Einhorn", "Meerjungfrau", "Greif", "Phönix", "Zentaur", "Minotaurus",
                "Werwolf", "Vampir", "Zombie", "Pegasus", "Sphinx", "Zyklop", "Kraken", "Yeti",
                "Goblin", "Troll", "Fee", "Oger", "Chimäre", "Basilisk", "Zerberus", "Hydra",
                "Gorgo", "Djinn", "Nessie", "Wendigo", "Kelpie", "Selkie", "Mantikor", "Satyr",
                "Harpyie", "Banshee", "Kobold"
            )
        ),

        "erfindungen" to Deck(
            id = "erfindungen",
            name = "Erfindungen",
            category = "Bildung",
            words = listOf(
                "Telefon", "Glühbirne", "Buchdruck", "Rad", "Kompass", "Fernseher", "Flugzeug",
                "Computer", "Kühlschrank", "Kamera", "Mikrowelle", "Mikroskop", "Teleskop",
                "Dampfmaschine", "Antibiotika", "Röntgen", "Radio", "Schere", "Batterie", "Fahrrad",
                "Elektromotor", "Taschenrechner", "GPS", "Internet", "Smartphone", "SSD", "Laser",
                "3D-Drucker", "Drohne", "MRT-Scanner", "Penicillin", "Düsentriebwerk", "Hyperloop"
            )
        ),

        "tanzstile" to Deck(
            id = "tanzstile",
            name = "Tanzstile",
            category = "Unterhaltung",
            words = listOf(
                "Ballett", "Salsa", "Hip-Hop", "Tango", "Wiener Walzer", "Breakdance", "Zeitgenössisch",
                "Jazz", "Stepptanz", "Flamenco", "Standardtanz", "Swing", "Bauchtanz", "Rumba",
                "Cha-Cha-Cha", "Foxtrott", "Samba", "Merengue", "Bollywood", "Zumba", "Popping",
                "Locking", "Krumping", "House", "Disco", "Polka", "Samba", "Lindy Hop", "Twerking",
                "Hula", "Kathak", "Kuchipudi", "Bhangra"
            )
        ),

        "phobien" to Deck(
            id = "phobien",
            name = "Phobien",
            category = "Psychologie",
            words = listOf(
                "Arachnophobie", "Akrophobie", "Klaustrophobie", "Agoraphobie", "Ophidiophobie",
                "Aerophobie", "Trypophobie", "Aquaphobie", "Nyktophobie", "Hämophobie",
                "Kynophobie", "Astraphobie", "Mysophobie", "Glossophobie", "Nekrophobie",
                "Koulrophobie", "Entomophobie", "Thanatophobie", "Pyrophobie", "Nomophobie",
                "Xenophobie", "Eisoptrophobie", "Pogonophobie", "Taphophobie", "Kakophobie",
                "Geliophobie", "Nyktophobie", "Haphephobie", "Ablutophobie", "Aerodromophobie",
                "Anthophobie", "Bathyophobie", "Chronophobie", "Denktophobie"
            )
        ),

        "gefühle" to Deck(
            id = "gefühle",
            name = "Gefühle & Empfindungen",
            category = "Allgemein",
            words = listOf(
                "Glück", "Traurigkeit", "Wut", "Angst", "Ekel", "Überraschung", "Liebe", "Eifersucht",
                "Peinlichkeit", "Stolz", "Scham", "Schuld", "Aufregung", "Angstzustand", "Langeweile",
                "Verwirrung", "Frustration", "Enttäuschung", "Hoffnung", "Dankbarkeit", "Nostalgie",
                "Einsamkeit", "Euphorie", "Gelassenheit", "Melancholie", "Optimismus", "Pessimismus",
                "Neugier", "Empathie", "Sympathie", "Reue", "Neid", "Erleichterung"
            )
        ),

        "fernsehserien" to Deck(
            id = "fernsehserien",
            name = "Fernsehserien",
            category = "Unterhaltung",
            words = listOf(
                "Friends", "Breaking Bad", "Game of Thrones", "The Office", "Stranger Things",
                "Die Simpsons", "The Crown", "The Mandalorian", "Seinfeld", "Sherlock",
                "The Walking Dead", "The Big Bang Theory", "Better Call Saul", "Westworld",
                "Black Mirror", "Haus des Geldes", "Chernobyl", "Lost", "Dexter", "Grey's Anatomy",
                "Narcos", "The Witcher", "Mad Men", "Fargo", "House of Cards", "Ozark",
                "Peaky Blinders", "True Detective", "Rick and Morty", "BoJack Horseman",
                "Big Little Lies", "The Boys", "Succession", "Bridgerton", "Oz", "Prison Break"
            )
        ),

        "brettspiele" to Deck(
            id = "brettspiele",
            name = "Brettspiele",
            category = "Unterhaltung",
            words = listOf(
                "Monopoly", "Schach", "Scrabble", "Clue", "Risk", "Schlachtschiff",
                "Trivial Pursuit", "Catan", "Zug um Zug", "Pandemie", "Candy Land",
                "Vier gewinnt", "Jenga", "Wer bin ich?", "Othello", "Backgammon", "Pictionary",
                "Uno", "Carcassonne", "Codenames", "Dominion", "Sequence", "Scattergories",
                "Mancala", "Azul", "Twister", "Die Siedler von Catan", "The Resistance",
                "Exploding Kittens", "Gloomhaven", "Eldritch Horror", "7 Wonders", "Terraforming Mars"
            )
        ),

        "obst_gemüse" to Deck(
            id = "obst_gemüse",
            name = "Obst & Gemüse",
            category = "Freizeit",
            words = listOf(
                "Apfel", "Banane", "Karotte", "Tomate", "Kartoffel", "Erdbeere", "Salat", "Zwiebel",
                "Gurke", "Pfirsich", "Birne", "Mango", "Trauben", "Wassermelone", "Brokkoli",
                "Spinat", "Kürbis", "Zucchini", "Aubergine", "Paprika", "Ananas", "Blaubeere",
                "Himbeere", "Kirsche", "Papaya", "Kiwi", "Aprikose", "Brombeere", "Honigmelone",
                "Blumenkohl", "Staudensellerie", "Spargel"
            )
        ),

        "fahrzeuge" to Deck(
            id = "fahrzeuge",
            name = "Fahrzeuge",
            category = "Allgemein",
            words = listOf(
                "Auto", "Fahrrad", "Flugzeug", "Hubschrauber", "Zug", "Boot", "Motorrad", "Bus",
                "Lkw", "Roller", "U-Boot", "Rakete", "Traktor", "Heißluftballon", "Krankenwagen",
                "Feuerwehrwagen", "Taxi", "Segway", "Yacht", "Fähre", "Seilbahn", "Rikscha",
                "Gondel", "Flugdrachen", "Jetski", "Mofa", "Skateboard", "Snowmobil", "Geländewagen",
                "Schleppkahn", "Bulldozer", "Bagger"
            )
        ),

        "meerestiere" to Deck(
            id = "meerestiere",
            name = "Meerestiere",
            category = "Natur",
            words = listOf(
                "Hai", "Delfin", "Krake", "Qualle", "Wal", "Seepferdchen", "Seestern", "Krabbe",
                "Hummer", "Meeresschildkröte", "Schwertfisch", "Barrakuda", "Clownfisch", "Manta",
                "Seelöwe", "Narwal", "Engelfisch", "Manati", "Robbe", "Koralle", "Aal", "Seeigel",
                "Kugelfisch", "Sardine", "Stachelrochen", "Blauwal", "Kaulbarsch", "Schwertwal",
                "Lachs", "Thunfisch", "Flunder"
            )
        ),

        "blumen" to Deck(
            id = "blumen",
            name = "Blumen",
            category = "Natur",
            words = listOf(
                "Rose", "Tulpe", "Sonnenblume", "Narzisse", "Lilie", "Orchidee", "Gänseblümchen",
                "Ringelblume", "Lavendel", "Pfingstrose", "Chrysantheme", "Nelke", "Begonie",
                "Iris", "Jasmin", "Gardenie", "Hibiskus", "Magnolie", "Lotus", "Mohn", "Zinnie",
                "Hortensie", "Kamelie", "Anemone", "Astern", "Butterblume", "Dahlie", "Freesie",
                "Geranie", "Flieder", "Trichterwinde", "Narzisse", "Sonnentau", "Schneeglöckchen"
            )
        ),

        "planeten_weltraum" to Deck(
            id = "planeten_weltraum",
            name = "Planeten & Weltraum",
            category = "Bildung",
            words = listOf(
                "Merkur", "Venus", "Erde", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto",
                "Sonne", "Mond", "Komet", "Asteroid", "Meteorit", "Galaxie", "Schwarzes Loch",
                "Nebel", "Stern", "Supernova", "Orbit", "Milchstraße", "Andromeda", "Hubble-Teleskop",
                "Space Shuttle", "Satellit", "Finsternis", "Polarlicht", "Gravitation", "Rakete",
                "Astronaut", "Internationale Raumstation", "Meteorschauer", "Urknall", "Dunkle Materie",
                "Quasar"
            )
        ),

        "internet_memes" to Deck(
            id = "internet_memes",
            name = "Internet-Memes",
            category = "Soziale Medien",
            words = listOf(
                "Doge", "Grumpy Cat", "Success Kid", "Bad Luck Brian", "Overly Attached Girlfriend",
                "Roll Safe", "Hide the Pain Harold", "Mocking Spongebob", "Arthur Fist",
                "Dame schreit Katze an", "This Is Fine", "Philosoraptor", "Pepe the Frog",
                "Salt Bae", "Leo Prost", "Kermit trinkt Tee", "Verächtlicher Wonka",
                "Ermahgerd", "Y U No", "Epic Fail", "Distracted Boyfriend", "Is This A Pigeon?",
                "Two Buttons", "Mocking SpongeBob", "Galaxy Brain", "Surprised Pikachu",
                "Change My Mind", "Expanding Brain", "Roll Safe", "Linke Ausfahrt 12",
                "One Does Not Simply"
            )
        ),

        "wetter_phänomene" to Deck(
            id = "wetter_phänomene",
            name = "Wetterphänomene",
            category = "Natur",
            words = listOf(
                "Regenbogen", "Gewitter", "Tornado", "Hurrikan", "Schneesturm", "Nebel", "Blitz",
                "Hagel", "Tsunami", "Lawine", "Dürre", "Überschwemmung", "Erdbeben", "Vulkan",
                "Monsun", "Wirbelsturm", "Staubsturm", "Hitzewelle", "Frost", "Nordlicht",
                "Sandsturm", "Mikroburst", "Derecho", "Chinook", "Seiche", "Graupel", "Schwarzeis",
                "Saurer Regen", "Rauchnebel", "Wasserhose", "Wirbelwinde", "Eissturm"
            )
        ),

        "yoga_posen" to Deck(
            id = "yoga_posen",
            name = "Yoga-Posen",
            category = "Wellness",
            words = listOf(
                "Herabschauender Hund", "Baum-Pose", "Krieger I", "Krieger II", "Kind-Pose",
                "Kobra-Pose", "Dreieck-Pose", "Sitzende Vorwärtsbeuge", "Brücken-Pose", "Krähe-Pose",
                "Kamel-Pose", "Planke", "Boot-Pose", "Kuh-Pose", "Katze-Pose", "Lotus-Pose",
                "Kopfstand", "Tauben-Pose", "Berg-Pose", "Adler-Pose", "Girlanden-Pose",
                "Königstauben-Pose", "Liegende gebundene Winkel-Pose", "Seitliche Planke",
                "Halbmond-Pose", "Schulterstand", "Rad-Pose", "Fisch-Pose", "Welpen-Pose",
                "Unterstützter Kopfstand", "Vorwärtsbeuge sitzend", "Bogen-Pose",
                "Fröhliches Baby-Pose"
            )
        ),

        "technik_begriffe" to Deck(
            id = "technik_begriffe",
            name = "Technik-Begriffe",
            category = "Bildung",
            words = listOf(
                "Algorithmus", "API", "Blockchain", "Cloud-Computing", "Cybersicherheit",
                "Data Mining", "Verschlüsselung", "Firewall", "Git", "HTML", "Internet der Dinge",
                "JavaScript", "Kotlin", "Maschinelles Lernen", "Nanotechnologie", "Open Source",
                "Python", "Quantencomputing", "React", "Serverlos", "UI/UX", "Virtuelle Realität",
                "WebAssembly", "XML", "Y2K", "Zero-Day", "Big Data", "Containerisierung",
                "DevOps", "Edge Computing", "Funktionales Programmieren", "Grafikprozessor",
                "Hashing", "Internetprotokoll"
            )
        ),

        "brettspiel_genres" to Deck(
            id = "brettspiel_genres",
            name = "Brettspiel-Genres",
            category = "Unterhaltung",
            words = listOf(
                "Strategie", "Komplexspiel", "Partyspiel", "Kooperativ", "Deck-Building",
                "Worker Placement", "Gebietskontrolle", "Abstrakt", "Würfelspiel", "Platzierung",
                "Deduktion", "Kartenauswahl", "Puzzle", "Trivia", "Rollenspiel", "Miniaturen",
                "Familienspiel", "Wargame", "Wirtschaftsspiel", "Trivia", "Geschicklichkeit",
                "Bluffspiel", "Punkt-zu-Punkt", "Auktion", "Risikospiel", "Kachelnlegen",
                "Sammeltspiel", "Verhandlung", "Bieten", "Bietspiel", "Echtzeit"
            )
        ),

        "haushaltsgegenstände" to Deck(
            id = "haushaltsgegenstände",
            name = "Haushaltsgegenstände",
            category = "Allgemein",
            words = listOf(
                "Sofa", "Esstisch", "Kühlschrank", "Mikrowelle", "Toaster", "Staubsauger",
                "Waschmaschine", "Wäschetrockner", "Geschirrspüler", "Mixer", "Kaffeemaschine",
                "Wasserkocher", "Klimaanlage", "Ventilator", "Heizung", "Lampe", "Bücherregal",
                "Vorhänge", "Matratze", "Kissen", "Decke", "Spiegel", "Teppich", "Handtuch",
                "Mülleimer", "Bügeleisen", "Müllentsorger", "Herd", "Ofen", "Küchenspüle",
                "Waschbecken", "Dusche", "Toilette", "Bettgestell"
            )
        ),

        "büromaterial" to Deck(
            id = "büromaterial",
            name = "Büromaterial",
            category = "Allgemein",
            words = listOf(
                "Stift", "Bleistift", "Notizbuch", "Tacker", "Büroklammer", "Textmarker",
                "Umschlag", "Schere", "Klebeband", "Whiteboard", "Marker", "Taschenrechner",
                "Ordner", "Ringbuch", "Bürostuhl", "Schreibtischlampe", "Drucker", "Monitor",
                "Tastatur", "Maus", "USB-Stick", "Headset", "Notizblock", "Planer", "Kalender",
                "Radiergummi", "Lineal", "Enttacker", "Klemmbrett", "Mauspad", "Scanner", "Post-it"
            )
        ),

        "brettspiel_componenten" to Deck(
            id = "brettspiel_componenten",
            name = "Brettspiel-Komponenten",
            category = "Unterhaltung",
            words = listOf(
                "Würfel", "Spielfigur", "Karte", "Marker", "Brett", "Kachel", "Bauer",
                "Deck", "Drehscheibe", "Sanduhr", "Punkteliste", "Regelbuch", "Miniatur",
                "Kachelhalter", "Chip", "Scheibe", "Ziegel", "Dominostein", "Geld", "Truhe",
                "Edelstein", "Heiltrank", "Siegespunkt-Marke"
            )
        ),

        "mode_gegenstände" to Deck(
            id = "mode_gegenstände",
            name = "Mode & Kleidung",
            category = "Freizeit",
            words = listOf(
                "High Heels", "Skinny Jeans", "Kleines Schwarzes", "Smoking", "Fliege",
                "Lederjacke", "Hoodie", "Sundress", "Ballerinas", "Stiefel", "Fedora",
                "Baseballmütze", "Trenchcoat", "Cardigan", "Bikini", "Rollkragenpullover",
                "Abendkleid", "Brautkleid", "Crop-Top", "Cargohose", "Minirock", "Vintage-T-Shirt",
                "Designertasche", "High Heels", "Schal", "Blazer", "Cocktailkleid", "Jumpsuit",
                "Flanellhemd", "Biker-Shorts", "Röckchen", "Palazzohose", "Netzstrümpfe",
                "Fliegerbrille", "Paillettenabendkleid", "Hut", "Latzhose", "Bomberjacke"
            )
        ),

        "feiertags_traditionen" to Deck(
            id = "feiertags_traditionen",
            name = "Feiertagstraditionen",
            category = "Kultur",
            words = listOf(
                "Süßes oder Saures", "Weihnachtslieder", "Geschenkeaustausch", "Feuerwerk",
                "Festmahl", "Ostereiersuche", "Chanukka-Kerzen anzünden", "Weihnachtsbaum schmücken",
                "Kwanzaa-Lieder singen", "Mondkuchenfest", "Diwali-Lichter", "Erntedankumzug",
                "Boxing Day Sport", "St.-Patrick's-Day-Umzug", "Oktoberfest", "Día de los Muertos-Altäre",
                "Chinesisches Neujahrs-Drachentanz", "Karnevalsmasken", "Halloween-Kostümwettbewerb",
                "Unabhängigkeitstag-Barbecue", "Silvester-Countdown", "Halloween-Spukhaus",
                "Valentinstagskarten", "Mardi-Gras-Perlen", "Karfreitagsprozession",
                "Ramadan-Iftar", "Rosch ha-Schana-Gebete", "Jom Kippur Fasten", "Holi-Farbfestival",
                "Kupala-Nacht", "Osterhase", "Lammasfest", "Mondkuchen am Mittherbstfest",
                "Allerheiligen-Kerzen", "Seollal-Reiskuchensuppe", "Nowruz-Haft-Sin"
            )
        ),
        // German versions

        "acting_extended" to Deck(
            id = "acting_extended",
            name = "Darstellen (Erweitert)",
            category = "Allgemein",
            instruction = "Keine Worte—nur Gestik und Körperbewegungen verwenden",
            words = listOf(
                // Alltagsaktionen
                "Zähne putzen",
                "Nudeln kochen",
                "Auf der Tastatur tippen",
                "Ein Buch lesen",
                "Einen Brief schreiben",
                "Geschirr spülen",
                "Den Boden fegen",
                "Staubsaugen",
                "Wäsche falten",
                "Ein Hemd bügeln",
                "Ein Bett machen",
                "Gartenarbeit (Pflanzen gießen)",
                "Einen Hund ausführen",
                "Ein Baby füttern",
                "Eine Glühbirne wechseln",
                "Eine Wand streichen",
                "Einen tropfenden Wasserhahn reparieren",
                "Fahrrad fahren",
                "Skateboard fahren",
                "Inlineskates fahren",
                "Seilspringen",
                "Hula-Hoop",
                "Yoga (Herabschauender Hund)",
                "Klavier spielen",
                "Gitarre spielen",
                "Basketball dribbeln",
                "Basketball werfen",
                "Einen Fußball kicken",
                "Mit einem Baseballschläger schlagen",
                "Tennisaufschlag",
                "Golfschwung",
                "Bowling spielen",
                "Angeln",
                "Einen Berg besteigen",
                "Ballett tanzen",
                "Hip-Hop tanzen",
                "Schwimmen",
                "Surfen",
                "Eislaufen",
                "Skifahren",
                "Snowboarden",
                "Rudern",
                "Kajak fahren",
                "Eisklettern",
                "Tennis spielen",
                "Volleyball spielen",
                "Boxen",
                "Jonglieren",
                "Judo-Wurf",
                "Karate-Chop",
                "Skateboard-Trick",
                // Berufe & Tätigkeiten
                "Koch (am Herd arbeiten)",
                "Professor (an der Tafel schreiben)",
                "Fotograf (Foto machen)",
                "Arzt (Puls messen)",
                "Krankenschwester (Infusion einstellen)",
                "Feuerwehrmann (Schlauch bedienen)",
                "Polizist (Handschellen anlegen)",
                "Elektriker (Birne wechseln)",
                "Mechaniker (Rad wechseln)",
                "Künstler (Leinwand bemalen)",
                "Musiker (Violine spielen)",
                "Schauspieler (auf der Bühne mimisch agieren)",
                "Verkäufer (Waren einscannen)",
                "Kellner (Tablett tragen)",
                "Pilot (Flugzeug steuern)",
                "Astronaut (im All schweben)",
                "Wissenschaftler (Mikroskop benutzen)",
                "Bäcker (Teig kneten)",
                "Zahnarzt (Zähne untersuchen)",
                "Friseur (Haarschnitt darstellen)",
                "Sanitäter (Herz-Lungen-Wiederbelebung)",
                "Bauer (Kuh melken)",
                "Bauarbeiter (Nagel einschlagen)",
                "Bibliothekar (Bücher einsortieren)",
                "Richter (Hammer schlagen)",
                "Anwalt (Papiere zeigen)",
                "Journalist (Aufnahmegerät halten)",
                "Taxifahrer (Lenkrad halten)",
                "Trainer (Pfeife pusten)",
                "Maurer (Mörtel auftragen)",
                "Schreiner (Säge benutzen)",
                "Installateur (Rohr verschrauben)",
                "Elektriker (Kabel prüfen)",
                "Fotograf (Filmentwicklung)",
                "Darsteller (Verbeugung)",
                "Tänzer (Pirouette)",
                "Musiker (Gitarre zupfen)",
                "Segler (Segel hissen)"
            )
        ),

        "singing_recent" to Deck(
            id = "singing_recent",
            name = "Lieder (Letzte 15 Jahre)",
            category = "Musik",
            instruction = "Sing oder summe die Melodie—keine Textzeilen erlaubt!",
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
            name = "Geräusche (Ohne Worte)",
            category = "Allgemein",
            instruction = "Erzeuge das Geräusch—keine Worte oder Sprechen!",
            words = listOf(
                // Tiere
                "Katze schnurren",
                "Hund bellen",
                "Kuh muhen",
                "Löwe brüllen",
                "Elefant trompeten",
                "Frosch quaken",
                "Vogel zwitschern",
                "Wolf heulen",
                "Pferd wiehern",
                "Schaf blöken",
                // Haushalt
                "Wecker klingeln",
                "Mixer surren",
                "Staubsauger",
                "Tür quietschen",
                "Teekessel pfeifen",
                "Wasser kochen",
                "Müllpresse",
                "Waschmaschine",
                "Mikrowelle piepsen",
                "Geschirrspüler spülen",
                // Fahrzeuge & Maschinen
                "Auto-Motor aufheulen",
                "Motorrad aufheulen",
                "Flugzeug startet",
                "Zugpfeife",
                "Krankenwagen-Sirene",
                "Rasenmäher",
                "Kettensäge",
                "Presslufthammer",
                "Bootshupe",
                "Baustellenkran",
                // Natur & Wetter
                "Regen fallen",
                "Donnerknall",
                "Wind heulen",
                "Wellenbrandung",
                "Feuer knistern",
                "Blätter rauschen",
                "Flussrauschen",
                "Vogelgezwitscher am Morgen",
                "Erdbeben grollen",
                "Vulkanausbruch",
                // Sonstiges
                "Schritte auf Kies",
                "Tastatur tippen",
                "An Tür klopfen",
                "Handklatschen",
                "Pfeifen",
                "Niesen",
                "Husten",
                "Schnarchen",
                "Glas zerbrechen",
                "Papier rascheln",
                "Telefon klingeln",
                "Kasse Kasse klingeln",
                "Kamera auslösen",
                "Türklingel",
                "Autohupe hupen",
                "Fahrstuhl Klingel",
                "Herzschlag",
                "Uhr ticken",
                "Eis knacken",
                "Scheibenwischer"
            )
        )
    )
}
