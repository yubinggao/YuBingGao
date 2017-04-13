package com.yubinggao.lib.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * NavigationView DrawerLayout ToolBar
 */
public abstract class BaseAdapterRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected LayoutInflater mInflater;

    public BaseAdapterRecyclerView(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    public abstract int initSize();

    public abstract RecyclerView.ViewHolder setLayout();

    public abstract void initData(RecyclerView.ViewHolder holder, int position);

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return setLayout();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        initData(holder,   position);
    }

    @Override
    public int getItemCount() {
        return initSize();
    }
    /*
    public class BaseViewHolder extends RecyclerView.ViewHolder {
        public BaseViewHolder(View convertView) {
            super(convertView);
            System.out.println("base");
        }

        public void initData(int position) {
            System.out.println("base");
        }
    }
    */
}
