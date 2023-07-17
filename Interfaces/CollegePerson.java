package JavaAdvanced.DevelhopeJavaAdvanced.Interfaces;

public class CollegePerson {
    String name;
    String surname;
    int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege(){
     System.out.println("The person is: " + name + " " + surname + " and its collegeId is: " + collegeId);
 }

}
