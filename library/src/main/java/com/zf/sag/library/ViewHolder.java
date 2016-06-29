package com.zf.sag.library;

import android.databinding.BaseObservable;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2016/6/29.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding itemBinding;

    public ViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.itemBinding = binding;
    }

    public void setViewModel(int variableID, BaseObservable item) {
        itemBinding.setVariable(variableID, item);
    }

}
