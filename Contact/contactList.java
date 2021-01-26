package Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactList {
    private ArrayList<contact> List = new ArrayList<>();
    public contactList(){

    }

    public void addNewContact(){
        Scanner sc = new Scanner(System.in);
        String firstName,lastName ,phoneNumber, email, pass;
        System.out.println("Enter password: ");
        pass = sc.nextLine();
        if (pass.trim().equals("admin123")){
            System.out.println("\t\tWelcome To Contact\n");
            System.out.println("Enter first name: ");
            firstName = sc.nextLine();
            System.out.println("Enter last name: ");
            lastName = sc.nextLine();
            System.out.println("Enter phone number: ");
            phoneNumber = sc.nextLine();
            System.out.println("Enter email: ");
            email = sc.nextLine();
            List.add(new contact(firstName,lastName,phoneNumber,email));
        }
        else {
            System.out.println("\t Wrong password. \n");
        }
    }
    public void viewDetails(){
        for (contact con: List) {
            System.out.println(con);
        }
    }
    public void listContact(){
        for (contact con: List){
            System.out.println(con);
        }
        try {
            File myObj = new File("MyContact.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void updateInforByPhone(String number){
        Scanner sc = new Scanner(System.in);
        contact update = findByPhone(number);
        String firstName,lastName ,phoneNumber = update.getNumber(), email;
        if (update != null){
            System.out.println("New first name: ");
            firstName = sc.nextLine();
            System.out.println("New last name: ");
            lastName = sc.nextLine();
            System.out.println("New phone number: ");
            phoneNumber = sc.nextLine();
            System.out.println("New email: ");
            email = sc.nextLine();
            update.setFristName(firstName);
            update.setLastName(lastName);
            update.setPhoneNumber(phoneNumber);
            update.setEmail(email);
        }
        else System.out.println("This number is no that phone number: "+number);
    }
    public void removeByPhoneNumber(String number){
        contact c = null;
        int count = 0;
        do {
            c = findByPhone(number);
            if (c != null){
                count++;
                List.remove(c);
            }
        }
        while (c != null);
        if (count>0) System.out.println(count+" of Contact removed.");
        else System.out.println("Phone number not found.");
    }

    private contact findByPhone(String number) {
        for (int i=0; i<List.size();i++){
            if(number.equalsIgnoreCase(List.get(i).getNumber())){
                return List.get(i);
            }
        }
        return null;
    }
    void writeFile(){
        try {
            FileWriter writer = new FileWriter("MyContact.txt", true);
            for (contact c:List) {
                writer.write(String.valueOf((c))+"\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
