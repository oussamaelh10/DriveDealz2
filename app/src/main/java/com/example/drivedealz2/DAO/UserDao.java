package com.example.drivedealz2.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.drivedealz2.Model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertUser(User user);

    @Query("SELECT * FROM User ORDER BY ID")
    LiveData<List<User>> getAllUsers();

    // Voeg andere query-methoden voor de User-entity toe indien nodig
}
