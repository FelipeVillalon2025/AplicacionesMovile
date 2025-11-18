package com.example.myapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

class FirstAidRepositoryImpl : FirstAidRepository {
    override fun getFirstAidTopics(): List<FirstAidTopic> {
        return listOf(
            FirstAidTopic(
                title = "ACV (Ictus)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Psychology,
                howToAct = listOf(
                    "Inicio súbito de debilidad en cara/miembro, alteración del habla, pérdida de visión o equilibrio.",
                    "Llamar emergencias y anotar hora de inicio de síntomas.",
                    "Mantener reposo y no administrar líquidos ni alimentos."
                ),
                whatNotToDo = listOf(
                    "No retrasar la llamada pensando que pasará."
                )
            ),
            FirstAidTopic(
                title = "Anafilaxia",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Warning,
                howToAct = listOf(
                    "Inicio rápido de hinchazón facial, dificultad respiratoria, urticaria, mareo o colapso.",
                    "Llamar a emergencias inmediatamente.",
                    "Administrar adrenalina intramuscular (EpiPen) si disponible y seguir instrucciones.",
                    "Colocar al paciente en posición cómoda y preparar para traslado."
                ),
                whatNotToDo = listOf(
                    "No minimizar los síntomas; no esperar a ver si empeora."
                )
            ),
            FirstAidTopic(
                title = "Electrocución",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bolt,
                howToAct = listOf(
                    "Cortar la corriente antes de tocar a la víctima.",
                    "Valorar respiración y RCP si necesario.",
                    "Tratar quemaduras con paño húmedo estéril."
                ),
                whatNotToDo = listOf(
                    "No tocar mientras permanezca la fuente.",
                    "No usar agua para desconectar."
                )
            ),
            FirstAidTopic(
                title = "Hemorragia Interna",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bloodtype,
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
                title = "Hemorragia Amputación",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Healing,
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
                title = "Hemorragia Digestiva",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bloodtype,
                howToAct = listOf(
                    "Vómitos con sangre, heces negras, mareo, debilidad.",
                    "Acostar con piernas elevadas si no hay problema respiratorio.",
                    "Llamar a emergencias; requiere evaluación hospitalaria."
                ),
                whatNotToDo = listOf(
                    "No provoques el vómito.",
                    "No administres alimentos ni líquidos."
                )
            ),
            FirstAidTopic(
                title = "Infarto (Corazón)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.MonitorHeart,
                howToAct = listOf(
                    "Dolor opresivo en pecho, sudor frío, náuseas, disnea, dolor irradiado a brazo o mandíbula.",
                    "Llamar emergencias y mantener al paciente en reposo semi-sentado.",
                    "Si protocolo local lo indica y no hay contraindicación, administrar aspirina masticable.",
                    "Vigilar signos vitales y preparar para RCP si colapsa."
                ),
                whatNotToDo = listOf(
                    "No administrar medicamentos sin conocimiento de alergias o contraindicaciones."
                )
            ),
            FirstAidTopic(
                title = "Intoxicación (Alimentos)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Restaurant,
                howToAct = listOf(
                    "Vómitos persistentes, diarrea, dolor abdominal intenso, deshidratación, sangre en heces en algunos casos.",
                    "Mantener hidratación con sorbos; conservar muestras de alimento si es posible.",
                    "Buscar atención si hay signos de deshidratación severa o sangre."
                ),
                whatNotToDo = listOf(
                    "No dar antidiarreicos sin indicación médica; no provocar vómito sin instrucciones."
                )
            ),
            FirstAidTopic(
                title = "Intoxicación (General)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Science,
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
                title = "Intoxicación (CO)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Cloud,
                howToAct = listOf(
                    "Cefalea, mareo, náuseas, confusión, pérdida de conciencia; síntomas similares a gripe en exposición leve.",
                    "Sacar a la persona a aire fresco; ventilar el espacio.",
                    "Llamar emergencias y trasladar para oxigenoterapia."
                ),
                whatNotToDo = listOf(
                    "No dejar a la persona en ambiente cerrado."
                )
            ),
            FirstAidTopic(
                title = "Herida de Bala",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Healing,
                howToAct = listOf(
                    "Orificio de entrada (y posible salida), sangrado, shock, heridas internas.",
                    "Controlar sangrado con presión directa y empaquetamiento si es necesario.",
                    "Evitar manipulación profunda; asegurar escena y solicitar ayuda especializada."
                ),
                whatNotToDo = listOf(
                    "No intentes retirar proyectiles ni explorar la herida a fondo."
                )
            ),
            FirstAidTopic(
                title = "Paro Cardíaco",
                category = "Emergencias Graves",
                imageVector = Icons.Default.MonitorHeart,
                howToAct = listOf(
                    "Llamar a emergencias.",
                    "Iniciar compresiones torácicas 100–120/min hasta ayuda."
                ),
                whatNotToDo = listOf(
                    "No detener compresiones hasta relevo."
                )
            ),
            FirstAidTopic(
                title = "Estado de Shock",
                category = "Emergencias Graves",
                imageVector = Icons.Default.FlashOn,
                howToAct = listOf(
                    "Piel pálida, fría y húmeda, pulso débil y rápido, confusión, respiración rápida.",
                    "Acostar y elevar piernas si no hay lesión que lo impida; cubrir con manta.",
                    "Identificar y tratar la causa (controlar sangrado, administrar epinefrina en anafilaxia).",
                    "Llamar emergencias."
                ),
                whatNotToDo = listOf(
                    "No dar líquidos si la persona está inconsciente."
                )
            ),
            FirstAidTopic(
                title = "Sospecha de Sepsis",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Coronavirus,
                howToAct = listOf(
                    "Fiebre o hipotermia, taquicardia, respiración rápida, confusión, antecedente de infección.",
                    "Llamar emergencias y trasladar; mantener al paciente abrigado.",
                    "Anotar tiempo de inicio y tratamientos recibidos."
                ),
                whatNotToDo = listOf(
                    "No administrar antibióticos por cuenta propia."
                )
            ),
            FirstAidTopic(
                title = "Ahogamiento",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Water,
                howToAct = listOf(
                    "Sacar del agua, comprobar respiración y pulso.",
                    "Iniciar RCP si no respira; colocar de lado si recupera y vigilar."
                ),
                whatNotToDo = listOf(
                    "No poner boca abajo ni intentar extraer agua de los pulmones."
                )
            ),
            FirstAidTopic(
                title = "Atragantamiento",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Restaurant,
                howToAct = listOf(
                    "Tos intensa, imposibilidad de hablar o respirar, rostro enrojecido o azulado. En bebés, llanto débil o silencioso, incapacidad de emitir sonidos, posible pérdida de conciencia.",
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
                title = "Crisis Asmática",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Air,
                howToAct = listOf(
                    "Dificultad respiratoria, sibilancias (silbido al respirar), ansiedad, labios azulados, habla entrecortada, uso visible de músculos accesorios.",
                    "Coloca al paciente sentado e inclinado ligeramente hacia adelante.",
                    "Afloja la ropa ajustada.",
                    "Administra inhalador de rescate (salbutamol) si dispone y sabe usarlo.",
                    "Si no mejora tras 10 minutos o empeora, llama al 131.",
                    "Mantén la calma y acompáñalo hasta recibir asistencia."
                ),
                whatNotToDo = listOf(
                    "No acostar al paciente.",
                    "No administrarle sedantes ni bebidas.",
                    "No dejarlo solo."
                )
            ),
            FirstAidTopic(
                title = "Inhalación de Gases",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.GasMeter,
                howToAct = listOf(
                    "Irritación ocular, tos intensa, quemazón en vías aéreas, sibilancias.",
                    "Sacar a aire fresco, enjuagar ojos con agua si procede.",
                    "Trasladar si hay dificultad respiratoria."
                ),
                whatNotToDo = listOf(
                    "No volver a entrar sin protección."
                )
            ),
            FirstAidTopic(
                title = "Inhalación de Humo",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Fireplace,
                howToAct = listOf(
                    "Tos persistente, quemazón en garganta, disnea, voz ronca, presencia de hollín en boca/nariz.",
                    "Sacar a la persona a aire libre y ventilar.",
                    "Valorar respiración; RCP si necesario.",
                    "Llevar a urgencias incluso si síntomas iniciales son leves."
                ),
                whatNotToDo = listOf(
                    "No volver a zonas con humo; no subestimar síntomas."
                )
            ),
            FirstAidTopic(
                title = "Corte Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
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
                title = "Hemorragia Abundante",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
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
                title = "Herida Profunda",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
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
                title = "Quemadura Grave",
                category = "Heridas Comunes",
                imageVector = Icons.Default.LocalFireDepartment,
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
                title = "Quemadura Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.LocalFireDepartment,
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
                title = "Quemadura Eléctrica",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bolt,
                howToAct = listOf(
                    "Puntos de entrada/salida, quemaduras superficiales y posibles lesiones internas, arritmias, pérdida de conciencia.",
                    "Cortar la fuente eléctrica antes de auxiliar.",
                    "Iniciar RCP si necesario y cubrir quemaduras con gasa húmeda.",
                    "Traslado urgente."
                ),
                whatNotToDo = listOf(
                    "No usar agua si la fuente sigue conectada."
                )
            ),
            FirstAidTopic(
                title = "Quemadura Química",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Science,
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
                title = "Mordedura de Animal",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                howToAct = listOf(
                    "Lavar con abundante agua y jabón.",
                    "Presionar si sangra, cubrir con gasa limpia y acudir a urgencias para profilaxis."
                ),
                whatNotToDo = listOf(
                    "No ignores heridas pequeñas."
                )
            ),
            FirstAidTopic(
                title = "Mordedura de Serpiente",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Filled.PestControl,
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
                title = "Picadura de Insecto",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
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
                title = "Picadura de Araña",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                howToAct = listOf(
                    "Lavar y aplicar compresa fría.",
                    "Immovilizar y acudir a urgencias; identificar la araña si es seguro."
                ),
                whatNotToDo = listOf(
                    "No cortar ni chupar la herida. No aplicar calor."
                )
            ),
            FirstAidTopic(
                title = "Picadura de Medusa",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Waves,
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
                title = "Golpe de Calor",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.Thermostat,
                howToAct = listOf(
                    "Piel caliente, seca y enrojecida, mareos, dolor de cabeza, confusión, convulsiones, temperatura corporal superior a 40 °C.",
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
                title = "Hipotermia",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                howToAct = listOf(
                    "Escalofríos intensos, torpeza, dificultad para hablar, piel fría y pálida, confusión, somnolencia, pulso débil o irregular.",
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
                title = "Fiebre Alta (Niños)",
                category = "Problemas Comunes en Niños",
                imageVector = Icons.Default.Thermostat,
                howToAct = listOf(
                    "Temperatura corporal superior a 38,5 °C, irritabilidad, somnolencia, llanto inconsolable, respiración rápida, escalofríos.",
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
                title = "Convulsiones",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Psychology,
                howToAct = listOf(
                    "Pérdida de conciencia, rigidez muscular seguida de movimientos espasmódicos, mordedura de lengua, respiración irregular. En niños con fiebre, suelen ser breves y autolimitadas.",
                    "Mantén la calma y coloca al paciente lejos de objetos duros o peligrosos.",
                    "Coloca algo blando bajo la cabeza.",
                    "No intentes detener los movimientos ni introducir objetos en la boca.",
                    "Afloja la ropa del cuello.",
                    "Tras la crisis, colócalo de lado y verifica respiración.",
                    "Si dura más de 5 minutos o se repite, llama a emergencias."
                ),
                whatNotToDo = listOf(
                    "No sujetes con fuerza.",
                    "No le des agua, comida ni medicamentos durante la crisis.",
                    "No dejes al paciente solo tras recuperar la conciencia."
                )
            ),
            FirstAidTopic(
                title = "Desmayo",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.AirlineStops,
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
                title = "Hipoglucemia",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Bloodtype,
                howToAct = listOf(
                    "Sudor frío, temblores, palidez, irritabilidad, visión borrosa, confusión, debilidad. En casos graves, pérdida de conciencia.",
                    "Si está consciente, administra 15 g de glucosa (una bebida azucarada o tres cucharaditas de azúcar disueltas en agua).",
                    "Espera 15 minutos y vuelve a medir o valorar síntomas.",
                    "Si no mejora, repite.",
                    "Si está inconsciente, no dar nada por boca: llamar a emergencias y colocar en posición lateral."
                ),
                whatNotToDo = listOf(
                    "No administrar insulina.",
                    "No ofrecer alimentos sólidos o líquidos a inconscientes.",
                    "No ignorar síntomas iniciales, especialmente en diabéticos."
                )
            ),
            FirstAidTopic(
                title = "Contusión Grave",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.PersonalInjury,
                howToAct = listOf(
                    "Dolor intenso, hinchazón marcada, pérdida de sensibilidad o movilidad distal.",
                    "Elevar la extremidad y aplicar frío.",
                    "Buscar evaluación médica urgente; el síndrome compartimental requiere cirugía."
                ),
                whatNotToDo = listOf(
                    "No apretar vendajes demasiado."
                )
            ),
            FirstAidTopic(
                title = "Esguince",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.PersonalInjury,
                howToAct = listOf(
                    "RICE: reposo, hielo envuelto, compresión ligera, elevación.",
                    "Evitar apoyo hasta valoración."
                ),
                whatNotToDo = listOf(
                    "No masajear ni aplicar calor en fase aguda."
                )
            ),
            FirstAidTopic(
                title = "Fractura",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.PersonalInjury,
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
                title = "Luxación",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.PersonalInjury,
                howToAct = listOf(
                    "Inmoviliza la articulación en la posición encontrada.",
                    "Aplica frío local y acude a urgencias."
                ),
                whatNotToDo = listOf(
                    "No intentes recolocar la articulación."
                )
            )
        ).sortedBy { it.category }.sortedBy { it.title }
    }
}
