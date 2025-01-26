// Main class to launch the application
public class ExpenseTracker {
    public static void main(String[] args) {
        // Launch the application menu or GUI
        Menu.launch();
    }
}

// Class for handling menu interactions
class Menu {
    public static void launch() {
        // Provide options for the user
        System.out.println("Welcome to the Expense Tracker");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Edit Expense");
        System.out.println("4. Delete Expense");
        System.out.println("5. Generate Report");
        System.out.println("6. Exit");

        // Add logic to handle user input (Scanner-based or GUI-based)
        // Example:
        // switch(userChoice) { ... }
    }
}

// Class representing an expense
class Expense {
    private int id;
    private double amount;
    private String category;
    private String date;
    private String description;

    // Constructors, getters, and setters
    public Expense(int id, double amount, String category, String date, String description) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// Class for database interactions
class ExpenseDatabase {
    private static final String URL = "jdbc:sqlite:expenses.db";

    public static void connect() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS expenses (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "amount REAL, category TEXT, date TEXT, description TEXT)";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addExpense(double amount, String category, String date, String description) {
        String sql = "INSERT INTO expenses(amount, category, date, description) VALUES(?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, category);
            pstmt.setString(3, date);
            pstmt.setString(4, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewExpenses() {
        String sql = "SELECT * FROM expenses";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Amount: " + rs.getDouble("amount"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Date: " + rs.getString("date"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Example usage of the Timer for displaying current time
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class DigitalClock {
    public static void displayTime() {
        Timer timer = new Timer(1000, e -> {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println("Current Time: " + time);
        });
        timer.start();

        // Keep the program running
        try {
            Thread.sleep(10000); // Runs for 10 seconds
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        timer.stop();
    }
}
