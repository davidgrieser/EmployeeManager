import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeManagerTest {

    @Test
    void canAddPersonToManager() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee("Jimmy");
        assertEquals("Jimmy", employeeManager.getEmployees());
    }
}
