package com.yubinggao.lib.map.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.yubinggao.lib.R;
import com.yubinggao.lib.bean.CityInfo;
import com.yubinggao.lib.interfaces.CityCallback;

import java.util.List;


public class CityAddressAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected LayoutInflater mInflater;
    protected Context mContext;
    private List<CityInfo> mData;
    private CityCallback mCallback;

    public CityAddressAdapter(Context context, CityCallback callback, List<CityInfo> data) {
        this.mContext = context;
        this.mData = data;
        this.mCallback = callback;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.map_item_city_address, parent, false);
        return new CityAddressViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CityAddressViewHolder h = (CityAddressViewHolder) holder;
        h.initData(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private class CityAddressViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout city_layout;
        private TextView title_tv;
        private TextView city_info_tv;

        public CityAddressViewHolder(View convertView) {
            super(convertView);
            city_layout = (LinearLayout) convertView.findViewById(R.id.city_layout);
            title_tv = (TextView) convertView.findViewById(R.id.title_tv);
            city_info_tv = (TextView) convertView.findViewById(R.id.city_info_tv);
        }

        private void initData(final int position) {
            CityInfo c = mData.get(position);
            title_tv.setText(c.getTitle().isEmpty() ? c.getTownship() : c.getTitle());
            city_info_tv.setText(c.getCityInfo());
            city_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCallback.onCityClick(mData.get(position));
                }
            });
            if (c.type == 1) {
                title_tv.setTextColor(0xFF6893DE);
                city_info_tv.setTextColor(0xFF6893DE);
            } else {
                title_tv.setTextColor(0xFF000000);
                city_info_tv.setTextColor(0xFF7e7e7e);
            }
        }
    }
}
