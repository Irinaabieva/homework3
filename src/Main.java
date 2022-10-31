public class Main {
    public static void main(String[] args) {

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double percent = 0.1;
        double newSalaryMasha = masha + (masha * percent);
        double newSalaryDenis = denis + (denis * percent);
        double newSalaryKristina = kristina + (kristina * percent);
        int year = 12;
        double salaryMashaForYear = (newSalaryMasha * year) - (masha * year) ;
        double salaryDenisForYear = (newSalaryDenis * year) - (denis * year) ;
        double salaryKristinaForYear = (newSalaryKristina * year) - (kristina * year) ;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryMashaForYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDenisForYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryKristinaForYear + " рублей");


        int weight = 7000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int days1 = weight  / weightLoss1;
        System.out.println("Если спортсмен будет терять 250 грамм каждый день, на похудение уйдет " + days1 + " дней");
        int days2 = weight / weightLoss2;
        System.out.println("Если спортсмен будет терять 500 грамм каждый день, на похудение уйдет " + days2 + " дней");
        int averageGram = (weightLoss1 + weightLoss2) / 2;
        System.out.println("Среднее количество равно " + averageGram + " грамм");
        int a = weight / averageGram;
        int b = a % 1;
        int averageDays = a - b;
        System.out.println("Потребуется в среднем " + averageDays + " дней");

    }
}