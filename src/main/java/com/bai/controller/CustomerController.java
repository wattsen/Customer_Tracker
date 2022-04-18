package com.bai.controller;

import com.bai.dao.CustomerDao;
import com.bai.entity.Customer;
import com.bai.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

//    final
//    CustomerService customerService;
//
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

    @Autowired
    private CustomerDao customerDao;

//    @GetMapping()
//    private String showCustomers(Model model) {
//        model.addAttribute("customers", customerService.list());
//        return "index";
//    }

    @GetMapping()
    private String showCustomers(Model model) {
        List<Customer> customers = customerDao.getCustomers();
        model.addAttribute("customers", customers);
        return "index";
    }

}
