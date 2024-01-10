package com.example.drivedealz2.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.drivedealz2.Model.Order;
import java.util.List;

@Dao
public interface OrderDao {

    @Insert
    void insertOrder(Order order);

    @Query("SELECT * FROM `Order` ORDER BY orderId") // de bakctiks staan om aan te geven dat het een gereserveerd SQL-woord is
    LiveData<List<Order>> getAllOrders();


    // Andere query-methoden voor Order entity

    @Update
    void updateOrder(Order order);

    @Delete
    void deleteOrder(Order order);
}
