//package com.example.danielx.credit_test;
//
///**
//* Created by DanielX on 15-04-30.
//*/
//import android.app.TabActivity;
//import android.content.Intent;
//import android.content.res.Resources;
//import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//import android.widget.TabHost;
//import android.widget.TabHost.TabSpec;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTabHost;
//
//public class Tab extends FragmentActivity {
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tab);
//        Resources res = getResources(); // Resource object to get Drawables
//        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);  // The activity TabHost
//        TabSpec spec;
//        Intent intent;  // Reusable Intent for each tab
//        //First Tab
//        intent = new Intent(this,MainActivity.class);//Create new Intent to Display Tab1
//        spec = tabHost.newTabSpec("tab1")//
//                .setIndicator("Payment")// Set name or background icon
//                .setContent(intent);//
//        tabHost.addTab(spec);//add to tabHost
//
//        //Second Tab
//        intent = new Intent(this,SecondActivity.class);
//        spec = tabHost.newTabSpec("tab2")
//                .setIndicator("Gift")
//                .setContent(intent);
//        tabHost.addTab(spec);
//
//        //Third Tab
//        intent = new Intent(this,ThirdActivity.class);
//        spec = tabHost.newTabSpec("tab3")
//                .setIndicator("Loyalty")
//                .setContent(intent);
//        tabHost.addTab(spec);
//        tabHost.setCurrentTab(0);//The Current one is tab1
//    }
//}