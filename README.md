// [Project Files Here - unchanged for brevity]

// File: README.md
# Task Book Library

A simple Java-based library system where teachers and students can borrow books using different priority rules.

## 📚 Project Structure
```
task-book-library/
├── model/                  # Core domain models
├── service/                # Business logic (priority & non-priority libraries)
├── test/                   # JUnit test cases
├── Main.java               # Entry point to demonstrate usage
└── README.md               # Project documentation
```

## 🧠 Features
### ✅ Implementation 1: Priority-Based
- Teachers are prioritized over students
- Senior students are prioritized over junior students
- Among same level, requests are FIFO

### ✅ Implementation 2: FIFO-Based
- Books are borrowed in the exact order requests are received

## 🧪 Tests
- Unit tests for both implementations
- Ensures borrowing rules work as expected
- Uses JUnit 5

## ▶️ How to Run
### Run Main Class:
Compile and run `Main.java`:
```bash
javac -d out src/**/*.java Main.java
java -cp out Main
```

### Run Tests:
Use any Java IDE with JUnit 5 support or run via CLI:
```bash
javac -cp .:junit-platform-console-standalone-1.8.0.jar -d out test/**/*.java
java -jar junit-platform-console-standalone-1.8.0.jar --class-path out --scan-classpath
```

## 🧱 Concepts Used
- Encapsulation
- Inheritance & Polymorphism
- Abstraction & Composition
- Generics & Collections (Map, Queue, PriorityQueue)
- Exception handling
- TDD (Test-Driven Development)

## 👨‍🏫 Authors
- Idris Adejumo (Java Developer)

## 📜 License
This project is licensed under the MIT License.
