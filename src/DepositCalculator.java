import java.util.Scanner;

public class DepositCalculator {
    private double calculateComplexPercent(double amount, double yearRate, int depositPeriod) {
<<<<<<< HEAD
        return roundValue(amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod), 2);
    }

    private double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
         return roundValue(amount + amount * yearRate * depositPeriod, 2);
    }

    private double roundValue(double value, int degree) {
        double scale = Math.pow(10, degree);
        return Math.round(value * scale) / scale;
=======
        return calculateSum(amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod), 2);
    }

    private double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
         return calculateSum(amount + amount * yearRate * depositPeriod, 2);
    }

    private double calculateSum(double value, int degree) {
        double intermediateSum = Math.pow(10, degree);
        return Math.round(value * intermediateSum) / intermediateSum;
>>>>>>> 84e6ffaaec27fa86b2fc571ef1739a3cc5d5ec6a
    }

    private void calculateDepositSum() {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int period;
        int depositType;
        double sum = 0;

        System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        depositType = scanner.nextInt();

        if (depositType == 1) {
            sum = calculateSimplePercent(amount, 0.06, period);
        } else if (depositType == 2) {
            sum = calculateComplexPercent(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + sum);
    }

    public static void main(String[] args) {
        new DepositCalculator().calculateDepositSum();
    }
}
