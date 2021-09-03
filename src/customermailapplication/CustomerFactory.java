package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        Customer cus = null;
        switch(type){
            case "Delinquent" : cus = new DelinquentCustomer();
                                break;
            case "Mountain" : cus = new MountainCustomer();
                              break;
            case "Regular" : cus = new RegularCustomer();
                             break;
        }
        return cus; 
    }
}