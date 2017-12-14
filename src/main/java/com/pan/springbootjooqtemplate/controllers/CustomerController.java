package com.pan.springbootjooqtemplate.controllers;

import com.pan.springbootjooqtemplate.jooq.tables.records.CustomerRecord;
import com.pan.springbootjooqtemplate.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by panjingping on 12/14/2017.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="") String name, Model model) {
        model.addAttribute("name", name);
        List<CustomerRecord> customers = customerService.searchByName(name);
        model.addAttribute("customer",customers);
        return "customer";
    }
}
