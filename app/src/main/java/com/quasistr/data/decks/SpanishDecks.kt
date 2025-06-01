package com.quasistr.data.decks

import com.quasistr.data.models.Deck

object SpanishDecks {
    val decks = mapOf(
        "películas" to Deck(
            id = "películas",
            name = "Películas",
            category = "Entretenimiento",
            words = listOf(
                "Titanic", "Origen", "Avatar", "El Padrino", "Tiempos Violentos", "Gladiador",
                "Matrix", "Jurassic Park", "Star Wars", "El Caballero Oscuro", "Cadena Perpetua",
                "Regreso al Futuro", "Harry Potter", "El Señor de los Anillos", "Los Vengadores",
                "Spider-Man", "Frozen", "El Rey León", "Shrek", "Toy Story", "Tiburón", "Rocky",
                "Terminator", "Buscando a Nemo", "Aladdín", "El Mago de Oz", "La Lista de Schindler",
                "Cadena Perpetua (The Shawshank Redemption)", "El Silencio de los Inocentes", "Casablanca",
                "La La Land", "Interestelar", "Infiltrados (The Departed)", "Parásitos", "Joker",
                "Mad Max: Furia en la Carretera", "Pantera Negra", "Whiplash", "Red Social",
                "Guardianes de la Galaxia", "Una Mente Maravillosa", "¡Huye!", "Logan", "El Renacido",
                "Érase una vez en Hollywood"
            )
        ),

        "actuación" to Deck(
            id = "actuación",
            name = "Actuación",
            category = "General",
            instruction = "¡No hables! Solo usa gestos y lenguaje corporal",
            words = listOf(
                "Nadar", "Conducir un coche", "Bailar", "Correr", "Volar en avión", "Tocar la guitarra",
                "Escribir en un teclado", "Comer", "Dormir", "Llorar", "Reír", "Cepillarse los dientes",
                "Escalar", "Boxear", "Pescar", "Pintar", "Esquiar", "Jugar al fútbol", "Leer",
                "Montar a caballo", "Escribir", "Cocinar", "Hacer ejercicio", "Cantar sin letra",
                "Tejer", "Tocar el piano", "Tomar una foto", "Afeitarse", "Maquillarse", "Construir un castillo de arena",
                "Dirigir una orquesta", "Hacer malabares", "Montar en monopatín", "Surfear", "Jardinería",
                "Coser", "Cortar leña", "Escalar una roca", "Jugar baloncesto", "Tiro con arco", "Bolos", "Alfarería"
            )
        ),

        "animales" to Deck(
            id = "animales",
            name = "Animales",
            category = "Naturaleza",
            words = listOf(
                "Elefante", "Tigre", "Canguro", "Pingüino", "Águila", "León", "Cebra", "Delfín",
                "Tiburón", "Ballena", "Conejo", "Rana", "Serpiente", "Lobo", "Oso", "Leopardo",
                "Jirafa", "Guepardo", "Rinoceronte", "Hipopótamo", "Tortuga", "Cocodrilo", "Caimán",
                "Camello", "Caballo", "Oveja", "Vaca", "Cabra", "Gallina", "Pato", "Loro",
                "Mono", "Chimpancé", "Panda", "Zorro", "Mapache", "Búho", "Bisonte", "Halcón",
                "Águila pescadora", "Nutria", "Koala", "Perezoso", "Ornitorrinco", "Erizo", "Puercoespín"
            )
        ),

        "países" to Deck(
            id = "países",
            name = "Países",
            category = "Educación",
            words = listOf(
                "Alemania", "Francia", "Japón", "Brasil", "Australia", "Canadá", "México", "India",
                "China", "Rusia", "Sudáfrica", "Italia", "España", "Portugal", "Suecia", "Noruega",
                "Argentina", "Chile", "Egipto", "Kenia", "Polonia", "Grecia", "Islandia", "Turquía",
                "Irlanda", "Países Bajos", "Dinamarca", "Finlandia", "Arabia Saudita", "Corea del Sur",
                "Nueva Zelanda", "Ucrania", "Perú", "Colombia", "Tailandia", "Vietnam", "Malasia",
                "Indonesia", "Filipinas", "Singapur", "Bélgica", "Austria", "Suiza", "República Checa",
                "Hungría", "Rumania", "Marruecos", "Nigeria"
            )
        ),

        "personajes_de_fantasía" to Deck(
            id = "personajes_de_fantasía",
            name = "Personajes de Fantasía",
            category = "Entretenimiento",
            words = listOf(
                "Gandalf", "Jon Snow", "Frodo Bolsón", "Harry Potter", "Hermione Granger",
                "Legolas", "Aslan", "Bilbo Bolsón", "Daenerys Targaryen", "Tyrion Lannister",
                "Arya Stark", "Gollum", "Merlín", "Dumbledore", "Geralt de Rivia", "Cersei Lannister",
                "Aragorn", "Hagrid", "Yennefer", "Edmund Pevensie", "Luke Skywalker",
                "Princesa Leia", "Darth Vader", "Yoda", "Saruman", "Sauron", "Aang",
                "Jasmín", "Elsa", "Maléfica", "Sirius Black", "Radagast", "Éowyn",
                "Thranduil", "Elrond", "Kili", "Tauriel"
            )
        ),

        "personajes_de_sitcom" to Deck(
            id = "personajes_de_sitcom",
            name = "Personajes de Sitcom",
            category = "Entretenimiento",
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

        "películas_animadas" to Deck(
            id = "películas_animadas",
            name = "Películas Animadas",
            category = "Entretenimiento",
            words = listOf(
                "Frozen", "Shrek", "Toy Story", "El Rey León", "Intensa-Mente", "Kung Fu Panda",
                "Zootopia", "Madagascar", "Cómo Entrenar a Tu Dragón", "Moana", "Coco",
                "El Viaje de Chihiro", "Up", "Ratatouille", "Monsters, Inc.", "La Bella y la Bestia",
                "Mulán", "La Era del Hielo", "Los Increíbles", "Buscando a Dory", "WALL·E",
                "Valiente", "Enredados", "Big Hero 6", "Cars", "Ralph el Demoledor", "Mi Villano Favorito",
                "Spider-Man: Un Nuevo Universo", "Kubo y las Dos Cuerdas Mágicas", "Coraline"
            )
        ),

        "tendencias_youtube" to Deck(
            id = "tendencias_youtube",
            name = "Tendencias de YouTube",
            category = "Redes Sociales",
            words = listOf(
                "Videos de desempaque", "Mukbang", "Videos de bromas", "Videos de reacción", "Vlogging",
                "Transmisiones de juegos", "ASMR", "Tutoriales DIY", "Videos de retos", "Tutoriales de maquillaje",
                "Consejos de vida", "Reseñas de productos", "Videos de haul", "Canales de cocina", "Vlogs de viaje",
                "Rutinas de ejercicio", "Reseñas tecnológicas", "Vlogs diarios", "Videos educativos", "Videos de preguntas y respuestas",
                "Transmisiones en vivo", "Videos de timelapse", "Stop-motion", "Videos de historias",
                "Versiones de canciones (cover)", "Versiones de baile", "Cortos animados", "Series de tutoriales",
                "Videos recopilatorios", "Detrás de cámaras"
            )
        ),

        "géneros_musicales" to Deck(
            id = "géneros_musicales",
            name = "Géneros Musicales",
            category = "Música",
            words = listOf(
                "Pop", "Rock", "Hip-Hop", "Jazz", "Clásica", "Reggae", "Country", "Blues",
                "EDM", "Dubstep", "R&B", "Metal", "Folk", "K-Pop", "Latino", "Ska", "Gospel",
                "Techno", "Soul", "Punk", "Grunge", "Salsa", "Flamenco", "Afrobeat", "Trance",
                "House", "Bluegrass", "Ópera", "Funk", "Disco", "Emo", "Psytrance", "Drum and Bass",
                "Ambient", "Lo-fi"
            )
        ),

        "cocina_mundial" to Deck(
            id = "cocina_mundial",
            name = "Cocina Mundial",
            category = "Estilo de vida",
            words = listOf(
                "Pizza", "Sushi", "Tacos", "Paella", "Curry", "Pho", "Falafel", "Goulash",
                "Poutine", "Kimchi", "Hummus", "Baklava", "Lasaña", "Chow Mein", "Croissant",
                "Pierogi", "Burrito", "Kebab", "Dim Sum", "Crepe", "Biryani", "Ramen",
                "Tapas", "Bratwurst", "Musaca", "Shakshuka", "Empanada", "Chimichanga", "Satay",
                "Arroz Jollof", "Pad Thai", "Sauerbraten", "Paella Valenciana"
            )
        ),

        "características_del_paísaje" to Deck(
            id = "características_del_paísaje",
            name = "Características del Paisaje",
            category = "Naturaleza",
            words = listOf(
                "Montaña", "Valle", "Cascada", "Volcán", "Bosque", "Desierto", "Cañón", "Isla",
                "Glaciar", "Lago", "Río", "Playa", "Cueva", "Acantilado", "Pantano", "Pradera",
                "Colina", "Arrecife", "Meseta", "Laguna", "Duna", "Selva tropical", "Sabana",
                "Marisma", "Península", "Archipiélago", "Géiser", "Delta", "Cráter volcánico",
                "Formación rocosa", "Meseta volcánica", "Badlands"
            )
        ),

        "figuras_históricas" to Deck(
            id = "figuras_históricas",
            name = "Figuras Históricas",
            category = "Educación",
            words = listOf(
                "Albert Einstein", "Isaac Newton", "Marie Curie", "Nelson Mandela", "Cleopatra",
                "Julio César", "Napoleón Bonaparte", "Martin Luther King Jr.", "Mahatma Gandhi",
                "Leonardo da Vinci", "Cristóbal Colón", "Juana de Arco", "Alejandro Magno",
                "Abraham Lincoln", "Winston Churchill", "Galileo Galilei", "Reina Victoria",
                "Thomas Edison", "William Shakespeare", "George Washington", "Gengis Kan",
                "Karl Marx", "Florence Nightingale", "Vladimir Lenin", "Catalina la Grande",
                "Isabel I", "Thomas Jefferson", "Simón Bolívar", "Atila el Huno",
                "Suleimán el Magnífico", "Clístenes", "Tutankamón"
            )
        ),

        "marcas_logotipos" to Deck(
            id = "marcas_logotipos",
            name = "Marcas & Logotipos",
            category = "Estilo de vida",
            words = listOf(
                "Nike", "Adidas", "Coca-Cola", "Apple", "Amazon", "Samsung", "Toyota", "Pepsi",
                "McDonald’s", "Starbucks", "Disney", "Microsoft", "Google", "Netflix", "Ferrari",
                "Gucci", "Louis Vuitton", "Rolex", "Facebook", "Lego", "Intel", "Nvidia", "Honda",
                "BMW", "Mercedes-Benz", "Puma", "H&M", "IKEA", "Dell", "Spotify", "Mastercard", "Visa"
            )
        ),

        "obras_famosas" to Deck(
            id = "obras_famosas",
            name = "Obras Famosas",
            category = "Cultura",
            words = listOf(
                "Mona Lisa", "Noche Estrellada", "El Grito", "La Última Cena", "La Joven de la Perla",
                "Gótico Americano", "Guernica", "La Persistencia de la Memoria", "El Nacimiento de Venus",
                "La Ronda de Noche", "Madre de Whistler", "El Beso", "La Creación de Adán", "Nenúfares",
                "El Pensador", "Las Meninas", "La Escuela de Atenas", "Girasoles", "La Libertad Guiando al Pueblo",
                "La Gran Ola de Kanagawa", "El Retrato de Arnolfini", "Arado en la Llanura", "Nighthawks",
                "El Jardín de las Delicias", "Latas de Sopa Campbell", "Ofelia", "Venus de Milo", "David",
                "La Balsa de la Medusa", "El Mundo de Christina", "El Fauno Danza"
            )
        ),

        "superhéroes" to Deck(
            id = "superhéroes",
            name = "Superhéroes",
            category = "Entretenimiento",
            words = listOf(
                "Superman", "Batman", "Spider-Man", "Wonder Woman", "Iron Man", "Capitán América",
                "Hulk", "Thor", "Pantera Negra", "Flash", "Aquaman", "Linterna Verde", "Doctor Strange",
                "Wolverine", "Deadpool", "Viuda Negra", "Ojo de Halcón", "Capitana Marvel", "Ant-Man",
                "Green Arrow", "Daredevil", "Luke Cage", "Jessica Jones", "Supergirl", "Vision",
                "Bruja Escarlata", "Cíclope", "Jean Grey", "Noctámbulo", "Profesor X", "Magneto",
                "Rogue", "Tormenta"
            )
        ),

        "videojuegos" to Deck(
            id = "videojuegos",
            name = "Videojuegos",
            category = "Entretenimiento",
            words = listOf(
                "Minecraft", "Fortnite", "Super Mario Bros", "The Legend of Zelda", "Tetris",
                "Pac-Man", "Grand Theft Auto", "Call of Duty", "FIFA", "Pokémon", "World of Warcraft",
                "Overwatch", "League of Legends", "Counter-Strike", "Final Fantasy", "Los Sims",
                "Assassin’s Creed", "Resident Evil", "Among Us", "Red Dead Redemption", "Halo",
                "God of War", "Street Fighter", "Metal Gear Solid", "Doom", "Half-Life", "Portal",
                "Skyrim", "Fallout", "Dark Souls", "Cyberpunk 2077", "Animal Crossing", "Splatoon"
            )
        ),

        "libros_literatura" to Deck(
            id = "libros_literatura",
            name = "Libros & Literatura",
            category = "Educación",
            words = listOf(
                "Romeo y Julieta", "Orgullo y Prejuicio", "El Gran Gatsby", "Matar a un Ruiseñor",
                "1984", "Guerra y Paz", "Crimen y Castigo", "La Odisea", "Moby Dick", "Don Quijote",
                "El Guardián entre el Centeno", "Un Mundo Feliz", "Jane Eyre", "Cumbres Borrascosas",
                "El Hobbit", "Anna Karénina", "Hamlet", "Macbeth", "El Conde de Montecristo",
                "Los Miserables", "Los Hermanos Karamazov", "Cien Años de Soledad", "Ulises",
                "Madame Bovary", "La Divina Comedia", "¿Por Quién Doblan las Campanas?", "Granja de Animales",
                "Frankenstein", "El Extranjero", "Lolita", "Las Uvas de la Ira", "La Letra Escarlata",
                "Drácula", "Corazón de las Tinieblas"
            )
        ),

        "deportes" to Deck(
            id = "deportes",
            name = "Deportes",
            category = "Actividades",
            words = listOf(
                "Fútbol", "Baloncesto", "Tenis", "Cricket", "Béisbol", "Rugby", "Golf",
                "Hockey sobre hielo", "Bádminton", "Natación", "Ciclismo", "Esquí", "Snowboard",
                "Patinaje", "Boxeo", "Artes Marciales", "Judo", "Karate", "Tiro con Arco", "Voleibol",
                "Tenis de Mesa", "Gimnasia", "Surf", "Vela", "Atletismo", "Esgrima", "Halterofilia",
                "Lucha", "Bobsleigh", "Trineo", "BMX", "Triatlón", "Balonmano", "Polo Acuático"
            )
        ),

        "profesiones" to Deck(
            id = "profesiones",
            name = "Profesiones",
            category = "Educación",
            words = listOf(
                "Médico", "Ingeniero", "Profesor", "Artista", "Escritor", "Actor", "Piloto",
                "Chef", "Enfermero", "Oficial de Policía", "Bombero", "Dentista", "Científico",
                "Abogado", "Periodista", "Fontanero", "Electricista", "Arquitecto", "Farmacéutico",
                "Mecánico", "Veterinario", "Traductor", "Contador", "Terapeuta", "Carpintero",
                "Panadero", "Granjero", "Fotógrafo", "Músico", "Diseñador", "Astronauta",
                "Paramédico", "Juez", "Bibliotecario", "Taxista"
            )
        ),

        "criaturas_míticas" to Deck(
            id = "criaturas_míticas",
            name = "Criaturas Míticas",
            category = "Fantasía",
            words = listOf(
                "Dragón", "Unicornio", "Sirena", "Grifo", "Fénix", "Centauro", "Minotauro",
                "Hombre lobo", "Vampiro", "Zombi", "Pegaso", "Esfinge", "Cíclope", "Kraken",
                "Yetí", "Duende", "Troll", "Hada", "Ogros", "Quimera", "Basilisco", "Cerebro",
                "Hidra", "Gorgona", "Djinn", "Nessie", "Wendigo", "Kelpie", "Selkie", "Mantícora",
                "Sátiro", "Arpía", "Banshee", "Duende"
            )
        ),

        "inventos" to Deck(
            id = "inventos",
            name = "Inventos",
            category = "Educación",
            words = listOf(
                "Teléfono", "Bombilla", "Imprenta", "Rueda", "Brújula", "Televisión",
                "Avión", "Computadora", "Refrigerador", "Cámara", "Microondas", "Microscopio",
                "Telescopio", "Máquina de Vapor", "Antibióticos", "Rayos X", "Radio", "Tijeras",
                "Batería", "Bicicleta", "Motor Eléctrico", "Calculadora", "GPS", "Internet",
                "Teléfono Inteligente", "Unidad de Estado Sólido (SSD)", "Láser", "Impresora 3D",
                "Dron", "Resonancia Magnética (MRI)", "Penicilina", "Motor a Reacción", "Hyperloop"
            )
        ),

        "estilos_de_baile" to Deck(
            id = "estilos_de_baile",
            name = "Estilos de Baile",
            category = "Entretenimiento",
            words = listOf(
                "Ballet", "Salsa", "Hip-Hop", "Tango", "Vals vienés", "Breakdance",
                "Danza contemporánea", "Jazz", "Tap", "Flamenco", "Baile de salón", "Swing",
                "Danza Tribal", "Rumba", "Cha-Cha-Chá", "Foxtrot", "Samba", "Merengue",
                "Bollywood", "Zumba", "Popping", "Locking", "Krumping", "House", "Disco",
                "Polka", "Samba", "Lindy Hop", "Twerking", "Hula", "Kathak", "Kuchipudi",
                "Bhangra"
            )
        ),

        "fobias" to Deck(
            id = "fobias",
            name = "Fobias",
            category = "Psicología",
            words = listOf(
                "Aracnofobia", "Acrofobia", "Claustrofobia", "Agorafobia", "Ofidiofobia",
                "Aerofobia", "Tripofobia", "Aquafobia", "Nictophobia", "Hemofobia",
                "Cinofobia", "Astrafobia", "Misofobia", "Glossophobia", "Necrofobia",
                "Coulrofobia", "Entomofobia", "Tanatofobia", "Piribofobia", "Nomofobia",
                "Xenofobia", "Eisoptrofobia", "Pogonofobia", "Tafobia", "Cacofobia",
                "Geliophobia", "Nictotafobia", "Hapefobia", "Ablutofobia", "Aerodromofobia",
                "Antofobia", "Batifobia", "Cronofobia", "Denktophobia"
            )
        ),

        "emociones_sentimientos" to Deck(
            id = "emociones_sentimientos",
            name = "Emociones & Sentimientos",
            category = "General",
            words = listOf(
                "Felicidad", "Tristeza", "Ira", "Miedo", "Asco", "Sorpresa", "Amor", "Celos",
                "Vergüenza", "Orgullo", "Tumor", "Culpa", "Emoción", "Ansiedad", "Aburrimiento",
                "Confusión", "Frustración", "Decepción", "Esperanza", "Gratitud", "Nostalgia",
                "Soledad", "Euforia", "Serenidad", "Melancolía", "Optimismo", "Pesimismo",
                "Curiosidad", "Empatía", "Simpatía", "Arrepentimiento", "Envidia", "Alivio"
            )
        ),

        "series_de_tv" to Deck(
            id = "series_de_tv",
            name = "Series de TV",
            category = "Entretenimiento",
            words = listOf(
                "Friends", "Breaking Bad", "Game of Thrones", "The Office", "Stranger Things",
                "Los Simpson", "The Crown", "The Mandaloriano", "Seinfeld", "Sherlock",
                "The Walking Dead", "The Big Bang Theory", "Better Call Saul", "Westworld",
                "Black Mirror", "La Casa de Papel", "Chernobyl", "Lost", "Dexter", "Anatomía de Grey",
                "Narcos", "The Witcher", "Mad Men", "Fargo", "House of Cards", "Ozark",
                "Peaky Blinders", "True Detective", "Rick y Morty", "BoJack Horseman",
                "Big Little Lies", "The Boys", "Succession", "Bridgerton", "Oz", "Prison Break"
            )
        ),

        "juegos_de_mesa" to Deck(
            id = "juegos_de_mesa",
            name = "Juegos de Mesa",
            category = "Entretenimiento",
            words = listOf(
                "Monopoly", "Ajedrez", "Scrabble", "Clue", "Risk", "Batalla Naval", "Trivial Pursuit",
                "Catan", "Ticket to Ride", "Pandemic", "Candy Land", "Conecta Cuatro", "Jenga",
                "¿Quién Soy?", "Othello", "Backgammon", "Pictionary", "Uno", "Carcassonne", "Codenames",
                "Dominion", "Sequence", "Scattergories", "Mancala", "Azul", "Twister", "The Resistance",
                "Exploding Kittens", "Gloomhaven", "Eldritch Horror", "7 Wonders", "Terraforming Mars"
            )
        ),

        "frutas_verduras" to Deck(
            id = "frutas_verduras",
            name = "Frutas & Verduras",
            category = "Estilo de vida",
            words = listOf(
                "Manzana", "Plátano", "Zanahoria", "Tomate", "Patata", "Fresa", "Lechuga", "Cebolla",
                "Pepino", "Melocotón", "Pera", "Mango", "Uva", "Sandía", "Brócoli", "Espinaca", "Calabaza",
                "Calabacín", "Berenjena", "Pimiento", "Piña", "Arándano", "Frambuesa", "Cereza", "Papaya",
                "Kiwi", "Albaricoque", "Mora", "Melón", "Coliflor", "Apio", "Espárrago"
            )
        ),

        "vehículos" to Deck(
            id = "vehículos",
            name = "Vehículos",
            category = "General",
            words = listOf(
                "Coche", "Bicicleta", "Avión", "Helicóptero", "Tren", "Barco", "Motocicleta", "Autobús",
                "Camión", "Scooter", "Submarino", "Cohete", "Tractor", "Globo aerostático", "Ambulancia",
                "Camión de bomberos", "Taxi", "Segway", "Yate", "Ferry", "Teleférico", "Rickshaw", "Góndola",
                "Ala delta", "Motoscafo", "Moped", "Patinete", "Patineta", "Trineo de nieve", "Todoterreno",
                "Camión de la basura", "Bulldozer", "Excavadora"
            )
        ),

        "criaturas_del_océano" to Deck(
            id = "criaturas_del_océano",
            name = "Criaturas del Océano",
            category = "Naturaleza",
            words = listOf(
                "Tiburón", "Delfín", "Pulpo", "Medusa", "Ballena", "Caballito de mar", "Estrella de mar", "Cangrejo",
                "Langosta", "Tortuga marina", "Pez espada", "Barracuda", "Pez payaso", "Manta raya",
                "León marino", "Narval", "Pez ángel", "Manatí", "Foca", "Coral", "Anguila", "Erizo de mar",
                "Pez globo", "Sardina", "Ballena azul", "Tiburón martillo", "Orca", "Salmón", "Atún", "Platija"
            )
        ),

        "flores" to Deck(
            id = "flores",
            name = "Flores",
            category = "Naturaleza",
            words = listOf(
                "Rosa", "Tulipán", "Girasol", "Narciso", "Lirio", "Orquídea", "Margarita", "Caléndula",
                "Lavanda", "Peonía", "Crisantemo", "Clavel", "Begonia", "Iris", "Jazmín", "Gardenia",
                "Hibisco", "Magnolia", "Loto", "Amapola", "Zinnia", "Hortensia", "Camelia", "Anémona",
                "Astra", "Ranúnculo", "Dalia", "Fresia", "Geranio", "Madreselva"
            )
        ),

        "planetas_espacio" to Deck(
            id = "planetas_espacio",
            name = "Planetas & Espacio",
            category = "Educación",
            words = listOf(
                "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
                "Plutón", "Sol", "Luna", "Cometa", "Asteroide", "Meteoro", "Vía Láctea", "Agujero Negro",
                "Nebulosa", "Estrella", "Supernova", "Órbita", "Andrómeda", "Telescopio Hubble",
                "Transbordador Espacial", "Satélite", "Eclipse", "Aurora", "Gravedad", "Cohete",
                "Astronauta", "Estación Espacial Internacional", "Lluvia de meteoros", "Big Bang",
                "Materia Oscura", "Cuásar"
            )
        ),

        "memes_internet" to Deck(
            id = "memes_internet",
            name = "Memes de Internet",
            category = "Redes Sociales",
            words = listOf(
                "Doge", "Gato Gruñón", "Success Kid", "Bad Luck Brian", "Overly Attached Girlfriend",
                "Roll Safe", "Hide the Pain Harold", "Mocking SpongeBob", "Arthur Puño",
                "Mujer Gritando al Gato", "This Is Fine", "Philosoraptor", "Pepe the Frog",
                "Salt Bae", "Leonardo DiCaprio Brinda", "Kermit Toma Té", "Wonka Desdeñoso",
                "Ermahgerd", "Y U No", "Epic Fail", "Novio Distraído", "¿Es Esto una Paloma?",
                "Dos Botones", "Mocking SpongeBob", "Cerebro Galáctico", "Pikachu Sorprendido",
                "Change My Mind", "Cerebro en Expansión", "Roll Safe", "Salida Izquierda 12",
                "Uno No Simplemente..."
            )
        ),

        "fenómenos_climáticos" to Deck(
            id = "fenómenos_climáticos",
            name = "Fenómenos Climáticos",
            category = "Naturaleza",
            words = listOf(
                "Arcoíris", "Tormenta Eléctrica", "Tornado", "Huracán", "Ventisca", "Niebla",
                "Rayo", "Granizo", "Tsunami", "Avalancha", "Sequía", "Inundación", "Terremoto",
                "Erupción Volcánica", "Monzón", "Ciclón", "Tormenta de Arena", "Ola de Calor",
                "Helada", "Aurora Boreal", "Tormenta de Polvo", "Micro ráfaga", "Derecho",
                "Chinook", "Seiche", "Aguanieve", "Hielo Negro", "Lluvia Ácida", "Niebla de Humo",
                "Remolino de Agua", "Torbellino", "Tormenta de Hielo"
            )
        ),

        "posturas_yoga" to Deck(
            id = "posturas_yoga",
            name = "Posturas de Yoga",
            category = "Bienestar",
            words = listOf(
                "Perro boca abajo", "Postura del Árbol", "Guerrero I", "Guerrero II",
                "Postura del Niño", "Postura de la Cobra", "Postura del Triángulo",
                "Flexión hacia adelante sentado", "Postura del Puente", "Postura del Cuervo",
                "Postura del Camello", "Plancha", "Postura del Barco", "Postura de la Vaca",
                "Postura del Gato", "Postura del Loto", "Parada de Cabeza", "Postura de la Paloma",
                "Postura de la Montaña", "Postura del Águila", "Postura de la Guirnalda",
                "Postura del Pichón Rey", "Ángulo Abierto Reclinado", "Plancha Lateral",
                "Postura de la Media Luna", "Postura sobre Hombros", "Postura de la Rueda",
                "Postura del Pez", "Postura del Cachorro", "Parada de Cabeza Asistida",
                "Flexión sentada hacia adelante", "Postura del Arco", "Postura del Bebé Feliz"
            )
        ),

        "términos_tecnológicos" to Deck(
            id = "términos_tecnológicos",
            name = "Términos Tecnológicos",
            category = "Educación",
            words = listOf(
                "Algoritmo", "API", "Blockchain", "Computación en la nube", "Ciberguridad",
                "Minería de datos", "Encriptación", "Cortafuegos", "Git", "HTML", "Internet de las Cosas (IoT)",
                "JavaScript", "Kotlin", "Aprendizaje automático", "Nanotecnología", "Código Abierto",
                "Python", "Computación cuántica", "React", "Sin Servidor", "UI/UX", "Realidad Virtual",
                "WebAssembly", "XML", "Y2K", "Zero-Day", "Big Data", "Contenerización", "DevOps",
                "Computación en el borde", "Programación funcional", "Unidad de Procesamiento Gráfico (GPU)",
                "Hashing", "Protocolo de Internet"
            )
        ),

        "géneros_de_juegos_de_mesa" to Deck(
            id = "géneros_de_juegos_de_mesa",
            name = "Géneros de Juegos de Mesa",
            category = "Entretenimiento",
            words = listOf(
                "Estrategia", "Eurogame", "Fiesta", "Cooperativo", "Construcción de mazos",
                "Colocación de trabajadores", "Control de área", "Abstracto", "Juego de dados",
                "Colocación de fichas", "Deducción", "Draft de cartas", "Rompecabezas", "Trivia",
                "Rol", "Miniaturas", "Familiar", "Wargame", "Económico", "Trivia", "Destreza",
                "Faroleo", "Movimiento punto a punto", "Subasta", "Juegos de riesgo", "Colocación de losas",
                "Colección de sets", "Negociación", "Puja", "Puja competitiva", "Tiempo real"
            )
        ),

        "objetos_hogar" to Deck(
            id = "objetos_hogar",
            name = "Objetos del Hogar",
            category = "General",
            words = listOf(
                "Sofá", "Mesa de comedor", "Refrigerador", "Microondas", "Tostadora",
                "Aspiradora", "Lavadora", "Secadora", "Lavavajillas", "Licuadora", "Cafetera",
                "Hervidor", "Aire acondicionado", "Ventilador", "Calefactor", "Lámpara",
                "Estantería", "Cortinas", "Colchón", "Almohada", "Manta", "Espejo", "Alfombra",
                "Toalla", "Bote de basura", "Plancha", "Triturador de basura", "Estufa", "Horno",
                "Fregadero", "Grifo de baño", "Ducha", "Inodoro", "Estructura de cama"
            )
        ),

        "útiles_de_oficina" to Deck(
            id = "útiles_de_oficina",
            name = "Útiles de Oficina",
            category = "General",
            words = listOf(
                "Bolígrafo", "Lápiz", "Cuaderno", "Grapadora", "Clip", "Resaltador",
                "Sobre", "Tijeras", "Cinta adhesiva", "Pizarra", "Marcador", "Calculadora",
                "Carpeta", "Archivador", "Silla de oficina", "Lámpara de escritorio",
                "Impresora", "Monitor", "Teclado", "Ratón", "Unidad USB", "Auriculares",
                "Bloc de notas", "Planificador", "Calendario", "Borrador", "Regla",
                "Desgrapadora", "Portapapeles", "Alfombrilla de ratón", "Escáner", "Notas adhesivas"
            )
        ),

        "componentes_juegos_de_mesa" to Deck(
            id = "componentes_juegos_de_mesa",
            name = "Componentes de Juegos de Mesa",
            category = "Entretenimiento",
            words = listOf(
                "Dado", "Ficha", "Carta", "Marcador", "Tablero", "Baldosa", "Peón", "Mazo",
                "Disco giratorio", "Temporizador", "Cuaderno de puntuación", "Manual", "Miniatura",
                "Soporte de baldosas", "Ficha", "Disco", "Ladrillo", "Dominó", "Dinero", "Cofre",
                "Gema", "Poción de curación", "Ficha de puntos de victoria"
            )
        ),

        "accesorios_de_moda" to Deck(
            id = "accesorios_de_moda",
            name = "Moda & Ropa",
            category = "Estilo de vida",
            words = listOf(
                "Tacones altos", "Jeans ajustados", "Vestido negro corto", "Esmoquin", "Pajarita",
                "Chaqueta de cuero", "Sudadera con capucha", "Vestido veraniego", "Bailarinas",
                "Botas", "Sombrero de fieltro", "Gorra de béisbol", "Gabardina", "Cárdigan",
                "Bikini", "Suéter de cuello alto", "Vestido de cóctel", "Vestido de novia",
                "Top corto", "Pantalones cargo", "Minifalda", "Camiseta vintage", "Bolso de diseñador",
                "Bufanda", "Blazer", "Vestido de cóctel", "Mono", "Camisa de franela", "Shorts de cuero",
                "Pantalones de pijama", "Calcetines de red", "Gafas de sol aviador", "Vestido de lentejuelas",
                "Sombrero", "Peto", "Chaqueta bomber"
            )
        ),

        "tradiciones_festivas" to Deck(
            id = "tradiciones_festivas",
            name = "Tradiciones Festivas",
            category = "Cultura",
            words = listOf(
                "Truco o trato", "Villancicos", "Intercambio de regalos", "Fuegos artificiales",
                "Banquete", "Búsqueda de huevos de Pascua", "Encendido de la Menorá",
                "Decorar el árbol de Navidad", "Cantar canciones de Kwanzaa", "Festival de pasteles de luna",
                "Luces de Diwali", "Desfile de Acción de Gracias", "Deportes de Boxing Day",
                "Desfile de San Patricio", "Oktoberfest", "Altares del Día de los Muertos",
                "Baile del dragón en el Año Nuevo Chino", "Máscaras de Carnaval", "Concurso de disfraces de Halloween",
                "Barbacoa del Día de la Independencia", "Cuenta regresiva de Año Nuevo", "Casa embrujada de Halloween",
                "Tarjetas del Día de San Valentín", "Cuentas de Mardi Gras", "Procesión del Viernes Santo",
                "Iftar de Ramadán", "Oraciones de Rosh Hashaná", "Ayuno de Yom Kipur", "Festival Holi de colores",
                "Noche de Kupala", "Conejo de Pascua", "Festival de Lammas", "Pasteles de luna de Medio Otoño",
                "Velas de Todos los Santos", "Sopa de pastel de arroz de Seollal", "Mesa Haft-Sin de Nowruz"
            )
        )
    )
}
