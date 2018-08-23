package com.devhard_make.habitsandnotes;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class NoteActivity extends AppCompatActivity {
    View NoteAppBar;
    ImageView SaveImage,CancelImage;
    Toolbar NoteToolBar;
    ActionBar ab;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        NoteAppBar = findViewById(R.id.appbar_note);
        NoteToolBar = NoteAppBar.findViewById(R.id.toolbar_inc);
        SaveImage = NoteAppBar.findViewById(R.id.img_add);
        CancelImage = NoteAppBar.findViewById(R.id.img_settings);


        setSupportActionBar(NoteToolBar);

        ab = getSupportActionBar();
        title = getIntent().getStringExtra("title");

        if(ab!=null)
            ab.setTitle(title);
        CancelImage.setImageDrawable(getResources().getDrawable(R.drawable.cancel));
        SaveImage.setImageDrawable(getResources().getDrawable(R.drawable.done));
    }
}
