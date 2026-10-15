# Clase 01 – Interfaz con Jetpack Compose

Primera aplicación Android del programa **ADSO – SENA**, desarrollada en **Kotlin** con **Jetpack Compose**.

**Autor:** Luis Alejandro Londoño Valle

## Estructura del proyecto

```
com.sena.clase_01
├── MainActivity.kt          → Punto de entrada de la app
└── ui
    ├── screen
    │   └── Home.kt          → Pantalla principal: ordena las secciones
    ├── section
    │   ├── Header.kt        → Encabezado con el nombre
    │   ├── Body.kt          → Cuerpo con las tres cajas de colores
    │   └── Footer.kt        → Pie con los textos ADSO y SENA
    ├── composable
    │   ├── PrimaryText.kt   → Texto principal reutilizable
    │   ├── SecondaryText.kt → Texto secundario reutilizable
    │   └── ColorBox.kt      → Caja de color reutilizable
    └── theme                → Colores, tipografía y tema de la app
```

## Lógica de las carpetas

| Carpeta | Responsabilidad |
|---|---|
| `composable` | Piezas pequeñas y genéricas que se pueden reutilizar en cualquier parte. |
| `section` | Zonas grandes de la pantalla, armadas con los componentes de `composable`. |
| `screen` | Pantallas completas que deciden el orden de las secciones. |
| `MainActivity` | Solo inicia la app: aplica el tema, el `Scaffold` y llama a `Home`. |

Flujo de llamadas:

```
MainActivity → Home → Header / Body / Footer → PrimaryText / ColorBox / SecondaryText
```

Cada archivo tiene **una sola responsabilidad** y se llama igual que la función que contiene.

## Conceptos aplicados

- **Funciones `@Composable`** para construir la interfaz con código.
- **Layouts:** `Surface`, `Column`, `Row` y `Box`.
- **Modificadores:** `fillMaxSize`, `fillMaxWidth`, `height`, `size`, `padding`, `background` y `weight`.
- **Alineación y distribución:** `Alignment.Center`, `Arrangement.SpaceEvenly`, `Arrangement.SpaceAround` y `Arrangement.spacedBy`.
- **Parámetros:** los componentes reciben datos desde afuera, por ejemplo:

```kotlin
PrimaryText(text = "Luis Alejandro Londoño Valle")
ColorBox(color = Color.Red)
SecondaryText(text = "ADSO")
```

## Requisitos

- Android Studio
- SDK mínimo según la configuración del proyecto
- Emulador o dispositivo Android (probado en Pixel 4, API 30)

## Ejecución

1. Abrir el proyecto en Android Studio.
2. Esperar a que Gradle termine de sincronizar.
3. Seleccionar un emulador o dispositivo.
4. Presionar **Run ▶**.
