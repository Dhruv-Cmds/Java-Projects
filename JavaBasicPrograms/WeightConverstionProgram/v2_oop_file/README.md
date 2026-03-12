WeightConversionProgram (OOP Version)
📌 Description

WeightConversionProgram is a console-based Java application that converts weight values between kilograms (kg) and pounds (lbs).
The program is built using multiple classes to demonstrate Object-Oriented Programming (OOP) principles such as separation of concerns and reusability.

🚀 Features

Convert lbs → kgs

Convert kgs → lbs

Menu-driven console interface

Uses multiple classes for clean structure

Beginner-friendly and easy to understand

Demonstrates real OOP design

🧠 OOP Design (Multiple Classes)

The program is divided into three main classes, each with a clear responsibility:

ContactManager.v1_oop.Main

Handles user interaction

Displays menu options

Takes input from the user

Calls conversion methods from other classes

Kgs

Contains logic to convert kilograms to pounds

Focuses only on calculation (single responsibility)

Lbs

Contains logic to convert pounds to kilograms

Focuses only on calculation (single responsibility)

This separation makes the program:

Easier to read

Easier to maintain

Easier to extend (adding more units later)

🛠 Technologies Used

Java

Object-Oriented Programming (OOP)

Console Input/Output (Scanner)

Packages

▶️ How to Compile and Run

Make sure you are in the project root directory.

Compile
javac WeightConverstionProgram/v2_oop_file/*.java
Run
java WeightConverstionProgram.v2_oop_file.ContactManager.v1_oop.Main

📂 Project Structure:

WeightConversionProgram/
│
├── README.md
│
├── v1_basic/
│   ├── ContactManager.v1_oop.Main.java
│   └── README.md
│
├── v2_oop/
│   ├── ContactManager.v1_oop.Main.java
│   ├── Kgs.java
│   ├── Lbs.java
│   └── README.md
│
└── screenshots/
├── v1_output.png
└── v2_output.png