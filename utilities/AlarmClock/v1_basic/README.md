# ⏰ Java Alarm Clock

A simple **Java console-based alarm clock** that lets users set a time and plays an audio alarm when the time is reached.  
The alarm continuously plays a sound until the user presses **Enter** to stop it.

---

## ✨ Features

- Set alarm using `HH:mm:ss` (24-hour format)
- Live digital clock display in the console
- Prevents alarms from being set in the past
- Plays `.wav` audio files using Java Sound API
- Alarm loops continuously until stopped by the user
- Runs on a separate thread using `Runnable`

---

## 🛠 Technologies Used

- Java (JDK 8+)
- `java.time.LocalTime`
- Java Sound API (`Clip`, `AudioInputStream`)
- Multithreading (`Runnable`, `Thread`)
- Console input with `Scanner`

---

## 📂 Project Structure
Git-Hub-For-Java/
└── utilities/
└── AlarmClock/
├── AlarmClock.java // Alarm logic & sound playback
├── Main.java // User input & program entry point
└── README.md


---

## ▶ How It Works

1. User enters an alarm time in `HH:mm:ss` format
2. Program validates the format and checks that the time is in the future
3. A live clock updates every second in the console
4. When the alarm time is reached:
   - Sound starts playing in a loop
   - User presses **Enter** to stop the alarm

---

## 🚫 Past Time Protection

If the user enters a time that has already passed, the program:

- Displays a warning
- Does **not** start the alarm
- Prompts the user to enter a new valid time

---

## 🎵 Audio File Requirements

- Format: `.wav`
- Must be a supported audio format by Java Sound API
- Update the file path in `Main.java`:

```java
String filepath = "C:\\path\\to\\your\\alarm.wav";

▶ How to Run

Compile the program:

javac Main.java AlarmClock.java

Run the program:

java Main

Enter alarm time when prompted:

Enter an alarm time (HH:MM:SS):

🧪 Example Output
Enter an alarm time (HH:MM:SS): 23:30:00
Alarm set for 23:30
23:29:58
23:29:59
23:30:00

*ALARM NOISES*
Press Enter to stop the alarm:

⚠ Notes

This alarm works for the same day only

Past times are rejected instead of rolling to the next day

Console-based UI (no GUI)