# By Me Too!/Comprame!

**By Me Too!/Comprame!** es una aplicación móvil para gestionar compras compartidas y facilitar la distribución de los gastos entre personas que viven juntas.

El proyecto se desarrolla como parte del **Trabajo de Fin de Grado (TFG) del ciclo DAM (Desarrollo de Aplicaciones Multiplataforma)** por un equipo de 4 personas, utilizando **Scrum** como metodología de desarrollo.

---

## 📖 Descripción del proyecto

Cuando varias personas viven juntas, gestionar las compras y repartir los gastos puede convertirse en un proceso complicado. No todas las compras son para todos: algunos productos son compartidos, mientras que otros son exclusivamente personales.

**By Me Too!/Comprame!** nace con el objetivo de simplificar este proceso mediante una aplicación que permita registrar las compras realizadas por los miembros de un grupo y calcular automáticamente cuánto corresponde pagar a cada persona.

La idea principal es sencilla:

> **Registrar una compra → indicar para quién es → guardar su precio → calcular automáticamente los gastos de cada miembro.**

De esta forma, al finalizar una semana, un mes o cualquier otro periodo establecido, los usuarios pueden consultar de manera clara cuánto han gastado y cuánto deben aportar o recibir.

---

## 🎯 Objetivos

Los principales objetivos del proyecto son:

* Crear una aplicación sencilla e intuitiva para gestionar compras compartidas.
* Permitir crear grupos de convivencia.
* Añadir y gestionar productos y compras.
* Diferenciar entre:

  * 👥 **Productos compartidos** entre todos los miembros.
  * 👤 **Productos personales** pertenecientes a un único usuario.
  * 👥 **Productos compartidos entre varios miembros**.
* Registrar el precio de cada compra.
* Asociar cada compra con el usuario que la ha realizado.
* Calcular automáticamente el gasto correspondiente a cada miembro.
* Consultar los gastos por diferentes periodos de tiempo.
* Facilitar el reparto de los gastos al finalizar una semana o un mes.
* Reducir la necesidad de realizar cálculos manuales.
* Aplicar una metodología de desarrollo profesional basada en **Scrum**.

---

## 💡 Ejemplo de funcionamiento

Imaginemos un piso compartido por cuatro personas:

* **Ana**
* **Carlos**
* **Laura**
* **Miguel**

Durante la semana se realizan diferentes compras:

| Producto | Precio | Tipo       | Participantes |
| -------- | -----: | ---------- | ------------- |
| Leche    | 2,00 € | Compartido | Todos         |
| Pizza    | 8,00 € | Compartido | Ana, Carlos   |
| Champú   | 4,50 € | Personal   | Laura         |
| Café     | 5,00 € | Compartido | Todos         |
| Cereales | 3,50 € | Personal   | Miguel        |

La aplicación tendrá en cuenta quién participa en cada compra y calculará automáticamente la parte correspondiente a cada persona.

Al finalizar el periodo, cada usuario podrá consultar un resumen de sus gastos y el balance correspondiente.

---

## 👥 Equipo

El proyecto está desarrollado por un equipo de **4 estudiantes de DAM**.

La organización del trabajo se realiza siguiendo los principios de **Scrum**, dividiendo el desarrollo en tareas y entregas incrementales.

### Roles dentro del equipo

Los roles y responsabilidades se distribuyen entre los miembros del equipo según las necesidades del proyecto:

* **Product Owner** — gestión y priorización del Product Backlog.
* **Scrum Master** — seguimiento de la metodología Scrum y eliminación de impedimentos.
* **Development Team** — diseño, desarrollo, pruebas y mantenimiento de la aplicación.

> Los roles pueden ser rotativos para fomentar la participación de todos los miembros del equipo en las diferentes áreas del proyecto.

---

## 🔄 Metodología: Scrum

Para organizar el desarrollo utilizamos **Scrum**, trabajando mediante iteraciones denominadas **Sprints**.

Cada Sprint tiene como objetivo entregar una parte funcional del proyecto.

### Flujo de trabajo

```text
Product Backlog
       │
       ▼
Sprint Planning
       │
       ▼
     Sprint
       │
       ├── Desarrollo
       ├── Pruebas
       └── Seguimiento
       │
       ▼
Sprint Review
       │
       ▼
Retrospective
       │
       ▼
Actualización del Product Backlog
```

### Ceremonias utilizadas

* **Sprint Planning** — planificación del trabajo que se realizará durante el Sprint.
* **Daily Scrum** — breve reunión para revisar el progreso y posibles problemas.
* **Sprint Review** — presentación del trabajo realizado.
* **Sprint Retrospective** — análisis del funcionamiento del equipo y búsqueda de mejoras.

