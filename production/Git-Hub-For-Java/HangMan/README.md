# 🎮 Hangman Game (Java)

A simple console-based **Hangman game** written in Java.  
The program randomly selects a word from a file and allows the player to guess letters with a limited number of mistakes.

This project focuses on:

- File handling
- Collections
- Control flow
- Basic game logic
- Clean console interaction

---

## 📌 Features

- Reads words from an external text file (`words.txt`)
- Random word selection
- ASCII-art Hangman display
- Tracks wrong guesses (up to 6)
- Win and lose conditions
- Case-insensitive input

---

## 📂 Project Structure

games/
├─ HangMan/
│ ├─ Main.java
│ └─ words.txt
└─ README.md


---

## ▶️ How to Run

### 1. Compile
From the **project root directory** (`nuke2`):

```bash
javac HangMan/Main.java
java HangMan.Main

📄 words.txt Format:-

- Place words.txt inside the HangMan folder
- One word per line
- No special formatting required

Example:-
apple
orange
.
.
.
.

🧠 How the Game Works:-

- The program loads words from words.txt
- A random word is selected
- The player guesses one letter at a time
- Correct guesses reveal letters
- Incorrect guesses add to the hangman
- The game ends when:
- The word is fully guessed (Win)
- 6 wrong guesses are made (Game Over)

⚠️ Notes:-

- The program uses relative file paths
- words.txt must exist and must not be empty
- Java searches for files relative to where the program is executed, not where the class is located

🛠️ Technologies Used:-

- Java
- ArrayList
- Random
- Scanner
- BufferedReader