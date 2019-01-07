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

import com.example.nguyentrungkien.quanlykhohang.Adapter.SuppliesGroupAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesGroupDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.SuppliesGroup.SuppliesGroupPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.ISuppliesGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentSuppliesGroup extends Fragment implements ISuppliesGroup {

    private List<SuppliesGroupDTO> list;
    private RecyclerView rcvSuppliesGroup;
    private SuppliesGroupAdapter adapter;

    private SuppliesGroupPresenter suppliesGroupPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = new ArrayList<>();

        suppliesGroupPresenter = new SuppliesGroupPresenter(this,getContext());
        suppliesGroupPresenter.ListSuppliesGroup();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_supplies_group,container,false);

        rcvSuppliesGroup = view.findViewById(R.id.rcvSuppliesGroup);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        rcvSuppliesGroup.setLayoutManager(layoutManager);

        adapter = new SuppliesGroupAdapter(getContext(),list);

        rcvSuppliesGroup.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListSuppliesGroup(List<SuppliesGroupDTO> list) {
        this.list = list;
    }
}
