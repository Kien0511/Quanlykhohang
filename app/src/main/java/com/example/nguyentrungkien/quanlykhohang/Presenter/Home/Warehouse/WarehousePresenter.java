package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Warehouse;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Warehouse.WarehouseModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IWarehouse;

public class WarehousePresenter implements IWarehousePresenter {
    private WarehouseModel warehouseModel;
    private IWarehouse iWarehouse;
    private Context context;

    public WarehousePresenter(IWarehouse iWarehouse, Context context) {
        this.iWarehouse = iWarehouse;
        this.context = context;

        warehouseModel = new WarehouseModel();
    }

    @Override
    public void ListWarehouse() {
        iWarehouse.ListWarehouse(warehouseModel.ListWarehouse());
    }
}
