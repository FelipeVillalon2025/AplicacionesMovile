package com.example.wikiaid.data

import com.example.wikiaid.R
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
                symptoms = listOf(
                    "Pequeña apertura en la piel, bordes regulares.",
                    "Sangrado leve que disminuye con presión directa.",
                    "Dolor localizado y ausencia de cuerpo extraño visible.",
                    "No exposición de grasa, músculo o hueso.",
                    "Riesgo bajo de infección, pero mayor si el objeto estaba sucio."
                ),
                howToAct = listOf(
                    "Lávate las manos o usa guantes si hay disponibles.",
                    "Lava la herida con abundante agua corriente por 2–5 minutos para arrastrar suciedad.",
                    "Usa jabón neutro alrededor de la herida (no dentro).",
                    "Aplica presión con gasa estéril por 2 minutos si sigue sangrando.",
                    "Desinfecta con suero fisiológico o un antiséptico suave como clorhexidina.",
                    "Seca suavemente y cubre con apósito estéril.",
                    "Cambia el vendaje cada 12–24 h o si se humedece.",
                    "Vigila signos de infección: enrojecimiento creciente, calor, pus, dolor aumentado.",
                    "Si la herida fue causada por metal oxidado, considerar vacuna antitetánica si han pasado más de 10 años."
                ),
                whatNotToDo = listOf(
                    "No usar algodón (se adhiere y deja fibras).",
                    "No aplicar alcohol ni agua oxigenada directamente (dañan tejido sano).",
                    "No reventar costras.",
                    "No soplar la herida.",
                    "No cubrir demasiado apretado para no cortar circulación."
                ),
                procedureImage = R.drawable.corte_leve
            ),
            FirstAidTopic(
                id = "Corte Profundo",
                title = "Corte Profundo",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Sangrado abundante y continuo.",
                    "Bordes irregulares o separación visible de la piel.",
                    "Posible exposición de grasa, músculo o tendones.",
                    "Dolor intenso.",
                    "Posible entumecimiento si hay daño nervioso."
                ),
                howToAct = listOf(
                    "Poner guantes si es posible.",
                    "Aplicar presión firme con gasa durante varios minutos.",
                    "Mantener la zona elevada si está en extremidades.",
                    "Evaluar si hay cuerpos extraños (NO retirarlos si están clavados).",
                    "Cuando el sangrado disminuya, cubrir con compresa estéril.",
                    "Trasladar a centro médico para puntos, sutura adhesiva o valoración.",
                    "Observar signos de shock: palidez, sudor frío, respiración rápida.",
                    "Controlar sangrado sin retirar vendajes; si se empapan, agregar más encima."
                ),
                whatNotToDo = listOf(
                    "No retirar objetos incrustados.",
                    "No limpiar profundo si sangra mucho; priorizar controlar el sangrado.",
                    "No usar torniquetes salvo riesgo vital.",
                    "No aplicar polvo, tierra o sustancias caseras."
                ),
                procedureImage = R.drawable.corte_profundo
            ),
            FirstAidTopic(
                id = "Hemorragia Leve",
                title = "Hemorragia Leve",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf(
                    "Sangrado lento de color rojo brillante.",
                    "Generalmente superficial.",
                    "Dolor leve o moderado.",
                    "No afecta movilidad ni sensibilidad."
                ),
                howToAct = listOf(
                    "Lavar herida y aplicar presión con gasa.",
                    "Elevar la zona por 5 minutos.",
                    "Revisar después de 10 minutos; si continúa, repetir presión.",
                    "Desinfectar y cubrir.",
                    "Controlar a las 24 h para identificar infección."
                ),
                whatNotToDo = listOf(
                    "No usar tierra, café, pasta dental, ceniza o remedios caseros.",
                    "No retirar gasas empapadas (poner otras encima).",
                    "No ignorar si el sangrado dura más de 20 minutos."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Hemorragia Moderada / Abundante",
                title = "Hemorragia Moderada / Abundante",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf(
                    "Sangrado que no disminuye con presión.",
                    "Chorro continuo o acumulación rápida de sangre.",
                    "Palidez, debilidad o mareo.",
                    "Posible shock hipovolémico."
                ),
                howToAct = listOf(
                    "Llamar emergencias si es abundante (código rojo).",
                    "Aplicar presión firme y continua con compresas.",
                    "Elevar extremidad afectada.",
                    "Si empapa el vendaje, colocar otro encima.",
                    "Vigilar signos de shock y mantener a la persona recostada.",
                    "Usar torniquete solo si hay amputación o sangrado arterial incontrolable.",
                    "Traslado urgente a hospital."
                ),
                whatNotToDo = listOf(
                    "No quitar vendas empapadas.",
                    "No dejar que la persona se siente si está mareada.",
                    "No usar torniquetes improvisados sin conocimiento."
                ),
                procedureImage = R.drawable.hemorragia_leve
            ),
            FirstAidTopic(
                id = "Hemorragia Arterial",
                title = "Hemorragia Arterial",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf(
                    "Sangrado rojo brillante en pulsos o chorros.",
                    "Rápida pérdida de sangre.",
                    "Shock muy probable en minutos."
                ),
                howToAct = listOf(
                    "Presión directa inmediata.",
                    "Llamar emergencias urgente.",
                    "Aplicar torniquete solo si el sangrado es incontrolable.",
                    "Anotar hora exacta del torniquete.",
                    "Mantener al paciente tumbado, piernas elevadas.",
                    "Vigilar respiración."
                ),
                whatNotToDo = listOf(
                    "No soltar presión bajo ningún motivo.",
                    "No retirar torniquete una vez puesto.",
                    "No dejar a la persona de pie."
                ),
                procedureImage = R.drawable.hemorragia_arterial
            ),
            FirstAidTopic(
                id = "Quemadura Leve (1er Grado)",
                title = "Quemadura Leve (1er Grado)",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf(
                    "Enrojecimiento (eritema).",
                    "Dolor leve a moderado.",
                    "Piel caliente.",
                    "No hay ampollas."
                ),
                howToAct = listOf(
                    "Enfriar con agua corriente 10–20 minutos.",
                    "Secar suavemente.",
                    "Aplicar crema hidratante neutra o gel de aloe puro.",
                    "Cubrir con gasa estéril si roza con ropa.",
                    "Beber agua para prevenir deshidratación por estrés térmico."
                ),
                whatNotToDo = listOf(
                    "No aplicar pasta dental, mantequilla o aceites.",
                    "No reventar posibles pequeñas ampollas.",
                    "No aplicar hielo directo (daña tejido)."
                ),
                procedureImage = R.drawable.quemadura_leve
            ),
            FirstAidTopic(
                id = "Quemadura Moderada",
                title = "Quemadura Moderada",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf(
                    "Ampollas.",
                    "Dolor intenso.",
                    "Piel muy roja o moteada.",
                    "Posible hinchazón."
                ),
                howToAct = listOf(
                    "Enfriar con agua 20 minutos.",
                    "No romper ampollas.",
                    "Cubrir con apósitos no adhesivos.",
                    "Traslado a centro médico si cubre >5% del cuerpo.",
                    "Controlar signos de infección durante 48 h."
                ),
                whatNotToDo = listOf(
                    "No aplicar alcohol ni desinfectantes fuertes.",
                    "No retirar ropa pegada (cortar alrededor).",
                    "No aplicar algodón."
                ),
                procedureImage = R.drawable.quemadura_moderada
            ),
            FirstAidTopic(
                id = "Quemadura Grave (2do y 3er Grado)",
                title = "Quemadura Grave (2do y 3er Grado)",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Whatshot,
                symptoms = listOf(
                    "Piel carbonizada, blanca o negra.",
                    "Ampollas grandes o ausencia de dolor (nervios dañados).",
                    "Shock muy probable.",
                    "Olor a tejido quemado."
                ),
                howToAct = listOf(
                    "Llamar emergencias urgente.",
                    "NO usar agua en quemaduras eléctricas o químicas.",
                    "Cubrir con paño estéril seco.",
                    "Mantener al paciente abrigado para evitar hipotermia.",
                    "No retirar ropa pegada.",
                    "Vigilar respiración y pulso; preparar RCP."
                ),
                whatNotToDo = listOf(
                    "No aplicar cremas.",
                    "No romper ampollas.",
                    "No dejar expuesto al frío.",
                    "No permitir que la víctima camine si hay compromiso de piernas."
                ),
                procedureImage = R.drawable.quemadura_grave
            ),
            FirstAidTopic(
                id = "Quemadura Química",
                title = "Quemadura Química",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Science,
                symptoms = listOf(
                    "Dolor punzante.",
                    "Enrojecimiento o necrosis.",
                    "Ampollas.",
                    "Olor químico.",
                    "Posible dificultad respiratoria si hubo inhalación."
                ),
                howToAct = listOf(
                    "Quitarse ropa contaminada.",
                    "Lavar con agua abundante 20–30 minutos (excepto sustancias reactivas como sodio).",
                    "Retirar restos sólidos con guantes.",
                    "Cubrir con apósito estéril.",
                    "Trasladar a urgencias."
                ),
                whatNotToDo = listOf(
                    "No aplicar productos para “neutralizar” químico.",
                    "No tocar químicos sin guantes.",
                    "No permitir que la víctima inhale el producto de nuevo."
                ),
                procedureImage = R.drawable.quemadura_quimica
            ),
            FirstAidTopic(
                id = "Quemadura Eléctrica",
                title = "Quemadura Eléctrica",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bolt,
                symptoms = listOf(
                    "Dos puntos de quemadura: entrada y salida.",
                    "Arritmias, paro cardíaco.",
                    "Contracciones musculares.",
                    "Pérdida de conciencia."
                ),
                howToAct = listOf(
                    "Asegurar que ya no hay corriente.",
                    "No tocar al paciente sin verificar seguridad.",
                    "Llamar emergencias.",
                    "Revisar respiración y pulso.",
                    "Iniciar RCP si es necesario.",
                    "Cubrir quemaduras con apósitos secos.",
                    "Mantener vigilado al menos 24 h por riesgo de arritmias."
                ),
                whatNotToDo = listOf(
                    "No mover al paciente innecesariamente.",
                    "No aplicar agua sobre quemaduras profundas.",
                    "No ignorar síntomas tardíos como dolor muscular o arritmias."
                ),
                procedureImage = R.drawable.quemadura_electrico
            ),
            FirstAidTopic(
                id = "Esguince Leve",
                title = "Esguince Leve",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Dolor localizado al mover o apoyar.",
                    "Ligera inflamación sin deformidad evidente.",
                    "Sensibilidad al tacto.",
                    "Movilidad casi normal pero molesta.",
                    "No hematoma extenso."
                ),
                howToAct = listOf(
                    "Aplicar protocolo R.I.C.E. (Reposo, Hielo 15–20 min, Compresión suave, Elevación).",
                    "Evitar cargar peso por 24–48 h.",
                    "Usar vendas elásticas sin apretar en exceso.",
                    "Utilizar analgésicos tipo paracetamol si hay dolor.",
                    "Retomar actividades lentamente después de 48–72 h.",
                    "Si el dolor no mejora en 5 días, evaluar."
                ),
                whatNotToDo = listOf(
                    "No aplicar calor las primeras 48 h.",
                    "No masajear intensamente.",
                    "No apoyar todo el peso si hay dolor agudo."
                ),
                procedureImage = R.drawable.esguince_leve
            ),
            FirstAidTopic(
                id = "Esguince Moderado / Grave",
                title = "Esguince Moderado / Grave",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Dolor fuerte incluso sin movimiento.",
                    "Inflamación visible y hematoma.",
                    "Inestabilidad articular.",
                    "Dificultad para caminar o mover la articulación.",
                    "Sensación de “crack” al momento del accidente."
                ),
                howToAct = listOf(
                    "Inmovilizar articulación con férula o vendaje rígido.",
                    "Elevar extremidad.",
                    "Aplicar hielo por intervalos durante 48 h.",
                    "Trasladar a centro médico (podría haber desgarro o ruptura ligamentosa).",
                    "Evitar movimiento hasta evaluación profesional.",
                    "Mantener reposo total al menos 72 h."
                ),
                whatNotToDo = listOf(
                    "No forzar movilidad.",
                    "No caminar “para soltarlo”.",
                    "No aplicar calor en fase aguda."
                ),
                procedureImage = R.drawable.esguince_grave
            ),
            FirstAidTopic(
                id = "Fractura Cerrada",
                title = "Fractura Cerrada",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Dolor intenso, incapacidad para mover zona.",
                    "Deformidad visible en muchos casos.",
                    "Inflamación rápida.",
                    "Hematoma.",
                    "Crujidos o sensación de roce óseo (crepitación)."
                ),
                howToAct = listOf(
                    "Inmovilizar con férulas sin intentar alinear.",
                    "Colocar férula que inmovilice articulación arriba y abajo del área lesionada.",
                    "Aplicar compresas frías.",
                    "Evitar movimiento hasta llegada al hospital.",
                    "Mantener al paciente tranquilo y abrigado.",
                    "No dar comida ni bebida por si requiere cirugía."
                ),
                whatNotToDo = listOf(
                    "No intentar enderezar el hueso.",
                    "No mover la extremidad."
                ),
                procedureImage = R.drawable.fractura_cerrada
            ),
            FirstAidTopic(
                id = "Fractura Abierta",
                title = "Fractura Abierta",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Hueso expuesto.",
                    "Sangrado abundante.",
                    "Alto riesgo de infección.",
                    "Dolor extremo.",
                    "Posibilidad de shock."
                ),
                howToAct = listOf(
                    "Llamar emergencias de inmediato.",
                    "No intentar meter el hueso.",
                    "Cubrir herida con apósito estéril húmedo con suero.",
                    "Controlar sangrado aplicando presión alrededor, nunca encima del hueso.",
                    "Inmovilizar extremidad sin mover.",
                    "Evaluar signos de shock."
                ),
                whatNotToDo = listOf(
                    "No empujar el hueso hacia adentro.",
                    "No retirar objetos incrustados.",
                    "No mover la pierna o brazo."
                ),
                procedureImage = R.drawable.fractura_abierta
            ),
            FirstAidTopic(
                id = "Luxación",
                title = "Luxación",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Deformidad evidente de articulación.",
                    "Dolor muy intenso.",
                    "Imposibilidad de mover la extremidad.",
                    "Entumecimiento o hormigueo si hay compromiso nervioso.",
                    "Inflamación rápida."
                ),
                howToAct = listOf(
                    "Inmovilizar en la posición en la que se encuentra.",
                    "Aplicar frío local.",
                    "Elevar si es posible sin dolor.",
                    "Traslado urgente a centro médico.",
                    "Revisar pulso distal (mano/pie) por si hay compresión vascular."
                ),
                whatNotToDo = listOf(
                    "No intentar “acomodar” el hueso (solo lo hacen profesionales).",
                    "No mover la extremidad.",
                    "No aplicar calor."
                ),
                procedureImage = R.drawable.luxacion
            ),
            FirstAidTopic(
                id = "Golpe en la cabeza leve",
                title = "Golpe en la cabeza leve",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Headset,
                symptoms = listOf(
                    "Dolor moderado.",
                    "Leve hinchazón.",
                    "Mareos pasajeros.",
                    "Sensibilidad al tacto.",
                    "No hay pérdida de conciencia."
                ),
                howToAct = listOf(
                    "Aplicar hielo envuelto 10–15 min.",
                    "Observar 24 h por síntomas de alarma.",
                    "Permitir reposo en un ambiente tranquilo.",
                    "Analgésicos como paracetamol si hay dolor (no ibuprofeno las primeras horas).",
                    "Evitar pantallas, luces fuertes y ejercicio por 24 h."
                ),
                whatNotToDo = listOf(
                    "No dejar solo a un niño después de un golpe.",
                    "No permitir deporte el mismo día.",
                    "No usar alcohol ni fármacos sedantes."
                ),
                procedureImage = R.drawable.golpeleve
            ),
            FirstAidTopic(
                id = "Traumatismo craneal moderado",
                title = "Traumatismo craneal moderado",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Headset,
                symptoms = listOf(
                    "Dolor fuerte.",
                    "Desorientación.",
                    "Náuseas o vómitos.",
                    "Amnesia leve.",
                    "Sangrado por nariz u oídos.",
                    "Somnolencia anormal."
                ),
                howToAct = listOf(
                    "Mantener a la persona despierta si es posible.",
                    "Llamar emergencias.",
                    "No mover el cuello.",
                    "Vigilar respiración.",
                    "Aplicar frío local sin presión sobre la herida.",
                    "Controlar signos de empeoramiento: vómitos repetidos, confusión, convulsiones."
                ),
                whatNotToDo = listOf(
                    "No dar de comer o beber.",
                    "No mover cabeza ni cuello.",
                    "No permitir que se duerma si está muy confundido o vomita."
                ),
                procedureImage = R.drawable.traumatismocraneal
            ),
            FirstAidTopic(
                id = "Conmoción cerebral",
                title = "Conmoción cerebral",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Headset,
                symptoms = listOf(
                    "Pérdida de conciencia breve (no siempre).",
                    "Dolor de cabeza persistente.",
                    "Mareo, visión borrosa.",
                    "Inestabilidad o problemas de equilibrio.",
                    "Alteración del habla o lentitud.",
                    "Hipersensibilidad al ruido o luz.",
                    "Pérdida de memoria de los eventos antes o después de la lesión."
                ),
                howToAct = listOf(
                    "Reposo total durante 24–48 h.",
                    "Vigilar signos de empeoramiento.",
                    "No permitir ejercicio físico durante mínimo 1 semana.",
                    "Consultar urgencias si hay empeoramiento.",
                    "Evitar pantallas, juegos, televisión o celular las primeras 24 h."
                ),
                whatNotToDo = listOf(
                    "No permitir que vuelva al deporte el mismo día.",
                    "No administrar ibuprofeno las primeras horas.",
                    "No dejar solo por 24 h."
                ),
                procedureImage = R.drawable.concussion
            ),
            FirstAidTopic(
                id = "Hematoma",
                title = "Hematoma",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Mancha púrpura o azulada.",
                    "Hinchazón leve.",
                    "Dolor a la presión.",
                    "No hay fractura ni deformidad."
                ),
                howToAct = listOf(
                    "Aplicar hielo 15 min cada 2–3 h.",
                    "Elevar extremidad.",
                    "Reposo relativo.",
                    "Analgésicos suaves si es necesario.",
                    "Si el hematoma crece mucho o duele demasiado → descartar fractura."
                ),
                whatNotToDo = listOf(
                    "No pinchar ni drenar.",
                    "No aplicar calor en primeras 48 h.",
                    "No masajear fuerte."
                ),
                procedureImage = R.drawable.hematoma
            ),
            FirstAidTopic(
                id = "Hematoma extenso / sospecha de daño interno",
                title = "Hematoma extenso / sospecha de daño interno",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Gran área morada, dura o caliente.",
                    "Inflamación severa.",
                    "Dolor intenso al mover.",
                    "Possible sangrado interno en muslos o abdomen.",
                    "Mareos o palidez (signo de shock)."
                ),
                howToAct = listOf(
                    "Evaluación médica urgente.",
                    "Mantener reposo.",
                    "Inmovilizar zona si hay dolor intenso.",
                    "Aplicar hielo sin presión.",
                    "Controlar signos de shock.",
                    "No administrar anticoagulantes."
                ),
                whatNotToDo = listOf(
                    "No masajear.",
                    "No aplicar calor.",
                    "No ignorar si el hematoma crece rápidamente."
                ),
                procedureImage = R.drawable.hematomaextenso
            ),
            FirstAidTopic(
                id = "Herida punzante",
                title = "Herida punzante",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Orificio pequeño pero profundo.",
                    "Posible sangrado mínimo al inicio, pero más riesgo interno.",
                    "Dolor punzante y localizado.",
                    "Riesgo alto de infección y tétanos.",
                    "A veces cuerpos extraños incrustados."
                ),
                howToAct = listOf(
                    "Lavar con abundante agua por 5 minutos.",
                    "No abrir la herida para “ver dentro”.",
                    "Aplicar presión leve si sangra.",
                    "Cubrir con gasa estéril.",
                    "Observar las próximas 48 h por signos de infección.",
                    "Recomendar atención médica si el objeto estaba sucio, oxidado, o si hay profundidad evidente.",
                    "Considerar vacuna antitetánica según esquema."
                ),
                whatNotToDo = listOf(
                    "No retirar objetos grandes incrustados.",
                    "No aplicar alcohol dentro de la herida.",
                    "No dejar la herida sin cubrir si fue profunda."
                ),
                procedureImage = R.drawable.punzante
            ),
            FirstAidTopic(
                id = "Herida con cuerpo extraño",
                title = "Herida con cuerpo extraño",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Objeto visible incrustado.",
                    "Sangrado leve o moderado.",
                    "Dolor intenso.",
                    "Hinchazón alrededor del objeto.",
                    "Riesgo de hemorragia si se retira incorrectamente."
                ),
                howToAct = listOf(
                    "NO extraer el objeto.",
                    "Fijarlo con gasas para evitar movimiento.",
                    "Aplicar presión suave alrededor del objeto (nunca encima).",
                    "Mantener al paciente tranquilo.",
                    "Trasladar urgente a centro médico.",
                    "Controlar signos vitales durante el traslado."
                ),
                whatNotToDo = listOf(
                    "No mover ni girar el objeto.",
                    "No cortar el objeto salvo que impida traslado (y solo si es seguro).",
                    "No aplicar agua a presión."
                ),
                procedureImage = R.drawable.hcuerpoex
            ),
            FirstAidTopic(
                id = "Amputación",
                title = "Amputación",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Ausencia parcial o total de la extremidad.",
                    "Sangrado masivo.",
                    "Dolor extremo o ausencia de dolor por shock.",
                    "Riesgo vital muy alto."
                ),
                howToAct = listOf(
                    "Llamar emergencias de inmediato.",
                    "Controlar hemorragia con presión o torniquete correctamente aplicado.",
                    "Cubrir el muñón con gasa estéril.",
                    "Recuperar la parte amputada:",
                    "Colocarla en gasa húmeda → dentro de bolsa.",
                    "Esa bolsa dentro de otra con hielo (no contacto directo).",
                    "Mantener al paciente recostado y abrigado.",
                    "Vigilar respiración y signos de shock."
                ),
                whatNotToDo = listOf(
                    "No poner hielo directamente en la extremidad amputada.",
                    "No dejarla en el suelo o sin limpieza.",
                    "No retirar el torniquete una vez colocado."
                ),
                procedureImage = R.drawable.amputacion
            ),
            FirstAidTopic(
                id = "Hemorragia nasal (epistaxis)",
                title = "Hemorragia nasal (epistaxis)",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Bloodtype,
                symptoms = listOf(
                    "Sangrado por una o ambas fosas.",
                    "Sensación de líquido caliente bajando.",
                    "Congestión o dolor leve.",
                    "A veces mareo si dura mucho tiempo."
                ),
                howToAct = listOf(
                    "Sentar a la persona con el cuerpo inclinando ligeramente hacia adelante.",
                    "Apretar suavemente las fosas nasales durante 10–15 minutos sin soltar.",
                    "Aplicar hielo en puente nasal.",
                    "Evitar ingerir bebidas calientes durante 24 h.",
                    "Si no cede en 20 minutos → urgencias."
                ),
                whatNotToDo = listOf(
                    "No echar la cabeza hacia atrás (traga sangre).",
                    "No sonarse la nariz después del sangrado.",
                    "No introducir algodón profundo."
                ),
                procedureImage = R.drawable.hnasal
            ),
            FirstAidTopic(
                id = "Golpe en la nariz",
                title = "Golpe en la nariz",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Dolor agudo.",
                    "Hinchazón.",
                    "Posible sangrado leve.",
                    "Dificultad para respirar si hay desviación.",
                    "A veces hematoma nasal."
                ),
                howToAct = listOf(
                    "Aplicar hielo 10–15 min varias veces al día.",
                    "Mantener cabeza elevada.",
                    "Vigilar si hay deformidad evidente → posible fractura.",
                    "Controlar sangrado nasal si aparece.",
                    "Acudir a médico si la respiración es difícil."
                ),
                whatNotToDo = listOf(
                    "No presionar fuerte la nariz si duele mucho.",
                    "No intentar enderezarla.",
                    "No hacer ejercicio por 48 h."
                ),
                procedureImage = R.drawable.golpen
            ),
            FirstAidTopic(
                id = "Fractura de nariz",
                title = "Fractura de nariz",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Deformidad visible.",
                    "Dolor intenso.",
                    "Hematoma alrededor de los ojos (ojos de mapache).",
                    "Dificultad para respirar por una fosa.",
                    "Sangrado nasal frecuente."
                ),
                howToAct = listOf(
                    "Aplicar hielo sin presionar.",
                    "Mantener sentado a la persona.",
                    "Controlar hemorragia nasal si ocurre.",
                    "Llevar a atención médica para radiografía y reducción (si corresponde).",
                    "Vigilar si aparece líquido claro por nariz → posible lesión de base de cráneo."
                ),
                whatNotToDo = listOf(
                    "No intentar acomodar la nariz.",
                    "No hacer fuerza ni sonarse.",
                    "No acostarse si sangra."
                ),
                procedureImage = R.drawable.fracturan
            ),
            FirstAidTopic(
                id = "Golpe en el ojo",
                title = "Golpe en el ojo",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Visibility,
                symptoms = listOf(
                    "Dolor y lagrimeo.",
                    "Visión borrosa.",
                    "Hinchazón de párpado.",
                    "Hematoma alrededor del ojo.",
                    "Sensibilidad a la luz."
                ),
                howToAct = listOf(
                    "Aplicar hielo envuelto 10–15 min.",
                    "Evitar frotar los ojos.",
                    "Si la visión no mejora en 30–60 min → urgencias.",
                    "Mantener reposo visual (sin pantallas ni luz brillante).",
                    "Vigilar si aparece doble visión (diplopía → posible fractura orbital)."
                ),
                whatNotToDo = listOf(
                    "No frotar el ojo.",
                    "No aplicar gotas no indicadas.",
                    "No presionar el ojo."
                ),
                procedureImage = R.drawable.golpeojo
            ),
            FirstAidTopic(
                id = "Cuerpo extraño en el ojo",
                title = "Cuerpo extraño en el ojo",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Visibility,
                symptoms = listOf(
                    "Sensación de arena.",
                    "Parpadeo constante.",
                    "Lagrimeo excesivo.",
                    "Enrojecimiento.",
                    "Dolor al mover el ojo."
                ),
                howToAct = listOf(
                    "Lavar el ojo con suero fisiológico o agua corriente 1–2 minutos.",
                    "Parpadear repetidamente para expulsarlo.",
                    "Revisar bajo párpado inferior (sin presionar).",
                    "Si no se elimina → acudir a urgencias.",
                    "Mantener el ojo tapado suavemente hasta atención."
                ),
                whatNotToDo = listOf(
                    "No intentar sacar con pinzas.",
                    "No frotar intensamente.",
                    "No usar algodones."
                ),
                procedureImage = R.drawable.cuerpoexojo
            ),
            FirstAidTopic(
                id = "Cortes en párpado o contorno del ojo",
                title = "Cortes en párpado o contorno del ojo",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.Visibility,
                symptoms = listOf(
                    "Herida cerca del ojo con sangrado leve.",
                    "Dolor moderado.",
                    "A veces hinchazón rápida.",
                    "Visión generalmente normal."
                ),
                howToAct = listOf(
                    "Limpiar suavemente los bordes de la herida con suero.",
                    "No aplicar presión directa sobre el globo ocular.",
                    "Controlar sangrado con gasa sin presionar el ojo.",
                    "Tapar ambos ojos si hay dolor al mover (para evitar movimientos involuntarios).",
                    "Evalución médica para sutura o adhesivo quirúrgico."
                ),
                whatNotToDo = listOf(
                    "No usar maquillaje ni cremas.",
                    "No aplicar hielo directo sobre el globo ocular.",
                    "No intentar separar los párpados si duele mucho."
                ),
                procedureImage = R.drawable.corteojo
            ),
            FirstAidTopic(
                id = "Herida ocular grave",
                title = "Herida ocular grave",
                category = "Traumatismos y Lesiones",
                imageVector = Icons.Default.VisibilityOff,
                symptoms = listOf(
                    "Dolor extremo.",
                    "Disminución evidente de visión.",
                    "Sangrado ocular o del párpado.",
                    "Pupila deformada.",
                    "Lagrimeo intenso.",
                    "Cuerpo extraño profundamente incrustado."
                ),
                howToAct = listOf(
                    "NO presionar el ojo.",
                    "No intentar remover nada.",
                    "Cubrir con protector rígido (vasito descartable limpio funciona bien).",
                    "Tapar ambos ojos para evitar movimiento ocular.",
                    "Urgencia hospitalaria inmediata.",
                    "Mantener al paciente tranquilo, sentado, evitando esfuerzos."
                ),
                whatNotToDo = listOf(
                    "No aplicar gotas de ningún tipo.",
                    "No presionar o mover el objeto incrustado.",
                    "No lavar el ojo en perforaciones."
                ),
                procedureImage = R.drawable.hoculargrave
            ),
            FirstAidTopic(
                id = "Cuerpo extraño en el oído",
                title = "Cuerpo extraño en el oído",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Hearing,
                symptoms = listOf(
                    "Molestia o picazón.",
                    "Sensación de “algo dentro”.",
                    "Dolor leve o moderado.",
                    "Disminución auditiva parcial.",
                    "En algunos casos, zumbido o movimiento si es un insecto."
                ),
                howToAct = listOf(
                    "Mantener a la persona calmada y quieta.",
                    "Si es un insecto → inclinar la cabeza y echar un poco de aceite o agua tibia para “flotarlo”.",
                    "Para objetos sólidos → NO intentar extraerlos.",
                    "Tapar el oído suavemente con gasa para evitar que entre más.",
                    "Acudir a urgencias o centro otorrinolaringológico."
                ),
                whatNotToDo = listOf(
                    "No introducir pinzas, cotonitos o dedos.",
                    "No usar agua si se sospecha batería o metal.",
                    "No forzar la salida con presión."
                ),
                procedureImage = R.drawable.cuerpoexoido
            ),
            FirstAidTopic(
                id = "Cuerpo extraño en la nariz",
                title = "Cuerpo extraño en la nariz",
                category = "Heridas Comunes",
                imageVector = Icons.Default.Healing,
                symptoms = listOf(
                    "Dificultad respiratoria por una fosa.",
                    "Moco espeso o mal olor si lleva tiempo.",
                    "Dolor o picazón local.",
                    "Estornudos repetidos."
                ),
                howToAct = listOf(
                    "Pedir que la persona respire por la boca.",
                    "Intentar que sople suavemente SOLO la fosa obstruida (tapando la otra).",
                    "No presionar fuerte.",
                    "No introducir pinzas.",
                    "Si no sale → urgencias."
                ),
                whatNotToDo = listOf(
                    "No usar pinzas ni dedos.",
                    "No empujar más adentro.",
                    "No utilizar aerosoles descongestionantes sin evaluación."
                ),
                procedureImage = R.drawable.cuerpoexnariz
            ),
            FirstAidTopic(
                id = "Mordedura de perro",
                title = "Mordedura de perro",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf(
                    "Herida inciso-contusa.",
                    "Sangrado leve a moderado.",
                    "Piel desgarrada en algunos casos.",
                    "Riesgo de infección alta (hasta 20–30%).",
                    "Posible riesgo de rabia dependiendo del animal."
                ),
                howToAct = listOf(
                    "Lavar la herida con agua y jabón 5 minutos.",
                    "Aplicar presión si sangra.",
                    "Desinfectar y cubrir con gasa.",
                    "Verificar vacunación antitetánica.",
                    "Buscar atención médica si la herida es profunda, el perro es desconocido, o el sangrado es intenso.",
                    "Reportar el caso a autoridad sanitaria si corresponde."
                ),
                whatNotToDo = listOf(
                    "No aplicar remedios caseros.",
                    "No ignorar mordidas pequeñas (igual pueden infectar).",
                    "No cerrar la herida completamente si está muy contaminada."
                ),
                procedureImage = R.drawable.mordeduraperro
            ),
            FirstAidTopic(
                id = "Mordedura de gato",
                title = "Mordedura de gato",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Pets,
                symptoms = listOf(
                    "Pequeños orificios profundos.",
                    "Dolor punzante.",
                    "Alta probabilidad de infección (40–50%).",
                    "Enrojecimiento rápido.",
                    "Posible fiebre si se infecta."
                ),
                howToAct = listOf(
                    "Lavar con agua y jabón abundante.",
                    "Desinfectar con clorhexidina.",
                    "No cerrar la herida completamente (tendencia a infección).",
                    "Acudir a urgencias para antibióticos si es profunda.",
                    "Controlar vacunación antitetánica."
                ),
                whatNotToDo = listOf(
                    "No exprimir la herida.",
                    "No aplicar crema sin limpieza previa.",
                    "No ignorar enrojecimiento creciente."
                ),
                procedureImage = R.drawable.mordeduragato
            ),
            FirstAidTopic(
                id = "Mordedura humana",
                title = "Mordedura humana",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Group,
                symptoms = listOf(
                    "Herida irregular por dientes.",
                    "Sangrado leve o moderado.",
                    "Muchísimo riesgo de infección (bacterias humanas).",
                    "Hematoma alrededor."
                ),
                howToAct = listOf(
                    "Lavar profundamente con agua y jabón.",
                    "Desinfectar con clorhexidina.",
                    "Acudir a urgencias por antibióticos.",
                    "Mantener cubierta la herida.",
                    "Control de tétanos."
                ),
                whatNotToDo = listOf(
                    "No dejar la herida cerrada sin supervisión médica.",
                    "No minimizar heridas occlusivas (con mordida completa).",
                    "No tocar con manos sucias."
                ),
                procedureImage = R.drawable.mordedurahumana
            ),
            FirstAidTopic(
                id = "Mordedura de insecto común",
                title = "Mordedura de insecto común",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Picazón.",
                    "Enrojecimiento y leve hinchazón.",
                    "Dolor punzante breve.",
                    "En abeja → aguijón visible."
                ),
                howToAct = listOf(
                    "Retirar aguijón raspando con tarjeta si existe uno (NO pinzas).",
                    "Lavar con agua y jabón.",
                    "Aplicar frío 10 minutos.",
                    "Usar crema con hidrocortisona o antihistamínico oral si pica mucho.",
                    "Vigilar por 30 minutos posibles reacciones."
                ),
                whatNotToDo = listOf(
                    "No rascar intensamente (riesgo de infección).",
                    "No aplicar calor.",
                    "No usar pinzas para aguijón (exprime veneno)."
                ),
                procedureImage = R.drawable.insectoc
            ),
            FirstAidTopic(
                id = "Reacción alérgica leve por picadura",
                title = "Reacción alérgica leve por picadura",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.HealthAndSafety,
                symptoms = listOf(
                    "Hinchazón limitada al área.",
                    "Picazón fuerte.",
                    "Urticaria pequeña.",
                    "Ligeras molestias respiratorias en algunos casos."
                ),
                howToAct = listOf(
                    "Aplicar frío.",
                    "Tomar antihistamínico si corresponde.",
                    "Mantener observación 1 hora.",
                    "Mantener zona elevada si es extremidad.",
                    "Buscar ayuda si aumenta rápidamente."
                ),
                whatNotToDo = listOf(
                    "No usar ungüentos sin lavar primero.",
                    "No ignorar si aumenta la hinchazón.",
                    "No aplicar vendajes apretados."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Reacción alérgica grave (anafilaxia)",
                title = "Reacción alérgica grave (anafilaxia)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Report,
                symptoms = listOf(
                    "Dificultad para respirar.",
                    "Hinchazón de labios, lengua o cara.",
                    "Urticaria generalizada.",
                    "Mareo o pérdida de conciencia.",
                    "Pulso débil o rápido.",
                    "Voz ronca o sensación de cierre en garganta."
                ),
                howToAct = listOf(
                    "Administrar EpiPen si la persona lo tiene (intramuscular en muslo).",
                    "Llamar emergencias inmediatamente.",
                    "Acostar y elevar piernas si no hay dificultad respiratoria extrema.",
                    "Repetir segunda dosis de adrenalina a los 5–10 min si no mejora (solo para personas indicadas).",
                    "Vigilar respiración y preparar RCP."
                ),
                whatNotToDo = listOf(
                    "No esperar a que “se pase solo”.",
                    "No dar agua o comida.",
                    "No permitir que el paciente camine."
                ),
                procedureImage = R.drawable.alergiainsecto
            ),
            FirstAidTopic(
                id = "Picadura de abeja (reacción localizada severa)",
                title = "Picadura de abeja (reacción localizada severa)",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Gran hinchazón >10 cm.",
                    "Dolor intenso.",
                    "Enrojecimiento que crece por horas.",
                    "A veces ligera fiebre."
                ),
                howToAct = listOf(
                    "Retirar aguijón raspando.",
                    "Lavar con agua y jabón.",
                    "Aplicar frío 20 min.",
                    "Administrar antihistamínico oral.",
                    "Elevar extremidad.",
                    "Consultar médico si la hinchazón sigue aumentando después de 24 h."
                ),
                whatNotToDo = listOf(
                    "No rascar.",
                    "No aplicar calor.",
                    "No usar remedios caseros."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Picadura de araña",
                title = "Picadura de araña",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Dolor localizado o ardor.",
                    "Enrojecimiento circular.",
                    "Inflamación progresiva.",
                    "En especies peligrosas (ej. araña de rincón): Lesión que se vuelve violácea, ampolla, dolor creciente, malestar general o fiebre."
                ),
                howToAct = listOf(
                    "Lavar con agua y jabón.",
                    "Aplicar frío (nunca calor).",
                    "Elevar extremidad.",
                    "Observar 24 h por cambios de color o necrosis.",
                    "Si sospecha de araña venenosa → urgencias.",
                    "Mantener reposo para evitar dispersión del veneno."
                ),
                whatNotToDo = listOf(
                    "No aplicar calor.",
                    "No reventar ampollas.",
                    "No succionar veneno."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Picadura de alacrán / escorpión",
                title = "Picadura de alacrán / escorpión",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Dolor punzante inmediato.",
                    "Entumecimiento o ardor en la zona.",
                    "Inflamación leve a moderada.",
                    "En casos graves (especies venenosas): Salivación excesiva, sudoración, dificultad respiratoria, calambres o espasmos, taquicardia."
                ),
                howToAct = listOf(
                    "Lavar la zona con agua y jabón.",
                    "Aplicar compresas frías 10–20 min.",
                    "Mantener la extremidad en reposo y ligeramente elevada.",
                    "Observar al paciente por 2 horas por síntomas sistémicos.",
                    "Llevar a urgencias si aparecen signos de intoxicación o si es un niño pequeño.",
                    "En zonas endémicas → antídoto disponible en centros de salud."
                ),
                whatNotToDo = listOf(
                    "No succionar veneno.",
                    "No aplicar torniquetes.",
                    "No usar calor.",
                    "No realizar incisiones en la piel."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Picadura de medusa",
                title = "Picadura de medusa",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.Waves,
                symptoms = listOf(
                    "Dolor intenso o ardor inmediato.",
                    "Marcas lineales rojas en la piel.",
                    "Hinchazón y sarpullido.",
                    "En algunos casos: náuseas, dificultad respiratoria, mareos."
                ),
                howToAct = listOf(
                    "Lavar con agua de mar (NO agua dulce).",
                    "Aplicar vinagre en medusas tipo Physalia (carabela portuguesa).",
                    "Retirar tentáculos con pinza o guante, nunca con mano desnuda.",
                    "Sumergir área afectada en agua caliente (40–45°C) por 20–45 min para desactivar toxinas.",
                    "Analgésicos si es necesario.",
                    "Urgencias si hay reacción sistémica."
                ),
                whatNotToDo = listOf(
                    "No lavar con agua dulce (activa toxinas).",
                    "No frotar con arena.",
                    "No aplicar alcohol.",
                    "No usar hielo directo (puede empeorar dolor)."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Mordedura de serpiente",
                title = "Mordedura de serpiente",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Dos orificios o marca semicircular.",
                    "Dolor creciente y ardor.",
                    "Hinchazón progresiva.",
                    "Coloración violeta alrededor.",
                    "Náuseas, sudoración, debilidad.",
                    "En casos graves: dificultad respiratoria, convulsiones, sangrados."
                ),
                howToAct = listOf(
                    "Mantener a la persona calmada y quieta.",
                    "Inmovilizar la extremidad al nivel del corazón.",
                    "Quitar anillos o accesorios (la hinchazón será rápida).",
                    "Lavar con agua y jabón suave.",
                    "Traslado urgente para antiveneno.",
                    "Si es posible, recordar características de la serpiente (NO capturarla)."
                ),
                whatNotToDo = listOf(
                    "No succionar veneno.",
                    "No hacer torniquetes (riesgo de necrosis).",
                    "No cortar la piel.",
                    "No aplicar hielo.",
                    "No levantar la extremidad por encima del corazón."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Golpe de calor",
                title = "Golpe de calor",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.Thermostat,
                symptoms = listOf(
                    "Temperatura corporal >40°C.",
                    "Piel caliente, seca o muy húmeda.",
                    "Dolor de cabeza intenso.",
                    "Confusión o alteración del estado mental.",
                    "Pulso acelerado.",
                    "Náuseas y vómitos.",
                    "En casos graves: convulsiones, coma."
                ),
                howToAct = listOf(
                    "Llamar emergencias inmediato.",
                    "Trasladar a lugar fresco y sombreado.",
                    "Quitar ropa excesiva.",
                    "Aplicar paños húmedos fríos o ducha fría.",
                    "Ventilar constantemente.",
                    "Si está consciente → pequeños sorbos de agua.",
                    "Vigilar respiración y preparar RCP si es necesario."
                ),
                whatNotToDo = listOf(
                    "No dar agua si está inconsciente.",
                    "No usar alcohol en la piel.",
                    "No retrasar la intervención médica."
                ),
                procedureImage = R.drawable.golpecalor
            ),
            FirstAidTopic(
                id = "Insolación / golpe de sol",
                title = "Insolación / golpe de sol",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.WbSunny,
                symptoms = listOf(
                    "Dolor de cabeza.",
                    "Sed intensa.",
                    "Cansancio extremo.",
                    "Mareos o náuseas.",
                    "Piel caliente y enrojecida.",
                    "Frecuencia cardíaca acelerada."
                ),
                howToAct = listOf(
                    "Llevar a la sombra.",
                    "Dar agua lentamente.",
                    "Enfriar cabeza y cuello con paños frescos.",
                    "Aflojar ropa.",
                    "Observar por 1–2 horas.",
                    "Si hay vómitos repetidos → urgencias."
                ),
                whatNotToDo = listOf(
                    "No exponer nuevamente al sol ese día.",
                    "No dejar a la persona sola.",
                    "No dar bebidas alcohólicas."
                ),
                procedureImage = R.drawable.insolacion
            ),
            FirstAidTopic(
                id = "Hipotermia leve",
                title = "Hipotermia leve",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                symptoms = listOf(
                    "Temblor.",
                    "Piel fría.",
                    "Torpeza al hablar o moverse.",
                    "Respiración lenta pero estable.",
                    "Confusión leve."
                ),
                howToAct = listOf(
                    "Llevar a ambiente cálido y seco.",
                    "Retirar ropa mojada.",
                    "Dar bebidas calientes (no alcohol).",
                    "Abrigar con mantas.",
                    "Aplicar calor en pecho y axilas (no extremidades)."
                ),
                whatNotToDo = listOf(
                    "No frotar la piel (riesgo de daño).",
                    "No aplicar calor directo (bolsas muy calientes).",
                    "No permitir que consuma alcohol."
                ),
                procedureImage = R.drawable.hipotermialeve
            ),
            FirstAidTopic(
                id = "Hipotermia moderada / grave",
                title = "Hipotermia moderada / grave",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                symptoms = listOf(
                    "Temblor que desaparece (mal signo).",
                    "Confusión marcada.",
                    "Somnolencia.",
                    "Piel muy fría y pálida.",
                    "Pulso lento.",
                    "Posible inconsciencia."
                ),
                howToAct = listOf(
                    "Llamar emergencias urgente.",
                    "Evitar movimientos bruscos (riesgo de arritmia).",
                    "Abrigar con mantas térmicas.",
                    "No permitir caminar.",
                    "Controlar respiración.",
                    "Preparar RCP si deja de respirar."
                ),
                whatNotToDo = listOf(
                    "No frotar extremidades.",
                    "No usar baños calientes (shock brusco).",
                    "No dar comida ni bebida."
                ),
                procedureImage = R.drawable.hipotermiagrave
            ),
            FirstAidTopic(
                id = "Congelación leve",
                title = "Congelación leve",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                symptoms = listOf(
                    "Piel pálida o amarillenta.",
                    "Entumecimiento.",
                    "Sensación de hormigueo.",
                    "Rigidez leve."
                ),
                howToAct = listOf(
                    "Entrar a un lugar cálido.",
                    "Calentar lentamente con agua tibia (37–39°C) durante 15–30 min.",
                    "Secar y cubrir.",
                    "No caminar si afecta pies.",
                    "Vigilar por ampollas posteriores."
                ),
                whatNotToDo = listOf(
                    "No frotar.",
                    "No usar fuego o calor directo.",
                    "No romper ampollas."
                ),
                procedureImage = R.drawable.congelamientoleve
            ),
            FirstAidTopic(
                id = "Congelación severa",
                title = "Congelación severa",
                category = "Problemas Ambientales",
                imageVector = Icons.Default.AcUnit,
                symptoms = listOf(
                    "Piel dura, blanca o azulada.",
                    "Pérdida total de sensibilidad.",
                    "Ampollas grandes tras el recalentamiento.",
                    "Tejido negro → necrosis."
                ),
                howToAct = listOf(
                    "Urgencias inmediata.",
                    "Si hay riesgo de volver a congelarse → NO recalentar (empeora el daño).",
                    "Cubrir con gasas secas.",
                    "No caminar si son pies/manos.",
                    "Mantener extremidad elevada."
                ),
                whatNotToDo = listOf(
                    "No intentar mover dedos rígidos.",
                    "No recalentar si no hay ambiente seguro.",
                    "No usar agua caliente."
                ),
                procedureImage = R.drawable.congelamientograve
            ),
            FirstAidTopic(
                id = "Convulsión",
                title = "Convulsión",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.FlashOn,
                symptoms = listOf(
                    "Sacudidas corporales involuntarias.",
                    "Pérdida de conciencia.",
                    "Saliva espumosa.",
                    "Respiración ruidosa.",
                    "Confusión tras convulsión."
                ),
                howToAct = listOf(
                    "Colocar a la persona en un lugar seguro, retirar objetos.",
                    "No sujetar a la persona.",
                    "Registrar tiempo de la convulsión.",
                    "Tras terminar → posición lateral de seguridad.",
                    "Revisar respiración.",
                    "Llamar emergencias si dura más de 5 min o si es la primera vez.",
                    "Mantener calma durante la confusión posterior."
                ),
                whatNotToDo = listOf(
                    "No meter objetos en la boca.",
                    "No dar agua o comida.",
                    "No realizar RCP durante la convulsión (solo después si no respira)."
                ),
                procedureImage = R.drawable.convulsion
            ),
            FirstAidTopic(
                id = "Ataque de asma",
                title = "Ataque de asma",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Air,
                symptoms = listOf(
                    "Dificultad para respirar, sensación de pecho “apretado”.",
                    "Silbidos al exhalar (sibilancias).",
                    "Tos seca persistente.",
                    "Ansiedad y respiración rápida.",
                    "Dificultad para hablar frases completas.",
                    "Coloración azulada en labios si es grave."
                ),
                howToAct = listOf(
                    "Mantener la calma y ayudar a sentarse ligeramente inclinado hacia adelante.",
                    "Usar inhalador de rescate (salbutamol o equivalente): 2 inhalaciones y esperar 2 min; repetir hasta 10 inhalaciones según protocolos AHA.",
                    "Aflojar ropa apretada.",
                    "Mantener ventilación del ambiente.",
                    "Si no mejora en 10–15 minutos → urgencias.",
                    "Si la persona tiene plan de acción (tarjeta o indicación médica), seguirlo.",
                    "Observar signos de agotamiento."
                ),
                whatNotToDo = listOf(
                    "No hacer acostar totalmente.",
                    "No administrar medicamentos ajenos.",
                    "No permitir que camine o hable demasiado."
                ),
                procedureImage = R.drawable.asma
            ),
            FirstAidTopic(
                id = "Dificultad respiratoria no conocida",
                title = "Dificultad respiratoria no conocida",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Report,
                symptoms = listOf(
                    "Respiración rápida o superficial.",
                    "Ansiedad marcada.",
                    "Labios morados.",
                    "Uso visible de músculos accesorios (hombros, cuello).",
                    "Mareos o sudoración."
                ),
                howToAct = listOf(
                    "Colocar en posición sentada o semi-sentada.",
                    "Revisión rápida de obstrucción visible.",
                    "Ventilar ambiente.",
                    "Preguntar si tiene antecedentes (asma, alergias, EPOC).",
                    "Llamar emergencias si empeora o hay cianosis.",
                    "Controlar pulso y niveles de conciencia."
                ),
                whatNotToDo = listOf(
                    "No obligar a respirar “profundo” si duele.",
                    "No acostar completamente.",
                    "No dejar sola a la persona."
                ),
                procedureImage = R.drawable.respidesconocida
            ),
            FirstAidTopic(
                id = "Hiperventilación",
                title = "Hiperventilación",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Warning,
                symptoms = listOf(
                    "Respiración muy rápida.",
                    "Sensación de falta de aire aun respirando.",
                    "Hormigueo en labios y manos.",
                    "Mareos.",
                    "Tensión en pecho.",
                    "Ansiedad o crisis de pánico."
                ),
                howToAct = listOf(
                    "Sentar a la persona y decirle que está a salvo.",
                    "Guiar respiración lenta (4 segundos inhalar, 6–8 exhalar).",
                    "Respiración diafragmática (mano en abdomen).",
                    "Acompañar verbalmente para bajar ansiedad.",
                    "Llevar a ambiente tranquilo.",
                    "Si persiste >15 minutos o aparece dolor torácico → urgencias."
                ),
                whatNotToDo = listOf(
                    "No hacer respirar en bolsa (ya no se recomienda).",
                    "No minimizar síntomas (“es psicológico”).",
                    "No dejar a la persona sola."
                ),
                procedureImage = R.drawable.hiperventilacion
            ),
            FirstAidTopic(
                id = "Paro cardiorrespiratorio",
                title = "Paro cardiorrespiratorio",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Favorite,
                symptoms = listOf(
                    "Persona inconsciente.",
                    "No respira o respira agónico (boqueo).",
                    "Ausencia de movimiento.",
                    "Piel fría.",
                    "(No se revisa pulso si no eres profesional; ERC recomienda iniciar RCP si no respira.)"
                ),
                howToAct = listOf(
                    "Verificar seguridad del entorno.",
                    "Revisar respuesta y respiración.",
                    "Llamar emergencias inmediatamente.",
                    "Iniciar RCP: 30 compresiones / 2 ventilaciones (si sabes dar ventilación).",
                    "Solo compresiones si no estás entrenado.",
                    "Cadencia: 100–120/min.",
                    "Profundidad 5–6 cm.",
                    "Usar DEA si está disponible (seguir instrucciones).",
                    "No detener RCP hasta que llegue ayuda."
                ),
                whatNotToDo = listOf(
                    "No perder tiempo buscando pulso si no sabes hacerlo.",
                    "No parar compresiones más de 10 segundos.",
                    "No mover a la persona innecesariamente."
                ),
                procedureImage = R.drawable.cardiorrespiratorio
            ),
            FirstAidTopic(
                id = "Dolor torácico (posible infarto)",
                title = "Dolor torácico (posible infarto)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Favorite,
                symptoms = listOf(
                    "Dolor opresivo o quemante en el centro del pecho.",
                    "Irradiado a brazo izquierdo, mandíbula o espalda.",
                    "Dificultad para respirar.",
                    "Sudor frío.",
                    "Ansiedad extrema.",
                    "Náuseas o vómitos.",
                    "Mareo o sensación de muerte inminente."
                ),
                howToAct = listOf(
                    "Sentar a la persona en posición cómoda.",
                    "Llamar emergencias inmediatamente.",
                    "Aflojar ropa apretada.",
                    "Mantenerla calmada y quieta.",
                    "Si tiene fármaco prescrito (aspirina 300 mg, si no es alérgico) → puede administrarse según protocolos.",
                    "Vigilar consciencia y respiración.",
                    "Preparar para RCP si deja de respirar."
                ),
                whatNotToDo = listOf(
                    "No permitir que camine.",
                    "No ignorar dolor que dura >10 min.",
                    "No administrar medicamentos desconocidos."
                ),
                procedureImage = R.drawable.dolortoracico
            ),
            FirstAidTopic(
                id = "Accidente cerebrovascular (ACV)",
                title = "Accidente cerebrovascular (ACV)",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Face,
                symptoms = listOf(
                    "Método para detectar FAST: Face (caída de un lado de la cara), Arm (debilidad en un brazo), Speech (dificultad para hablar), Time (tiempo = emergencia).",
                    "Otros: Dolor de cabeza intenso, confusión, problemas visuales, pérdida de equilibrio."
                ),
                howToAct = listOf(
                    "Llamar emergencias inmediata.",
                    "Mantener posición sentada o recostada con cabeza elevada.",
                    "Aflojar ropa.",
                    "No permitir movimientos bruscos.",
                    "Vigilar respiración.",
                    "No dar comida ni bebida."
                ),
                whatNotToDo = listOf(
                    "No administrar aspirina (si es ACV hemorrágico empeora).",
                    "No dejar sola a la persona.",
                    "No permitir caminar ni forzar habla."
                ),
                procedureImage = R.drawable.avc
            ),
            FirstAidTopic(
                id = "Crisis hipertensiva",
                title = "Crisis hipertensiva",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Report,
                symptoms = listOf(
                    "Dolor de cabeza fuerte.",
                    "Zumbido en oídos.",
                    "Visión borrosa.",
                    "Mareo.",
                    "Dolor torácico.",
                    "Palpitaciones.",
                    "En casos graves: dificultad para hablar, convulsiones."
                ),
                howToAct = listOf(
                    "Sentar a la persona en un lugar tranquilo.",
                    "Tomar presión si es posible.",
                    "Si supera 180/120 → urgencias.",
                    "Mantener calma y respiración lenta.",
                    "Si tiene medicación prescrita → puede tomarla.",
                    "Vigilar conciencia."
                ),
                whatNotToDo = listOf(
                    "No dar medicamentos ajenos.",
                    "No recostar completamente.",
                    "No permitir esfuerzo físico."
                ),
                procedureImage = R.drawable.crisishiper
            ),
            FirstAidTopic(
                id = "Hipoglucemia",
                title = "Hipoglucemia",
                category = "Problemas de Conciencia",
                imageVector = Icons.Default.Warning,
                symptoms = listOf(
                    "Sudoración fría.",
                    "Temblor.",
                    "Hambre urgente.",
                    "Mareo.",
                    "Visión borrosa.",
                    "Irritabilidad o confusión.",
                    "En casos graves: convulsiones o inconsciencia."
                ),
                howToAct = listOf(
                    "Si está consciente → administrar azúcar: 1 vaso de jugo, 1 cucharada de azúcar, o 3 caramelos duros.",
                    "Esperar 10–15 minutos y volver a evaluar.",
                    "Dar carbohidrato de absorción lenta (galletas, pan) después.",
                    "Si está inconsciente → NO administrar nada por boca → urgencias.",
                    "Posición lateral de seguridad si está somnoliento."
                ),
                whatNotToDo = listOf(
                    "No dar agua si está inconsciente.",
                    "No retrasar ingesta de azúcar si hay síntomas claros.",
                    "No confundir con hiperglucemia antes de tratar."
                ),
                procedureImage = R.drawable.hipoglucemia
            ),
            FirstAidTopic(
                id = "Picadura de tábano",
                title = "Picadura de tábano",
                category = "Mordeduras y Picaduras",
                imageVector = Icons.Default.BugReport,
                symptoms = listOf(
                    "Dolor muy fuerte inmediato.",
                    "Marca roja grande (hasta varios cm).",
                    "Inflamación marcada.",
                    "Posible supuración.",
                    "Picazón intensa.",
                    "A veces fiebre baja si se infecta."
                ),
                howToAct = listOf(
                    "Lavar con agua y jabón.",
                    "Aplicar frío 10 min.",
                    "Aplicar crema antihistamínica o antiinflamatoria suave.",
                    "Si supura o aumenta calor en la piel → consultar por posible infección.",
                    "Mantener zona elevada si es extremidad."
                ),
                whatNotToDo = listOf(
                    "No rascar.",
                    "No aplicar calor.",
                    "No reventar la zona inflamada."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Atragantamiento (obstrucción parcial)",
                title = "Atragantamiento (obstrucción parcial)",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Restaurant,
                symptoms = listOf(
                    "Tos fuerte y efectiva.",
                    "Dificultad moderada para hablar.",
                    "Ruidos al respirar.",
                    "Puede haber cianosis leve si no mejora.",
                    "Persona mantiene conciencia."
                ),
                howToAct = listOf(
                    "Animar a la persona a toser fuerte.",
                    "Mantenerla inclinada hacia adelante.",
                    "Si la tos deja de ser efectiva → considerar maniobra de Heimlich.",
                    "Niños y adultos: compresiones abdominales según técnica.",
                    "Si pierde conciencia → iniciar RCP de inmediato."
                ),
                whatNotToDo = listOf(
                    "No golpear la espalda si la tos es efectiva (puede empeorar obstrucción).",
                    "No meter dedos si no se ve el objeto.",
                    "No permitir que la persona camine o corra."
                ),
                procedureImage = R.drawable.atragantamiento
            ),
            FirstAidTopic(
                id = "Asfixia por inmersión (ahogamiento)",
                title = "Asfixia por inmersión (ahogamiento)",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Waves,
                symptoms = listOf(
                    "Dificultad respiratoria al salir del agua.",
                    "Tos intensa, a veces con espuma.",
                    "Coloración azulada en labios y uñas (cianosis).",
                    "Desorientación o confusión.",
                    "Vómitos.",
                    "Posible pérdida de conciencia.",
                    "En casos graves: paro respiratorio o cardiorrespiratorio."
                ),
                howToAct = listOf(
                    "Sacar a la persona del agua garantizando seguridad propia.",
                    "Evaluar respiración: si no respira → RCP inmediata.",
                    "Si respira pero está inconsciente → PLS (posición lateral de seguridad).",
                    "Aflojar ropa húmeda y mantener abrigado.",
                    "Vigilar signos de dificultad respiratoria durante 24 horas (riesgo de edema pulmonar tardío).",
                    "Buscar atención médica aunque parezca recuperado."
                ),
                whatNotToDo = listOf(
                    "No intentar “sacar agua” colocándolo boca abajo (no sirve).",
                    "No retrasar RCP si no respira.",
                    "No esperar a que “se mejore solo”."
                ),
                procedureImage = null
            ),
            FirstAidTopic(
                id = "Electrocución doméstica",
                title = "Electrocución doméstica",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Bolt,
                symptoms = listOf(
                    "Quemaduras en punto de entrada y salida.",
                    "Espasmos musculares.",
                    "Confusión o pérdida de conciencia.",
                    "Dificultad respiratoria.",
                    "Arritmias cardíacas.",
                    "Dolor muscular profundo."
                ),
                howToAct = listOf(
                    "Cortar la corriente eléctrica ANTES de tocar a la persona.",
                    "Si no respira → RCP.",
                    "Evaluar quemaduras y cubrir con gasa estéril.",
                    "Mantener la persona acostada y abrigada.",
                    "Controlar respiración y pulso.",
                    "Acudir a urgencias incluso si parece leve (riesgo de arritmias hasta 24 h)."
                ),
                whatNotToDo = listOf(
                    "No tocar a la persona si sigue conectada a la corriente.",
                    "No aplicar hielo directamente en quemaduras.",
                    "No ignorar síntomas leves."
                ),
                procedureImage = R.drawable.electrocucion
            ),
            FirstAidTopic(
                id = "Intoxicación por alimentos",
                title = "Intoxicación por alimentos",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Restaurant,
                symptoms = listOf(
                    "Diarrea.",
                    "Náuseas y vómitos.",
                    "Dolor abdominal tipo cólico.",
                    "Fiebre baja.",
                    "Deshidratación (boca seca, orina escasa).",
                    "En intoxicaciones graves: sangre en heces."
                ),
                howToAct = listOf(
                    "Hidratar con agua o suero oral pequeños sorbos frecuentes.",
                    "Dieta blanda (arroz, pan, plátano).",
                    "Lavado de manos constante.",
                    "Vigilar signos de deshidratación severa.",
                    "Consultar si: hay fiebre >38,5°C, hay sangre en heces, vómitos persistentes, dura más de 48 horas.",
                    "En bebés y adultos mayores → consultar antes."
                ),
                whatNotToDo = listOf(
                    "No tomar medicamentos antidiarreicos fuertes sin consulta.",
                    "No consumir lácteos o frituras.",
                    "No dejar de hidratar aunque vomite (sorbitos)."
                ),
                procedureImage = R.drawable.intoxalim
            ),
            FirstAidTopic(
                id = "Intoxicación por medicamentos",
                title = "Intoxicación por medicamentos",
                category = "Emergencias Graves",
                imageVector = Icons.Default.Medication,
                symptoms = listOf(
                    "Depende del fármaco, pero típicamente: Somnolencia o confusión, náuseas y vómitos, respiración lenta, pulso débil, pupilas pequeñas (opioides), convulsiones."
                ),
                howToAct = listOf(
                    "Identificar medicamento, dosis y hora ingerida.",
                    "Llamar a emergencias o centro toxicológico.",
                    "NO inducir vómito.",
                    "Mantener a la persona despierta si es posible.",
                    "Colocar en PLS si está somnolienta.",
                    "Guardar envases para el equipo médico."
                ),
                whatNotToDo = listOf(
                    "No inducir vómito (puede empeorar daño).",
                    "No dar leche ni comida.",
                    "No retrasar consulta."
                ),
                procedureImage = R.drawable.intoxmedi
            ),
            FirstAidTopic(
                id = "Inhalación de humo",
                title = "Inhalación de humo",
                category = "Emergencias Respiratorias",
                imageVector = Icons.Default.Cloud,
                symptoms = listOf(
                    "Tos persistente.",
                    "Irritación de ojos, nariz y garganta.",
                    "Dificultad para respirar.",
                    "Dolor de cabeza.",
                    "Mareos o náuseas.",
                    "En casos graves: confusión, pérdida de conciencia, olor a hollín en la nariz.",
                    "Potencial intoxicación por monóxido de carbono."
                ),
                howToAct = listOf(
                    "Salir de inmediato del área con humo.",
                    "Respirar aire fresco y aflojar ropa.",
                    "Beber agua para aliviar irritación.",
                    "Si hay mareos, dolor torácico o respiración dificultosa → urgencias.",
                    "En exposiciones prolongadas → oxigenoterapia en centro médico.",
                    "Retirar ropa impregnada en humo."
                ),
                whatNotToDo = listOf(
                    "No permanecer en ambientes contaminados.",
                    "No ignorar síntomas respiratorios persistentes.",
                    "No fumar después del episodio."
                ),
                procedureImage = R.drawable.humo
            )
        ).sortedBy { it.category }.sortedBy { it.title }
    }
}
