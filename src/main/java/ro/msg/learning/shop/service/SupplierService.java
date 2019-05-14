package ro.msg.learning.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ro.msg.learning.shop.entities.Supplier;
import ro.msg.learning.shop.repositories.SupplierRepository;



@Service
@RequiredArgsConstructor
public class SupplierService implements SupplierServiceInterface{

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier createProduct(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
