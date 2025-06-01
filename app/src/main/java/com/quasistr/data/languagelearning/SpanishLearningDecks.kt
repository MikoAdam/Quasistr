package com.quasistr.data.languagelearning

import com.quasistr.data.models.LanguageLearningDeck

object SpanishLearningDecks {
    val decks = mapOf(
        "spanish_a1_family" to LanguageLearningDeck(
            id = "spanish_a1_family",
            targetLanguage = "es",
            level = "A1",
            topic = "Familia",
            instruction = "¡Aprende palabras de la familia en español! Representa o describe las relaciones familiares",
            words = listOf(
                "el padre", "la madre", "el hijo", "la hija", "el hermano", "la hermana",
                "la abuela", "el abuelo", "los padres", "los hijos", "la familia", "el hombre",
                "la mujer", "el niño", "el tío", "la tía", "el primo", "la prima", "el esposo",
                "la esposa", "los hermanos", "los abuelos", "el sobrino", "la sobrina", "los parientes",
                "casado", "soltero", "divorciado", "familia monoparental", "el padrastro", "la madrastra",
                "el hermanastro", "la hermanastra", "el suegro", "la suegra", "el cuñado", "la cuñada",
                "el nieto", "la nieta", "el bisabuelo", "la bisabuela", "hijo adoptivo", "padres adoptivos",
                "la madrina", "el padrino"
            )
        ),

        "spanish_a1_colors" to LanguageLearningDeck(
            id = "spanish_a1_colors",
            targetLanguage = "es",
            level = "A1",
            topic = "Colores",
            words = listOf(
                "rojo", "azul", "verde", "amarillo", "negro", "blanco", "naranja", "morado", "rosa", "marrón",
                "gris", "multicolor", "claro", "oscuro", "el color", "colorear", "pintar", "el rojo",
                "el azul", "el verde", "el amarillo", "rojizo", "azulado", "verdoso", "amarillento",
                "arcoíris", "colorido", "incoloro", "coloreado", "policromático", "pastel", "neón",
                "rojo intenso", "azul profundo", "verde claro", "gris oscuro", "plateado", "dorado",
                "beige", "turquesa", "violeta", "menta"
            )
        ),

        "spanish_a1_numbers" to LanguageLearningDeck(
            id = "spanish_a1_numbers",
            targetLanguage = "es",
            level = "A1",
            topic = "Números",
            words = listOf(
                "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
                "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete",
                "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidós", "treinta", "cuarenta",
                "cincuenta", "sesenta", "setenta", "ochenta", "noventa", "cien", "doscientos",
                "trescientos", "mil", "dos mil", "treinta (repetido)", "cuarenta (repetido)",
                "cincuenta (repetido)", "sesenta (repetido)", "setenta (repetido)", "ochenta (repetido)",
                "noventa (repetido)", "cien mil", "un millón"
            )
        ),

        "spanish_a1_greetings" to LanguageLearningDeck(
            id = "spanish_a1_greetings",
            targetLanguage = "es",
            level = "A1",
            topic = "Saludos & Frases Básicas",
            words = listOf(
                "Hola", "Buenos días", "Buenas tardes", "Buenas noches", "Adiós", "Hasta luego",
                "Hasta mañana", "Por favor", "Gracias", "Muchas gracias", "Perdón", "Lo siento",
                "Sí", "No", "Tal vez", "¿Cómo estás?", "Bien, gracias", "¿Y tú?", "Estoy bien",
                "De nada", "No hay problema", "Todo bien", "Encantado de conocerte", "Me llamo...",
                "Mi nombre es...", "Un placer", "Bienvenido", "Bienvenida", "Que tengas un buen día",
                "Diviértete", "Buen viaje", "Cuídate", "Salud (al brindar)", "Feliz Navidad",
                "Feliz Año Nuevo", "Buena suerte", "Felicidades"
            )
        ),

        "spanish_a1_days_months" to LanguageLearningDeck(
            id = "spanish_a1_days_months",
            targetLanguage = "es",
            level = "A1",
            topic = "Días & Meses",
            words = listOf(
                "lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo",
                "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre", "ayer", "hoy", "mañana",
                "pasado mañana", "anteayer", "semana", "mes", "año", "fecha", "hora", "segundo",
                "minuto", "hora", "primavera", "verano", "otoño", "invierno", "fin de semana",
                "día laborable", "festivo", "cumpleaños", "fecha de nacimiento", "calendario",
                "de temporada"
            )
        ),

        "spanish_a1_clothing" to LanguageLearningDeck(
            id = "spanish_a1_clothing",
            targetLanguage = "es",
            level = "A1",
            topic = "Ropa",
            words = listOf(
                "la camisa", "los pantalones", "la falda", "el vestido", "la chaqueta", "el abrigo",
                "los zapatos", "las botas", "los calcetines", "el sombrero", "el gorro", "la bufanda",
                "los guantes", "la blusa", "el suéter", "la camiseta", "los vaqueros", "el traje",
                "la corbata", "el cinturón", "la ropa interior", "el sujetador", "el calcetín",
                "el zapato", "la sandalia", "la media", "el short", "el bañador", "el pijama",
                "la ropa de dormir", "la ropa interior (repetido)", "la chaqueta (repetido)",
                "el impermeable", "la parka", "el chándal (pantalón)", "el chándal (chaqueta)",
                "ropa deportiva", "la mochila", "la bolsa", "la cartera", "la gorra", "el guante",
                "las gafas"
            )
        ),

        "spanish_a1_animals" to LanguageLearningDeck(
            id = "spanish_a1_animals",
            targetLanguage = "es",
            level = "A1",
            topic = "Animales",
            words = listOf(
                "el perro", "el gato", "el pájaro", "el pez", "el caballo", "la vaca", "el cerdo",
                "la oveja", "la cabra", "el conejo", "el ratón", "la rata", "el elefante", "el león",
                "el tigre", "el oso", "el mono", "el conejo (repetido)", "el cocodrilo", "la rana",
                "la serpiente", "la tortuga", "el pájaro (repetido)", "el conejo (tercero)",
                "la mosca", "la abeja", "la hormiga", "el globo aerostático", "el pájaro (cuarto)",
                "la jirafa", "la cebra", "el rinoceronte", "el rinoceronte (repetido)", "el zorro",
                "el lobo", "el ciervo", "el venado", "el pato", "la oca", "el cisne", "la paloma",
                "el gorrión", "el búho", "el murciélago"
            )
        ),

        "spanish_a1_bodyparts" to LanguageLearningDeck(
            id = "spanish_a1_bodyparts",
            targetLanguage = "es",
            level = "A1",
            topic = "Partes del Cuerpo",
            words = listOf(
                "la cabeza", "la cara", "el ojo", "la oreja", "la nariz", "la boca", "el diente",
                "el cuello", "el hombro", "el brazo", "el codo", "la mano", "el dedo", "el pulgar",
                "el pecho", "la espalda", "el estómago", "el pie", "el dedo del pie", "la pierna",
                "la rodilla", "el tobillo", "la espalda (repetido)", "el corazón", "el pulmón",
                "el estómago (órgano)", "el hígado", "el riñón", "el cerebro", "la piel", "el cabello",
                "el dedo del pie (repetido)", "el codo (repetido)", "el hombro (repetido)",
                "la cintura", "la cadera", "la mejilla", "la barbilla", "la frente"
            )
        ),

        "spanish_a1_common_verbs" to LanguageLearningDeck(
            id = "spanish_a1_common_verbs",
            targetLanguage = "es",
            level = "A1",
            topic = "Verbos Comunes",
            words = listOf(
                "ser", "tener", "ir", "venir", "ver", "oír", "hablar", "comer", "beber",
                "vivir", "residir", "dormir", "conducir", "correr", "trabajar", "jugar", "leer",
                "escribir", "comprar", "vender", "dar", "tomar", "hacer", "tomar (repetido)",
                "encontrar", "perder", "pensar", "creer", "saber", "entender", "aprender",
                "estudiar", "ayudar", "esperar", "necesitar", "gustar", "amar", "querer",
                "poder", "deber", "haber de", "saber (repetido)", "querer (repetido)"
            )
        ),

        "spanish_a1_prepositions" to LanguageLearningDeck(
            id = "spanish_a1_prepositions",
            targetLanguage = "es",
            level = "A1",
            topic = "Preposiciones",
            words = listOf(
                "en", "sobre", "bajo", "encima", "al lado", "entre", "detrás", "delante", "a", "en casa de",
                "con", "sin", "para", "contra", "alrededor", "hasta", "después", "de", "desde", "desde hace",
                "a través", "a pesar de", "durante", "debido a", "dentro", "fuera", "a lo largo de",
                "enfrente de", "o ... o", "tanto ... como", "ni ... ni", "en lugar de", "en vez de",
                "a favor de", "independientemente de", "en contraposición a", "según", "de conformidad con",
                "a raíz de", "por falta de", "con ayuda de", "a consecuencia de"
            )
        ),

        "spanish_a1_adjectives_basic" to LanguageLearningDeck(
            id = "spanish_a1_adjectives_basic",
            targetLanguage = "es",
            level = "A1",
            topic = "Adjetivos Básicos",
            words = listOf(
                "bueno", "malo", "grande", "pequeño", "lento", "rápido", "frío", "caliente", "templado",
                "fresco", "pesado", "ligero", "viejo", "joven", "nuevo", "antiguo", "caro", "barato",
                "hermoso", "feo", "ruidoso", "silencioso", "fuerte", "débil", "claro", "oscuro", "redondo",
                "cuadrado", "liso", "áspero", "limpio", "sucio", "amable", "antipático", "feliz", "triste",
                "interesante", "aburrido", "hambriento", "sediento", "cansado", "saludable", "enfermo",
                "rico", "pobre"
            )
        ),

        "spanish_a2_food" to LanguageLearningDeck(
            id = "spanish_a2_food",
            targetLanguage = "es",
            level = "A2",
            topic = "Comida",
            words = listOf(
                "el pan", "el queso", "la charcutería", "la carne", "las verduras", "la manzana",
                "la leche", "el agua", "el café", "el té", "la cerveza", "el vino", "la mantequilla",
                "el huevo", "el pescado", "el pollo", "la patata", "el tomate", "la cebolla", "la ensalada",
                "la sopa", "la pasta", "el arroz", "las frutas", "el plátano", "la naranja", "el chocolate",
                "el pastel", "el helado", "el azúcar", "la sal", "la pimienta", "dulce", "agrio",
                "salado", "amargo", "picante", "grasiento", "saludable", "no saludable", "los mariscos",
                "los frijoles", "la papa (variante)", "el pimiento", "la zanahoria", "el calabacín", "la berenjena"
            )
        ),

        "spanish_a2_travel" to LanguageLearningDeck(
            id = "spanish_a2_travel",
            targetLanguage = "es",
            level = "A2",
            topic = "Viaje",
            words = listOf(
                "el viaje", "las vacaciones", "el avión", "la estación", "el tren", "el autobús",
                "el coche", "el taxi", "el metro", "el billete", "el hotel", "el albergue juvenil",
                "la reserva", "el equipaje", "la maleta", "la mochila", "el pasaje", "el pasaporte",
                "la llegada", "la salida", "el retraso", "el regreso", "la llegada (variante)", "el visado",
                "el pasaporte (repetido)", "el control fronterizo", "el control de seguridad", "la aduana",
                "el itinerario", "el guía turístico", "el lugar turístico", "el museo", "la galería",
                "la playa", "la ciudad", "el país", "el turismo", "la aerolínea", "el check-in",
                "el check-out", "la habitación doble", "la habitación individual", "el ascensor", "la recepción",
                "el desayuno", "la media pensión", "la pensión completa"
            )
        ),

        "spanish_a2_directions" to LanguageLearningDeck(
            id = "spanish_a2_directions",
            targetLanguage = "es",
            level = "A2",
            topic = "Direcciones & Transporte",
            words = listOf(
                "izquierda", "derecha", "todo recto", "arriba", "abajo", "encima", "debajo",
                "al lado", "entre", "enfrente", "la intersección", "el semáforo", "la calle",
                "el camino", "la bifurcación", "la entrada", "la salida", "la rotonda", "el puente",
                "el túnel", "la acera", "la parada", "la estación", "el letrero", "el tráfico",
                "la carretera", "la autopista", "la carretera nacional", "la calle de sentido único",
                "la vía rápida", "la gasolinera", "el taller", "el aparcamiento", "el parquímetro",
                "el ticket", "la tarifa", "el atasco", "el atajo", "el desvío", "el mapa", "la brújula",
                "la dirección", "la orientación", "la distancia", "el kilómetro", "la milla",
                "la intersección (repetido)"
            )
        ),

        "spanish_a2_health" to LanguageLearningDeck(
            id = "spanish_a2_health",
            targetLanguage = "es",
            level = "A2",
            topic = "Salud & Cuerpo",
            words = listOf(
                "el médico", "la médica", "la clínica", "el hospital", "el consultorio", "la farmacia",
                "la medicina", "la pastilla", "la píldora", "la inyección", "la vacuna", "la enfermedad",
                "la gripe", "la tos", "el resfriado", "la fiebre", "el dolor", "los dolores",
                "la lesión", "la herida", "el vendaje", "la operación", "el tratamiento", "el examen",
                "el diagnóstico", "la terapia", "el paciente", "la paciente", "el dentista", "el dolor de muelas",
                "el análisis de sangre", "la presión arterial", "el pulso", "la respiración", "la relajación",
                "la nutrición", "la dieta", "el ejercicio", "el deporte", "el entrenamiento", "el gimnasio",
                "el entrenador", "el ejercicio físico", "la recuperación", "la rehabilitación",
                "el chequeo médico", "el seguro médico", "la salud"
            )
        ),

        "spanish_a2_housing" to LanguageLearningDeck(
            id = "spanish_a2_housing",
            targetLanguage = "es",
            level = "A2",
            topic = "Vivienda & Hogar",
            words = listOf(
                "la casa", "el apartamento", "la habitación", "la cocina", "el baño", "el dormitorio",
                "la sala", "el balcón", "el jardín", "la terraza", "el garaje", "el sótano",
                "el desván", "la escalera", "el pasillo", "la puerta", "la ventana", "la pared",
                "el suelo", "el techo", "la mesa", "la silla", "la cama", "el armario", "el escritorio",
                "la nevera", "la cocina (electrodoméstico)", "la calefacción", "el aire acondicionado",
                "la lámpara", "el enchufe", "el grifo", "la ducha", "la bañera", "el inodoro",
                "el lavabo", "el fregadero", "la estufa", "el lavaplatos", "la lavadora", "la secadora",
                "la aspiradora", "el sofá", "el sillón", "la alfombra", "el espejo", "la estantería"
            )
        ),

        "spanish_a2_time" to LanguageLearningDeck(
            id = "spanish_a2_time",
            targetLanguage = "es",
            level = "A2",
            topic = "Expresiones de Tiempo",
            words = listOf(
                "la hora", "el minuto", "el segundo", "el día", "la semana", "el mes", "el año",
                "el siglo", "la mañana", "la mañana (parte)", "el mediodía", "la tarde", "la noche",
                "hoy", "ayer", "mañana", "pasado mañana", "anteayer", "ahora", "pronto", "más tarde",
                "enseguida", "de inmediato", "presente", "ausente", "puntual", "tarde", "temprano",
                "más temprano", "tarde (repetido)", "siempre", "nunca", "a veces", "con frecuencia",
                "rara vez", "ocasionalmente", "todavía", "ya", "todavía (repetido)", "¿hasta cuándo?",
                "¿desde cuándo?", "¿cuánto tiempo?", "durante", "antes", "después", "semanalmente",
                "mensualmente", "anualmente", "diariamente"
            )
        ),

        "spanish_a2_weather" to LanguageLearningDeck(
            id = "spanish_a2_weather",
            targetLanguage = "es",
            level = "A2",
            topic = "Clima",
            words = listOf(
                "el clima", "el sol", "la nube", "la lluvia", "la nieve", "el frío", "el calor",
                "el viento", "la tormenta", "la niebla", "la helada", "el granizo", "el trueno",
                "el relámpago", "la temperatura", "el pronóstico", "el barómetro", "la humedad",
                "la luz solar", "el paraguas", "el impermeable", "el abrigo", "el mapa del clima",
                "la estación meteorológica", "el arcoíris", "el huracán", "la brisa", "la tormenta eléctrica",
                "la sequía", "la inundación", "el tsunami", "al mediodía", "por la tarde", "por la mañana",
                "despejado", "nublado", "lluvioso", "tormentoso", "soleado", "nieva", "congelarse",
                "derretirse", "más de 30 °C", "por debajo de 0 °C"
            )
        ),

        "spanish_a2_shopping" to LanguageLearningDeck(
            id = "spanish_a2_shopping",
            targetLanguage = "es",
            level = "A2",
            topic = "Compras & Dinero",
            words = listOf(
                "la tienda", "el centro comercial", "el mercado", "el precio", "el costo",
                "el descuento", "la caja", "el recibo", "la oferta", "la demanda", "el vendedor",
                "la vendedora", "el cliente", "la clienta", "la mercancía", "el producto", "la marca",
                "el tamaño", "el color", "el probador", "el carrito de compras", "la bolsa", "la billetera",
                "la cartera", "el cambio", "el billete", "la tarjeta de crédito", "la tarjeta bancaria",
                "el cupón", "el ticket", "gratis", "caro", "barato", "pagable", "invaluable", "la factura",
                "la tarifa", "el monto", "el balance", "el presupuesto", "la solvencia", "la deuda",
                "la inversión", "el rendimiento"
            )
        ),

        "spanish_a2_emotions" to LanguageLearningDeck(
            id = "spanish_a2_emotions",
            targetLanguage = "es",
            level = "A2",
            topic = "Emociones & Sentimientos",
            words = listOf(
                "feliz", "triste", "enojado", "molesto", "preocupado", "ansioso", "relajado",
                "estresado", "emocionado", "aburrido", "interesado", "satisfecho", "insatisfecho",
                "esperanzado", "desesperado", "orgulloso", "avergonzado", "culpable", "curioso",
                "celoso", "tímido", "confiado", "amable", "antipático", "paciente", "impaciente",
                "agradecido", "desagradecido", "compasivo", "empático", "simpático", "irritable",
                "motivado", "desmotivado", "optimista", "pesimista", "resignado", "apasionado",
                "indiferente", "cariñoso", "amargo", "eufórico", "melancólico", "sorprendido",
                "paranoico", "distante", "conectado", "amoroso", "peligroso"
            )
        ),

        "spanish_a2_transport" to LanguageLearningDeck(
            id = "spanish_a2_transport",
            targetLanguage = "es",
            level = "A2",
            topic = "Transporte & Vehículos",
            words = listOf(
                "el autobús", "el tren", "la bicicleta", "el coche", "el taxi", "el conductor",
                "la conductora", "el maquinista", "el horario", "la máquina de billetes",
                "el billete", "el pasaje", "la parada", "la estación", "el aeropuerto", "el avión",
                "el piloto", "la piloto", "la azafata", "el pasajero", "la maleta", "la cinta transportadora",
                "la pista", "la puerta de embarque", "el boleto de avión", "la tarjeta de embarque",
                "el equipaje", "la mochila", "el GPS", "el volante", "el acelerador", "el freno",
                "el embrague", "la caja de cambios", "el motor", "el vehículo", "el neumático",
                "la autopista", "la carretera", "el tráfico", "los medios de transporte", "el aparcamiento",
                "el estacionamiento subterráneo", "la gasolinera", "el diésel", "la gasolina",
                "el patinete eléctrico", "el ciclomotor"
            )
        ),

        // B1-Level Decks
        "spanish_b1_work_career" to LanguageLearningDeck(
            id = "spanish_b1_work_career",
            targetLanguage = "es",
            level = "B1",
            topic = "Trabajo & Carrera",
            words = listOf(
                "la profesión", "la carrera", "el ascenso", "el despido", "el desempleo",
                "el currículum", "la entrevista de trabajo", "la solicitud", "la cualificación",
                "la formación continua", "la pasantía", "el colega", "la colega", "el superior",
                "la jornada laboral", "el trabajo por turnos", "el trabajo a tiempo parcial",
                "el trabajo a tiempo completo", "el salario", "la remuneración", "la seguridad social",
                "la jubilación", "la pensión", "la declaración de impuestos", "la declaración de la renta",
                "el convenio colectivo", "el sindicato", "las condiciones de trabajo", "la responsabilidad",
                "el certificado de trabajo", "la fuerza laboral", "el sector", "la empresa", "la sucursal",
                "la oficina central", "la dirección", "la gestión", "la responsabilidad", "el curso de formación",
                "el trabajo temporal", "el contrato de trabajo", "el empleador", "el empleado",
                "el trabajo en equipo", "la gestión de proyectos", "la nómina", "la carga de trabajo",
                "el preaviso"
            )
        ),

        "spanish_b1_travel_tourism" to LanguageLearningDeck(
            id = "spanish_b1_travel_tourism",
            targetLanguage = "es",
            level = "B1",
            topic = "Viajes & Turismo",
            words = listOf(
                "el viaje", "las vacaciones", "el hotel", "el albergue juvenil", "la reserva",
                "el equipaje", "la maleta", "la mochila", "el monumento", "la agencia de viajes",
                "el guía turístico", "el turista", "la turista", "el tour por la ciudad", "el guía local",
                "la aerolínea", "el registro (check-in)", "la salida (check-out)", "la habitación doble",
                "la habitación individual", "la media pensión", "la pensión completa", "el bufé",
                "el precio de la habitación", "la recepción", "el ascensor", "el minibar", "la caja fuerte",
                "el aire acondicionado", "la valoración del huésped", "el plano de la ciudad", "el GPS",
                "la ruta de viaje", "la consigna", "el servicio de traslado", "el servicio de lanzadera",
                "el itinerario", "las excursiones", "los documentos de viaje", "el visado", "el pasaporte",
                "el control fronterizo", "el control de seguridad", "el billete", "el pasaje", "el horario",
                "el retraso", "la llegada", "la partida", "la puerta de embarque", "la recogida de equipaje",
                "la tienda duty-free"
            )
        ),

        "spanish_b1_health_body" to LanguageLearningDeck(
            id = "spanish_b1_health_body",
            targetLanguage = "es",
            level = "B1",
            topic = "Salud & Cuerpo",
            words = listOf(
                "el médico", "la médica", "la clínica", "el hospital", "la consulta", "la farmacia",
                "el medicamento", "la pastilla", "la inyección", "la vacuna", "el tratamiento",
                "el examen médico", "el diagnóstico", "la terapia", "el análisis de sangre", "la presión arterial",
                "el pulso", "el latido cardíaco", "el pulmón", "el riñón", "el hígado", "el estómago",
                "el intestino", "el cerebro", "el sistema nervioso", "el sistema inmunológico", "la piel",
                "el esqueleto", "el músculo", "la articulación", "la fractura ósea", "la herida", "el vendaje",
                "la operación", "la anestesia", "la rehabilitación", "la alergia", "la infección", "la gripe",
                "el resfriado", "la fiebre", "la tos", "el resfriado (repetido)", "la inflamación",
                "el dolor", "el dolor de cabeza", "las náuseas", "la diarrea", "la salud",
                "el chequeo preventivo", "el seguro médico", "el copago"
            )
        ),

        "spanish_b1_shopping_money" to LanguageLearningDeck(
            id = "spanish_b1_shopping_money",
            targetLanguage = "es",
            level = "B1",
            topic = "Compras & Dinero",
            words = listOf(
                "la tienda", "el gran almacén", "el centro comercial", "la publicidad", "la oferta especial",
                "el descuento", "la rebaja", "la factura", "el recibo", "la caja", "el ticket",
                "el probador", "la prueba", "la devolución", "el cambio", "el vendedor", "la vendedora",
                "el cliente", "la clienta", "la oferta de productos", "la selección", "la calidad",
                "la marca de lujo", "la marca blanca", "el fabricante", "la fabricación", "el envío",
                "la entrega", "el comercio electrónico", "la tienda en línea", "el carrito", "el método de pago",
                "la tarjeta de crédito", "la tarjeta bancaria", "el cheque", "el efectivo", "el cajero",
                "la sucursal bancaria", "la cuenta corriente", "la cuenta de ahorros", "la transferencia",
                "el cargo automático", "las tarifas", "el importe", "el balance", "el presupuesto",
                "la solvencia", "la deuda", "la inversión", "el rendimiento"
            )
        ),

        "spanish_b1_housing_home" to LanguageLearningDeck(
            id = "spanish_b1_housing_home",
            targetLanguage = "es",
            level = "B1",
            topic = "Vivienda & Hogar",
            words = listOf(
                "la casa", "el apartamento", "el contrato de arrendamiento", "el alquiler", "los gastos comunes",
                "la fianza", "el anuncio inmobiliario", "el agente inmobiliario", "la comisión", "la propiedad",
                "el propietario", "el inquilino", "el arrendador", "el piso en copropiedad", "la casa adosada",
                "la casa unifamiliar", "la construcción", "la solicitud de licencia de obra", "la licencia de obra",
                "la renovación", "el equipamiento", "la cocina equipada", "el suelo", "la calefacción",
                "la calefacción central", "la calefacción por suelo radiante", "el aire acondicionado",
                "la ventilación", "el tejado", "la fachada", "el aislamiento", "la energía solar",
                "la conexión eléctrica", "la instalación eléctrica", "la fontanería", "las instalaciones sanitarias",
                "el cuarto de baño", "la bañera", "la ducha", "el inodoro", "la lavadora", "la secadora",
                "la nevera", "la estufa", "el horno", "el lavavajillas", "el garaje", "la plaza de aparcamiento",
                "el jardín", "la terraza"
            )
        ),

        // B2-Level Decks
        "spanish_b2_politics_society" to LanguageLearningDeck(
            id = "spanish_b2_politics_society",
            targetLanguage = "es",
            level = "B2",
            topic = "Política & Sociedad",
            words = listOf(
                "la democracia", "el parlamento", "el gobierno", "el líder", "la oposición",
                "la votación", "la elección", "la campaña electoral", "el resultado electoral", "la coalición",
                "la mayoría", "la minoría", "la oposición (repetido)", "la legislación", "la ley",
                "la constitución", "la libertad de expresión", "la libertad de prensa", "la libertad de reunión",
                "la manifestación", "la protesta", "el referéndum", "el debate", "el discurso",
                "el lobby", "el lobbista", "el desencanto político", "la corrupción", "el escándalo",
                "la transparencia", "la responsabilidad", "la ética", "la moral", "la integración",
                "la migración", "la globalización", "la política ambiental", "el cambio climático",
                "la sostenibilidad", "la justicia social", "la lucha contra la pobreza",
                "el sistema social", "la reforma sanitaria", "la política educativa", "el mercado laboral",
                "la tasa de desempleo", "el sindicato"
            )
        ),

        "spanish_b2_business_finance" to LanguageLearningDeck(
            id = "spanish_b2_business_finance",
            targetLanguage = "es",
            level = "B2",
            topic = "Negocios & Finanzas",
            words = listOf(
                "la economía", "el producto interno bruto", "la inflación", "la deflación",
                "la recesión", "la expansión", "la exportación", "la importación", "la balanza comercial",
                "el déficit comercial", "la moneda", "el euro", "el dólar", "la bolsa", "la acción",
                "el bono", "el inversor", "la cartera", "la gestión de riesgos", "la agencia tributaria",
                "el impuesto", "el IVA", "el impuesto sobre la renta", "el impuesto de sociedades",
                "el beneficio", "la pérdida", "el balance", "la cuenta de resultados", "la nómina",
                "los costes laborales", "el presupuesto", "el hogar", "el crédito", "la hipoteca",
                "la tasa de interés", "el rendimiento", "el dividendo", "la deuda", "la liquidez",
                "la quiebra", "la reestructuración", "la fusión", "la adquisición", "la cultura start-up",
                "el modelo de negocio", "la investigación de mercado", "la fidelización", "la distribución"
            )
        ),

        "spanish_b2_education_learning" to LanguageLearningDeck(
            id = "spanish_b2_education_learning",
            targetLanguage = "es",
            level = "B2",
            topic = "Educación & Aprendizaje",
            words = listOf(
                "la educación", "el sistema escolar", "la universidad", "la escuela politécnica",
                "la institución educativa", "las tasas de matrícula", "la beca", "la admisión",
                "la inscripción", "el semestre", "las normas de examen", "el examen escrito", "el trabajo fin de grado",
                "el proyecto", "la tesis", "la disertación", "el profesor", "la profesora", "el docente",
                "la docente", "el estudiante", "la estudiante", "el compañero de clase", "la compañera de clase",
                "el horario", "el plan de estudios", "el currículo", "la pedagogía", "la didáctica", "la metodología",
                "la estrategia de aprendizaje", "la autodisciplina", "la preparación para exámenes",
                "la carga de estudio", "el asesoramiento académico", "el programa de intercambio", "el programa Erasmus",
                "la formación profesional", "la formación dual", "la formación continua", "la capacitación adicional",
                "el certificado", "la validación", "el título", "la calificación", "la evaluación",
                "la clase presencial", "el curso en línea", "el aprendizaje electrónico"
            )
        ),

        "spanish_b2_culture_literature" to LanguageLearningDeck(
            id = "spanish_b2_culture_literature",
            targetLanguage = "es",
            level = "B2",
            topic = "Cultura & Literatura",
            words = listOf(
                "la literatura", "la novela", "el cuento", "el poema", "la novela corta",
                "el dramaturgo", "la dramaturga", "la obra de teatro", "la tragedia", "la comedia",
                "el teatro", "la ópera", "el escenario", "la puesta en escena", "el guion",
                "la dirección", "el director", "la directora", "el público", "la reseña",
                "la crítica", "la alegoría", "la metáfora", "el símbolo", "el protagonista",
                "el antagonista", "la trama", "el clímax", "el desenlace", "la ironía",
                "el sátira", "la sátira (femenino)", "la épica", "la lírica", "la fábula", "la parábola",
                "el ensayo", "la biografía", "la autobiografía", "el best-seller", "la lectura pública",
                "la historia literaria", "el romanticismo", "la Ilustración", "el expresionismo",
                "la modernidad"
            )
        ),

        // Otros Decks B1
        "spanish_b1_daily_routines" to LanguageLearningDeck(
            id = "spanish_b1_daily_routines",
            targetLanguage = "es",
            level = "B1",
            topic = "Rutinas Diarias",
            words = listOf(
                "levantarse", "despertarse", "lavarse", "cepillarse los dientes", "vestirse",
                "preparar el desayuno", "desayunar", "ir al trabajo", "ir a la escuela", "trabajar",
                "estudiar", "hacer una pausa", "almorzar", "regresar", "volver a casa", "preparar la cena",
                "cenar", "ver la televisión", "leer", "acostarse", "relajarse", "hacer deporte",
                "salir a correr", "ir al gimnasio", "hacer la compra", "lavar la ropa", "pasar la aspiradora",
                "hacer la tarea", "recibir invitados", "llamar por teléfono", "aprovechar oportunidades",
                "programar citas", "planificar el día", "huevo estrellado", "lista de tareas", "rutina",
                "hábito"
            )
        ),

        "spanish_b1_technology_internet" to LanguageLearningDeck(
            id = "spanish_b1_technology_internet",
            targetLanguage = "es",
            level = "B1",
            topic = "Tecnología & Internet",
            words = listOf(
                "la computadora", "la portátil", "la tableta", "el smartphone", "la aplicación",
                "el software", "el sistema operativo", "el teclado", "el ratón", "la pantalla",
                "el archivo", "la carpeta", "guardar", "cargar", "descargar", "subir",
                "el sitio web", "el navegador", "el motor de búsqueda", "la contraseña", "el cortafuegos",
                "la red", "el router", "el Wi-Fi", "la conexión a Internet", "transmitir",
                "la nube", "la red social", "el nombre de usuario", "la privacidad", "el virus",
                "el antivirus", "la base de datos", "la actualización", "descargar la aplicación",
                "instalar la aplicación", "la copia de seguridad", "la restauración", "el desarrollador",
                "la programación", "el lenguaje de programación", "el código fuente", "el mensaje de error"
            )
        ),

        "spanish_b1_environment_nature" to LanguageLearningDeck(
            id = "spanish_b1_environment_nature",
            targetLanguage = "es",
            level = "B1",
            topic = "Medio Ambiente & Naturaleza",
            words = listOf(
                "el medio ambiente", "la conservación ambiental", "el cambio climático", "el calentamiento global",
                "el gas de efecto invernadero", "las emisiones de CO₂", "la energía renovable", "la energía solar",
                "la energía eólica", "la energía hidroeléctrica", "la energía fotovoltaica", "el reciclaje",
                "los desechos", "la separación de residuos", "la contaminación", "la contaminación del aire",
                "la contaminación del agua", "la lluvia ácida", "la selva tropical", "el bosque",
                "el océano", "la contaminación marina", "la protección climática", "la conservación",
                "la reserva natural", "la protección de especies", "la biodiversidad", "la preservación",
                "el ecosistema", "el hábitat", "la sostenibilidad", "el recurso", "el papel reciclado",
                "la botella de plástico", "la desaparición de abejas", "la colmena", "la pérdida de hábitat",
                "la especie en peligro", "la catástrofe ambiental"
            )
        ),

        // Otros Decks B2
        "spanish_b2_science_research" to LanguageLearningDeck(
            id = "spanish_b2_science_research",
            targetLanguage = "es",
            level = "B2",
            topic = "Ciencia & Investigación",
            words = listOf(
                "la investigación", "el científico", "la científica", "el laboratorio",
                "el experimento", "la hipótesis", "la teoría", "el estudio", "los datos",
                "la estadística", "el método", "el sujeto de prueba", "la muestra",
                "la publicación", "la revista científica", "la revisión por pares", "el descubrimiento",
                "la innovación", "el desarrollo", "la tecnología", "la biología", "la química",
                "la física", "la geología", "la astronomía", "la medicina", "la genética",
                "la neurología", "la psicología", "la sociología", "la antropología", "la ética",
                "el proyecto de investigación", "el financiamiento", "la subvención", "la solicitud de subvención",
                "la tesis doctoral", "la plaza postdoctoral", "la cátedra", "el departamento",
                "la conferencia", "la presentación", "la colaboración", "la cooperación", "la revista",
                "la cita", "el artículo original"
            )
        ),

        "spanish_b2_art_music" to LanguageLearningDeck(
            id = "spanish_b2_art_music",
            targetLanguage = "es",
            level = "B2",
            topic = "Arte & Música",
            words = listOf(
                "el arte", "el artista", "la artista", "la pintura", "la escultura",
                "la exposición", "la galería", "el museo", "el lienzo", "el color",
                "el pincel", "la pintura (acción)", "la fotografía", "el collage", "la cerámica",
                "la arquitectura", "el arquitecto", "el patrimonio arquitectónico", "el concierto", "la ópera",
                "la orquesta", "el director de orquesta", "la directora de orquesta", "el piano", "el violín",
                "la guitarra", "la batería", "el baterista", "la voz", "el cantante", "la cantante",
                "la composición", "el compositor", "la compositora", "la canción", "la melodía",
                "el ritmo", "el compás", "la armonía", "la disonancia", "el jazz", "la música clásica",
                "el rock", "la música pop", "el videoclip", "la grabación de audio", "el vinilo", "el CD",
                "el servicio de streaming", "el festival", "la presentación", "el ensayo", "la gira",
                "la escena", "el estilo artístico"
            )
        ),

        "spanish_b2_law_order" to LanguageLearningDeck(
            id = "spanish_b2_law_order",
            targetLanguage = "es",
            level = "B2",
            topic = "Derecho & Orden",
            words = listOf(
                "la ley", "el reglamento", "el orden jurídico", "el juez", "la juez",
                "el abogado", "la abogada", "el bufete", "el cliente", "la clienta",
                "la demanda", "la presentación de la demanda", "la audiencia", "la sentencia", "la decisión",
                "la apelación", "el tribunal de apelación", "el tribunal penal", "la fiscalía", "el fiscal",
                "la fiscal (femenino)", "el acusado", "la acusada", "la defensa", "la defensora",
                "el código penal", "el derecho civil", "el derecho penal", "el derecho laboral",
                "el derecho de familia", "el derecho sucesorio", "el derecho de arrendamiento",
                "el derecho contractual", "la libertad contractual", "la responsabilidad civil",
                "la demanda de indemnización", "los costos judiciales", "la prescripción",
                "la seguridad pública", "la persecución penal", "la pena de prisión", "la multa",
                "la pena con suspensión", "el bien jurídico", "la declaración de testigos", "la confesión",
                "el testimonio", "la recolección de pruebas", "la carga de la prueba"
            )
        ),

        // C1-Level Decks
        "spanish_c1_politics_society_advanced" to LanguageLearningDeck(
            id = "spanish_c1_politics_society_advanced",
            targetLanguage = "es",
            level = "C1",
            topic = "Política & Sociedad (Avanzado)",
            words = listOf(
                "camarada de partido", "negociaciones de coalición", "participación electoral",
                "legitimidad política", "populismo", "jefe de Estado", "tribunal constitucional",
                "derechos fundamentales", "derechos de las minorías", "lobby", "principio de igualdad",
                "democratización", "Estado de derecho", "golpe de Estado", "dictadura", "política de oposición",
                "medidas de sanción", "crimen de guerra", "violación de derechos humanos",
                "comisión de derechos humanos", "presupuesto estatal", "ley de transparencia",
                "declaración de independencia", "derecho a la autodeterminación", "endeudamiento estatal",
                "sanciones económicas", "canal diplomático", "política exterior", "política interna",
                "visita de Estado", "cultura del país anfitrión", "burbuja inmobiliaria", "política de crecimiento",
                "equidad social", "desigualdad de ingresos", "protección social", "crisis de refugiados",
                "procedimiento de asilo", "derecho de residencia", "expatriado", "certificado de ciudadanía",
                "libertad de religión", "pluralismo de opinión", "censura de prensa", "libertad de información",
                "ley anticorrupción", "regulación de donaciones políticas", "financiamiento de campañas",
                "programa político", "circunscripción electoral", "candidatura a la presidencia",
                "iniciativa legislativa", "proyecto de ley", "cierre del debate plenario", "exclusión del voto"
            )
        ),

        "spanish_c1_science_technology_advanced" to LanguageLearningDeck(
            id = "spanish_c1_science_technology_advanced",
            targetLanguage = "es",
            level = "C1",
            topic = "Ciencia & Tecnología (Avanzado)",
            words = listOf(
                "física cuántica", "acelerador de partículas", "ondas gravitacionales", "materia oscura",
                "teoría de la relatividad", "fusión nuclear", "ingeniería genética", "CRISPR/Cas9",
                "actividad de telomerasa", "epigenética", "perfil de expresión génica", "investigación con células madre",
                "clonación", "neurotransmisión", "neurociencia", "plasticidad cerebral", "biocompatibilidad",
                "biomarcador", "control de prótesis", "sistema órgano-en-un-chip", "nanorrobot", "nanopartícula",
                "computadora cuántica", "complejidad de algoritmos", "framework de aprendizaje automático",
                "red neuronal", "aprendizaje profundo", "comunicación de gestión de bases de datos",
                "criptografía", "tecnología blockchain", "Internet de las cosas", "sistema ciberfísico",
                "inteligencia artificial", "reconocimiento de objetos", "reconocimiento de voz",
                "realidad aumentada", "realidad virtual", "aumento", "impresión 3D", "prototipado rápido",
                "cirugía robótica", "bioprinting", "bioinformática", "modelado climático", "investigación atmosférica",
                "visualización de datos", "química analítica", "diagnóstico molecular", "célula fotovoltaica",
                "tecnología de almacenamiento de baterías", "almacenamiento de energía", "central hidroeléctrica",
                "explotación geotérmica", "energía de fusión", "telescopio espacial", "comunicación por satélite"
            )
        ),

        "spanish_c1_business_finance_advanced" to LanguageLearningDeck(
            id = "spanish_c1_business_finance_advanced",
            targetLanguage = "es",
            level = "C1",
            topic = "Negocios & Finanzas (Avanzado)",
            words = listOf(
                "capitalización de mercado", "índice bursátil", "riesgo cambiario", "mercado de divisas",
                "inversión de capital riesgo", "valoración empresarial", "estrategia de fusiones y adquisiciones",
                "due diligence", "folleto de valores", "programa de recompra de acciones", "rentabilidad de capital",
                "efectividad ultracorta", "derivado financiero", "warrant", "operación a plazo",
                "contrato de swap", "declaración de misión", "análisis competitivo", "cadena de valor",
                "auditoría interna", "política de cumplimiento", "gobierno corporativo", "gestión de stakeholders",
                "plataforma de crowdfunding", "valoración de startups", "pitch deck", "estrategia de crecimiento",
                "estrategia de diversificación", "penetración de mercado", "optimización de cartera",
                "gestión de liquidez", "análisis de balance", "referencias de indicadores", "expectativa de rendimiento",
                "estructura de financiación", "instrumento de mercado de capitales", "tasa swap", "cobertura contra inflación",
                "swap de divisas", "venta en corto", "securitización", "obligación colateralizada", "pérdida arrastrada",
                "optimización fiscal", "estrategia de dividendos", "unidades restringidas de acciones",
                "sistema de incentivos", "remuneración de ejecutivos", "sistemas de control interno", "éxito gerencial"
            )
        ),

        "spanish_c1_culture_art_literature" to LanguageLearningDeck(
            id = "spanish_c1_culture_art_literature",
            targetLanguage = "es",
            level = "C1",
            topic = "Cultura, Arte & Literatura (Avanzado)",
            words = listOf(
                "expresionismo", "impresionismo", "surrealismo", "dadaísmo", "escapismo",
                "existencialismo", "romanticismo", "Ilustración", "naturalismo", "modernismo",
                "posmodernismo", "vanguardista", "discurso estético", "deconstruccionismo", "crítica literaria",
                "estudios literarios", "perspectiva narrativa", "recursos estilísticos", "simbolismo", "alegoría",
                "sátira", "parodia", "ironía", "uso de metáforas", "intertextualidad", "interpretación de sueños",
                "psicoanálisis", "construcción novelística", "desarrollo de personajes", "trama narrativa",
                "dramaturgia", "análisis de escena", "concepto de puesta en escena", "planificación de dirección",
                "diseño escénico", "vestuario", "dirección de cámara", "análisis de guion", "crítica cinematográfica",
                "documental", "producción de cortometrajes", "instalación sonora", "arte performance",
                "arte de instalación", "arte conceptual", "arte urbano", "reportaje fotográfico",
                "análisis arquitectónico", "patrimonio histórico"
            )
        ),

        "spanish_c1_philosophy_ethics" to LanguageLearningDeck(
            id = "spanish_c1_philosophy_ethics",
            targetLanguage = "es",
            level = "C1",
            topic = "Filosofía & Ética (Avanzado)",
            words = listOf(
                "metafísica", "ontología", "epistemología", "teleología", "existencialismo",
                "fenomenología", "hermenéutica", "dialéctica", "método socrático", "imperativo categórico",
                "utilitarismo", "pluralismo", "relativismo", "determinismo", "indeterminismo",
                "dualismo", "monismo", "constructivismo", "idealismo", "realismo",
                "escepticismo", "deontología", "ética teleológica", "ética de la virtud",
                "ética normativa", "metaética", "teoría de la justicia", "contrato social", "ética de convicciones",
                "ética de la responsabilidad", "comisión de ética", "decisión de conciencia", "ley moral",
                "dignidad humana", "principio de autonomía", "ética de principios", "justificación de la acción",
                "antropología filosófica", "visión del mundo", "filosofía de la vida", "filosofía del lenguaje",
                "historia del pensamiento", "positivismo lógico", "pragmatismo", "realismo filosófico",
                "ética feminista", "ética ambiental", "bioética", "ética animal"
            )
        ),

        // C2-Level Decks
        "spanish_c2_academic_research" to LanguageLearningDeck(
            id = "spanish_c2_academic_research",
            targetLanguage = "es",
            level = "C2",
            topic = "Investigación Académica (Experto)",
            words = listOf(
                "proceso de revisión por pares", "financiamiento de investigación", "cooperación en investigación",
                "obligación de publicar", "directriz de acceso abierto", "revista académica", "factor de impacto",
                "metaanálisis", "encuesta a expertos", "investigación de campo", "diario de laboratorio",
                "procesamiento de datos", "investigación cualitativa", "investigación cuantitativa",
                "estudio longitudinal", "estudio transversal", "estudio de caso", "ensayo clínico aleatorizado",
                "efecto placebo", "estudio a ciegas", "estudio doble ciego", "ensayo de intervención",
                "comité de ética", "anonimización", "reglamento de protección de datos", "diseño de investigación",
                "marco de acción", "transferencia de métodos", "interdisciplinariedad", "paradigma de investigación",
                "pruebas de hipótesis", "nivel de significancia", "intervalo de confianza", "error tipo I y II",
                "análisis de varianza", "análisis de regresión", "análisis factorial", "análisis de conglomerados",
                "aprendizaje automático", "análisis de big data", "técnicas de análisis de texto", "análisis de contenido",
                "análisis del discurso", "análisis hermenéutico", "validez reflexiva", "prueba de fiabilidad",
                "reproducibilidad", "informe de investigación", "tesis doctoral", "tesis de habilitación",
                "sustitución de cátedra", "congreso científico", "conferencia especializada", "presentación de póster",
                "resumen de ponencia", "ética en publicaciones"
            )
        ),

        "spanish_c2_legal_jurisprudence" to LanguageLearningDeck(
            id = "spanish_c2_legal_jurisprudence",
            targetLanguage = "es",
            level = "C2",
            topic = "Derecho & Jurisprudencia (Experto)",
            words = listOf(
                "dictamen jurídico", "ayuda jurídica gratuita", "defensa penal", "acusación formal",
                "alegato de defensa", "motivación de la sentencia", "independencia judicial", "toma de declaraciones de testigos",
                "informe pericial", "procedimiento de recursos", "recurso de casación", "demanda de nulidad",
                "recurso de amparo", "tribunal constitucional", "tribunal europeo", "arbitraje",
                "tratado internacional", "inmunidad diplomática", "jurisdicción extraterritorial",
                "derecho de nacionalidad", "derecho internacional privado", "derecho penal internacional",
                "convención de derechos humanos", "derecho consuetudinario internacional", "práctica científica",
                "derecho societario", "estatutos sociales", "sociedad anónima", "constitución de SL",
                "derecho cooperativo", "conflicto entre socios", "limitación de responsabilidad",
                "aumento de capital", "acuerdo de reparto de dividendos", "registro mercantil",
                "control de fusiones", "ley contra el blanqueo de capitales", "derecho de protección de datos",
                "infracción de derechos de autor", "litigio de patentes", "infracción de marca",
                "restricción de la competencia", "revisión de cláusulas de contrato", "contrato de obra",
                "prestación de servicios", "cláusula penal", "reclamación de responsabilidad", "responsabilidad civil",
                "derecho de repetición", "cláusula de exención de responsabilidad"
            )
        ),

        "spanish_c2_medical_health_advanced" to LanguageLearningDeck(
            id = "spanish_c2_medical_health_advanced",
            targetLanguage = "es",
            level = "C2",
            topic = "Medicina & Salud (Experto)",
            words = listOf(
                "diagnóstico diferencial", "terapia multimodal", "terapia antibiótica", "profilaxis de infecciones",
                "infección nosocomial", "patógeno nosocomial", "inmunomodulación", "enfermedad autoinmune",
                "inmunoterapia", "resección quirúrgica", "cirugía mínimamente invasiva", "cirugía de trasplante",
                "procedimiento de donación de órganos", "criterios de selección de donantes", "tratamiento oncológico",
                "indicación de quimioterapia", "planificación de radioterapia", "reglamento de protección radiológica",
                "medicina paliativa", "terapia del dolor", "rehabilitación geriátrica", "medicina neonatal",
                "cuidados intensivos neonatales", "neonatología", "perinatología", "intervención cardiovascular",
                "implantación de stent", "cirugía de derivación", "interpretación de ECG", "desfibrilador cardíaco",
                "trasplante cardíaco", "procedimiento de diálisis", "terapia de reemplazo renal",
                "hemodiálisis", "diálisis peritoneal", "endoscopia", "gastroscopia", "comunicación médico-paciente",
                "procedimientos de la seguridad social", "protocolo de rehabilitación", "economía de la salud",
                "investigación en servicios de salud", "ley de organización sanitaria", "financiamiento hospitalario",
                "sistema DRG", "grado de dependencia", "acciones de atención compleja", "software de consultorio",
                "telemedicina", "informática de salud", "historia clínica electrónica", "aplicaciones de salud",
                "ética médica"
            )
        ),

        "spanish_c2_environment_sustainability" to LanguageLearningDeck(
            id = "spanish_c2_environment_sustainability",
            targetLanguage = "es",
            level = "C2",
            topic = "Medio Ambiente & Sostenibilidad (Experto)",
            words = listOf(
                "legislación de protección climática", "emisiones de gases de efecto invernadero", "política climática",
                "huella de carbono", "neutralidad de carbono", "impuesto al carbono", "sistema de comercio de emisiones",
                "certificado de emisiones", "ley de energías renovables", "fomento fotovoltaico",
                "certificación de parques eólicos", "desarrollo geotérmico", "análisis de ciclo de vida",
                "evaluación de huella ambiental", "eficiencia de recursos", "economía circular",
                "estrategia de prevención de residuos", "proceso de reciclaje inverso", "downcycling",
                "tasa de reciclaje", "gestión de vertederos", "valorización de lodos de depuradora", "sustituto de materia prima",
                "nicho ecológico", "estrategia de biodiversidad", "programa de conservación de especies",
                "medida de restauración ambiental", "plan de ordenación territorial", "área protegida",
                "gestión de áreas protegidas", "directiva marco del agua", "área marina protegida",
                "evaluación de impacto ambiental", "análisis de proyectos de construcción", "evaluación de riesgos",
                "gestión de flujos de materiales", "certificación de sostenibilidad", "control ambiental",
                "etiqueta ecológica", "responsabilidad social empresarial", "responsabilidad social corporativa",
                "lucha contra el greenwashing", "estrategia de adaptación al cambio climático", "plan de prevención de catástrofes",
                "gestión de sequías", "plan de protección contra inundaciones", "plan de protección contra tormentas",
                "acidificación del suelo", "grado de acidificación"
            )
        ),

        "spanish_c2_economics_global_markets" to LanguageLearningDeck(
            id = "spanish_c2_economics_global_markets",
            targetLanguage = "es",
            level = "C2",
            topic = "Economía & Mercados Globales (Experto)",
            words = listOf(
                "cumbre económica mundial", "Organización Mundial del Comercio", "acuerdo de libre comercio",
                "desequilibrio de la balanza comercial", "prevención de crisis financieras", "riesgo sistémico",
                "supervisión bancaria", "requerimiento de capital", "regulación de Basilea III", "política macroprudencial",
                "flexibilización cuantitativa", "política monetaria del banco central", "objetivo de inflación",
                "fase de tasas negativas", "fluctuaciones monetarias", "modelo de riesgo crediticio", "evaluación crediticia",
                "agencia de calificación", "clasificación crediticia", "regla constitucional de déficit", "déficit presupuestario",
                "bono del Estado", "curva de rendimiento", "control de flujo de capitales", "reservas de divisas",
                "intervención en mercado de divisas", "patrón oro", "transparencia de mercados financieros",
                "estabilidad financiera", "indicador económico", "producto interno bruto", "ingreso nacional bruto",
                "índice de salarios reales", "paridad del poder adquisitivo", "tasa de desempleo", "tasa de empleo",
                "distribución del ingreso", "coeficiente de Gini", "índice de riesgo de pobreza", "movilidad socioeconómica",
                "ofensiva de digitalización", "Industria 4.0", "economía de plataformas", "economía colaborativa",
                "crowdsourcing", "incubadora de startups", "fondos de capital de riesgo", "estrategia global de inversión",
                "impact investing", "código de gobierno corporativo", "iniciativa de educación financiera",
                "seminario económico", "concepto de gestión de crisis"
            )
        )
    )
}
