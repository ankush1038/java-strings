import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        int numStudents = 5; // Change as needed
        int[][] scores = generateScores(numStudents);
        int[][] results = calculateResults(scores);
        char[] grades = assignGrades(results);

        displayResults(scores, results, grades);
    }

    // Generate random scores (2-digit) for PCM subjects
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Random scores between 60 and 100
            }
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static int[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        int[][] results = new int[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            int avg = total / 3;
            int percent = (total * 100) / 300;
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Assign grades based on percentage
    public static char[] assignGrades(int[][] results) {
        int numStudents = results.length;
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int percent = results[i][2];

            if (percent >= 85) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else grades[i] = 'E';
        }
        return grades;
    }

    // Display the results
    public static void displayResults(int[][] scores, int[][] results, char[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAvg\tPercent\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t");
            System.out.println(grades[i]);
        }
    }
}

Output : 

Student Physics Chemistry       Math    Total   Avg     Percent Grade
1       68      71              95      234     78      78%     B
2       77      90              91      258     86      86%     A
3       85      84              88      257     85      85%     A
4       84      64              71      219     73      73%     B
5       62      86              83      231     77      77%     B
