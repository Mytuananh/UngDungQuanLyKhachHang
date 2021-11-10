package customer.manager.service;

import customer.manager.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Thao","thaohihi@gmail.com","Phu Tho"));
        customers.put(2, new Customer(2,"Toan","toanhihi@gmail.com","Vinh Yen"));
        customers.put(3, new Customer(3,"Dinh","dinhhihi@gmail.com","Nam Dinh"));
        customers.put(4, new Customer(4,"Truong","truonghihi@gmail.com","Quang Ninh"));
        customers.put(5, new Customer(5,"Cuong","cuonghihi@gmail.com","Thai Nguyen"));
        customers.put(6, new Customer(6,"Long","longhihi@gmail.com","Ha Noi"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
