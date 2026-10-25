# Manual de Accesibilidad y Usabilidad para las interfaces de By Me Too

## 1. Introducción y objetivo

Este manual recoge las medidas de accesibilidad y usabilidad que deben integrarse en las interfaces del proyecto **By Me Too**, explica **por qué** se aplican y **qué importancia** tienen. Sirve como guía común para diseño, desarrollo y pruebas, y como criterio de revisión antes de dar una funcionalidad por terminada.

## 2. Conceptos clave

**Accesibilidad:** que cualquier persona sin contexto, pueda percibir, comprender, navegar e interactuar con la interfaz. Incluye discapacidades permanentes (visual, auditiva, motriz, cognitiva), temporales (un brazo escayolado) y situacionales (sol directo sobre la pantalla, un entorno ruidoso).

**Usabilidad:** grado en que un producto puede ser usado por usuarios concretos para lograr objetivos con **eficacia, eficiencia y satisfacción** en un contexto de uso específico (definición de ISO 9241-11).

**Relación entre ambas:** la accesibilidad garantiza que *todas las personas puedan usar* la interfaz; la usabilidad garantiza que *sea fácil y agradable de usar*. Una interfaz puede ser técnicamente accesible y resultar incómoda, o ser cómoda para unos y una barrera para otros. Se necesitan las dos.

## 3. Marco normativo y estándares de referencia

### 3.1 WCAG 2.2 (W3C)

Las *Web Content Accessibility Guidelines* son el estándar internacional de referencia. La versión 2.2 es Recomendación del W3C desde el 5 de octubre de 2023 y añadió 9 criterios nuevos y eliminó el 4.1.1 (Análisis sintáctico). Se organiza en cuatro principios, conocidos como **POUR**:

- **Perceptible:** la información debe poder percibirse (alternativas de texto, contraste, subtítulos, adaptabilidad).
- **Operable:** todo debe poder manejarse con teclado, ratón, táctil o tecnologías de apoyo, sin límites de tiempo abusivos ni contenido que provoque crisis.
- **Comprensible:** contenido legible, comportamiento predecible y ayuda para evitar y corregir errores.
- **Robusto:** compatible con navegadores y tecnologías de apoyo actuales y futuras.

Los criterios tienen niveles **A, AA y AAA**. **El objetivo recomendado para este proyecto es el nivel AA de WCAG 2.2.** El nivel AAA no se exige de forma global, pero conviene aplicar criterios concretos cuando sea viable.

Nuevos criterios de WCAG 2.2 relevantes:

| Criterio | Nivel | Qué exige |
|---|---|---|
| 2.4.11 Foco no oculto (mínimo) | AA | El elemento enfocado no puede quedar tapado por cabeceras fijas, banners o cookies |
| 2.4.12 Foco no oculto (mejorado) | AAA | Ninguna parte del elemento enfocado puede quedar oculta por contenido añadido por el autor |
| 2.4.13 Apariencia del foco | AAA | El indicador de foco debe tener un tamaño mínimo (área equivalente a un perímetro de 2 píxeles CSS) y un contraste de al menos 3:1 entre sus estados enfocado y no enfocado |
| 2.5.7 Movimientos de arrastre | AA | Toda acción de arrastrar debe tener alternativa con un solo puntero (clic/toque) |
| 2.5.8 Tamaño del objetivo (mínimo) | AA | Objetivos interactivos de al menos 24×24 píxeles CSS, o con espaciado suficiente |
| 3.2.6 Ayuda consistente | A | La ayuda/contacto aparece en el mismo lugar relativo en todas las páginas |
| 3.3.7 Entrada redundante | A | No pedir al usuario datos que ya introdujo en el mismo proceso |
| 3.3.8 Autenticación accesible (mínimo) | AA | No exigir pruebas cognitivas (recordar, transcribir, resolver puzles) para iniciar sesión sin alternativa |
| 3.3.9 Autenticación accesible (mejorado) | AAA | Igual que 3.3.8, pero más estricto: no permite excepciones para reconocer objetos ni contenido personal propio del usuario |


