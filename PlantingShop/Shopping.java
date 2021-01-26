package PlantingShop;

import java.util.*;
public class Shopping {
    Scanner sc = new Scanner(System.in);

    public void Mongotree(){
        System.out.println("\nChoose a level of growth of Mongo tree");
        System.out.println("1. Small level (2$/tree)");
        System.out.println("2. Medium level (4$/tree)");
        System.out.println("3. Large level (10$/tree)");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 2;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n",prePrice );
            }
        }
        else if(choice==2){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 4;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n",prePrice );
            }
        }
        else if(choice==3){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void VineTree(){
        System.out.println("\nPls, choose a level of growth of Vine tree");
        System.out.println("1. Small level (5$/tree)");
        System.out.println("2. Medium level (10$/tree)");
        System.out.println("3. Large level (25$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 5;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 25;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void OrangeTree(){
        System.out.println("\nChoose a level of growth of grape tree");
        System.out.println("1. Small level (2$/tree)");
        System.out.println("2. Medium level (5$/tree)");
        System.out.println("3. Large level (10$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 2;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 5;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void DurianTree(){
        System.out.println("\nPls, choose a level of growth of lemon tree");
        System.out.println("1. Small level (5$/tree)");
        System.out.println("2. Medium level (9$/tree)");
        System.out.println("3. Large level (12$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 5;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 9;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 12;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }

    public void AppleTree(){
        System.out.println("\nChoose a level of growth of cherry tree");
        System.out.println("1. Small level (7$/tree)");
        System.out.println("2. Medium level (9$/tree)");
        System.out.println("3. Large level (10$/tree)");
        System.out.print("Enter your choice here: ");
        int choice = Integer.parseInt(sc.nextLine());

        if(choice==1){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 7;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==2){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 9;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n" ,prePrice );
            }
        }
        else if(choice==3){
            System.out.print("Enter trees u want: ");
            int amountOfTree = Integer.parseInt(sc.nextLine());
            int price = 10;
            int prePrice = price*amountOfTree;
            if (prePrice>50 && prePrice<100){
                double totalprice = prePrice - (prePrice* 0.05);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=100 && prePrice<200){
                double totalprice = prePrice - (prePrice* 0.1);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else if(prePrice>=200){
                double totalprice = prePrice - (prePrice* 0.15);
                System.out.printf("The total price is %.2f$ \n", totalprice);
            }
            else{
                System.out.printf("The total price is %d$ \n ",prePrice );
            }
        }
    }
    public void Menu(){
        System.out.println("\n1. Mongo tree");
        System.out.println("2. Vine tree");
        System.out.println("3. Orange tree");
        System.out.println("4. Durian tree");
        System.out.println("5. Apple tree");
        System.out.println("6. Quit the program");
    }
}
class sale{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Shopping p = new Shopping();

        while(true){
            p.Menu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice==1){
                p.Mongotree();
            }
            else if(choice==2){
                p.VineTree();
            }
            else if (choice==3){
                p.OrangeTree();
            }
            else if(choice==4){
                p.DurianTree();
            }
            else if(choice==5){
                p.AppleTree();
            }
            else if(choice==6){
                break;
            }
        }
    }
}