package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.UnitDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class UnitAdapter extends RecyclerView.Adapter<UnitAdapter.ViewHolder> {

    private Context context;
    private List<UnitDTO> list;

    public UnitAdapter(Context context, List<UnitDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_unit,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtUnitId.setText(list.get(position).getUnit_id()+"");
        holder.txtUnitName.setText(list.get(position).getUnit_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtUnitId, txtUnitName;
        public ViewHolder(View itemView) {
            super(itemView);

            txtUnitId = itemView.findViewById(R.id.txtUnitId);
            txtUnitName = itemView.findViewById(R.id.txtUnitName);
        }
    }
}
