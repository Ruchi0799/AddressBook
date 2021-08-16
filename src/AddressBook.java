import java.util.Scanner;

class AddressBookComputation{
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public int ZipCode;
    public String PhoneNumber;
    public String Email;

    AddressBookComputation(String FirstName, String LastName, String Address, String City, String State, int ZipCode, String PhoneNumber, String Email)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.City=City;
        this.State=State;
        this.ZipCode=ZipCode;
        this.PhoneNumber=PhoneNumber;
        this.Email=Email;


    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "AddPersonContact{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", ZipCode=" + ZipCode +
                ", PhoneNumber=" + PhoneNumber +
                ", Email='" + Email + '\'' +
                '}';
    }

}

public class AddressBook {

    Scanner sc=new Scanner(System.in);
    public int number=0;
    public AddressBookComputation[] addressbook1array;
    public AddressBook()
    {
        System.out.println("How many contacts do you want to add?");
        int number=sc.nextInt();
        addressbook1array=new AddressBookComputation[number];
        for (int i=0;i<number;i++)
        {
            addContact();
        }
    }
    public void addContact()
    {
        System.out.println("Enter First name");
        String FirstName= sc.next();
        System.out.println("Enter Last name");
        String LastName= sc.next();
        System.out.println("Enter address");
        String Address= sc.next();
        System.out.println("Enter city");
        String City= sc.next();
        System.out.println("Enter state");
        String State= sc.next();
        System.out.println("Enter zip code");
        int ZipCode= sc.nextInt();
        System.out.println("Enter phone number");
        String PhoneNumber= sc.next();
        System.out.println("Enter Email");
        String Email= sc.next();

        addressbook1array[number]=new AddressBookComputation(FirstName,LastName,Address,City,State,ZipCode,PhoneNumber,Email);
        number++;

    }
    public void displayContact()
    {
        for(int i=0;i<addressbook1array.length;i++)
        {
            System.out.println(addressbook1array[i]);
        }
    }



    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESSBOOK!");

        AddressBook Bookbuilder=new AddressBook();



        Bookbuilder.displayContact();


    }
}
