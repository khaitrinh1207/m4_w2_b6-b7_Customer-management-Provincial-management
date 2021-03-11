package com_codegym_md4_w2_b6.repository;

import com_codegym_md4_w2_b6.model.Customer;
import com_codegym_md4_w2_b6.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
