package JavaAdvanced.DevelhopeJavaAdvanced.Interfaces;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
  private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " " + surname + " is an assistant so is a student");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("And can also teach to other people");
    }
}
