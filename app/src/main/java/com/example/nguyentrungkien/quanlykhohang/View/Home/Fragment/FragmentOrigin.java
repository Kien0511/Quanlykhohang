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

import com.example.nguyentrungkien.quanlykhohang.Adapter.OriginAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.OriginDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Origin.OriginPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IOrigin;

import java.util.ArrayList;
import java.util.List;

public class FragmentOrigin extends Fragment implements IOrigin {
    private List<OriginDTO> list;
    private RecyclerView rcvOrigin;
    private OriginAdapter adapter;

    private OriginPresenter originPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = new ArrayList<>();
        originPresenter = new OriginPresenter(this,getContext());
        originPresenter.ListOrigin();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_origin,container,false);

        rcvOrigin = view.findViewById(R.id.rcvOrigin);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        rcvOrigin.setLayoutManager(layoutManager);

        adapter = new OriginAdapter(getContext(),list);

        rcvOrigin.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListOrigin(List<OriginDTO> list) {
        this.list = list;
    }
}
