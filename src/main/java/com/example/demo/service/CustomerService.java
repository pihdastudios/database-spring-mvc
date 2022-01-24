package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    public Customer getCustomer(int id);
}
