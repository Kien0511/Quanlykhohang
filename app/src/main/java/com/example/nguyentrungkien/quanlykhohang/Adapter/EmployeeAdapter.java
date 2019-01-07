package com.example.nguyentrungkien.quanlykhohang.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.nguyentrungkien.quanlykhohang.Model.DTO.EmployeeDTO;
import com.example.nguyentrungkien.quanlykhohang.R;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {
    private Context context;

    public EmployeeAdapter(Context context, List<EmployeeDTO> list) {
        this.context = context;
        this.list = list;
    }

    private List<EmployeeDTO> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_employee,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtEmployeeId.setText(list.get(position).getEmployee_id()+"");
        holder.txtEmployeeName.setText(list.get(position).getEmployee_name());
        holder.txtEmployeePhoneNumber.setText(list.get(position).getEmployee_phone_number());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton ibtnEmployee;
        TextView txtEmployeeId, txtEmployeeName, txtEmployeePhoneNumber;
        public ViewHolder(View itemView) {
            super(itemView);

            ibtnEmployee = itemView.findViewById(R.id.ibtnEmployee);
            txtEmployeeId = itemView.findViewById(R.id.txtEmployeeId);
            txtEmployeeName = itemView.findViewById(R.id.txtEmployeeName);
            txtEmployeePhoneNumber = itemView.findViewById(R.id.txtEmployeePhoneNumber);
        }
    }
}
