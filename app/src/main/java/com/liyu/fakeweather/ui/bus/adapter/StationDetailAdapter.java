package com.liyu.fakeweather.ui.bus.adapter;

import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.liyu.fakeweather.R;
import com.liyu.fakeweather.model.BusLineStation;
import com.liyu.fakeweather.ui.bus.LineDetailActivity;

import java.util.List;

/**
 * Created by liyu on 2016/11/1.
 */

public class StationDetailAdapter extends BaseQuickAdapter<BusLineStation.ListBean, BaseViewHolder> {

    public StationDetailAdapter(int layoutResId, List<BusLineStation.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, final BusLineStation.ListBean item) {
        holder.setText(R.id.tv_line_name, item.getLName());
        holder.setText(R.id.tv_line_desc, item.getLDirection());
        holder.setText(R.id.tv_line_direction, item.getDistince_str());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LineDetailActivity.start(mContext, item.getGuid(), item.getLName(), item.getLDirection());
            }
        });
    }
}
