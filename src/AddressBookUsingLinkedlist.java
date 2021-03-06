import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class AddressBookComputation1{
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public int ZipCode;
    public String PhoneNumber;
    public String Email;

    AddressBookComputation1(String FirstName, String LastName, String Address, String City, String State, int ZipCode, String PhoneNumber, String Email)
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
                "}\n";
    }

}
public class AddressBookUsingLinkedlist {

    Scanner sc = new Scanner(System.in);
    public LinkedList<AddressBookComputation1> singlebook;
    public LinkedList<LinkedList<AddressBookComputation1>> allBooks=new LinkedList<LinkedList<AddressBookComputation1>>();
   // public Map<String,LinkedList<AddressBookComputation1>> cityDict=new HashMap<String,LinkedList<AddressBookComputation1>>();
    LinkedList<AddressBookComputation1> values=new LinkedList<AddressBookComputation1>();
    public Map<AddressBookComputation1, String> cityDict=new HashMap<AddressBookComputation1, String>();
    public HashMap<String, String> personInCity = new HashMap<String, String>();
    public HashMap<String, String> personInState = new HashMap<String, String>();

    public void addNewBook(){
        singlebook=new LinkedList<AddressBookComputation1>();
        allBooks.add(singlebook);
    }

    public void addContact(){
        System.out.println("At which index you want to add:from 0 to "+allBooks.size());
        int index1=sc.nextInt();
        System.out.println("Enter First name");
        String FirstName = sc.next();
        boolean value=duplicateContact(FirstName);
        if(value==true)
        {
            System.out.println("Contact already present");
        }
        else {
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
            AddressBookComputation1 addressBookComputation1 = new AddressBookComputation1(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, Email);
            allBooks.get(index1).add(addressBookComputation1);
            String value1 = FirstName+ " " +LastName;
            personInCity.put(value1, City);
            personInState.put(value1, State);
        }
        }

    public void viewPersonByCityState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("View person by 1.City 2.State: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            personInCity.keySet().stream().forEach(n -> {
                System.out.println(n + " lives in: " + personInCity.get(n));
            });
        }
        else {
            personInState.keySet().stream().forEach(n -> {
                System.out.println(n + " lives in: " + personInState.get(n));
            });
        }
       
    }



    public boolean duplicateContact(String FirstName) {

        ArrayList<String> duplicateCheck = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            for (int j = 0; j < singlebook.size(); j++) {
                duplicateCheck.add(allBooks.get(i).get(j).FirstName);
            }
        }
        if (duplicateCheck.stream().anyMatch(n -> FirstName.equals(n))) return true;
        return false;
    }
    public void printAllBooks(){
        for(int i=0;i<allBooks.size();i++) {
            System.out.println("Print contact of Book: "+i+1);
            System.out.println(allBooks.get(i));
        }
    }

    public void deleteRecord(){
        System.out.println("Enter Name of contact you want to delete");
        String FirstName= sc.next();
        for(int i=0;i<allBooks.size();i++){
            for (int j=0;j<singlebook.size();j++){
                if(allBooks.get(i).get(j).FirstName==FirstName);
                allBooks.get(i).remove(j);
            }
    }
    }

    public void searchContact() {
        System.out.println("Enter state of contact you want to search");
        String state = sc.next();

        for (int i = 0; i < allBooks.size(); i++) {
            //for (int j = 0; j < singlebook.size(); j++) {
                allBooks.get(i).stream().forEach(n -> {
                    if (state.equals(n.State)){
                        System.out.println(n);
                    }
                });
            }
        }

    public void editContact() {
        System.out.println("Enter Name of contact you want to edit");
        String FirstName = sc.next();
        for (int i = 0; i < allBooks.size(); i++) {
            for (int j = 0; j < singlebook.size(); j++) {
                if (allBooks.get(i).get(j).FirstName.equals(FirstName)) {
                    System.out.println("Enter First name");
                    allBooks.get(i).get(j).FirstName = sc.next();
                    System.out.println("Enter Last name");
                    allBooks.get(i).get(j).LastName = sc.next();
                    System.out.println("Enter address");
                    allBooks.get(i).get(j).Address = sc.next();
                    System.out.println("Enter city");
                    allBooks.get(i).get(j).City = sc.next();
                    System.out.println("Enter state");
                    allBooks.get(i).get(j).State = sc.next();
                    System.out.println("Enter zip code");
                    allBooks.get(i).get(j).ZipCode = sc.nextInt();
                    System.out.println("Enter Email");
                    allBooks.get(i).get(j).Email = sc.next();
                    personInCity.put(singlebook.get(j).FirstName + " " + singlebook.get(j).LastName, singlebook.get(j).City);
                    personInState.put(singlebook.get(j).FirstName + " " + singlebook.get(j).LastName, singlebook.get(j).State);

                }

            }
        }
    }

    public void sortCityZipState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Search According to 1.City 2.State 3.Zip");
        int input = sc.nextInt();
        switch(input) {
            case 1:
                for (int i = 0; i < allBooks.size(); i++) {
                    List sortedListCity= allBooks.get(i).stream().sorted(((o1, o2) -> o1.City.compareTo(o2.City))).collect(Collectors.toList());
                    System.out.println(sortedListCity);

                }
                break;

            case 2:
                for (int i = 0; i < allBooks.size(); i++) {
                    List sortedListState= allBooks.get(i).stream().sorted(((o1, o2) -> o1.State.compareTo(o2.State))).collect(Collectors.toList());
                    System.out.println(sortedListState);

                }
                break;

            case 3:
                for (int i = 0; i < allBooks.size(); i++) {
                    List sortedListZip= allBooks.get(i).stream().sorted(Comparator.comparingInt(AddressBookComputation1::getZipCode)).collect(Collectors.toList());
                    System.out.println(sortedListZip);

                }
                break;
        }
    }


    public void sortList() {
        ArrayList<String> duplicateCheck = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
           List sortedList= allBooks.get(i).stream().sorted(((o1, o2) -> o1.FirstName.compareTo(o2.FirstName))).collect(Collectors.toList());
            System.out.println(sortedList);

        }
    }

    public void countPersonsCityState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to view persons of 1.City 2.State");
        int input = sc.nextInt();

        if (input==1) {
            Map<String, Long> count = personInCity.values().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            count.keySet().stream().forEach(n -> {
                System.out.println(n + " : " + count.get(n));
            });
        }
        else {
            Map<String, Long> count = personInState.values().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            count.keySet().stream().forEach(n -> {
                System.out.println(n + " : " + count.get(n));
            });
        }

        }
    }





