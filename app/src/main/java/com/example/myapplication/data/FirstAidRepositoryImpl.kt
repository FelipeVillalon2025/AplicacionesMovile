package com.example.myapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

class FirstAidRepositoryImpl : FirstAidRepository {
    override fun getFirstAidTopics(): List<FirstAidTopic> {
        return listOf(
            FirstAidTopic(
                id = "Corte Leve",
                title = "Corte Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Herida superficial con bordes regulares, sangrado leve que se detiene con presión, dolor localizado, sin exposición de tejido profundo."),
                howToAct = listOf(
                    "Lava con abundante agua y jabón neutro.",
                    "Aplica presión con gasa limpia hasta detener el sangrado.",
                    "Desinfecta con suero fisiológico o antiséptico suave y cubre con apósito estéril.",
                    "Cambia el vendaje cada 6 horas y observa signos de infección."
                ),
                whatNotToDo = listOf(
                    "No uses algodón (deja pelusa).",
                    "No apliques alcohol ni agua oxigenada directamente.",
                    "No soples ni toques con manos sucias."
                )
            ),
            FirstAidTopic(
                id = "Herida Profunda",
                title = "Herida Profunda",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Orificio pequeño o herida profunda con dolor intenso, sangrado moderado, posible cuerpo extraño incrustado."),
                howToAct = listOf(
                    "No retires el objeto si está incrustado; inmoviliza y fija alrededor con gasas.",
                    "Aplica presión alrededor de la herida para controlar el sangrado.",
                    "Cubre con paño limpio y solicita atención médica urgente."
                ),
                whatNotToDo = listOf(
                    "No intentes extraer el objeto.",
                    "No uses algodón ni apliques pomadas."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Leve",
                title = "Hemorragia Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Sangrado lento y controlable, sin impacto hemodinámico inmediato."),
                howToAct = listOf(
                    "Presión directa con gasa limpia durante 10 minutos.",
                    "Eleva la extremidad si procede.",
                    "Coloca apósito y vigila."
                ),
                whatNotToDo = listOf(
                    "No retires la gasa si está empapada; coloca otra encima.",
                    "No uses algodón."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Abundante",
                title = "Hemorragia Abundante",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Sangrado rápido o a chorro, palidez, mareo, posible pérdida de conciencia."),
                howToAct = listOf(
                    "Presión firme y constante sobre la herida.",
                    "Empaqueta la herida si hay cavidad.",
                    "Si es arterial y no cede, aplicar torniquete entre herida y tronco y anotar la hora.",
                    "Llamar a emergencias."
                ),
                whatNotToDo = listOf(
                    "No aflojes el torniquete.",
                    "No retires apósitos empapados."
                )
            ),
            FirstAidTopic(
                id = "Quemadura Leve",
                title = "Quemadura Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf("Enrojecimiento, dolor y posible ampolla pequeña."),
                howToAct = listOf(
                    "Enfría con agua a temperatura ambiente 10–15 minutos.",
                    "Cubre con gasa húmeda limpia para evitar adherencia.",
                    "Retira joyas cercanas antes de que se hinche la zona."
                ),
                whatNotToDo = listOf(
                    "No revientes ampollas.",
                    "No apliques pasta dental, mantequilla ni aceites."
                )
            ),
            FirstAidTopic(
                id = "Quemadura Grave",
                title = "Quemadura Grave",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf("Ampollas grandes, piel blanca o carbonizada, dolor intenso o ausencia de sensibilidad."),
                howToAct = listOf(
                    "Enfría con agua tibia, no hielo.",
                    "Cubre con paño húmedo limpio y no retires ropa adherida.",
                    "Llama a emergencias y traslada."
                ),
                whatNotToDo = listOf(
                    "No apliques ungüentos caseros.",
                    "No explotes ampollas."
                )
            ),
            FirstAidTopic(
                id = "Fractura",
                title = "Fractura",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Dolor intenso, deformidad, hinchazón y pérdida de función."),
                howToAct = listOf(
                    "Inmoviliza como se encuentra con tablillas o palos acolchados.",
                    "Si hay herida abierta, cubre con paño húmedo sobre zona expuesta antes de entablillar.",
                    "Traslada a centro de salud."
                ),
                whatNotToDo = listOf(
                    "No intentes alinear el hueso.",
                    "No muevas sin necesidad."
                )
            ),
            FirstAidTopic(
                id = "Luxación",
                title = "Luxación",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Deformidad articular, dolor agudo y bloqueo del movimiento."),
                howToAct = listOf(
                    "Inmoviliza la articulación en la posición encontrada.",
                    "Aplica frío local y acude a urgencias."
                ),
                whatNotToDo = listOf(
                    "No intentes recolocar la articulación."
                )
            ),
            FirstAidTopic(
                id = "Esguince",
                title = "Esguince",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Dolor, hinchazón y dificultad para movilizar la articulación."),
                howToAct = listOf(
                    "RICE: reposo, hielo envuelto, compresión ligera, elevación.",
                    "Evitar apoyo hasta valoración."
                ),
                whatNotToDo = listOf(
                    "No masajear ni aplicar calor en fase aguda."
                )
            ),
            FirstAidTopic(
                id = "Desmayo",
                title = "Desmayo",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Face,
                symptoms = listOf("Pérdida breve de conciencia, piel pálida, sudor frío."),
                howToAct = listOf(
                    "Acostar boca arriba y elevar piernas ~30 cm.",
                    "Aflojar ropa ajustada y ventilar el lugar.",
                    "Si recupera, ofrecer agua lentamente."
                ),
                whatNotToDo = listOf(
                    "No dar líquidos mientras esté inconsciente.",
                    "No sacudir."
                )
            ),
            FirstAidTopic(
                id = "Paro Cardíaco",
                title = "Paro Cardíaco",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Favorite,
                symptoms = listOf("Inconsciencia, ausencia de respiración y pulso."),
                howToAct = listOf(
                    "Llamar a emergencias.",
                    "Iniciar compresiones torácicas 100–120/min hasta ayuda."
                ),
                whatNotToDo = listOf(
                    "No detener compresiones hasta relevo."
                )
            ),
            FirstAidTopic(
                id = "Atragantamiento",
                title = "Atragantamiento",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Restaurant,
                symptoms = listOf("Tos intensa, imposibilidad de hablar o respirar, rostro enrojecido o azulado. En bebés, llanto débil o silencioso, incapacidad de emitir sonidos, posible pérdida de conciencia."),
                howToAct = listOf(
                    "Si puede toser o hablar, anímalo a seguir tosiendo.",
                    "Si no puede respirar, aplica la maniobra de Heimlich:",
                    " - Adultos: abraza desde atrás, coloca un puño entre ombligo y esternón, empuja hacia adentro y arriba.",
                    " - Lactantes: alterna 5 golpes en la espalda (entre omóplatos) con 5 compresiones torácicas con dos dedos.",
                    "Llama al 131 o al número local de emergencias si no se resuelve en menos de 1 minuto.",
                    "Tras la expulsión del objeto, evalúa la respiración y controla signos vitales."
                ),
                whatNotToDo = listOf(
                    "No introduzcas los dedos en la boca si no ves el objeto.",
                    "No sacudas ni golpees violentamente al niño.",
                    "No des agua ni alimentos inmediatamente después del episodio."
                )
            ),
            FirstAidTopic(
                id = "Ahogamiento",
                title = "Ahogamiento",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Dificultad respiratoria o ausencia de respiración, tos, piel azulada, espuma en boca o nariz, pérdida de conciencia."),
                howToAct = listOf(
                    "Retira del agua con cuidado, manteniendo cabeza y cuello alineados.",
                    "Evalúa respiración y pulso: si no respira, inicia RCP (30 compresiones y 2 ventilaciones).",
                    "Si respira, colócalo de lado (posición lateral de seguridad) y abrígalo.",
                    "Retira ropa mojada, seca suavemente y cúbrelo con mantas.",
                    "Traslado inmediato al hospital, aunque recupere la conciencia (puede haber daño pulmonar secundario)."
                ),
                whatNotToDo = listOf(
                    "No intentes “sacarle el agua” poniéndolo boca abajo.",
                    "No retrases la llamada a emergencias.",
                    "No administres líquidos ni alimentos después del rescate."
                )
            ),
            FirstAidTopic(
                id = "Electrocución",
                title = "Electrocución",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Contracciones musculares, rigidez, pérdida de conciencia, quemaduras en los puntos de entrada/salida (manos, pies). Posibles arritmias o paro cardiorrespiratorio."),
                howToAct = listOf(
                    "Corta la corriente eléctrica antes de tocar a la víctima.",
                    "Evalúa conciencia, respiración y pulso; si no respira, inicia RCP.",
                    "Cubre las quemaduras con paño limpio húmedo.",
                    "Mantén a la persona en reposo y abrígala.",
                    "Traslada a un centro médico para observación, incluso si parece recuperarse."
                ),
                whatNotToDo = listOf(
                    "No uses agua para apagar el fuego si hay corriente activa.",
                    "No apliques pomadas ni revientes ampollas.",
                    "No dejes sola a la persona tras la descarga."
                )
            ),
            FirstAidTopic(
                id = "Intoxicación (General)",
                title = "Intoxicación (General)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Science,
                symptoms = listOf("Náuseas, vómitos, confusión, dolor abdominal, pérdida de conciencia según sustancia."),
                howToAct = listOf(
                    "Identificar sustancia y conservar envase.",
                    "Anotar hora aproximada e informar a emergencias o centro de intoxicaciones.",
                    "No inducir vómito salvo indicación de profesionales."
                ),
                whatNotToDo = listOf(
                    "No dar leche, bebidas ni medicamentos sin indicación."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Abeja",
                title = "Picadura de Abeja",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dolor agudo, enrojecimiento e inflamación local; en alérgicos, hinchazón facial o dificultad respiratoria."),
                howToAct = listOf(
                    "Retirar aguijón raspando con borde rígido.",
                    "Lavar y aplicar compresa fría 10–15 min.",
                    "Vigilar por anafilaxia 30–60 min."
                ),
                whatNotToDo = listOf(
                    "No apretar el aguijón con pinzas (inyecta más veneno)."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Avispa",
                title = "Picadura de Avispa",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dolor intenso, hinchazón amplia, enrojecimiento; posible reacción sistémica."),
                howToAct = listOf(
                    "Lavar y aplicar frío local.",
                    "Elevar la extremidad si procede; antihistamínico si está indicado."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar vinagre o limón."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Araña",
                title = "Picadura de Araña",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dolor progresivo, enrojecimiento con posible necrosis local, en casos de viuda: calambres y sudoración."),
                howToAct = listOf(
                    "Lavar y aplicar compresa fría.",
                    "Immovilizar y acudir a urgencias; identificar la araña si es seguro."
                ),
                whatNotToDo = listOf(
                    "No cortar ni chupar la herida. No aplicar calor."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Garrapata",
                title = "Picadura de Garrapata",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Punto negro adherido, eritema local y posible fiebre tardía; riesgo de enfermedades transmitidas."),
                howToAct = listOf(
                    "Extraer con pinza lo más cerca posible de la piel tirando recto.",
                    "Lavar y desinfectar; marcar la zona y vigilar por erupciones."
                ),
                whatNotToDo = listOf(
                    "No quemar ni usar aceite para quitarla."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Mosquito",
                title = "Picadura de Mosquito",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Pápula pruriginosa, enrojecimiento local; riesgo de transmisión de arbovirus según zona."),
                howToAct = listOf(
                    "Lavar y aplicar frío local o loción calmante.",
                    "Evitar rascarse."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar productos caseros irritantes."
                )
            ),
            FirstAidTopic(
                id = "Mordedura de Perro",
                title = "Mordedura de Perro",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf("Herida irregular, desgarro, sangrado, riesgo de infección y rabia."),
                howToAct = listOf(
                    "Lavar con abundante agua y jabón.",
                    "Presionar si sangra, cubrir con gasa limpia y acudir a urgencias para profilaxis."
                ),
                whatNotToDo = listOf(
                    "No ignores heridas pequeñas."
                )
            ),
            FirstAidTopic(
                id = "Mordedura de Gato",
                title = "Mordedura de Gato",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf("Heridas punzantes profundas, dolor y alta probabilidad de infección por bacterias orales."),
                howToAct = listOf(
                    "Lavar y no cerrar la herida herméticamente; acudir a médico para antibióticos."
                ),
                whatNotToDo = listOf(
                    "No aplicar alcohol directo."
                )
            ),
            FirstAidTopic(
                id = "Mordedura de Serpiente",
                title = "Mordedura de Serpiente",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dos marcas de colmillo, dolor intenso, hinchazón progresiva, náuseas, mareo."),
                howToAct = listOf(
                    "Mantener a la persona inmóvil y la extremidad a nivel o debajo del corazón.",
                    "Retirar objetos ajustados; llamar al 131 y anotar la hora.",
                    "No cortar ni chupar la herida; trasladar a urgencias."
                ),
                whatNotToDo = listOf(
                    "No aplicar torniquetes ni hielo."
                )
            ),
            FirstAidTopic(
                id = "Mordedura de Roedor",
                title = "Mordedura de Roedor",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf("Pequeñas heridas, riesgo de infecciones bacterianas o leptospirosis."),
                howToAct = listOf(
                    "Lavar con agua y jabón, cubrir y consultar por profilaxis antibiótica."
                ),
                whatNotToDo = listOf(
                    "No ignores ni tapes herméticamente."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Medusa",
                title = "Picadura de Medusa",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Dolor punzante, líneas rojas, ardor; posible náuseas y mareo si extensa."),
                howToAct = listOf(
                    "Retirar tentáculos con pinzas; lavar con agua salada.",
                    "Aplicar calor moderado (38–45 °C) para aliviar dolor.",
                    "Buscar atención si hay síntomas sistémicos."
                ),
                whatNotToDo = listOf(
                    "No usar agua dulce ni frotar la zona."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Nasal (Leve)",
                title = "Hemorragia Nasal (Leve)",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Sangrado leve, a menudo unilaterial, sin dolor intenso; puede ocurrir por calor, sequedad o esfuerzo."),
                howToAct = listOf(
                    "Sentarse, inclinar la cabeza ligeramente hacia adelante.",
                    "Presionar la parte blanda de la nariz por 10–15 minutos.",
                    "Aplicar compresa fría en la nuca."
                ),
                whatNotToDo = listOf(
                    "No inclinar la cabeza hacia atrás.",
                    "No introducir algodón ni sonarse con fuerza."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Nasal",
                title = "Hemorragia Nasal",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Sangrado profuso, posible salida de sangre por garganta, mareo, palidez."),
                howToAct = listOf(
                    "Sentar con cabeza hacia adelante y presionar la parte blanda de la nariz por 20 minutos.",
                    "Aplicar frío en la nariz y nuca.",
                    "Si persiste, acudir a urgencias para control especializado."
                ),
                whatNotToDo = listOf(
                    "No acostar ni inclinar la cabeza hacia atrás.",
                    "No intentar taponar profundamente sin formación."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Interna",
                title = "Hemorragia Interna",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Palidez, sudor frío, dolor abdominal, distensión, mareo, taquicardia después de un trauma."),
                howToAct = listOf(
                    "Acostar y mantener inmóvil, cubrir con mantas.",
                    "No dar líquidos ni medicamentos por boca.",
                    "Llamar a emergencias; requiere traslado hospitalario urgente."
                ),
                whatNotToDo = listOf(
                    "No mover innecesariamente al herido."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Amputación",
                title = "Hemorragia Amputación",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Sangrado masivo, dolor extremo, shock posible."),
                howToAct = listOf(
                    "Presionar y empaquetar la herida; si es arterial, torniquete proximal si no cede.",
                    "Conservar miembro amputado en bolsa estéril y sobre hielo (no directo).",
                    "Trasladar urgente para posible reimplante."
                ),
                whatNotToDo = listOf(
                    "No sumerjas el segmento amputado en agua.",
                    "No uses hielo directamente sobre el tejido."
                )
            ),
            FirstAidTopic(
                id = "Hemorragia Digestiva",
                title = "Hemorragia Digestiva",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Vómitos con sangre, heces negras, mareo, debilidad."),
                howToAct = listOf(
                    "Acostar con piernas elevadas si no hay problema respiratorio.",
                    "Llamar a emergencias; requiere evaluación hospitalaria."
                ),
                whatNotToDo = listOf(
                    "No provoques el vómito.",
                    "No administres alimentos ni líquidos."
                )
            ),
            FirstAidTopic(
                id = "Quemadura Química",
                title = "Quemadura Química",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Science,
                symptoms = listOf("Dolor intenso, enrojecimiento severo, posible blanqueamiento o necrosis del tejido."),
                howToAct = listOf(
                    "Retirar la ropa contaminada y enjuagar con abundante agua por 20 minutos.",
                    "Si es polvo, eliminar primero sin agua.",
                    "Consultar urgencias."
                ),
                whatNotToDo = listOf(
                    "No aplicar neutralizantes caseros."
                )
            ),
            FirstAidTopic(
                id = "Quemadura Eléctrica",
                title = "Quemadura Eléctrica",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Puntos de entrada/salida, quemaduras superficiales y posibles lesiones internas, arritmias, pérdida de conciencia."),
                howToAct = listOf(
                    "Cortar la fuente eléctrica antes de auxiliar.",
                    "Iniciar RCP si necesario y cubrir quemaduras con gasa húmeda.",
                    "Traslado urgente."
                ),
                whatNotToDo = listOf(
                    "No usar agua si la fuente sigue conectada."
                )
            ),
            FirstAidTopic(
                id = "Contusión Grave",
                title = "Contusión Grave",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Dolor intenso, hinchazón marcada, pérdida de sensibilidad o movilidad distal."),
                howToAct = listOf(
                    "Elevar la extremidad y aplicar frío.",
                    "Buscar evaluación médica urgente; el síndrome compartimental requiere cirugía."
                ),
                whatNotToDo = listOf(
                    "No apretar vendajes demasiado."
                )
            ),
            FirstAidTopic(
                id = "Fractura de Pelvis",
                title = "Fractura de Pelvis",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Dolor pélvico intenso, incapacidad para moverse, hipotensión o signos de shock tras accidente."),
                howToAct = listOf(
                    "No mover innecesariamente; inmovilizar y mantener caliente.",
                    "Llamar a emergencias y preparar traslado especializado."
                ),
                whatNotToDo = listOf(
                    "No intentar mover al paciente sin soporte."
                )
            ),
            FirstAidTopic(
                id = "Caída de Altura",
                title = "Caída de Altura",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Dolor en múltiples zonas, incapacidad para moverse, posible fractura o lesión medular."),
                howToAct = listOf(
                    "No mover al paciente salvo peligro; inmovilizar cabeza y columna.",
                    "Llamar emergencias y monitorizar vías aéreas."
                ),
                whatNotToDo = listOf(
                    "No intentar sentar o levantar."
                )
            ),
            FirstAidTopic(
                id = "Herida de Bala",
                title = "Herida de Bala",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Healing,
                symptoms = listOf("Orificio de entrada (y posible salida), sangrado, shock, heridas internas."),
                howToAct = listOf(
                    "Controlar sangrado con presión directa y empaquetamiento si es necesario.",
                    "Evitar manipulación profunda; asegurar escena y solicitar ayuda especializada."
                ),
                whatNotToDo = listOf(
                    "No intentes retirar proyectiles ni explorar la herida a fondo."
                )
            ),
            FirstAidTopic(
                id = "Inhalación de Humo",
                title = "Inhalación de Humo",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf("Tos persistente, quemazón en garganta, disnea, voz ronca, presencia de hollín en boca/nariz."),
                howToAct = listOf(
                    "Sacar a la persona a aire libre y ventilar.",
                    "Valorar respiración; RCP si necesario.",
                    "Llevar a urgencias incluso si síntomas iniciales son leves."
                ),
                whatNotToDo = listOf(
                    "No volver a zonas con humo; no subestimar síntomas."
                )
            ),
            FirstAidTopic(
                id = "Intoxicación (CO)",
                title = "Intoxicación (CO)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Cloud,
                symptoms = listOf("Cefalea, mareo, náuseas, confusión, pérdida de conciencia; síntomas similares a gripe en exposición leve."),
                howToAct = listOf(
                    "Sacar a la persona a aire fresco; ventilar el espacio.",
                    "Llamar emergencias y trasladar para oxigenoterapia."
                ),
                whatNotToDo = listOf(
                    "No dejar a la persona en ambiente cerrado."
                )
            ),
            FirstAidTopic(
                id = "Inhalación de Gases",
                title = "Inhalación de Gases",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Irritación ocular, tos intensa, quemazón en vías aéreas, sibilancias."),
                howToAct = listOf(
                    "Sacar a aire fresco, enjuagar ojos con agua si procede.",
                    "Trasladar si hay dificultad respiratoria."
                ),
                whatNotToDo = listOf(
                    "No volver a entrar sin protección."
                )
            ),
            FirstAidTopic(
                id = "Intoxicación (Alimentos)",
                title = "Intoxicación (Alimentos)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Restaurant,
                symptoms = listOf("Vómitos persistentes, diarrea, dolor abdominal intenso, deshidratación, sangre en heces en algunos casos."),
                howToAct = listOf(
                    "Mantener hidratación con sorbos; conservar muestras de alimento si es posible.",
                    "Buscar atención si hay signos de deshidratación severa o sangre."
                ),
                whatNotToDo = listOf(
                    "No dar antidiarreicos sin indicación médica; no provocar vómito sin instrucciones."
                )
            ),
            FirstAidTopic(
                id = "Anafilaxia",
                title = "Anafilaxia",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Inicio rápido de hinchazón facial, dificultad respiratoria, urticaria, mareo o colapso."),
                howToAct = listOf(
                    "Llamar a emergencias inmediatamente.",
                    "Administrar adrenalina intramuscular (EpiPen) si disponible y seguir instrucciones.",
                    "Colocar al paciente en posición cómoda y preparar para traslado."
                ),
                whatNotToDo = listOf(
                    "No minimizar los síntomas; no esperar a ver si empeora."
                )
            ),
            FirstAidTopic(
                id = "Infarto (Corazón)",
                title = "Infarto (Corazón)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Favorite,
                symptoms = listOf("Dolor opresivo en pecho, sudor frío, náuseas, disnea, dolor irradiado a brazo o mandíbula."),
                howToAct = listOf(
                    "Llamar emergencias y mantener al paciente en reposo semi-sentado.",
                    "Si protocolo local lo indica y no hay contraindicación, administrar aspirina masticable.",
                    "Vigilar signos vitales y preparar para RCP si colapsa."
                ),
                whatNotToDo = listOf(
                    "No administrar medicamentos sin conocimiento de alergias o contraindicaciones."
                )
            ),
            FirstAidTopic(
                id = "ACV (Ictus)",
                title = "ACV (Ictus)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Face,
                symptoms = listOf("Inicio súbito de debilidad en cara/miembro, alteración del habla, pérdida de visión o equilibrio."),
                howToAct = listOf(
                    "Llamar emergencias y anotar hora de inicio de síntomas.",
                    "Mantener reposo y no administrar líquidos ni alimentos."
                ),
                whatNotToDo = listOf(
                    "No retrasar la llamada pensando que pasará."
                )
            ),
            FirstAidTopic(
                id = "Estado de Shock",
                title = "Estado de Shock",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Piel pálida, fría y húmeda, pulso débil y rápido, confusión, respiración rápida."),
                howToAct = listOf(
                    "Acostar y elevar piernas si no hay lesión que lo impida; cubrir con manta.",
                    "Identificar y tratar la causa (controlar sangrado, administrar epinefrina en anafilaxia).",
                    "Llamar emergencias."
                ),
                whatNotToDo = listOf(
                    "No dar líquidos si la persona está inconsciente."
                )
            ),
            FirstAidTopic(
                id = "Sospecha de Sepsis",
                title = "Sospecha de Sepsis",
                category = "Emergencias Graves",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Fiebre o hipotermia, taquicardia, respiración rápida, confusión, antecedente de infección."),
                howToAct = listOf(
                    "Llamar emergencias y trasladar; mantener al paciente abrigado.",
                    "Anotar tiempo de inicio y tratamientos recibidos."
                ),
                whatNotToDo = listOf(
                    "No administrar antibióticos por cuenta propia."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Escorpión",
                title = "Picadura de Escorpión",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dolor local intenso, posible sudoración, náuseas, en niños riesgo de convulsiones."),
                howToAct = listOf(
                    "Lavar y aplicar frío local; trasladar para antídoto si necesario."
                ),
                whatNotToDo = listOf(
                    "No cortar ni chupar la herida."
                )
            ),
            FirstAidTopic(
                id = "Mordedura Humana",
                title = "Mordedura Humana",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf("Herida con riesgo de infección por flora oral humana, dolor e inflamación."),
                howToAct = listOf(
                    "Lavar abundantemente y buscar atención médica para antibióticos."
                ),
                whatNotToDo = listOf(
                    "No pasar por alto; no cerrar sin valoración."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Pulga",
                title = "Picadura de Pulga",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Pequeñas pápulas pruriginosas agrupadas, localizadas en piernas o cintura."),
                howToAct = listOf(
                    "Lavar y aplicar loción calmante; limpiar ropa de cama."
                ),
                whatNotToDo = listOf(
                    "No rascar para evitar infección."
                )
            ),
            FirstAidTopic(
                id = "Picadura de Tábano",
                title = "Picadura de Tábano",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf("Dolor e inflamación marcada, riesgo de infección."),
                howToAct = listOf(
                    "Lavar y aplicar frío; si supura, consultar."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar calor."
                )
            ),
            FirstAidTopic(
                id = "Crisis Asmática",
                title = "Crisis Asmática",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Warning,
                symptoms = listOf("Dificultad respiratoria severa, disnea, sibilancias, incapacidad para hablar frases completas."),
                howToAct = listOf(
                    "Administrar inhalador de rescate, sentar al paciente e iniciar traslado si no mejora."
                ),
                whatNotToDo = listOf(
                    "No acostar; no administrar sedantes."
                )
            ),
            FirstAidTopic(
                id = "Hipoglucemia",
                title = "Hipoglucemia",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf("Sudoración profusa, temblores, confusión, pérdida de conciencia."),
                howToAct = listOf(
                    "Si consciente, dar carbohidratos rápidos; si inconsciente, no dar nada por boca y llamar a emergencias."
                ),
                whatNotToDo = listOf(
                    "No administrar insulina; no dar sólidos si está inconsciente."
                )
            ),
            FirstAidTopic(
                id = "Fiebre Alta (Niños)",
                title = "Fiebre Alta (Niños)",
                category = "Problemas Comunes en Niños",
                imageVector = Icons.Default.Thermostat,
                symptoms = listOf("Temperatura corporal superior a 38,5 °C, irritabilidad, somnolencia, llanto inconsolable, respiración rápida, escalofríos."),
                howToAct = listOf(
                    "Retira el exceso de ropa y mantén el ambiente ventilado.",
                    "Aplica compresas tibias (no frías) en frente, cuello, axilas y ingle.",
                    "Ofrécele líquidos frecuentes en pequeños sorbos.",
                    "Controla la temperatura cada 30 minutos.",
                    "Si la fiebre supera 39 °C o hay convulsiones, busca atención médica."
                ),
                whatNotToDo = listOf(
                    "No uses alcohol ni agua fría para enfriar.",
                    "No abrigues demasiado.",
                    "No administres medicamentos sin dosificación pediátrica adecuada."
                )
            ),
            FirstAidTopic(
                id = "Golpe de Calor",
                title = "Golpe de Calor",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf("Piel caliente, seca y enrojecida, mareos, dolor de cabeza, confusión, convulsiones, temperatura corporal superior a 40 °C."),
                howToAct = listOf(
                    "Traslada a un lugar fresco y sombreado.",
                    "Quita la ropa innecesaria y aplica paños húmedos o compresas frías.",
                    "Eleva las piernas si hay mareo.",
                    "Ofrécele sorbos de agua si está consciente.",
                    "Llama a emergencias."
                ),
                whatNotToDo = listOf(
                    "No uses agua helada ni hielo directo.",
                    "No administres café ni alcohol.",
                    "No dejes solo al afectado."
                )
            ),
            FirstAidTopic(
                id = "Ataque de Pánico",
                title = "Ataque de Pánico",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Face,
                symptoms = listOf("Palpitaciones, sensación de falta de aire, temblores, miedo intenso, mareo, sudor frío, sensación de pérdida de control o muerte inminente."),
                howToAct = listOf(
                    "Habla con voz calmada y asegúrale que no corre peligro.",
                    "Guíalo para respirar: inhalar 4 s, mantener 2 s, exhalar 6 s.",
                    "Acompáñalo a un lugar tranquilo y ventilado.",
                    "Permanece con la persona hasta que se calme o llegue ayuda profesional."
                ),
                whatNotToDo = listOf(
                    "No minimizar los síntomas ni decir “cálmate”.",
                    "No la dejes sola si presenta hiperventilación intensa.",
                    "No administres medicamentos sin prescripción."
                )
            ),
            FirstAidTopic(
                id = "Hipotermia Severa",
                title = "Hipotermia Severa",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                symptoms = listOf("Escalofríos intensos, torpeza, dificultad para hablar, piel fría y pálida, confusión, somnolencia, pulso débil o irregular."),
                howToAct = listOf(
                    "Traslada a un lugar seco y cálido.",
                    "Retira la ropa mojada y cúbrelo con mantas.",
                    "Si está consciente, ofrece líquidos tibios sin cafeína.",
                    "Controla respiración y pulso.",
                    "Llama a emergencias; puede requerir recalentamiento asistido."
                ),
                whatNotToDo = listOf(
                    "No frotes bruscamente la piel.",
                    "No uses calor directo ni fuentes eléctricas sobre el cuerpo.",
                    "No administres alcohol ni bebidas calientes con cafeína."
                )
            ),
            FirstAidTopic(
                id = "Inhalación Humo (Otros)",
                title = "Inhalación Humo (Otros)",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf("Tos persistente, ardor de garganta, irritación ocular, dolor torácico, dificultad respiratoria, mareos o náuseas."),
                howToAct = listOf(
                    "Sal del área contaminada y busca aire fresco.",
                    "Si persiste la tos o hay dificultad para respirar, acude a un centro médico.",
                    "Bebe agua para aliviar garganta y evita exposición adicional.",
                    "Si hubo exposición prolongada o signos de intoxicación por monóxido, requiere oxigenoterapia."
                ),
                whatNotToDo = listOf(
                    "No permanezcas en ambientes con humo.",
                    "No ignores tos o ardor prolongado.",
                    "No fumes tras el incidente."
                )
            )

        ).sortedBy { it.category }.sortedBy { it.title }
    }
}
