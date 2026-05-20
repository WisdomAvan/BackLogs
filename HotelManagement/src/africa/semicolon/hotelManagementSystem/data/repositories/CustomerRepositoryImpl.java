package africa.semicolon.hotelManagementSystem.data.repositories;

import africa.semicolon.hotelManagementSystem.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customerData = new ArrayList<>();

    @Override
    public void saveCustomer(Customer customer) {
        customerData.add(customer);
    }

    @Override
    public Customer findCustomerById(long customerId) {
        for (Customer customer : customerData) {
            if (customer.getCustomerId() != null && customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
    @Override
    public List<Customer> findAllCustomers() {
        return customerData;
    }
    @Override
    public Customer updateCustomer(Customer newUpdatedcustomer) {
        for (int index = 0; index < customerData.size(); index++) {

            Customer existingCustomer = customerData.get(index);

            if (existingCustomer.getCustomerId().equals(newUpdatedcustomer.getCustomerId())) {

                customerData.set(index, newUpdatedcustomer);

                return newUpdatedcustomer;
            }
        }

        return null;
    }
    @Override
    public void deleteCustomerById(Long customerId) {
        Customer customer =findCustomerById(customerId);
        if (customer != null) {
            customerData.remove(customer);
        }
    }
}
