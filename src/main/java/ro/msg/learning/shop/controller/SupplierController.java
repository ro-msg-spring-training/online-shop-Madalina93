package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.msg.learning.shop.entities.Supplier;
import ro.msg.learning.shop.repositories.SupplierRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @PostMapping("/supplier")
    public Supplier createProduct(@Valid @RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
