package com.example.demo.controller;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/list")
    public String listCustomers(Model model) {
        var customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
