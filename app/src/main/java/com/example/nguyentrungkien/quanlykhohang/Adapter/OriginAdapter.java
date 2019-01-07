package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.OriginDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class OriginAdapter extends RecyclerView.Adapter<OriginAdapter.ViewHolder> {

    private Context context;
    private List<OriginDTO> list;

    public OriginAdapter(Context context, List<OriginDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_origin,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtOriginId.setText(list.get(position).getOrigin_id()+"");
        holder.txtOriginName.setText(list.get(position).getOrigin_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtOriginId, txtOriginName;
        public ViewHolder(View itemView) {
            super(itemView);

            txtOriginId = itemView.findViewById(R.id.txtOriginId);
            txtOriginName = itemView.findViewById(R.id.txtOriginName);
        }
    }
}
