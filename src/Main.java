public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("рост в метрах и масса тела в кг");
        System.out.println(service.calculate(1.62, 74.5));
    }
}


