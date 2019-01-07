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

import com.example.nguyentrungkien.quanlykhohang.Adapter.SuppliesAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Supplies.SuppliesPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.ISupplies;

import java.util.ArrayList;
import java.util.List;

public class FragmentSupplies extends Fragment implements ISupplies {
    private List<SuppliesDTO> list;
    private RecyclerView rcvSupplies;
    private SuppliesAdapter adapter;

    private SuppliesPresenter suppliesPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();

        suppliesPresenter = new SuppliesPresenter(this,getContext());
        suppliesPresenter.ListSupplies();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_supplies,container,false);

        rcvSupplies = view.findViewById(R.id.rcvSupplies);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        rcvSupplies.setLayoutManager(layoutManager);

        adapter = new SuppliesAdapter(getContext(),list);

        rcvSupplies.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListSupplies(List<SuppliesDTO> list) {
        this.list = list;
    }
}
