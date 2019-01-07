package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Unit;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Unit.UnitModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IUnit;

public class UnitPresenter implements IUnitPresenter {
    private UnitModel unitModel;
    private IUnit iUnit;
    private Context context;

    public UnitPresenter(IUnit iUnit, Context context) {
        this.iUnit = iUnit;
        this.context = context;

        unitModel = new UnitModel();
    }

    @Override
    public void ListUnit() {
        iUnit.ListUnit(unitModel.ListUnit());
    }
}
