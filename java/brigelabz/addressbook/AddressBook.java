package brigelabz.addressbook;
import  java.util.ArrayList;
public class AddressBook {
    public ArrayList<Contact> contacts;

    public AddressBook(){
        contacts=new ArrayList<>();
    }

    public void  add_contact(Contact contact){
        contacts.add(contact);
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
