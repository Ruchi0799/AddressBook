
    import java.util.*;

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
        //        public LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        public int number = 0;
        public LinkedList<AddressBookCollection> addressbook = new LinkedList<AddressBookCollection>();

        public LinkedList<AddressBookCollection> collegeFriends = new LinkedList<AddressBookCollection>();
        public LinkedList<AddressBookCollection> schoolFriends = new LinkedList<AddressBookCollection>();


//        //public void createAdressBook(String name){
//            LinkedHashMap<String, LinkedList> lhm = new LinkedHashMap<String, LinkedList>();
//
//            lhm.put("CommonAddressBook",addressbook);
//
//        }

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

            System.out.println("In which addressBook you want to add 1.Common Address book 2. School friends 3.College friends");
            int i = sc.nextInt();
            AddressBookCollection addressBookCollection = new AddressBookCollection(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, Email);
            if (i == 1) {

                
                addressbook.add(addressBookCollection);
            } else if (i == 2) {
                schoolFriends.add(addressBookCollection);
            } else if (i == 3) {
                collegeFriends.add(addressBookCollection);
            }


        }

        public void displayContact() {
            System.out.println("which addressBook you want to display 1.Common Address book 2. School friends 3.College friends");
            int j = sc.nextInt();
            if (j == 1) {
                for (int i = 0; i < addressbook.size(); i++) {
                    System.out.println(addressbook.get(i));
                }

            } else if (j == 2) {
                for (int i = 0; i < schoolFriends.size(); i++) {
                    System.out.println(addressbook.get(i));
                }

            } else if (j == 3) {
                for (int i = 0; i < collegeFriends.size(); i++) {
                    System.out.println(addressbook.get(i));
                }

            }


        }

        public void EditContact() {

            System.out.println("In which addressBook you want to Edit 1.Common Address book 2. School friends 3.College friends");
            int j = sc.nextInt();
            System.out.println("Enter contact no whose details you want to edit");
            String Phonenumberedit = sc.next();

            if (j == 1) {
                for (int k = 0; k < addressbook.size(); k++) {
                    if (addressbook.get(k).PhoneNumber.equals(Phonenumberedit)) {
                        System.out.println("Enter First name");
                        addressbook.get(k).FirstName = sc.next();
                        System.out.println("Enter Last name");
                        addressbook.get(k).LastName = sc.next();
                        System.out.println("Enter address");
                        addressbook.get(k).Address = sc.next();
                        System.out.println("Enter city");
                        addressbook.get(k).City = sc.next();
                        System.out.println("Enter state");
                        addressbook.get(k).State = sc.next();
                        System.out.println("Enter zip code");
                        addressbook.get(k).ZipCode = sc.nextInt();
                        System.out.println("Enter Email");
                        addressbook.get(k).Email = sc.next();


                    }
                }

            }

            if (j == 2) {
                for (int k = 0; k < schoolFriends.size(); k++) {
                    if (schoolFriends.get(k).PhoneNumber.equals(Phonenumberedit)) {
                        System.out.println("Enter First name");
                        schoolFriends.get(k).FirstName = sc.next();
                        System.out.println("Enter Last name");
                        schoolFriends.get(k).LastName = sc.next();
                        System.out.println("Enter address");
                        schoolFriends.get(k).Address = sc.next();
                        System.out.println("Enter city");
                        schoolFriends.get(k).City = sc.next();
                        System.out.println("Enter state");
                        schoolFriends.get(k).State = sc.next();
                        System.out.println("Enter zip code");
                        schoolFriends.get(k).ZipCode = sc.nextInt();
                        System.out.println("Enter Email");
                        schoolFriends.get(k).Email = sc.next();


                    }
                }
            }

            if (j == 3) {
                for (int k = 0; k < collegeFriends.size(); k++) {
                    if (collegeFriends.get(k).PhoneNumber.equals(Phonenumberedit)) {
                        System.out.println("Enter First name");
                        collegeFriends.get(k).FirstName = sc.next();
                        System.out.println("Enter Last name");
                        collegeFriends.get(k).LastName = sc.next();
                        System.out.println("Enter address");
                        collegeFriends.get(k).Address = sc.next();
                        System.out.println("Enter city");
                        collegeFriends.get(k).City = sc.next();
                        System.out.println("Enter state");
                        collegeFriends.get(k).State = sc.next();
                        System.out.println("Enter zip code");
                        collegeFriends.get(k).ZipCode = sc.nextInt();
                        System.out.println("Enter Email");
                        collegeFriends.get(k).Email = sc.next();


                    }
                }

            }
        }

        public void DeleteRecord() {
            System.out.println("In which addressBook you want to Edit 1.Common Address book 2. School friends 3.College friends");
            int j = sc.nextInt();
            System.out.println("Enter name whose contact you want to delete");
            String firstname1 = sc.next();

            if (j == 1) {
                for (int i = 0; i < addressbook.size(); i++) {
                    if (addressbook.get(i).FirstName.equals(firstname1)) {
                        addressbook.remove(i);
                        // addressbook.get(i).FirstName="aha";
                    }


                }


            }
            if (j == 2) {
                for (int i = 0; i < schoolFriends.size(); i++) {
                    if (schoolFriends.get(i).FirstName.equals(firstname1)) {
                        schoolFriends.remove(i);
                        // addressbook.get(i).FirstName="aha";
                    }


                }


            }
            if (j == 3) {
                for (int i = 0; i < collegeFriends.size(); i++) {
                    if (collegeFriends.get(i).FirstName.equals(firstname1)) {
                        collegeFriends.remove(i);
                        // addressbook.get(i).FirstName="aha";
                    }


                }


            }
        }
    }


