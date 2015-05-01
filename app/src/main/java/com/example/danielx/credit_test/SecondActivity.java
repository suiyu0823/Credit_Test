package com.example.danielx.credit_test;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends Activity {

    private String[] names = { "Credit", "Credit", "Another Credit", "Another Credit", "Debit", };
    private String[] balanceNum = {"8888", "2014", "2003232", "9999", "9800"};
    private String[] cardNum = {"xxxx1980", "11xxxx111", "22xxxxxx22", "33xxxxx33", "44xxxxx44"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        RecyclerView mRecyclerView = (RecyclerView)findViewById(R.id.cardList);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager llm  = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        MyAdapter ma = new MyAdapter(createList(5));
        mRecyclerView.setAdapter(ma);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    private List<Card> createList(int size) {

        List<Card> result = new ArrayList<Card>();
        for (int i=0; i < size; i++) {
            Card ci = new Card();
            ci.title = names[i];
            ci.balanceNum = balanceNum[i];
            ci.cardNum = cardNum[i];
            result.add(ci);

        }
        return result;
    }
}
