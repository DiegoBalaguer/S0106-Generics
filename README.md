# S01.06 - Generics

---

## 📋 Description

This project contains a set of Java exercises focused on the use of **Generics**, structured across multiple levels.

Each exercise is designed to be executed using **Eclipse** or **IntelliJ IDEA**, following the best practices defined in **Sprint 0**.

Projects can be implemented using **Maven**, **Gradle**, or as **plain Java projects**.

All code must be written in **English**.

---

# 🎯 Objectives

- Learn how to use and manage **Generics** in Java.
- Understand the behavior of **generic methods**, **wildcards**, and **bounded type parameters**.
- Practice abstraction and code reusability using generic classes and interfaces.
- Apply type constraints to generic methods.

---

## 🔹 Level 1

### 📘 Exercise 1 - NoGenericMethods

Create a class called `NoGenericMethods` that stores three arguments of the same type, along with methods to store and retrieve these objects. Include a constructor to initialize all three.

Make sure the arguments can be placed in any position during the constructor call.

---

### 📘 Exercise 2 - GenericMethods with Mixed Types

1. Create a class called `Persona` with the attributes: `name`, `surname`, and `age`.
2. Then create a class called `GenericMethods` with a **generic method** that accepts three arguments of **generic type**.
3. This method should **print each argument to the console**.

In the `main()` method of the principal class, call the generic method with **different types** of arguments, for example:
- An object of type `Persona`
- A `String`
- A **primitive type**

This proves that the method accepts any type in any order.

---

## 🔹 Level 2

### 📘 Exercise 1 - One Non-Generic Argument

Modify the previous exercise so that **one of the arguments** in the generic method is **not generic**.

---

### 📘 Exercise 2 - Variable-Length Generic Arguments

Adapt the previous method so it accepts a **list of variable-length arguments** (varargs) of **unknown types** using **wildcards**.

---

## 🔹 Level 3

### 📘 Exercise 1 - Bounded Generics with Interface and Class

For this exercise, create an interface and three classes:

- **Interface**: `Telefon` with a method `call()`
- **Class**: `Smartphone`, which implements `Telefon` and adds a method `takePhotos()`
- **Class**: `Generica` with two **bounded generic methods**:
  - The first accepts an argument bounded by the `Telefon` interface.
  - The second accepts an argument bounded by the `Smartphone` class.
  - Inside each method, call the appropriate methods from `Telefon` or `Smartphone`.

In the `main()` method of the class `Principal`, create an instance of `Smartphone` and pass it to both generic methods in the `Generica` class.

⚠️ **Note**: Can the method bounded by the `Telefon` interface call `takePhotos()`?

---

# 🛠️ Technologies Used

- Java 21
- Generics
- Type Inference
- Bounded Type Parameters
- Wildcards
- Interfaces and Classes

---

## ⚙️ Installation & Execution

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- Eclipse or IntelliJ IDEA
- Git

---

# 🛠️ Installation

1. Ensure **JDK 21** or higher is installed.
2. Clone this repository:
   ```sh
   git clone <👉 https://github.com/DiegoBalaguer/S0106-Generics.git>
   ```
3. Open the project in your preferred IDE.
4. Run the main classes or test methods as required.

---

# ▶️ Execution

1. From your IDE:
   - Open the `main()` method of each class
   - Run the file using the Run configuration

2. (Optional) From the command line:
   - Compile with:
     ```sh
     javac src/**/*.java
     ```
   - Run the class:
     ```sh
     java path.to.MainClass
     ```

---

# 🌐 Deployment

This project is intended for educational purposes and **local development only**. No deployment is required.

---

## 📦 Repository

You can find the source code on GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0106-Generics.git

---

## ✅ Author Notes

These exercises are designed to help you master Java Generics and write more flexible, reusable code.

Clone it, explore it, and expand it as needed!

Happy coding! 🚀
