# Memoria del Proyecto – By Me Too

**Módulo:** Desarrollo de Interfaces  
**Proyecto:** By Me Too! / Cómprame!  
**Equipo:** Siarhei Lukashou, Elías Pérez Arroyo, Pablo Azogue, Roberto Heredia Chaves  
**Sprint:** Sprint 1 del Project «By Me Too!» (21/09/2026, 15 días)  
**Fecha:** 1 de octubre de 2026

El estado de las tareas es el de las columnas del [Project](https://github.com/users/siarheilukashou25-maker/projects/1): To Do, In progress o Done.

---

## 1. Descripción del proyecto

### 1.1. Idea del proyecto

By Me Too! es una aplicación para la cesta de la compra de un piso, una familia o un evento. La lista hoy vive en una libreta o en un chat, y el coste no es siempre de todos: hay productos de la casa y productos de una sola persona.

El uso previsto es registrar la compra, indicar para quién es y calcular la parte de cada miembro. En este sprint eso está definido y dibujado. El código solo muestra la puerta de entrada y un catálogo de ejemplo.

### 1.2. Público objetivo

Encuesta en Google Forms, del 19 al 25 de septiembre de 2026, con 75 respuestas.

| Dato | Resultado |
| --- | --- |
| Edad | 80 % entre 19 y 40 años |
| Ocupación | 70 % estudiantes o recién titulados |
| Interés | 95 % usaría una aplicación así |
| Lista previa | 71 % prepara la lista: libreta compartida, chat o papel |
| Dónde duele el dinero | Pisos compartidos y eventos. En familia pesa más la lista conjunta |
| Fuera de alcance | Cobrar dentro de la aplicación (PD-1.6) |

La ventana de este sprint mide 540×960 para leerse como un teléfono.

### 1.3. Objetivos de la interfaz

1. Entrar con correo o con una cuenta externa, y poder registrarse.
2. Ver el grupo activo y distinguir un producto común de uno personal.
3. Buscar y añadir desde la pantalla principal.
4. Moverse con una barra inferior: inicio, alta y lista.

El prototipo Figma cubre el flujo entero. La maqueta Swing cubre el acceso y el catálogo.

### 1.4. Benchmarking

PD-1.9, el benchmarking de producto, sigue en To Do. Lo que sí está cerrado es la comparación que decidió la tecnología y el patrón de pantalla.

Lo que usa hoy el público no reparte importes: libreta, chat o bloc de notas. Un 21,3 % no usa nada.

El wireframe toma de otras aplicaciones móviles la barra inferior de cinco destinos, el alta en el centro, el buscador arriba y la tarjeta de grupo. No se copió una pantalla.

| Criterio | AWT | Swing | JavaFX |
| --- | --- | --- | --- |
| Componentes | Pocos y nativos | Amplio catálogo en Java | FXML y CSS |
| Editor en NetBeans | Básico | Form Editor maduro | Scene Builder, fuera de este sprint |
| Decisión | Descartado | **Elegido** (24/09/2026) | Más adelante, si el equipo cambia de herramienta |

Las tareas DI-1.3 y DI-1.4 se escribieron para JavaFX. La vista es Swing: el controlador registra un `ActionListener` en el botón de entrar, fuera de `initComponents()`.

---

## 2. Diseño y planificación

### 2.1. Product Backlog

El backlog es el [Project By Me Too!](https://github.com/users/siarheilukashou25-maker/projects/1). Las etiquetas separan **DI-** (Desarrollo de Interfaces) y **PD-** (Proyecto de DAM). El proyecto va del 21/09/2026 al 22/02/2027.

En el tablero hay 24 tarjetas: 19 Done, 1 In progress y 4 To Do.

Hecho en producto: encuesta, problema, propuesta, objetivos, alcance y limitaciones. En curso, y fuera del Sprint 1: la primera parte de la memoria intermodular (#27, Siarhei).

Siguen en To Do dentro del Sprint 1:

| Issue | Tarea | Responsable | Puntos |
| --- | --- | --- | ---: |
| #15 | PD-1.1 Contexto del proyecto | Roberto | 1 |
| #23 | PD-1.7 Estructura de la memoria | Roberto | 1 |
| #24 | PD-1.8 Viabilidad técnica (opcional) | Siarhei | 1 |
| #25 | PD-1.9 Benchmarking (opcional) | Sin asignar | 1 |

Estos issues existen en el repositorio y no tienen tarjeta. Quedan para el siguiente corte de interfaz:

| Issue | Tarea | Qué falta en el código |
| --- | --- | --- |
| #3 | DI-1.3.1 Limpiar el código generado | Nombres `jButton5` y `jButton6`, textos de prueba |
| #8 | DI-1.4.1 Controlador | El esqueleto ya cambia de ventana. Falta el resto de listeners |
| #4 | DI-1.4.2 Eventos | Solo «Login» responde. El resto de botones no |
| #9 | DI-1.5.1 `main` | `ByMeToo` abre el login. Sigue sin ser la tarea JavaFX de Stage/Scene |
| #5 | DI-1.5 Desplegar la base | El proyecto arranca en `ByMeToo` |

### 2.2. Sprint Backlog

**Objetivo:** dejar cerrada la necesidad del producto y entregar la interfaz base: elección de Swing, wireframe, maqueta, Figma y el guion de smoke test.

**Resultado:** 16 de 20 tarjetas en Done (30 puntos). Las 4 restantes son las de la tabla To Do de arriba (4 puntos). Ninguna tarjeta del sprint está In progress.

| Issue | Tarea | Responsable | Puntos | Columna |
| --- | --- | --- | ---: | --- |
| #11–#13 | Encuesta y formulario | Equipo / Siarhei / Pablo | 3 | Done |
| #16–#17 | Problema y solución | Pablo | 2 | Done |
| #18–#22 | Objetivos, alcance y límites | Siarhei / Elías | 5 | Done |
| #1 | DI-1.1.1 Swing frente a AWT y JavaFX | Siarhei | 2 | Done |
| #6 | DI-1.2.1 Wireframe | Elías | 3 | Done |
| #2 | DI-1.2 (A) `LoginWindow` y `MainWindow` | Elías | 7 | Done |
| #7 | DI-1.2.2 Anclajes con `GroupLayout` | Elías | 4 | Done |
| #29 | DI-1.2 (B) Figma y Base44 | Elías | 2 | Done |
| #10 | DI-1.5.2 Documento de smoke test | Roberto | 2 | Done |

El smoke test está escrito y su checklist no se ha ejecutado. El documento deja el resultado en blanco.

Tres pull requests están en el tablero como Done y fuera del sprint: #26 (esqueleto MVC, Pablo), #28 (las dos vistas, Siarhei) y #30 (rama de Roberto).

### 2.3. Prototipo / Diseño de las pantallas

Tres niveles, en los issues #6 y #29.

**Wireframe.** Splash con el logo. Login con correo, Google y Apple, y una salida para entrar sin cuenta. Dos inicios: carrusel horizontal de grupos o lista vertical. Barra inferior con inicio, crear grupo y perfil.

**Figma, dos líneas.** «Me Too!» (crema y verde) y «Cómprame!» (con alta de cuenta). Las dos recorren el mismo producto: inicio, grupos, alta de compra, reparto global / personal / parcial, balance y perfil. La barra inferior es Inicio, Grupos, +, Balance y Perfil.

**Base44**, navegable: [steady-share-split-sync.base44.app](https://steady-share-split-sync.base44.app). La entrada enseña el grupo, dos accesos (compra compartida y compra personal) y el balance del periodo.

Swing no construye ese mapa. Construye el login y cuatro tarjetas de producto.

---

## 3. Alcance técnico

### 3.1. Tecnologías utilizadas

Java con Swing, editado en el Form Editor de Apache NetBeans. El proyecto compila con source y target 26. El smoke test anota Java 25: hay que unificarlo. Aspecto Nimbus. Diseño en Figma y Base44. Sin base de datos en este sprint. JUnit está previsto y no hay tests en el fuente.

### 3.2. Arquitectura de la aplicación

El producto se plantea en cuatro capas: presentación, lógica, acceso a datos y base de datos. En el código de este sprint la presentación y el controlador están unidos, y el modelo es un cascarón sin reglas.

```text
ByMeToo/src
├── ByMeToo.java                 ← arranca el controlador
├── vista/LoginWindow            ← JFrame generado
├── vista/MainWindow             ← JFrame generado
├── controlador/Controlador      ← login abre la ventana principal
└── modelo/Modelo                ← vacío: aquí irán usuario, grupo y compras
```

`nbproject/src` conserva un esbozo anterior (`App`, `LoginControl`, `LoginModel`) que no entra en la compilación. Los nombres y precios de la pantalla siguen siendo texto del editor, no registros.

### 3.3. Librerías y herramientas

No hay dependencias de terceros: `javac.classpath` está vacío. Se usa el JDK (Swing), NetBeans, GitHub Project, Google Forms, Figma y Base44.

### 3.4. Componentes gráficos utilizados

Solo Swing estándar: `JFrame`, `JPanel`, `JLabel`, `JTextField`, `JPasswordField`, `JButton` y `JCheckBox`. Las dos ventanas cierran con `EXIT_ON_CLOSE` y miden 540×960.

---

## 4. Implementación de la interfaz

`ByMeToo.main` crea el modelo, las dos ventanas y el controlador, y muestra el login. Cada formulario conserva su `main` para abrirlo suelto desde el editor.

### 4.1. Pantalla principal

`MainWindow`, de arriba abajo: favoritos y un botón de cuenta aún con el texto `(●__●)`; buscador «Buscar»; cuatro tarjetas en dos columnas; barra inferior gris con inicio, dos botones sin nombre (`jButton5`, `jButton6`), alta y lista de la compra.

| Producto | Etiqueta | Precio |
| --- | --- | --- |
| Milk | Comun | 2,99$ |
| Crisps | Emilio | 2,49$ |
| Coke | Pablo | 4,99$ |
| Eggs | Comun | 3,45$ |

«Comun» es el producto de todos. Un nombre es un producto de una persona. La imagen es un panel gris, sin foto.

### 4.2. Otras pantallas

`LoginWindow` lleva el título «By Me Too!», correo, contraseña, «Remember me», «Forgot Password?», «Login», Google, Facebook y «Sign Up!». Los textos están en inglés y con erratas («Dont hace account yet?», «Sign it with»). El correo y la contraseña conservan un texto de prueba del editor.

Grupos, alta de compra, reparto, balance y perfil están en Figma y no existen como ventanas Swing.

### 4.3. Propiedades de los componentes

Se cambiaron en la hoja de propiedades del editor. Títulos en Segoe UI 24, campos y botón principal en 18 y a 50 px de alto. Tarjetas en gris 204 y barra de navegación en gris 102. Precios alineados a la derecha. Look and feel Nimbus.

### 4.4. Distribución y posicionamiento

Las dos ventanas usan `GroupLayout`. Un panel ocupa todo el marco. En el login el formulario va centrado. En la principal las tarjetas van en dos columnas y la barra se ancla abajo: el hueco flexible del layout queda encima de ella, así que al estirar la ventana la navegación no se desplaza.

### 4.5. Eventos y acciones

«Login» llama a `Controlador.entrar`: oculta `LoginWindow` y muestra `MainWindow`. El listener se añade en `LoginWindow.alEntrar`, fuera del código generado. Búsqueda, navegación, alta y «Add» siguen sin acción.

### 4.6. Código generado por el editor visual

NetBeans genera `initComponents()` entre `GEN-BEGIN:initComponents` y `GEN-END:initComponents`, y el mismo diseño en el `.form`. El método crea los componentes, aplica fuente, texto y color, monta el `GroupLayout` y termina en `pack()`. Los campos quedan declarados como `private` al final del fichero. El `main` generado elige Nimbus y muestra la ventana en el hilo de Swing.

`MainWindow` repite cuatro veces el bloque de la tarjeta (`productTemplatePanel`, `productTemplatePanel1`…).

### 4.7. Modificaciones realizadas sobre el código

Dentro de `GEN-*` no hay edición a mano: lo que se ve lo escribió el editor al guardar las propiedades. Fuera del bloque están el constructor y dos métodos propios: `alEntrar` registra el listener y `pulsarEntrar` dispara el botón.

Pendiente de limpiar, sin cambiar el diseño: vaciar los campos de prueba, corregir las erratas, renombrar `jButton1`, `jButton5` y `jButton6`, sustituir las cuatro copias de la tarjeta por una clase y pasar los textos al español del prototipo.

---

## 5. Componentes personalizados

### 5.1. Descripción

No hay una clase propia. La pieza reutilizable es la tarjeta de `MainWindow`: panel, título, hueco de imagen, destinatario, precio y botón «Add». Está copiada cuatro veces en el formulario.

### 5.2. Propiedades

Título, precio y etiqueta son `String` puestos en el editor (Milk / 2,99$ / Comun). El fondo de la tarjeta y el de la imagen son grises fijos.

### 5.3. Métodos

No tiene métodos. Cuando sea una subclase de `JPanel`, el constructor recibirá título, precio y etiqueta, y expondrá el botón para que el controlador le ponga el listener fuera del código generado.

### 5.4. Eventos

«Add» no emite nada. La pulsación prevista es añadir ese producto a la cesta.

### 5.5. Reutilización

Hoy un cambio de diseño hay que repetirlo en las cuatro copias. La misma tarjeta debería servir en la ventana principal, en la lista de la compra y en el detalle del grupo, rellenada desde el modelo.

---

## 6. Arquitectura MVC

### 6.1. Model

`modelo.Modelo` existe y no contiene reglas. El controlador lo recibe en el constructor y lo guarda para el siguiente corte. Ahí irán el usuario, el grupo, la compra y quién participa en cada producto. Los textos de las tarjetas todavía no salen de esta clase.

### 6.2. View

`vista.LoginWindow` y `vista.MainWindow` son los `JFrame` del editor. No calculan repartos. El login solo ofrece `alEntrar` para que otro registre la acción, sin conocer al controlador.

### 6.3. Controller

`controlador.Controlador` recibe el modelo y las dos vistas. En el constructor engancha «Login». `entrar` oculta el acceso y muestra la principal. No valida correo ni contraseña. `Controller.LoginControl`, en `nbproject`, sigue vacío y no se usa.

### 6.4. Comunicación entre componentes

`ByMeToo` crea `Modelo`, `LoginWindow`, `MainWindow` y `Controlador`, y llama a `iniciar()`.

```text
Login  --alEntrar-->  Controlador.entrar  -->  oculta Login
                                         -->  muestra MainWindow
Controlador guarda Modelo para cuando haya datos
```

---

## 7. Relación con RA1 y criterios de evaluación

RA1 de Desarrollo de Interfaces: generar la interfaz con un editor visual y adaptar el código generado.

| Criterio | Evidencia | Situación |
| --- | --- | --- |
| a. Crear la interfaz con el editor | `LoginWindow.form` y `MainWindow.form` | Cumplido |
| b. Colocar los componentes con el editor | `GroupLayout`, login centrado, barra anclada abajo | Cumplido |
| c. Ajustar propiedades | 540×960, fuentes, colores, textos y productos de ejemplo | Cumplido |
| d. Analizar el código generado | Apartado 4.6. La limpieza (DI-1.3.1) no está en el sprint | Parcial |
| e. Modificar el código generado | Los cambios se hicieron en la hoja de propiedades, que reescribe `initComponents()` | Parcial |
| f. Asociar eventos | «Login» abre la ventana principal. El resto de botones no | Parcial |
| g. Aplicación con esa interfaz | `ByMeToo` arranca el login y desde ahí se pasa a la principal | Cumplido en el corte de este sprint |

Cumplido lo que depende del editor y el arranque. Abierto el resto de eventos y la lógica del modelo.

---

## 8. Resultado final

### 8.1. Capturas de pantalla

Línea Me Too!:

![Inicio Me Too!](https://github.com/user-attachments/assets/9e23664c-d441-49ab-9e85-cf8287fea85e)

![Pantallas Me Too!](https://github.com/user-attachments/assets/2aa37a52-3146-44d2-8724-518dfa5ed3af)

Línea Cómprame!:

![Inicio Cómprame!](https://github.com/user-attachments/assets/394715af-8fc6-487c-9fa4-99d74c02e5ef)

![Pantallas Cómprame!](https://github.com/user-attachments/assets/603e6db4-b9a6-45e3-ab10-bfe862471527)

Base44:

![Base44](https://github.com/user-attachments/assets/99a672d2-5b1f-4eca-9ea2-aeb1de280146)

No hay captura de la maqueta Swing en el repositorio. Se abre en NetBeans ejecutando `vista.LoginWindow` o `vista.MainWindow`.

### 8.2. Funcionalidades implementadas

En código: la aplicación arranca en el login. «Login» cambia a la pantalla principal. El resto de botones no hace nada. El modelo está creado y vacío.

En diseño: wireframe, dos líneas Figma y el prototipo Base44. El smoke test está redactado y no ejecutado.

Sin construir: validación del acceso, el resto de la navegación, compras, grupos, reparto, balances, persistencia y la tarjeta reutilizable.

### 8.3. Prototipo

La referencia del producto es Figma más Base44. Swing es el primer corte ejecutable: acceso y catálogo. El resto del mapa queda para el siguiente sprint de interfaz.

---

## 9. Repositorio y enlaces

- Código: [https://github.com/siarheilukashou25-maker/By-Me-Too](https://github.com/siarheilukashou25-maker/By-Me-Too)
- Project: [https://github.com/users/siarheilukashou25-maker/projects/1](https://github.com/users/siarheilukashou25-maker/projects/1)
- Documentación: [https://github.com/siarheilukashou25-maker/Proyecto-Intermodular-By-Me-Too](https://github.com/siarheilukashou25-maker/Proyecto-Intermodular-By-Me-Too)
- Encuesta: [https://forms.gle/jGS1AZdvxJxhXBKbA](https://forms.gle/jGS1AZdvxJxhXBKbA)
- Prototipo: [https://steady-share-split-sync.base44.app](https://steady-share-split-sync.base44.app)
- En este repositorio: `docs/AnálisisDeMercado.md` y `docs/1.5.2 Smoke Tests.md`

---

## 10. Conclusiones

El Sprint 1 cierra la interfaz que sale del editor: Swing elegido frente a AWT y JavaFX, wireframe, Figma y dos ventanas con `GroupLayout`. Eso cubre los criterios a, b y c del RA1.

La aplicación ya arranca y «Login» cambia de ventana, sin comprobar credenciales. El modelo no calcula nada. El siguiente corte es limpiar el código generado, extraer la tarjeta y conectar el resto de botones al mismo controlador.

La encuesta de 75 personas fija el producto: lista compartida primero y reparto de gastos en pisos y eventos. Figma ya enseña ese mapa. Esta maqueta enseña la entrada y el catálogo.
