package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesGroupDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class SuppliesGroupAdapter extends RecyclerView.Adapter<SuppliesGroupAdapter.ViewHolder>{

    private Context context;
    private List<SuppliesGroupDTO> list;

    public SuppliesGroupAdapter(Context context, List<SuppliesGroupDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_supplies_group,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtSuppliesGroupId.setText(list.get(position).getSupplies_group_id()+"");
        holder.txtSuppliesGroupName.setText(list.get(position).getSupplies_group_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtSuppliesGroupId, txtSuppliesGroupName;
        public ViewHolder(View itemView) {
            super(itemView);

            txtSuppliesGroupId = itemView.findViewById(R.id.txtSuppliesGroupId);
            txtSuppliesGroupName = itemView.findViewById(R.id.txtSuppliesGroupName);
        }
    }
}
