# DKA12132026 - Java Programming Course

A collection of Java programming exercises organized by topic for better learning and reference.

## Project Structure

```
DKA12132026/
├── src/                    # Organized source files
│   ├── basics/            # Basic I/O, variables, data types, type casting
│   ├── arrays/            # Single and multi-dimensional arrays
│   ├── conditionals/      # if-else, switch statements
│   ├── loops/             # for, while, do-while loops
│   ├── methods/           # Methods with parameters and return values
│   └── oop/               # Object-Oriented Programming concepts
├── bin/                   # Compiled .class files (auto-generated)
├── [legacy folders]/      # Original unorganized files (math, latihan, etc.)
└── README.md              # This file
```

## Categories

### 📚 Basics (`src/basics/`)
- **Welcome.java** - Simple "Hello World" style program
- **TypeCastingImplicit.java** - Automatic type conversion examples
- **TypeCastingExplicit.java** - Manual type conversion examples
- **ArrayBulan.java** - Array of months with days

### 🔢 Arrays (`src/arrays/`)
- **ArrayInput.java** - User input for array elements
- **TwoDimensionArray.java** - 2D array declaration and traversal
- **TwoDimensionInput.java** - 2D array with user input (Name, Class, CGPA)
- **ArrayGenapGanjil.java** - Separate even and odd numbers
- **CgpaArray.java** - 2D CGPA array example
- And more array practice files...

### 🔀 Conditionals (`src/conditionals/`)
- **GenapGanjil.java** - Check even/odd numbers
- **LulusGagal.java** - Pass/fail based on marks
- **LevelKemahiran.java** - Skill level selection (Beginner/Intermediate/Expert)
- **TahunLompat.java** - Leap year checker
- **TempahanHotel.java** - Hotel room booking system
- **KategoriUmur.java** - Age categorization (Junior/Belia/Dewasa/Warga Emas)
- **MarkahGred.java** - Grade evaluation (A/B/C/D/E)
- **DermaDarahKelayakan.java** - Blood donation eligibility
- And more conditional practice files...

### 🔄 Loops (`src/loops/`)
- **LoopContoh.java** - Basic for loop examples
- **WhileContoh.java** - While loop demonstration
- **DoWhileContoh.java** - Do-while loop demonstration
- **ForNested.java** - Nested for loops
- **NomborMenurun.java** - Counting down numbers
- **JumlahTo100.java** - Sum numbers from 1 to 100
- **SistemMarkah.java** - Complete marks analysis system
- And more loop practice files...

### ⚙️ Methods (`src/methods/`)
- **KuasaDuaMethod.java** - Method to calculate square of a number
- **PengiraanSegiEmpat.java** - Calculate area and perimeter using methods
- **JumlahMethod.java** - Addition method with parameters
- **KiraLuasBulatan.java** - Circle area calculation method
- **AreaCircleWithReturn.java** - Method with return value
- **AreaCircleVoid.java** - Void method example
- And more method practice files...

### 🎯 OOP (`src/oop/`)
- **AqilsBurgers.java** - Complete burger ordering system with classes
- **PelajarInfo.java** - Student information display
- **NiceDays.java** - Simple class example

## How to Compile and Run

### Compile a single file:
```bash
javac src/basics/Welcome.java
```

### Run a compiled class:
```bash
java -cp src basics.Welcome
```

### Or compile and run from the src directory:
```bash
cd src
javac basics/Welcome.java
java basics.Welcome
```

## Naming Conventions Used

All files follow Java naming conventions:
- **Class names**: PascalCase (e.g., `TypeCastingImplicit`)
- **File names**: Match class names exactly
- **Methods**: camelCase (e.g., `kiraLuas`, `paparMenu`)
- **Variables**: camelCase (e.g., `jumlah`, `hargaBilik`)

## Notes

- The original unorganized files are kept in their respective folders (`math/`, `latihan/`, `looptrain/`, etc.) for reference
- Package declarations have been removed from `src/` files for simpler compilation
- Some files contain both Malay and English comments as per original author's preference

## Author

Original code by students of 1 DVM IPD 2026
Reorganized for better maintainability and learning
