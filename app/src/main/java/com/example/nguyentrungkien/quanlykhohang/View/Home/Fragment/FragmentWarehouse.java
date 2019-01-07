package com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nguyentrungkien.quanlykhohang.Adapter.WarehouseAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.WarehouseDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Warehouse.WarehousePresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IWarehouse;

import java.util.ArrayList;
import java.util.List;

public class FragmentWarehouse extends Fragment implements IWarehouse {
    private List<WarehouseDTO> list;
    private RecyclerView rcvWarehouse;
    private WarehouseAdapter adapter;

    private WarehousePresenter warehousePresenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        warehousePresenter = new WarehousePresenter(this,getContext());
        warehousePresenter.ListWarehouse();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_warehouse,container,false);


        rcvWarehouse = view.findViewById(R.id.rcvWarehouse);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2, LinearLayoutManager.VERTICAL,false);
        rcvWarehouse.setLayoutManager(layoutManager);

        adapter = new WarehouseAdapter(getContext(),list);

        rcvWarehouse.setAdapter(adapter);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListWarehouse(List<WarehouseDTO> list) {
        this.list = list;
    }
}
