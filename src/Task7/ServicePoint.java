package Task7;

import java.util.ArrayList;

public class ServicePoint {

    private ArrayList<Customer> customers;

    public ServicePoint() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer removeCustomer() {
        if (customers.size() > 0) {
            return customers.remove(0);
        }

        return null;
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }
}
