package brigelabz.addressbook;
import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook addressBook=new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Choose an option:");
            System.out.println("1. Add new contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Display All cotacts");
            System.out.println("4. EXit");
            System.out.println("Enter the choice:- ");
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise){

                case 1:
                    // add new contact
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("State: ");
                    String state = scanner.nextLine();
                    System.out.print("ZIP Code: ");
                    int zip = scanner.nextInt();
                    System.out.print("Phone Number: ");
                    long phoneNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.add_contact(newContact);
                    System.out.println("contact added successfully!");
                    break;

                case 2:
                    // edit contact
                    System.out.println("emter the first name to search contact for edit");
                    String edit_first_name=scanner.nextLine();

                    boolean is_edited= addressBook.edit_contact(edit_first_name);
                    if(is_edited)
                        System.out.println("contact updated");
                    else
                        System.out.println("contact not found");

                    break;

                case 3:
                    // display all contact

                    System.out.println("All Contact");
                    addressBook.display_contact();
                    break;

                case 4:
                    // exit the program
                    System.out.println("exiting the program");
                    scanner.close();
                    return; // this statement exit the main method

                default:
                    System.out.println("invalid coise.please select a valid option");
                    break;
            }
        }
    }
}
