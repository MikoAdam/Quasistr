package com.quasistr.data.languagelearning

import com.quasistr.data.models.LanguageLearningDeck

object FrenchLearningDecks {
    val decks = mapOf(
        "french_a1_family" to LanguageLearningDeck(
            id = "french_a1_family",
            targetLanguage = "fr",
            level = "A1",
            topic = "Famille",
            instruction = "Apprenez les mots de la famille en français ! Mimez ou décrivez les relations familiales",
            words = listOf(
                "le père", "la mère", "le fils", "la fille", "le frère", "la sœur",
                "la grand-mère", "le grand-père", "les parents", "les enfants", "la famille", "l’homme",
                "la femme", "l’enfant", "l’oncle", "la tante", "le cousin", "la cousine", "le mari",
                "la femme (épouse)", "les frères et sœurs", "les grands-parents", "le neveu", "la nièce",
                "les proches", "marié", "célibataire", "divorcé", "parent célibataire", "le beau-père",
                "la belle-mère", "le demi-frère", "la demi-sœur", "le beau-père (père du conjoint)",
                "la belle-mère (mère du conjoint)", "le beau-frère", "la belle-sœur", "le petit-fils",
                "la petite-fille", "l’arrière-grand-père", "l’arrière-grand-mère", "l’enfant adopté",
                "les parents d’accueil", "la marraine", "le parrain"
            )
        ),

        "french_a1_colors" to LanguageLearningDeck(
            id = "french_a1_colors",
            targetLanguage = "fr",
            level = "A1",
            topic = "Couleurs",
            words = listOf(
                "rouge", "bleu", "vert", "jaune", "noir", "blanc", "orange", "violet", "rose", "marron",
                "gris", "multicolore", "clair", "foncé", "la couleur", "colorer", "peindre", "le rouge",
                "le bleu", "le vert", "le jaune", "rougeâtre", "bleuté", "verdâtre", "jaunâtre",
                "arc-en-ciel", "coloré", "incolore", "colorié", "polychrome", "pastel", "néon", "rouge vif",
                "bleu profond", "vert clair", "gris foncé", "argent", "or", "beige", "turquoise", "mauve", "menthe"
            )
        ),

        "french_a1_numbers" to LanguageLearningDeck(
            id = "french_a1_numbers",
            targetLanguage = "fr",
            level = "A1",
            topic = "Nombres",
            words = listOf(
                "zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
                "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept",
                "dix-huit", "dix-neuf", "vingt", "vingt et un", "vingt-deux", "trente", "quarante",
                "cinquante", "soixante", "soixante-dix", "quatre-vingts", "quatre-vingt-dix", "cent",
                "deux cents", "trois cents", "mille", "deux mille", "trente", "quarante", "cinquante",
                "soixante", "soixante-dix", "quatre-vingts", "quatre-vingt-dix", "cent mille", "million"
            )
        ),

        "french_a1_greetings" to LanguageLearningDeck(
            id = "french_a1_greetings",
            targetLanguage = "fr",
            level = "A1",
            topic = "Salutations & Phrases de Base",
            words = listOf(
                "Bonjour", "Bonsoir", "Salut", "Au revoir", "À plus tard", "À demain", "S’il vous plaît",
                "Merci", "Merci beaucoup", "Pardon", "Je suis désolé", "Oui", "Non", "Peut-être",
                "Comment ça va ?", "Ça va bien, merci", "Et toi ?", "Je vais bien", "Je t’en prie",
                "Pas de problème", "Tout va bien", "Ravi de te rencontrer", "Je m’appelle...", "Mon nom est...",
                "Enchanté", "Bienvenue", "Bienvenue chaleureuse", "Bonne journée", "Amuse-toi bien",
                "Bon voyage", "Prends soin de toi", "À votre santé (Santé)", "Joyeux Noël", "Bonne année",
                "Bonne chance", "Félicitations"
            )
        ),

        "french_a1_days_months" to LanguageLearningDeck(
            id = "french_a1_days_months",
            targetLanguage = "fr",
            level = "A1",
            topic = "Jours & Mois",
            words = listOf(
                "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche",
                "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août",
                "septembre", "octobre", "novembre", "décembre", "hier", "aujourd’hui", "demain",
                "après-demain", "avant-hier", "semaine", "mois", "an", "date", "heure", "seconde",
                "minute", "heure", "printemps", "été", "automne", "hiver", "week-end", "jour ouvrable",
                "jour férié", "anniversaire", "date de naissance", "calendrier", "saisonnier"
            )
        ),

        "french_a1_clothing" to LanguageLearningDeck(
            id = "french_a1_clothing",
            targetLanguage = "fr",
            level = "A1",
            topic = "Vêtements",
            words = listOf(
                "la chemise", "le pantalon", "la jupe", "la robe", "la veste", "le manteau", "les chaussures",
                "les bottes", "les chaussettes", "le chapeau", "le bonnet", "l’écharpe", "les gants",
                "le chemisier", "le pull", "le t-shirt", "le jean", "le costume", "la cravate",
                "la ceinture", "la culotte", "le soutien-gorge", "la chaussette", "la chaussure",
                "la sandale", "le bas", "le short", "le maillot de bain (homme)", "le maillot de bain (femme)",
                "le pyjama", "le vêtement de nuit", "le sous-vêtement", "le blouson", "l’imperméable",
                "l’anorak", "le survêtement (pantalon)", "le survêtement (veste)", "les vêtements de sport",
                "le sac à dos", "le sac", "le portefeuille", "la casquette", "le gant", "les lunettes"
            )
        ),

        "french_a1_animals" to LanguageLearningDeck(
            id = "french_a1_animals",
            targetLanguage = "fr",
            level = "A1",
            topic = "Animaux",
            words = listOf(
                "le chien", "le chat", "l’oiseau", "le poisson", "le cheval", "la vache", "le cochon",
                "le mouton", "la chèvre", "le lapin", "la souris", "le rat", "l’éléphant", "le lion",
                "le tigre", "l’ours", "le singe", "le lapin", "le crocodile", "la grenouille",
                "le serpent", "la tortue", "l’oiseau", "le lapin", "la mouche", "l’abeille", "la fourmi",
                "la montgolfière", "l’oiseau", "la girafe", "le zèbre", "le rhinocéros", "le rhinocéros (dupliqué)",
                "le renard", "le loup", "le chevreuil", "le cerf", "le canard", "l’oie", "le cygne",
                "le pigeon", "le moineau", "la chouette", "la chauve-souris"
            )
        ),

        "french_a1_bodyparts" to LanguageLearningDeck(
            id = "french_a1_bodyparts",
            targetLanguage = "fr",
            level = "A1",
            topic = "Parties du Corps",
            words = listOf(
                "la tête", "le visage", "l’œil", "l’oreille", "le nez", "la bouche", "la dent",
                "le cou", "l’épaule", "le bras", "le coude", "la main", "le doigt", "le pouce",
                "la poitrine", "le dos", "le ventre", "le pied", "l’orteil", "la jambe", "le genou",
                "la cheville", "le dos", "le cœur", "le poumon", "l’estomac", "le foie", "le rein",
                "le cerveau", "la peau", "le cheveu", "l’orteil (dupliqué)", "le coude (dupliqué)",
                "l’épaule (dupliquée)", "la taille", "la hanche", "la joue", "le menton", "le front"
            )
        ),

        "french_a1_common_verbs" to LanguageLearningDeck(
            id = "french_a1_common_verbs",
            targetLanguage = "fr",
            level = "A1",
            topic = "Verbes Courants",
            words = listOf(
                "être", "avoir", "aller", "venir", "voir", "entendre", "parler", "manger", "boire",
                "habiter", "vivre", "dormir", "conduire", "courir", "travailler", "jouer", "lire",
                "écrire", "acheter", "vendre", "donner", "prendre", "faire", "prendre (dupliqué)",
                "trouver", "perdre", "penser", "croire", "savoir", "comprendre", "apprendre",
                "étudier", "aider", "attendre", "avoir besoin", "aimer (bien)", "aimer (amour)",
                "vouloir", "pouvoir", "devoir", "falloir", "savoir (dupliqué)", "vouloir (dupliqué)"
            )
        ),

        "french_a1_prepositions" to LanguageLearningDeck(
            id = "french_a1_prepositions",
            targetLanguage = "fr",
            level = "A1",
            topic = "Prépositions",
            words = listOf(
                "dans", "sur", "sous", "au-dessus", "à côté", "entre", "derrière", "devant", "à", "chez",
                "avec", "sans", "pour", "contre", "autour", "jusqu’à", "après", "de", "à partir de", "depuis",
                "à travers", "malgré", "pendant", "à cause de", "à l’intérieur", "à l’extérieur", "le long de",
                "en face de", "soit ... soit", "tant ... que", "ni ... ni", "au lieu de", "à la place de",
                "en faveur de", "indépendamment de", "contrairement à", "selon", "conformément à", "à la suite de",
                "faute de", "avec l’aide de", "en raison de"
            )
        ),

        "french_a1_adjectives_basic" to LanguageLearningDeck(
            id = "french_a1_adjectives_basic",
            targetLanguage = "fr",
            level = "A1",
            topic = "Adjectifs de Base",
            words = listOf(
                "bon", "mauvais", "grand", "petit", "lent", "rapide", "froid", "chaud", "tiède",
                "frais", "lourd", "léger", "vieux", "jeune", "nouveau", "ancien", "cher", "bon marché",
                "beau", "laid", "bruyant", "silencieux", "fort", "faible", "clair", "sombre", "rond",
                "carré", "lisse", "rugueux", "propre", "sale", "amical", "inamical", "heureux", "triste",
                "intéressant", "ennuyeux", "affamé", "assoiffé", "fatigué", "en bonne santé", "malade",
                "riche", "pauvre"
            )
        ),

        "french_a2_food" to LanguageLearningDeck(
            id = "french_a2_food",
            targetLanguage = "fr",
            level = "A2",
            topic = "Nourriture",
            words = listOf(
                "le pain", "le fromage", "la charcuterie", "la viande", "les légumes", "la pomme",
                "le lait", "l’eau", "le café", "le thé", "la bière", "le vin", "le beurre", "l’œuf",
                "le poisson", "le poulet", "la pomme de terre", "la tomate", "l’oignon", "la salade",
                "la soupe", "les pâtes", "le riz", "les fruits", "la banane", "l’orange", "le chocolat",
                "le gâteau", "la glace", "le sucre", "le sel", "le poivre", "sucré", "acide", "salé",
                "amer", "épicé", "gras", "sain", "malsain", "les fruits de mer", "les haricots",
                "la pomme de terre (variante)", "le poivron", "la carotte", "la courgette", "l’aubergine"
            )
        ),

        "french_a2_travel" to LanguageLearningDeck(
            id = "french_a2_travel",
            targetLanguage = "fr",
            level = "A2",
            topic = "Voyage",
            words = listOf(
                "le voyage", "les vacances", "l’avion", "la gare", "le train", "le bus",
                "la voiture", "le taxi", "le métro", "le billet", "l’hôtel", "l’auberge de jeunesse",
                "la réservation", "les bagages", "la valise", "le sac à dos", "le ticket", "le passe",
                "l’arrivée", "le départ", "le retard", "le retour", "l’arrivée (variante)", "le visa",
                "le passeport", "le contrôle aux frontières", "le contrôle de sécurité", "la douane",
                "l’itinéraire", "le guide touristique", "le site touristique", "le musée", "la galerie",
                "la plage", "la ville", "le pays", "le tourisme", "la compagnie aérienne", "l’enregistrement",
                "le départ de l’avion", "la chambre double", "la chambre simple", "l’ascenseur", "la réception",
                "le petit-déjeuner", "la demi-pension", "la pension complète"
            )
        ),

        "french_a2_directions" to LanguageLearningDeck(
            id = "french_a2_directions",
            targetLanguage = "fr",
            level = "A2",
            topic = "Itinéraires & Transport",
            words = listOf(
                "gauche", "droite", "tout droit", "en haut", "en bas", "au-dessus", "en dessous",
                "à côté", "entre", "en face de", "le carrefour", "le feu (de circulation)", "la rue",
                "le chemin", "la bifurcation", "l’entrée", "la sortie", "le rond-point", "le pont",
                "le tunnel", "le trottoir", "l’arrêt (de bus)", "la station", "le panneau", "la circulation",
                "la route", "l’autoroute", "la route nationale", "la rue à sens unique", "la voie rapide",
                "la station-service", "le garage", "le parking", "le parcmètre", "le ticket", "le péage",
                "l’embouteillage", "le raccourci", "le détour", "la carte", "la boussole", "la direction",
                "l’orientation", "la distance", "le kilomètre", "le mille", "le carrefour (dupliqué)"
            )
        ),

        "french_a2_health" to LanguageLearningDeck(
            id = "french_a2_health",
            targetLanguage = "fr",
            level = "A2",
            topic = "Santé & Corps",
            words = listOf(
                "le médecin", "la médecin", "la clinique", "l’hôpital", "le cabinet", "la pharmacie",
                "le médicament", "le comprimé", "le cachet", "l’injection", "la vaccination", "le traitement",
                "l’examen", "le diagnostic", "la thérapie", "la prise de sang", "la tension artérielle",
                "le pouls", "le battement de cœur", "le poumon", "le rein", "le foie", "l’estomac",
                "l’intestin", "le cerveau", "le système nerveux", "le système immunitaire", "la peau",
                "le squelette", "le muscle", "l’articulation", "la fracture osseuse", "la plaie", "le pansement",
                "l’opération", "l’anesthésie", "la rééducation", "l’allergie", "l’infection", "la grippe",
                "le rhume", "la fièvre", "la toux", "le rhume (dupliqué)", "l’inflammation",
                "la douleur", "le mal de tête", "la nausée", "la diarrhée", "la santé", "l’examen de prévention",
                "l’assurance maladie", "la santé (dupliqué)"
            )
        ),

        "french_a2_housing" to LanguageLearningDeck(
            id = "french_a2_housing",
            targetLanguage = "fr",
            level = "A2",
            topic = "Logement & Maison",
            words = listOf(
                "la maison", "l’appartement", "la chambre", "la cuisine", "la salle de bains", "la chambre à coucher",
                "le salon", "le balcon", "le jardin", "la terrasse", "le garage", "la cave", "le grenier",
                "la cage d’escalier", "le couloir", "la porte", "la fenêtre", "le mur", "le sol", "le plafond",
                "la table", "la chaise", "le lit", "l’armoire", "le bureau", "le réfrigérateur", "le four",
                "le chauffage", "la climatisation", "la lampe", "la prise électrique", "le robinet", "la douche",
                "la baignoire", "les toilettes", "le lavabo", "l’évier", "la cuisinière", "le lave-vaisselle",
                "la machine à laver", "le sèche-linge", "l’aspirateur", "le canapé", "le fauteuil", "le tapis",
                "le miroir", "l’étagère"
            )
        ),

        "french_a2_time" to LanguageLearningDeck(
            id = "french_a2_time",
            targetLanguage = "fr",
            level = "A2",
            topic = "Expressions de Temps",
            words = listOf(
                "l’heure", "la minute", "la seconde", "le jour", "la semaine", "le mois", "l’année",
                "le siècle", "le matin", "la matinée", "le midi", "l’après-midi", "le soir", "la nuit",
                "aujourd’hui", "hier", "demain", "après-demain", "avant-hier", "maintenant", "bientôt",
                "plus tard", "tout de suite", "immédiatement", "présent", "absent", "à l’heure", "en retard",
                "tôt", "plus tôt", "tard", "toujours", "jamais", "parfois", "souvent", "rarement", "occasionnellement",
                "toujours encore", "déjà", "encore", "jusqu’à quand", "depuis quand", "combien de temps",
                "pendant", "avant", "après", "hebdomadaire", "mensuel", "annuel", "quotidien"
            )
        ),

        "french_a2_weather" to LanguageLearningDeck(
            id = "french_a2_weather",
            targetLanguage = "fr",
            level = "A2",
            topic = "Météo",
            words = listOf(
                "le temps", "le soleil", "le nuage", "la pluie", "la neige", "le froid", "la chaleur",
                "le vent", "la tempête", "le brouillard", "le gel", "la grêle", "le tonnerre",
                "l’éclair", "la température", "la météo", "le baromètre", "l’humidité", "l’ensoleillement",
                "le parapluie", "l’imperméable", "le manteau", "la carte météo", "la station météo",
                "l’arc-en-ciel", "l’ouragan", "la brise", "l’orage", "la sécheresse", "l’inondation",
                "le tsunami", "à midi", "le soir", "le matin", "dégagé", "nuageux", "pluvieux",
                "orageux", "ensoleillé", "il neige", "geler", "fondre", "plus de 30 °C", "en dessous de 0 °C"
            )
        ),

        "french_a2_shopping" to LanguageLearningDeck(
            id = "french_a2_shopping",
            targetLanguage = "fr",
            level = "A2",
            topic = "Achats & Argent",
            words = listOf(
                "le magasin", "le grand magasin", "le centre commercial", "le marché",
                "le prix", "le coût", "la réduction", "la caisse", "le reçu", "l’offre", "la demande",
                "le vendeur", "la vendeuse", "le client", "la cliente", "la marchandise", "le produit",
                "la marque", "la taille", "la couleur", "la cabine d’essayage", "le chariot", "le sac",
                "le portefeuille", "le porte-monnaie", "la monnaie", "le billet", "la carte de crédit",
                "la carte bancaire", "le bon d’achat", "le ticket", "gratuit", "cher", "pas cher",
                "payable", "inestimable", "la facture", "les frais", "le montant", "le bilan", "le budget",
                "la solvabilité", "la dette", "l’investissement", "le rendement"
            )
        ),

        "french_a2_emotions" to LanguageLearningDeck(
            id = "french_a2_emotions",
            targetLanguage = "fr",
            level = "A2",
            topic = "Émotions & Sentiments",
            words = listOf(
                "heureux", "triste", "en colère", "fâché", "inquiet", "anxieux", "détendu",
                "stressé", "excité", "ennuyé", "intéressé", "satisfait", "insatisfait", "plein d’espoir",
                "désespéré", "fier", "honteux", "coupable", "curieux", "jaloux", "t timide", "confiant",
                "amical", "inamical", "patient", "impatient", "reconnaissant", "ingrat", "compatissant",
                "empathique", "sympathique", "irritable", "motivé", "démotivé", "optimiste", "pessimiste",
                "résigné", "passionné", "indifférent", "tendre", "amer", "euphorique", "mélancolique",
                "surpris", "paranoïaque", "distance", "connecté", "aimant", "dangereux"
            )
        ),

        "french_a2_transport" to LanguageLearningDeck(
            id = "french_a2_transport",
            targetLanguage = "fr",
            level = "A2",
            topic = "Transport & Véhicules",
            words = listOf(
                "le bus", "le train", "le vélo", "la voiture", "le taxi", "le conducteur",
                "la conductrice", "le chauffeur de train", "l’horaire", "le distributeur de billets",
                "le ticket", "le titre de transport", "l’arrêt", "la gare", "l’aéroport", "l’avion",
                "le pilote", "la pilote", "la hôtesse de l’air", "le passager", "la valise",
                "le tapis roulant", "la piste", "la porte d’embarquement", "le billet d’avion",
                "la carte d’embarquement", "les bagages", "le sac à dos", "le GPS", "le volant",
                "l’accélérateur", "le frein", "l’embrayage", "la boîte de vitesses", "le moteur",
                "le véhicule", "le pneu", "l’autoroute", "la route nationale", "la circulation",
                "les transports", "le parking", "le parking souterrain", "la station-service",
                "le diesel", "l’essence", "la trottinette électrique", "le cyclomoteur"
            )
        ),

        // B1-Level Decks
        "french_b1_work_career" to LanguageLearningDeck(
            id = "french_b1_work_career",
            targetLanguage = "fr",
            level = "B1",
            topic = "Travail & Carrière",
            words = listOf(
                "la profession", "la carrière", "la promotion", "le licenciement", "le chômage",
                "le CV", "l’entretien d’embauche", "la candidature", "la qualification",
                "la formation continue", "le stage", "le collègue", "la collègue", "le supérieur",
                "l’horaire de travail", "le travail en équipe", "le travail de nuit", "le temps partiel",
                "le temps plein", "le salaire", "la rémunération", "la sécurité sociale", "la retraite",
                "la pension", "déclaration d’impôt", "déclaration de revenus", "convention collective",
                "le syndicat", "les conditions de travail", "la responsabilité", "l’attestation de travail",
                "la main-d’œuvre", "le secteur", "l’entreprise", "l’établissement", "la succursale",
                "le siège social", "la direction", "la gestion", "la responsabilité", "le cours de formation",
                "le travail temporaire", "le contrat de travail", "l’employeur", "l’employé",
                "le travail d’équipe", "la gestion de projet", "le bulletin de paie", "la charge de travail",
                "le préavis"
            )
        ),

        "french_b1_travel_tourism" to LanguageLearningDeck(
            id = "french_b1_travel_tourism",
            targetLanguage = "fr",
            level = "B1",
            topic = "Voyage & Tourisme",
            words = listOf(
                "le voyage", "les vacances", "l’hôtel", "l’auberge de jeunesse", "la réservation",
                "les bagages", "la valise", "le sac à dos", "le monument", "l’agence de voyage",
                "le guide touristique", "le touriste", "la touriste", "le tour de ville", "le guide local",
                "la compagnie aérienne", "l’enregistrement", "le départ", "la chambre double",
                "la chambre simple", "la demi-pension", "la pension complète", "le buffet",
                "le prix de la chambre", "la réception", "l’ascenseur", "le minibar", "le coffre-fort",
                "la climatisation", "l’évaluation client", "le plan de la ville", "le GPS", "l’itinéraire",
                "la consigne à bagages", "la navette aéroport", "le service de navette", "l’itinéraire de voyage",
                "les excursions", "les documents de voyage", "le visa", "le passeport", "le contrôle aux frontières",
                "le contrôle de sécurité", "le billet", "le ticket", "l’information horaire", "le retard",
                "l’arrivée", "le départ", "la porte d’embarquement", "la livraison des bagages", "le duty-free"
            )
        ),

        "french_b1_health_body" to LanguageLearningDeck(
            id = "french_b1_health_body",
            targetLanguage = "fr",
            level = "B1",
            topic = "Santé & Corps",
            words = listOf(
                "le médecin", "la médecin", "la clinique", "l’hôpital", "le cabinet médical", "la pharmacie",
                "le médicament", "le comprimé", "l’injection", "la vaccination", "le traitement",
                "l’examen médical", "le diagnostic", "la thérapie", "la prise de sang", "la tension artérielle",
                "le pouls", "le rythme cardiaque", "le poumon", "le rein", "le foie", "l’estomac",
                "l’intestin", "le cerveau", "le système nerveux", "le système immunitaire", "la peau",
                "le squelette", "le muscle", "l’articulation", "la fracture", "la plaie", "le pansement",
                "l’opération", "l’anesthésie", "la rééducation", "l’allergie", "l’infection", "la grippe",
                "le rhume", "la fièvre", "la toux", "le rhume (dupliqué)", "l’inflammation",
                "la douleur", "le mal de tête", "la nausée", "la diarrhée", "la santé", "l’examen de prévention",
                "l’assurance maladie", "la participation financière"
            )
        ),

        "french_b1_shopping_money" to LanguageLearningDeck(
            id = "french_b1_shopping_money",
            targetLanguage = "fr",
            level = "B1",
            topic = "Achats & Argent",
            words = listOf(
                "le magasin", "le grand magasin", "le centre commercial", "la publicité", "la promotion",
                "la remise", "la facture", "le reçu", "la caisse", "le ticket de caisse", "la cabine d’essayage",
                "l’essai", "le retour", "l’échange", "le vendeur", "la vendeuse", "le client", "la cliente",
                "l’offre de produits", "le choix", "la qualité", "la marque de luxe", "la marque générique",
                "le fabricant", "la fabrication", "l’expédition", "la livraison", "le e-commerce", "le site marchand",
                "le panier", "le mode de paiement", "la carte de crédit", "la carte bancaire", "le chèque",
                "l’espèce", "le distributeur", "l’agence bancaire", "le compte courant", "le compte épargne",
                "le virement", "le prélèvement automatique", "les frais", "le montant", "le bilan",
                "le budget", "la solvabilité", "la dette", "l’investissement", "le rendement"
            )
        ),

        "french_b1_housing_home" to LanguageLearningDeck(
            id = "french_b1_housing_home",
            targetLanguage = "fr",
            level = "B1",
            topic = "Logement & Maison",
            words = listOf(
                "la maison", "l’appartement", "le bail", "le loyer", "les charges", "la caution",
                "l’annonce immobilière", "l’agent immobilier", "la commission", "le bien immobilier",
                "le propriétaire", "le locataire", "le bailleur", "l’appartement en copropriété", "la maison jumelée",
                "la maison individuelle", "la construction", "la demande de permis de construire", "le permis de construire",
                "la rénovation", "l’aménagement", "la cuisine équipée", "le revêtement de sol", "le chauffage",
                "le chauffage central", "le chauffage au sol", "la climatisation", "la ventilation", "le toit",
                "la façade", "l’isolation", "l’énergie solaire", "la connexion électrique", "l’installation électrique",
                "la plomberie", "les installations sanitaires", "la salle de bains", "la baignoire", "la douche",
                "les toilettes", "la machine à laver", "le sèche-linge", "le réfrigérateur", "la cuisinière",
                "le four", "le lave-vaisselle", "le garage", "la place de parking", "le jardin", "la terrasse"
            )
        ),

        "french_b2_politics_society" to LanguageLearningDeck(
            id = "french_b2_politics_society",
            targetLanguage = "fr",
            level = "B2",
            topic = "Politique & Société",
            words = listOf(
                "la démocratie", "le parlement", "le gouvernement", "le dirigeant", "l’opposition",
                "le vote", "l’élection", "la campagne électorale", "le résultat électoral", "la coalition",
                "la majorité", "la minorité", "l’opposition (dupliqué)", "la législation", "la loi",
                "la constitution", "la liberté d’expression", "la liberté de la presse", "la liberté de réunion",
                "la manifestation", "la protestation", "le référendum", "le débat", "le discours",
                "le lobby", "le lobbyiste", "le désintérêt politique", "la corruption", "le scandale",
                "la transparence", "la responsabilité", "l’éthique", "la morale", "l’intégration",
                "la migration", "la mondialisation", "la politique environnementale", "le changement climatique",
                "le développement durable", "la justice sociale", "la lutte contre la pauvreté",
                "le système social", "la réforme de santé", "la politique éducative", "le marché du travail",
                "le taux de chômage", "le syndicat"
            )
        ),

        "french_b2_business_finance" to LanguageLearningDeck(
            id = "french_b2_business_finance",
            targetLanguage = "fr",
            level = "B2",
            topic = "Affaires & Finance",
            words = listOf(
                "l’économie", "le produit intérieur brut", "l’inflation", "la déflation", "la récession",
                "l’expansion", "l’exportation", "l’importation", "la balance commerciale", "le déficit commercial",
                "la monnaie", "l’euro", "le dollar", "la bourse", "l’action", "l’obligation", "l’actionnaire",
                "l’investisseur", "le portefeuille", "la gestion des risques", "l’administration fiscale",
                "l’impôt", "la TVA", "l’impôt sur le revenu", "l’impôt sur les sociétés", "le bénéfice", "la perte",
                "le bilan", "le compte de résultat", "la fiche de paie", "les coûts salariaux", "le budget",
                "le ménage", "le crédit", "l’hypothèque", "le taux d’intérêt", "le rendement", "le dividende",
                "l’endettement", "la liquidité", "la faillite", "la restructuration", "la fusion", "la prise de contrôle",
                "la culture start-up", "le modèle économique", "l’étude de marché", "la fidélisation", "la distribution"
            )
        ),

        "french_b2_education_learning" to LanguageLearningDeck(
            id = "french_b2_education_learning",
            targetLanguage = "fr",
            level = "B2",
            topic = "Éducation & Apprentissage",
            words = listOf(
                "l’éducation", "le système scolaire", "l’université", "le grand établissement",
                "l’école supérieure", "les frais de scolarité", "la bourse d’études", "l’admission",
                "l’inscription", "le semestre", "le règlement d’examen", "l’examen écrit", "le mémoire",
                "le travail de recherche", "la thèse", "la dissertation", "le professeur", "l’enseignant",
                "l’étudiant", "l’étudiante", "le camarade de promotion", "l’emploi du temps", "le programme",
                "le cursus", "la pédagogie", "la didactique", "la méthodologie", "la stratégie d’apprentissage",
                "l’autodiscipline", "la préparation aux examens", "la charge d’études", "le conseiller pédagogique",
                "le programme d’échange", "le programme Erasmus", "la formation professionnelle",
                "l’apprentissage en alternance", "la formation continue", "la formation complémentaire",
                "le certificat", "la validation", "le diplôme", "la note", "l’évaluation",
                "le cours en présentiel", "le cours en ligne", "l’enseignement à distance"
            )
        ),

        "french_b2_culture_literature" to LanguageLearningDeck(
            id = "french_b2_culture_literature",
            targetLanguage = "fr",
            level = "B2",
            topic = "Culture & Littérature",
            words = listOf(
                "la littérature", "le roman", "la nouvelle", "le poème", "la novella",
                "le dramaturge", "la dramaturge", "le drame", "la tragédie", "la comédie",
                "le théâtre", "l’opéra", "la scène", "la mise en scène", "le scénario",
                "la réalisation", "le réalisateur", "la réalisatrice", "le public", "la critique",
                "la critique littéraire", "l’allégorie", "la métaphore", "le symbole", "le protagoniste",
                "l’antagoniste", "l’intrigue", "le point culminant", "la chute", "l’ironie",
                "le satiriste", "la satire", "l’épique", "la lyrique", "la fable", "la parabole",
                "l’essai", "la biographie", "l’autobiographie", "le best-seller", "la lecture publique",
                "l’histoire littéraire", "le romantisme", "les Lumières", "l’expressionnisme",
                "la modernité"
            )
        ),

        // Autres Decks B1
        "french_b1_daily_routines" to LanguageLearningDeck(
            id = "french_b1_daily_routines",
            targetLanguage = "fr",
            level = "B1",
            topic = "Routines Quotidiennes",
            words = listOf(
                "se lever", "se réveiller", "se laver", "se brosser les dents", "s’habiller",
                "préparer le petit-déjeuner", "prendre le petit-déjeuner", "aller au travail",
                "aller à l’école", "travailler", "apprendre", "faire une pause", "déjeuner",
                "revenir", "rentrer à la maison", "préparer le dîner", "prendre le dîner",
                "regarder la télévision", "lire", "aller se coucher", "se détendre",
                "faire du sport", "aller courir", "aller à la salle de sport", "faire les courses",
                "faire la lessive", "passer l’aspirateur", "faire les devoirs", "recevoir (des invités)",
                "téléphoner", "saisir une opportunité", "fixer des rendez-vous",
                "planifier la journée", "œuf au plat", "liste de choses à faire", "routine",
                "habitude"
            )
        ),

        "french_b1_technology_internet" to LanguageLearningDeck(
            id = "french_b1_technology_internet",
            targetLanguage = "fr",
            level = "B1",
            topic = "Technologie & Internet",
            words = listOf(
                "l’ordinateur", "l’ordinateur portable", "la tablette", "le smartphone", "l’application",
                "le logiciel", "le système d’exploitation", "le clavier", "la souris", "l’écran",
                "le fichier", "le dossier", "enregistrer", "charger", "télécharger", "téléverser",
                "le site web", "le navigateur", "le moteur de recherche", "le mot de passe", "le pare-feu",
                "le réseau", "le routeur", "le Wi-Fi", "la connexion Internet", "diffuser",
                "le cloud", "le réseau social", "le nom d’utilisateur", "la vie privée", "le virus",
                "l’antivirus", "la base de données", "la mise à jour", "télécharger l’application",
                "installer l’application", "la sauvegarde", "la protection", "le développeur",
                "la programmation", "le langage de programmation", "le code source", "le message d’erreur"
            )
        ),

        "french_b1_environment_nature" to LanguageLearningDeck(
            id = "french_b1_environment_nature",
            targetLanguage = "fr",
            level = "B1",
            topic = "Environnement & Nature",
            words = listOf(
                "l’environnement", "la protection de l’environnement", "le changement climatique",
                "le réchauffement climatique", "les gaz à effet de serre", "les émissions de CO₂",
                "l’énergie renouvelable", "l’énergie solaire", "l’énergie éolienne", "l’énergie hydraulique",
                "le photovoltaïque", "le recyclage", "les déchets", "le tri sélectif", "la pollution",
                "la pollution atmosphérique", "la pollution de l’eau", "les pluies acides",
                "la forêt tropicale", "la forêt", "l’océan", "la pollution marine", "la protection du climat",
                "la protection de la nature", "la réserve naturelle", "la protection des espèces",
                "la biodiversité", "la conservation", "l’écosystème", "l’habitat", "le développement durable",
                "la ressource", "le papier recyclé", "la bouteille en plastique", "la disparition des abeilles",
                "l’essaim d’abeilles", "la perte d’habitat", "l’espèce menacée", "la catastrophe écologique"
            )
        ),

        // Autres Decks B2
        "french_b2_science_research" to LanguageLearningDeck(
            id = "french_b2_science_research",
            targetLanguage = "fr",
            level = "B2",
            topic = "Science & Recherche",
            words = listOf(
                "la recherche", "le scientifique", "la scientifique", "le laboratoire",
                "l’expérience", "l’hypothèse", "la théorie", "l’étude", "les données",
                "la statistique", "la méthode", "le sujet d’étude", "l’échantillon",
                "la publication", "la revue scientifique", "le comité de lecture", "la découverte",
                "l’innovation", "le développement", "la technologie", "la biologie", "la chimie",
                "la physique", "la géologie", "l’astronomie", "la médecine", "la génétique",
                "la neurologie", "la psychologie", "la sociologie", "l’anthropologie", "l’éthique",
                "le projet de recherche", "le financement", "la subvention", "la demande de subvention",
                "la thèse de doctorat", "la position postdoctorale", "la chaire", "le département",
                "la conférence", "la présentation", "la collaboration", "la coopération", "le journal",
                "la citation", "l’article original"
            )
        ),

        "french_b2_art_music" to LanguageLearningDeck(
            id = "french_b2_art_music",
            targetLanguage = "fr",
            level = "B2",
            topic = "Art & Musique",
            words = listOf(
                "l’art", "l’artiste", "l’artiste (f)", "la peinture", "la sculpture",
                "l’exposition", "la galerie", "le musée", "la toile", "la couleur",
                "le pinceau", "la peinture (action)", "la photographie", "le collage", "la céramique",
                "l’architecture", "l’architecte", "le patrimoine architectural", "le concert", "l’opéra",
                "l’orchestre", "le chef d’orchestre", "la cheffe d’orchestre", "le piano", "le violon",
                "la guitare", "la batterie", "le batteur", "la voix", "le chanteur", "la chanteuse",
                "la composition", "le compositeur", "la compositrice", "la chanson", "la mélodie",
                "le rythme", "la mesure", "l’harmonie", "la dissonance", "le jazz", "la musique classique",
                "le rock", "la pop", "le clip musical", "l’enregistrement audio", "le vinyle", "le CD",
                "le service de streaming", "le festival", "la représentation", "la répétition",
                "la tournée", "le style artistique"
            )
        ),

        "french_b2_law_order" to LanguageLearningDeck(
            id = "french_b2_law_order",
            targetLanguage = "fr",
            level = "B2",
            topic = "Droit & Ordre",
            words = listOf(
                "la loi", "le règlement", "l’ordre juridique", "le juge", "la juge",
                "l’avocat", "l’avocate", "le cabinet d’avocats", "le client", "la cliente",
                "la plainte", "la saisine", "l’audience", "le jugement", "la décision",
                "l’appel", "la cour d’appel", "le tribunal pénal", "le parquet", "le procureur",
                "le procureur (f)", "l’accusé", "l’accusée", "la défense", "la défense (f)",
                "le code pénal", "le droit civil", "le droit pénal", "le droit du travail",
                "le droit de la famille", "le droit des successions", "le droit de la location",
                "le droit des contrats", "la liberté contractuelle", "la responsabilité civile",
                "la demande de dommages et intérêts", "les frais de justice", "la prescription",
                "la sécurité publique", "la poursuite pénale", "la peine de prison", "l’amende",
                "la peine avec sursis", "le bien juridique", "l’audition des témoins", "l’aveu",
                "le témoignage", "la collecte de preuves", "la charge de la preuve"
            )
        ),

        // C1-Level Decks
        "french_c1_politics_society_advanced" to LanguageLearningDeck(
            id = "french_c1_politics_society_advanced",
            targetLanguage = "fr",
            level = "C1",
            topic = "Politique & Société (Avancé)",
            words = listOf(
                "camarade de parti", "négociations de coalition", "taux de participation électorale",
                "légitimité politique", "populisme", "chef d’État", "cour constitutionnelle",
                "droits fondamentaux", "droits des minorités", "lobbying", "principe d’égalité",
                "démocratisation", "État de droit", "coup d’État", "dictature", "politique d’opposition",
                "mesures de sanction", "crime de guerre", "violation des droits de l’homme",
                "commission des droits de l’homme", "budget de l’État", "loi sur la transparence",
                "déclaration d’indépendance", "droit à l’autodétermination", "endettement public",
                "sanctions économiques", "canal diplomatique", "politique étrangère", "politique intérieure",
                "visite d’État", "culture du pays hôte", "bulle immobilière", "politique de croissance",
                "équité sociale", "inégalité des revenus", "protection sociale", "crise des réfugiés",
                "procédure d’asile", "droit au séjour", "expatrié", "preuve de citoyenneté",
                "liberté de religion", "pluralisme des opinions", "censure de la presse",
                "liberté d’information", "loi anticorruption", "réglementation des dons politiques",
                "financement de campagne", "programme politique", "circonscription électorale",
                "candidature à la chancellerie", "initiative du Bundesrat", "projet de loi",
                "clôture du débat en séance plénière", "exclusion du droit de vote"
            )
        ),

        "french_c1_science_technology_advanced" to LanguageLearningDeck(
            id = "french_c1_science_technology_advanced",
            targetLanguage = "fr",
            level = "C1",
            topic = "Science & Technologie (Avancé)",
            words = listOf(
                "physique quantique", "collisionneur de particules", "ondes gravitationnelles",
                "matière noire", "théorie de la relativité", "fusion nucléaire", "génie génétique",
                "CRISPR/Cas9", "activité télomérase", "épigénétique", "profil d’expression génique",
                "recherche sur les cellules souches", "clonage", "neurotransmission", "neurosciences",
                "plasticité cérébrale", "biocompatibilité", "biomarqueur", "contrôle de prothèse",
                "système organe-sur-puce", "nanorobot", "nanoparticule", "ordinateur quantique",
                "complexité des algorithmes", "framework d’apprentissage automatique",
                "réseau neuronal", "apprentissage profond", "communication en gestion de base de données",
                "cryptographie", "technologie blockchain", "Internet des objets", "système cyber-physique",
                "intelligence artificielle", "reconnaissance d’objets", "reconnaissance vocale",
                "réalité augmentée", "réalité virtuelle", "augmentation", "impression 3D",
                "prototypage rapide", "chirurgie robotique", "bioprinting", "bioinformatique",
                "modélisation climatique", "recherche atmosphérique", "visualisation des données",
                "chimie analytique", "diagnostic moléculaire", "cellule photovoltaïque",
                "technologie de stockage par batterie", "stockage d’énergie", "centrale hydroélectrique",
                "exploitation géothermique", "énergie de fusion", "télescope spatial",
                "communication par satellite"
            )
        ),

        "french_c1_business_finance_advanced" to LanguageLearningDeck(
            id = "french_c1_business_finance_advanced",
            targetLanguage = "fr",
            level = "C1",
            topic = "Affaires & Finance (Avancé)",
            words = listOf(
                "capitalisation boursière", "indice boursier", "risque de change", "marché des devises",
                "investissement en capital à risque", "évaluation d’entreprise", "stratégie de fusions et acquisitions",
                "due diligence", "prospectus financier", "programme de rachat d’actions", "rendement des capitaux propres",
                "efficacité ultra-courte", "produit dérivé financier", "warrant", "contrat à terme",
                "contrat swap", "déclaration de mission", "analyse concurrentielle", "chaîne de valeur",
                "audit interne", "politique de conformité", "gouvernance d’entreprise", "gestion des parties prenantes",
                "plateforme de financement participatif", "évaluation de start-up", "pitch deck", "stratégie de croissance",
                "stratégie de diversification", "pénétration de marché", "optimisation de portefeuille",
                "gestion de la liquidité", "analyse de bilan", "référentiel des indicateurs", "attentes de rendement",
                "structure de financement", "instrument du marché des capitaux", "taux swap", "couverture contre l’inflation",
                "swap de devises", "vente à découvert", "titrisation", "obligation adossée à des actifs",
                "report de pertes", "optimisation fiscale", "stratégie de dividendes", "unités d’actions restreintes",
                "système d’incitation", "rémunération des dirigeants", "systèmes de contrôle interne", "succès de la direction"
            )
        ),

        "french_c1_culture_art_literature" to LanguageLearningDeck(
            id = "french_c1_culture_art_literature",
            targetLanguage = "fr",
            level = "C1",
            topic = "Culture, Art & Littérature (Avancé)",
            words = listOf(
                "expressionnisme", "impressionnisme", "surréalisme", "dadaïsme", "évasion de la réalité",
                "existentialisme", "romantisme", "époque des Lumières", "naturalisme", "modernisme",
                "postmodernisme", "avant-gardiste", "discours esthétique", "déconstructivisme", "critique littéraire",
                "études littéraires", "perspective narrative", "figures de style", "symbolisme", "allégorie",
                "satire", "parodie", "ironie", "utilisation de la métaphore", "intertextualité",
                "interprétation des rêves", "psychanalyse", "construction romanesque", "développement des personnages",
                "intrigue narrative", "dramaturgie", "analyse de scène", "concept de mise en scène",
                "conception de la mise en scène", "dessin de décor", "création de costumes", "direction de la caméra",
                "analyse de scénario", "critique de film", "film documentaire", "production de courts métrages",
                "installation sonore", "art performance", "art d’installation", "art conceptuel", "street art",
                "reportage photographique", "analyse architecturale", "protection du patrimoine"
            )
        ),

        "french_c1_philosophy_ethics" to LanguageLearningDeck(
            id = "french_c1_philosophy_ethics",
            targetLanguage = "fr",
            level = "C1",
            topic = "Philosophie & Éthique (Avancé)",
            words = listOf(
                "métaphysique", "ontologie", "épistémologie", "téléologie", "existentialisme",
                "phénoménologie", "herméneutique", "dialectique", "méthode socratique", "impératif catégorique",
                "utilitarisme", "pluralisme", "relativisme", "déterminisme", "indéterminisme",
                "dualisme", "monisme", "constructivisme", "idéalisme", "réalisme",
                "scepticisme", "déontologie", "éthique téléologique", "éthique de la vertu",
                "éthique normative", "méta-éthique", "théorie de la justice", "contrat social", "éthique de conviction",
                "éthique de responsabilité", "commission d’éthique", "décision de conscience", "loi morale",
                "dignité humaine", "principe d’autonomie", "éthique des principes", "justification de l’action",
                "anthropologie philosophique", "vision du monde", "philosophie de la vie", "philosophie du langage",
                "histoire de la pensée", "positivisme logique", "pragmatisme", "réalisme philosophique",
                "éthique féministe", "éthique environnementale", "bioéthique", "éthique animale"
            )
        ),

        // C2-Level Decks
        "french_c2_academic_research" to LanguageLearningDeck(
            id = "french_c2_academic_research",
            targetLanguage = "fr",
            level = "C2",
            topic = "Recherche Universitaire (Expert)",
            words = listOf(
                "processus de révision par les pairs", "financement de la recherche", "coopération de recherche",
                "obligation de publication", "directive open access", "revue scientifique", "facteur d’impact",
                "méta-analyse", "enquête d’experts", "recherche de terrain", "carnet de laboratoire",
                "traitement des données", "recherche qualitative", "recherche quantitative", "étude longitudinale",
                "étude transversale", "étude de cas", "essai clinique randomisé", "effet placebo",
                "étude en aveugle", "étude en double aveugle", "essai d’intervention", "comité d’éthique",
                "anonymisation", "règlement général sur la protection des données", "conception de la recherche",
                "cadre d’action", "transfert de méthode", "interdisciplinarité", "paradigme de recherche",
                "test d’hypothèse", "niveau de signification", "intervalle de confiance", "erreur de type I et II",
                "analyse de variance", "analyse de régression", "analyse factorielle", "analyse de regroupement",
                "apprentissage automatique", "analyse de grosse données", "analyse de texte", "analyse de contenu",
                "analyse du discours", "analyse herméneutique", "validité réflexive", "test de fiabilité",
                "reproductibilité", "rapport de recherche", "dissertation", "habilitation", "remplacement de chaire",
                "colloque scientifique", "conférence spécialisée", "communication par affiche", "résumé de présentation",
                "déontologie de la publication"
            )
        ),

        "french_c2_legal_jurisprudence" to LanguageLearningDeck(
            id = "french_c2_legal_jurisprudence",
            targetLanguage = "fr",
            level = "C2",
            topic = "Droit & Jurisprudence (Expert)",
            words = listOf(
                "avis juridique", "aide juridictionnelle", "défense pénale", "acte d’accusation",
                "plaidoirie de la défense", "motivation du jugement", "indépendance judiciaire",
                "prise de déposition des témoins", "expertise judiciaire", "instruction sur les voies de recours",
                "procédure de pourvoi", "recours en annulation", "recours constitutionnel", "cour constitutionnelle",
                "cour européenne de justice", "arbitrage", "traité de droit international", "immunité diplomatique",
                "juridiction extraterritoriale", "droit de la nationalité", "droit international privé",
                "droit pénal international", "convention relative aux droits de l’homme",
                "droit coutumier international", "pratique scientifique", "droit des sociétés",
                "statuts de société", "société anonyme", "création de SARL", "droit coopératif",
                "litige entre associés", "limitation de responsabilité", "augmentation de capital",
                "décision de distribution de dividendes", "inscription au registre du commerce",
                "contrôle des concentrations", "loi anti-blanchiment", "droit de la protection des données",
                "atteinte aux droits d’auteur", "litige en matière de brevets", "violation de marque",
                "restriction de la concurrence", "vérification des clauses contractuelles",
                "contrat de louage d’ouvrage", "prestation de services", "clause pénale",
                "action en garantie", "responsabilité délictuelle", "droit de recours", "clause d’exonération de responsabilité"
            )
        ),

        "french_c2_medical_health_advanced" to LanguageLearningDeck(
            id = "french_c2_medical_health_advanced",
            targetLanguage = "fr",
            level = "C2",
            topic = "Médecine & Santé (Expert)",
            words = listOf(
                "diagnostic différentiel", "thérapie multimodale", "traitement antibiotique",
                "prophylaxie des infections", "infection nosocomiale", "pathogène nosocomial",
                "immunomodulation", "maladie auto-immune", "immunothérapie", "résection chirurgicale",
                "chirurgie mini-invasive", "chirurgie de transplantation", "procédure de don d’organes",
                "critères de sélection des donneurs", "traitement oncologique", "indication de chimiothérapie",
                "planification de radiothérapie", "réglementation sur la radioprotection", "médecine palliative",
                "traitement antidouleur", "rééducation gériatrique intensive", "médecine néonatale",
                "intensivisme néonatal", "néonatologie", "périnatalogie", "intervention cardiovasculaire",
                "implantation de stent", "pontage cardiaque", "interprétation d’ECG", "défibrillateur cardiaque",
                "transplantation cardiaque", "procédure de dialyse", "traitement de remplacement rénal",
                "hémodialyse", "dialyse péritonéale", "examen endoscopique", "gastroscopie", "communication médecin-patient",
                "procédures de la Caisse nationale de l’assurance maladie", "protocole de réadaptation", 
                "économie de la santé", "recherche en services de santé", "loi sur l’organisation des soins",
                "financement hospitalier", "système de groupes homogènes de malades (GHM)", "niveau de dépendance",
                "actes complexes de soins", "logiciel de gestion de cabinet", "télémédecine",
                "informatique de santé", "dossier médical électronique", "applications de santé", "éthique médicale"
            )
        ),

        "french_c2_environment_sustainability" to LanguageLearningDeck(
            id = "french_c2_environment_sustainability",
            targetLanguage = "fr",
            level = "C2",
            topic = "Environnement & Durabilité (Expert)",
            words = listOf(
                "législation sur la protection du climat", "émissions de gaz à effet de serre", "politique climatique",
                "bilan carbone", "neutralité carbone", "taxe carbone", "système d’échange de quotas d’émission",
                "certificat d’émission", "loi sur les énergies renouvelables", "incitation photovoltaïque",
                "certification des parcs éoliens", "exploitation géothermique", "analyse du cycle de vie",
                "analyse scientifique de l’écobilan", "efficacité des ressources", "économie circulaire",
                "stratégie de réduction des déchets", "processus d’upcycling", "downcycling", "taux de recyclage",
                "gestion des décharges", "valorisation des boues d’épuration", "substitut d’intrant",
                "niche écologique", "stratégie de biodiversité", "programme de protection des espèces",
                "mesure de renaturation", "plan d’aménagement du territoire", "zone protégée", "gestion des zones protégées",
                "directive cadre sur l’eau", "zone marine protégée", "étude d’impact environnemental",
                "évaluation des projets de construction", "analyse des risques", "gestion des flux de matières",
                "certification de durabilité", "contrôle environnemental", "étiquette écologique",
                "responsabilité sociale des entreprises", "responsabilité sociétale de l’entreprise", "lutte contre le greenwashing",
                "stratégie d’adaptation au changement climatique", "plan de prévention des catastrophes", "gestion de la sécheresse",
                "plan de protection contre les inondations", "plan de protection contre les tempêtes", "acidification des sols",
                "degré d’acidification"
            )
        ),

        "french_c2_economics_global_markets" to LanguageLearningDeck(
            id = "french_c2_economics_global_markets",
            targetLanguage = "fr",
            level = "C2",
            topic = "Économie & Marchés Globaux (Expert)",
            words = listOf(
                "sommet économique mondial", "Organisation mondiale du commerce", "accord de libre-échange",
                "déséquilibre de la balance commerciale", "prévention des crises financières", "risque systémique",
                "surveillance bancaire", "exigence de fonds propres", "réglementation Bâle III", "politique macroprudentielle",
                "assouplissement quantitatif", "politique monétaire de la banque centrale", "cible d’inflation",
                "phase de taux négatifs", "fluctuations monétaires", "modèle de risque de crédit", "vérification de la solvabilité",
                "agence de notation", "notation de crédit", "frein à l’endettement", "déficit budgétaire", "obligation d’État",
                "courbe de rendement", "contrôle des flux de capitaux", "réserves de change", "intervention sur le marché des changes",
                "étalon-or", "transparence des marchés financiers", "stabilité des marchés financiers", "indicateur économique",
                "produit intérieur brut", "revenu national brut", "indice des salaires réels", "parité de pouvoir d’achat",
                "taux de chômage", "taux d’emploi", "répartition des revenus", "coefficient de Gini", "indice de risque de pauvreté",
                "mobilité socio-économique", "offensive de numérisation", "industrie 4 .0", "économie de plateforme",
                "économie de partage", "crowdsourcing", "incubateur de start-up", "fonds de capital-risque",
                "stratégie d’investissement globale", "impact investing", "code de gouvernance d’entreprise",
                "initiative d’éducation financière", "séminaire économique", "concept de gestion de crise"
            )
        )
    )
}