### 3.2 WCAG 3.0

Es un borrador de trabajo del W3C (actualización de marzo de 2026), con un modelo de puntuación por resultados en lugar de aprobado/suspenso. Una Recomendación final no se espera antes de 2028, por lo que **no es exigible**; WCAG 2.2 sigue siendo la referencia vigente.

### 3.3 Normativa europea y española

- **Directiva (UE) 2019/882 – Acta Europea de Accesibilidad (EAA):** fija requisitos comunes de accesibilidad para productos y servicios.
- **Ley 11/2023, de 8 de mayo:** transpone la EAA a España. Sus obligaciones de accesibilidad se aplican desde el **28 de junio de 2025**. Entre los servicios cubiertos figuran el comercio electrónico, los servicios bancarios a consumidores y las comunicaciones electrónicas. Las microempresas prestadoras de servicios están exentas, por lo que conviene verificar si el proyecto está incluido.
- **UNE-EN 301 549:** norma técnica europea de accesibilidad TIC que sirve de base para demostrar conformidad. Actualmente incorpora WCAG 2.1 AA, y está previsto actualizarla hacia WCAG 2.2.
- **Real Decreto 1112/2018:** accesibilidad de sitios web y apps móviles del **sector público** español; exige además una declaración de accesibilidad.

**Importante:** cumplir WCAG no equivale automáticamente a cumplir la EAA, que incluye requisitos adicionales (por ejemplo, servicios de soporte accesibles e información sobre accesibilidad). Si el proyecto tiene fines comerciales, conviene consultar con asesoría legal. Este manual no constituye asesoramiento jurídico.

### 3.4 Estándares de usabilidad

- **ISO 9241-11:** define usabilidad (eficacia, eficiencia, satisfacción).
- **ISO 9241-210:** proceso de diseño centrado en las personas (investigar el contexto, especificar requisitos, diseñar, evaluar y repetir).
- **10 heurísticas de Nielsen:** principios de evaluación de interfaces (ver sección 5).
- **WAI-ARIA 1.2:** especificación del W3C para roles, estados y propiedades que hacen accesibles los componentes dinámicos.
- **Pautas de plataforma:** Material Design (Android/web) y Human Interface Guidelines (iOS), útiles para componentes táctiles y apps móviles.

## 4. Medidas de accesibilidad a integrar

Para cada medida se indica **qué hacer**, **por qué** y su **criterio WCAG**.

### 4.1 Perceptible

**Alternativas de texto para imágenes (1.1.1, A).**
- Qué: toda imagen informativa lleva `alt` descriptivo; las decorativas llevan `alt=""`. Los iconos que actúan como botón necesitan nombre accesible (`aria-label` o texto oculto visualmente).
- Por qué: las personas ciegas o con baja visión que usan lectores de pantalla no pueden interpretar una imagen sin su texto equivalente.

**Contraste de color (1.4.3 y 1.4.11, AA).**
- Qué: relación mínima **4,5:1** para texto normal y **3:1** para texto grande (≥24 px, o ≥18,5 px en negrita) y para bordes de campos, iconos y estados de componentes.
- Por qué: afecta a personas con baja visión, daltonismo y a cualquiera que use el móvil a pleno sol.

**No depender solo del color (1.4.1, A).**
- Qué: los errores, estados y enlaces se indican además con texto, icono o subrayado.
- Por qué: unos 1 de cada 12 hombres tiene alguna forma de daltonismo; un campo "en rojo" sin más información pasa desapercibido.

**Texto redimensionable y reflujo (1.4.4, 1.4.10, AA).**
- Qué: usar unidades relativas (`rem`, `%`), permitir zoom hasta el 200 % sin perder contenido ni funcionalidad y que el diseño se reorganice a 320 px de ancho sin scroll horizontal.
- Por qué: facilita la lectura a personas con baja visión y a quienes usan pantallas pequeñas.

**Espaciado del texto (1.4.12, AA).** El contenido no debe romperse si el usuario aumenta interlineado, espaciado de párrafos y de letras.

