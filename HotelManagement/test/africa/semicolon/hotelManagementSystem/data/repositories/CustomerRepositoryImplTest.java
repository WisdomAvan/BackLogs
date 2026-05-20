package africa.semicolon.hotelManagementSystem.data.repositories;

import africa.semicolon.hotelManagementSystem.data.models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {
    private CustomerRepositoryImpl customerRepositoryImpl;
    @BeforeEach
    void setUp(){
        customerRepositoryImpl = new CustomerRepositoryImpl();
    }

    @Test
    void findById_ShouldReturnGuest_WhenGuestExists(){
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setFirstName("wisdom");
        customer.setLastName("Anthony");
        customer.setEmail("wedss@gmma");
        customerRepositoryImpl.saveCustomer(customer);

        Customer seenCustomer = customerRepositoryImpl.findCustomerById(1L);
        assertNotNull(seenCustomer);
        assertEquals(1L,seenCustomer.getCustomerId());
        assertEquals("wisdom",seenCustomer.getFirstName());
        assertEquals("Anthony",seenCustomer.getLastName());
        assertEquals("wedss@gmma", seenCustomer.getEmail());

    }
    @Test
    void findAll_ShouldReturnThreeCustomers_WhenThreeCustomersExist(){
        Customer customer1 = new Customer();
        customer1.setCustomerId(1L);
        customer1.setFirstName("Wisdom");

        Customer customer2 = new Customer();
        customer2.setCustomerId(2L);
        customer2.setFirstName("John");

        Customer customer3 = new Customer();
        customer3.setCustomerId(3L);
        customer3.setFirstName("Mary");

        customerRepositoryImpl.saveCustomer(customer1);
        customerRepositoryImpl.saveCustomer(customer2);
        customerRepositoryImpl.saveCustomer(customer3);
        List<Customer> customers = customerRepositoryImpl.findAllCustomers();

        assertNotNull(customers);
        assertEquals(3, customers.size());

    }
    @Test
    void updateCustomer_ShouldUpdatePhone_WhenCustomerExists(){
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setFirstName("Wisdom");
        customer.setLastName("Anthony");
        customer.setPhoneNumber("0806712");

        customerRepositoryImpl.saveCustomer(customer);
        customer.setPhoneNumber("0819999");
        customerRepositoryImpl.updateCustomer(customer);

        Customer updatedCustomer = customerRepositoryImpl.findCustomerById(1L);

        assertNotNull(updatedCustomer);
        assertEquals("0819999",updatedCustomer.getPhoneNumber());

    }
    @Test
    void deleteCustomer_ShouldDeleteCustomer_WhenCustomerExists(){
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setFirstName("Wisdom");
        customer.setLastName("Anthony");
        customer.setEmail("wisdom@gmail.com");

        customerRepositoryImpl.saveCustomer(customer);

        long initialCount = customerRepositoryImpl.findAllCustomers().size();
        customerRepositoryImpl.deleteCustomerById(1L);

        Customer deletedCustomer = customerRepositoryImpl.findCustomerById(1L);
        assertNull(deletedCustomer);
        assertEquals(initialCount - 1, customerRepositoryImpl.findAllCustomers().size());




    }



}