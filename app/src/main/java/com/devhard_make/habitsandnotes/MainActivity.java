package com.devhard_make.habitsandnotes;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
     ImageView addImage,settingsImage;
     android.support.v7.widget.Toolbar incTool;
     View toolBar;
     Button addFrag;
     FragmentManager fm = getSupportFragmentManager();
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBar = findViewById(R.id.toolbar_main);
        incTool = toolBar.findViewById(R.id.toolbar_inc);
        addImage = toolBar.findViewById(R.id.img_add);
        settingsImage = toolBar.findViewById(R.id.img_settings);

        setSupportActionBar(incTool);

        ab = getSupportActionBar();

        if(ab!=null)
            ab.setTitle(R.string.notes);

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNote();
            }
        });







    }

    protected void addNote() {

        customDialogFragment add_note = new customDialogFragment();
        add_note.show(fm,"Add Note");


    }

}
