package com.quasistr.data

import com.quasistr.data.models.Deck
import com.quasistr.data.models.Word

object Decks {
    val exampleDecks = mapOf(
        "Acting" to Deck(
            id = "acting", name = "Acting", category = "General",
            words = listOf(
                Word("Swimming",1),Word("Driving a Car",1),Word("Dancing",1),
                Word("Running",1),Word("Flying a Plane",1),Word("Playing Guitar",1),
                Word("Typing on a Keyboard",1),Word("Eating",1),Word("Sleeping",1),
                Word("Crying",1),Word("Laughing",1),Word("Brushing Teeth",1),
                Word("Climbing",1),Word("Boxing",1),Word("Fishing",1),
                Word("Painting",1),Word("Skiing",1),Word("Playing Soccer",1),
                Word("Reading",1),Word("Riding a Horse",1)
            )
        ),
        "Countries" to Deck(
            id = "countries", name = "Countries", category = "Education",
            words = listOf(
                Word("Germany",1),Word("France",1),Word("Japan",1),Word("Brazil",1),
                Word("Australia",1),Word("Canada",1),Word("Mexico",1),Word("India",1),
                Word("China",1),Word("Russia",1),Word("South Africa",1),Word("Italy",1),
                Word("Spain",1),Word("Portugal",1),Word("Sweden",1),Word("Norway",1),
                Word("Argentina",1),Word("Chile",1),Word("Egypt",1),Word("Kenya",1),
                Word("Poland",1),Word("Greece",1),Word("Iceland",1),Word("Turkey",1),
                Word("Ireland",1),Word("Netherlands",1),Word("Denmark",1),Word("Finland",1),
                Word("Saudi Arabia",1),Word("South Korea",1),Word("New Zealand",1),
                Word("Ukraine",1),Word("Peru",1),Word("Colombia",1),Word("Thailand",1),
                Word("Vietnam",1),Word("Malaysia",1)
            )
        ),
        "Capitals" to Deck(
            id = "capitals", name = "Capitals", category = "Education",
            words = listOf(
                Word("Berlin",1),Word("Paris",1),Word("Tokyo",1),Word("Brasilia",1),
                Word("Canberra",1),Word("Ottawa",1),Word("Mexico City",1),Word("New Delhi",1),
                Word("Beijing",1),Word("Moscow",1),Word("Pretoria",1),Word("Rome",1),
                Word("Madrid",1),Word("Lisbon",1),Word("Stockholm",1),Word("Oslo",1),
                Word("London",1),Word("Washington",1),Word("Cairo",1),Word("Ankara",1),
                Word("Buenos Aires",1),Word("Bangkok",1),Word("Kuala Lumpur",1),
                Word("Seoul",1),Word("Lima",1),Word("Santiago",1),Word("Athens",1),
                Word("Helsinki",1),Word("Dublin",1),Word("Wellington",1),Word("Jakarta",1),
                Word("Riyadh",1),Word("Islamabad",1),Word("Baghdad",1),Word("Tehran",1)
            )
        ),
        "Animals" to Deck(
            id = "animals", name = "Animals", category = "Nature",
            words = listOf(
                Word("Elephant",1),Word("Tiger",1),Word("Kangaroo",1),Word("Penguin",1),
                Word("Eagle",1),Word("Lion",1),Word("Zebra",1),Word("Dolphin",1),
                Word("Shark",1),Word("Whale",1),Word("Rabbit",1),Word("Frog",1),
                Word("Snake",1),Word("Wolf",1),Word("Bear",1),Word("Leopard",1),
                Word("Giraffe",1),Word("Cheetah",1),Word("Rhinoceros",1),Word("Hippopotamus",1),
                Word("Tortoise",1),Word("Crocodile",1),Word("Alligator",1),Word("Camel",1),
                Word("Horse",1),Word("Sheep",1),Word("Cow",1),Word("Goat",1),
                Word("Chicken",1),Word("Duck",1),Word("Parrot",1),Word("Monkey",1),
                Word("Chimpanzee",1),Word("Panda",1),Word("Fox",1),Word("Raccoon",1),
                Word("Owl",1),Word("Bison",1),Word("Hawk",1),Word("Falcon",1),Word("Deer",1)
            )
        ),
        "Movies" to Deck(
            id = "movies", name = "Movies", category = "Entertainment",
            words = listOf(
                Word("Titanic",1),Word("Inception",1),Word("Avatar",1),Word("The Godfather",1),
                Word("Pulp Fiction",1),Word("Gladiator",1),Word("The Matrix",1),Word("Jurassic Park",1),
                Word("Star Wars",1),Word("The Dark Knight",1),Word("Forrest Gump",1),
                Word("Back to the Future",1),Word("Harry Potter",1),Word("The Lord of the Rings",1),
                Word("The Avengers",1),Word("Spider-Man",1),Word("Frozen",1),Word("The Lion King",1),
                Word("Shrek",1),Word("Toy Story",1),Word("Jaws",1),Word("Rocky",1),
                Word("Terminator",1),Word("Finding Nemo",1),Word("Aladdin",1),
                Word("The Wizard of Oz",1),Word("Schindler's List",1),Word("The Shawshank Redemption",1),
                Word("The Silence of the Lambs",1),Word("Casablanca",1),Word("La La Land",1)
            )
        ),
        "Celebrities" to Deck(
            id = "celebrities", name = "Celebrities", category = "Entertainment",
            words = listOf(
                Word("Brad Pitt",1),Word("Angelina Jolie",1),Word("Leonardo DiCaprio",1),
                Word("Meryl Streep",1),Word("Tom Cruise",1),Word("Johnny Depp",1),
                Word("Scarlett Johansson",1),Word("Chris Hemsworth",1),Word("Jennifer Lawrence",1),
                Word("Robert Downey Jr.",1),Word("Will Smith",1),Word("Natalie Portman",1),
                Word("Emma Watson",1),Word("Daniel Radcliffe",1),Word("Hugh Jackman",1),
                Word("Dwayne Johnson",1),Word("Taylor Swift",1),Word("Kanye West",1),
                Word("Beyoncé",1),Word("Lady Gaga",1),Word("Rihanna",1),Word("Drake",1),
                Word("Ed Sheeran",1),Word("Justin Bieber",1),Word("Selena Gomez",1),
                Word("Billie Eilish",1),Word("Keanu Reeves",1),Word("Margot Robbie",1),
                Word("Zendaya",1),Word("Gal Gadot",1),Word("Tom Hanks",1),Word("Morgan Freeman",1)
            )
        ),
        "Fruits" to Deck(
            id = "fruits", name = "Fruits", category = "Lifestyle",
            words = listOf(
                Word("Apple",1),Word("Banana",1),Word("Orange",1),Word("Pineapple",1),
                Word("Strawberry",1),Word("Watermelon",1),Word("Grape",1),Word("Cherry",1),
                Word("Lemon",1),Word("Mango",1),Word("Papaya",1),Word("Pear",1),
                Word("Peach",1),Word("Plum",1),Word("Kiwi",1),Word("Blueberry",1),
                Word("Raspberry",1),Word("Fig",1),Word("Coconut",1),Word("Guava",1),
                Word("Apricot",1),Word("Avocado",1),Word("Cantaloupe",1),Word("Cranberry",1),
                Word("Grapefruit",1),Word("Lychee",1),Word("Melon",1),Word("Nectarine",1),
                Word("Olive",1),Word("Pomegranate",1),Word("Tangerine",1)
            )
        ),
        "Vegetables" to Deck(
            id = "vegetables", name = "Vegetables", category = "Lifestyle",
            words = listOf(
                Word("Carrot",1),Word("Potato",1),Word("Tomato",1),Word("Cucumber",1),
                Word("Spinach",1),Word("Lettuce",1),Word("Onion",1),Word("Garlic",1),
                Word("Pepper",1),Word("Broccoli",1),Word("Cauliflower",1),Word("Zucchini",1),
                Word("Pumpkin",1),Word("Mushroom",1),Word("Radish",1),Word("Eggplant",1),
                Word("Cabbage",1),Word("Celery",1),Word("Beetroot",1),Word("Turnip",1),
                Word("Kale",1),Word("Asparagus",1),Word("Peas",1),Word("Corn",1),
                Word("Artichoke",1),Word("Brussels Sprouts",1),Word("Leek",1),Word("Chili",1),
                Word("Okra",1),Word("Bamboo Shoots",1)
            )
        ),
        "Professions" to Deck(
            id = "professions", name = "Professions", category = "Education",
            words = listOf(
                Word("Doctor",1),Word("Engineer",1),Word("Teacher",1),Word("Artist",1),
                Word("Writer",1),Word("Actor",1),Word("Pilot",1),Word("Chef",1),
                Word("Nurse",1),Word("Police Officer",1),Word("Firefighter",1),Word("Dentist",1),
                Word("Scientist",1),Word("Lawyer",1),Word("Journalist",1),Word("Plumber",1),
                Word("Electrician",1),Word("Architect",1),Word("Pharmacist",1),Word("Therapist",1),
                Word("Surgeon",1),Word("Librarian",1),Word("Musician",1),Word("Photographer",1),
                Word("Designer",1),Word("Mechanic",1),Word("Driver",1),Word("Carpenter",1),
                Word("Builder",1),Word("Veterinarian",1),Word("Translator",1),Word("Accountant",1),
                Word("Programmer",1),Word("Psychologist",1)
            )
        ),
        "Sports" to Deck(
            id = "sports", name = "Sports", category = "Activities",
            words = listOf(
                Word("Football",1),Word("Basketball",1),Word("Tennis",1),Word("Cricket",1),
                Word("Baseball",1),Word("Rugby",1),Word("Golf",1),Word("Hockey",1),
                Word("Badminton",1),Word("Swimming",1),Word("Cycling",1),Word("Skiing",1),
                Word("Snowboarding",1),Word("Skating",1),Word("Wrestling",1),Word("Boxing",1),
                Word("Martial Arts",1),Word("Judo",1),Word("Karate",1),Word("Taekwondo",1),
                Word("Archery",1),Word("Fencing",1),Word("Rowing",1),Word("Diving",1),
                Word("Sailing",1),Word("Gymnastics",1),Word("Surfing",1),Word("Skateboarding",1),
                Word("Volleyball",1),Word("Handball",1)
            )
        ),
        "Colors" to Deck(
            id = "colors", name = "Colors", category = "Lifestyle",
            words = listOf(
                Word("Red",1),Word("Blue",1),Word("Green",1),Word("Yellow",1),
                Word("Purple",1),Word("Orange",1),Word("Pink",1),Word("Black",1),
                Word("White",1),Word("Gray",1),Word("Brown",1),Word("Magenta",1),
                Word("Turquoise",1),Word("Cyan",1),Word("Lavender",1)
            )
        ),
        "Instruments" to Deck(
            id = "instruments", name = "Instruments", category = "Entertainment",
            words = listOf(
                Word("Guitar",1),Word("Piano",1),Word("Violin",1),Word("Drums",1),
                Word("Flute",1),Word("Saxophone",1),Word("Trumpet",1),Word("Harp",1),
                Word("Trombone",1),Word("Cello",1),Word("Clarinet",1),Word("Accordion",1),
                Word("Bagpipes",1),Word("Mandolin",1),Word("Ukulele",1)
            )
        ),
        "Vehicles" to Deck(
            id = "vehicles", name = "Vehicles", category = "Lifestyle",
            words = listOf(
                Word("Car",1),Word("Bicycle",1),Word("Motorcycle",1),Word("Airplane",1),
                Word("Boat",1),Word("Bus",1),Word("Truck",1),Word("Scooter",1),
                Word("Tractor",1),Word("Helicopter",1),Word("Train",1),Word("Submarine",1),
                Word("Skateboard",1),Word("Yacht",1),Word("Canoe",1)
            )
        ),
        "Planets" to Deck(
            id = "planets", name = "Planets", category = "Nature",
            words = listOf(
                Word("Mercury",1),Word("Venus",1),Word("Earth",1),Word("Mars",1),
                Word("Jupiter",1),Word("Saturn",1),Word("Uranus",1),Word("Neptune",1),
                Word("Pluto",1),Word("Europa",1),Word("Io",1),Word("Titan",1),
                Word("Ganymede",1),Word("Callisto",1),Word("Enceladus",1)
            )
        ),
        "Famous Landmarks" to Deck(
            id = "famous_landmarks", name = "Famous Landmarks", category = "Education",
            words = listOf(
                Word("Eiffel Tower",1),Word("Great Wall of China",1),
                Word("Statue of Liberty",1),Word("Machu Picchu",1),Word("Colosseum",1),
                Word("Taj Mahal",1),Word("Pyramids of Giza",1),Word("Big Ben",1),
                Word("Mount Everest",1),Word("Sydney Opera House",1)
            )
        ),
        "Countries' National Dishes" to Deck(
            id = "countries_national_dishes", name = "Countries' National Dishes", category = "Lifestyle",
            words = listOf(
                Word("Sushi (Japan)",1),Word("Pizza (Italy)",1),Word("Tacos (Mexico)",1),
                Word("Paella (Spain)",1),Word("Poutine (Canada)",1),Word("Curry (India)",1),
                Word("Pho (Vietnam)",1),Word("Falafel (Middle East)",1),Word("Fish and Chips (UK)",1),
                Word("Kebab (Turkey)",1)
            )
        ),
        "Superheroes" to Deck(
            id = "superheroes", name = "Superheroes", category = "Entertainment",
            words = listOf(
                Word("Superman",1),Word("Batman",1),Word("Spider-Man",1),Word("Wonder Woman",1),
                Word("Iron Man",1),Word("Captain America",1),Word("Hulk",1),Word("Thor",1),
                Word("Black Panther",1),Word("The Flash",1),Word("Aquaman",1),Word("Doctor Strange",1),
                Word("Wolverine",1),Word("Green Lantern",1),Word("Ant-Man",1)
            )
        ),
        "Famous Books" to Deck(
            id = "famous_books", name = "Famous Books", category = "Education",
            words = listOf(
                Word("1984",1),Word("To Kill a Mockingbird",1),Word("Pride and Prejudice",1),
                Word("The Great Gatsby",1),Word("Moby Dick",1),Word("War and Peace",1),
                Word("The Catcher in the Rye",1),Word("The Lord of the Rings",1),
                Word("The Hobbit",1),Word("Harry Potter",1),Word("Brave New World",1),
                Word("Crime and Punishment",1),Word("Anna Karenina",1),Word("The Odyssey",1),
                Word("Jane Eyre",1)
            )
        ),
        "Musical Instruments (Acting)" to Deck(
            id = "musical_instruments_acting", name = "Musical Instruments (Acting)", category = "Entertainment",
            words = listOf(
                Word("Guitar",1),Word("Violin",1),Word("Drums",1),Word("Flute",1),
                Word("Piano",1),Word("Saxophone",1),Word("Trumpet",1),Word("Harp",1),
                Word("Accordion",1),Word("Trombone",1),Word("Cello",1),Word("Clarinet",1),
                Word("Tambourine",1),Word("Bagpipes",1),Word("Triangle",1)
            )
        ),
        "Famous Inventions" to Deck(
            id = "famous_inventions", name = "Famous Inventions", category = "Education",
            words = listOf(
                Word("Light Bulb",1),Word("Telephone",1),Word("Airplane",1),Word("Computer",1),
                Word("Television",1),Word("Internet",1),Word("Printing Press",1),Word("Steam Engine",1),
                Word("Camera",1),Word("Car",1),Word("Radio",1),Word("Vaccines",1),
                Word("Microscope",1),Word("Penicillin",1),Word("Electricity",1)
            )
        ),
        "Famous Athletes" to Deck(
            id = "famous_athletes", name = "Famous Athletes", category = "Entertainment",
            words = listOf(
                Word("Michael Jordan",1),Word("Serena Williams",1),Word("Usain Bolt",1),
                Word("Lionel Messi",1),Word("Cristiano Ronaldo",1),Word("Roger Federer",1),
                Word("LeBron James",1),Word("Tiger Woods",1),Word("Simone Biles",1)
            )
        ),
        "World Cities" to Deck(
            id = "world_cities", name = "World Cities", category = "Education",
            words = listOf(
                Word("New York",1),Word("London",1),Word("Tokyo",1),Word("Paris",1),
                Word("Los Angeles",1),Word("Moscow",1),Word("Dubai",1),Word("Rome",1),
                Word("Istanbul",1),Word("Sydney",1),Word("Shanghai",1),Word("Mumbai",1),
                Word("Bangkok",1),Word("Rio de Janeiro",1),Word("Hong Kong",1)
            )
        ),
        "Famous Historical Figures" to Deck(
            id = "famous_historical_figures", name = "Famous Historical Figures", category = "Education",
            words = listOf(
                Word("Julius Caesar",1),Word("Napoleon Bonaparte",1),Word("George Washington",1),
                Word("Cleopatra",1),Word("Alexander the Great",1),Word("Mahatma Gandhi",1),
                Word("Winston Churchill",1),Word("Albert Einstein",1),Word("Marie Curie",1)
            )
        ),
        "Fairy Tale Characters" to Deck(
            id = "fairy_tale_characters", name = "Fairy Tale Characters", category = "Entertainment",
            words = listOf(
                Word("Cinderella",1),Word("Snow White",1),Word("The Little Mermaid",1),
                Word("Pinocchio",1),Word("Aladdin",1),Word("Peter Pan",1),Word("Hansel",1),
                Word("Gretel",1),Word("Sleeping Beauty",1),Word("Rapunzel",1)
            )
        ),
        "Famous Explorers" to Deck(
            id = "famous_explorers", name = "Famous Explorers", category = "Education",
            words = listOf(
                Word("Christopher Columbus",1),Word("Marco Polo",1),Word("Vasco da Gama",1),
                Word("Ferdinand Magellan",1),Word("Hernán Cortés",1),Word("James Cook",1),
                Word("Lewis and Clark",1),Word("Neil Armstrong",1),Word("Yuri Gagarin",1)
            )
        ),
        "Famous TV Shows" to Deck(
            id = "famous_tv_shows", name = "Famous TV Shows", category = "Entertainment",
            words = listOf(
                Word("Friends",1),Word("Breaking Bad",1),Word("Game of Thrones",1),
                Word("The Simpsons",1),Word("Stranger Things",1),Word("The Office",1),
                Word("Sherlock",1),Word("The Crown",1),Word("The Walking Dead",1)
            )
        ),
        "Brands and Companies" to Deck(
            id = "brands_and_companies", name = "Brands and Companies", category = "Lifestyle",
            words = listOf(
                Word("Apple",1),Word("Google",1),Word("Microsoft",1),Word("Amazon",1),
                Word("Tesla",1),Word("Facebook",1),Word("Nike",1),Word("Coca-Cola",1),
                Word("Samsung",1),Word("BMW",1),Word("Toyota",1),Word("McDonald's",1),
                Word("IKEA",1),Word("Disney",1),Word("Ferrari",1)
            )
        ),
        "Famous Paintings" to Deck(
            id = "famous_paintings", name = "Famous Paintings", category = "Education",
            words = listOf(
                Word("Mona Lisa",1),Word("The Starry Night",1),Word("The Last Supper",1),
                Word("Girl with a Pearl Earring",1),Word("The Scream",1),Word("American Gothic",1),
                Word("The Birth of Venus",1)
            )
        ),
        "Hobbies" to Deck(
            id = "hobbies", name = "Hobbies", category = "Lifestyle",
            words = listOf(
                Word("Reading",1),Word("Writing",1),Word("Painting",1),Word("Photography",1),
                Word("Gardening",1),Word("Knitting",1),Word("Cooking",1),Word("Fishing",1),
                Word("Hiking",1),Word("Birdwatching",1),Word("Traveling",1)
            )
        ),
        "Body Parts" to Deck(
            id = "body_parts", name = "Body Parts", category = "Education",
            words = listOf(
                Word("Head",1),Word("Shoulder",1),Word("Knee",1),Word("Toe",1),Word("Elbow",1)
            )
        ),
        "Foods" to Deck(
            id = "foods", name = "Foods", category = "Lifestyle",
            words = listOf(
                Word("Pizza",1),Word("Burger",1),Word("Pasta",1),Word("Sushi",1),Word("Fried Chicken",1)
            )
        ),
        "Famous Authors" to Deck(
            id = "famous_authors", name = "Famous Authors", category = "Education",
            words = listOf(
                Word("William Shakespeare",1),Word("J.K. Rowling",1),Word("George Orwell",1)
            )
        ),
        "World War I" to Deck(
            id = "world_war_i", name = "World War I", category = "Education",
            words = listOf(
                Word("Archduke Franz Ferdinand",1),Word("Kaiser Wilhelm II",1),Word("Woodrow Wilson",1)
            )
        ),
        "Roman Empire" to Deck(
            id = "roman_empire", name = "Roman Empire", category = "Education",
            words = listOf(
                Word("Julius Caesar",1),Word("Augustus",1),Word("Nero",1)
            )
        ),
        "Celestial Objects" to Deck(
            id = "celestial_objects", name = "Celestial Objects", category = "Nature",
            words = listOf(
                Word("Sun",1),Word("Moon",1),Word("Mars",1)
            )
        ),
        "Latin America" to Deck(
            id = "latin_america", name = "Latin America", category = "Education",
            words = listOf(
                Word("Brazil",1),Word("Argentina",1),Word("Mexico",1)
            )
        ),
        "Venezuela" to Deck(
            id = "venezuela", name = "Venezuela", category = "Education",
            words = listOf(
                Word("Simón Bolívar",1),Word("Hugo Chávez",1),Word("Caracas",1)
            )
        ),
        "Famous Scientists" to Deck(
            id = "famous_scientists", name = "Famous Scientists", category = "Education",
            words = listOf(
                Word("Isaac Newton",1),Word("Albert Einstein",1),Word("Marie Curie",1)
            )
        ),
        "Dinosaurs" to Deck(
            id = "dinosaurs", name = "Dinosaurs", category = "Education",
            words = listOf(
                Word("Tyrannosaurus Rex",1),Word("Triceratops",1),Word("Stegosaurus",1)
            )
        ),
        "Famous Inventors" to Deck(
            id = "famous_inventors", name = "Famous Inventors", category = "Education",
            words = listOf(
                Word("Thomas Edison",1),Word("Nikola Tesla",1),Word("Alexander Graham Bell",1)
            )
        ),
        "Greek Mythology" to Deck(
            id = "greek_mythology", name = "Greek Mythology", category = "Entertainment",
            words = listOf(
                Word("Zeus",1),Word("Hera",1),Word("Poseidon",1)
            )
        ),
        "Famous Philosophers" to Deck(
            id = "famous_philosophers", name = "Famous Philosophers", category = "Education",
            words = listOf(
                Word("Socrates",1),Word("Plato",1),Word("Aristotle",1)
            )
        ),
        "Famous Composers" to Deck(
            id = "famous_composers", name = "Famous Composers", category = "Education",
            words = listOf(
                Word("Ludwig van Beethoven",1),Word("Wolfgang Amadeus Mozart",1),
                Word("Johann Sebastian Bach",1)
            )
        ),
        "Disney Movies" to Deck(
            id = "disney_movies", name = "Disney Movies", category = "Entertainment",
            words = listOf(
                Word("The Lion King",1),Word("Aladdin",1),Word("Beauty and the Beast",1)
            )
        ),
        "Mythical Creatures" to Deck(
            id = "mythical_creatures", name = "Mythical Creatures", category = "Entertainment",
            words = listOf(
                Word("Dragon",1),Word("Phoenix",1),Word("Unicorn",1)
            )
        ),
        "Famous Battles" to Deck(
            id = "famous_battles", name = "Famous Battles", category = "Education",
            words = listOf(
                Word("Battle of Waterloo",1),Word("Battle of Thermopylae",1),
                Word("Battle of Gettysburg",1)
            )
        ),
        "Space Missions" to Deck(
            id = "space_missions", name = "Space Missions", category = "Education",
            words = listOf(
                Word("Apollo 11",1),Word("Voyager 1",1),Word("Hubble Space Telescope",1)
            )
        ),
        "Famous Artists" to Deck(
            id = "famous_artists", name = "Famous Artists", category = "Entertainment",
            words = listOf(
                Word("Vincent van Gogh",1),Word("Pablo Picasso",1),Word("Leonardo da Vinci",1)
            )
        ),
        "Greek Gods" to Deck(
            id = "greek_gods", name = "Greek Gods", category = "Entertainment",
            words = listOf(
                Word("Zeus",1),Word("Poseidon",1),Word("Hades",1)
            )
        ),
        "Famous Castles" to Deck(
            id = "famous_castles", name = "Famous Castles", category = "Education",
            words = listOf(
                Word("Neuschwanstein Castle",1),Word("Windsor Castle",1),Word("Edinburgh Castle",1)
            )
        ),
        "Cartoon Characters" to Deck(
            id = "cartoon_characters", name = "Cartoon Characters", category = "Entertainment",
            words = listOf(
                Word("Mickey Mouse",1),Word("Bugs Bunny",1),Word("Scooby-Doo",1)
            )
        ),
        "Famous Dancers" to Deck(
            id = "famous_dancers", name = "Famous Dancers", category = "Entertainment",
            words = listOf(
                Word("Michael Jackson",1),Word("Mikhail Baryshnikov",1),Word("Fred Astaire",1)
            )
        ),
        "Gems and Minerals" to Deck(
            id = "gems_and_minerals", name = "Gems and Minerals", category = "Nature",
            words = listOf(
                Word("Diamond",1),Word("Ruby",1),Word("Sapphire",1)
            )
        ),
        "Festivals Around the World" to Deck(
            id = "festivals_around_the_world", name = "Festivals Around the World", category = "Lifestyle",
            words = listOf(
                Word("Carnival (Brazil)",1),Word("Diwali (India)",1),Word("Oktoberfest (Germany)",1)
            )
        ),
        "Wonders of the World" to Deck(
            id = "wonders_of_the_world", name = "Wonders of the World", category = "Education",
            words = listOf(
                Word("Great Wall of China",1),Word("Petra",1),Word("Christ the Redeemer",1)
            )
        )
    )

    fun getDeckByName(name: String): Deck? {
        return exampleDecks[name]
    }

    fun getWordsByDeckName(name: String): List<String> {
        return exampleDecks[name]?.words?.map { it.text } ?: emptyList()
    }
}
