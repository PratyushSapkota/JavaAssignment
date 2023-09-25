import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        float totalMarks = 0;

        for (int i = 1; i <= subjects; i++){
            System.out.println("Enter the marks of subject " + i);
            float perSubjectMarks = sc.nextFloat();
            totalMarks = totalMarks + perSubjectMarks;
        }

        float percent = (totalMarks / (subjects * 100)) * 100;

        String grade = "";

        if (percent > 90) {
            grade = "A+";
        } else if (percent > 85) {
            grade = "A";
        } else if (percent > 70) {
            grade = "B+";
        } else if (percent > 55) {
            grade = "B";
        } else if (percent > 40) {
            grade = "C+";
        }

        System.out.println("Your result is:");
        System.out.println(percent + "%");
        System.out.println(grade);
    }
}
