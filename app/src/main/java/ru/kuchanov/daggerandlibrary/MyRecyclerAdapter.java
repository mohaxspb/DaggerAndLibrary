package ru.kuchanov.daggerandlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mohax on 25.08.2017.
 * <p>
 * for DaggerAndLibrary
 */
class MyRecyclerAdapter extends RecyclerView.Adapter<MyHolder> {

    private List<String> mData;

    public MyRecyclerAdapter(List<String> data) {
        mData = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
