package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.QualityDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class QualityAdapter extends RecyclerView.Adapter<QualityAdapter.ViewHolder> {
    private Context context;
    private List<QualityDTO> list;

    public QualityAdapter(Context context, List<QualityDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_quality,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtQualityId.setText(list.get(position).getQuality_id()+"");
        holder.txtQualityName.setText(list.get(position).getQuality_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtQualityId, txtQualityName;
        public ViewHolder(View itemView) {
            super(itemView);
            txtQualityId = itemView.findViewById(R.id.txtQualityId);
            txtQualityName = itemView.findViewById(R.id.txtQualityName);
        }
    }
}
