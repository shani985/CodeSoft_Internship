import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Number of Subject: ");
        int totalSubject = sc.nextInt();
        double sum = 0;
        double average;
        double[] marks = new double[totalSubject];
        System.out.println("Enter the mark of the subject: ");
        for (int i = 0; i < totalSubject; i++) {
            double m = sc.nextDouble();
            if(m <= 100){
                marks[i] = m;
            }else {
                System.out.println("oops! marks should be less then and equal to 100 or should not be Negative");
                marks[i] = sc.nextDouble();
            }
            sum += marks[i];

        }

        average = sum / totalSubject;

        System.out.println("Total marks is = " + sum +
                            "\nTotal average percentage is = " + average + "%");

        if(average >= 91 && average <= 100){
            System.out.println("Grade 'A1'");
        } else if(average >= 81 && average <= 90){
            System.out.println("Grade 'A2'");
        }else if(average >= 71 && average <= 80){
            System.out.println("Grade 'B1'");
        }else if(average >= 61 && average <= 70){
            System.out.println("Grade 'B2'");
        }else if(average >= 51 && average <= 60){
            System.out.println("Grade 'C1'");
        }else if(average >= 41 && average <= 50){
            System.out.println("Grade 'C2'");
        }else if(average >= 33 && average <= 40){
            System.out.println("Grade 'D'");
        }else{
            System.out.println("Grade 'F' ");
        }


    }
}
