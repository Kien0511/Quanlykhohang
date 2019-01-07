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

import com.example.nguyentrungkien.quanlykhohang.Adapter.EmployeeAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.EmployeeDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Employee.EmployeePresenter;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Warehouse.WarehousePresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class FragmentEmployee extends Fragment implements IEmployee{
    private List<EmployeeDTO> list;
    private RecyclerView rcvEmployee;
    private EmployeeAdapter adapter;

    private EmployeePresenter employeePresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        employeePresenter = new EmployeePresenter(this,getContext());
        employeePresenter.ListEmployee();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee,container,false);

        rcvEmployee = view.findViewById(R.id.rcvEmployee);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2, LinearLayoutManager.VERTICAL,false);
        rcvEmployee.setLayoutManager(layoutManager);

        adapter = new EmployeeAdapter(getContext(),list);

        rcvEmployee.setAdapter(adapter);



        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListEmployee(List<EmployeeDTO> list) {
        this.list = list;
    }
}
