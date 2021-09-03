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

public class AddressBook1 {

    Scanner sc = new Scanner(System.in);
    public int number = 0;
    public AddressBookComputation[] addressbook1array;

    public AddressBook1() {
        System.out.println("How many contacts do you want to add?");
        int number = sc.nextInt();
        addressbook1array = new AddressBookComputation[number];
        for (int i = 0; i < number; i++) {
            addContact();
        }
    }

    public void addContact() {

            System.out.println("Enter First name");
            String FirstName = sc.next();
            System.out.println("Enter Last name");
            String LastName = sc.next();
            System.out.println("Enter address");
            String Address = sc.next();
            System.out.println("Enter city");
            String City = sc.next();
            System.out.println("Enter state");
            String State = sc.next();
            System.out.println("Enter zip code");
            int ZipCode = sc.nextInt();
            System.out.println("Enter phone number");
            String PhoneNumber = sc.next();
            System.out.println("Enter Email");
            String Email = sc.next();

            addressbook1array[number] = new AddressBookComputation(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, Email);
            number++;

    }

    public void displayContact() {
        for (int i = 0; i < addressbook1array.length; i++) {
            System.out.println(addressbook1array[i]);
        }
    }

    public void EditContact() {
        System.out.println("Enter contact no whose details you want to edit");
        String Phonenumberedit = sc.next();

        for (int j = 0; j < number; j++) {
            if (Phonenumberedit.equals(addressbook1array[j].PhoneNumber)) {
                System.out.println("Enter First name");
                addressbook1array[j].FirstName = sc.next();
                System.out.println("Enter Last name");
                addressbook1array[j].LastName = sc.next();
                System.out.println("Enter address");
                addressbook1array[j].Address = sc.next();
                System.out.println("Enter city");
                addressbook1array[j].City = sc.next();
                System.out.println("Enter state");
                addressbook1array[j].State = sc.next();
                System.out.println("Enter zip code");
                addressbook1array[j].ZipCode = sc.nextInt();
                System.out.println("Enter Email");
                addressbook1array[j].Email = sc.next();


            }
        }

    }

    public void DeleteRecord() {
        System.out.println("Enter name whose contact you want to delete");
        String firstname1 = sc.next();
        for (int j = 0; j < number; j++) {
            if (firstname1.equals(addressbook1array[j].FirstName)) {
                addressbook1array[j].FirstName = "0";
                addressbook1array[j].LastName = "0";
                addressbook1array[j].Address = "0";
                addressbook1array[j].City = "0";
                addressbook1array[j].State = "0";
                addressbook1array[j].ZipCode = 0;
                addressbook1array[j].Email = "0";
                addressbook1array[j].PhoneNumber = "0";

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ADDRESSBOOK!");

        AddressBook Bookbuilder = new AddressBook();

        int end = 0;

        while (end != 1) {
            System.out.println("Select what do you want to do in address book /\n 1.Add contact /\n 2.DisplayContact /\n 3.Edit contact /\n 4.Delete Contact /\n 5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                   // Bookbuilder.addContact();
                    break;

                case 2:
                  //  Bookbuilder.displayContact();
                    break;

                case 3:
                    //Bookbuilder.EditContact();
                    break;

                case 4:
                    //Bookbuilder.DeleteRecord();
                    break;

                case 5:
                    end = 1;
                    break;
            }


        }
    }
}
