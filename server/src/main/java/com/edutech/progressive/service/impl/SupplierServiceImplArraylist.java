package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService{

    private List<Supplier> supplierList= new ArrayList<>();

    @Override
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteSupplier(int supplierId) {
        // TODO Auto-generated method stub
        SupplierService.super.deleteSupplier(supplierId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        SupplierService.super.emptyArrayList();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        // TODO Auto-generated method stub
        return SupplierService.super.getSupplierById(supplierId);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        SupplierService.super.updateSupplier(supplier);
    }
    


    

}