package com.example.flyyy.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "epe"));
        words.add(new Word("mother", "eta"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "tete"));
        words.add(new Word("younger sister", "kolltiti"));
        words.add(new Word("grandmather", "ama"));
        words.add(new Word("grandfather", "paapa"));

        WordAdapter itermsAdapter = new WordAdapter(this,  words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itermsAdapter);

    }
}
