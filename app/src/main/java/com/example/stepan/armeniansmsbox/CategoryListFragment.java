package com.example.stepan.armeniansmsbox;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.CategoryAdapter;

public class CategoryListFragment extends ListFragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_list_fragment, container, false);


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<String> categories = new ArrayList<String>();
        categories.add("Բանակային");
        categories.add("Հումորային");
        categories.add("Անեկդոտներ");
        categories.add("Աֆորիզմներ");
        categories.add("Ամանորյա");
        categories.add("Սուրբ ծնունդ");
    }

}
