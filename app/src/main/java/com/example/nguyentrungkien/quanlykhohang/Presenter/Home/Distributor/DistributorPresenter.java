package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Distributor;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Distributor.DistributorModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IDistributor;

public class DistributorPresenter implements IDistributorPresenter {
    private DistributorModel distributorModel;
    private IDistributor iDistributor;
    private Context context;

    public DistributorPresenter(IDistributor iDistributor, Context context) {
        this.iDistributor = iDistributor;
        this.context = context;

        distributorModel = new DistributorModel();
    }

    @Override
    public void ListDistributor() {
        iDistributor.ListDistributor(distributorModel.ListDistributor());
    }
}
