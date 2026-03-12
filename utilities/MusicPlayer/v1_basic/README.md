# 🎵 Java Console Music Player

A simple **Java console-based music player** built using the `javax.sound.sampled.Clip` API.

This project demonstrates basic audio controls such as:
- Play / Pause
- Skip forward
- Skip backward
- Reset
- Next track (playlist)

It is designed as a **beginner-friendly Java project** to understand file handling, user input, loops, and audio playback.

---

## ✨ Features

- Play and pause music
- Skip forward and backward by 10 seconds
- Reset current track
- Switch between multiple tracks (playlist)
- Console-based menu interface
- Uses WAV audio files

---

## 📁 Project Structure
utilities/
└── MusicPlayer/
├── ContactManager.v1_oop.Main.java
├── track1.wav
├── track2.wav
├── track3.wav
├── track4.wav
└── track5.wav


> ⚠️ Audio files may not be included in this repository.  
> Please add your own WAV files as explained below.

---

## ▶️ How to Run
```bash

1️⃣ Add audio files

Add 5 WAV files to this folder:
utilities/MusicPlayer/

Rename them exactly to:-

track1.wav
track2.wav
track3.wav
track4.wav
track5.wav

Only .wav files are supported.

2️⃣Compile the program:-

From the root of the project:
javac utilities/MusicPlayer/ContactManager.v1_oop.Main.java

3️⃣ Run the program:-
java -cp utilities MusicPlayer.ContactManager.v1_oop.Main

🎵 Audio License Note:-

This project does not claim ownership of any music.
For demonstration purposes:
You may use your own audio files
Or use music from the YouTube Audio Library (royalty-free)
Audio files are excluded to avoid copyright issues.

🛠️ Technologies Used:-

Java
javax.sound.sampled.Clip
Scanner (console input)

📌 Notes:-

This project uses relative file paths, so it works across different systems.
Absolute file paths are intentionally avoided for portability.
Designed for learning purposes.

