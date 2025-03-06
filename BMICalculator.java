import java.util.Scanner;

public class BMICalculator {
    static Scanner sc = new Scanner(System.in);

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 40) return "Overweight";
        else return "Obese";
    }

    // Method to process BMI calculations and store in a 2D String array
    public static String[][] processBMI(double[][] persons) {
        String[][] result = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double height = persons[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display the result in a tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nPerson's Height\tWeight\tBMI\tStatus");
        System.out.println("-------------------------------------------");
        for (String[] row : data) {
            System.out.println(row[1] + " cm\t\t" + row[0] + " kg\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        double[][] persons = new double[10][2]; // 10 persons, each with weight & height

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        // Processing and displaying BMI details
        String[][] bmiData = processBMI(persons);
        displayResult(bmiData);
    }
}

/*
Input :
Enter weight (kg) for person 1: 78
Enter height (cm) for person 1: 175
Enter weight (kg) for person 2: 65
Enter height (cm) for person 2: 566
Enter weight (kg) for person 3: 4466
Enter height (cm) for person 3: 0000999999
Enter weight (kg) for person 4: 3377373773
Enter height (cm) for person 4: 657489
Enter weight (kg) for person 5: 7483
Enter height (cm) for person 5: 784
Enter weight (kg) for person 6: 748930
Enter height (cm) for person 6: 5
Enter weight (kg) for person 7:
5
Enter height (cm) for person 7: 5
Enter weight (kg) for person 8: 5
Enter height (cm) for person 8: 5
Enter weight (kg) for person 9: 5
Enter height (cm) for person 9: 5
Enter weight (kg) for person 10:
55
Enter height (cm) for person 10: 5

Output : 
Person's Height Weight  BMI     Status
-------------------------------------------
175.0 cm                78.0 kg 25.47   Overweight
566.0 cm                65.0 kg 2.03    Underweight
999999.0 cm             4466.0 kg       0.00    Underweight
657489.0 cm             3.377373773E9 kg        78.13   Obese
784.0 cm                7483.0 kg       121.74  Obese
5.0 cm          748930.0 kg     299572000.00    Obese
5.0 cm          5.0 kg  2000.00 Obese
5.0 cm          5.0 kg  2000.00 Obese
5.0 cm          5.0 kg  2000.00 Obese
5.0 cm          55.0 kg 22000.00        Obese
*/