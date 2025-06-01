package com.quasistr.data.decks

import com.quasistr.data.models.Deck

object EnglishDecks {
    val decks = mapOf(
        "movies" to Deck(
            id = "movies",
            name = "Movies",
            category = "Entertainment",
            words = listOf(
                "Titanic", "Inception", "Avatar", "The Godfather", "Pulp Fiction", "Gladiator",
                "The Matrix", "Jurassic Park", "Star Wars", "The Dark Knight", "Forrest Gump",
                "Back to the Future", "Harry Potter", "The Lord of the Rings", "The Avengers",
                "Spider-Man", "Frozen", "The Lion King", "Shrek", "Toy Story", "Jaws", "Rocky",
                "Terminator", "Finding Nemo", "Aladdin", "The Wizard of Oz", "Schindler's List",
                "The Shawshank Redemption", "The Silence of the Lambs", "Casablanca", "La La Land",
                "Interstellar", "The Departed", "Parasite", "Joker", "Mad Max: Fury Road",
                "Black Panther", "Whiplash", "The Social Network", "Guardians of the Galaxy",
                "A Beautiful Mind", "Get Out", "Logan", "The Revenant", "Once Upon a Time in Hollywood"
            )
        ),

        "acting" to Deck(
            id = "acting",
            name = "Acting",
            category = "General",
            instruction = "No speaking! Use only gestures and body movements",
            words = listOf(
                "Swimming", "Driving a Car", "Dancing", "Running", "Flying a Plane",
                "Playing Guitar", "Typing on a Keyboard", "Eating", "Sleeping", "Crying",
                "Laughing", "Brushing Teeth", "Climbing", "Boxing", "Fishing", "Painting",
                "Skiing", "Playing Soccer", "Reading", "Riding a Horse", "Writing", "Cooking",
                "Exercising", "Singing", "Knitting", "Playing Piano", "Taking a Photo", "Shaving",
                "Putting on Makeup", "Building a Sandcastle", "Conducting an Orchestra", "Juggling",
                "Skateboarding", "Surfing", "Gardening", "Sewing", "Chopping Wood", "Rock Climbing",
                "Playing Basketball", "Archery", "Bowling", "Sculpting"
            )
        ),

        "animals" to Deck(
            id = "animals",
            name = "Animals",
            category = "Nature",
            words = listOf(
                "Elephant", "Tiger", "Kangaroo", "Penguin", "Eagle", "Lion", "Zebra", "Dolphin",
                "Shark", "Whale", "Rabbit", "Frog", "Snake", "Wolf", "Bear", "Leopard", "Giraffe",
                "Cheetah", "Rhinoceros", "Hippopotamus", "Tortoise", "Crocodile", "Alligator",
                "Camel", "Horse", "Sheep", "Cow", "Goat", "Chicken", "Duck", "Parrot", "Monkey",
                "Chimpanzee", "Panda", "Fox", "Raccoon", "Owl", "Bison", "Hawk", "Falcon",
                "Otter", "Koala", "Sloth", "Platypus", "Hedgehog", "Porcupine"
            )
        ),

        "countries" to Deck(
            id = "countries",
            name = "Countries",
            category = "Education",
            words = listOf(
                "Germany", "France", "Japan", "Brazil", "Australia", "Canada", "Mexico", "India",
                "China", "Russia", "South Africa", "Italy", "Spain", "Portugal", "Sweden", "Norway",
                "Argentina", "Chile", "Egypt", "Kenya", "Poland", "Greece", "Iceland", "Turkey",
                "Ireland", "Netherlands", "Denmark", "Finland", "Saudi Arabia", "South Korea",
                "New Zealand", "Ukraine", "Peru", "Colombia", "Thailand", "Vietnam", "Malaysia",
                "Indonesia", "Philippines", "Singapore", "Belgium", "Austria", "Switzerland",
                "Czech Republic", "Hungary", "Romania", "Morocco", "Kenya", "Nigeria"
            )
        ),

        "fantasy_characters" to Deck(
            id = "fantasy_characters",
            name = "Fantasy Characters",
            category = "Entertainment",
            words = listOf(
                "Gandalf", "Jon Snow", "Frodo Baggins", "Harry Potter", "Hermione Granger",
                "Legolas", "Aslan", "Bilbo Baggins", "Daenerys Targaryen", "Tyrion Lannister",
                "Arya Stark", "Gollum", "Merlin", "Dumbledore", "Geralt of Rivia", "Cersei Lannister",
                "Aragorn", "Hagrid", "Yennefer", "Edmund Pevensie", "Luke Skywalker",
                "Princess Leia", "Darth Vader", "Yoda", "Saruman", "Sauron", "Aang", "Jasmine",
                "Elsa", "Maleficent", "Sirius Black", "Radagast", "Eowyn", "Thranduil",
                "Elrond", "Kili", "Tauriel"
            )
        ),

        "sitcom_characters" to Deck(
            id = "sitcom_characters",
            name = "Sitcom Characters",
            category = "Entertainment",
            words = listOf(
                "Michael Scott", "Sheldon Cooper", "Ross Geller", "Rachel Green", "Chandler Bing",
                "Joey Tribbiani", "Phoebe Buffay", "Ted Mosby", "Barney Stinson", "Dwight Schrute",
                "Leslie Knope", "Jake Peralta", "Ron Swanson", "Marshall Eriksen", "Monica Geller",
                "Pam Beesly", "Jim Halpert", "Amy Farrah Fowler", "April Ludgate", "Howard Wolowitz",
                "Larry David", "Claire Dunphy", "Phil Dunphy", "Jay Pritchett", "Cam Tucker",
                "Mitch Pritchett", "Cam Bud Light", "Elaine Benes", "George Costanza", "Cosmo Kramer",
                "Jerry Seinfeld", "Mark Cooper", "Rebecca Bunch", "Dan Conner", "Roseanne Conner"
            )
        ),

        "animated_movies" to Deck(
            id = "animated_movies",
            name = "Animated Movies",
            category = "Entertainment",
            words = listOf(
                "Frozen", "Shrek", "Toy Story", "The Lion King", "Inside Out", "Kung Fu Panda",
                "Zootopia", "Madagascar", "How to Train Your Dragon", "Moana", "Coco",
                "Spirited Away", "Up", "Ratatouille", "Monsters, Inc.", "Beauty and the Beast",
                "Mulan", "Ice Age", "The Incredibles", "Finding Dory", "Wall-E", "Brave",
                "Tangled", "Big Hero 6", "Cars", "Wreck-It Ralph", "Despicable Me", "Spider-Man: Into the Spider-Verse",
                "Kubo and the Two Strings", "Coraline"
            )
        ),

        "youtube_trends" to Deck(
            id = "youtube_trends",
            name = "YouTube Trends",
            category = "Social Media",
            words = listOf(
                "Unboxing Videos", "Mukbang", "Prank Videos", "Reaction Videos", "Vlogging",
                "Gaming Streams", "ASMR", "DIY Tutorials", "Challenge Videos", "Makeup Tutorials",
                "Life Hacks", "Product Reviews", "Haul Videos", "Cooking Channels", "Travel Vlogs",
                "Fitness Routines", "Tech Reviews", "Daily Vlogs", "Educational Videos", "Q&A Videos",
                "Live Streams", "Timelapse Videos", "Stop Motion", "Storytime Videos", "Cover Songs",
                "Dance Covers", "Animated Shorts", "Tutorial Series", "Compilation Videos", "Behind the Scenes"
            )
        ),

        "music_genres" to Deck(
            id = "music_genres",
            name = "Music Genres",
            category = "Music",
            words = listOf(
                "Pop", "Rock", "Hip-Hop", "Jazz", "Classical", "Reggae", "Country", "Blues",
                "EDM", "Dubstep", "R&B", "Metal", "Folk", "K-Pop", "Latin", "Ska", "Gospel",
                "Techno", "Soul", "Punk", "Grunge", "Salsa", "Flamenco", "Afrobeat", "Trance",
                "House", "Bluegrass", "Opera", "Funk", "Disco", "Emo", "Psytrance", "Drum and Bass", "Ambient", "Lo-fi"
            )
        ),

        "world_cuisine" to Deck(
            id = "world_cuisine",
            name = "World Cuisine",
            category = "Lifestyle",
            words = listOf(
                "Pizza", "Sushi", "Tacos", "Paella", "Curry", "Pho", "Falafel", "Goulash", "Poutine",
                "Kimchi", "Hummus", "Baklava", "Lasagna", "Chow Mein", "Croissant", "Pierogi",
                "Burrito", "Kebab", "Dim Sum", "Crepe", "Biryani", "Ramen", "Tapas", "Bratwurst",
                "Moussaka", "Shakshuka", "Empanada", "Chimichanga", "Satay", "Jollof Rice", "Pad Thai", "Sauerbraten", "Paella Valenciana"
            )
        ),

        "landscape_features" to Deck(
            id = "landscape_features",
            name = "Landscape Features",
            category = "Nature",
            words = listOf(
                "Mountain", "Valley", "Waterfall", "Volcano", "Forest", "Desert", "Canyon", "Island",
                "Glacier", "Lake", "River", "Beach", "Cave", "Cliff", "Swamp", "Prairie", "Hill",
                "Reef", "Plateau", "Lagoon", "Dune", "Rainforest", "Savanna", "Marsh", "Peninsula",
                "Archipelago", "Geyser", "Delta", "Volcanic Crater", "Sea Stack", "Volcanic Plateau", "Badlands"
            )
        ),

        "historical_figures" to Deck(
            id = "historical_figures",
            name = "Historical Figures",
            category = "Education",
            words = listOf(
                "Albert Einstein", "Isaac Newton", "Marie Curie", "Nelson Mandela", "Cleopatra",
                "Julius Caesar", "Napoleon Bonaparte", "Martin Luther King Jr.", "Mahatma Gandhi",
                "Leonardo da Vinci", "Christopher Columbus", "Joan of Arc", "Alexander the Great",
                "Abraham Lincoln", "Winston Churchill", "Galileo Galilei", "Queen Victoria",
                "Thomas Edison", "William Shakespeare", "George Washington", "Genghis Khan",
                "Karl Marx", "Florence Nightingale", "Vladimir Lenin", "Catherine the Great",
                "Elizabeth I", "Thomas Jefferson", "Simon Bolivar", "Attila the Hun", "Suleiman the Magnificent",
                "Cleisthenes", "Tutankhamun"
            )
        ),

        "brands_logos" to Deck(
            id = "brands_logos",
            name = "Brands & Logos",
            category = "Lifestyle",
            words = listOf(
                "Nike", "Adidas", "Coca-Cola", "Apple", "Amazon", "Samsung", "Toyota", "Pepsi",
                "McDonald's", "Starbucks", "Disney", "Microsoft", "Google", "Netflix", "Ferrari",
                "Gucci", "Louis Vuitton", "Rolex", "Facebook", "Lego", "Intel", "Nvidia", "Honda",
                "BMW", "Mercedes-Benz", "Puma", "H&M", "IKEA", "Dell", "Spotify", "Mastercard", "Visa"
            )
        ),

        "famous_artworks" to Deck(
            id = "famous_artworks",
            name = "Famous Artworks",
            category = "Culture",
            words = listOf(
                "Mona Lisa", "Starry Night", "The Scream", "The Last Supper", "Girl with a Pearl Earring",
                "American Gothic", "Guernica", "The Persistence of Memory", "The Birth of Venus",
                "The Night Watch", "Whistler's Mother", "The Kiss", "Creation of Adam", "Water Lilies",
                "The Thinker", "Las Meninas", "The School of Athens", "Sunflowers", "Liberty Leading the People",
                "The Great Wave off Kanagawa", "The Arnolfini Portrait", "The Hay Wain", "Nighthawks", "The Garden of Earthly Delights",
                "Campbell's Soup Cans", "Ophelia", "Venus de Milo", "David", "The Raft of the Medusa", "Christina's World", "The Dancing Faun"
            )
        ),

        "superheroes" to Deck(
            id = "superheroes",
            name = "Superheroes",
            category = "Entertainment",
            words = listOf(
                "Superman", "Batman", "Spider-Man", "Wonder Woman", "Iron Man", "Captain America",
                "Hulk", "Thor", "Black Panther", "Flash", "Aquaman", "Green Lantern", "Doctor Strange",
                "Wolverine", "Deadpool", "Black Widow", "Hawkeye", "Captain Marvel", "Ant-Man",
                "Green Arrow", "Daredevil", "Luke Cage", "Jessica Jones", "Supergirl", "Vision",
                "Scarlet Witch", "Cyclops", "Jean Grey", "Nightcrawler", "Professor X", "Magneto",
                "Rogue", "Storm"
            )
        ),

        "video_games" to Deck(
            id = "video_games",
            name = "Video Games",
            category = "Entertainment",
            words = listOf(
                "Minecraft", "Fortnite", "Super Mario Bros", "The Legend of Zelda", "Tetris",
                "Pac-Man", "Grand Theft Auto", "Call of Duty", "FIFA", "Pokémon", "World of Warcraft",
                "Overwatch", "League of Legends", "Counter-Strike", "Final Fantasy", "The Sims",
                "Assassin's Creed", "Resident Evil", "Among Us", "Red Dead Redemption", "Halo",
                "God of War", "Street Fighter", "Pac-Man", "Metal Gear Solid", "Doom", "Half-Life",
                "Portal", "Skyrim", "Fallout", "Dark Souls", "Cyberpunk 2077", "Animal Crossing", "Splatoon"
            )
        ),

        "books_literature" to Deck(
            id = "books_literature",
            name = "Books & Literature",
            category = "Education",
            words = listOf(
                "Romeo and Juliet", "Pride and Prejudice", "The Great Gatsby", "To Kill a Mockingbird",
                "1984", "War and Peace", "Crime and Punishment", "The Odyssey", "Moby Dick",
                "Don Quixote", "The Catcher in the Rye", "Brave New World", "Jane Eyre", "Wuthering Heights",
                "The Hobbit", "Anna Karenina", "Hamlet", "Macbeth", "The Count of Monte Cristo",
                "Les Misérables", "The Brothers Karamazov", "One Hundred Years of Solitude", "Ulysses",
                "Madame Bovary", "The Divine Comedy", "Catch-22", "Animal Farm", "Frankenstein",
                "The Stranger", "Lolita", "The Grapes of Wrath", "The Scarlet Letter", "Dracula", "Heart of Darkness"
            )
        ),

        "sports" to Deck(
            id = "sports",
            name = "Sports",
            category = "Activities",
            words = listOf(
                "Football", "Basketball", "Tennis", "Cricket", "Baseball", "Rugby", "Golf",
                "Hockey", "Badminton", "Swimming", "Cycling", "Skiing", "Snowboarding", "Skating",
                "Boxing", "Martial Arts", "Judo", "Karate", "Archery", "Volleyball", "Table Tennis",
                "Gymnastics", "Surfing", "Sailing", "Track and Field", "Fencing", "Weightlifting",
                "Wrestling", "Bobsled", "Luge", "BMX", "Triathlon", "Handball", "Water Polo"
            )
        ),

        "professions" to Deck(
            id = "professions",
            name = "Professions",
            category = "Education",
            words = listOf(
                "Doctor", "Engineer", "Teacher", "Artist", "Writer", "Actor", "Pilot", "Chef",
                "Nurse", "Police Officer", "Firefighter", "Dentist", "Scientist", "Lawyer",
                "Journalist", "Plumber", "Electrician", "Architect", "Pharmacist", "Mechanic",
                "Veterinarian", "Translator", "Accountant", "Therapist", "Carpenter", "Baker",
                "Farmer", "Photographer", "Musician", "Designer", "Astronaut", "Paramedic",
                "Judge", "Librarian", "Taxi Driver"
            )
        ),

        "mythical_creatures" to Deck(
            id = "mythical_creatures",
            name = "Mythical Creatures",
            category = "Fantasy",
            words = listOf(
                "Dragon", "Unicorn", "Mermaid", "Griffin", "Phoenix", "Centaur", "Minotaur",
                "Werewolf", "Vampire", "Zombie", "Pegasus", "Sphinx", "Cyclops", "Kraken",
                "Yeti", "Goblin", "Troll", "Fairy", "Ogre", "Chimera", "Basilisk", "Cerberus",
                "Hydra", "Gorgon", "Djinn", "Nessie", "Wendigo", "Kelpie", "Selkie", "Manticore",
                "Satyr", "Harpy", "Banshee", "Leprechaun"
            )
        ),

        "inventions" to Deck(
            id = "inventions",
            name = "Inventions",
            category = "Education",
            words = listOf(
                "Telephone", "Light Bulb", "Printing Press", "Wheel", "Compass", "Television",
                "Airplane", "Computer", "Refrigerator", "Camera", "Microwave", "Microscope",
                "Telescope", "Steam Engine", "Antibiotics", "X-ray", "Radio", "Scissors",
                "Battery", "Bicycle", "Electric Motor", "Telephone", "Calculator", "Printing Press",
                "GPS", "Internet", "Smartphone", "SSD", "Laser", "3D Printer", "Drone", "MRI Scanner",
                "Penicillin", "Jet Engine", "Hyperloop"
            )
        ),

        "dance_styles" to Deck(
            id = "dance_styles",
            name = "Dance Styles",
            category = "Entertainment",
            words = listOf(
                "Ballet", "Salsa", "Hip Hop", "Tango", "Waltz", "Breakdancing", "Contemporary",
                "Jazz", "Tap Dance", "Flamenco", "Ballroom", "Swing", "Belly Dance", "Rumba",
                "Cha-Cha", "Foxtrot", "Samba", "Merengue", "Bollywood", "Zumba", "Popping",
                "Locking", "Krumping", "House", "Disco", "Polka", "Flamenco", "Samba", "Lindy Hop",
                "Twerking", "Hula", "Kathak", "Kuchipudi", "Bhangra"
            )
        ),

        "phobias" to Deck(
            id = "phobias",
            name = "Phobias",
            category = "Psychology",
            words = listOf(
                "Arachnophobia", "Acrophobia", "Claustrophobia", "Agoraphobia", "Ophidiophobia",
                "Aerophobia", "Trypophobia", "Aquaphobia", "Nyctophobia", "Hemophobia",
                "Cynophobia", "Astraphobia", "Mysophobia", "Glossophobia", "Necrophobia",
                "Coulrophobia", "Entomophobia", "Thanatophobia", "Pyrophobia", "Nomophobia",
                "Xenophobia", "Eisoptrophobia", "Pogonophobia", "Taphophobia", "Cacophobia",
                "Geliophobia", "Nyctohylophobia", "Haphephobia", "Ablutophobia", "Aerodromophobia",
                "Anthophobia", "Bathyophobia", "Chronophobia", "Dendrophobia"
            )
        ),

        "emotions_feelings" to Deck(
            id = "emotions_feelings",
            name = "Emotions & Feelings",
            category = "General",
            words = listOf(
                "Happiness", "Sadness", "Anger", "Fear", "Disgust", "Surprise", "Love", "Jealousy",
                "Embarrassment", "Pride", "Shame", "Guilt", "Excitement", "Anxiety", "Boredom",
                "Confusion", "Frustration", "Disappointment", "Hope", "Gratitude", "Nostalgia",
                "Loneliness", "Euphoria", "Serenity", "Melancholy", "Optimism", "Pessimism",
                "Curiosity", "Empathy", "Sympathy", "Regret", "Envy", "Relief"
            )
        ),

        "tv_shows" to Deck(
            id = "tv_shows",
            name = "TV Shows",
            category = "Entertainment",
            words = listOf(
                "Friends", "Breaking Bad", "Game of Thrones", "The Office", "Stranger Things",
                "The Simpsons", "The Crown", "The Mandalorian", "Seinfeld", "Sherlock",
                "The Walking Dead", "The Big Bang Theory", "Better Call Saul", "Westworld",
                "Black Mirror", "Money Heist", "Chernobyl", "Lost", "Dexter", "Grey's Anatomy",
                "Narcos", "The Witcher", "Mad Men", "Fargo", "House of Cards", "Ozark", "Peaky Blinders",
                "True Detective", "Rick and Morty", "BoJack Horseman", "Big Little Lies", "The Boys",
                "Succession", "Bridgerton", "Oz", "Prison Break"
            )
        ),

        "board_games" to Deck(
            id = "board_games",
            name = "Board Games",
            category = "Entertainment",
            words = listOf(
                "Monopoly", "Chess", "Scrabble", "Clue", "Risk", "Battleship", "Trivial Pursuit",
                "Catan", "Ticket to Ride", "Pandemic", "Candy Land", "Connect Four", "Jenga",
                "Guess Who?", "Othello", "Backgammon", "Pictionary", "Uno", "Carcassonne", "Codenames",
                "Dominion", "Sequence", "Scattergories", "Mancala", "Azul", "Twister", "Clue", "The Resistance",
                "Exploding Kittens", "Gloomhaven", "Eldritch Horror", "7 Wonders", "Terraforming Mars"
            )
        ),

        "fruits_vegetables" to Deck(
            id = "fruits_vegetables",
            name = "Fruits & Vegetables",
            category = "Lifestyle",
            words = listOf(
                "Apple", "Banana", "Carrot", "Tomato", "Potato", "Strawberry", "Lettuce", "Onion",
                "Cucumber", "Peach", "Pear", "Mango", "Grapes", "Watermelon", "Broccoli", "Spinach",
                "Pumpkin", "Zucchini", "Eggplant", "Pepper", "Pineapple", "Blueberry", "Raspberry",
                "Cherry", "Papaya", "Kiwi", "Apricot", "Blackberry", "Cantaloupe", "Cauliflower",
                "Celery", "Asparagus", "Beetroot", "Cabbage", "Garlic", "Radish", "Leek"
            )
        ),

        "vehicles" to Deck(
            id = "vehicles",
            name = "Vehicles",
            category = "General",
            words = listOf(
                "Car", "Bicycle", "Airplane", "Helicopter", "Train", "Boat", "Motorcycle", "Bus",
                "Truck", "Scooter", "Submarine", "Rocket", "Tractor", "Hot Air Balloon", "Ambulance",
                "Fire Truck", "Taxi", "Segway", "Yacht", "Ferry", "Cable Car", "Rickshaw", "Gondola",
                "Hovercraft", "Jet Ski", "Moped", "Scooter", "Skateboard", "Segway", "Trolleybus",
                "Garbage Truck", "Bulldozer", "Excavator", "Snowmobile", "ATV"
            )
        ),

        "ocean_creatures" to Deck(
            id = "ocean_creatures",
            name = "Ocean Creatures",
            category = "Nature",
            words = listOf(
                "Shark", "Dolphin", "Octopus", "Jellyfish", "Whale", "Seahorse", "Starfish",
                "Crab", "Lobster", "Sea Turtle", "Swordfish", "Barracuda", "Clownfish", "Manta Ray",
                "Sea Lion", "Narwhal", "Angelfish", "Manatee", "Seal", "Coral", "Eel", "Urchin",
                "Blowfish", "Anchovy", "Barramundi", "Barracuda", "Blue Whale", "Stingray", "Mako Shark",
                "Orca", "Pufferfish", "Salmon", "Tuna", "Flounder"
            )
        ),

        "flowers" to Deck(
            id = "flowers",
            name = "Flowers",
            category = "Nature",
            words = listOf(
                "Rose", "Tulip", "Sunflower", "Daffodil", "Lily", "Orchid", "Daisy", "Marigold",
                "Lavender", "Peony", "Chrysanthemum", "Carnation", "Begonia", "Iris", "Jasmine",
                "Gardenia", "Hibiscus", "Magnolia", "Lotus", "Poppy", "Zinnia", "Hydrangea",
                "Camellia", "Anemone", "Aster", "Buttercup", "Dahlia", "Freesia", "Geranium",
                "Lilac", "Morning Glory", "Narcissus", "Petunia", "Ranunculus", "Snapdragon"
            )
        ),

        "planets_space" to Deck(
            id = "planets_space",
            name = "Planets & Space",
            category = "Education",
            words = listOf(
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune",
                "Pluto", "Sun", "Moon", "Comet", "Asteroid", "Meteor", "Galaxy", "Black Hole",
                "Nebula", "Star", "Supernova", "Orbit", "Milky Way", "Andromeda", "Hubble Telescope",
                "Space Shuttle", "Satellite", "Eclipse", "Aurora", "Gravity", "Rocket", "Astronaut",
                "International Space Station", "Meteor Shower", "Big Bang", "Dark Matter", "Quasar"
            )
        ),

        "internet_memes" to Deck(
            id = "internet_memes",
            name = "Internet Memes",
            category = "Social Media",
            words = listOf(
                "Doge", "Grumpy Cat", "Success Kid", "Bad Luck Brian", "Overly Attached Girlfriend",
                "Roll Safe", "Hide the Pain Harold", "Mocking Spongebob", "Arthur Fist",
                "Woman Yelling at Cat", "This Is Fine", "Philosoraptor", "Pepe the Frog",
                "Salt Bae", "Leonardo DiCaprio Cheers", "Kermit Drinking Tea", "Condescending Wonka",
                "Ermahgerd", "Y U No", "Epic Fail", "Distracted Boyfriend", "Is This A Pigeon?",
                "Two Buttons", "Mocking SpongeBob", "Galaxy Brain", "Surprised Pikachu", "Change My Mind",
                "Expanding Brain", "Roll Safe", "Left Exit 12 Off Ramp", "One Does Not Simply"
            )
        ),

        "weather_phenomena" to Deck(
            id = "weather_phenomena",
            name = "Weather Phenomena",
            category = "Nature",
            words = listOf(
                "Rainbow", "Thunderstorm", "Tornado", "Hurricane", "Blizzard", "Fog", "Lightning",
                "Hail", "Tsunami", "Avalanche", "Drought", "Flood", "Earthquake", "Volcano",
                "Monsoon", "Cyclone", "Dust Storm", "Heat Wave", "Frost", "Aurora Borealis",
                "Sandstorm", "Microburst", "Derecho", "Chinook", "Seiche", "Sleet", "Black Ice",
                "Acid Rain", "Smoke Haze", "Waterspout", "Whirlwind", "Ice Storm", "Snowdrift",
                "Rime Ice"
            )
        ),

        "yoga_poses" to Deck(
            id = "yoga_poses",
            name = "Yoga Poses",
            category = "Wellness",
            words = listOf(
                "Downward Dog", "Tree Pose", "Warrior I", "Warrior II", "Child's Pose", "Cobra Pose",
                "Triangle Pose", "Seated Forward Bend", "Bridge Pose", "Crow Pose", "Camel Pose",
                "Plank Pose", "Boat Pose", "Cow Pose", "Cat Pose", "Lotus Pose", "Headstand",
                "Pigeon Pose", "Mountain Pose", "Eagle Pose", "Garland Pose", "King Pigeon Pose",
                "Reclining Bound Angle Pose", "Side Plank", "Half Moon Pose", "Shoulder Stand",
                "Wheel Pose", "Fish Pose", "Puppy Pose", "Supported Headstand", "Sitting Forward Bend",
                "Boat Pose", "Crow Pose", "Bow Pose", "Happy Baby Pose"
            )
        ),

        // Additional New Decks:

        "tech_terms" to Deck(
            id = "tech_terms",
            name = "Tech Terms",
            category = "Education",
            words = listOf(
                "Algorithm", "API", "Blockchain", "Cloud Computing", "Cybersecurity", "Data Mining",
                "Encryption", "Firewall", "Git", "HTML", "IoT", "JavaScript", "Kotlin", "Machine Learning",
                "Nanotechnology", "Open Source", "Python", "Quantum Computing", "React", "Serverless",
                "UI/UX", "Virtual Reality", "WebAssembly", "XML", "Y2K", "Zero-Day", "Big Data", "Containerization",
                "DevOps", "Edge Computing", "Functional Programming", "Graphics Processing Unit", "Hashing", "Internet Protocol"
            )
        ),

        "board_game_genres" to Deck(
            id = "board_game_genres",
            name = "Board Game Genres",
            category = "Entertainment",
            words = listOf(
                "Strategy", "Eurogame", "Party", "Cooperative", "Deck-building", "Worker Placement",
                "Area Control", "Abstract", "Roll-and-Move", "Tile Placement", "Deduction", "Card Drafting",
                "Puzzle", "Trivia", "Role-Playing", "Miniatures", "Family", "Wargame", "Economic",
                "Trivia", "Dexterity", "Bluffing", "Point-to-Point Movement", "Auction", "Push Your Luck",
                "Tile-Laying", "Set Collection", "Negotiation", "Auction", "Bidding", "Real-Time"
            )
        ),

        "household_items" to Deck(
            id = "household_items",
            name = "Household Items",
            category = "General",
            words = listOf(
                "Sofa", "Dining Table", "Refrigerator", "Microwave", "Toaster", "Vacuum Cleaner",
                "Washing Machine", "Dryer", "Dishwasher", "Blender", "Coffee Maker", "Kettle",
                "Air Conditioner", "Fan", "Heater", "Lamp", "Bookshelf", "Curtains", "Mattress",
                "Pillow", "Blanket", "Mirror", "Rug", "Towel", "Trash Can", "Iron", "Garbage Disposal",
                "Stove", "Oven", "Kitchen Sink", "Bathroom Faucet", "Shower", "Toilet", "Bed Frame"
            )
        ),

        "office_supplies" to Deck(
            id = "office_supplies",
            name = "Office Supplies",
            category = "General",
            words = listOf(
                "Pen", "Pencil", "Notebook", "Stapler", "Paper Clip", "Highlighter", "Envelope",
                "Scissors", "Tape", "Whiteboard", "Marker", "Calculator", "Folder", "Binder",
                "Desk Chair", "Desk Lamp", "Printer", "Monitor", "Keyboard", "Mouse", "USB Drive",
                "Calculator", "Headphones", "Notepad", "Planner", "Calendar", "Eraser", "Ruler",
                "Staple Remover", "Clipboard", "Mouse Pad", "Scanner", "Post-it Notes"
            )
        ),

        "board_game_components" to Deck(
            id = "board_game_components",
            name = "Board Game Components",
            category = "Entertainment",
            words = listOf(
                "Dice", "Meeple", "Card", "Token", "Board", "Tile", "Pawn", "Deck", "Spinner",
                "Timer", "Scorepad", "Booklet", "Miniature", "Tile Rack", "Chip", "Disk", "Marker",
                "Rook", "Knight", "Cylinder", "Meeple", "Brick", "Meeple", "Cat Token", "Money",
                "Money", "Crate", "Gem", "Health Potion", "Mana Potion", "Victory Point Token"
            )
        ),

        "fashion_items" to Deck(
            id = "fashion_items",
            name = "Fashion & Clothing",
            category = "Lifestyle",
            words = listOf(
                "High Heels", "Skinny Jeans", "Little Black Dress", "Tuxedo", "Bow Tie",
                "Leather Jacket", "Hoodie", "Sundress", "Ballet Flats", "Combat Boots", "Fedora",
                "Baseball Cap", "Trench Coat", "Cardigan", "Bikini", "Turtleneck", "Prom Dress",
                "Wedding Gown", "Crop Top", "Cargo Pants", "Mini Skirt", "Vintage T-shirt",
                "Designer Handbag", "Stiletto Heels", "Scarf", "Blazer", "Cocktail Dress", "Jumpsuit",
                "Flannel Shirt", "Biker Shorts", "Romper", "Palazzo Pants", "Fishnet Stockings",
                "Aviator Sunglasses", "Sequin Dress", "Boater Hat", "Overalls", "Bomber Jacket"
            )
        ),

        "holiday_traditions" to Deck(
            id = "holiday_traditions",
            name = "Holiday Traditions",
            category = "Culture",
            words = listOf(
                "Trick-or-Treating", "Caroling", "Gift Exchange", "Fireworks", "Feast",
                "Easter Egg Hunt", "Hanukkah Menorah Lighting", "Decorating Christmas Tree",
                "Singing Kwanzaa Songs", "Mooncake Festival", "Diwali Lamps", "Thanksgiving Parade",
                "Boxing Day Sports", "St. Patrick's Day Parade", "Oktoberfest", "Day of the Dead Altars",
                "Lunar New Year Dragon Dance", "Carnival Masks", "Halloween Costume Contest",
                "Fourth of July BBQ", "New Year's Countdown", "Halloween Haunted House",
                "Valentine's Day Cards", "Mardi Gras Beads", "Good Friday Procession",
                "Ramadan Iftar", "Rosh Hashanah Prayers", "Yom Kippur Fasting", "Holi Color Throw",
                "Kupala Night", "Easter Bunny", "Lammas Feast", "Mid-Autumn Festival Mooncakes",
                "All Saints' Day Candles", "Seollal Rice Cake Soup", "Nowruz Haft-Seen Table"
            )
        )
    )
}
