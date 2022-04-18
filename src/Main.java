public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi1 = service.calculate(85.4, 1.88);
        System.out.println(" Индекс массы тела" + bmi1);

        double bmi2 = service.calculate(80.4, 1.6);
        System.out.println(" Индекс массы тела" + bmi2);

        double bmi3 = service.calculate(75.5, 1.7);
        System.out.println(" Индекс массы тела " + bmi3);
    }
}