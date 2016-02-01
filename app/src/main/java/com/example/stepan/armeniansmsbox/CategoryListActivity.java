package com.example.stepan.armeniansmsbox;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.CategoryAdapter;

/**
 * Created by stepan on 1/31/16.
 */
public class CategoryListActivity extends AppCompatActivity {

    private ListView listView;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list_activity);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        List<String> categories = new ArrayList<String>();
        categories.add("Բանակային");
        categories.add("Հումորային");
        categories.add("Անեկդոտներ");
        categories.add("Աֆորիզմներ");
        categories.add("Ամանորյա");
        categories.add("Սուրբ ծնունդ");

        listView = (ListView) findViewById(R.id.categoryList);
        adapter = new CategoryAdapter(this, categories);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        adapter.notifyDataSetInvalidated();
        adapter.add("Name");
    }


}
