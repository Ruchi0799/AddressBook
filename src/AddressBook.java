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

    /* public void PrintPersonDetails()
    {
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Address);
        System.out.println(City);
        System.out.println(State);
        System.out.println(ZipCode);
        System.out.println(PhoneNumber);
        System.out.println(Email);
    } */
}

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESSBOOK!");
        AddressBookComputation addressBook[]=new AddressBookComputation[2];
        AddressBookComputation book1=new AddressBookComputation("Ruchi","Mandve","Sanpada","Navi Mumbai","Maharashtra",400705,"9892735509","ruchimandve07@gmail.com");
        AddressBookComputation book2=new AddressBookComputation("Prajakta","Tambe","Kalamboli","Panvel","Maharashtra",400703,"9987365780","prajtambe@gmail.com");

        addressBook[0]=book1;
        addressBook[1]=book2;

        for (int i=0;i< addressBook.length;i++)
        {
            System.out.println(addressBook[i]);
        }



        /* Scanner sc=new Scanner(System.in);
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
        //Ruchi.AddPersonContact(FirstName,LastName,Address,City,State,ZipCode,PhoneNumber,Email); */

    }
}
