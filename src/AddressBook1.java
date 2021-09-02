
    import java.util.Iterator;
    import java.util.LinkedList;
    import java.util.Scanner;

    class AddressBookCollection{
        public String FirstName;
        public String LastName;
        public String Address;
        public String City;
        public String State;
        public int ZipCode;
        public String PhoneNumber;
        public String Email;

        AddressBookCollection(String FirstName, String LastName, String Address, String City, String State, int ZipCode, String PhoneNumber, String Email)
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
        public LinkedList<AddressBookCollection> addressbook=new LinkedList<AddressBookCollection>();
        

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

            AddressBookCollection addressBookCollection=new AddressBookCollection(FirstName,LastName,Address,City,State,ZipCode,PhoneNumber,Email);

            addressbook.add(addressBookCollection);



        }

        public void displayContact() {

            for (int i=0;i<addressbook.size();i++) {
                System.out.println(addressbook.get(i));
            }

        }

        public void EditContact() {
            System.out.println("Enter contact no whose details you want to edit");
            String Phonenumberedit = sc.next();

            for (int j = 0; j < addressbook.size(); j++) {
              if (addressbook.get(j).PhoneNumber.equals(Phonenumberedit)) {
                    System.out.println("Enter First name");
                  addressbook.get(j).FirstName = sc.next();
                    System.out.println("Enter Last name");
                  addressbook.get(j).LastName = sc.next();
                    System.out.println("Enter address");
                  addressbook.get(j).Address = sc.next();
                    System.out.println("Enter city");
                  addressbook.get(j).City = sc.next();
                    System.out.println("Enter state");
                  addressbook.get(j).State = sc.next();
                    System.out.println("Enter zip code");
                  addressbook.get(j).ZipCode = sc.nextInt();
                    System.out.println("Enter Email");
                  addressbook.get(j).Email = sc.next();


                }
            }

        }

        public void DeleteRecord() {
            System.out.println("Enter name whose contact you want to delete");
            String firstname1 = sc.next();
            Iterator itr=addressbook.iterator();
            for(int i=0;i<addressbook.size();i++)
            {
                if (addressbook.get(i).FirstName.equals(firstname1))
                {
                    addressbook.remove(i);
                   // addressbook.get(i).FirstName="aha";
                }


            }


                }
            }


