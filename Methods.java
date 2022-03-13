import java.util.*;

public class Methods {

    public static int[] add_element(int ages[], int newAge) {
        int newArray[] = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            newArray[i] = ages[i];
        }
        newArray[newArray.length - 1] = newAge;
        return newArray;

    }

    public static void main(String[] args) {
        double avg = 0.0;
        int sum = 0;
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        //part 1a
        System.out.println(ages[ages.length - 1] - ages[0]);

        ages = add_element(ages, 20);

        //part 1b
        System.out.println(ages[ages.length - 1] - ages[0]);

        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        avg = sum / ages.length;
        //part 1c
        System.out.println(avg);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //part 2a
        int count = 0;
        double avg2 = 0.0;
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length(); j++) {
                count++;
            }
        }
        avg2 = count / names.length;
        System.out.println(avg2);

        // part 2b
        String line = names[0];
        for (int i = 1; i < names.length; i++) {
            line += " " + names[i];
        }
        System.out.println(line);

        //part 5

        int[] nameLengths = new int[6];

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();

        }

        //part 6
        int sumOfLength = 0;
        for (int i = 0; i < nameLengths.length; i++) {
            sumOfLength += nameLengths[i];

        }
        System.out.println(sumOfLength);

        method7("Hello", 3);
        System.out.println(fullName("Bishoy", "Soliman"));

        int[] part9array = {100, 200, 300, 5, 1, 6};

        System.out.println(part9(part9array));

        double[] part10arr = {100.2, 35.9};
        System.out.println(part10(part10arr));
        double[] part11arr = {100.2, 35.9};
        double[] part11arr2 = {100.50, 60.8};
        System.out.println(part11(part11arr, part11arr2));
        System.out.println(willBuyDrink(true,15));

        Scanner s = new Scanner(System.in);
        float mass = s.nextFloat();
        int velocity = s.nextInt();
        int velocitySq = velocitySquare(velocity);
        float radius = s.nextFloat();
        float value = centripetalForceFormula(mass, velocitySq, radius);
        System.out.println("the value is " + value);

    }
    //Part 7

    static void method7(String word, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += word;
        }
        System.out.println(newString);
    }

    //part 8
    static String fullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;

    }

    //part 9
    static Boolean part9(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum > 100) {
            return true;
        } else {
            return false;
        }
    }

    //part 10
    static double part10(double[] arr) {
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    static boolean part11(double[] arr1, double[] arr2) {
        double sum1 = 0.0;
        double avg1 = 0.0;
        double sum2 = 0.0;
        double avg2 = 0.0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        avg1 = sum1 / arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        avg2 = sum2 / arr2.length;

        return avg1 > avg2;

    }
        //part 12
    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (moneyInPocket > 10.5 && isHotOutside)
            return true;
        else
            return false;
    }

    //part 13 method to calculate the centripetal force
    public static int velocitySquare(int x) {
        int velocitySquare = x * x;
        return velocitySquare;
    }

    public static float centripetalForceFormula(float mass, int x, float radius) {
        float c = (mass * x) / radius;
        return c;
    }




}