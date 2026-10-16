# Curso Java Swing

![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apachenetbeanside&logoColor=white)
![Ant](https://img.shields.io/badge/Build-Ant-A81C7D?style=for-the-badge&logo=apacheant&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

![Estado](https://img.shields.io/badge/Estado-En%20progreso-yellow?style=flat-square)
![Módulos](https://img.shields.io/badge/Módulos-14-blue?style=flat-square)
![Última%20actualización](https://img.shields.io/badge/Actualizado-2026-orange?style=flat-square)

Colección de proyectos progresivos para aprender **Java Swing** desde cero hasta
interfaces complejas. Cada carpeta (`Swing-01` … `Swing-15`) es un proyecto
independiente de **NetBeans** que introduce un concepto nuevo, construyendo sobre
el anterior.

---

## Contenido del curso

| Proyecto | Concepto | Descripción |
|:--------:|:---------|:------------|
| [Swing-01](Swing-01) | Hello World | Primera ventana con `JFrame` |
| [Swing-02](Swing-02) | JFrame | Creación de frames por herencia y composición |
| [Swing-03](Swing-03) | JPanel | Contenedores y organización interna |
| [Swing-04](Swing-04) | BorderLayout | Distribución Norte/Sur/Este/Oeste/Centro |
| [Swing-05](Swing-05) | FlowLayout | Distribución secuencial en línea |
| [Swing-06](Swing-06) | GridLayout | Distribución en cuadrícula |
| [Swing-07](Swing-07) | JButton | Botones con iconos (`save.png`, `print.png`) |
| [Swing-08](Swing-08) | JLabel | Etiquetas e imágenes (`logo.png`) |
| Swing-09 | — | (no incluido) |
| [Swing-10](Swing-10) | ActionListener | Manejo de eventos de acción |
| [Swing-11](Swing-11) | Nimbus Look & Feel | Personalización del tema visual |
| [Swing-12](Swing-12) | MigLayout | Layout externo avanzado |
| [Swing-13](Swing-13) | JPasswordField | Campos de contraseña |
| [Swing-14](Swing-14) | JMenu | Menús y barra de menú |
| [Swing-15](Swing-15) | JCheckBox | Casillas de verificación |

> La numeración coincide con el historial de commits del repositorio; cada
> `Swing-XX` corresponde a una lección.

---

## Requisitos

![JDK](https://img.shields.io/badge/JDK-16%2B-red?style=flat-square&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=flat-square)
![Ant](https://img.shields.io/badge/Ant-1.10%2B-A81C7D?style=flat-square)

- **JDK 16 o superior** (el proyecto se compila con `javac.source=26`).
- **Apache NetBeans** o cualquier IDE compatible con proyectos Ant.
- **Apache Ant** si prefieres compilar desde la terminal.

---

## Estructura del repositorio

```
CURSO_SWING/
├── Swing-01/          # Proyecto independiente
│   ├── src/com/jarod/ # Código fuente (Launcher + MainFrame)
│   ├── nbproject/     # Configuración de NetBeans
│   ├── build.xml      # Script de compilación Ant
│   └── test/          # Pruebas
├── Swing-02/
├── ...
└── Swing-15/
```

---

## Uso

### Desde NetBeans

1. `File` → `Open Project`.
2. Selecciona cualquiera de las carpetas `Swing-XX`.
3. Pulsa **Run** (`F6`).

### Desde la terminal (Ant)

```bash
cd Swing-15
ant run
```

### Ejecutar manualmente

Cada módulo tiene un `Launcher` (o clase principal) como punto de entrada:

```bash
java -cp build/classes com.jarod.Launcher
```

---

## Tecnologías

![Java Swing](https://img.shields.io/badge/Swing-javax.swing-007396?style=flat-square)
![AWT](https://img.shields.io/badge/AWT-java.awt-007396?style=flat-square)
![MigLayout](https://img.shields.io/badge/MigLayout-5.x-4B8BBE?style=flat-square)

- **Java Swing** — componentes de interfaz gráfica.
- **Java AWT** — layout managers base (`Border`, `Flow`, `Grid`).
- **MigLayout** — librería externa incluida en `Swing-12/libs/miglayout`.

---

## Autor

**Jarod** — [@jarodsmdev](https://github.com/jarodsmdev)

![GitHub](https://img.shields.io/badge/GitHub-jarodsmdev-181717?style=flat-square&logo=github&logoColor=white)

## Licencia

Distribuido bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más
información.

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)
