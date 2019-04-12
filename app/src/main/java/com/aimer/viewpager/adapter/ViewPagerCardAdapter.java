package com.aimer.viewpager.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aimer.viewpager.R;
import com.aimer.viewpager.bean.InfoBean;

import java.util.List;

public class ViewPagerCardAdapter extends PagerAdapter {

    private List<InfoBean> mList;
    private Context mContext;

    public ViewPagerCardAdapter(List<InfoBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_viewpager, container, false);
        container.addView(view);
        TextView name = view.findViewById(R.id.item_viewpager_name);
        TextView info = view.findViewById(R.id.item_viewpager_desc);
        name.setText(mList.get(position).getName());
        info.setText(mList.get(position).getInfo());
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
