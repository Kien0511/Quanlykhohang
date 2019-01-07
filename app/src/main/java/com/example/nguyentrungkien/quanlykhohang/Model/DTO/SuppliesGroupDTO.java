package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class SuppliesGroupDTO {
    private int supplies_group_id;
    private String supplies_group_name;

    public int getSupplies_group_id() {
        return supplies_group_id;
    }

    public void setSupplies_group_id(int supplies_group_id) {
        this.supplies_group_id = supplies_group_id;
    }

    public String getSupplies_group_name() {
        return supplies_group_name;
    }

    public void setSupplies_group_name(String supplies_group_name) {
        this.supplies_group_name = supplies_group_name;
    }

    public SuppliesGroupDTO() {

    }

    public SuppliesGroupDTO(int supplies_group_id, String supplies_group_name) {

        this.supplies_group_id = supplies_group_id;
        this.supplies_group_name = supplies_group_name;
    }
}
