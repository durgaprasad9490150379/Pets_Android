/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OwnerActionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owners);

        // Create an arrayList of words
//        ArrayList<String> words = new ArrayList<String>();

//        ArrayList<Owner> records = new ArrayList<Owner>();


        ArrayList<Owner> records = new ArrayList<Owner>();
        records = OwnerUtils.extractOwnersList();

    /*
        records.add(new Owner("Durga", "1-13-_B", "Bangalore", "9490150", "Dog"));
        records.add(new Owner("Veera", "1-13-_B", "Bangalore", "9490150", "Dog"));
        records.add(new Owner("Raja", "1-13-_B", "Bangalore", "9490150", "Dog"));
        records.add(new Owner("Nani", "1-13-_B", "Bangalore", "9490150", "Dog"));
        records.add(new Owner("Kumar", "1-13-_B", "Bangalore", "9490150", "Dog"));

    */




        OwnerAdapter adapter = new OwnerAdapter(this,  records, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
