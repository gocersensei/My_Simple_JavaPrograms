import java.util.ArrayList;
import java.util.Scanner;

class MyBMI1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        ArrayList<Double> bmis = new ArrayList<Double>();
        ArrayList<String> categories = new ArrayList<String>();

        do {
            System.out.println("Welcome to MyBMI!");
            System.out.println("1. Add Patient");
            System.out.println("2. Display All BMIs");
            System.out.println("3. Exit");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("What is your name?");
                String name = input.nextLine();

                System.out.println("Hello " + name);

                double height = 0;
                do {
                    System.out.println("What is your height (m)?");
                    height = input.nextDouble();
                    input.nextLine();
                } while (height < 0.3 || height > 3.0);

                double weight = 0;
                do {
                    System.out.println("What is your weight (kg)?");
                    weight = input.nextDouble();
                    input.nextLine();
                } while (weight < 10 || weight > 200);


                double bmi = calculateBMI(weight, height);
                bmis.add(bmi);

                String category = calculateCategory(bmi);
                categories.add(category);

                System.out.println("Your BMI category is " + category + " with a BMI of " + bmi);

            }
            else if (choice == 2) {
                System.out.println("Display All BMIs");

                for (int i = 0; i < bmis.size(); i++) {
                    System.out.println("Category was " + categories.get(i) + " with a BMI of " + bmis.get(i));
                }
            }
        } while (choice != 3);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String calculateCategory(double bmi) {
        if (bmi < 18) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal";
        }
        else {
            return "Overweight";
        }
    }
}