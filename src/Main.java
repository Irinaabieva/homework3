public class Main {
    public static void main(String[] args) {
     int ludmilasStudents = 23;
     int annasStudents = 27;
     int ekaterinasStudents = 30;
     int sumOfPapers = 480;
     int sumOfStudent = ludmilasStudents + annasStudents + ekaterinasStudents;
     int paper = sumOfPapers / sumOfStudent;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }
}