---

## 🚀 Funcionalidades principales

### 👤 Gestión de usuarios

* Registro e inicio de sesión.
* Gestión del perfil del usuario.
* Visualización de los grupos a los que pertenece.

### 🏠 Gestión de grupos

* Crear un grupo de convivencia.
* Unirse a un grupo.
* Invitar a otros usuarios.
* Consultar los miembros del grupo.
* Gestionar los miembros del grupo.

### 🛒 Gestión de compras

* Añadir nuevas compras.
* Indicar el producto adquirido.
* Registrar el precio.
* Indicar quién ha realizado la compra.
* Seleccionar quiénes participan en el gasto.
* Editar o eliminar compras.

### 💰 División de gastos

El sistema diferencia entre:

**Compra para todos**

```text
Compra: 12 €
Participantes: 4

12 € / 4 = 3 € por persona
```

**Compra personal**

```text
Compra: 8 €
Participante: Ana

Ana → 8 €
```

**Compra para varios usuarios**

```text
Compra: 15 €
Participantes: Ana, Carlos y Laura

15 € / 3 = 5 € por persona
```

Esto permite obtener un cálculo más preciso de los gastos individuales.

### 📊 Resumen de gastos

Los usuarios podrán consultar:

* Gastos individuales.
* Gastos compartidos.
* Gastos totales del grupo.
* Gastos realizados durante un periodo determinado.
* Balance entre los miembros del grupo.
* Cantidad que cada persona debe pagar o recibir.

---

## 🗓️ Periodos de liquidación

Una de las funcionalidades principales de **By Me Too!/Comprame!** es la posibilidad de consultar y cerrar los gastos correspondientes a diferentes periodos.

Por ejemplo:

* 📅 Semanal
* 📅 Mensual
* 📅 Personalizado

Al finalizar un periodo, el sistema puede generar un resumen con el balance de cada miembro.

---

## 🏗️ Arquitectura

El proyecto sigue una arquitectura organizada por capas para facilitar el mantenimiento, la escalabilidad y la separación de responsabilidades.

```text
┌──────────────────────────┐
│       Presentación       │
│        UI / UX           │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│       Lógica de          │
│       aplicación         │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│       Acceso a datos     │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│        Base de datos     │
└──────────────────────────┘
```

La arquitectura definitiva y las tecnologías utilizadas pueden evolucionar durante el desarrollo del proyecto.

---

## 🛠️ Tecnologías

Las tecnologías utilizadas en el proyecto incluyen:

* **Lenguaje:** Java[Dart opcional]
* **IDE:** Apache NetBeans 30
* **Control de versiones:** Git
* **Repositorio:** GitHub
* **Metodología:** Scrum
* **Base de datos:** Firebase [No es decisión final]
* **Diseño:** Figma/Draw.io/JavaSwing

> Esta sección se actualizará conforme avance el desarrollo del proyecto.

---

## 🌿 Git y flujo de trabajo

Para mantener una organización adecuada del código utilizamos Git y GitHub.

Las ramas principales del proyecto son:

```text
main
 ├── siarhei-branch
 ├── pablo-branch
 ├── roberto-branch
 └── elias-branch
```

### Convención de ramas

* `main` — versión estable del proyecto.

Los cambios se integran mediante **Pull Requests**, permitiendo revisar el código antes de incorporarlo a la rama correspondiente.

---

## 📋 Estado del proyecto

El proyecto se encuentra actualmente en desarrollo.

### Roadmap

* [x] Definición de la idea del proyecto
* [x] Definición de los requisitos iniciales
* [x] Creación del repositorio
* [x] Organización del equipo
* [ ] Diseño de la interfaz
* [ ] Sistema de usuarios
* [ ] Creación de grupos
* [ ] Gestión de compras
* [ ] Gestión de productos personales y compartidos
* [ ] Cálculo automático de gastos
* [ ] Resumen semanal/mensual
* [ ] Sistema de liquidación
* [ ] Pruebas
* [ ] Documentación
* [ ] Versión final

---

## 🎓 Contexto académico

Este proyecto se desarrolla como parte del **Trabajo de Fin de Grado (TFG) del ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM)**.

Además del desarrollo de la aplicación, el proyecto tiene como objetivo poner en práctica los conocimientos adquiridos durante el ciclo, incluyendo:

* Desarrollo de aplicaciones móviles.
* Diseño de interfaces.
* Bases de datos.
* Programación orientada a objetos.
* Arquitectura de software.
* Control de versiones.
* Testing.
* Trabajo colaborativo.
* Gestión de proyectos mediante metodologías ágiles.
* Documentación técnica.

---
