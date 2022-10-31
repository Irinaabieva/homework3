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

    }
}