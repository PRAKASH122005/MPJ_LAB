import java.util.Scanner;

class Hillstations {

    void famousfood() {
        System.out.println("Common hill station food");
    }

    void famousfor() {
        System.out.println("Cool climate and natural beauty");
    }
}

class Ooty extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Homemade chocolates and tea");
    }

    @Override
    void famousfor() {
        System.out.println("Botanical gardens and scenic hills");
    }
}

class Manali extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Siddu and trout fish");
    }

    @Override
    void famousfor() {
        System.out.println("Snow mountains and adventure sports");
    }
}

class Shimla extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Chole bhature and local Himachali dishes");
    }

    @Override
    void famousfor() {
        System.out.println("Mall road and colonial architecture");
    }
}

class Munnar extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Kerala cuisine and tea");
    }

    @Override
    void famousfor() {
        System.out.println("Tea plantations and waterfalls");
    }
}

public class HillMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hillstations h = null;
        int ch;

        do {
            System.out.println("\n--- HILL STATION MENU ---");
            System.out.println("1. Ooty");
            System.out.println("2. Manali");
            System.out.println("3. Shimla");
            System.out.println("4. Munnar");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    h = new Ooty();
                    break;

                case 2:
                    h = new Manali();
                    break;

                case 3:
                    h = new Shimla();
                    break;

                case 4:
                    h = new Munnar();
                    break;

                case 0:
                    System.out.println("Program closed");
                    break;

                default:
                    System.out.println("Wrong input");
            }

            if (h != null && ch != 0) {
                h.famousfood();
                h.famousfor();
            }

        } while (ch != 0);

        sc.close();
    }
}

/*--- HILL STATION MENU ---
1. Ooty
2. Manali
3. Shimla
4. Munnar
0. Exit
Enter choice: 1
Homemade chocolates and tea
Botanical gardens and scenic hills

--- HILL STATION MENU ---
1. Ooty
2. Manali
3. Shimla
4. Munnar
0. Exit
Enter choice: 2
Siddu and trout fish
Snow mountains and adventure sports

--- HILL STATION MENU ---
1. Ooty
2. Manali
3. Shimla
4. Munnar
0. Exit
Enter choice: 3
Chole bhature and local Himachali dishes
Mall road and colonial architecture

--- HILL STATION MENU ---
1. Ooty
2. Manali
3. Shimla
4. Munnar
0. Exit
Enter choice: 4
Kerala cuisine and tea
Tea plantations and waterfalls

--- HILL STATION MENU ---
1. Ooty
2. Manali
3. Shimla
4. Munnar
0. Exit
Enter choice: 0
Program closed
*/