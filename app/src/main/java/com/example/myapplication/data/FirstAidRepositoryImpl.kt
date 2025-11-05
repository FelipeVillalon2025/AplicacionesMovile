package com.example.myapplication.data

class FirstAidRepositoryImpl : FirstAidRepository {
    override fun getFirstAidTopics(): List<FirstAidTopic> {
        return listOf(
            FirstAidTopic(
                title = "Accidente cerebrovascular (ictus)",
                category = "Emergencias Graves",
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
                title = "Anafilaxia (reacción alérgica grave)",
                category = "Emergencias Graves",
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
                title = "Electrocución doméstica",
                category = "Emergencias Graves",
                howToAct = listOf(
                    "Contracciones musculares, rigidez, pérdida de conciencia, quemaduras en los puntos de entrada/salida (manos, pies). Posibles arritmias o paro cardiorrespiratorio.",
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
                title = "Hemorragia interna sospechada",
                category = "Emergencias Graves",
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
                title = "Hemorragia por amputación parcial/total",
                category = "Emergencias Graves",
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
                title = "Hemorragia por varices o sangrado digestivo (sospecha)",
                category = "Emergencias Graves",
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
                title = "Infarto agudo de miocardio (sospecha)",
                category = "Emergencias Graves",
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
                title = "Intoxicación alimentaria (grave)",
                category = "Emergencias Graves",
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
                title = "Intoxicación o envenenamiento (general)",
                category = "Emergencias Graves",
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
                title = "Intoxicación por monóxido de carbono (CO)",
                category = "Emergencias Graves",
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
                title = "Lesión por proyectil (arma de fuego) - manejo inicial",
                category = "Emergencias Graves",
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
                title = "Paro cardiorrespiratorio",
                category = "Emergencias Graves",
                howToAct = listOf(
                    "Llamar a emergencias.",
                    "Iniciar compresiones torácicas 100–120/min hasta ayuda."
                ),
                whatNotToDo = listOf(
                    "No detener compresiones hasta relevo."
                )
            ),
            FirstAidTopic(
                title = "Shock (estado de baja perfusión)",
                category = "Emergencias Graves",
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
                title = "Sospecha de sepsis",
                category = "Emergencias Graves",
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
                howToAct = listOf(
                    "Sacar del agua, comprobar respiración y pulso.",
                    "Iniciar RCP si no respira; colocar de lado si recupera y vigilar."
                ),
                whatNotToDo = listOf(
                    "No poner boca abajo ni intentar extraer agua de los pulmones."
                )
            ),
            FirstAidTopic(
                title = "Asfixia por inmersión (ahogamiento)",
                category = "Emergencias Respiratorias",
                howToAct = listOf(
                    "Dificultad respiratoria o ausencia de respiración, tos, piel azulada, espuma en boca o nariz, pérdida de conciencia.",
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
                title = "Atragantamiento (asfixia leve)",
                category = "Emergencias Respiratorias",
                howToAct = listOf(
                    "Si la persona tose, animarla a toser con fuerza.",
                    "Si no respira, maniobra de Heimlich; en bebés 5 golpes en espalda + 5 compresiones torácicas."
                ),
                whatNotToDo = listOf(
                    "No introducir dedos si no se visualiza el objeto."
                )
            ),
            FirstAidTopic(
                title = "Atragantamiento (obstrucción parcial o completa)",
                category = "Emergencias Respiratorias",
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
                title = "Crisis asmática grave",
                category = "Emergencias Respiratorias",
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
                title = "Inhalación de gases industriales (cloro, amoníaco)",
                category = "Emergencias Respiratorias",
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
                title = "Inhalación de humo (por incendio)",
                category = "Emergencias Respiratorias",
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
                title = "Inhalación de humo de combustión o cigarrillos",
                category = "Emergencias Respiratorias",
                howToAct = listOf(
                    "Tos persistente, ardor de garganta, irritación ocular, dolor torácico, dificultad respiratoria, mareos o náuseas.",
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
            ),
            FirstAidTopic(
                title = "Corte leve",
                category = "Heridas Comunes",
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
                title = "Hemorragia abundante",
                category = "Heridas Comunes",
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
                title = "Hemorragia leve",
                category = "Heridas Comunes",
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
                title = "Hemorragia nasal abundante (trauma o hipertensión)",
                category = "Heridas Comunes",
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
                title = "Hemorragia nasal leve (por calor, resequedad o esfuerzo)",
                category = "Heridas Comunes",
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
                title = "Herida profunda o punzante",
                category = "Heridas Comunes",
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
                title = "Quemadura grave",
                category = "Heridas Comunes",
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
                title = "Quemadura leve",
                category = "Heridas Comunes",
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
                title = "Quemadura por electricidad (internas)",
                category = "Heridas Comunes",
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
                title = "Quemadura por productos químicos (ácidos/álcalis)",
                category = "Heridas Comunes",
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
                title = "Mordedura de gato",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar y no cerrar la herida herméticamente; acudir a médico para antibióticos."
                ),
                whatNotToDo = listOf(
                    "No aplicar alcohol directo."
                )
            ),
            FirstAidTopic(
                title = "Mordedura de perro",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar con abundante agua y jabón.",
                    "Presionar si sangra, cubrir con gasa limpia y acudir a urgencias para profilaxis."
                ),
                whatNotToDo = listOf(
                    "No ignores heridas pequeñas."
                )
            ),
            FirstAidTopic(
                title = "Mordedura de roedor",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar con agua y jabón, cubrir y consultar por profilaxis antibiótica."
                ),
                whatNotToDo = listOf(
                    "No ignores ni tapes herméticamente."
                )
            ),
            FirstAidTopic(
                title = "Mordedura de serpiente (venenosa sospechada)",
                category = "Mordeduras y Picaduras",
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
                title = "Mordedura humana",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Herida con riesgo de infección por flora oral humana, dolor e inflamación.",
                    "Lavar abundantemente y buscar atención médica para antibióticos."
                ),
                whatNotToDo = listOf(
                    "No pasar por alto; no cerrar sin valoración."
                )
            ),
            FirstAidTopic(
                title = "Picadura de abeja",
                category = "Mordeduras y Picaduras",
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
                title = "Picadura de araña (rincón/viuda)",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar y aplicar compresa fría.",
                    "Immovilizar y acudir a urgencias; identificar la araña si es seguro."
                ),
                whatNotToDo = listOf(
                    "No cortar ni chupar la herida. No aplicar calor."
                )
            ),
            FirstAidTopic(
                title = "Picadura de avispa/abejorro",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar y aplicar frío local.",
                    "Elevar la extremidad si procede; antihistamínico si está indicado."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar vinagre o limón."
                )
            ),
            FirstAidTopic(
                title = "Picadura de escorpión",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Dolor local intenso, posible sudoración, náuseas, en niños riesgo de convulsiones.",
                    "Lavar y aplicar frío local; trasladar para antídoto si necesario."
                ),
                whatNotToDo = listOf(
                    "No cortar ni chupar la herida."
                )
            ),
            FirstAidTopic(
                title = "Picadura de garrapata",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Extraer con pinza lo más cerca posible de la piel tirando recto.",
                    "Lavar y desinfectar; marcar la zona y vigilar por erupciones."
                ),
                whatNotToDo = listOf(
                    "No quemar ni usar aceite para quitarla."
                )
            ),
            FirstAidTopic(
                title = "Picadura de medusa",
                category = "Mordeduras y Picaduras",
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
                title = "Picadura de mosquito",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Lavar y aplicar frío local o loción calmante.",
                    "Evitar rascarse."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar productos caseros irritantes."
                )
            ),
            FirstAidTopic(
                title = "Picadura de pulga o chinche",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Pequeñas pápulas pruriginosas agrupadas, localizadas en piernas o cintura.",
                    "Lavar y aplicar loción calmante; limpiar ropa de cama."
                ),
                whatNotToDo = listOf(
                    "No rascar para evitar infección."
                )
            ),
            FirstAidTopic(
                title = "Picadura de tábano",
                category = "Mordeduras y Picaduras",
                howToAct = listOf(
                    "Dolor e inflamación marcada, riesgo de infección.",
                    "Lavar y aplicar frío; si supura, consultar."
                ),
                whatNotToDo = listOf(
                    "No rascar ni aplicar calor."
                )
            ),
            FirstAidTopic(
                title = "Golpe de calor (insolación severa)",
                category = "Problemas Ambientales",
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
                title = "Hipotermia severa",
                category = "Problemas Ambientales",
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
                title = "Fiebre alta en niños",
                category = "Problemas Comunes en Niños",
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
                title = "Ataque de pánico / crisis de ansiedad",
                category = "Problemas de Conciencia",
                howToAct = listOf(
                    "Palpitaciones, sensación de falta de aire, temblores, miedo intenso, mareo, sudor frío, sensación de pérdida de control o muerte inminente.",
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
                title = "Convulsiones (epilépticas o febriles)",
                category = "Problemas de Conciencia",
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
                title = "Hipoglucemia (baja de azúcar)",
                category = "Problemas de Conciencia",
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
                title = "Contusión o hematoma severo con riesgo de síndrome compartimental",
                category = "Traumatismos y Lesiones",
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
                title = "Fractura de pelvis o sospecha de lesión interna mayor",
                category = "Traumatismos y Lesiones",
                howToAct = listOf(
                    "Dolor pélvico intenso, incapacidad para moverse, hipotensión o signos de shock tras accidente.",
                    "No mover innecesariamente; inmovilizar y mantener caliente.",
                    "Llamar a emergencias y preparar traslado especializado."
                ),
                whatNotToDo = listOf(
                    "No intentar mover al paciente sin soporte."
                )
            ),
            FirstAidTopic(
                title = "Luxación",
                category = "Traumatismos y Lesiones",
                howToAct = listOf(
                    "Inmoviliza la articulación en la posición encontrada.",
                    "Aplica frío local y acude a urgencias."
                ),
                whatNotToDo = listOf(
                    "No intentes recolocar la articulación."
                )
            ),
            FirstAidTopic(
                title = "Traumatismo por caída desde altura",
                category = "Traumatismos y Lesiones",
                howToAct = listOf(
                    "Dolor en múltiples zonas, incapacidad para moverse, posible fractura o lesión medular.",
                    "No mover al paciente salvo peligro; inmovilizar cabeza y columna.",
                    "Llamar emergencias y monitorizar vías aéreas."
                ),
                whatNotToDo = listOf(
                    "No intentar sentar o levantar."
                )
            )
        ).sortedBy { it.category }.sortedBy { it.title }
    }
}
