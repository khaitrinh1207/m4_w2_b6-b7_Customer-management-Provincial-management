package com_codegym_md4_w2_b6.DAO;

import com_codegym_md4_w2_b6.model.Customer;
import com_codegym_md4_w2_b6.model.Province;
import com_codegym_md4_w2_b6.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerDAOImp implements CustomerDAO {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}

