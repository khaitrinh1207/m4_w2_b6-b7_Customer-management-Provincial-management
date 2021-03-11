package com_codegym_md4_w2_b6.DAO;

import com_codegym_md4_w2_b6.model.Customer;
import com_codegym_md4_w2_b6.model.Province;

public interface CustomerDAO {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
