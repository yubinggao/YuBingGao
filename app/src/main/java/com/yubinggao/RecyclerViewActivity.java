package com.yubinggao;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yubinggao.adapter.AdapterRecyclerView;
import com.yubinggao.lib.bean.CityInfo;
import com.yubinggao.lib.view.recyclerview.DiyRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/8.
 */
public class RecyclerViewActivity extends Activity implements DiyRecyclerView.LoadMoreListener {
    private DiyRecyclerView recyclerView;
    private List<CityInfo> mData;
    private AdapterRecyclerView adapterRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        recyclerView = (DiyRecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLoadMoreListener(this);
        mData = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            mData.add(new CityInfo("湖南省" + i, "永州市" + i, "双牌县" + i));
        }
        adapterRecyclerView = new AdapterRecyclerView(this, mData);
        recyclerView.setAdapter(adapterRecyclerView);
        recyclerView.notifyMoreFinish(true);
    }

    @Override
    public void onLoadMore() {
        System.out.println("**-*");

    }
}
