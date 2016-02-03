package com.example.stepan.armeniansmsbox;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stepan on 2/2/16.
 */
public class FavoriteFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorite_list_fragment, container, false);
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
