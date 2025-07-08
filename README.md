# 🎂 Age & Birthday Calculator

A console-based Java application that allows users to input their birth date and receive a variety of time-related information, including their exact age, total days lived, and how many days remain until their next birthday.

---

## 📌 Features

- Accepts birth date in the format `YYYY/MM/DD`
- Handles invalid date formats with friendly messages
- Options available:
    - ✅ Age in full years
    - 📆 Exact age (years, months, days)
    - 📅 Day of the week you were born
    - 🔢 Total days lived
    - ⏳ Days until the next birthday
    - 🎉 Birthday checker for today

---

## 🧪 Example

```
Enter your birth date (YYYY/MM/DD):
2004/08/02

🎉 Happy Birthday!

Select a option:
1. Show age in years.        4. Show days lived.
2. Show full age.            5. Show days until next birthday.
3. Show birth day of week.   6. Close program.
2

You are 21 years, 0 months, and 0 days old.
```

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- IDE or terminal

### Running the Project

1. Clone the repository or copy the source files
2. Ensure you have the following structure:
```
project-root/
│
├── classes/
│   ├── Person.java
│   └── AgeCalculator.java
│
└── main/
    └── Main.java
```

3. Compile and run the `Main` class:
```
javac main/Main.java classes/Person.java classes/AgeCalculator.java
java main.Main
```

---

## 🛠️ Technologies Used

- Java java.time API (LocalDate, Period, DateTimeFormatter)
- Object-Oriented Programming (OOP)
- Input validation using try-catch blocks

---

## 📂 Project Structure

```
project-root/
│
├── classes/
│   ├── Person.java           # Stores birth date information
│   └── AgeCalculator.java    # Handles all age/birthday calculations
│
└── main/
    └── Main.java             # Entry point and user interaction
```

---

## ✅ Future Improvements

- Add unit tests using JUnit
- GUI version using Java Swing or JavaFX
- Support multiple date formats (e.g., YYYY-MM-DD or DD/MM/YYYY)
- Export results to a .txt or .json file

---

## 📄 License

This project is open source and free to use for learning or personal development.