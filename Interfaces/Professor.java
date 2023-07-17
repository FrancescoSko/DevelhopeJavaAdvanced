package JavaAdvanced.DevelhopeJavaAdvanced.Interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " " + surname + " is a professor and teaches to other people");
    }
}
