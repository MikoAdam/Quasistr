package com.quasistr.data

import com.quasistr.data.models.Deck
import com.quasistr.data.models.Word

object Decks {
    val exampleDecks = mapOf(
        "Movies" to Deck(
            id = "movies",
            name = "Movies",
            category = "Entertainment",
            words = listOf(
                Word("The Godfather", 2),
                Word("Star Wars", 1),
                Word("Titanic", 1),
                Word("Jurassic Park", 1),
                Word("The Matrix", 2),
                Word("Avatar", 1),
                Word("Inception", 2),
                Word("The Lion King", 1),
                Word("Forrest Gump", 1),
                Word("The Avengers", 1),
                Word("The Dark Knight", 2),
                Word("Pulp Fiction", 2),
                Word("Schindler's List", 3),
                Word("The Shawshank Redemption", 3),
                Word("Fight Club", 2)
            )
        ),
        "Animals" to Deck(
            id = "animals",
            name = "Animals",
            category = "Nature",
            words = listOf(
                Word("Elephant", 1),
                Word("Lion", 1),
                Word("Giraffe", 1),
                Word("Monkey", 1),
                Word("Dolphin", 1),
                Word("Penguin", 1),
                Word("Kangaroo", 1),
                Word("Koala", 1),
                Word("Tiger", 1),
                Word("Zebra", 1),
                Word("Hippopotamus", 2),
                Word("Rhinoceros", 2),
                Word("Octopus", 2),
                Word("Panda", 1),
                Word("Cheetah", 1)
            )
        ),
        "Famous People" to Deck(
            id = "famous_people",
            name = "Famous People",
            category = "Entertainment",
            words = listOf(
                Word("Albert Einstein", 2),
                Word("Michael Jackson", 1),
                Word("Leonardo da Vinci", 2),
                Word("Nelson Mandela", 2),
                Word("Steve Jobs", 1),
                Word("Barack Obama", 1),
                Word("Queen Elizabeth", 1),
                Word("Elvis Presley", 1),
                Word("Marilyn Monroe", 1),
                Word("Charlie Chaplin", 2),
                Word("Mahatma Gandhi", 2),
                Word("William Shakespeare", 2),
                Word("Pablo Picasso", 2),
                Word("Madonna", 1),
                Word("Muhammad Ali", 1)
            )
        ),
        "Geography" to Deck(
            id = "geography",
            name = "Geography",
            category = "Education",
            words = listOf(
                Word("Paris", 1),
                Word("New York", 1),
                Word("Tokyo", 1),
                Word("Amazon River", 1),
                Word("Mount Everest", 1),
                Word("Great Barrier Reef", 2),
                Word("Sahara Desert", 1),
                Word("Grand Canyon", 1),
                Word("Taj Mahal", 2),
                Word("Pyramids of Giza", 2),
                Word("Great Wall of China", 1),
                Word("Machu Picchu", 2),
                Word("Venice", 1),
                Word("Antarctica", 1),
                Word("Niagara Falls", 1)
            )
        ),
        "Food & Drinks" to Deck(
            id = "food_drinks",
            name = "Food & Drinks",
            category = "Lifestyle",
            words = listOf(
                Word("Pizza", 1),
                Word("Sushi", 1),
                Word("Hamburger", 1),
                Word("Coffee", 1),
                Word("Chocolate", 1),
                Word("Ice Cream", 1),
                Word("Pasta", 1),
                Word("Taco", 1),
                Word("Champagne", 1),
                Word("Strawberry", 1),
                Word("Watermelon", 1),
                Word("Croissant", 1),
                Word("Curry", 1),
                Word("Mojito", 1),
                Word("Pancake", 1)
            )
        ),
        "Sports" to Deck(
            id = "sports",
            name = "Sports",
            category = "Activities",
            words = listOf(
                Word("Football", 1),
                Word("Basketball", 1),
                Word("Tennis", 1),
                Word("Swimming", 1),
                Word("Gymnastics", 2),
                Word("Volleyball", 1),
                Word("Baseball", 1),
                Word("Golf", 1),
                Word("Ice Hockey", 1),
                Word("Cycling", 1),
                Word("Marathon", 1),
                Word("Skiing", 1),
                Word("Surfing", 1),
                Word("Rugby", 2),
                Word("Boxing", 1)
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