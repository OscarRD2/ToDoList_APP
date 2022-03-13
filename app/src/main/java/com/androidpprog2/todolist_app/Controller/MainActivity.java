package com.androidpprog2.todolist_app.Controller;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.androidpprog2.todolist_app.Model.Tarea;
import com.androidpprog2.todolist_app.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnDialogCloseListner {

    private RecyclerView mRecyclerview;
    private FloatingActionButton fab;
    //private List<Tarea> mList;
   // private ToDoAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerview = findViewById(R.id.recyclerview);
        fab = findViewById(R.id.fab);


        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        //mRecyclerview.setAdapter(adapter);


        //Collections.reverse(mList);
        //adapter.setTasks(mList);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddNewTask.newInstance().show(getSupportFragmentManager() , AddNewTask.TAG);
            }
        });

    }


    @Override
    public void onDialogClose(DialogInterface dialogInterface) {
        //Collections.reverse(mList);
        //adapter.setTasks(mList);
        //adapter.notifyDataSetChanged();
    }


}