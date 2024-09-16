package brigelabz.addressbook;
import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook addressBook=new AddressBook();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter First Name: ");
        String first_name = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String last_name = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        System.out.println("Enter ZIP Code: ");
        int zip = scanner.nextInt();
        System.out.println("Enter Phone Number: ");
        long phone_number = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        // ceating the object of contact
        Contact contact =new Contact(first_name,last_name,address,city,state,zip,phone_number,email);

        addressBook.add_contact(contact); // adding it to addressbook via object in list
        System.out.println("contact added successfully");
        System.out.println("All contact are:-");
        addressBook.display_contact();// display all contact



    }
}
