
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookContact {

    Scanner sc = new Scanner(System.in);
    ArrayList<AddressBookContact> book;
    ArrayList<ArrayList<AddressBookContact>> addBooks = new ArrayList<ArrayList<AddressBookContact>>();

    String firstName;
    String lastName;
    String address;
    String state;
    String city;
    String email;
    String zipCode;
    String phoneNumber;

    public void addAnotherContactBook(){
        addBooks.add(book = new ArrayList<AddressBookContact>());
    }

    public void printTotalNumberOfAddressBook(){
        System.out.println(addBooks.size());
    }

    public void whichAddressBookToPrint(){
        System.out.print("Enter index of address book :- ");
        int number = sc.nextInt();
        for (int i=0; i<addBooks.get(number).size() ;i++) {
            System.out.println("Contact " + (i+1) +"\n");
            System.out.println((addBooks.get(number)).get(i).firstName);
            System.out.println((addBooks.get(number)).get(i).lastName);
            System.out.println((addBooks.get(number)).get(i).address);
            System.out.println((addBooks.get(number)).get(i).state);
            System.out.println((addBooks.get(number)).get(i).city);
            System.out.println((addBooks.get(number)).get(i).email);
            System.out.println((addBooks.get(number)).get(i).zipCode);
            System.out.println((addBooks.get(number)).get(i).phoneNumber);
            System.out.println((addBooks.get(number)).get(i).email);
        }
    }

    AddressBookContact(){

    }

    AddressBookContact(String firstName, String lastName, String address, String state, String city, String email, String zipCode, String phoneNumber){
        this.firstName = firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.phoneNumber=phoneNumber;
        this.email= email ;
    }

    public void scan(){
        System.out.print("Enter your first name :- ");
        firstName = sc.nextLine();


            //System.out.println("Contact already present");


            System.out.print("Enter your last name :- ");
            lastName = sc.nextLine();
            System.out.print("Enter your address :- ");
            address = sc.nextLine();
            System.out.print("Enter your city :- ");
            city = sc.nextLine();
            System.out.print("Enter your state:- ");
            state = sc.nextLine();
            System.out.print("Enter your zip code :- ");
            zipCode = sc.nextLine();
            System.out.print("Enter your phone number :- ");
            phoneNumber = sc.nextLine();
            System.out.print("Enter your email :- ");
            email = sc.nextLine();

    }

    public void addContact(){
        System.out.println("Enter the details of contact :- ");
        scan();
        AddressBookContact ab = new AddressBookContact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        boolean value=checkDuplicateContact(firstName);
        if(value==true) {
            System.out.println("Contact already present");
        }
        else {
            book.add(ab);
        }
    }

    public void editContact(){
        System.out.print("Enter name of person whose you want to edit :- ");
        String name = sc.nextLine();
        int i;
        for (i=0 ; i<book.size(); i++){
            if (book.get(i).firstName.equals(name)){
                scan();
                break;
            }
        }
        AddressBookContact abc = new AddressBookContact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        book.set(i,abc);
    }

    public boolean checkDuplicateContact(String firstName){

        int i;
        for (i=0 ; i<book.size(); i++){
            if (book.get(i).firstName.equals(this.firstName)){
                return true;
            }

        }
        return false;
    }


    public void deleteContact(){
        System.out.print("Enter name of person whose you want to delete :- ");
        String name = sc.nextLine();
        int i;
        for (i=0 ; i<book.size(); i++){
            if (book.get(i).firstName.equals(name)){
                book.remove(i);
                break;
            }
        }

    }

    public void printBook(){
        for (int i=0; i<book.size(); i++){
            System.out.println("Contact "+(i+1) +"\n");
            System.out.println("First name "+book.get(i).firstName);
            System.out.println("Last Name "+book.get(i).lastName);
            System.out.println("Address "+book.get(i).address);
            System.out.println("City "+book.get(i).city);
            System.out.println("State "+book.get(i).state);
            System.out.println("Zipcode "+book.get(i).zipCode);
            System.out.println("Phone Number "+book.get(i).phoneNumber);
            System.out.println("Email id "+book.get(i).email);
            System.out.println();
        }
    }

}



