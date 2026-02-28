📌 Overview

This project simulates a basic banking system that allows users to:

💰 View account balance

➕ Deposit money

➖ Withdraw money

🚪 Exit the application safely

The system is designed using multiple classes to promote better organization, scalability, and readability.


🏗 Project Structure

The application follows an object-oriented design approach.

Banking/
│
├── Main.java
├── Deposit.java
├── Withdraw.java
├── ShowBalance.java
└── Account.java

🔹 Class Responsibilities

Main.java
Entry point of the program

Displays menu
Handles user interaction

Account.java
Stores account balance

Central model class
Deposit.java

Handles deposit logic
Validates positive amounts

Withdraw.java
Handles withdrawal logic

Prevents overdrawing
ShowBalance.java

Displays current account balance

🛠 Tech Stack

Java

Scanner (for user input)

Loops

Switch statements

Object-Oriented Programming (OOP)

▶️ How to Run
1️⃣ Compile the program

javac Bankig/*.java
2️⃣ Run the application
java Bankig.Main

🔒 Validation & Error Handling

The application includes:

✅ Prevention of negative deposits

✅ Protection against insufficient balance withdrawals

✅ Handling of invalid menu selections

✅ Safe program exit

🎯 Key Concepts Demonstrated

Object-Oriented Programming

Class separation & responsibility

Input validation

Console-based UI design

Clean modular structure