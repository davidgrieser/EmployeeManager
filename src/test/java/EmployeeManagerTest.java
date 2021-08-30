import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    @Test
    void canAddPersonToManager() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jimmy", 42));
        assertEquals("Jimmy", employeeManager.getEmployees());
    }

    @Test
    void canAddMultipleEmployees() throws Exception {
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
    void initializeEmployeeManagerWithAList() throws Exception {
        List<Employee> initialEmployees = new ArrayList<>();
        initialEmployees.add(new Employee("Jimmy",42));
        initialEmployees.add(new Employee("Timmy", 32));
        try {
            initialEmployees.add(new Employee("Fimmy", 14));
        } catch(IllegalArgumentException exception) {
            System.out.println("error caught");
            System.out.println("getMessage:");
            System.out.println(exception.getMessage());
            System.out.println("toString:");
            System.err.println(exception.toString());
            System.out.println("getStackTrace:");
            for(StackTraceElement element: exception.getStackTrace()) {
                System.err.println(element);
            }
        }
        /*
        catch(Exception exception) {
            System.out.println("catching Exception class");
        } finally {
            // This block will Always run so long as execution continues
            // log to external system
        } */
        EmployeeManager employeeManager = new EmployeeManager(initialEmployees);
        assertEquals("Jimmy, Timmy, Fimmy", employeeManager.getEmployees());
    }

    @Test
    void getArrayListOfEmployees() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jimmy", 42));
        employeeManager.addEmployee(new Employee("Timmy", 32));
        try {
            employeeManager.addEmployee(new Employee("Fimmy", 14));
        } catch (MinimumAgeExeception ex) {
            // handle this scenario here
            System.err.println("Fimmy is too young to have this job");
        }
        ArrayList<Employee> actualList = employeeManager.getArrayListOfEmployees();
        assertEquals("Jimmy", actualList.get(0).getName());
        assertEquals("Timmy", actualList.get(1).getName());
    }
}
