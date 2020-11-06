package com.example.demo.services;

import com.example.demo.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
}
