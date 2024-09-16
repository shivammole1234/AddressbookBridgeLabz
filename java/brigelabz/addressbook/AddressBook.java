package brigelabz.addressbook;
import  java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public ArrayList<Contact> contacts;

    public AddressBook(){
        contacts=new ArrayList<>();
    }

    public void  add_contact(Contact contact){
        contacts.add(contact);
    }

    // method to find a contact by first name
    public Contact find_contact_by_first_name(String first_name){
        for(Contact contact:contacts){
            if(contact.get_first_name().equalsIgnoreCase(first_name)){
                return contact;
            }
        }
        return null;
    }

    // method to edit contact return by find_cntact_by_first_name

    public boolean edit_contact(String first_name){
        Contact contact = find_contact_by_first_name(first_name);
        if(contact != null){
            // add new details
            Scanner scanner = new Scanner(System.in);
            System.out.println("Editing contact for " + first_name);
            System.out.print("Enter new Last Name: ");
            contact.setLast_name(scanner.nextLine());
            System.out.print("Enter new Address: ");
            contact.setAddress(scanner.nextLine());
            System.out.print("Enter new City: ");
            contact.setCity(scanner.nextLine());
            System.out.print("Enter new State: ");
            contact.setState(scanner.nextLine());
            System.out.print("Enter new ZIP Code: ");
            contact.setZip(scanner.nextInt());
            System.out.print("Enter new Phone Number: ");
            contact.setPhoneNumber(scanner.nextLong());
            scanner.nextLine(); // Consume newline
            System.out.print("Enter new Email: ");
            contact.setEmail(scanner.nextLine());

            return true; // updated
        } else{
            return false;  // updatation failed
        }
    }


    public void display_contact(){
        for(Contact contact :contacts){
            System.out.println("Name: " + contact.get_first_name() + " " + contact.get_last_name());
            System.out.println("Address: " + contact.get_address());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());
            System.out.println("ZIP: " + contact.getZip());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("------------------------------");
        }
    }

}
