public class Medicine {
    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private String name;
    private Date expiryDate;
    private int quantity;
    private double price;

    public Medicine(String medicineId, String name, double price, int quantity, String manufacturer, String batchNumber, Date expiryDate) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.name = name;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayInformation() {
        System.out.println("Medicine ID: " + medicineId);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Name: " + name);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

