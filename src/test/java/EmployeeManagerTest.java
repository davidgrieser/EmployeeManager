import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    @Test
    void canAddPersonToManager() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee("Jimmy");
        assertEquals("Jimmy", employeeManager.getEmployees());
    }

    @Test
    void canAddMultipleEmployees() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee("Jimmy");
        employeeManager.addEmployee("Timmy");
        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
    }

    @Test
    void initializeEmployeeManager() {
        String[] initialEmployees = new String[]{"Jimmy", "Timmy"};
//        String[] initialEmployees = new String[3];
//        initialEmployees[0] = "Jimmy";
//        initialEmployees[1] = "Timmy";
//        initialEmployees[2] = "Fimmy";
        EmployeeManager employeeManager = new EmployeeManager(initialEmployees);
        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
    }

    @Test
    void initializeEmployeeManagerWithAList() {
        List<String> initialEmployees = new ArrayList<String>();
        initialEmployees.add("Jimmy");
        initialEmployees.add("Timmy");
        EmployeeManager employeeManager = new EmployeeManager(initialEmployees);
        assertEquals("Jimmy, Timmy", employeeManager.getEmployees());
    }
}
