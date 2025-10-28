package com.example.myapplication.data

class FirstAidRepositoryImpl : FirstAidRepository {
    override fun getFirstAidTopics(): List<FirstAidTopic> {
        return listOf(
            FirstAidTopic(
                title = "Corte leve",
                category = "Heridas Comunes",
                howToAct = listOf(
                    "Lava la herida con agua y jabón neutro.",
                    "Aplica presión con una gasa limpia hasta detener el sangrado.",
                    "Cubre la herida con una venda o apósito estéril.",
                    "Si el sangrado no se detiene después de 10 minutos, busca ayuda médica."
                ),
                whatNotToDo = listOf(
                    "No uses alcohol, agua oxigenada o yodo directamente sobre la herida.",
                    "No soples ni toques la herida con las manos sucias."
                )
            ),
            FirstAidTopic(
                title = "Quemadura leve",
                category = "Heridas Comunes",
                howToAct = listOf(
                    "Enfría la zona afectada con agua a temperatura ambiente por 10–15 minutos.",
                    "Retira anillos o relojes antes de que se inflame la zona.",
                    "Cubre la quemadura con una gasa estéril o paño limpio."
                ),
                whatNotToDo = listOf(
                    "No apliques pasta dental, mantequilla, aceites ni cremas caseras.",
                    "No revientes ampollas."
                )
            ),
            FirstAidTopic(
                title = "Desmayo",
                category = "Problemas de Conciencia",
                howToAct = listOf(
                    "Acuesta a la persona boca arriba.",
                    "Eleva sus piernas unos 30 cm para favorecer el flujo sanguíneo.",
                    "Afloja la ropa ajustada.",
                    "Cuando recupere la conciencia, dale agua lentamente."
                ),
                whatNotToDo = listOf(
                    "No le des de beber mientras esté inconsciente.",
                    "No le apliques alcohol ni sacudas a la persona."
                )
            ),
            FirstAidTopic(
                title = "Atragantamiento (asfixia leve)",
                category = "Emergencias Respiratorias",
                howToAct = listOf(
                    "Si la persona puede toser o hablar, anímala a toser con fuerza.",
                    "Si no puede respirar, realiza la maniobra de Heimlich.",
                    "Si pierde el conocimiento, llama a emergencias (131)."
                ),
                whatNotToDo = listOf(
                    "No metas los dedos en su boca si no ves claramente el objeto.",
                    "No le des palmadas fuertes si está tosiendo."
                )
            ),
            FirstAidTopic(
                title = "Paro cardiorrespiratorio",
                category = "Emergencias Graves",
                howToAct = listOf(
                    "Llama inmediatamente al 131.",
                    "Coloca a la persona sobre una superficie firme.",
                    "Inicia compresiones torácicas (100–120 por minuto).",
                    "Alterna con respiración boca a boca si sabes hacerlo."
                ),
                whatNotToDo = listOf(
                    "No pierdas tiempo buscando el pulso si no sabes hacerlo.",
                    "No detengas las compresiones hasta que llegue ayuda."
                )
            ),
            FirstAidTopic(
                title = "Fractura o golpe fuerte",
                category = "Traumatismos y Lesiones",
                howToAct = listOf(
                    "Inmoviliza la zona lesionada sin intentar enderezarla.",
                    "Si hay herida abierta, cúbrela con un paño limpio.",
                    "Aplica frío (nunca hielo directo).",
                    "Acude a un centro de salud."
                ),
                whatNotToDo = listOf(
                    "No intentes mover o “acomodar” el hueso.",
                    "No apliques calor ni masajees la zona."
                )
            ),
            FirstAidTopic(
                title = "Golpe de calor",
                category = "Problemas Ambientales",
                howToAct = listOf(
                    "Lleva a la persona a un lugar fresco y ventilado.",
                    "Afloja su ropa y aplica paños fríos.",
                    "Dale pequeños sorbos de agua.",
                    "Si no mejora, llama al 131."
                ),
                whatNotToDo = listOf(
                    "No la sumerjas en agua helada.",
                    "No le des bebidas con cafeína o alcohol."
                )
            ),
            FirstAidTopic(
                title = "Hemorragia nasal",
                category = "Heridas Comunes",
                howToAct = listOf(
                    "Siéntate e inclina la cabeza ligeramente hacia adelante.",
                    "Presiona la parte blanda de la nariz durante 10 minutos.",
                    "Respira por la boca hasta que se detenga."
                ),
                whatNotToDo = listOf(
                    "No inclines la cabeza hacia atrás.",
                    "No te suenes la nariz ni metas algodón."
                )
            ),
            FirstAidTopic(
                title = "Picadura de insecto",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lava la zona con agua y jabón.",
                    "Aplica frío local para reducir la hinchazón.",
                    "Si hay reacción alérgica, llama al 131."
                ),
                whatNotToDo = listOf(
                    "No rasques la zona.",
                    "No uses remedios caseros (limón, pasta dental, etc.)."
                )
            ),
            FirstAidTopic(
                title = "Intoxicación o envenenamiento",
                category = "Emergencias Graves",
                howToAct = listOf(
                    "Identifica la sustancia ingerida si es posible.",
                    "No provoques el vómito.",
                    "Llama inmediatamente al 131 o al CITUC (800 800 990 en Chile)."
                ),
                whatNotToDo = listOf(
                    "No le des comida, leche ni remedios.",
                    "No esperes a que aparezcan los síntomas."
                )
            )
        )
    }
}
