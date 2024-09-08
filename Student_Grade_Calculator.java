import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many subjects are there in your current year.");
        int sub = scan.nextInt();
        System.out.println("Enter the marks obtained (out of 100) in each subject.");
        int[] marks = new int[sub];
        int total_marks = 0;
        for(int i=0; i < sub; i++) {
            int mark = scan.nextInt();
            marks[i] = mark;
            total_marks += mark;}
        double Average_percentage = (float)total_marks / (float)sub;
        String grade;
        if(Average_percentage >= 90)
            grade = "O";
        else if(Average_percentage >= 80 && Average_percentage < 90)
            grade = "A+";
        else if(Average_percentage >= 70 && Average_percentage < 80)
            grade = "A";
        else if(Average_percentage >= 60 && Average_percentage < 70)
            grade = "B+";
        else if(Average_percentage >= 50 && Average_percentage < 60)
            grade = "B";
        else
            grade = "F";
        System.out.println("Your total mark is "+total_marks+"/"+sub+"00");
        System.out.println("Your average percentage is "+Average_percentage);
        if(grade == "F")
            System.out.println("You are failed. Try next time. ALL THE BEST");
        else
            System.out.println("Your grade is "+grade); } }