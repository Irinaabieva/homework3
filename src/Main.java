public class Main {
    public static void main(String[] args) {
        int bottlesCar = 16 / 2;
        int twentyMinutes = 20 * bottlesCar;
        System.out.println("За 20 минут машины произвела бутылок " + twentyMinutes +" штук ");
        int day = 24 * 60 * bottlesCar;
        System.out.println("За день машины произвела бутылок " + day + " штук ");
        int threeDays = 3 * day;
        System.out.println("За 3 дня  машины произвела бутылок " + threeDays +" штук ");
        int month = 30 * day * bottlesCar;
        System.out.println("За месяц машины произвела бутылок " + month + " штук ");
    }
}