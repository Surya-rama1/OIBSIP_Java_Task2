# OIBSIP Java Development - Number Guessing Game

# Internship

**Oasis Infobyte Internship Program (OIBSIP)**

# Domain

**Java Development**

# Task

**Number Guessing Game**

# Project Overview

The Number Guessing Game is a Java-based console application in which the computer generates a random number and the player attempts to guess it.

The application provides hints to the player after each guess, indicating whether the entered number is higher or lower than the generated number. The game continues until the player guesses the correct number.

This project demonstrates fundamental Java programming concepts such as variables, conditional statements, loops, user input, random number generation, and methods.

## Objective

The main objective of this project is to develop a simple and interactive Number Guessing Game using Java.

The project helps demonstrate logical thinking and practical implementation of core Java programming concepts.

## Technologies Used

* Java
* Java Random Class
* Java Scanner Class
* Object-Oriented Programming Concepts
* Visual Studio Code
* Git
* GitHub

# Features

* Generates a random number.
* Allows the user to enter guesses.
* Provides hints when the guess is too high or too low.
* Checks whether the user's guess is correct.
* Counts the number of attempts.
* Displays the final result.
* Allows the player to play the game again.
* Provides an interactive console-based experience.

# How the Game Works

1. The program starts the Number Guessing Game.
2. The computer generates a random number within a specified range.
3. The player enters a number as their guess.
4. The program compares the entered number with the generated number.
5. If the guess is lower than the generated number, the program displays a **"Too Low"** message.
6. If the guess is higher, the program displays a **"Too High"** message.
7. The player continues guessing until the correct number is found.
8. The number of attempts is displayed.
9. The player can choose whether to play another round.

# Game Flow

Generate Random Number
  ↓
Ask User for Guess
  ↓
Compare Guess with Number
  ↓
 ┌───────────────┐
 │               │
Too Low       Too High
 │               │
 └───────┬───────┘
         ↓
    Try Again
         ↓
Correct Guess
         ↓
Display Result
         ↓
Play Again?
    ↓         ↓
   Yes        No
    ↓         ↓
New Game      End

# Project Structure

OIBSIP_Java_Task2/
│
├── src/
│   └── NumberGuessingGame.java
│
├── screenshots/
│   ├── game-start.png
│   ├── guessing.png
│   └── game-result.png
│
├── documentation/
│   └── Number_Guessing_Game_Documentation.pdf
│
├── report/
│   └── OIBSIP_Task2_Report.pdf
│
├── README.md
│
└── .gitignore

# Requirements

## Software Requirements

* Java JDK 8 or later
* Visual Studio Code
* Java Extension Pack for VS Code
* Git
* GitHub account

## Hardware Requirements

* Computer or laptop
* Minimum 4 GB RAM
* Keyboard
* Sufficient storage space

## How to Run the Project

# Step 1: Open the Project

Open the project folder in Visual Studio Code.

## Step 2: Open the Terminal

In VS Code, select:
Terminal → New Terminal

## Step 3: Compile the Program

If your Java file is inside the `src` folder, use:
javac src/NumberGuessingGame.java

## Step 4: Run the Program

java -cp src NumberGuessingGame

# Concepts Used

This project demonstrates the following Java concepts:

* Variables
* Data Types
* `Scanner`
* `Random`
* `if-else` statements
* `while`/`for` loops
* Methods
* User input
* Conditional logic
* Random number generation
* Exception handling, if implemented
* Basic Object-Oriented Programming

# Learning Outcomes

By completing this project, I gained practical experience in:

* Java programming
* Problem-solving and logical thinking
* Random number generation
* Taking user input
* Using loops and conditional statements
* Building console-based applications
* Debugging Java programs
* Using VS Code for Java development
* Using Git and GitHub for version control
* Preparing project documentation

# Future Enhancements

The project can be enhanced by adding:

* Different difficulty levels
* Limited number of attempts
* Score calculation
* High-score tracking
* Multiple rounds
* Graphical User Interface (GUI)
* Player name and score storage
* Database integration

# Conclusion

The Number Guessing Game is a simple Java application that provides an interactive way to practice fundamental programming concepts.

The project successfully demonstrates random number generation, user input, conditional statements, loops, and basic game logic. It also provides practical experience in developing and managing a Java project using Visual Studio Code, Git, and GitHub.

# Author

**Krishna Reddy**

**Java Development Intern - OIBSIP**
