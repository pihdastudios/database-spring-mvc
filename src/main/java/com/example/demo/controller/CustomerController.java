package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model model) {
        var customers = customerDAO.findAllByOrderByLastNameAsc();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
