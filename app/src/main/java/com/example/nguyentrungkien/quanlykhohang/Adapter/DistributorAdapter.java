package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.DistributorDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class DistributorAdapter extends RecyclerView.Adapter<DistributorAdapter.ViewHolder>{

    private Context context;
    private List<DistributorDTO> list;

    public DistributorAdapter(Context context, List<DistributorDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_distributor,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtDistributorId.setText(list.get(position).getDistributor_id()+"");
        holder.txtDistributorName.setText(list.get(position).getDistributor_name());
        holder.txtDistributorManager.setText(list.get(position).getDistributor_manager());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton ibtnDistributor;
        TextView txtDistributorId, txtDistributorName, txtDistributorManager;
        public ViewHolder(View itemView) {
            super(itemView);

            ibtnDistributor = itemView.findViewById(R.id.ibtnDistributor);
            txtDistributorId = itemView.findViewById(R.id.txtDistributorId);
            txtDistributorName = itemView.findViewById(R.id.txtDistributorName);
            txtDistributorManager = itemView.findViewById(R.id.txtDistributorManager);
        }
    }
}
