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
| 2.5.7 Movimientos de arrastre | AA | Toda acción de arrastrar debe tener alternativa con un solo puntero (clic/toque) |
| 2.5.8 Tamaño del objetivo (mínimo) | AA | Objetivos interactivos de al menos 24×24 píxeles CSS, o con espaciado suficiente |
| 3.2.6 Ayuda consistente | A | La ayuda/contacto aparece en el mismo lugar relativo en todas las páginas |
| 3.3.7 Entrada redundante | A | No pedir al usuario datos que ya introdujo en el mismo proceso |
| 3.3.8 Autenticación accesible (mínimo) | AA | No exigir pruebas cognitivas (recordar, transcribir, resolver puzles) para iniciar sesión sin alternativa |

*(Los criterios 2.4.12, 2.4.13 y 3.3.9 son de nivel AAA.)*




























## 11. Fuentes de referencia

- W3C WAI – WCAG 2.2 (w3.org/TR/WCAG22) y *How to Meet WCAG* (w3.org/WAI/WCAG22/quickref)
- W3C – WAI-ARIA Authoring Practices Guide











