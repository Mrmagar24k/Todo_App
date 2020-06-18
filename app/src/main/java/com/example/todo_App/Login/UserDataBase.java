package com.example.todo_App.Login;


import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    public abstract UserDao getUserDao();

}

