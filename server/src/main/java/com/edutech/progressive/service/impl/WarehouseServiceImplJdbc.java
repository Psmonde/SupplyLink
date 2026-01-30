package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.WarehouseDAO;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc  implements WarehouseDAO, WarehouseService  {
    private WarehouseDAO warehouseDAO;

    public WarehouseServiceImplJdbc (WarehouseDAO warehouseDAO){
        this.warehouseDAO=warehouseDAO;
    }
   

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Warehouse> getAllWarehouse() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
       return new ArrayList<>();
    }
    

}
