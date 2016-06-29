package com.zf.sag.library;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/6/29.
 */

public class RecyclerAdapter<T extends BaseObservable> extends RecyclerView.Adapter<ViewHolder> {

    protected static final int HEADER_VIEW = 0x00000111;
    protected static final int LOADING_VIEW = 0x00000222;
    protected static final int FOOTER_VIEW = 0x00000333;
    protected static final int EMPTY_VIEW = 0x00000555;

    private int itemView;
    private Context context;
    private List<BaseObservable> lists;

    public RecyclerAdapter(Context context, int itemView, List<BaseObservable> lists) {
        this.context = context;
        this.itemView = itemView;
        this.lists = lists;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewHolder holder = null;

        switch (viewType) {
            case LOADING_VIEW:
//                baseViewHolder = getLoadingView(parent);
//                initItemClickListener(baseViewHolder);
                break;
            case HEADER_VIEW:
//                holder = new BaseViewHolder(mContext, mHeaderView);
                break;
            case EMPTY_VIEW:
//                holder = new BaseViewHolder(mContext, mEmptyView);
                break;
            case FOOTER_VIEW:
                ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), itemView, parent, false);
                holder = new ViewHolder(binding);
                break;
            default:
//                holder = onCreateDefViewHolder(parent, viewType);
//                initItemClickListener(baseViewHolder);
        }

        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setViewModel(lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

}