**Multimedia (1.2.x).** Subtítulos en vídeos con voz, transcripción para audio y audiodescripción cuando la información visual sea esencial. Por qué: personas sordas o con discapacidad auditiva, y usuarios en entornos sin sonido.

**Estructura semántica (1.3.1, A).** Usar HTML semántico: `header`, `nav`, `main`, `footer`, encabezados `h1–h6` en orden lógico, listas reales, `table` solo para datos. Por qué: los lectores de pantalla navegan por encabezados y regiones; la semántica es la base de todo lo demás.

**Orientación y propósito de los campos (1.3.4, 1.3.5, AA).** No bloquear la orientación vertical u horizontal y usar `autocomplete` correcto en datos personales.

### 4.2 Operable

**Acceso completo por teclado (2.1.1, A).**
- Qué: todas las funciones deben poder usarse con teclado; sin trampas de foco; orden de tabulación lógico; nada de `tabindex` positivo.
- Por qué: personas con discapacidad motriz, usuarios de lectores de pantalla, de conmutadores y de teclados externos dependen de él.

**Foco visible y no oculto (2.4.7 AA; 2.4.11 AA en WCAG 2.2).** Indicador de foco claro, con buen contraste, que no quede tapado por elementos fijos. Nunca usar `outline: none` sin sustituto.

**Enlace para saltar al contenido (2.4.1, A).** "Saltar al contenido principal" como primer elemento enfocable. Evita recorrer toda la navegación en cada página.

**Títulos de página y enlaces descriptivos (2.4.2, 2.4.4).** Títulos únicos y enlaces cuyo texto se entienda por sí solo (evitar "clic aquí").

**Tamaño de los objetivos táctiles (2.5.8, AA).** Mínimo 24×24 px CSS; como buena práctica, **44×44 px** en móvil. Por qué: personas con temblores, poca precisión o dedos grandes fallan al tocar botones diminutos.

**Alternativa al arrastre (2.5.7, AA).** Si hay arrastrar y soltar o deslizadores, ofrecer botones o clic como alternativa.

**Tiempo suficiente (2.2.1, A).** Avisar y permitir ampliar los límites de tiempo, como las sesiones que caducan.

**Sin destellos (2.3.1, A).** Nada que parpadee más de 3 veces por segundo (riesgo de crisis epilépticas). Respetar `prefers-reduced-motion` para animaciones.

### 4.3 Comprensible

**Idioma de la página (3.1.1, A).** Declarar `lang="es"` (y `lang` en fragmentos en otro idioma). Los lectores de pantalla eligen la pronunciación según él.

**Comportamiento predecible (3.2.x).** Navegación y componentes consistentes; ningún cambio de contexto inesperado al enfocar o rellenar un campo. Ayuda en el mismo sitio en todas las pantallas (3.2.6).

**Formularios accesibles (3.3.x, 1.3.1, 4.1.2).**
- Cada campo con `<label>` asociado visible (no solo *placeholder*).
- Instrucciones y formatos esperados antes del campo.
- Mensajes de error junto al campo, en texto claro, que indiquen cómo corregirlo (3.3.1, 3.3.3).
- Confirmar o permitir revisar acciones importantes o irreversibles (3.3.4).
- No pedir de nuevo datos ya introducidos (3.3.7).
- Autenticación sin pruebas cognitivas obligatorias: permitir gestores de contraseñas y pegar contraseñas (3.3.8).
- Por qué: los formularios son el punto donde más usuarios abandonan, y donde las barreras tienen más impacto.

**Lenguaje claro.** Frases cortas, vocabulario sencillo, evitar jerga. Beneficia a personas con discapacidad cognitiva, baja alfabetización o que no tienen el español como lengua materna.

### 4.4 Robusto

**Nombre, rol y valor (4.1.2, A).** Todo componente personalizado debe exponer a las tecnologías de apoyo su nombre, su rol y su estado. Primero usar el elemento HTML nativo (`button`, `input`, `select`); usar ARIA solo cuando no exista equivalente nativo.

