package brigelabz.addressbook;

public class Contact {

    private String first_name;
    private  String last_name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone_nuber;
    private String email;

    public Contact(String first_name,String last_name,String address,String city,String state,int zip,long phone_number,String email ){
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone_nuber=phone_number;
        this.email=email;

    }
 public String get_first_name(){
        return  first_name;
 }

 public void setFirst_name(String first_name){
        this.first_name=first_name;
 }

 public String get_last_name(){
        return last_name;
 }

 public void setLast_name(String last_name){
        this.last_name=last_name;
 }

 public String get_address(){
        return  address;
 }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phone_nuber;
    }

    public void setPhoneNumber(long phone_nuber) {
        this.phone_nuber = phone_nuber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
