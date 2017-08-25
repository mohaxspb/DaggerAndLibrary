package ru.kuchanov.daggerandlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mohax on 25.08.2017.
 * <p>
 * for DaggerAndLibrary
 */
class MyHolder extends RecyclerView.ViewHolder {

    public TextView textView;

    public MyHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView;
    }

    public void bind(String text){
        textView.setText(text);
    }
}