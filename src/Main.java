public class Main {
    public static void main(String[] args) {
        int tinOfPaint = 120;
        int whiteOneGrade = 2;
        int brownOneGrade = 4;
        int oneGrade = whiteOneGrade + brownOneGrade;
        int sumOfGrades = tinOfPaint / oneGrade;
        int white = sumOfGrades * whiteOneGrade;
        int brown = sumOfGrades * brownOneGrade;
        System.out.println("В школе, где " + sumOfGrades + " классов, нужно " + white + " банок белой краски и " + brown +" банок коричневой краски");
    }
}