package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierDAO, SupplierService  {
    SupplierDAO supplierDAO;
    public SupplierServiceImplJdbc(SupplierDAO supplierDAO){
        this.supplierDAO=supplierDAO;
    }
    @Override
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return -1;
    }
    @Override
    public void deleteSupplier(int supplierId) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Supplier getSupplierById(int supplierId) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void updateSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return null;
    }

    


}