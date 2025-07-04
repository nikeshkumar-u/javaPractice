
// Main class (User Interface)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bag bag = new Bag();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Check Bag is empty or not");
            System.out.println("4. Show game that can be played");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose Ball Type: 1. BasketBall  2. Tennis");
                    int type = sc.nextInt();
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    if (type == 1) {
                        bag.addBall(new BasketBall(radius));
                    } else if (type == 2) {
                        bag.addBall(new TennisBall(radius));
                    } else {
                        System.out.println("Invalid ball type.");
                    }
                    break;

                case 2:
                    bag.removeBall();
                    break;

                case 3:
                    System.out.println("Bag is " + (bag.isBagEmpty() ? "empty." : "not empty."));
                    break;

                case 4:
                    bag.showGame();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}