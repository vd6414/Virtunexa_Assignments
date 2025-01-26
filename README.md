# Expense Tracker Application

This Java-based Expense Tracker application allows users to manage their daily expenses and generate detailed reports. It provides both console-based interaction and an optional GUI for better usability.

---

## Features

- **Expense Management**: Add, view, edit, and delete expenses.
- **Categorization**: Organize expenses by category and date.
- **Report Generation**: Generate summaries and detailed reports of expenses.
- **Persistent Storage**: Save data using SQLite for future access.
- **Digital Clock**: Display the current time in a digital clock format.
- **Exporting (Optional)**: Export reports to Excel or JSON.

---

## Technologies Used

- **Java**: Core application logic.
- **SQLite (JDBC)**: For persistent data storage.
- **Swing (Optional)**: To create a graphical user interface.
- **Apache POI (Optional)**: For generating Excel reports.

---

## Requirements

- **Java Development Kit (JDK)** 8 or higher
- **SQLite**: Embedded database
- **Maven/Gradle** (optional): For dependency management

---

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone <repository_url>
   cd expense-tracker
   ```

2. **Set Up the Database**:
   - Ensure SQLite is installed.
   - Run the application to automatically create the database and tables if they do not exist.

3. **Compile and Run**:
   ```bash
   javac ExpenseTracker.java
   java ExpenseTracker
   ```

4. **Optional GUI**:
   - If Swing is enabled, follow the on-screen instructions to use the graphical interface.

---

## Folder Structure

```
expense-tracker/
├── src/
│   ├── ExpenseTracker.java        # Main application file
│   ├── Menu.java                  # Menu system for user interaction
│   ├── ExpenseDatabase.java       # Database operations
│   ├── DigitalClock.java          # Time display functionality
│   └── Expense.java               # Expense model class
├── lib/
│   ├── sqlite-jdbc.jar            # SQLite JDBC driver
│   └── apache-poi.jar             # (Optional) Apache POI library for Excel export
├── database/
│   └── expenses.db                # SQLite database file
└── README.md                      # Documentation
```

---

## Features in Detail

### Expense Management
- **Add Expense**: Enter the amount, category, date, and a brief description.
- **View Expense**: Retrieve and display all expenses.
- **Edit Expense**: Update an existing record.
- **Delete Expense**: Remove an entry by ID.

### Report Generation
- Generate a report summarizing expenses by category and date range.

### Digital Clock
- Displays the current time updated every second.

---

## Contribution

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Create a pull request.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## Contact

For questions or suggestions, please contact:
- **Name**: Vishal Vishwas Desai
- **Email**: vd6414@gmail.com
- **GitHub**: [Vishal-desai](https://github.com/Vishal-desai)

---# Virtunexa_Assignments