**Mensajes de estado (4.1.3, AA).** Notificaciones, errores asíncronos o resultados de búsqueda se anuncian con `role="status"`, `role="alert"` o `aria-live` sin mover el foco.

**Regla de oro de ARIA:** *ningún ARIA es mejor que un mal ARIA*. Un rol incorrecto empeora la experiencia respecto a no usarlo.

**Regla de oro de ARIA:** *ningún ARIA es mejor que un mal ARIA*. Un rol incorrecto empeora la experiencia respecto a no usarlo.

## 5. Medidas de usabilidad a integrar

### Las 10 heurísticas de Nielsen aplicadas al proyecto

1. **Visibilidad del estado del sistema:** indicadores de carga, confirmaciones de guardado, progreso en procesos de varios pasos.
2. **Coherencia con el mundo real:** lenguaje del usuario, iconos reconocibles, orden natural de la información.
3. **Control y libertad del usuario:** deshacer, cancelar y volver atrás sin perder datos.
4. **Consistencia y estándares:** mismos patrones, nombres y comportamientos en toda la aplicación (sistema de diseño).
5. **Prevención de errores:** restricciones sensatas, valores por defecto, confirmación en acciones destructivas.
6. **Reconocer antes que recordar:** opciones visibles, historial, sugerencias; no obligar a memorizar.
7. **Flexibilidad y eficiencia de uso:** atajos y flujos rápidos para usuarios habituales sin complicar a los nuevos.
8. **Diseño estético y minimalista:** mostrar solo lo necesario; priorizar jerarquía visual.
9. **Ayudar a reconocer, diagnosticar y recuperarse de errores:** mensajes en lenguaje claro, con causa y solución.
10. **Ayuda y documentación:** ayuda breve, contextual y fácil de encontrar.

### Medidas prácticas adicionales

- **Diseño responsive y *mobile first*:** la mayor parte del uso es móvil; se diseña primero para pantallas pequeñas y se escala.
- **Jerarquía visual y espacio en blanco:** guían la atención y reducen la carga cognitiva.
- **Tiempos de carga y rendimiento:** una interfaz lenta es una barrera, especialmente con conexiones limitadas.
- **Estados completos de cada componente:** normal, hover, foco, activo, deshabilitado, error, carga y vacío.
- **Pruebas con personas usuarias reales,** incluidas personas con discapacidad, durante el diseño y antes de lanzar.

## 6. Por qué importa: argumentos de peso

- **Ético y de inclusión:** el acceso a la información y a los servicios es un derecho. Una interfaz inaccesible excluye de facto a parte de la población.
- **Alcance:** solo en España hay más de 4,3 millones de personas con algún tipo de discapacidad (cifra citada por fuentes del sector), sin contar a las personas mayores o con limitaciones temporales.
- **Legal:** la Ley 11/2023 aplica desde junio de 2025 y las sanciones pueden alcanzar importes elevados en los casos graves; además, la reputación está en juego.
- **Beneficio para todos (efecto bordillo rebajado):** los subtítulos, el buen contraste y los formularios claros ayudan a todo el mundo.
- **Calidad técnica y SEO:** HTML semántico y estructura clara mejoran el posicionamiento y la mantenibilidad.
- **Coste:** corregir la accesibilidad desde el diseño es mucho más barato que reparar una interfaz ya construida.
  
## 7. Cómo integrarlo en el flujo de trabajo

**Diseño**
- Definir paleta con contrastes verificados y tipografía mínima legible (≥16 px de cuerpo).
- Documentar estados de foco, error y vacío en cada componente.
- Anotar en los prototipos el orden de foco y los textos alternativos.

**Desarrollo**
- Usar HTML semántico y componentes nativos antes que personalizados.
- Añadir linters de accesibilidad al proyecto (por ejemplo `eslint-plugin-jsx-a11y` si se usa React).
- Incluir pruebas automáticas con **axe-core** o **Lighthouse** en la integración continua.

**Revisión.** Una funcionalidad solo se considera terminada si:

