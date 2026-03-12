# 🎲 Java Dice Roller

A simple and fun console-based dice rolling simulator built with Java.  
Roll one die or roll ten. Let randomness decide your fate.

---

## ✨ Features

- 🎲 Roll any number of dice
- 🔢 Random results between 1 and 6
- 🖨️ ASCII art dice display
- ➕ Automatic total calculation
- 💾 File saving using Java I/O
- 📜 View previous roll history
- ⚠️ Input validation for invalid dice count

---

## 🛠 Tech Stack

- Java
- Object-Oriented Programming (OOP)
- `Random` class
- `Scanner` for user input
- `BufferedWriter` / `BufferedReader`
- File handling (Java I/O)
- Loops & switch expressions
- Text blocks for ASCII art

---

## 📁 Project Structure

```
DiceRoller.v2_oop_file
│
├── ContactManager.v1_oop.Main.java
├── DiceGame.java
├── Die.java
├── DicePrinter.java
└── FileManager.java
```

---

## ▶️ How to Run

1. Compile the project:

```
javac DiceRoller/v1_basic/*.java
```

2. Run the program:

```
java DiceRoller.v1_basic.ContactManager.v1_oop.Main
```

---

## 📌 Example Output

```
1. Roll Dice
2. View History
Choose option: 1

Enter the # of dice to roll: 2

---------
|●     ●|
|       |
|●     ●|
---------

You rolled: 4

---------
|   ●   |
|       |
|   ●   |
---------

You rolled: 1

Total: 5
```

---

## 📜 Example History File (dice_history.txt)

```
Roll 1: 4
Roll 2: 1
Total: 5
Time: 2026-02-27T18:42:11.512
-----------------------------
```

---

## 🎯 What This Project Demonstrates

- Clean multi-class structure
- Separation of responsibilities
- File handling with Java I/O
- Console-based user interaction
- Beginner-friendly OOP design

---