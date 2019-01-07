package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class UnitDTO {
    private int unit_id;
    private String unit_name;

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public UnitDTO() {

    }

    public UnitDTO(int unit_id, String unit_name) {

        this.unit_id = unit_id;
        this.unit_name = unit_name;
    }
}
