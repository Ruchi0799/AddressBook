import java.util.Scanner;

public class AddressBookLlRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBookUsingLinkedlist abc = new AddressBookUsingLinkedlist();
        Scanner sc = new Scanner(System.in);
        abc.addNewBook();
        int flag = 0;
        while (flag == 0) {
            System.out.println("****MENU**** \n1. Add a contact\n2. Add new Book \n 3.Print Book \n 4.Edit Record \n 5.Delete Record \n 6.Search Contact \n 7.View person by citystate \n 8.Count person by CItystate \n 9.Sort list by name \n 10.Sort by city/state/zip \n 10. End");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    abc.addContact();
                    break;

                case 2:
                    abc.addNewBook();
                    break;

                case 3:
                    abc.printAllBooks();
                    break;

                case 4:
                    abc.editContact();
                    break;

                case 5:
                    abc.deleteRecord();
                    break;

                case 6:
                    abc.searchContact();
                    break;

                case 7:
                    abc.viewPersonByCityState();
                    break;

                case 8:
                    abc.countPersonsCityState();
                    break;

                case 9:
                    abc.sortList();
                    break;

                case 10:
                    abc.sortCityZipState();
                    break;

                case 11:
                    System.out.println("Ending");
                    flag = 1;
                    break;
            }
        }
    }
}