package JavaAdvanced.DevelhopeJavaAdvanced.handlingException;

public class TestCheckScore {
    public void testCheckScore(double score){
        try{
            checkScore(score);
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
    }

        private void checkScore(double score) {
            if (0 < score && score <= 50.00) {
                System.out.println("Average score");
            } else if (50.00 < score && score <= 100.00) {
                System.out.println("Very good score");
            } else {
                throw new ArithmeticException("Score is out of scale!");
            }




    }
}
