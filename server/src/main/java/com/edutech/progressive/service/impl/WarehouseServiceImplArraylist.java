package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {
    private List<Warehouse> warehouseList= new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }
    @Override
    public void emptyArrayList() {
        
    }

    
    

}