import java.util.Scanner;

class AddPersonContact{
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public int ZipCode;
    public long PhoneNumber;
    public String Email;

    AddPersonContact(String FirstName, String LastName, String Address, String City, String State, int ZipCode, long PhoneNumber, String Email)
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
    public void PrintPersonDetails()
    {
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Address);
        System.out.println(City);
        System.out.println(State);
        System.out.println(ZipCode);
        System.out.println(PhoneNumber);
        System.out.println(Email);
    }
}

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESSBOOK!");
        Scanner sc=new Scanner(System.in);
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
        long PhoneNumber= sc.nextLong();
        System.out.println("Enter Email");
        String Email= sc.next();
        AddPersonContact Ruchi=new AddPersonContact(FirstName,LastName,Address,City,State,ZipCode,PhoneNumber,Email);
        Ruchi.PrintPersonDetails();
        //Ruchi.AddPersonContact(FirstName,LastName,Address,City,State,ZipCode,PhoneNumber,Email);

    }
}
