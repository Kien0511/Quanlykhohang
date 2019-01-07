package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Origin;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Origin.OriginModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IOrigin;

public class OriginPresenter implements IOriginPresenter {
    private OriginModel originModel;
    private IOrigin iOrigin;
    private Context context;

    public OriginPresenter(IOrigin iOrigin, Context context) {
        this.iOrigin = iOrigin;
        this.context = context;

        originModel = new OriginModel();
    }

    @Override
    public void ListOrigin() {
        iOrigin.ListOrigin(originModel.ListOrigin());
    }
}
