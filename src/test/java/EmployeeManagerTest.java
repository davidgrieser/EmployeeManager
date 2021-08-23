import org.junit.jupiter.api.Test;

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
}
