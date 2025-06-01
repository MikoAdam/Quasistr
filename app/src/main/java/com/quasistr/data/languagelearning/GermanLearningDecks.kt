package com.quasistr.data.languagelearning

import com.quasistr.data.models.LanguageLearningDeck

object GermanLearningDecks {
    val decks = mapOf(
        "german_a1_family" to LanguageLearningDeck(
            id = "german_a1_family",
            targetLanguage = "de",
            level = "A1",
            topic = "Family",
            instruction = "Learn German family words! Act out or describe family relationships",
            words = listOf(
                "der Vater", "die Mutter", "der Sohn", "die Tochter", "der Bruder", "die Schwester",
                "die Großmutter", "der Großvater", "die Eltern", "die Kinder", "die Familie", "der Mann",
                "die Frau", "das Kind", "der Onkel", "die Tante", "der Cousin", "die Cousine", "der Ehemann",
                "die Ehefrau", "die Geschwister", "die Großeltern", "der Neffe", "die Nichte", "die Verwandten",
                "verheiratet", "ledig", "geschieden", "alleinerziehend", "Stiefvater", "Stiefmutter",
                "Stiefbruder", "Stiefschwester", "Schwiegervater", "Schwiegermutter", "Schwager", "Schwägerin",
                "der Enkel", "die Enkelin", "der Uropa", "die Uroma", "Pflegekind", "Pflegeeltern", "Patin", "Pate"
            )
        ),

        "german_a1_colors" to LanguageLearningDeck(
            id = "german_a1_colors",
            targetLanguage = "de",
            level = "A1",
            topic = "Colors",
            words = listOf(
                "rot", "blau", "grün", "gelb", "schwarz", "weiß", "orange", "lila", "rosa", "braun",
                "grau", "bunt", "hell", "dunkel", "die Farbe", "färben", "malen", "das Rot", "das Blau",
                "das Grün", "das Gelb", "rötlich", "bläulich", "grünlich", "gelblich", "regenbogen",
                "farbenfroh", "farblos", "farbig", "mehrfarbig", "pastell", "neon", "knallrot", "tiefblau",
                "hellgrün", "dunkelgrau", "silber", "gold", "beige", "türkisbalu", "violett", "mintgrün"
            )
        ),

        "german_a1_numbers" to LanguageLearningDeck(
            id = "german_a1_numbers",
            targetLanguage = "de",
            level = "A1",
            topic = "Numbers",
            words = listOf(
                "null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun",
                "zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn",
                "achtzehn", "neunzehn", "zwanzig", "einundzwanzig", "zweiundzwanzig", "dreißig",
                "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig", "hundert",
                "zweihundert", "dreihundert", "tausend", "zweitausend", "dreißig", "vierzig", "fünfzig",
                "sechzig", "siebzig", "achtzig", "neunzig", "hunderttausend", "Million"
            )
        ),

        "german_a1_greetings" to LanguageLearningDeck(
            id = "german_a1_greetings",
            targetLanguage = "de",
            level = "A1",
            topic = "Greetings & Basic Phrases",
            words = listOf(
                "Hallo", "Guten Morgen", "Guten Tag", "Guten Abend", "Gute Nacht", "Tschüss", "Auf Wiedersehen",
                "Bis später", "Bis morgen", "Bitte", "Danke", "Vielen Dank", "Entschuldigung", "Es tut mir leid",
                "Ja", "Nein", "Vielleicht", "Wie geht’s?", "Gut, danke", "Und dir?", "Mir geht es gut",
                "Gern geschehen", "Kein Problem", "Alles klar", "Schön, dich kennenzulernen",
                "Ich heiße...", "Mein Name ist...", "Freut mich", "Willkommen", "Herzlich willkommen",
                "Schönen Tag noch", "Viel Spaß", "Gute Reise", "Pass auf dich auf", "Prost", "Gesundheit",
                "Frohe Weihnachten", "Frohes neues Jahr", "Viel Glück", "Herzlichen Glückwunsch"
            )
        ),

        "german_a1_days_months" to LanguageLearningDeck(
            id = "german_a1_days_months",
            targetLanguage = "de",
            level = "A1",
            topic = "Days & Months",
            words = listOf(
                "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag",
                "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September",
                "Oktober", "November", "Dezember", "gestern", "heute", "morgen", "übermorgen",
                "vorgestern", "Woche", "Monat", "Jahr", "Datum", "Uhrzeit", "Sekunde", "Minute",
                "Stunde", "Frühjahr", "Sommer", "Herbst", "Winter", "Wochenende", "Arbeitstag",
                "Feiertag", "Geburtstag", "Geburtsdatum", "Kalender", "Saisonal"
            )
        ),

        "german_a1_clothing" to LanguageLearningDeck(
            id = "german_a1_clothing",
            targetLanguage = "de",
            level = "A1",
            topic = "Clothing",
            words = listOf(
                "das Hemd", "die Hose", "der Rock", "das Kleid", "die Jacke", "der Mantel", "die Schuhe",
                "die Stiefel", "die Socken", "der Hut", "die Mütze", "der Schal", "die Handschuhe",
                "die Bluse", "der Pullover", "das T-Shirt", "die Jeans", "der Anzug", "die Krawatte",
                "der Gürtel", "die Unterhose", "der BH", "die Socke", "der Schuh", "die Sandale",
                "die Socke", "der Strumpf", "die Shorts", "die Badehose", "der Badeanzug", "der Pyjama",
                "der Schlafanzug", "die Unterwäsche", "die Jacke", "der Regenmantel", "der Anorak",
                "die Trainingshose", "die Trainingsjacke", "die Sportbekleidung", "der Rucksack",
                "die Tasche", "die Geldbörse", "die Kappe", "der Handschuh", "die Brille"
            )
        ),

        "german_a1_animals" to LanguageLearningDeck(
            id = "german_a1_animals",
            targetLanguage = "de",
            level = "A1",
            topic = "Animals",
            words = listOf(
                "der Hund", "die Katze", "der Vogel", "der Fisch", "das Pferd", "die Kuh", "das Schwein",
                "das Schaf", "die Ziege", "der Hase", "die Maus", "die Ratte", "der Elefant", "der Löwe",
                "der Tiger", "der Bär", "der Affe", "das Kaninchen", "der Vogel", "das Krokodil",
                "der Frosch", "die Schlange", "die Schildkröte", "der Vogel", "das Kaninchen", "die Fliege",
                "die Biene", "die Ameise", "der Heißluftballon", "der Vogel", "die Giraffe", "der Zeb",
                "das Nashorn", "das Nashorn", "der Fuchs", "der Wolf", "das Reh", "der Hirsch", "die Ente",
                "die Gans", "der Schwan", "die Taube", "der Spatz", "die Eule", "die Fledermaus"
            )
        ),

        "german_a1_bodyparts" to LanguageLearningDeck(
            id = "german_a1_bodyparts",
            targetLanguage = "de",
            level = "A1",
            topic = "Body Parts",
            words = listOf(
                "der Kopf", "das Gesicht", "das Auge", "das Ohr", "die Nase", "der Mund", "der Zahn",
                "der Hals", "die Schulter", "der Arm", "der Ellbogen", "die Hand", "der Finger",
                "der Daumen", "der Brust", "der Rücken", "der Bauch", "der Fuß", "der Zeh", "das Bein",
                "das Knie", "der Knöchel", "der Rücken", "das Herz", "die Lunge", "der Magen", "die Leber",
                "die Niere", "das Gehirn", "die Haut", "das Haar", "der Zeh", "der Ellbogen",
                "die Schulter", "die Taille", "die Hüfte", "die Wange", "das Kinn", "die Stirn"
            )
        ),

        "german_a1_common_verbs" to LanguageLearningDeck(
            id = "german_a1_common_verbs",
            targetLanguage = "de",
            level = "A1",
            topic = "Common Verbs",
            words = listOf(
                "sein", "haben", "gehen", "kommen", "sehen", "hören", "sprechen", "essen", "trinken",
                "wohnen", "leben", "schlafen", "fahren", "laufen", "arbeiten", "spielen", "lesen",
                "schreiben", "kaufen", "verkaufen", "geben", "nehmen", "machen", "nehmen", "finden",
                "verlieren", "denken", "glauben", "wissen", "verstehen", "lernen", "studieren",
                "helfen", "warten", "brauchen", "mögen", "lieben", "lieben", "wollen", "dürfen",
                "müssen", "sollen", "dürfen", "können", "möchten"
            )
        ),

        "german_a1_prepositions" to LanguageLearningDeck(
            id = "german_a1_prepositions",
            targetLanguage = "de",
            level = "A1",
            topic = "Prepositions",
            words = listOf(
                "in", "auf", "unter", "über", "neben", "zwischen", "hinter", "vor", "an", "bei",
                "mit", "ohne", "für", "gegen", "um", "bis", "nach", "von", "aus", "seit", "durch",
                "trotz", "während", "wegen", "innerhalb", "außerhalb", "entlang", "gegenüber",
                "entweder ... oder", "sowohl ... als auch", "weder ... noch", "anstelle", "statt",
                "zugunsten", "unabhängig", "entgegen", "laut", "gemäß", "zufolge", "mangels",
                "mithilfe", "infolge"
            )
        ),

        "german_a1_adjectives_basic" to LanguageLearningDeck(
            id = "german_a1_adjectives_basic",
            targetLanguage = "de",
            level = "A1",
            topic = "Basic Adjectives",
            words = listOf(
                "gut", "schlecht", "groß", "klein", "langsam", "schnell", "kalt", "heiß", "warm",
                "kühl", "schwer", "leicht", "alt", "jung", "neu", "alt", "teuer", "billig", "schön",
                "hässlich", "laut", "leise", "stark", "schwach", "hell", "dunkel", "rund", "eckig",
                "glatt", "rau", "sauber", "schmutzig", "freundlich", "unfreundlich", "glücklich",
                "traurig", "interessant", "langweilig", "hungrig", "durstig", "müde", "gesund",
                "krank", "reich", "arm"
            )
        ),

        "german_a2_food" to LanguageLearningDeck(
            id = "german_a2_food",
            targetLanguage = "de",
            level = "A2",
            topic = "Food",
            words = listOf(
                "das Brot", "der Käse", "die Wurst", "das Fleisch", "das Gemüse", "der Apfel",
                "die Milch", "das Wasser", "der Kaffee", "der Tee", "das Bier", "der Wein",
                "die Butter", "das Ei", "der Fisch", "das Huhn", "die Kartoffel", "die Tomate",
                "die Zwiebel", "der Salat", "die Suppe", "die Nudeln", "der Reis", "das Obst",
                "die Banane", "die Orange", "die Schokolade", "der Kuchen", "das Eis", "der Zucker",
                "das Salz", "der Pfeffer", "süß", "sauer", "salzig", "bitter", "würzig", "fettig",
                "gesund", "ungesund", "der Fisch", "die Meeresfrüchte", "der Reis", "die Bohne",
                "der Erdapfel", "die Paprika", "die Karotte", "die Zucchini", "die Aubergine"
            )
        ),

        "german_a2_travel" to LanguageLearningDeck(
            id = "german_a2_travel",
            targetLanguage = "de",
            level = "A2",
            topic = "Travel",
            words = listOf(
                "die Reise", "der Urlaub", "das Flugzeug", "der Bahnhof", "der Zug", "der Bus",
                "das Auto", "das Taxi", "die U-Bahn", "die Fahrkarte", "das Hotel", "die Jugendherberge",
                "die Reservierung", "das Gepäck", "der Koffer", "der Rucksack", "die Fahrkarte",
                "der Fahrschein", "die Ankunft", "die Abfahrt", "die Verspätung", "die Abreise",
                "die Anreise", "das Visum", "der Pass", "der Reisepass", "die Grenzkontrolle",
                "die Sicherheitskontrolle", "der Zoll", "die Reiseroute", "der Reiseführer",
                "die Sehenswürdigkeit", "das Museum", "die Galerie", "der Strand", "die Stadt",
                "das Land", "der Tourismus", "die Fluggesellschaft", "der Check-in",
                "der Check-out", "das Doppelzimmer", "das Einzelzimmer", "der Aufzug",
                "die Rezeption", "das Frühstück", "die Halbpension", "die Vollpension"
            )
        ),

        "german_a2_directions" to LanguageLearningDeck(
            id = "german_a2_directions",
            targetLanguage = "de",
            level = "A2",
            topic = "Directions & Transportation",
            words = listOf(
                "links", "rechts", "geradeaus", "nach oben", "nach unten", "über", "unter",
                "neben", "zwischen", "gegenüber", "die Kreuzung", "die Ampel", "die Straße",
                "der Weg", "die Gabelung", "die Einfahrt", "die Ausfahrt", "der Kreisverkehr",
                "die Brücke", "der Tunnel", "der Fußgängerweg", "die Haltestelle", "die Station",
                "das Schild", "der Verkehr", "die Straße", "die Autobahn", "die Landstraße",
                "die Einbahnstraße", "die Schnellstraße", "die Tankstelle", "die Werkstatt",
                "der Parkplatz", "die Parkuhr", "das Ticket", "die Gebühr", "der Stau",
                "die Abkürzung", "die Umleitung", "die Karte", "der Kompass", "die Richtung",
                "die Orientierung", "die Strecke", "der Kilometer", "die Meile", "die Kreuzung"
            )
        ),

        "german_a2_health" to LanguageLearningDeck(
            id = "german_a2_health",
            targetLanguage = "de",
            level = "A2",
            topic = "Health & Body",
            words = listOf(
                "der Arzt", "die Ärztin", "die Klinik", "das Krankenhaus", "die Praxis", "die Apotheke",
                "die Medizin", "die Tablette", "die Pille", "die Spritze", "die Impfung", "die Krankheit",
                "die Grippe", "der Husten", "die Erkältung", "das Fieber", "der Schmerz", "die Schmerzen",
                "die Verletzung", "die Wunde", "der Verband", "die Operation", "die Behandlung",
                "die Untersuchung", "die Diagnose", "die Therapie", "der Patient", "die Patientin",
                "der Zahnarzt", "der Zahnarzt", "die Zahnschmerzen", "die Blutuntersuchung",
                "der Blutdruck", "der Puls", "die Atmung", "die Entspannung", "die Ernährung",
                "die Diät", "die Bewegung", "der Sport", "das Training", "das Fitnessstudio",
                "der Trainer", "die Übung", "die Erholung", "die Rehabilitation", "die Vorsorgeuntersuchung",
                "die Krankenversicherung", "die Gesundheit"
            )
        ),

        "german_a2_housing" to LanguageLearningDeck(
            id = "german_a2_housing",
            targetLanguage = "de",
            level = "A2",
            topic = "Housing & Home",
            words = listOf(
                "das Haus", "die Wohnung", "das Zimmer", "die Küche", "das Badezimmer", "das Schlafzimmer",
                "das Wohnzimmer", "der Balkon", "der Garten", "die Terrasse", "die Garage", "der Keller",
                "der Dachboden", "das Treppenhaus", "der Flur", "die Tür", "das Fenster", "die Wand",
                "der Boden", "die Decke", "der Tisch", "der Stuhl", "das Bett", "der Schrank",
                "der Schreibtisch", "der Kühlschrank", "der Ofen", "die Heizung", "die Klimaanlage",
                "die Lampe", "die Steckdose", "der Wasserhahn", "die Dusche", "die Badewanne",
                "die Toilette", "das Waschbecken", "die Spüle", "der Herd", "der Geschirrspüler",
                "die Waschmaschine", "der Trockner", "der Staubsauger", "das Sofa", "der Sessel",
                "der Teppich", "der Spiegel", "die Bücherregal"
            )
        ),

        "german_a2_time" to LanguageLearningDeck(
            id = "german_a2_time",
            targetLanguage = "de",
            level = "A2",
            topic = "Time Expressions",
            words = listOf(
                "die Stunde", "die Minute", "die Sekunde", "der Tag", "die Woche", "der Monat",
                "das Jahr", "das Jahrhundert", "der Morgen", "der Vormittag", "der Mittag",
                "der Nachmittag", "der Abend", "die Nacht", "heute", "gestern", "morgen",
                "übermorgen", "vorgestern", "jetzt", "bald", "später", "sofort", "gleich",
                "anwesend", "abwesend", "pünktlich", "zu spät", "früh", "früher", "spät",
                "immer", "nie", "manchmal", "oft", "selten", "gelegentlich", "immernoch",
                "schon", "noch", "bis wann", "seit wann", "wie lange", "während", "vor", "nach",
                "wöchentlich", "monatlich", "jährlich", "täglich"
            )
        ),

        "german_a2_weather" to LanguageLearningDeck(
            id = "german_a2_weather",
            targetLanguage = "de",
            level = "A2",
            topic = "Weather",
            words = listOf(
                "das Wetter", "die Sonne", "die Wolke", "der Regen", "der Schneefall", "der Schnee",
                "die Kälte", "die Hitze", "der Wind", "der Sturm", "der Nebel", "der Frost",
                "der Hagel", "der Donner", "der Blitz", "die Temperatur", "die Wettervorhersage",
                "die Klimaanlage", "der Luftdruck", "die Luftfeuchtigkeit", "der Sonnenschein",
                "der Regenschirm", "die Regenjacke", "der Mantel", "die Temperatur", "die Wetterkarte",
                "die Wetterstation", "der Regenbogen", "der Orkan", "die Brise", "das Gewitter",
                "die Dürre", "die Flut", "der Tsunami", "am Mittag", "am Abend", "am Morgen",
                "heiter", "bewölkt", "regnerisch", "stürmisch", "sonnig", "schneit", "frieren",
                "taut", "über 30 Grad", "unter null Grad"
            )
        ),

        "german_a2_shopping" to LanguageLearningDeck(
            id = "german_a2_shopping",
            targetLanguage = "de",
            level = "A2",
            topic = "Shopping & Money",
            words = listOf(
                "das Geschäft", "das Kaufhaus", "das Einkaufszentrum", "der Markt", "der Supermarkt",
                "der Preis", "die Kosten", "der Rabatt", "der Kuchen", "die Kasse", "die Quittung",
                "das Angebot", "die Nachfrage", "der Verkäufer", "die Verkäuferin", "der Kunde",
                "die Kundin", "die Ware", "das Produkt", "die Marke", "die Größe", "die Farbe",
                "die Umkleidekabine", "der Einkaufswagen", "die Einkaufstasche", "die Brieftasche",
                "das Portemonnaie", "der Geldbeutel", "das Kleingeld", "die Banknote", "die Kreditkarte",
                "die EC-Karte", "der Gutschein", "der Schein", "der Coin", "kostenlos", "teuer",
                "billig", "zahlbar", "unbezahlbar", "die Rechnung", "die Gebühr", "der Betrag",
                "die Rückgabe", "die Umtausch", "die Garantie", "die Lieferung", "der Versand",
                "die Bestellung", "die Zahlung", "das Bargeld"
            )
        ),

        "german_a2_emotions" to LanguageLearningDeck(
            id = "german_a2_emotions",
            targetLanguage = "de",
            level = "A2",
            topic = "Emotions & Feelings",
            words = listOf(
                "glücklich", "traurig", "wütend", "verärgert", "besorgt", "ängstlich", "entspannt",
                "gestresst", "aufgeregt", "langweilig", "interessiert", "zufrieden", "unzufrieden",
                "hoffnungsvoll", "verzweifelt", "stolz", "beschämt", "schuldig", "neugierig", "eifersüchtig",
                "schüchtern", "selbstbewusst", "freundlich", "unfreundlich", "geduldig", "ungeduldig",
                "dankbar", "undankbar", "mitfühlend", "empathisch", "sympathisch", "gereizt",
                "motiviert", "demotiviert", "optimistisch", "pessimistisch", "resigniert",
                "leidenschaftlich", "gleichgültig", "zärtlich", "bitter", "euphorisch", "melancholisch",
                "überrascht", "paranoid", "distanziert", "verbunden", "lieb", "gefährlich"
            )
        ),

        "german_a2_transport" to LanguageLearningDeck(
            id = "german_a2_transport",
            targetLanguage = "de",
            level = "A2",
            topic = "Transport & Vehicles",
            words = listOf(
                "der Bus", "die Bahn", "das Fahrrad", "das Auto", "das Taxi", "der Fahrer",
                "die Fahrerin", "der Lokführer", "der Fahrplan", "der Fahrkartenautomat",
                "die Fahrkarte", "das Ticket", "der Fahrschein", "die Haltestelle", "der Bahnhof",
                "der Flughafen", "das Flugzeug", "der Pilot", "die Pilotin", "die Stewardess",
                "der Passagier", "der Koffer", "das Gepäckband", "die Startbahn", "der Flugsteig",
                "das Flugticket", "die Bordkarte", "das Gepäck", "der Rucksack", "das Navi",
                "das Lenkrad", "das Gaspedal", "die Bremse", "die Kupplung", "das Getriebe",
                "der Motor", "das Fahrzeug", "der Reifen", "die Autobahn", "die Landstraße",
                "der Verkehr", "die Verkehrsmittel", "der Parkplatz", "die Tiefgarage", "die Tankstelle",
                "der Diesel", "das Benzin", "der E-Scooter", "das Moped"
            )
        ),

        // B1-Level Decks
        "german_b1_work_career" to LanguageLearningDeck(
            id = "german_b1_work_career",
            targetLanguage = "de",
            level = "B1",
            topic = "Work & Career",
            words = listOf(
                "der Beruf", "die Karriere", "die Beförderung", "die Kündigung", "die Arbeitslosigkeit",
                "der Lebenslauf", "das Vorstellungsgespräch", "die Bewerbung", "die Qualifikation",
                "die Fortbildung", "das Praktikum", "der Kollege", "die Kollegin", "der Vorgesetzte",
                "die Arbeitszeit", "die Schichtarbeit", "die Teilzeit", "die Vollzeit", "das Gehalt",
                "der Lohn", "die Bezahlung", "die Sozialversicherung", "die Rente", "die Pension",
                "das Steuerformular", "die Steuererklärung", "die Betriebsvereinbarung", "die Gewerkschaft",
                "die Arbeitsbedingungen", "die Haftung", "das Arbeitszeugnis", "die Arbeitskraft",
                "die Branche", "das Unternehmen", "die Niederlassung", "die Filiale", "die Zentrale",
                "die Leitung", "das Management", "die Verantwortung", "der Weiterbildungskurs",
                "die Zeitarbeit", "das Vorstellungsgespräch", "das Arbeitsverhältnis", "der Arbeitgeber",
                "der Arbeitnehmer", "die Teamarbeit", "die Projektleitung", "das Gehaltsabrechnungsblatt",
                "die Arbeitsbelastung", "die Kündigungsfrist"
            )
        ),

        "german_b1_travel_tourism" to LanguageLearningDeck(
            id = "german_b1_travel_tourism",
            targetLanguage = "de",
            level = "B1",
            topic = "Travel & Tourism",
            words = listOf(
                "die Reise", "der Urlaub", "das Hotel", "die Jugendherberge", "die Reservierung",
                "das Gepäck", "der Koffer", "der Rucksack", "die Sehenswürdigkeit", "das Reisebüro",
                "der Reiseführer", "der Tourist", "die Touristin", "die Stadtrundfahrt", "die Fremdenführer/in",
                "die Fluggesellschaft", "der Check-in", "der Check-out", "das Doppelzimmer", "das Einzelzimmer",
                "die Halbpension", "die Vollpension", "das Frühstücksbuffet", "der Zimmerpreis", "die Rezeption",
                "der Aufzug", "die Minibar", "der Safe", "die Klimaanlage", "die Klimaanlage", "die Gästebewertung",
                "der Stadtplan", "das Navigationsgerät", "die Fahrstrecke", "die Gepäckaufbewahrung",
                "der Flughafentransfer", "der Shuttleservice", "die Reiseroute", "die Ausflugsziele",
                "die Reisedokumente", "das Visum", "der Reisepass", "die Grenzkontrolle", "die Sicherheitskontrolle",
                "der Fahrschein", "die Fahrkarte", "die Fahrplanauskunft", "die Verspätung", "die Ankunft",
                "die Abfahrt", "der Flugsteig", "die Gepäckausgabe", "der Duty-Free-Shop"
            )
        ),

        "german_b1_health_body" to LanguageLearningDeck(
            id = "german_b1_health_body",
            targetLanguage = "de",
            level = "B1",
            topic = "Health & Body",
            words = listOf(
                "der Arzt", "die Ärztin", "die Klinik", "das Krankenhaus", "die Praxis", "die Apotheke",
                "die Medizin", "die Tablette", "die Spritze", "die Impfung", "die Behandlung",
                "die Untersuchung", "die Diagnose", "die Therapie", "die Blutuntersuchung", "der Blutdruck",
                "der Puls", "der Herzschlag", "die Lunge", "die Niere", "die Leber", "der Magen",
                "der Darm", "das Gehirn", "das Nervensystem", "das Immunsystem", "die Haut", "das Skelett",
                "der Muskel", "das Gelenk", "der Knochenbruch", "die Wunde", "der Verband", "die Operation",
                "die Narkose", "die Rehabilitation", "die Allergie", "die Infektion", "die Grippe",
                "die Erkältung", "das Fieber", "der Husten", "die Erkältung", "die Entzündung",
                "der Schmerz", "der Kopfschmerz", "die Übelkeit", "der Durchfall", "die Gesundheit",
                "die Vorsorgeuntersuchung", "die Krankenversicherung", "die Zuzahlung"
            )
        ),

        "german_b1_shopping_money" to LanguageLearningDeck(
            id = "german_b1_shopping_money",
            targetLanguage = "de",
            level = "B1",
            topic = "Shopping & Money",
            words = listOf(
                "das Geschäft", "das Kaufhaus", "das Einkaufszentrum", "die Werbung", "das Sonderangebot",
                "der Rabatt", "der Preisnachlass", "die Rechnung", "die Quittung", "die Kasse",
                "der Kassenzettel", "die Umkleidekabine", "die Anprobe", "die Rückgabe", "der Umtausch",
                "der Verkäufer", "die Verkäuferin", "der Kunde", "die Kundin", "das Warenangebot",
                "die Auswahl", "die Qualität", "der Markenartikel", "die No-Name-Marke", "der Hersteller",
                "die Produktion", "der Versand", "die Lieferung", "das Online-Shopping", "der Onlineshop",
                "der Warenkorb", "die Zahlungsart", "die Kreditkarte", "die EC-Karte", "der Scheck",
                "das Bargeld", "der Geldautomat", "die Bankfiliale", "das Girokonto", "das Sparkonto",
                "die Überweisung", "die Lastschrift", "die Gebühr", "der Betrag", "die Bilanz",
                "das Budget", "die Kreditwürdigkeit", "die Schulden", "die Investition", "die Rendite"
            )
        ),

        "german_b1_housing_home" to LanguageLearningDeck(
            id = "german_b1_housing_home",
            targetLanguage = "de",
            level = "B1",
            topic = "Housing & Home",
            words = listOf(
                "das Haus", "die Wohnung", "der Mietvertrag", "die Miete", "die Nebenkosten",
                "die Kaution", "die Wohnungsanzeige", "der Makler", "die Provision", "die Immobilie",
                "der Eigentümer", "der Mieter", "der Vermieter", "die Eigentumswohnung", "das Reihenhaus",
                "das Einfamilienhaus", "der Bau", "der Bauantrag", "die Baugenehmigung", "die Renovierung",
                "die Ausstattung", "die Einbauküche", "der Bodenbelag", "die Heizung", "die Zentralheizung",
                "die Fußbodenheizung", "die Klimaanlage", "die Lüftung", "das Dach", "die Fassade",
                "die Isolierung", "die Solarenergie", "der Stromanschluss", "die Elektrik", "die Rohrleitungen",
                "die Sanitäranlagen", "das Badezimmer", "die Badewanne", "die Dusche", "die Toilette",
                "die Waschmaschine", "der Trockner", "der Kühlschrank", "der Herd", "der Backofen",
                "die Geschirrspülmaschine", "die Garage", "der Stellplatz", "der Garten", "die Terrasse"
            )
        ),

// B2-Level Decks
        "german_b2_politics_society" to LanguageLearningDeck(
            id = "german_b2_politics_society",
            targetLanguage = "de",
            level = "B2",
            topic = "Politics & Society",
            words = listOf(
                "die Demokratie", "das Parlament", "die Regierung", "der Anführer", "die Opposition",
                "die Abstimmung", "die Wahl", "der Wahlkampf", "das Wahlergebnis", "die Koalition",
                "die Mehrheit", "die Minderheit", "die Opposition", "die Gesetzgebung", "das Gesetz",
                "das Grundgesetz", "die Verfassung", "die Bürgerrechte", "die Menschenrechte",
                "die Meinungsfreiheit", "die Pressefreiheit", "die Versammlungsfreiheit",
                "die Demonstration", "der Protest", "das Referendum", "die Debatte", "die Rede",
                "die Lobby", "der Lobbyist", "die Politikverdrossenheit", "die Korruption",
                "der Skandal", "die Transparenz", "die Verantwortung", "die Ethik", "die Moral",
                "die Integration", "die Migration", "die Globalisierung", "die Umweltpolitik",
                "der Klimawandel", "die Nachhaltigkeit", "die soziale Gerechtigkeit",
                "die Armutsbekämpfung", "das Sozialsystem", "die Gesundheitsreform",
                "die Bildungspolitik", "der Arbeitsmarkt", "die Arbeitslosenquote", "der Gewerkschaftsverband"
            )
        ),

        "german_b2_business_finance" to LanguageLearningDeck(
            id = "german_b2_business_finance",
            targetLanguage = "de",
            level = "B2",
            topic = "Business & Finance",
            words = listOf(
                "die Wirtschaft", "das Bruttoinlandsprodukt", "die Inflation", "die Deflation",
                "die Rezession", "die Expansion", "der Export", "der Import", "die Handelsbilanz",
                "das Außenhandelsdefizit", "die Währung", "der Euro", "der Dollar", "die Börse",
                "die Aktie", "die Anleihe", "der Anleger", "der Investor", "das Portfolio",
                "das Risikomanagement", "das Finanzamt", "die Steuer", "die Mehrwertsteuer",
                "die Einkommenssteuer", "die Körperschaftsteuer", "der Gewinn", "der Verlust",
                "die Bilanz", "die Gewinn- und Verlustrechnung", "die Gehaltsabrechnung",
                "die Lohnkosten", "das Budget", "der Haushalt", "der Kredit", "die Hypothek",
                "der Zinssatz", "die Verzinsung", "die Dividende", "die Schulden", "die Liquidität",
                "die Insolvenz", "die Restrukturierung", "die Fusion", "die Übernahme", "die Start-up-Kultur",
                "das Geschäftsmodell", "die Marktforschung", "die Kundenbindung", "der Vertrieb"
            )
        ),

        "german_b2_education_learning" to LanguageLearningDeck(
            id = "german_b2_education_learning",
            targetLanguage = "de",
            level = "B2",
            topic = "Education & Learning",
            words = listOf(
                "die Bildung", "das Schulsystem", "die Universität", "die Fachhochschule",
                "die Hochschule", "die Studiengebühren", "das Stipendium", "die Zulassung",
                "die Immatrikulation", "das Semester", "die Prüfungsordnung", "die Klausur",
                "die Hausarbeit", "die Projektarbeit", "die Dissertation", "die Doktorarbeit",
                "der Professor", "die Professorin", "der Dozent", "die Dozentin", "der Student",
                "die Studentin", "der Kommilitone", "die Kommilitonin", "der Stundenplan",
                "der Lehrplan", "das Curriculum", "die Pädagogik", "die Didaktik", "die Methodik",
                "die Lernstrategie", "die Selbstdisziplin", "die Prüfungsvorbereitung",
                "das Lernpensum", "die Studienberatung", "das Austauschprogramm", "das Erasmus-Programm",
                "die Berufsausbildung", "die duale Ausbildung", "die Fortbildung", "die Weiterbildung",
                "das Zertifikat", "die Vervollständigung", "der Abschluss", "die Note", "die Bewertung",
                "die Präsenzveranstaltung", "der Online-Kurs", "das E-Learning"
            )
        ),

        "german_b2_culture_literature" to LanguageLearningDeck(
            id = "german_b2_culture_literature",
            targetLanguage = "de",
            level = "B2",
            topic = "Culture & Literature",
            words = listOf(
                "die Literatur", "der Roman", "die Kurzgeschichte", "das Gedicht", "die Novelle",
                "der Dramatiker", "die Dramatikerin", "das Drama", "die Tragödie", "die Komödie",
                "das Theater", "die Oper", "die Bühne", "die Inszenierung", "das Drehbuch",
                "die Regie", "der Regisseur", "die Regisseurin", "das Publikum", "die Rezension",
                "die Kritik", "die Allegorie", "die Metapher", "das Symbol", "der Protagonist",
                "der Antagonist", "die Handlung", "der Höhepunkt", "die Pointe", "die Ironie",
                "der Satiriker", "die Satire", "die Epik", "die Lyrik", "die Fabel", "die Parabel",
                "der Essay", "die Biografie", "die Autobiografie", "der Bestseller", "die Lesung",
                "die Literaturgeschichte", "die Romantik", "die Aufklärung", "der Expressionismus",
                "die Moderne"
            )
        ),

        // Weitere B1-Level Decks
        "german_b1_daily_routines" to LanguageLearningDeck(
            id = "german_b1_daily_routines",
            targetLanguage = "de",
            level = "B1",
            topic = "Daily Routines",
            words = listOf(
                "aufstehen", "aufwachen", "sich waschen", "Zähne putzen", "sich anziehen",
                "Frühstück machen", "Frühstück essen", "zur Arbeit fahren", "zur Schule gehen",
                "arbeiten", "lernen", "Pause machen", "Mittagessen", "zurückkehren", "nach Hause kommen",
                "Abendessen kochen", "Abendessen essen", "fernsehen", "lesen", "schlafen gehen",
                "sich entspannen", "Sport treiben", "Joggen gehen", "ins Fitnessstudio gehen",
                "einkaufen gehen", "Wäsche waschen", "Staubsaugen", "Hausaufgaben machen",
                "bekommen (Gäste)", "telefonieren", "Chancen nutzen", "Termine vereinbaren",
                "den Tag planen", "Frühstücksei", "To-do-Liste", "Routine", "Gewohnheit"
            )
        ),

        "german_b1_technology_internet" to LanguageLearningDeck(
            id = "german_b1_technology_internet",
            targetLanguage = "de",
            level = "B1",
            topic = "Technology & Internet",
            words = listOf(
                "der Computer", "der Laptop", "das Tablet", "das Smartphone", "die App",
                "die Software", "das Betriebssystem", "die Tastatur", "die Maus", "der Bildschirm",
                "die Datei", "der Ordner", "speichern", "laden", "herunterladen", "hochladen",
                "die Website", "der Browser", "die Suchmaschine", "das Passwort", "die Firewall",
                "das Netzwerk", "der Router", "das WLAN", "die Internetverbindung", "streamen",
                "die Cloud", "das soziale Netzwerk", "der Benutzername", "die Privatsphäre",
                "der Virus", "die Antivirensoftware", "die Datenbank", "das Update", "die App herunterladen",
                "die App installieren", "das Backup", "die Sicherung", "die Entwickler", "die Programmierung",
                "die Programmier­sprache", "der Quellcode", "die Fehlermeldung"
            )
        ),

        "german_b1_environment_nature" to LanguageLearningDeck(
            id = "german_b1_environment_nature",
            targetLanguage = "de",
            level = "B1",
            topic = "Environment & Nature",
            words = listOf(
                "die Umwelt", "der Umweltschutz", "der Klimawandel", "die Erderwärmung",
                "das Treibhausgas", "der CO₂-Ausstoß", "die erneuerbare Energie", "die Solarenergie",
                "die Windenergie", "die Wasserkraft", "die Photovoltaik", "das Recycling",
                "der Müll", "die Mülltrennung", "die Verschmutzung", "die Luftverschmutzung",
                "die Wasserverschmutzung", "der saure Regen", "der Regenwald", "der Wald",
                "der Ozean", "die Meeresverschmutzung", "der Klimaschutz", "der Naturschutz",
                "das Tier- und Pflanzen­schutzgebiet", "der Artenschutz", "die Biodiversität",
                "die Erhaltung", "das Ökosystem", "der Lebensraum", "die Nachhaltigkeit",
                "die Ressource", "das Recyclingpapier", "die Plastikflasche", "das Bienensterben",
                "der Bienenschwarm", "der Habitatverlust", "die bedrohte Art", "die Umwelt­katastrophe"
            )
        ),

// Weitere B2-Level Decks
        "german_b2_science_research" to LanguageLearningDeck(
            id = "german_b2_science_research",
            targetLanguage = "de",
            level = "B2",
            topic = "Science & Research",
            words = listOf(
                "die Forschung", "der Wissenschaftler", "die Wissenschaftlerin", "das Labor",
                "das Experiment", "die Hypothese", "die Theorie", "die Studie", "die Daten",
                "die Statistik", "die Methode", "die Versuchsperson", "die Stichprobe",
                "die Veröffentlichung", "die Fachzeitschrift", "das Peer-Review", "die Erkenntnis",
                "die Entdeckung", "die Innovation", "die Entwicklung", "die Technologie",
                "die Biologie", "die Chemie", "die Physik", "die Geologie", "die Astronomie",
                "die Medizin", "die Genetik", "die Neurologie", "die Psychologie", "die Soziologie",
                "die Anthropologie", "die Ethik", "das Forschungsprojekt", "die Finanzierung",
                "die Förderung", "der Förderantrag", "die Doktorarbeit", "die Postdoc-Stelle",
                "die Professur", "der Lehrstuhl", "der Fachbereich", "die Konferenz",
                "der Vortrag", "die Präsentation", "die Zusammenarbeit", "die Kooperation",
                "die Veröffentlichung", "das Journal", "die Zitierung", "die Originalarbeit"
            )
        ),

        "german_b2_art_music" to LanguageLearningDeck(
            id = "german_b2_art_music",
            targetLanguage = "de",
            level = "B2",
            topic = "Art & Music",
            words = listOf(
                "die Kunst", "der Künstler", "die Künstlerin", "das Gemälde", "die Skulptur",
                "die Ausstellung", "die Galerie", "das Museum", "die Leinwand", "die Farbe",
                "der Pinsel", "die Malerei", "die Fotografie", "die Collage", "die Keramik",
                "die Architektur", "der Architekt", "die Baukunst", "das Konzert", "die Oper",
                "das Orchester", "der Dirigent", "die Dirigentin", "das Klavier", "die Geige",
                "die Gitarre", "das Schlagzeug", "der Schlagzeuger", "die Stimme", "der Sänger",
                "die Sängerin", "die Komposition", "der Komponist", "die Komponistin", "das Lied",
                "die Melodie", "der Rhythmus", "der Takt", "die Harmonie", "die Dissonanz",
                "die Jazzmusik", "die Klassik", "die Rockmusik", "die Popmusik", "das Musikvideo",
                "die Tonaufnahme", "die Platte", "die CD", "der Streamingdienst", "das Festival",
                "die Aufführung", "die Probe", "die Tournee", "die Szene", "der Kunststil"
            )
        ),

        "german_b2_law_order" to LanguageLearningDeck(
            id = "german_b2_law_order",
            targetLanguage = "de",
            level = "B2",
            topic = "Law & Order",
            words = listOf(
                "das Gesetz", "die Verordnung", "die Rechtsordnung", "der Richter", "die Richterin",
                "der Anwalt", "die Anwältin", "die Kanzlei", "der Mandant", "die Mandantin",
                "die Klage", "die Klageerhebung", "die Verhandlung", "das Urteil", "der Beschluss",
                "die Berufung", "das Berufungsgericht", "das Strafgericht", "die Staatsanwaltschaft",
                "der Staatsanwalt", "die Staatsanwältin", "der Angeklagte", "die Angeklagte",
                "die Verteidigung", "die Verteidigerin", "das Strafgesetzbuch", "das Zivilrecht",
                "das Strafrecht", "das Arbeitsrecht", "das Familienrecht", "das Erbrecht",
                "das Mietrecht", "das Vertragsrecht", "die Vertragsfreiheit", "die Haftung",
                "die Schadenersatzforderung", "die Gerichtskosten", "die Verjährung",
                "die öffentliche Sicherheit", "die Strafverfolgung", "die Gefängnisstrafe",
                "die Geldstrafe", "die Bewährungsstrafe", "das Rechtsgut", "die Zeugenvernehmung",
                "das Geständnis", "die Zeugenaussage", "die Beweiserhebung", "die Beweislast"
            )
        ),
        // C1-Level Decks
        "german_c1_politics_society_advanced" to LanguageLearningDeck(
            id = "german_c1_politics_society_advanced",
            targetLanguage = "de",
            level = "C1",
            topic = "Politics & Society (Advanced)",
            words = listOf(
                "Parteigenosse", "Koalitionsverhandlungen", "Wahlbeteiligung", "politische Legitimität", "Populismus",
                "Staatsoberhaupt", "Verfassungsgericht", "Grundrechte", "Minderheitenrechte", "Lobbyismus",
                "Gleichheitsgrundsatz", "Demokratisierung", "Rechtsstaatlichkeit", "Staatsstreich", "Diktatur",
                "Oppositionspolitik", "Sanktionsmaßnahmen", "Kriegsverbrechen", "Menschenrechtsverletzung",
                "Menschenrechtskommission", "Staatshaushalt", "Transparenzgesetz", "Unabhängigkeitserklärung",
                "Selbstbestimmungsrecht", "Staatsverschuldung", "Wirtschaftssanktion", "Diplomatiekanal",
                "Außenpolitik", "Innenpolitik", "Staatsbesuch", "Gastlandkultur", "Immobilienblase", "Wachtumspolitik",
                "Sozialer Ausgleich", "Einkommensungleichheit", "soziale Sicherung", "Flüchtlingskrise",
                "Asylverfahren", "Bleiberecht", "Aussiedler", "Staatsbürgerschaftsnachweis", "Religionsfreiheit",
                "Meinungspluralismus", "Pressezensur", "Informationsfreiheit", "Antikorruptionsgesetz",
                "Parteispendenregelung", "Wahlkampffinanzierung", "Parteiprogramm", "Wahlkreis", "Kanzlerkandidatur",
                "Bundesratsinitiative", "Gesetzesentwurf", "Plenarabschluss", "Stimmrechtsausschluss"
            )
        ),

        "german_c1_science_technology_advanced" to LanguageLearningDeck(
            id = "german_c1_science_technology_advanced",
            targetLanguage = "de",
            level = "C1",
            topic = "Science & Technology (Advanced)",
            words = listOf(
                "Quantenphysik", "Teilchenbeschleuniger", "Gravitationswellen", "Dunkle Materie",
                "Relativitätstheorie", "Kernfusion", "Gentechnik", "CRISPR/Cas9", "Telomeraseaktivität",
                "Epigenetik", "Genexpressionsprofil", "Stammzellforschung", "Klonierung",
                "Neurotransmission", "Neurowissenschaft", "Hirnplastizität", "Biokompatibilität",
                "Biomarker", "Prothesensteuerung", "Organ-auf-Chip-System", "Nanoroboter", "Nanopartikel",
                "Quantencomputer", "Algorithmenkomplexität", "Machine-Learning-Framework", "Neuronales Netzwerk",
                "Deep Learning", "Datenbankmanagementkommunikation", "Kryptographie", "Blockchain-Technologie",
                "Internet der Dinge", "Cyberphysisches System", "Künstliche Intelligenz", "Objekterkennung",
                "Spracherkennung", "Augmented Reality", "Virtuelle Realität", "Augmentation", "3D-Druck",
                "Rapid Prototyping", "Robotikchirurgie", "Bioprinting", "Bioinformatik", "Klimamodelierung",
                "Atmosphärenforschung", "Datenvisualisierung", "Analytische Chemie", "Molekulardiagnostik",
                "Photovoltaikzelle", "Batteriespeichertechnologie", "Energiespeicher", "Wasserkraftwerk",
                "Geothermische Energiegewinnung", "Fusionsenergie", "Weltraumteleskop", "Satellitenkommunikation"
            )
        ),

        "german_c1_business_finance_advanced" to LanguageLearningDeck(
            id = "german_c1_business_finance_advanced",
            targetLanguage = "de",
            level = "C1",
            topic = "Business & Finance (Advanced)",
            words = listOf(
                "Marktkapitalisierung", "Börsenindex", "Währungsrisiko", "Devisengeschäft",
                "Risikokapitalinvestition", "Unternehmensbewertung", "Fusions- und Übernahmestrategie",
                "Due-Diligence-Prüfung", "Wertpapierprospekt", "Aktienrückkaufprogramm",
                "Eigenkapitalrendite", "Ultrakurzeffektivität", "Finanzderivat", "Optionsschein",
                "Termingeschäft", "Swapvertrag", "Mission Statement", "Wettbewerbsanalyse",
                "Wertschöpfungskette", "Interne Revision", "Compliance-Richtlinie", "Corporate Governance",
                "Stakeholder-Management", "Crowdfunding-Plattform", "Start-up-Bewertung", "Pitch-Deck",
                "Wachstumsstrategie", "Diversifikationsstrategie", "Marktdurchdringung", "Portfoliooptimierung",
                "Liquiditätsmanagement", "Bilanzanalyse", "Kennzahlenbenchmarking", "Renditeerwartung",
                "Finanzierungsstruktur", "Kapitalmarktinstrument", "Zinsswapsatz", "Inflationsschutz",
                "Währungsswap", "Leerverkauf", "Verbriefung", "Collateralized Debt Obligation",
                "Verlustvortrag", "Steueroptimierung", "Dividendenstrategie", "Restricted Stock Units",
                "Anreizsystem", "Führungskräftevergütung", "Interne Kontrollsysteme", "Geschäftsführungserfolg"
            )
        ),

        "german_c1_culture_art_literature" to LanguageLearningDeck(
            id = "german_c1_culture_art_literature",
            targetLanguage = "de",
            level = "C1",
            topic = "Culture, Art & Literature (Advanced)",
            words = listOf(
                "Expressionismus", "Impressionismus", "Surrealismus", "Dadaismus", "Realitätsflucht",
                "Existenzialismus", "Romantizismus", "Aufklärungsepoche", "Naturalisierung", "Modernismus",
                "Postmoderne", "avantgardistisch", "Ästhetikdiskurs", "Dekonstruktivismus", "Literaturkritik",
                "Literaturwissenschaft", "Erzählperspektive", "Stilmittel", "Symbolismus", "Allegorie",
                "Satire", "Parodie", "Ironisierung", "Metaphernutzung", "Intertextualität",
                "Traumdeutung", "Psychoanalyse", "Romankonstruktion", "Charakterentwicklung", "Handlungsstrang",
                "Dramaturgie", "Szenenanalyse", "Inszenierungskonzept", "Regiekonzeption", "Bühnenbildentwurf",
                "Kostümbildnerei", "Kameraführung", "Drehbuchanalyse", "Filmkritik", "Dokumentarfilm",
                "Kurzfilmproduktion", "Klanginstallation", "Performancekunst", "Installation Art",
                "Konzeptkunst", "Street Art", "Fotoreportage", "Architekturanalyse", "Denkmalschutz"
            )
        ),

        "german_c1_philosophy_ethics" to LanguageLearningDeck(
            id = "german_c1_philosophy_ethics",
            targetLanguage = "de",
            level = "C1",
            topic = "Philosophy & Ethics (Advanced)",
            words = listOf(
                "Metaphysik", "Ontologie", "Epistemologie", "Teleologie", "Existenzialismus",
                "Phänomenologie", "Hermeneutik", "Dialektik", "Sokratische Methode", "Kategorischer Imperativ",
                "Utilitarismus", "Pluralismus", "Relativismus", "Determinismus", "Indeterminismus",
                "Dualismus", "Monismus", "Konstruktivismus", "Idealismus", "Realismus",
                "Skeptizismus", "Deontologie", "Teleologische Ethik", "Tugendethik",
                "Normative Ethik", "Metaethik", "Gerechtigkeitstheorie", "Sozialvertrag", "Gesinnungsethik",
                "Verantwortungsethik", "Ethikkommission", "Gewissensentscheidung", "Sittengesetz",
                "Menschwürde", "Autonomieprinzip", "Prinzipienethik", "Handlungsbegründung",
                "Philosophische Anthropologie", "Weltanschauung", "Lebensphilosophie", "Sprachphilosophie",
                "Geistesgeschichte", "Logischer Positivismus", "Pragmatismus", "Philosophischer Realismus",
                "Feministische Ethik", "Umweltethik", "Bioethik", "Tierethik"
            )
        ),

// C2-Level Decks
        "german_c2_academic_research" to LanguageLearningDeck(
            id = "german_c2_academic_research",
            targetLanguage = "de",
            level = "C2",
            topic = "Academic & Research (Expert)",
            words = listOf(
                "Peer-Review-Verfahren", "Forschungsförderung", "Forschungskooperation", "Publikationszwang",
                "Open-Access-Richtlinie", "Fachzeitschrift", "Impact-Faktor", "Metaanalyse", "Expertenbefragung",
                "Feldforschung", "Laborjournal", "Datenaufbereitung", "Qualitative Forschung", "Quantitative Forschung",
                "Longitudinalstudie", "Querschnittsstudie", "Fallstudie", "Randomisierte Kontrollstudie",
                "Placeboeffekt", "Blindstudie", "Doppelblindstudie", "Interventionsstudie", "Ethikkommission",
                "Anonymisierung", "Datenschutzgrundverordnung", "Forschungsdesign", "Handlungsrahmen",
                "Methodentransfer", "Interdisziplinarität", "Forschungsparadigma", "Hypothesentests",
                "Signifikanzniveau", "Konfidenzintervall", "Fehler 1. und 2. Art", "Varianzanalyse",
                "Regressionsanalyse", "Faktorenanalyse", "Clusteranalyse", "Maschinelles Lernen", "Big-Data-Analyse",
                "Textanalyseverfahren", "Inhaltsanalyse", "Diskursanalyse", "Hermeneutische Analyse",
                "Reflexive Validität", "Reliabilitätstest", "Reproduzierbarkeit", "Forschungsbericht",
                "Dissertationsschrift", "Habilitationsschrift", "Lehrstuhlvertretung", "wissenschaftliche Tagung",
                "Fachkonferenz", "Posterpräsentation", "Vortragsabstract", "Publikationsethik"
            )
        ),

        "german_c2_legal_jurisprudence" to LanguageLearningDeck(
            id = "german_c2_legal_jurisprudence",
            targetLanguage = "de",
            level = "C2",
            topic = "Law & Jurisprudence (Expert)",
            words = listOf(
                "Rechtsgutachten", "Prozesskostenhilfe", "Strafverteidigung", "Anklageschrift",
                "Verteidigungsvortrag", "Urteilsbegründung", "Richterliche Unabhängigkeit", "Zeugenbeweisaufnahme",
                "Sachverständigengutachten", "Rechtsmittelbelehrung", "Revisionsverfahren", "Nichtigkeitsklage",
                "Verfassungsbeschwerde", "Bundesverfassungsgericht", "Europäischer Gerichtshof", "Schiedsgerichtsbarkeit",
                "Völkerrechtlicher Vertrag", "Diplomatische Immunität", "Extraterritoriale Jurisdiktion",
                "Staatsangehörigkeitsrecht", "Internationales Privatrecht", "Internationales Strafrecht",
                "Menschenrechtskonvention", "Völkergewohnheitsrecht", "Wissenschaftspraxis", "Gesellschaftsrecht",
                "Gesellschaftsvertrag", "Aktiengesellschaft", "GmbH-Gründung", "Genossenschaftsrecht",
                "Gesellschafterstreitigkeit", "Haftungsbegrenzung", "Kapitalerhöhung", "Dividendenbeschluss",
                "Handelsregistereintragung", "Kartellrechtliche Prüfung", "Fusionskontrolle",
                "Geldwäschegesetz", "Datenschutzrecht", "Urheberrechtsverletzung", "Patentrechtsstreit",
                "Markenrechtsverletzung", "Wettbewerbsbeschränkung", "AGB-Klauselprüfung",
                "Werkvertrag", "Dienstleistungserbringung", "Vertragsstrafe", "Gewährleistungsansprüche",
                "Schadenersatzpflicht", "Regressanspruch", "Haftungsausschlussklausel"
            )
        ),

        "german_c2_medical_health_advanced" to LanguageLearningDeck(
            id = "german_c2_medical_health_advanced",
            targetLanguage = "de",
            level = "C2",
            topic = "Medicine & Health (Expert)",
            words = listOf(
                "Differenzialdiagnose", "Multimodale Therapie", "Antibiotikatherapie", "Infektionsprophylaxe",
                "Nosokomiale Infektion", "Nosokomialpathogen", "Immunmodulation", "Autoimmunerkrankung",
                "Immuntherapie", "Chirurgische Resektion", "Minimal-invasive Operation", "Transplantationschirurgie",
                "Organspendeverfahren", "Spenderauswahlkriterien", "Onkologische Behandlung", "Chemotherapieindikation",
                "Radiotherapieplanung", "Strahlenschutzverordnung", "Palliativmedizin", "Schmerztherapie",
                "Geriatrische Rehabilitation", "Neonatologische Intensivmedizin", "Neonatologie", "Perinatologie",
                "Kardiovaskuläre Intervention", "Stentimplantation", "Bypass-Operation", "EKG-Auswertung",
                "Kardioverter-Defibrillator", "Herztransplantation", "Dialyseverfahren", "Nierenersatztherapie",
                "Hämodialyse", "Peritonealdialyse", "Endoskopische Untersuchung", "Magen-Darm-Spiegelung",
                "Arzt-Patient-Kommunikation", "Berufsgenossenschaftliche Heilverfahren", "Rehabilitationsprotokoll",
                "Gesundheitsökonomie", "Versorgungsforschung", "Versorgungsstrukturgesetz", "Krankenhausfinanzierung",
                "DRG-System", "Pflegegrad", "Pflegekomplexmaßnahmen", "Praxissoftware", "Telemedizin",
                "Gesundheitsinformatik", "Elektronische Patientenakte", "Gesundheits-Apps", "Medizinische Ethik"
            )
        ),

        "german_c2_environment_sustainability" to LanguageLearningDeck(
            id = "german_c2_environment_sustainability",
            targetLanguage = "de",
            level = "C2",
            topic = "Environment & Sustainability (Expert)",
            words = listOf(
                "Klimaschutzgesetzgebung", "Treibhausgasemissionen", "Klimaschutzpolitik", "Kohlenstoffbilanz",
                "Kohlenstoffneutralität", "CO₂-Steuer", "Emissionshandelssystem", "Emissionszertifikat",
                "Erneuerbare-Energien-Gesetz", "Photovoltaikförderung", "Windparkzertifizierung",
                "Geothermische Erschließung", "Ökobilanzanalyse", "Lebenszyklusanalyse", "Ressourceneffizienz",
                "Kreislaufwirtschaft", "Abfallvermeidungsstrategie", "Upcycling-Prozess", "Downcycling",
                "Recyclingquote", "Deponiemanagement", "Klärschlammverwertung", "Substitutionsstoff",
                "ökologische Nische", "Biodiversitätsstrategie", "Artenschutzprogramm", "Renaturierungsmaßnahme",
                "Flächennutzungsplan", "Naturschutzgebiet", "Schutzgebietsmanagement", "Wasserrahmenrichtlinie",
                "Meeresschutzgebiet", "Umweltverträglichkeitsprüfung", "Bauvorhabenprüfung", "Gefährdungsabschätzung",
                "Stoffstrommanagement", "Nachhaltigkeitszertifizierung", "Umweltcontrolling", "Öko-Label",
                "Corporate Social Responsibility", "Unternehmensverantwortung", "Greenwashing-Abwehr",
                "Klimawandelanpassungsstrategie", "Katastrophenvorsorgeplan", "Dürremanagement",
                "Hochwasserschutzkonzept", "Sturmflutschutz", "Bodenversauerung", "Versauerungsgrad"
            )
        ),

        "german_c2_economics_global_markets" to LanguageLearningDeck(
            id = "german_c2_economics_global_markets",
            targetLanguage = "de",
            level = "C2",
            topic = "Economics & Global Markets (Expert)",
            words = listOf(
                "Weltwirtschaftsgipfel", "Welthandelsorganisation", "Freihandelsabkommen",
                "Handelsbilanzungleichgewicht", "Finanzkrisenvorsorge", "Systemrisiko", "Bankenaufsicht",
                "Eigenkapitalanforderung", "Basel-III-Regulierung", "Makroprudenzielle Politik",
                "Quantitative Lockerung", "Zentralbankpolitik", "Inflationsziel", "Negativzinsphase",
                "Währungsschwankungen", "Kreditrisikomodell", "Kreditwürdigkeitsprüfung", "Ratingagentur",
                "Bonitätseinstufung", "Schuldenbremse", "Haushaltsdefizit", "Staatsanleihe", "Renditekurve",
                "Kapitalverkehrskontrolle", "Währungsreserven", "Devisenmarktintervention", "Golddeckung",
                "Finanzmarkttransparenz", "Finanzmarktstabilität", "Wirtschaftsindikator", "Bruttoinlandsprodukt",
                "Bruttonationaleinkommen", "Reallohnindex", "Kaufkraftparität", "Arbeitslosenquote",
                "Beschäftigungsquote", "Einkommensverteilung", "Gini-Koeffizient", "Armutsrisikoindikator",
                "Sozioökonomische Mobilität", "Digitalisierungsoffensive", "Industrie 4.0", "Plattformökonomie",
                "Sharing Economy", "Crowdsourcing", "Startup-Inkubator", "Venture-Capital-Fonds",
                "Englober Investitionsstrategie", "Impact Investing", "Corporate Governance Kodex",
                "Finanzbildungsinitiative", "Wirtschaftsseminar", "Krisenmanagementkonzept"
            )
        )
    )
}
