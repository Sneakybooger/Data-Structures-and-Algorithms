import java.util.Scanner;

public class Main {
    public ShoppingList myList = new ShoppingList(); 

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Welcome to Sneki's ShoppingLists");
        main.myList.addItem("Apple", "matabang", 50);
        main.myList.addItem("Watermelon", "maalat", 200);
        main.myList.addItem("Grapes", "mapait", 170);
        main.Start();
    }

    void Start() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
            System.out.println("\nWhat do you want to do? \n[1] DISPLAY ITEMS \n[2] ADD ITEMS \n[3] REMOVE ITEMS \n[4] MARK ITEM AS PURCHASED \n[5] EXIT");

        while (!validInput) {

            try {
                int ans = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch (ans) {
                    case 1:
                        display();
                        validInput = true;
                        break;

                    case 2:
                        AddItems();
                        validInput = true;
                        break;

                    case 3:
                        RemoveItems();
                        validInput = true;
                        break;

                    case 4:
                        System.out.print("Enter the name of the item to mark as purchased: ");
                        String itemToMark = sc.nextLine();
                        myList.markAsPurchased(itemToMark);
                        Start();
                        
                    case 5:
                        System.out.println("Adios kaibigang bangus!");
                        validInput = true;
                        break;

                    default:
                        System.out.println("Input error: This is not in the choices");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input error: Please enter a valid number.");
                sc.nextLine(); // Clear the invalid input
            }
        }
    }

    void AddItems() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an item name: ");
            String name = sc.nextLine();

            System.out.print("Enter the item description: ");
            String description = sc.nextLine();

            double price = 0;

            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter the item price: ");
                    price = sc.nextDouble();
                    sc.nextLine(); 
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Input error: Please enter a valid number for the price.");
                    sc.nextLine(); 
                }
            }

            myList.addItem(name, description, price);
            System.out.println("\nItem Added!");
            
            while(true){
                System.out.println("\nDo you want to add again? \n[1] YES \n[2] NO");

               int choice = sc.nextInt();
               sc.nextLine(); 

               if (choice == 2) {
                  Start();
                  break;
                }else{
                   System.out.println("Input error: This is not in the choices");
                }
            }
        }
    }


    void RemoveItems() {
        Scanner sc = new Scanner(System.in);

        while(true){
            try {
            System.out.println("\n[1] REMOVE AN ITEM \n[2] REMOVE ALL ITEMS \n[3] EXIT");
        int choice = sc.nextInt();
        sc.nextLine(); 
    
        if(choice == 1) {
            System.out.print("Enter the item name to delete: ");
            String ans = sc.nextLine();
            myList.deleteItem(ans);
            Start();
            break;
        } else if (choice == 2) {
            myList.clearAllitems();
        } else if (choice == 3) {
            Start();
            break;
        }else{
            System.out.println("Input error: This is not in the choices");
        }
        } catch (java.util.InputMismatchException e) {
                System.out.println("Input error: Please enter a valid number");
                sc.nextLine(); 
        }
    }
}
    
    void display(){
       Scanner sc = new Scanner(System.in); 
        myList.DisplayItems();
     while(true){
       try {
         System.out.println("\n[1] EXIT");
        int ans = sc.nextInt();
        if(ans == 1){
            Start();
        }else{
             System.out.println("Input error: This is not in the choices");
        }
        }catch (java.util.InputMismatchException e) {
            System.out.println("Input error: Please enter a valid number");
            sc.nextLine(); 
       } 
       
       
    }
  }
}
    


