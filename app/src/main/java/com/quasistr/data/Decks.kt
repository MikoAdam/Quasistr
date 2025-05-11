package com.quasistr.data

import com.quasistr.data.models.Deck
import com.quasistr.data.models.Word

object Decks {
    val gameDecks = mapOf(
        "Movies" to Deck(
            id = "movies", name = "Movies", category = "Entertainment",
            words = listOf(
                Word("Titanic",1), Word("Inception",1), Word("Avatar",1), Word("The Godfather",1),
                Word("Pulp Fiction",1), Word("Gladiator",1), Word("The Matrix",1), Word("Jurassic Park",1),
                Word("Star Wars",1), Word("The Dark Knight",1), Word("Forrest Gump",1),
                Word("Back to the Future",1), Word("Harry Potter",1), Word("The Lord of the Rings",1),
                Word("The Avengers",1), Word("Spider-Man",1), Word("Frozen",1), Word("The Lion King",1),
                Word("Shrek",1), Word("Toy Story",1), Word("Jaws",1), Word("Rocky",1),
                Word("Terminator",1), Word("Finding Nemo",1), Word("Aladdin",1),
                Word("The Wizard of Oz",1), Word("Schindler's List",1), Word("The Shawshank Redemption",1),
                Word("The Silence of the Lambs",1), Word("Casablanca",1), Word("La La Land",1),
                Word("Interstellar",1), Word("The Departed",1), Word("Parasite",1), Word("Joker",1)
            )
        ),
        "Acting" to Deck(
            id = "acting", name = "Acting", category = "General",
            words = listOf(
                Word("Swimming",1), Word("Driving a Car",1), Word("Dancing",1),
                Word("Running",1), Word("Flying a Plane",1), Word("Playing Guitar",1),
                Word("Typing on a Keyboard",1), Word("Eating",1), Word("Sleeping",1),
                Word("Crying",1), Word("Laughing",1), Word("Brushing Teeth",1),
                Word("Climbing",1), Word("Boxing",1), Word("Fishing",1),
                Word("Painting",1), Word("Skiing",1), Word("Playing Soccer",1),
                Word("Reading",1), Word("Riding a Horse",1), Word("Writing",1),
                Word("Cooking",1), Word("Exercising",1), Word("Singing",1),
                Word("Knitting",1), Word("Playing Piano",1), Word("Taking a Photo",1),
                Word("Shaving",1), Word("Putting on Makeup",1), Word("Building a Sandcastle",1),
                Word("Conducting an Orchestra",1), Word("Juggling",1), Word("Skateboarding",1),
                Word("Surfing",1), Word("Gardening",1), Word("Sewing",1), Word("Chopping Wood",1)
            )
        ),
        "Animals" to Deck(
            id = "animals", name = "Animals", category = "Nature",
            words = listOf(
                Word("Elephant",1), Word("Tiger",1), Word("Kangaroo",1), Word("Penguin",1),
                Word("Eagle",1), Word("Lion",1), Word("Zebra",1), Word("Dolphin",1),
                Word("Shark",1), Word("Whale",1), Word("Rabbit",1), Word("Frog",1),
                Word("Snake",1), Word("Wolf",1), Word("Bear",1), Word("Leopard",1),
                Word("Giraffe",1), Word("Cheetah",1), Word("Rhinoceros",1), Word("Hippopotamus",1),
                Word("Tortoise",1), Word("Crocodile",1), Word("Alligator",1), Word("Camel",1),
                Word("Horse",1), Word("Sheep",1), Word("Cow",1), Word("Goat",1),
                Word("Chicken",1), Word("Duck",1), Word("Parrot",1), Word("Monkey",1),
                Word("Chimpanzee",1), Word("Panda",1), Word("Fox",1), Word("Raccoon",1),
                Word("Owl",1), Word("Bison",1), Word("Hawk",1), Word("Falcon",1)
            )
        ),
        "Countries" to Deck(
            id = "countries", name = "Countries", category = "Education",
            words = listOf(
                Word("Germany",1), Word("France",1), Word("Japan",1), Word("Brazil",1),
                Word("Australia",1), Word("Canada",1), Word("Mexico",1), Word("India",1),
                Word("China",1), Word("Russia",1), Word("South Africa",1), Word("Italy",1),
                Word("Spain",1), Word("Portugal",1), Word("Sweden",1), Word("Norway",1),
                Word("Argentina",1), Word("Chile",1), Word("Egypt",1), Word("Kenya",1),
                Word("Poland",1), Word("Greece",1), Word("Iceland",1), Word("Turkey",1),
                Word("Ireland",1), Word("Netherlands",1), Word("Denmark",1), Word("Finland",1),
                Word("Saudi Arabia",1), Word("South Korea",1), Word("New Zealand",1),
                Word("Ukraine",1), Word("Peru",1), Word("Colombia",1), Word("Thailand",1),
                Word("Vietnam",1), Word("Malaysia",1), Word("Indonesia",1), Word("Philippines",1),
                Word("Singapore",1)
            )
        ),
        "Capitals" to Deck(
            id = "capitals", name = "Capitals", category = "Education",
            words = listOf(
                Word("Berlin",1), Word("Paris",1), Word("Tokyo",1), Word("Brasilia",1),
                Word("Canberra",1), Word("Ottawa",1), Word("Mexico City",1), Word("New Delhi",1),
                Word("Beijing",1), Word("Moscow",1), Word("Pretoria",1), Word("Rome",1),
                Word("Madrid",1), Word("Lisbon",1), Word("Stockholm",1), Word("Oslo",1),
                Word("London",1), Word("Washington",1), Word("Cairo",1), Word("Ankara",1),
                Word("Buenos Aires",1), Word("Bangkok",1), Word("Kuala Lumpur",1),
                Word("Seoul",1), Word("Lima",1), Word("Santiago",1), Word("Athens",1),
                Word("Helsinki",1), Word("Dublin",1), Word("Wellington",1), Word("Jakarta",1),
                Word("Riyadh",1), Word("Islamabad",1), Word("Baghdad",1), Word("Tehran",1),
                Word("Hanoi",1), Word("Manila",1), Word("Singapore",1), Word("Brussels",1),
                Word("Vienna",1)
            )
        ),
        "Famous People" to Deck(
            id = "famous_people", name = "Famous People", category = "Entertainment",
            words = listOf(
                Word("Albert Einstein",1), Word("Leonardo da Vinci",1), Word("Michael Jackson",1),
                Word("Marilyn Monroe",1), Word("Muhammad Ali",1), Word("Beyoncé",1),
                Word("Elvis Presley",1), Word("Charlie Chaplin",1), Word("Walt Disney",1),
                Word("Nelson Mandela",1), Word("Mahatma Gandhi",1), Word("Martin Luther King Jr.",1),
                Word("Cleopatra",1), Word("William Shakespeare",1), Word("Pablo Picasso",1),
                Word("Oprah Winfrey",1), Word("Abraham Lincoln",1), Word("Queen Elizabeth",1),
                Word("Elon Musk",1), Word("Steve Jobs",1), Word("Bruce Lee",1),
                Word("Madonna",1), Word("Marie Curie",1), Word("Tiger Woods",1),
                Word("Lady Gaga",1), Word("Brad Pitt",1), Word("Angelina Jolie",1),
                Word("Leonardo DiCaprio",1), Word("Tom Cruise",1), Word("Cristiano Ronaldo",1),
                Word("Lionel Messi",1), Word("Barack Obama",1), Word("Isaac Newton",1),
                Word("Alfred Hitchcock",1), Word("Stephen Hawking",1), Word("Frida Kahlo",1)
            )
        ),
        "Foods" to Deck(
            id = "foods", name = "Foods", category = "Lifestyle",
            words = listOf(
                Word("Pizza",1), Word("Hamburger",1), Word("Sushi",1), Word("Pasta",1),
                Word("French Fries",1), Word("Ice Cream",1), Word("Chocolate",1), Word("Sandwich",1),
                Word("Steak",1), Word("Salad",1), Word("Cake",1), Word("Soup",1),
                Word("Chicken Wings",1), Word("Tacos",1), Word("Curry",1), Word("Seafood",1),
                Word("Pancakes",1), Word("Popcorn",1), Word("Nachos",1), Word("Burrito",1),
                Word("Fried Chicken",1), Word("Hot Dog",1), Word("Noodles",1), Word("Bread",1),
                Word("Pie",1), Word("Cookies",1), Word("Rice",1), Word("Cheese",1),
                Word("Apple",1), Word("Banana",1), Word("Orange",1), Word("Strawberry",1),
                Word("Donut",1), Word("Bagel",1), Word("Sausage",1), Word("Waffles",1),
                Word("Omelette",1), Word("Lasagna",1), Word("Kebab",1)
            )
        ),
        "Sports" to Deck(
            id = "sports", name = "Sports", category = "Activities",
            words = listOf(
                Word("Football",1), Word("Basketball",1), Word("Tennis",1), Word("Cricket",1),
                Word("Baseball",1), Word("Rugby",1), Word("Golf",1), Word("Hockey",1),
                Word("Badminton",1), Word("Swimming",1), Word("Cycling",1), Word("Skiing",1),
                Word("Snowboarding",1), Word("Skating",1), Word("Wrestling",1), Word("Boxing",1),
                Word("Martial Arts",1), Word("Judo",1), Word("Karate",1), Word("Taekwondo",1),
                Word("Archery",1), Word("Fencing",1), Word("Rowing",1), Word("Diving",1),
                Word("Sailing",1), Word("Gymnastics",1), Word("Surfing",1), Word("Skateboarding",1),
                Word("Volleyball",1), Word("Handball",1), Word("Marathon",1), Word("Triathlon",1),
                Word("Pole Vault",1), Word("Shot Put",1), Word("Javelin Throw",1), Word("High Jump",1),
                Word("Long Jump",1), Word("Table Tennis",1), Word("Water Polo",1)
            )
        ),
        "Professions" to Deck(
            id = "professions", name = "Professions", category = "Education",
            words = listOf(
                Word("Doctor",1), Word("Engineer",1), Word("Teacher",1), Word("Artist",1),
                Word("Writer",1), Word("Actor",1), Word("Pilot",1), Word("Chef",1),
                Word("Nurse",1), Word("Police Officer",1), Word("Firefighter",1), Word("Dentist",1),
                Word("Scientist",1), Word("Lawyer",1), Word("Journalist",1), Word("Plumber",1),
                Word("Electrician",1), Word("Architect",1), Word("Pharmacist",1), Word("Therapist",1),
                Word("Surgeon",1), Word("Librarian",1), Word("Musician",1), Word("Photographer",1),
                Word("Designer",1), Word("Mechanic",1), Word("Driver",1), Word("Carpenter",1),
                Word("Builder",1), Word("Veterinarian",1), Word("Translator",1), Word("Accountant",1),
                Word("Programmer",1), Word("Psychologist",1), Word("Baker",1), Word("Farmer",1),
                Word("Hairdresser",1), Word("Astronaut",1), Word("Paramedic",1), Word("Judge",1)
            )
        ),
        "Celebrities" to Deck(
            id = "celebrities", name = "Celebrities", category = "Entertainment",
            words = listOf(
                Word("Brad Pitt",1), Word("Angelina Jolie",1), Word("Leonardo DiCaprio",1),
                Word("Meryl Streep",1), Word("Tom Cruise",1), Word("Johnny Depp",1),
                Word("Scarlett Johansson",1), Word("Chris Hemsworth",1), Word("Jennifer Lawrence",1),
                Word("Robert Downey Jr.",1), Word("Will Smith",1), Word("Natalie Portman",1),
                Word("Emma Watson",1), Word("Daniel Radcliffe",1), Word("Hugh Jackman",1),
                Word("Dwayne Johnson",1), Word("Taylor Swift",1), Word("Kanye West",1),
                Word("Beyoncé",1), Word("Lady Gaga",1), Word("Rihanna",1), Word("Drake",1),
                Word("Ed Sheeran",1), Word("Justin Bieber",1), Word("Selena Gomez",1),
                Word("Billie Eilish",1), Word("Keanu Reeves",1), Word("Margot Robbie",1),
                Word("Zendaya",1), Word("Gal Gadot",1), Word("Tom Hanks",1), Word("Morgan Freeman",1),
                Word("Ryan Reynolds",1), Word("Jennifer Lopez",1), Word("Chris Evans",1),
                Word("Ariana Grande",1), Word("Denzel Washington",1), Word("Nicole Kidman",1)
            )
        ),
        "TV Shows" to Deck(
            id = "tv_shows", name = "TV Shows", category = "Entertainment",
            words = listOf(
                Word("Friends",1), Word("Breaking Bad",1), Word("Game of Thrones",1),
                Word("The Simpsons",1), Word("Stranger Things",1), Word("The Office",1),
                Word("Sherlock",1), Word("The Crown",1), Word("The Walking Dead",1),
                Word("House of Cards",1), Word("Grey's Anatomy",1), Word("Black Mirror",1),
                Word("The Big Bang Theory",1), Word("How I Met Your Mother",1),
                Word("Modern Family",1), Word("The Mandalorian",1), Word("Westworld",1),
                Word("Lost",1), Word("Dexter",1), Word("True Detective",1),
                Word("Peaky Blinders",1), Word("The Witcher",1), Word("Squid Game",1),
                Word("Money Heist",1), Word("The Queen's Gambit",1), Word("Succession",1),
                Word("Bridgerton",1), Word("The Last of Us",1), Word("Ted Lasso",1),
                Word("Family Guy",1), Word("South Park",1), Word("Rick and Morty",1),
                Word("The Handmaid's Tale",1), Word("Euphoria",1), Word("Seinfeld",1)
            )
        ),
        "Fruits & Vegetables" to Deck(
            id = "fruits_and_vegetables", name = "Fruits & Vegetables", category = "Lifestyle",
            words = listOf(
                Word("Apple",1), Word("Banana",1), Word("Orange",1), Word("Pineapple",1),
                Word("Strawberry",1), Word("Watermelon",1), Word("Grape",1), Word("Cherry",1),
                Word("Lemon",1), Word("Mango",1), Word("Papaya",1), Word("Pear",1),
                Word("Peach",1), Word("Plum",1), Word("Kiwi",1), Word("Blueberry",1),
                Word("Raspberry",1), Word("Carrot",1), Word("Potato",1), Word("Tomato",1),
                Word("Cucumber",1), Word("Spinach",1), Word("Lettuce",1), Word("Onion",1),
                Word("Garlic",1), Word("Pepper",1), Word("Broccoli",1), Word("Cauliflower",1),
                Word("Zucchini",1), Word("Pumpkin",1), Word("Mushroom",1), Word("Eggplant",1),
                Word("Cabbage",1), Word("Celery",1), Word("Beetroot",1), Word("Avocado",1),
                Word("Asparagus",1), Word("Corn",1), Word("Radish",1)
            )
        ),
        "Superheroes" to Deck(
            id = "superheroes", name = "Superheroes", category = "Entertainment",
            words = listOf(
                Word("Superman",1), Word("Batman",1), Word("Spider-Man",1), Word("Wonder Woman",1),
                Word("Iron Man",1), Word("Captain America",1), Word("Hulk",1), Word("Thor",1),
                Word("Black Panther",1), Word("The Flash",1), Word("Aquaman",1), Word("Doctor Strange",1),
                Word("Wolverine",1), Word("Green Lantern",1), Word("Ant-Man",1), Word("Black Widow",1),
                Word("Hawkeye",1), Word("Captain Marvel",1), Word("Shazam",1), Word("Scarlet Witch",1),
                Word("Vision",1), Word("Deadpool",1), Word("Daredevil",1), Word("Supergirl",1),
                Word("Green Arrow",1), Word("Cyborg",1), Word("Batgirl",1), Word("Star-Lord",1),
                Word("Groot",1), Word("Rocket Raccoon",1), Word("Gamora",1), Word("Loki",1),
                Word("Professor X",1), Word("Jean Grey",1), Word("Storm",1), Word("Beast",1),
                Word("Cyclops",1), Word("Magneto",1), Word("Silver Surfer",1)
            )
        ),
        "Brands" to Deck(
            id = "brands", name = "Brands", category = "Lifestyle",
            words = listOf(
                Word("Apple",1), Word("Google",1), Word("Microsoft",1), Word("Amazon",1),
                Word("Tesla",1), Word("Facebook",1), Word("Nike",1), Word("Coca-Cola",1),
                Word("Samsung",1), Word("BMW",1), Word("Toyota",1), Word("McDonald's",1),
                Word("IKEA",1), Word("Disney",1), Word("Ferrari",1), Word("Adidas",1),
                Word("Puma",1), Word("Lego",1), Word("Sony",1), Word("Netflix",1),
                Word("Starbucks",1), Word("Pepsi",1), Word("Nintendo",1), Word("Visa",1),
                Word("Mastercard",1), Word("Rolex",1), Word("Gucci",1), Word("Louis Vuitton",1),
                Word("Chanel",1), Word("Mercedes-Benz",1), Word("Audi",1), Word("Porsche",1),
                Word("Lamborghini",1), Word("Spotify",1), Word("Twitter",1), Word("Instagram",1),
                Word("YouTube",1), Word("Intel",1), Word("Nvidia",1)
            )
        ),
        "Musical Instruments" to Deck(
            id = "musical_instruments", name = "Musical Instruments", category = "Entertainment",
            words = listOf(
                Word("Guitar",1), Word("Piano",1), Word("Violin",1), Word("Drums",1),
                Word("Flute",1), Word("Saxophone",1), Word("Trumpet",1), Word("Harp",1),
                Word("Trombone",1), Word("Cello",1), Word("Clarinet",1), Word("Accordion",1),
                Word("Bagpipes",1), Word("Mandolin",1), Word("Ukulele",1), Word("Banjo",1),
                Word("Harmonica",1), Word("Synthesizer",1), Word("Xylophone",1), Word("Maracas",1),
                Word("Tambourine",1), Word("Organ",1), Word("Keyboard",1), Word("Bass Guitar",1),
                Word("Electric Guitar",1), Word("Oboe",1), Word("French Horn",1), Word("Tuba",1),
                Word("Bongos",1), Word("Viola",1), Word("Double Bass",1), Word("Piccolo",1),
                Word("Bassoon",1), Word("Triangle",1), Word("Cymbals",1), Word("Didgeridoo",1)
            )
        ),
        "World Landmarks" to Deck(
            id = "landmarks", name = "World Landmarks", category = "Education",
            words = listOf(
                Word("Eiffel Tower",1), Word("Great Wall of China",1), Word("Statue of Liberty",1),
                Word("Machu Picchu",1), Word("Colosseum",1), Word("Taj Mahal",1),
                Word("Pyramids of Giza",1), Word("Big Ben",1), Word("Mount Everest",1),
                Word("Sydney Opera House",1), Word("Stonehenge",1), Word("Acropolis",1),
                Word("Great Barrier Reef",1), Word("Petra",1), Word("Christ the Redeemer",1),
                Word("Mount Rushmore",1), Word("Niagara Falls",1), Word("Grand Canyon",1),
                Word("Victoria Falls",1), Word("Angkor Wat",1), Word("Mount Fuji",1),
                Word("Leaning Tower of Pisa",1), Word("Burj Khalifa",1), Word("Hagia Sophia",1),
                Word("Tower Bridge",1), Word("Great Sphinx",1), Word("Buckingham Palace",1),
                Word("Sagrada Familia",1), Word("Brandenburg Gate",1), Word("Empire State Building",1),
                Word("Notre Dame Cathedral",1), Word("Louvre Museum",1), Word("Golden Gate Bridge",1)
            )
        ),
        "Books & Literature" to Deck(
            id = "books", name = "Books & Literature", category = "Education",
            words = listOf(
                Word("Romeo and Juliet",1), Word("Pride and Prejudice",1), Word("The Great Gatsby",1),
                Word("To Kill a Mockingbird",1), Word("1984",1), Word("The Lord of the Rings",1),
                Word("Harry Potter",1), Word("War and Peace",1), Word("Crime and Punishment",1),
                Word("The Odyssey",1), Word("Moby Dick",1), Word("Don Quixote",1),
                Word("The Catcher in the Rye",1), Word("Brave New World",1), Word("Jane Eyre",1),
                Word("Wuthering Heights",1), Word("The Alchemist",1), Word("The Hobbit",1),
                Word("Dracula",1), Word("Frankenstein",1), Word("Oliver Twist",1),
                Word("Alice in Wonderland",1), Word("The Little Prince",1), Word("Les Misérables",1),
                Word("Anna Karenina",1), Word("Hamlet",1), Word("Macbeth",1), Word("Othello",1),
                Word("The Count of Monte Cristo",1), Word("The Picture of Dorian Gray",1),
                Word("The Adventures of Sherlock Holmes",1), Word("Little Women",1),
                Word("The Grapes of Wrath",1), Word("A Tale of Two Cities",1),
                Word("Animal Farm",1), Word("The Great Expectations",1)
            )
        ),
        "Video Games" to Deck(
            id = "video_games", name = "Video Games", category = "Entertainment",
            words = listOf(
                Word("Minecraft",1), Word("Fortnite",1), Word("Super Mario Bros",1),
                Word("The Legend of Zelda",1), Word("Tetris",1), Word("Pac-Man",1),
                Word("Grand Theft Auto",1), Word("Call of Duty",1), Word("FIFA",1),
                Word("Pokémon",1), Word("World of Warcraft",1), Word("Overwatch",1),
                Word("League of Legends",1), Word("Counter-Strike",1), Word("Final Fantasy",1),
                Word("The Sims",1), Word("Assassin's Creed",1), Word("Resident Evil",1),
                Word("Street Fighter",1), Word("Mortal Kombat",1), Word("Sonic the Hedgehog",1),
                Word("Halo",1), Word("The Elder Scrolls",1), Word("The Witcher",1),
                Word("Doom",1), Word("Among Us",1), Word("Red Dead Redemption",1),
                Word("God of War",1), Word("Tomb Raider",1), Word("Metal Gear Solid",1),
                Word("Rocket League",1), Word("Valorant",1), Word("Animal Crossing",1),
                Word("Roblox",1), Word("Portal",1), Word("Dark Souls",1)
            )
        ),
        "History" to Deck(
            id = "history", name = "History", category = "Education",
            words = listOf(
                Word("World War II",1), Word("Industrial Revolution",1), Word("French Revolution",1),
                Word("American Revolution",1), Word("Cold War",1), Word("Ancient Egypt",1),
                Word("Roman Empire",1), Word("Ottoman Empire",1), Word("Byzantine Empire",1),
                Word("Middle Ages",1), Word("Renaissance",1), Word("Great Depression",1),
                Word("Civil Rights Movement",1), Word("Space Race",1), Word("Vietnam War",1),
                Word("American Civil War",1), Word("World War I",1), Word("Cuban Missile Crisis",1),
                Word("Berlin Wall",1), Word("Pearl Harbor",1), Word("Watergate Scandal",1),
                Word("Moon Landing",1), Word("Hiroshima and Nagasaki",1), Word("Christopher Columbus",1),
                Word("Declaration of Independence",1), Word("Russian Revolution",1),
                Word("Age of Exploration",1), Word("Fall of Rome",1), Word("Ancient Greece",1),
                Word("Chinese Dynasties",1), Word("Silk Road",1), Word("Black Death",1),
                Word("Magna Carta",1), Word("Spanish Inquisition",1), Word("Crusades",1)
            )
        ),
        "Technology" to Deck(
            id = "technology", name = "Technology", category = "Education",
            words = listOf(
                Word("Smartphone",1), Word("Internet",1), Word("Artificial Intelligence",1),
                Word("Virtual Reality",1), Word("Augmented Reality",1), Word("Cloud Computing",1),
                Word("Blockchain",1), Word("Cryptocurrency",1), Word("Machine Learning",1),
                Word("Big Data",1), Word("Internet of Things",1), Word("Robotics",1),
                Word("3D Printing",1), Word("Social Media",1), Word("Drones",1),
                Word("Self-driving Cars",1), Word("Quantum Computing",1), Word("Cybersecurity",1),
                Word("Wi-Fi",1), Word("Bluetooth",1), Word("GPS",1), Word("Microchip",1),
                Word("Biometrics",1), Word("Facial Recognition",1), Word("Voice Assistant",1),
                Word("Streaming Service",1), Word("Touchscreen",1), Word("USB",1),
                Word("Server",1), Word("Firewall",1), Word("Smart Home",1), Word("Wearable Tech",1),
                Word("5G Network",1), Word("Neural Network",1), Word("Operating System",1)
            )
        ),
        "Space & Astronomy" to Deck(
            id = "space", name = "Space & Astronomy", category = "Nature",
            words = listOf(
                Word("Solar System",1), Word("Black Hole",1), Word("Galaxy",1), Word("Supernova",1),
                Word("Moon",1), Word("Mars",1), Word("Venus",1), Word("Jupiter",1),
                Word("Saturn",1), Word("Mercury",1), Word("Neptune",1), Word("Pluto",1),
                Word("Asteroid",1), Word("Comet",1), Word("Meteor",1), Word("Nebula",1),
                Word("Quasar",1), Word("Pulsar",1), Word("Star",1), Word("Constellation",1),
                Word("Milky Way",1), Word("Andromeda",1), Word("Telescope",1), Word("Satellite",1),
                Word("Space Station",1), Word("Rocket",1), Word("Astronaut",1), Word("NASA",1),
                Word("Space Shuttle",1), Word("Hubble Telescope",1), Word("Exoplanet",1),
                Word("Light Year",1), Word("Eclipse",1), Word("Uranus",1), Word("Neutron Star",1),
                Word("White Dwarf",1), Word("Red Giant",1), Word("Gravity",1), Word("Orbit",1)
            )
        )
    )

    fun getWordsByDeckName(name: String): List<String> {
        return gameDecks[name]?.words?.map { it.text } ?: emptyList()
    }

    fun getAllDeckNames(): List<String> {
        return gameDecks.keys.toList()
    }

    fun getDeckWordCount(name: String): Int {
        return gameDecks[name]?.words?.size ?: 0
    }
}