import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person owner = new Person("Sherry", 321413243);

        Address address = new Address("St no 75", "Lahore", "1234");

        PharmacyShop pharmacyShop = new PharmacyShop(owner, address, 10);

        while (true) {
            System.out.println("1. Display all medicines");
            System.out.println("2. Add a new medicine");
            System.out.println("3. Search medicine by its Name");
            System.out.println("4. Search medicine by ID");
            System.out.println("5. Update Existing medicine details");
            System.out.println("6. Sell a medicine");
            System.out.println("7. Search for a medicine by its Name");
            System.out.println("8. Expired Medicines");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pharmacyShop.displayAllMedicines();
                    break;
                case 2:
                    System.out.print("Enter medicine ID: ");
                    String medicineId = scanner.next();
                    System.out.print("Enter medicine name: ");
                    String name = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter manufacturer: ");
                    String manufacturer = scanner.next();
                    System.out.print("Enter batch number: ");
                    String batchNumber = scanner.next();
                    System.out.print("Enter expiry date (day month year): ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    int year = scanner.nextInt();
                    Date expiryDate = new Date(day, month, year);
                    pharmacyShop.addMedicine(new Medicine(medicineId, name, price, quantity, manufacturer, batchNumber, expiryDate));
                    break;
                case 3:
                    System.out.print("Enter medicine name to search: ");
                    name = scanner.next();
                    pharmacyShop.searchMedicine(name);
                    break;
                case 4:
                    System.out.println("Enter medicine Id to search");
                    medicineId = scanner.next();
                    pharmacyShop.searchMedicine(medicineId);
                    break;
                case 5:
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}