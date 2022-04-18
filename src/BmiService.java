public class BmiService {
    public double calculate(double mass, double height) {
        double bmi = mass / (height * height);
        System.out.println(" Масса тела " + mass);
        System.out.println(" Рост " + height);
        return bmi;
    }
}
