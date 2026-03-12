# 🎮 Hangman Game (Java)

A simple **console-based Hangman game** written in Java using clean object-oriented design.

The game randomly selects a word from a text file and allows the player to guess letters with a limited number of wrong attempts.

---

## ✨ Features

- Random word selection from `words.txt`
- Case-insensitive letter guessing
- ASCII Hangman display
- Maximum 6 wrong guesses
- Win / Game Over conditions
- Clean multi-class structure

---

## 📁 Project Structure

games/
└─ HangMan/
├─ README.md
├─ screenshots/
│
├─ v1_basic/
│  ├─ ContactManager.v1_oop.Main.java
│  ├─ words.txt
│  └─ README.md
│
└─ v2_oop_file/
    ├─ ContactManager.v1_oop.Main.java
    ├─ Game.java
    ├─ WordLoader.java
    ├─ HangmanArt.java
    ├─ words.txt
    └─ README.md


---

## ▶️ How to Run

1. Make sure you are in the **project root directory**
2. Compile the program:

```bash
javac HangMan/v2_oop_file/ContactManager.v1_oop.Main.java
java HangMan.v2_oop_file.ContactManager.v1_oop.Main

📄 words.txt Format

Location: HangMan/v2_oop_file/words.txt

One word per line

No spaces inside words

Example:

apple
banana
computer
java
hangman

🧠 How the Game Works

Words are loaded from words.txt

One word is selected randomly

Player guesses one letter at a time

Correct guesses reveal letters

Wrong guesses draw the hangman

Game ends when:

All letters are guessed (Win)

6 wrong guesses occur (Game Over)

⚠️ Notes

words.txt must exist and must not be empty

File paths are relative to where the program is executed

Input must be a single alphabet character