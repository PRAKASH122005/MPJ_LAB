import java.util.*;

class Student {

    private String name;
    private int rollNo;
    private int marks[];
    private double percentage;

    Student(String name, int rollNo, int marks[]) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void calculatePercentage() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        percentage = total / (double) marks.length;
    }

    public double getPercentage() {
        return percentage;
    }

    public void displayResult() {
        System.out.println("\n-");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);

        System.out.print("Marks      : ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nPercentage : " + percentage);

        if (percentage >= 75)
            System.out.println("Grade      : A");
        else if (percentage >= 60)
            System.out.println("Grade      : B");
        else
            System.out.println("Grade      : C");
    }
}

public class Assignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();   // Clear buffer

        Student[] students = new Student[n];

        double totalClassPercentage = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks of 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Clear buffer

            students[i] = new Student(name, rollNo, marks);
            students[i].calculatePercentage();
            totalClassPercentage += students[i].getPercentage();
        }

        // Display Results
        System.out.println("\n========= STUDENT RESULTS =========");
        for (Student s : students) {
            s.displayResult();
        }

        // Class Average
        double classAverage = totalClassPercentage / n;
        System.out.println("\n=================================");
        System.out.println("Class Average Percentage = " + classAverage);

        sc.close();
    }
}

/* PS C:\Users\prakash>  & 'C:\Program Files\Java\jdk-25.0.2\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\prakash\AppData\Local\Temp\vscodesws_6a835\jdt_ws\jdt.ls-java-project\bin' 'Assignment1' 
Enter number of students: 3

Enter details of Student 1
Enter Name: Prakash
Enter Roll No: 40
Enter marks of 5 subjects:
Subject 1: 91
Subject 2: 93
Subject 3: 94
Subject 4: 89 
Subject 5: 81

Enter details of Student 2
Enter Name: Rishav
Enter Roll No: 34
Enter marks of 5 subjects:
Subject 1: 76
Subject 2: 71
Subject 3: 69
Subject 4: 89 
Subject 5: 94

Enter details of Student 3
Enter Name: Anuj
Enter Roll No: 68
Enter marks of 5 subjects:
Subject 1: 39
Subject 2: 59
Subject 3: 57
Subject 4: 91
Subject 5: 69

========= STUDENT RESULTS =========

-
Name       : Prakash
Roll No    : 40
Marks      : 91 93 94 89 81
Percentage : 89.6
Grade      : A

-
Name       : Rishav
Roll No    : 34
Marks      : 76 71 69 89 94
Percentage : 79.8
Grade      : A

-
Name       : Anuj
Roll No    : 68
Marks      : 39 59 57 91 69
Percentage : 63.0
Grade      : B

=================================
Class Average Percentage = 77.46666666666665 */
