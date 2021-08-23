import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    private List<String> employees;

    EmployeeManager() {
        employees = new ArrayList<>();
    }

    EmployeeManager(String[] initialEmployees) {
        this.employees = Arrays.asList(initialEmployees);
    }

    EmployeeManager(List<String> initialEmployees) {
        this.employees = initialEmployees;
    }

    public void addEmployee(String name) {
        // Add this employee to an ArrayList
        employees.add(name);
    }

    public String getEmployees() {
        String result = "";
        for(int i = 0; i < employees.size(); i++) {
            if( i > 0 )
                result += ", ";
            result += employees.get(i);
        }
        return result;
    }
}
