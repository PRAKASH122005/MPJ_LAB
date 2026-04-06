import java.util.Scanner;

class Shapes {

    // Square
    double area(double side) {
        return side * side;
    }

    // Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Triangle
    double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Circle
    double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }
}

public class Overloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shapes obj = new Shapes();
        int ch;

        do {
            System.out.println("\n--- AREA MENU ---");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    System.out.println("Area = " + obj.area(s));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    System.out.println("Area = " + obj.area(l, b));
                    break;

                case 3:
                    System.out.print("Enter base: ");
                    double bs = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Area = " + obj.areaTriangle(bs, h));
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + obj.areaCircle(r));
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }

        } while (ch != 0);

        sc.close();
    }
}

/*PS C:\Users\prakash>  & 'C:\Program Files\Java\jdk-25.0.2\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\prakash\AppData\Local\Temp\vscodesws_39bf3\jdt_ws\jdt.ls-java-project\bin' 'Overloading' 


--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 1
Enter side: 3
Area = 9.0

--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 2
Enter length: 3
Enter breadth: 4
Area = 12.0

--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 3
Enter base: 10
Enter height: 5
Area = 25.0

--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 3
Enter base: 50
Enter height: 5
Area = 125.0

--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 4
Enter radius: 4
Area = 50.24

--- AREA MENU ---
1. Square
2. Rectangle
3. Triangle
4. Circle
0. Exit
Enter choice: 0
Program ended. */