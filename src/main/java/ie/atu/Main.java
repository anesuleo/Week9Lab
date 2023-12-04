package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Person myPerson = new Person("Anesu", "Harare", "669011");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer("Anesu", "Mabelreign", "123", "96CA", true);
        System.out.println(myCustomer.toString());

        Customer Part2 = new Customer();
        Part2.setName("Tariro");
        Part2.setAddress("Rydale Ridge");
        Part2.setPhone("948658");
        Part2.setCustomerNo("74CA");
        Part2.setMailingList(true);

        System.out.println("Name: " + Part2.getName());
        System.out.println("Address: " + Part2.getAddress());
        System.out.println("Phone: " + Part2.getPhone());
        System.out.println("Customer No: " + Part2.getCustomerNo());
        System.out.println("Mailing List: " + Part2.isMailingList());
    }
}