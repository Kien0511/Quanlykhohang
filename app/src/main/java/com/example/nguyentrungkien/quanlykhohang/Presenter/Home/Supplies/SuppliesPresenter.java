package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Supplies;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Supplies.SuppliesModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.ISupplies;

public class SuppliesPresenter implements ISuppliesPresenter {
    private SuppliesModel suppliesModel;
    private ISupplies iSupplies;
    private Context context;

    public SuppliesPresenter(ISupplies iSupplies, Context context) {
        this.iSupplies = iSupplies;
        this.context = context;

        suppliesModel = new SuppliesModel();
    }

    @Override
    public void ListSupplies() {
        iSupplies.ListSupplies(suppliesModel.ListSupplies());
    }
}
