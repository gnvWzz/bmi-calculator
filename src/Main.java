import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your weight (in kilogram):");
        weight = input.nextDouble();

        System.out.println("Enter your height (in meter):");
        height = input.nextDouble();
        bmi = weight / Math.pow(height,2);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}