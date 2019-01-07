package com.example.nguyentrungkien.quanlykhohang.View.Home.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nguyentrungkien.quanlykhohang.Adapter.UnitAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.UnitDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Unit.UnitPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IUnit;

import java.util.ArrayList;
import java.util.List;

public class FragmentUnit extends Fragment implements IUnit {
    private List<UnitDTO> list;
    private RecyclerView rcvUnit;
    private UnitAdapter adapter;

    private UnitPresenter unitPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();

        unitPresenter = new UnitPresenter(this,getContext());
        unitPresenter.ListUnit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unit,container,false);

        rcvUnit = view.findViewById(R.id.rcvUnit);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        rcvUnit.setLayoutManager(layoutManager);

        adapter = new UnitAdapter(getContext(),list);

        rcvUnit.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListUnit(List<UnitDTO> list) {
        this.list = list;
    }
}
