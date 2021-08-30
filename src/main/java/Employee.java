public class Employee {
    private String name;
    private Integer age;
    Employee(String name, Integer age) throws Exception {
        if(name.isEmpty()) {
            throw new Exception("Testing");
//            throw new IllegalArgumentException("Name should not be empty");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
