package com.example.danielx.credit_test;

/**
 * Created by DanielX on 15-05-01.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.app.Activity;

import java.lang.reflect.Field;

public class TabFragment extends Fragment {
    private FragmentTabHost tabHost;
    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.tab, container, false);
        // Create FragmentTabHost
        tabHost = new FragmentTabHost(getActivity());
        tabHost.setup(getActivity(), getChildFragmentManager(),R.id.tabhost);
      //  tabHost = (FragmentTabHost)rootview.findViewById(android.R.id.tabhost);
        // Locate fragment2.xml to create FragmentTabHost

        TabHost.TabSpec spec;
        Intent intent;  // Reusable Intent for each tab
        //First Tab
        intent = new Intent(getActivity(),MainActivity.class);//Create new Intent to Display Tab1
        spec = tabHost.newTabSpec("tab1")//
                .setIndicator("Payment")// Set name or background icon
                .setContent(intent);//
        tabHost.addTab(spec);//add to tabHost

        //Second Tab
        intent = new Intent(getActivity(),SecondActivity.class);
        spec = tabHost.newTabSpec("tab2")
                .setIndicator("Gift")
                .setContent(intent);
        tabHost.addTab(spec);

        //Third Tab
        intent = new Intent(getActivity(),ThirdActivity.class);
        spec = tabHost.newTabSpec("tab3")
                .setIndicator("Loyalty")
                .setContent(intent);
        tabHost.addTab(spec);
        tabHost.setCurrentTab(0);//The Current one is tab1
        return tabHost;
    }
    @Override
    public void onDetach() {
        super.onDetach();

        try {
            Field childFragmentManager = Fragment.class
                    .getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    // Remove FragmentTabHost
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        tabHost = null;
    }
}
