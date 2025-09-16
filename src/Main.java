/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tommy Zhou
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                
                Tommy Zhou's test cases:
                
                1. Add 6 and 8.
                2. Add 6, 4, 3 and 2.
                3. Greet Bobby good morning.
                4. Greet Felix good afternoon.
                5. Triple the string "KylianMbappe".
                6. Half the integer 17.
                7. Round 14.6 to nearest int.
                8. Round -19.8 to nearest int.
                
                """);

        int add2 = add(6, 8);
        int add4 = add(6, 4, 3, 2);
        String morning = morningGreeting("Bobby");
        String afternoon = afternoonGreeting("Felix");
        String tripleStr = triple("KylianMbappe");
        double halfD = half(17);
        int roundPositive = roundPositiveValueToNearestInteger(14.6d);
        int roundNegative = roundNegativeValueToNearestInteger(-19.8);

        System.out.println(add2);
        System.out.println(add4);
        System.out.println(morning);
        System.out.println(afternoon);
        System.out.println(tripleStr);
        System.out.println(halfD);
        System.out.println(roundPositive);
        System.out.println(roundNegative);
    }

    // 1. add

    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple

    public static String triple(String str) {
        return str + str + str;
    }

    // 6. half

    public static double half(int val) {
        return ((double) val) / 2;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger(double val) {
        return (int) (val + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegativeValueToNearestInteger(double val) {
        return (int) (val - 0.5);
    }
}
