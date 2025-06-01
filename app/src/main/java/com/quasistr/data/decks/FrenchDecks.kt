package com.quasistr.data.decks

import com.quasistr.data.models.Deck

object FrenchDecks {
    val decks = mapOf(
        "films" to Deck(
            id = "films",
            name = "Films",
            category = "Divertissement",
            words = listOf(
                "Titanic", "Inception", "Avatar", "Le Parrain", "Pulp Fiction", "Gladiator",
                "Matrix", "Jurassic Park", "Star Wars", "Le Chevalier Noir", "Forrest Gump",
                "Retour vers le futur", "Harry Potter", "Le Seigneur des anneaux", "Avengers",
                "Spider-Man", "La Reine des neiges", "Le Roi Lion", "Shrek", "Toy Story",
                "Les Dents de la mer", "Rocky", "Terminator", "Le Monde de Nemo", "Aladdin",
                "Le Magicien d’Oz", "La Liste de Schindler", "Les Évadés", "Le Silence des agneaux",
                "Casablanca", "La La Land", "Interstellar", "Les Infiltrés", "Parasite", "Joker",
                "Mad Max : Fury Road", "Black Panther", "Whiplash", "The Social Network",
                "Les Gardiens de la Galaxie", "Un homme d’exception", "Get Out", "Logan : Wolverine",
                "The Revenant", "Once Upon a Time… in Hollywood"
            )
        ),

        "jeu_d_acteur" to Deck(
            id = "jeu_d_acteur",
            name = "Jeu d’acteur",
            category = "Général",
            instruction = "Ne parle pas ! Utilise seulement des gestes et la gestuelle",
            words = listOf(
                "Nager", "Conduire une voiture", "Danser", "Courir", "Voler en avion",
                "Jouer de la guitare", "Taper au clavier", "Manger", "Dormir", "Pleurer",
                "Rire", "Se brosser les dents", "Grimper", "Boxer", "Pêcher", "Peindre",
                "Faire du ski", "Jouer au football", "Lire", "Monter à cheval", "Écrire",
                "Cuisiner", "Faire de l’exercice", "Chanter sans paroles", "Tricoter",
                "Jouer du piano", "Prendre une photo", "Se raser", "Se maquiller",
                "Construire un château de sable", "Diriger un orchestre", "Jongler",
                "Faire du skateboard", "Faire du surf", "Jardiner", "Coudre", "Couper du bois",
                "Escalade", "Jouer au basket", "Tir à l’arc", "Jouer aux quilles", "Poterie"
            )
        ),

        "animaux" to Deck(
            id = "animaux",
            name = "Animaux",
            category = "Nature",
            words = listOf(
                "Éléphant", "Tigre", "Kangourou", "Manchot", "Aigle", "Lion", "Zèbre", "Dauphin",
                "Requin", "Baleine", "Lapin", "Grenouille", "Serpent", "Loup", "Ours", "Léopard",
                "Girafe", "Guépard", "Rhinocéros", "Hippopotame", "Tortue", "Crocodile", "Alligator",
                "Chameau", "Cheval", "Mouton", "Vache", "Chèvre", "Poulet", "Canard", "Perroquet",
                "Singe", "Chimpanzé", "Panda", "Renard", "Raton laveur", "Hibou", "Bison",
                "Faucon", "Balbuzard pêcheur", "Loutre", "Koala", "Paresseux", "Ornithorynque",
                "Hérisson", "Porc-épic"
            )
        ),

        "pays" to Deck(
            id = "pays",
            name = "Pays",
            category = "Éducation",
            words = listOf(
                "Allemagne", "France", "Japon", "Brésil", "Australie", "Canada", "Mexique",
                "Inde", "Chine", "Russie", "Afrique du Sud", "Italie", "Espagne", "Portugal",
                "Suède", "Norvège", "Argentine", "Chili", "Égypte", "Kenya", "Pologne",
                "Grèce", "Islande", "Turquie", "Irlande", "Pays-Bas", "Danemark", "Finlande",
                "Arabie saoudite", "Corée du Sud", "Nouvelle-Zélande", "Ukraine", "Pérou",
                "Colombie", "Thaïlande", "Vietnam", "Malaisie", "Indonésie", "Philippines",
                "Singapour", "Belgique", "Autriche", "Suisse", "République tchèque", "Hongrie",
                "Roumanie", "Maroc", "Nigeria"
            )
        ),

        "personnages_fantastiques" to Deck(
            id = "personnages_fantastiques",
            name = "Personnages fantastiques",
            category = "Divertissement",
            words = listOf(
                "Gandalf", "Jon Snow", "Frodon Sacquet", "Harry Potter", "Hermione Granger",
                "Legolas", "Aslan", "Bilbon Sacquet", "Daenerys Targaryen", "Tyrion Lannister",
                "Arya Stark", "Gollum", "Merlin", "Dumbledore", "Geralt de Rivia", "Cersei Lannister",
                "Aragorn", "Hagrid", "Yennefer", "Edmund Pevensie", "Luke Skywalker",
                "Princesse Leia", "Darth Vader", "Yoda", "Saroumane", "Sauron", "Aang",
                "Jasmine", "Elsa", "Maléfique", "Sirius Black", "Radagast", "Éowyn",
                "Thranduil", "Elrond", "Kili", "Tauriel"
            )
        ),

        "personnages_sitcom" to Deck(
            id = "personnages_sitcom",
            name = "Personnages de sitcom",
            category = "Divertissement",
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

        "films_animes" to Deck(
            id = "films_animes",
            name = "Films animés",
            category = "Divertissement",
            words = listOf(
                "La Reine des neiges", "Shrek", "Toy Story", "Le Roi Lion", "Vice-Versa",
                "Kung Fu Panda", "Zootopie", "Madagascar", "Dragons", "Vaiana", "Coco",
                "Le Voyage de Chihiro", "Là-haut", "Ratatouille", "Monstres & Cie",
                "La Belle et la Bête", "Mulan", "L’Âge de glace", "Les Indestructibles",
                "Le Monde de Nemo", "WALL·E", "Rebelle", "Raiponce", "Les Nouveaux Héros",
                "Cars", "Les Mondes de Ralph", "Moi, moche et méchant",
                "Spider-Man : New Generation", "Kubo et l’Épée magique", "Coraline"
            )
        ),

        "tendances_youtube" to Deck(
            id = "tendances_youtube",
            name = "Tendances YouTube",
            category = "Réseaux sociaux",
            words = listOf(
                "Vidéos unboxing", "Mukbang", "Vidéo de blagues", "Vidéo réaction",
                "Vlogging", "Live gaming", "ASMR", "Tutoriels DIY", "Vidéos défis",
                "Tutoriels maquillage", "Astuces de vie", "Tests produits", "Vidéos haul",
                "Chaînes cuisine", "Vlogs voyage", "Routines fitness", "Tests tech",
                "Vlogs quotidiens", "Vidéos éducatives", "Q&A", "Lives", "Timelapse",
                "Stop motion", "Storytime", "Cover de chansons", "Cover danse",
                "Courts animés", "Séries tutoriels", "Compilations", "Coulisses"
            )
        ),

        "genres_musicaux" to Deck(
            id = "genres_musicaux",
            name = "Genres musicaux",
            category = "Musique",
            words = listOf(
                "Pop", "Rock", "Hip-Hop", "Jazz", "Classique", "Reggae", "Country", "Blues",
                "EDM", "Dubstep", "R&B", "Metal", "Folk", "K-Pop", "Latino", "Ska", "Gospel",
                "Techno", "Soul", "Punk", "Grunge", "Salsa", "Flamenco", "Afrobeat", "Trance",
                "House", "Bluegrass", "Opéra", "Funk", "Disco", "Emo", "Psytrance", "Drum and Bass",
                "Ambient", "Lo-fi"
            )
        ),

        "cuisine_du_monde" to Deck(
            id = "cuisine_du_monde",
            name = "Cuisine du monde",
            category = "Style de vie",
            words = listOf(
                "Pizza", "Sushi", "Tacos", "Paëlla", "Curry", "Pho", "Falafel", "Goulash",
                "Poutine", "Kimchi", "Houmous", "Baklava", "Lasagnes", "Chow Mein", "Croissant",
                "Pierogi", "Burrito", "Kebab", "Dim Sum", "Crêpe", "Biryani", "Ramen",
                "Tapas", "Bratwurst", "Moussaka", "Shakshuka", "Empanada", "Chimichanga",
                "Satay", "Riz Jollof", "Pad Thai", "Sauerbraten", "Paëlla valencienne"
            )
        ),

        "caracteristiques_du_paysage" to Deck(
            id = "caracteristiques_du_paysage",
            name = "Caractéristiques du paysage",
            category = "Nature",
            words = listOf(
                "Montagne", "Vallée", "Cascade", "Volcan", "Forêt", "Désert", "Canyon", "Île",
                "Glacier", "Lac", "Rivière", "Plage", "Grotte", "Falaises", "Marais", "Prairie",
                "Colline", "Récif", "Plateau", "Lagune", "Dune", "Forêt tropicale", "Savane",
                "Zone humide", "Péninsule", "Archipel", "Geyser", "Delta", "Cratère volcanique",
                "Formations rocheuses", "Plateau volcanique", "Badlands"
            )
        ),

        "personnalites_historiques" to Deck(
            id = "personnalites_historiques",
            name = "Personnalités historiques",
            category = "Éducation",
            words = listOf(
                "Albert Einstein", "Isaac Newton", "Marie Curie", "Nelson Mandela", "Cléopâtre",
                "Jules César", "Napoléon Bonaparte", "Martin Luther King Jr.", "Mahatma Gandhi",
                "Leonard de Vinci", "Christophe Colomb", "Jeanne d’Arc", "Alexandre le Grand",
                "Abraham Lincoln", "Winston Churchill", "Galilée", "Reine Victoria",
                "Thomas Edison", "William Shakespeare", "George Washington", "Gengis Khan",
                "Karl Marx", "Florence Nightingale", "Vladimir Lénine", "Catherine la Grande",
                "Élisabeth Ire", "Thomas Jefferson", "Simón Bolívar", "Attila le Hun",
                "Soliman le Magnifique", "Clisthène", "Toutankhamon"
            )
        ),

        "marques_logos" to Deck(
            id = "marques_logos",
            name = "Marques & Logos",
            category = "Style de vie",
            words = listOf(
                "Nike", "Adidas", "Coca-Cola", "Apple", "Amazon", "Samsung", "Toyota", "Pepsi",
                "McDonald’s", "Starbucks", "Disney", "Microsoft", "Google", "Netflix", "Ferrari",
                "Gucci", "Louis Vuitton", "Rolex", "Facebook", "Lego", "Intel", "Nvidia", "Honda",
                "BMW", "Mercedes-Benz", "Puma", "H&M", "IKEA", "Dell", "Spotify", "Mastercard", "Visa"
            )
        ),

        "oeuvres_célèbres" to Deck(
            id = "oeuvres_célèbres",
            name = "Œuvres célèbres",
            category = "Culture",
            words = listOf(
                "La Joconde", "La Nuit étoilée", "Le Cri", "La Cène", "La Jeune fille à la perle",
                "American Gothic", "Guernica", "La Persistance de la mémoire", "La Naissance de Vénus",
                "La Ronde de nuit", "Whistler’s Mother", "Le Baiser", "La Création d’Adam", "Nymphéas",
                "Le Penseur", "Les Menines", "L’École d’Athènes", "Tournesols", "La Liberté guidant le peuple",
                "La Grande Vague de Kanagawa", "Le Portrait des époux Arnolfini", "La Charrette de foin",
                "Nighthawks", "Le Jardin des délices", "Boîtes de soupe Campbell", "Ophélie",
                "Vénus de Milo", "David", "Le Radeau de la Méduse", "Christina’s World", "Le Faune dansant"
            )
        ),

        "superheros" to Deck(
            id = "superheros",
            name = "Superhéros",
            category = "Divertissement",
            words = listOf(
                "Superman", "Batman", "Spider-Man", "Wonder Woman", "Iron Man", "Captain America",
                "Hulk", "Thor", "Black Panther", "Flash", "Aquaman", "Green Lantern", "Doctor Strange",
                "Wolverine", "Deadpool", "Black Widow", "Hawkeye", "Captain Marvel", "Ant-Man",
                "Green Arrow", "Daredevil", "Luke Cage", "Jessica Jones", "Supergirl", "Vision",
                "Scarlet Witch", "Cyclops", "Jean Grey", "Nightcrawler", "Professor X", "Magneto",
                "Rogue", "Storm"
            )
        ),

        "jeux_vidéo" to Deck(
            id = "jeux_vidéo",
            name = "Jeux vidéo",
            category = "Divertissement",
            words = listOf(
                "Minecraft", "Fortnite", "Super Mario Bros", "The Legend of Zelda", "Tetris",
                "Pac-Man", "Grand Theft Auto", "Call of Duty", "FIFA", "Pokémon", "World of Warcraft",
                "Overwatch", "League of Legends", "Counter-Strike", "Final Fantasy", "Les Sims",
                "Assassin’s Creed", "Resident Evil", "Among Us", "Red Dead Redemption", "Halo",
                "God of War", "Street Fighter", "Metal Gear Solid", "Doom", "Half-Life", "Portal",
                "Skyrim", "Fallout", "Dark Souls", "Cyberpunk 2077", "Animal Crossing", "Splatoon"
            )
        ),

        "livres_litterature" to Deck(
            id = "livres_litterature",
            name = "Livres & Littérature",
            category = "Éducation",
            words = listOf(
                "Roméo et Juliette", "Orgueil et Préjugés", "Gatsby le Magnifique",
                "Ne tirez pas sur l’oiseau moqueur", "1984", "Guerre et Paix", "Crime et Châtiment",
                "L’Odyssée", "Moby Dick", "Don Quichotte", "L’Attrape-cœurs", "Le Meilleur des mondes",
                "Jane Eyre", "Les Hauts de Hurlevent", "Le Hobbit", "Anna Karénine", "Hamlet",
                "Macbeth", "Le Comte de Monte-Cristo", "Les Misérables", "Les Frères Karamazov",
                "Cent ans de solitude", "Ulysse", "Madame Bovary", "La Divine Comédie", "Catch-22",
                "La Ferme des animaux", "Frankenstein", "L’Étranger", "Lolita", "Les Raisins de la colère",
                "La Lettre écarlate", "Dracula", "Au cœur des ténèbres"
            )
        ),

        "sports" to Deck(
            id = "sports",
            name = "Sports",
            category = "Activités",
            words = listOf(
                "Football", "Basketball", "Tennis", "Cricket", "Baseball", "Rugby", "Golf",
                "Hockey sur glace", "Badminton", "Natation", "Cyclisme", "Ski", "Snowboard",
                "Patinage", "Boxe", "Arts martiaux", "Judo", "Karate", "Tir à l’arc", "Volleyball",
                "Tennis de table", "Gymnastique", "Surf", "Voile", "Athlétisme", "Escrime",
                "Haltérophilie", "Lutte", "Bobsleigh", "Luge", "BMX", "Triathlon", "Handball",
                "Water-polo"
            )
        ),

        "professions" to Deck(
            id = "professions",
            name = "Professions",
            category = "Éducation",
            words = listOf(
                "Médecin", "Ingénieur", "Professeur", "Artiste", "Écrivain", "Acteur", "Pilote",
                "Chef cuisinier", "Infirmier", "Policier", "Pompier", "Dentiste", "Scientifique",
                "Avocat", "Journaliste", "Plombier", "Électricien", "Architecte", "Pharmacien",
                "Mécanicien", "Vétérinaire", "Traducteur", "Comptable", "Thérapeute", "Charpentier",
                "Boulanger", "Agriculteur", "Photographe", "Musicien", "Designer", "Astronaute",
                "Paramédical", "Juge", "Bibliothécaire", "Chauffeur de taxi"
            )
        ),

        "creatures_mythiques" to Deck(
            id = "creatures_mythiques",
            name = "Créatures mythiques",
            category = "Fantaisie",
            words = listOf(
                "Dragon", "Licorne", "Sirène", "Griffon", "Phénix", "Centaure", "Minotaure",
                "Loup-garou", "Vampire", "Zombi", "Pégase", "Sphinx", "Cyclope", "Kraken",
                "Yéti", "Gobelin", "Troll", "Fée", "Ogre", "Chimère", "Basilic", "Cerbère",
                "Hydre", "Gorgone", "Djinn", "Nessie", "Wendigo", "Kelpie", "Selkie", "Manticore",
                "Satyre", "Harpie", "Banshee", "Lutin"
            )
        ),

        "inventions" to Deck(
            id = "inventions",
            name = "Inventions",
            category = "Éducation",
            words = listOf(
                "Téléphone", "Ampoule", "Imprimerie", "Roue", "Boussole", "Télévision",
                "Avion", "Ordinateur", "Réfrigérateur", "Appareil photo", "Micro-ondes",
                "Microscope", "Télescope", "Machine à vapeur", "Antibiotiques", "Rayons X",
                "Radio", "Ciseaux", "Pile", "Bicyclette", "Moteur électrique", "Calculatrice",
                "GPS", "Internet", "Smartphone", "SSD ", "Laser", "Imprimante 3D", "Drone",
                "IRM", "Pénicilline", "Moteur à réaction", "Hyperloop"
            )
        ),

        "styles_de_danse" to Deck(
            id = "styles_de_danse",
            name = "Styles de danse",
            category = "Divertissement",
            words = listOf(
                "Ballet", "Salsa", "Hip-Hop", "Tango", "Valse viennoise", "Breakdance",
                "Danse contemporaine", "Jazz", "Claquettes", "Flamenco", "Danse de salon", "Swing",
                "Danse tribale", "Rumba", "Cha-Cha-Cha", "Foxtrot", "Samba", "Merengue",
                "Bollywood", "Zumba", "Popping", "Locking", "Krumping", "House", "Disco",
                "Polka", "Lindy Hop", "Twerking", "Hula", "Kathak", "Kuchipudi", "Bhangra"
            )
        ),

        "phobies" to Deck(
            id = "phobies",
            name = "Phobies",
            category = "Psychologie",
            words = listOf(
                "Arachnophobie", "Acrophobie", "Claustrophobie", "Agoraphobie", "Ophidiophobie",
                "Aérophobie", "Trypophobie", "Aquaphobie", "Nyctophobie", "Hémophobie",
                "Cynophobie", "Astraphobie", "Mysophobie", "Glossophobie", "Nécrophobie",
                "Coulrophobie", "Entomophobie", "Thanatophobie", "Pyrophobie", "Nomophobie",
                "Xénophobie", "Eisoptrophobie", "Pogonophobie", "Taphophobie", "Cacophobie",
                "Geliophobie", "Nyctotaphobie", "Hapéphobie", "Ablutophobie", "Aérodromophobie",
                "Anthophobie", "Bathyophobie", "Chronophobie", "Dendrophobie"
            )
        ),

        "emotions_sentiments" to Deck(
            id = "emotions_sentiments",
            name = "Émotions & Sentiments",
            category = "Général",
            words = listOf(
                "Bonheur", "Tristesse", "Colère", "Peur", "Dégoût", "Surprise", "Amour",
                "Jalousie", "Honte", "Fierté", "Culpabilité", "Excitation", "Anxiété", "Ennui",
                "Confusion", "Frustration", "Déception", "Espoir", "Gratitude", "Nostalgie",
                "Solitude", "Euphorie", "Sérénité", "Mélancolie", "Optimisme", "Pessimisme",
                "Curiosité", "Empathie", "Sympathie", "Regret", "Envie", "Soulagement"
            )
        ),

        "series_tv" to Deck(
            id = "series_tv",
            name = "Séries TV",
            category = "Divertissement",
            words = listOf(
                "Friends", "Breaking Bad", "Game of Thrones", "The Office", "Stranger Things",
                "Les Simpson", "The Crown", "The Mandalorian", "Seinfeld", "Sherlock",
                "The Walking Dead", "The Big Bang Theory", "Better Call Saul", "Westworld",
                "Black Mirror", "La Casa de Papel", "Chernobyl", "Lost", "Dexter", "Grey’s Anatomy",
                "Narcos", "The Witcher", "Mad Men", "Fargo", "House of Cards", "Ozark",
                "Peaky Blinders", "True Detective", "Rick et Morty", "BoJack Horseman",
                "Big Little Lies", "The Boys", "Succession", "Bridgerton", "Oz", "Prison Break"
            )
        ),

        "jeux_de_societe" to Deck(
            id = "jeux_de_societe",
            name = "Jeux de société",
            category = "Divertissement",
            words = listOf(
                "Monopoly", "Échecs", "Scrabble", "Clue", "Risk", "Bataille navale",
                "Trivial Pursuit", "Catan", "Ticket to Ride", "Pandémie", "Candy Land",
                "Puissance 4", "Jenga", "Qui suis-je ?", "Othello", "Backgammon", "Pictionary",
                "Uno", "Carcassonne", "Codenames", "Dominion", "Sequence", "Scattergories",
                "Mancala", "Azul", "Twister", "The Resistance", "Exploding Kittens",
                "Gloomhaven", "Eldritch Horror", "7 Wonders", "Terraforming Mars"
            )
        ),

        "fruits_legumes" to Deck(
            id = "fruits_legumes",
            name = "Fruits & Légumes",
            category = "Style de vie",
            words = listOf(
                "Pomme", "Banane", "Carotte", "Tomate", "Pomme de terre", "Fraise",
                "Laitue", "Oignon", "Concombre", "Pêche", "Poire", "Mangue", "Raisin",
                "Pastèque", "Brocoli", "Épinard", "Citrouille", "Courgette", "Aubergine",
                "Poivron", "Ananas", "Myrtille", "Framboise", "Cerise", "Papaye", "Kiwi",
                "Abricot", "Mûre", "Melon", "Chou-fleur", "Céleri", "Asperge"
            )
        ),

        "vehicules" to Deck(
            id = "vehicules",
            name = "Véhicules",
            category = "Général",
            words = listOf(
                "Voiture", "Vélo", "Avion", "Hélicoptère", "Train", "Bateau", "Moto",
                "Bus", "Camion", "Trottinette", "Sous-marin", "Fusée", "Tracteur",
                "Montgolfière", "Ambulance", "Camion de pompiers", "Taxi", "Segway",
                "Yacht", "Ferry", "Téléphérique", "Rickshaw", "Gondole", "Deltaplane",
                "Jet-ski", "Mobyclette", "Skateboard", "Motoneige", "Baroudeur",
                "Camion poubelle", "Bulldozer", "Pelleteuse"
            )
        ),

        "creatures_marines" to Deck(
            id = "creatures_marines",
            name = "Créatures marines",
            category = "Nature",
            words = listOf(
                "Requin", "Dauphin", "Poulpe", "Méduse", "Baleine", "Hippocampe",
                "Étoile de mer", "Crabe", "Homard", "Tortue marine", "Espadon", "Barracuda",
                "Poisson clown", "Raie manta", "Lion de mer", "Narval", "Poisson ange",
                "Lamantin", "Phoque", "Corail", "Anguille", "Oursin", "Poisson‐boule",
                "Sardine", "Baleine bleue", "Requin-marteau", "Orque", "Saumon",
                "Thon", "Flet"
            )
        ),

        "fleurs" to Deck(
            id = "fleurs",
            name = "Fleurs",
            category = "Nature",
            words = listOf(
                "Rose", "Tulipe", "Tournesol", "Narcisse", "Lys", "Orchidée", "Marguerite",
                "Souci", "Lavande", "Pivoine", "Chrysanthème", "Œillet", "Bégonia", "Iris",
                "Jasmin", "Gardenia", "Hibiscus", "Magnolia", "Lotus", "Pavot", "Zinnia",
                "Hortensia", "Camélia", "Anémone", "Aster", "Renoncule", "Dahlia", "Freesia",
                "Géranium", "Liane", "Perce-neige"
            )
        ),

        "planetes_espace" to Deck(
            id = "planetes_espace",
            name = "Planètes & Espace",
            category = "Éducation",
            words = listOf(
                "Mercure", "Vénus", "Terre", "Mars", "Jupiter", "Saturne", "Uranus", "Neptune",
                "Pluton", "Soleil", "Lune", "Comète", "Astéroïde", "Météore", "Voie lactée",
                "Trou noir", "Nébuleuse", "Étoile", "Supernova", "Orbites", "Andromède",
                "Télescope Hubble", "Navette spatiale", "Satellite", "Éclipse", "Aurore",
                "Gravité", "Fusée", "Astronaute", "Station spatiale internationale",
                "Pluie d’étoiles filantes", "Big Bang", "Matière noire", "Quasar"
            )
        ),

        "memes_internet" to Deck(
            id = "memes_internet",
            name = "Mèmes Internet",
            category = "Réseaux sociaux",
            words = listOf(
                "Doge", "Chat grincheux", "Success Kid", "Bad Luck Brian",
                "Overly Attached Girlfriend", "Roll Safe", "Hide the Pain Harold",
                "Mocking SpongeBob", "Poing d’Arthur", "Femme hurlant sur chat",
                "This Is Fine", "Philosoraptor", "Pepe the Frog", "Salt Bae",
                "Leonardo DiCaprio porte un toast", "Kermit boit du thé", "Wonka méprisant",
                "Ermahgerd", "Y U No", "Epic Fail", "Petit ami distrait",
                "Is This a Pigeon?", "Two Buttons", "Mocking SpongeBob", "Cerveau galactique",
                "Pikachu surpris", "Change My Mind", "Cerveau en expansion", "Roll Safe",
                "Sortie gauche 12", "One Does Not Simply"
            )
        ),

        "phenomenes_meteo" to Deck(
            id = "phenomenes_meteo",
            name = "Phénomènes météo",
            category = "Nature",
            words = listOf(
                "Arc-en-ciel", "Orage", "Tornade", "Ouragan", "Tempête de neige", "Brouillard",
                "Éclair", "Grêle", "Tsunami", "Avalanche", "Sécheresse", "Inondation",
                "Tremblement de terre", "Éruption volcanique", "Mousson", "Cyclone",
                "Tempête de sable", "Canicule", "Gel", "Aurore boréale", "Tempête de poussière",
                "Micro rafale", "Derecho", "Chinook", "Seiche", "Pluie verglaçante",
                "Verglas", "Pluie acide", "Brume de fumée", "Trombe d’eau", "Tourbillon",
                "Tempête de glace"
            )
        ),

        "postures_yoga" to Deck(
            id = "postures_yoga",
            name = "Postures de yoga",
            category = "Bien-être",
            words = listOf(
                "Chien tête en bas", "Posture de l’arbre", "Guerrier I", "Guerrier II",
                "Posture de l’enfant", "Posture du cobra", "Posture du triangle",
                "Pli assis en avant", "Posture du pont", "Posture du corbeau", "Posture du chameau",
                "Planche", "Posture du bateau", "Posture de la vache", "Posture du chat",
                "Posture du lotus", "Posture sur la tête", "Posture du pigeon",
                "Posture de la montagne", "Posture de l’aigle", "Posture de la guirlande",
                "Posture du pigeon roi", "Posture de l’angle lié allongé", "Planche latérale",
                "Posture de la demi-lune", "Posture sur les épaules", "Posture de la roue",
                "Posture du poisson", "Posture du chiot", "Tête en bas assistée",
                "Pli assis", "Posture de l’arc", "Posture du bébé heureux"
            )
        ),

        "termes_tech" to Deck(
            id = "termes_tech",
            name = "Termes technologiques",
            category = "Éducation",
            words = listOf(
                "Algorithme", "API", "Blockchain", "Informatique en nuage", "Cybersécurité",
                "Data mining", "Cryptage", "Pare-feu", "Git", "HTML", "Internet des objets (IoT)",
                "JavaScript", "Kotlin", "Apprentissage automatique", "Nanotechnologie", "Open Source",
                "Python", "Informatique quantique", "React", "Serverless", "UI/UX", "Réalité virtuelle",
                "WebAssembly", "XML", "Y2K", "Zero-Day", "Big Data", "Conteneurisation", "DevOps",
                "Edge computing", "Programmation fonctionnelle", "GPU", "Hachage", "Protocole Internet"
            )
        ),

        "genres_jeux_de_societe" to Deck(
            id = "genres_jeux_de_societe",
            name = "Genres de jeux de société",
            category = "Divertissement",
            words = listOf(
                "Stratégie", "Eurogame", "Party", "Coopératif", "Deck-building",
                "Placement d’ouvriers", "Contrôle de zone", "Abstrait", "Jeu de dés",
                "Placement de tuiles", "Déduction", "Draft de cartes", "Puzzle", "Trivia",
                "Jeu de rôle", "Miniatures", "Familial", "Wargame", "Économique", "Trivia",
                "Dextérité", "Bluff", "Déplacement point à point", "Enchères", "Push your luck",
                "Pose de tuiles", "Collection de séries", "Négociation", "Enchères",
                "Temps réel"
            )
        ),

        "articles_maison" to Deck(
            id = "articles_maison",
            name = "Articles du foyer",
            category = "Général",
            words = listOf(
                "Canapé", "Table à manger", "Réfrigérateur", "Micro-ondes", "Grille-pain",
                "Aspirateur", "Machine à laver", "Sèche-linge", "Lave-vaisselle", "Mixeur",
                "Cafetière", "Bouilloire", "Climatiseur", "Ventilateur", "Radiateur", "Lampe",
                "Bibliothèque", "Rideaux", "Matelas", "Oreiller", "Couverture", "Miroir",
                "Tapis", "Serviette", "Poubelle", "Fer à repasser", "Broyeur à déchets",
                "Cuisinière", "Four", "Évier", "Robinet de salle de bain", "Douche", "Toilettes",
                "Cadre de lit"
            )
        ),

        "fournitures_bureau" to Deck(
            id = "fournitures_bureau",
            name = "Fournitures de bureau",
            category = "Général",
            words = listOf(
                "Stylo", "Crayon", "Carnet", "Agrafeuse", "Trombone", "Surligneur", "Enveloppe",
                "Ciseaux", "Ruban adhésif", "Tableau", "Marqueur", "Calculatrice", "Chemise",
                "Classeur", "Chaise de bureau", "Lampe de bureau", "Imprimante", "Écran",
                "Clavier", "Souris", "Clé USB", "Casque", "Bloc-notes", "Agenda", "Calendrier",
                "Gomme", "Règle", "Arrache-agrafes", "Porte-bloc", "Tapis de souris", "Scanner",
                "Post-it"
            )
        ),

        "composants_jeux_de_societe" to Deck(
            id = "composants_jeux_de_societe",
            name = "Composants de jeux de société",
            category = "Divertissement",
            words = listOf(
                "Dé", "Pion", "Carte", "Marqueur", "Plateau", "Tuile", "Jeton", "Paquet",
                "Gadget tournant", "Sabliers", "Carnet de scores", "Livre de règles", "Miniature",
                "Support de tuiles", "Jeton", "Disque", "Brique", "Domino", "Argent", "Coffre",
                "Gemme", "Potion de soin", "Jeton de points de victoire"
            )
        ),

        "mode_accessoires" to Deck(
            id = "mode_accessoires",
            name = "Mode & accessoires",
            category = "Style de vie",
            words = listOf(
                "Talons aiguilles", "Jeans skinny", "Petite robe noire", "Smoking", "Nœud papillon",
                "Veste en cuir", "Sweat à capuche", "Robe d’été", "Babies", "Bottes", "Chapeau feutre",
                "Casquette de baseball", "Trench-coat", "Gilet", "Bikini", "Col roulé", "Robe de cocktail",
                "Robe de mariée", "Haut court", "Pantalon cargo", "Mini-jupe", "T-shirt vintage",
                "Sac de créateur", "Écharpe", "Blazer", "Robe à paillettes", "Combinaison",
                "Chemise en flanelle", "Short cuir", "Combinaison ample", "Collants résille",
                "Lunettes aviateur", "Robe à sequins", "Chapeau", "Salopette", "Veste bomber"
            )
        ),

        "traditions_festives" to Deck(
            id = "traditions_festives",
            name = "Traditions festives",
            category = "Culture",
            words = listOf(
                "Trick or Treat", "Chants de Noël", "Échange de cadeaux", "Feux d’artifice",
                "Banquet", "Chasse aux œufs de Pâques", "Allumage de la ménorah",
                "Décorer le sapin de Noël", "Chants de Kwanzaa", "Festival de la galette des lunes",
                "Lampes de Diwali", "Défilé de Thanksgiving", "Sports du Boxing Day",
                "Défilé de la Saint-Patrick", "Oktoberfest", "Autels du Jour des Morts",
                "Danse du dragon du Nouvel An chinois", "Masques de Carnaval",
                "Concours de costumes d’Halloween", "Barbecue du jour de l’Indépendance",
                "Compte à rebours du Nouvel An", "Maison hantée à Halloween",
                "Cartes de la Saint-Valentin", "Colliers de Mardi Gras", "Procession du Vendredi Saint",
                "Iftar du Ramadan", "Prières de Rosh Hashanah", "Jeûne de Yom Kippour",
                "Festival Holi des couleurs", "Nuit de Kupala", "Lapin de Pâques",
                "Fête de Lammas", "Galettes de Mid-Autumn Festival", "Bougies de la Toussaint",
                "Soupe de riz de Seollal", "Table Haft-Sin de Nowruz"
            )
        )
    )
}
