package africa.semicolon.hotelManagementSystem.data.repositories;

import africa.semicolon.hotelManagementSystem.data.models.Customer;

import java.util.List;

public interface CustomerRepository {
    void saveCustomer(Customer customer);
    Customer findCustomerById(long id);
    List<Customer > findAllCustomers();
    Customer updateCustomer(Customer newUpdatedcustomer);
    void deleteCustomerById(Long customerId);
}