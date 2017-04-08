package com.yubinggao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yubinggao.R;
import com.yubinggao.lib.bean.CityInfo;

import java.util.List;

/**
 * NavigationView DrawerLayout ToolBar
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected LayoutInflater mInflater;
    protected Context mContext;
    private List<CityInfo> mData;

    public AdapterRecyclerView(Context context, List<CityInfo> mData) {
        this.mContext = context;
        this.mData = mData;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_view_activity_item, parent, false);
        return new CityInfoItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CityInfoItemViewHolder h = (CityInfoItemViewHolder) holder;
        h.initData(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private class CityInfoItemViewHolder extends RecyclerView.ViewHolder {
        private TextView name_tv;
        private TextView phone_tv;
        private TextView city_tv;

        public CityInfoItemViewHolder(View convertView) {
            super(convertView);
            name_tv = (TextView) convertView.findViewById(R.id.name_tv);
            phone_tv = (TextView) convertView.findViewById(R.id.phone_tv);
            city_tv = (TextView) convertView.findViewById(R.id.city_tv);
        }

        private void initData(int position) {
            CityInfo cityInfo = mData.get(position);
            name_tv.setText(cityInfo.getProv());
            name_tv.setText(cityInfo.getProv());
            name_tv.setText(cityInfo.getProv());
        }
    }
}
