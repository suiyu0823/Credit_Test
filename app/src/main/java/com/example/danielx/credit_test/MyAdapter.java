package com.example.danielx.credit_test;

/**
 * Created by DanielX on 15-04-30.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CardViewHolder> {
    private List<Card> cardList;

    public MyAdapter(List<Card> cardList) {
        this.cardList = cardList;
    }


    @Override
    public int getItemCount() {
        return cardList.size();
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        Card ci = cardList.get(i);
        cardViewHolder.vCardNum.setText(ci.cardNum);
        cardViewHolder.vBalanceNum.setText(ci.balanceNum);
      //  cardViewHolder.vBalance.setText(ci.balance);
        cardViewHolder.vTitle.setText(ci.title);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_view, viewGroup, false);

        return new CardViewHolder(itemView);
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        protected TextView vTitle;
        protected TextView vBalance;
        protected TextView vBalanceNum;
        protected TextView vCardNum;

        public CardViewHolder(View v) {
            super(v);
        //    vBalance =  (TextView) v.findViewById(R.id.txtBalance);
            vBalanceNum = (TextView)  v.findViewById(R.id.txtCardBalance);
            vCardNum = (TextView)  v.findViewById(R.id.txtCardNumber);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}
