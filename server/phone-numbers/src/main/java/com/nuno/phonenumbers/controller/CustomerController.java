package com.nuno.phonenumbers.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuno.phonenumbers.config.DBConfig;
import com.nuno.phonenumbers.model.Customer;
import java.util.List;

@RestController 
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1")
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getAllEmployees() {
    	
        return  DBConfig.getCustomers();
        
    }
    
}
