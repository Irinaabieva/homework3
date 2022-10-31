public class Main {
    public static void main(String[] args) {
        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int recipeInGram = (bananas * 5) + (milk * 2) + (iceCream * 2) + (egg * 4) ;
        float recipeInKg = recipeInGram / 1000;
        System.out.println("Вес спорт-завтрака " + recipeInKg + " кг");
    }
}