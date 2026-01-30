package com.edutech.progressive.service;

import com.edutech.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseService  {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse)  throws SQLException;
   // List<Warehouse> getWarehousesSortedByName() ;

    List<Warehouse> getWarehousesSortedByCapacity()  throws SQLException;

    default public void emptyArrayList() {
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) {
    }

    default void deleteWarehouse(int warehouseId)  throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException  {
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }


}
