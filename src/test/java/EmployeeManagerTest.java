import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    @Test
    void canAddPersonToManager() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jimmy", 42));
        assertEquals("Jimmy", employeeManager.getEmployees());
    }

    @Test
    void canAddMultipleEmployees() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jimmy", 42));
        employeeManager.addEmployee(new Employee("Timmy", 32));
        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
    }

//    @Test
//    void initializeEmployeeManager() {
//        String[] initialEmployees = new String[]{"Jimmy", "Timmy"};
////        String[] initialEmployees = new String[3];
////        initialEmployees[0] = "Jimmy";
////        initialEmployees[1] = "Timmy";
////        initialEmployees[2] = "Fimmy";
//        EmployeeManager employeeManager = new EmployeeManager(initialEmployees);
//        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
//    }

    @Test
    void initializeEmployeeManagerWithAList() {
        List<Employee> initialEmployees = new ArrayList<>();
        initialEmployees.add(new Employee("Jimmy",42));
        initialEmployees.add(new Employee("Timmy", 32));
        EmployeeManager employeeManager = new EmployeeManager(initialEmployees);
        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
    }

    @Test
    void getArrayListOfEmployees() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jimmy", 42));
        employeeManager.addEmployee(new Employee("Timmy", 32));
        ArrayList<Employee> actualList = employeeManager.getArrayListOfEmployees();
        assertEquals("Jimmy", actualList.get(0).getName());
        assertEquals("Timmy", actualList.get(1).getName());
    }
}