- [ ] Se puede usar entera con teclado
- [ ] El foco es visible y ordenado
- [ ] Cumple los contrastes
- [ ] Imágenes e iconos tienen alternativa
- [ ] Los formularios tienen etiquetas y errores claros
- [ ] Funciona con zoom al 200 % y a 320 px de ancho
- [ ] Pasa las pruebas automáticas sin errores críticos

## 8. Herramientas de verificación

| Tipo | Herramienta | Uso |
|---|---|---|
| Automática | axe DevTools, Lighthouse, WAVE | Detectan una parte de los problemas (aproximadamente un tercio o menos) |
| Contraste | Colour Contrast Analyser, WebAIM Contrast Checker | Verificar ratios 4,5:1 y 3:1 |
| Lector de pantalla | NVDA (Windows), VoiceOver (macOS/iOS), TalkBack (Android) | Prueba manual de la experiencia real |
| Teclado | Navegar solo con Tab, Mayús+Tab, Enter, Espacio y Esc | Detectar trampas y foco perdido |
| Zoom y reflujo | Zoom del navegador al 200–400 % | Comprobar 1.4.4 y 1.4.10 |
| Usabilidad | Pruebas con usuarios, evaluación heurística | Detectar fricción que las herramientas no ven |

**Importante:** las herramientas automáticas no sustituyen la revisión manual ni las pruebas con personas usuarias.





















## 11. Fuentes de referencia

[1] World Wide Web Consortium (W3C), "Web Content Accessibility Guidelines (WCAG) 2.2," W3C Recommendation, 2023. [En línea]. Disponible en: https://www.w3.org/TR/WCAG22/

[2] W3C Web Accessibility Initiative (WAI), "How to Meet WCAG (Quick Reference)," W3C, 2023. [En línea]. Disponible en: https://www.w3.org/WAI/WCAG22/quickref/

[3] W3C Web Accessibility Initiative (WAI), "WAI-ARIA Authoring Practices Guide (APG)," W3C. [En línea]. Disponible en: https://www.w3.org/WAI/ARIA/apg/

[4] J. Nielsen, "10 Usability Heuristics for User Interface Design," Nielsen Norman Group. [En línea]. Disponible en: https://www.nngroup.com/articles/ten-usability-heuristics/

[5] *Ergonomics of human-system interaction. Part 11: Usability: Definitions and concepts*, ISO 9241-11:2018, International Organization for Standardization, Ginebra, Suiza, 2018. [En línea]. Disponible en: https://www.iso.org/standard/63500.html

[6] *Ergonomics of human-system interaction. Part 210: Human-centred design for interactive systems*, ISO 9241-210:2019, International Organization for Standardization, Ginebra, Suiza, 2019. [En línea]. Disponible en: https://www.iso.org/standard/77520.html

[7] Directiva (UE) 2019/882 del Parlamento Europeo y del Consejo, de 17 de abril de 2019, sobre los requisitos de accesibilidad de los productos y servicios, *Diario Oficial de la Unión Europea*, L 151, 7 jun. 2019. [En línea]. Disponible en: https://eur-lex.europa.eu/legal-content/ES/TXT/?uri=CELEX:32019L0882

[8] Ley 11/2023, de 8 de mayo, de trasposición de Directivas de la Unión Europea en materia de accesibilidad de determinados productos y servicios, migración de personas altamente cualificadas, tributaria y digitalización del sector financiero, *Boletín Oficial del Estado*, may. 2023. [En línea]. Disponible en: https://www.boe.es/buscar/act.php?id=BOE-A-2023-11335

[9] Real Decreto 1112/2018, de 7 de septiembre, sobre accesibilidad de los sitios web y aplicaciones para dispositivos móviles del sector público, *Boletín Oficial del Estado*, sep. 2018. [En línea]. Disponible en: https://www.boe.es/buscar/act.php?id=BOE-A-2018-12699

[10] *Requisitos de accesibilidad aplicables a los productos y servicios TIC*, UNE-EN 301 549, Asociación Española de Normalización (UNE), Madrid, España.

[11] Observatorio de Accesibilidad Web, Portal de la Administración Electrónica, Gobierno de España. [En línea]. Disponible en: https://administraciones.gob.es











