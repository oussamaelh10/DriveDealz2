package com.example.drivedealz2.Model;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.drivedealz2.DAO.CarDao;
import com.example.drivedealz2.DAO.OrderDao;
import com.example.drivedealz2.DAO.UserDao;

@Database(entities = {Car.class,Order.class, User.class}, version = 1)
public abstract class DriveDealzDatabase extends RoomDatabase {

    private static DriveDealzDatabase instance;

    public abstract CarDao CarDao();

    public abstract OrderDao OrderDao();

    public abstract UserDao UserDao();

    public static synchronized DriveDealzDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            DriveDealzDatabase.class, "drive_dealz_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}