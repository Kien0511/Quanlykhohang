package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.SuppliesGroup;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.SuppliesGroup.SuppliesGroupModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.ISuppliesGroup;

public class SuppliesGroupPresenter implements ISuppliesGroupPresenter {
    private SuppliesGroupModel suppliesGroupModel;
    private ISuppliesGroup iSuppliesGroup;
    private Context context;

    public SuppliesGroupPresenter(ISuppliesGroup iSuppliesGroup, Context context) {
        this.iSuppliesGroup = iSuppliesGroup;
        this.context = context;

        suppliesGroupModel = new SuppliesGroupModel();
    }

    @Override
    public void ListSuppliesGroup() {
        iSuppliesGroup.ListSuppliesGroup(suppliesGroupModel.ListSuppliesGroup());
    }
}
