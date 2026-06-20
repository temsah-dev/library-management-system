# 📚 Library Management System

> A desktop Java application for managing library books and users — built with OOP principles and a MySQL database backend.

---

## 📖 About The Project

The **Library Management System** is a full-featured desktop application developed as an Object-Oriented Programming (OOP) academic project. It allows users to browse the library catalog, borrow books, and manage their profiles — while administrators have full control over the book database and user accounts.

The project demonstrates core OOP concepts including **Encapsulation**, **Inheritance**, **Method Overloading**, **Method Overriding**, and **Interfaces** — all implemented in a real, working application.

---

## ✨ Features

- 🔐 **User Authentication** — Secure login and sign-up with credential validation
- 🏠 **Home Page** — Displays available books and currently borrowed books per user
- 📖 **Book Details Page** — Shows full info: title, author, ISBN, genre, year, and language
- 👤 **User Settings** — Profile management including photo upload
- 🛡️ **Admin Panel** — Full CRUD control (Create, Read, Update, Delete) over books and users
- 🔍 **Search System** — Search books by name, author, ISBN, genre, and more
- 🗄️ **Database Integration** — All data persisted in a MySQL database

---

## 🧠 OOP Concepts Applied

| Concept | Where Applied |
|---|---|
| Encapsulation | Private fields + getters/setters in `Login.java` |
| Inheritance | All GUI screens extend `javax.swing.JFrame` |
| Method Overloading | Multiple constructors in `HomePage.java` |
| Method Overriding | `toString()` overridden in `Login.java` |
| Interface | `Search` interface implemented by `HomePage` |

---

## 🛠️ Built With

| Technology | Purpose |
|---|---|
| Java (Swing) | GUI framework for desktop interface |
| NetBeans IDE | Project structure and form designer |
| MySQL / MariaDB | Relational database |
| JDBC | Java–database connectivity |
| phpMyAdmin | Database administration |

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [NetBeans IDE](https://netbeans.apache.org/)
- [XAMPP](https://www.apachefriends.org/) (includes MySQL + phpMyAdmin)

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/temsah-dev/library-management-system.git
   ```

2. **Open the project in NetBeans**
   - Open NetBeans → `File` → `New Project` → `Java` → `Java Application`
   - Add all `.java` files to the project source folder

3. **Set up the database**
   - Start XAMPP and run Apache + MySQL
   - Open [http://localhost/phpmyadmin](http://localhost/phpmyadmin)
   - Create a new database named `librarymanagementsystemdata`
   - Import the file `librarymanagementsystemdata.sql`

4. **Run the project**
   - In NetBeans, right-click the project → `Run`
   - The Login screen will appear

---

## 🗂️ Project Structure

```
library-management-system/
├── LoginAndSingUp.java        # Main entry point
├── Login.java                 # Login screen
├── SignUp.java                # Registration screen
├── HomePage.java              # Main user dashboard
├── BookPage.java              # Book detail view
├── AdminSettings.java         # Admin control panel
├── UserSettings.java          # User profile settings
├── Search.java                # Search interface
├── librarymanagementsystemdata.sql  # MySQL database dump
├── README.md
└── LICENSE
```

---

## 💡 What I Learned

- Applying **OOP principles** (Encapsulation, Inheritance, Overloading, Overriding, Interfaces) in a real project
- Building **desktop GUIs** with Java Swing and NetBeans Form Designer
- Connecting a Java application to a **MySQL database** using JDBC
- Managing **user roles** (admin vs. regular user) within the same system
- Designing and querying a **relational database** schema

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request.

1. Fork the project
2. Create your feature branch: `git checkout -b feature/YourFeature`
3. Commit your changes: `git commit -m "Add YourFeature"`
4. Push to the branch: `git push origin feature/YourFeature`
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Abdou Ahmed Ibrahim Temsah**

[![GitHub](https://img.shields.io/badge/GitHub-temsah--dev-181717?style=flat&logo=github)](https://github.com/temsah-dev)

---

> ⭐ If you found this project helpful, please consider giving it a star on GitHub!
