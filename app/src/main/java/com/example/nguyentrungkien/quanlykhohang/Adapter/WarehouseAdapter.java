package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.WarehouseDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class WarehouseAdapter extends RecyclerView.Adapter<WarehouseAdapter.ViewHolder> {

    Context context;
    List<WarehouseDTO> list;

    public WarehouseAdapter(Context context, List<WarehouseDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_warehouse,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtWarehouseId.setText(list.get(position).getWarehouse_id() + "");
        holder.txtWarehouseName.setText(list.get(position).getWarehouse_name());
        holder.txtWarehouseManager.setText(list.get(position).getWarehouse_manager());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton ibtnWarehouse;
        TextView txtWarehouseId, txtWarehouseName, txtWarehouseManager;
        public ViewHolder(View itemView) {
            super(itemView);

            ibtnWarehouse = itemView.findViewById(R.id.ibtnWarehouse);
            txtWarehouseId = itemView.findViewById(R.id.txtWarehouseId);
            txtWarehouseName = itemView.findViewById(R.id.txtWarehouseName);
            txtWarehouseManager = itemView.findViewById(R.id.txtWarehouseManager);
        }
    }
}
