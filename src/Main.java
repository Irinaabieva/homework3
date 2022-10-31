public class Main {
    public static void main(String[] args) {
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