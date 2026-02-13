import java.util.*;

class Student{

    private String name;
    private int rollNo;
    private int marks[]=new int[5];
    private double percentage;

    Student(String name,int rollNo, int marks[]){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public void calculatePercentage() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        percentage = total / (double) marks.length;
    }

    public void displayResult() {
        System.out.println("\nName       : " + name);
        System.out.println("Roll No    : " + rollNo);

        System.out.print("Marks      : ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nPercentage : " + percentage);

        if (percentage >= 75) {
            System.out.println("Grade      : A");
        } else if (percentage >= 60) {
            System.out.println("Grade      : B");
        } else {
            System.out.println("Grade      : C");
        }
    }
}


public class Assign1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student s = new Student(name, rollNo, marks);

        s.calculatePercentage();
        s.displayResult();

        sc.close();
    }
}

// kunaltailor@Kunals-MacBook-Air Lab2 % cd ..
// kunaltailor@Kunals-MacBook-Air MPJ % cd Lab1
// kunaltailor@Kunals-MacBook-Air Lab1 % javac Assign1.java
// kunaltailor@Kunals-MacBook-Air Lab1 % java Assign1
// Enter Name: Kunal
// Enter Roll No: 38
// Enter marks of 5 subjects:
// Subject 1: 89
// Subject 2: 87
// Subject 3: 88
// Subject 4: 89
// Subject 5: 98

// Name       : Kunal
// Roll No    : 38
// Marks      : 89 87 88 89 98 
// Percentage : 90.2
// Grade      : A
// kunaltailor@Kunals-MacBook-Air Lab1 % 