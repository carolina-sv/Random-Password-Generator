# 🔐 Random Password Generator

A simple and customizable Java-based random password generator. This console application allows users to create strong passwords based on their preferences (length, character types, etc.).

## 🚀 Features

- Customizable password length  
- Option to include:
  - ✅ Uppercase letters (A–Z)
  - ✅ Lowercase letters (a–z)
  - ✅ Numbers (0–9)
  - ✅ Special symbols (!@#$...)
- Instant password generation in the terminal
- Simple and easy to use

## 📂 Project Structure

```
RandomPasswordGenerator/
├── src/
│   └── PasswordGenerator.java   ← Source code
├── bin/                         ← Compiled classes (auto-generated)
└── README.md                    ← Project documentation
```

## 🛠️ How to Run

> 💡 Make sure you have Java installed (JDK 8 or higher).

1. Open your terminal and navigate to the project folder.

2. Compile the source file:
   ```bash
   javac src/PasswordGenerator.java -d bin
   ```

3. Run the compiled program:
   ```bash
   java -cp bin PasswordGenerator
   ```

## 💡 Example

```
How many characters? 12
Include uppercase letters? (y/n): y
Include lowercase letters? (y/n): y
Include numbers? (y/n): y
Include symbols? (y/n): n
Generated Password: aK8mdP9LqZw3
```

## 📋 To-Do (Optional Ideas)

- [ ] Add password strength meter
- [ ] Export password to a file
- [ ] GUI version using Swing or JavaFX
- [ ] Option to copy password to clipboard

## 📄 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

---

Made with 💻 by Carolina Viana
