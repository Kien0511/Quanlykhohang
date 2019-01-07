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

import com.example.nguyentrungkien.quanlykhohang.Adapter.QualityAdapter;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.QualityDTO;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Quality.QualityPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IQuality;

import java.util.ArrayList;
import java.util.List;

public class FragmentQuality extends Fragment implements IQuality {
    private List<QualityDTO> list;
    private RecyclerView rcvQuality;
    private QualityAdapter adapter;

    private QualityPresenter qualityPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        qualityPresenter = new QualityPresenter(this,getContext());
        qualityPresenter.ListQuality();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quality,container,false);

        rcvQuality = view.findViewById(R.id.rcvQuality);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        rcvQuality.setLayoutManager(layoutManager);

        adapter = new QualityAdapter(getContext(),list);

        rcvQuality.setAdapter(adapter);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void ListQuality(List<QualityDTO> list) {
        this.list = list;
    }
}
