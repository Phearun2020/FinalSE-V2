package Contact;

import java.util.Scanner;

public class main {
    static contactList list = new contactList();
    public static void main(String[] args){
        int opt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1. Add new contact.\n" +
                    "2. Update contact.\n" +
                    "3. Delete contact.\n" +
                    "4. List contact\n" +
                    "5. Quit\n"+
                    "Input an option:  ");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 1: list.addNewContact();break;
                case 2: {
                    String number;
                    System.out.println("Enter phone number: ");
                    number = sc.nextLine();
                    list.updateInforByPhone(number);
                    break;
                }
                case 3: {
                    String number;
                    System.out.println("Enter phone number: ");
                    number = sc.nextLine();
                    list.removeByPhoneNumber(number);
                    break;
                }
                case 4: list.listContact();
                case 5: System.out.println("Thanks.");break;
                default:System.out.println("Unknown option.");
            }
        }
        while (opt!=5);
        sc.close();
    }
}
