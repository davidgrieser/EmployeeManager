import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    EmployeeManager() {
        employees = new ArrayList<>();
    }

//    EmployeeManager(String[] initialEmployees) {
//        this.employees = Arrays.asList(initialEmployees);
//    }

    EmployeeManager(List<Employee> initialEmployees) {
        this.employees = initialEmployees;
    }

    public void addEmployee(Employee employee) {
        // Add this employee to an ArrayList
        employees.add(employee);
    }

    public String getEmployees() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < employees.size(); i++) {
            if( i > 0 )
                result.append(", ");
            result.append(employees.get(i).getName());
        }
        return result.toString();
    }

    public ArrayList<Employee> getArrayListOfEmployees() {
        return (ArrayList<Employee>) employees;
    }
}
