import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    
    private List<Employee> employees = new ArrayList<>();
    private int nextId = 1; 


    public void addEmployee(String name, double salary) {
        Employee newEmployee = new Employee(nextId++, name, salary);
        employees.add(newEmployee);
        System.out.println("✅ Employee added successfully: " + newEmployee);
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp; 
            }
        }
        return null;
    }

    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("ℹ️ No employees in the system yet.");
            return;
        }
        System.out.println("\n--- All Employees ---");
        for (Employee emp : employees) {
            System.out.println(emp); 
        }
        System.out.println("---------------------\n");
    }

    
    public boolean updateEmployee(int id, String newName, double newSalary) {
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            emp.setName(newName);
            emp.setSalary(newSalary);
            System.out.println("🔄 Employee updated: " + emp);
            return true;
        }
        return false;
    }

    
    public boolean deleteEmployee(int id) {
        Employee empToDelete = findEmployeeById(id);
        if (empToDelete != null) {
            employees.remove(empToDelete);
            System.out.println("❌ Employee with ID " + id + " deleted successfully.");
            return true;
        }
        return false;
    }
}