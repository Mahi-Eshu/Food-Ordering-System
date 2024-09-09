import java.util.*;

public class FoodOrder {
    Scanner sc = new Scanner(System.in);

    int FriedRice = 100;
    int ChickenPizza = 120;
    int ChickenPopcorn = 80;
    int Shawarma = 90;
    int ChickenGrill = 350;
    int PaniPoori = 25;
    int MuttaPuffs = 20;
    int ThengaPoli = 12;
    int Briyani = 140;
    int choice;
    char again; // No need for static here
    int quantity;
    Map<String, Integer> cart = new HashMap<>(); // No need for static here
    int totalAmount = 0; // No need for static here

    public void displayMenu() {
        System.out.println("*****************************");
        System.out.println("Welcome to Mahesh Mass Kadai!");
        System.out.println("           MENU              ");
        System.out.println("      1.FriedRice -       100/-");
        System.out.println("      2.ChickenPizza -    120/-");
        System.out.println("      3.ChickenPopCorn -  80/-");
        System.out.println("      4.Shawarma -        90/-");
        System.out.println("      5.ChickenGrill -    350/-");
        System.out.println("      6.PaniPoori -       25/-");
        System.out.println("      7.MuttaPuffs -      20/-");
        System.out.println("      8.ThengaPoli -      12/-");
        System.out.println("      9.Briyani -         140/-");
        System.out.println("*****************************");
    }

    public void order() {
        System.out.print("Enter the Menu Number to order: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1: // FriedRice
                System.out.println("Fried Rice added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += FriedRice * quantity;
                cart.put("Fried Rice", quantity);
                break;
            case 2: // ChickenPizza
                System.out.println("Chicken Pizza added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += ChickenPizza * quantity;
                cart.put("Chicken Pizza", quantity);
                break;
            case 3: // ChickenPopcorn
                System.out.println("Chicken Popcorn added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += ChickenPopcorn * quantity;
                cart.put("Chicken Popcorn", quantity);
                break;
            case 4: // Shawarma
                System.out.println("Shawarma added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += Shawarma * quantity;
                cart.put("Shawarma", quantity);
                break;
            case 5: // ChickenGrill
                System.out.println("Chicken Grill added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += ChickenGrill * quantity;
                cart.put("Chicken Grill", quantity);
                break;
            case 6: // PaniPoori
                System.out.println("Pani Poori added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += PaniPoori * quantity;
                cart.put("Pani Poori", quantity);
                break;
            case 7: // MuttaPuffs
                System.out.println("Mutta Puffs added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += MuttaPuffs * quantity;
                cart.put("Mutta Puffs", quantity);
                break;
            case 8: // ThengaPoli
                System.out.println("Thenga Poli added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += ThengaPoli * quantity;
                cart.put("Thenga Poli", quantity);
                break;
            case 9: // Briyani
                System.out.println("Briyani added to the Cart");
                System.out.print("Enter desired Quantity: ");
                quantity = sc.nextInt();
                totalAmount += Briyani * quantity;
                cart.put("Briyani", quantity);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.println();
        System.out.println("Do you wish to order anything else? (Y/N)");
        again = sc.next().charAt(0);
        if (Character.toUpperCase(again) == 'Y') {
            order();
        } else {
            System.out.println("       YOUR BILL        ");
            generateBill();
            System.out.println();
            System.out.println("Thank you for coming!");
        }
    }

    public void generateBill() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + "x)");
        }
        System.out.println("Total Amount : " + totalAmount);
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.displayMenu();
        order.order();
    }
}
