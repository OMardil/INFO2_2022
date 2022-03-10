package store;

public class Store {
	private String address;
    private String storeName;
    private int employeeCount;
    
    public Store() {
    	this("", "", 0);
    }
    
    public Store(String address, String storeName, int employeeCount){
        this.address = address;
        this.storeName = storeName;
        this.employeeCount = employeeCount;
    }
    
    public String toString(){
        String s1 = "Address: " + getAddress() + "\n" + 
        			"Store name: " + getStoreName() + "\n" + 
        			"Employee count: " + getEmployeeCount();
        return s1;
    }
    
    public void openShop() {
        System.out.println("Opening the doors");
        System.out.println("The store " + getStoreName() + " is now open!");
    }
    
    public void closeShop() {
        System.out.println("Closing the doors");
        System.out.println("The store " + getStoreName() + " is now closed!");
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    
}
