package com.coen268.nishant.hw2v10;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;


public class ListingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        CodeLearnAdapter chapterListAdapter = new CodeLearnAdapter();
        ListView codeLearnLessons = (ListView)findViewById(R.id.listView1);

/*
    // This Code was for simple list //

        String[] codeLearnChapters = new String[] { "Android Introduction",
                "Android Setup/Installation","Android Hello World",
                "Android Layouts/Viewgroups","Android Activity & Lifecycle","Intents in Android"};

        ArrayAdapter<String> codeLearnArrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, codeLearnChapters);

        ListView codeLearnLessons = (ListView)findViewById(R.id.listView);

        codeLearnLessons.setAdapter(codeLearnArrayAdapter);

*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}