package com.devhard_make.habitsandnotes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class customDialogFragment extends DialogFragment {
    Button dismiss,add;
    EditText noteTitle;
    Activity context;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_dialog_custom,container,false);
       getDialog().setTitle("Add Note");
         dismiss =  v.findViewById(R.id.cancel_btn_frag);
         add = v.findViewById(R.id.add_btn_frag);
         noteTitle = v.findViewById(R.id.editText);
        context=getActivity();

        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNote(context);
                dismiss();
            }
        });
    }

    private void createNote(Context c) {
       Editable nettle =  noteTitle.getText();
    if (!TextUtils.isEmpty(nettle)) {
      String title = nettle.toString();
        Intent newNote = new Intent(c,NoteActivity.class);
        newNote.putExtra("title",title);
        startActivity(newNote);



    }
    }

    }


