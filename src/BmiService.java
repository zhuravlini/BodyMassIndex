public class BmiService {
    public double calculate(double height, double weight) {
        double bmi = weight / (height * height) ; //расчет ИМТ
        return bmi;
    }

}
