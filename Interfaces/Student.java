package JavaAdvanced.DevelhopeJavaAdvanced.Interfaces;

public class Student extends CollegePerson implements LearningPerson {
   private int academicYear;
    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " is a student and studies at home");

    }
}
