package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Quality;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Quality.QualityModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IQuality;

public class QualityPresenter implements IQualityPresenter {
    private QualityModel qualityModel;
    private IQuality iQuality;
    private Context context;

    public QualityPresenter(IQuality iQuality, Context context) {
        this.iQuality = iQuality;
        this.context = context;

        qualityModel = new QualityModel();
    }

    @Override
    public void ListQuality() {
        iQuality.ListQuality(qualityModel.ListQuality());
    }
}
