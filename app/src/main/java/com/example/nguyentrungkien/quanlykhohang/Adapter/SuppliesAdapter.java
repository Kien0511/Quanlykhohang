package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.DistributorDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.OriginDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.QualityDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesGroupDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.UnitDTO;
import com.example.nguyentrungkien.quanlykhohang.Model.Home.Distributor.DistributorModel;
import com.example.nguyentrungkien.quanlykhohang.Model.Home.Origin.OriginModel;
import com.example.nguyentrungkien.quanlykhohang.Model.Home.Quality.QualityModel;
import com.example.nguyentrungkien.quanlykhohang.Model.Home.SuppliesGroup.SuppliesGroupModel;
import com.example.nguyentrungkien.quanlykhohang.Model.Home.Unit.UnitModel;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class SuppliesAdapter extends RecyclerView.Adapter<SuppliesAdapter.ViewHolder> {
    private Context context;
    private List<SuppliesDTO> list;
    private List<UnitDTO> listUnit;
    private List<SuppliesGroupDTO> listSuppliesGroup;
    private List<QualityDTO> listQuality;
    private List<DistributorDTO> listDitributor;
    private List<OriginDTO> listOrigin;

    public SuppliesAdapter(Context context, List<SuppliesDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_supplies,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UnitModel unitModel = new UnitModel();
        SuppliesGroupModel suppliesGroupModel = new SuppliesGroupModel();
        QualityModel qualityModel = new QualityModel();
        DistributorModel distributorModel = new DistributorModel();
        OriginModel originModel = new OriginModel();

        listUnit = unitModel.ListUnit();
        listSuppliesGroup = suppliesGroupModel.ListSuppliesGroup();
        listQuality = qualityModel.ListQuality();
        listDitributor = distributorModel.ListDistributor();
        listOrigin = originModel.ListOrigin();

        String unitName = "";
        String suppliesGroupName = "";
        String qualityName = "";
        String distributorName = "";
        String originName = "";

        for (int i = 0; i < listUnit.size(); i++)
        {
            if(list.get(position).getUnit_id() == listUnit.get(i).getUnit_id())
            {
                unitName = listUnit.get(i).getUnit_name();
            }
        }

        for (int i = 0; i < listSuppliesGroup.size(); i++)
        {
            if(list.get(position).getSupplies_group_id() == listSuppliesGroup.get(i).getSupplies_group_id())
            {
                suppliesGroupName = listSuppliesGroup.get(i).getSupplies_group_name();
            }
        }

        for (int i = 0; i < listQuality.size(); i++)
        {
            if(list.get(position).getQuality_id() == listQuality.get(i).getQuality_id())
            {
                qualityName = listQuality.get(i).getQuality_name();
            }
        }

        for (int i = 0; i < listDitributor.size(); i++)
        {
            if(list.get(position).getDistributor_id() == listDitributor.get(i).getDistributor_id())
            {
                distributorName = listDitributor.get(i).getDistributor_name();
            }
        }

        for (int i = 0; i < listOrigin.size(); i++)
        {
            if(list.get(position).getOrigin_id() == listOrigin.get(i).getOrigin_id())
            {
                originName = listOrigin.get(i).getOrigin_name();
            }
        }

        holder.txtSuppliesId.setText(list.get(position).getSupplies_id()+"");
        holder.txtSuppliesName.setText(list.get(position).getSupplies_name());
        holder.txtSuppliesImportPrice.setText(list.get(position).getSupplies_import_price()+"");
        holder.txtSuppliesExportPrice.setText(list.get(position).getSupplies_export_price()+"");
        holder.txtUnitName.setText(unitName);
        holder.txtSuppliesGroupName.setText(suppliesGroupName);
        holder.txtQualityName.setText(qualityName);
        holder.txtDistributorName.setText(distributorName);
        holder.txtOriginName.setText(originName);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtSuppliesId, txtSuppliesName, txtSuppliesImportPrice, txtSuppliesExportPrice, txtUnitName;
        TextView txtSuppliesGroupName, txtQualityName, txtDistributorName, txtOriginName;
        public ViewHolder(View itemView) {
            super(itemView);

            txtSuppliesId = itemView.findViewById(R.id.txtSuppliesId);
            txtSuppliesName = itemView.findViewById(R.id.txtSuppliesName);
            txtSuppliesImportPrice = itemView.findViewById(R.id.txtSuppliesImportPrice);
            txtSuppliesExportPrice = itemView.findViewById(R.id.txtSuppliesExportPrice);
            txtUnitName = itemView.findViewById(R.id.txtUnitName);
            txtSuppliesGroupName = itemView.findViewById(R.id.txtSuppliesGroupName);
            txtQualityName = itemView.findViewById(R.id.txtQualityName);
            txtDistributorName = itemView.findViewById(R.id.txtDistributorName);
            txtOriginName = itemView.findViewById(R.id.txtOriginName);
        }
    }
}
