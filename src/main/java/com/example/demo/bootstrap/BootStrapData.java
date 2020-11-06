package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("bawwa");
        c1.setLastname("Rathnayaka");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("danushka");
        c2.setLastname("Rathnayaka");
        customerRepository.save(c2);

        System.out.println("Customer Saved: " + customerRepository.count());

    }
}
