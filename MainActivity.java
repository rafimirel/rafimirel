package com.example.rafimirelproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] listviewTitle = {
                "orange",
                "cherry",
                "banana",
                "apple",
                "kiwi",
                "pear",
                "strawberry",
                "lemon",
                "peach",
                "mango",
        };
        String[] listviewCalories = {
                "47 calories",
                "50 calories",
                "89 calories",
                "52 calories",
                "61 calories",
                "57 calories",
                "33 calories",
                "29 calories",
                "39 calories",
                "60 calories",
        };
        int[] listviewImage = {R.drawable.d1, R.drawable.d2, R.drawable.d3,
                R.drawable.d4, R.drawable.d5, R.drawable.d6,
                R.drawable.d7, R.drawable.d8, R.drawable.d9, R.drawable.d10};


        List<HashMap<String, String>> fullDictionary = new ArrayList<HashMap<String, String>>();
        String keyForTitle = "KEY_FOR_TITLE";
        String keyForCal = "KEY_FOR_Cal";
        String keyForImage = "KEY_FOR_IMAGE";
        for (int i = 0; i < listviewTitle.length; i++) {
            HashMap<String, String> dic = new HashMap<>();
            dic.put(keyForTitle, listviewTitle[i]);
            dic.put(keyForCal, listviewCalories[i]);
            dic.put(keyForImage, String.valueOf(listviewImage[i]));
            fullDictionary.add(dic);

            String[] from = {keyForTitle, keyForCal, keyForImage};
            int[] to = {R.id.listview_item_title, R.id.listview_item_short_description,
                    R.id.listview_image};
            final ListView lv = findViewById(R.id.myListView);
            final SimpleAdapter simpleAdapter = new SimpleAdapter(
                    getBaseContext(), fullDictionary, R.layout.list_view_layout, from, to);

            lv.setAdapter(simpleAdapter);
            lv.setClickable(true);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    TextView textView = view.findViewById(android.R.id.text1);
                    Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                    intent.putExtra("second",listviewTitle[i]);
                    startActivity(intent);

                }
            });


        }


    }
}
