import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<String> employees = new ArrayList<>();

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
