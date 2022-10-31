public class Main {
    public static void main(String[] args) {
        int weight = 7000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int days1 = weight  / weightLoss1;
        int days2 = weight / weightLoss2;
        int average = (days1 + days2) / 2 ;
        System.out.println(average);
    }
}