package com.example.todo_App.tasks;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todo_App.database.AppDatabase;
import com.example.todo_App.database.Repository;
import com.example.todo_App.database.TaskEntry;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    Repository repository;

   private  LiveData<List<TaskEntry>> tasks;



    public  MainActivityViewModel(Application application){
        super(application);
        AppDatabase database = AppDatabase.getInstance(application);
        repository = new Repository(database);
        tasks = repository.getTasks();
    }

    public LiveData<List<TaskEntry>> getTasks(){
        return tasks;
    }

    public void deleteTask(TaskEntry task){
        repository.deleteTask(task);
    }
    public LiveData<List<TaskEntry>> getPriority(int p)
    {
        return repository.getPriority(p);
    }

    public void clearAllTasks() {
        repository.clearAllTask();
    }
}
