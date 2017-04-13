package com.yubinggao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yubinggao.R;
import com.yubinggao.lib.adapter.BaseAdapterRecyclerView;
import com.yubinggao.lib.bean.CityInfo;

import java.util.List;

/**
 * NavigationView DrawerLayout ToolBar
 */
public class AdapterRecyclerView extends BaseAdapterRecyclerView {

    private List<CityInfo> mData;

    public AdapterRecyclerView(Context context, List<CityInfo> mData) {
        super(context);
        this.mData = mData;
    }

    @Override
    public int initSize() {
        return mData.size();
    }

    @Override
    public RecyclerView.ViewHolder setLayout() {
        View convertView =mInflater.inflate(R.layout.recycler_view_activity_item, null);
        return new BaseViewHolders(convertView);
    }
    @Override
    public void initData(RecyclerView.ViewHolder holder, int position) {
        BaseViewHolders h = (BaseViewHolders) holder;
        h.initData(position);
    }

    private class BaseViewHolders extends RecyclerView.ViewHolder  {

        private TextView name_tv;
        private TextView phone_tv;
        private TextView city_tv;

        public BaseViewHolders(View convertView) {
            super(convertView);
            name_tv = (TextView) convertView.findViewById(R.id.name_tv);
            phone_tv = (TextView) convertView.findViewById(R.id.phone_tv);
            city_tv = (TextView) convertView.findViewById(R.id.city_tv);
        }
        public void initData(int position) {
            CityInfo cityInfo = mData.get(position);
            name_tv.setText(cityInfo.getProv());
            phone_tv.setText(cityInfo.getCity());
            city_tv.setText(cityInfo.getArea());
        }
    }

}
