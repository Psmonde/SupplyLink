package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {
    private List<Warehouse> warehouseList= new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        warehouseList.add(warehouse);
        return warehouseList.size();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return warehouseList;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedList = new ArrayList<>(warehouseList);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList;
    }
    @Override
    public void emptyArrayList() {
         warehouseList.clear();
        
    }



   
    public List<Warehouse> getAllWarehouseSortedByName() {
        List<Warehouse> sortedList=new ArrayList<>(warehouseList);
        Collections.sort(sortedList, Comparator.comparing(Warehouse::getWarehouseName, String.CASE_INSENSITIVE_ORDER));
        return sortedList;
    }
    
}

    
    

