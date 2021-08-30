public class MinimumAgeExeception extends Exception {
    public MinimumAgeExeception(int age) {
        super("Employee must be " + age + " years of age or older");
    }

}
