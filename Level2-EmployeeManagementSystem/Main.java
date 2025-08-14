import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n--- Employee Management System Menu ---");
            System.out.println("1. Add a New Employee");
            System.out.println("2. View a Specific Employee by ID");
            System.out.println("3. View All Employees");
            System.out.println("4. Update an Employee's Details");
            System.out.println("5. Delete an Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            // Use try-catch to handle non-integer inputs gracefully
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline character

                switch (choice) {
                    case 1: // Add
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = scanner.nextDouble();
                        service.addEmployee(name, salary);
                        break;
                    case 2: // View by ID
                        System.out.print("Enter Employee ID to view: ");
                        int viewId = scanner.nextInt();
                        Employee emp = service.findEmployeeById(viewId);
                        if (emp != null) {
                            System.out.println("🔍 Employee Found: " + emp);
                        } else {
                            System.out.println("⚠️ Employee with that ID was not found.");
                        }
                        break;
                    case 3: // View All
                        service.viewAllEmployees();
                        break;
                    case 4: // Update
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (service.findEmployeeById(updateId) != null) {
                            System.out.print("Enter new Name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new Salary: ");
                            double newSalary = scanner.nextDouble();
                            service.updateEmployee(updateId, newName, newSalary);
                        } else {
                            System.out.println("⚠️ Employee with that ID was not found.");
                        }
                        break;
                    case 5: // Delete
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        if (!service.deleteEmployee(deleteId)) {
                            System.out.println("⚠️ Employee with that ID was not found.");
                        }
                        break;
                    case 6: // Exit
                        System.out.println("👋 Exiting application. Goodbye!");
                        scanner.close();
                        return; // Exit the main method, terminating the program
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("🚨 Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }
}
