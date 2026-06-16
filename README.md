# Guess the Number

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

A simple command-line number guessing game built with Java to practice programming logic, loops, conditional structures, and input handling.

---

## 🎮 About

The computer selects a random number between **1 and 50**, and the player has **7 attempts** to guess it. After each guess, the game tells if the secret number is higher or lower.

### Quick Access
* **Source Code:** [`src/GuessingGame.java`](src/GuessingGame.java) 📄

## Concepts Applied

* **Loops (`while`):** Controls the game flow and guess repetitions.
* **Conditionals (`if / else if`):** Compares guesses and provides higher/lower hints.
* **Variables & State:** Tracks attempts and game-won status via booleans.
* **Input/Output:** Handled using `java.util.Scanner` and terminal outputs.
* **Math:** Random number generation using `Math.random()` with type casting.

## Prerequisites
* Java Development Kit (JDK) 8 or higher.

## How to Run

Open your terminal and run the following commands:

1. **Compile** the file:
```bash
javac src/GuessingGame.java

```

2. **Run** the game:
```bash
java -cp src GuessingGame
```
