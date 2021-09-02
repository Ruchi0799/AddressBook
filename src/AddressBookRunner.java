import java.util.Scanner;

public class AddressBookRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ADDRESSBOOK!");

        AddressBook1 Bookbuilder = new AddressBook1();

        int end = 0;

        while (end != 1) {
            System.out.println("Select what do you want to do in address book /\n 1.Add contact /\n 2.DisplayContact /\n 3.Edit contact /\n 4.Delete Contact /\n 5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Bookbuilder.addContact();
                    break;

                case 2:
                    Bookbuilder.displayContact();
                    break;

                case 3:
                   Bookbuilder.EditContact();
                    break;

                case 4:
                    Bookbuilder.DeleteRecord();
                    break;

                case 5:
                    end = 1;
                    break;
            }


        }
    }
}


