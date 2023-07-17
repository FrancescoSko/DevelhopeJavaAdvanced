package JavaAdvanced.DevelhopeJavaAdvanced.Interfaces;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Marco", "Rossi", 4521, 2023);
        Professor professor = new Professor("Luigi", "Bianchi", 1214, "Italian Literature");
        Assistant assistant = new Assistant("Giulia", "Verdi", 2521, true);


     student.goToCollege();
     student.studyAtHome();
     professor.goToCollege();
     professor.teachToOtherPeople();
     assistant.goToCollege();
     assistant.studyAtHome();
     assistant.teachToOtherPeople();

    }
}
