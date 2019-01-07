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

import com.example.nguyentrungkien.quanlykhohang.Adapter.DistributorAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.DistributorDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Distributor.DistributorPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IDistributor;

import java.util.ArrayList;
import java.util.List;

public class FragmentDistributor extends Fragment implements IDistributor {
    private List<DistributorDTO> list;
    private RecyclerView rcvDistributor;
    private DistributorAdapter adapter;

    private DistributorPresenter distributorPresenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        distributorPresenter = new DistributorPresenter(this,getContext());
        distributorPresenter.ListDistributor();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_distributor,container,false);

        rcvDistributor = view.findViewById(R.id.rcvDistributor);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2, LinearLayoutManager.VERTICAL,false);

        rcvDistributor.setLayoutManager(layoutManager);

        adapter = new DistributorAdapter(getContext(),list);

        rcvDistributor.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListDistributor(List<DistributorDTO> list) {
        this.list = list;
    }
}
