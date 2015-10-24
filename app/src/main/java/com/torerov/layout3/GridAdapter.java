package com.torerov.layout3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Choi on 2015-10-24.
 */
public class GridAdapter extends BaseAdapter {

    List<GridItemData> items = new ArrayList<GridItemData>();

    public void add(GridItemData item){
        items.add(item);
        notifyDataSetChanged();
    }
@Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridItemView view;
        if(convertView == null){
            view = new GridItemView(parent.getContext());
        }else{
            view = (GridItemView)convertView;
        }

        view.setItemData(items.get(position));
        return view;
    }
}
