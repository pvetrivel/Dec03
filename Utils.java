package Cricket_Game;

public class Utils {

    static  int wicketProbability = 0;
    private Utils() {
        throw new AssertionError("dont instatntiate");
    }


    public static int doRandom(int someParam) {
     // static  int wicketProbability = 0;
        int random = (int) (Math.random() * someParam);

        if (random == 7) {
            if (wicketProbability > 0) {
                wicketProbability=0;
                return 7;
            } else {
                wicketProbability++;
                //System.out.println("Wicket Probability: "+wicketProbability);
                return 0;
            }
        }
        return random;
    }


    public static void printMessage(String message) {
        System.out.println(message);
    }
}

