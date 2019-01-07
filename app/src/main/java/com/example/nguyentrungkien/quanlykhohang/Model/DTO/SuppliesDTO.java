package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class SuppliesDTO {
    private int supplies_id;
    private String supplies_name;
    private int supplies_import_price;
    private int supplies_export_price;
    private int unit_id;
    private int supplies_group_id;
    private int quality_id;
    private int distributor_id;
    private int origin_id;

    public int getSupplies_id() {
        return supplies_id;
    }

    public void setSupplies_id(int supplies_id) {
        this.supplies_id = supplies_id;
    }

    public String getSupplies_name() {
        return supplies_name;
    }

    public void setSupplies_name(String supplies_name) {
        this.supplies_name = supplies_name;
    }

    public int getSupplies_import_price() {
        return supplies_import_price;
    }

    public void setSupplies_import_price(int supplies_import_price) {
        this.supplies_import_price = supplies_import_price;
    }

    public int getSupplies_export_price() {
        return supplies_export_price;
    }

    public void setSupplies_export_price(int supplies_export_price) {
        this.supplies_export_price = supplies_export_price;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getSupplies_group_id() {
        return supplies_group_id;
    }

    public void setSupplies_group_id(int supplies_group_id) {
        this.supplies_group_id = supplies_group_id;
    }

    public int getQuality_id() {
        return quality_id;
    }

    public void setQuality_id(int quality_id) {
        this.quality_id = quality_id;
    }

    public int getDistributor_id() {
        return distributor_id;
    }

    public void setDistributor_id(int distributor_id) {
        this.distributor_id = distributor_id;
    }

    public int getOrigin_id() {
        return origin_id;
    }

    public void setOrigin_id(int origin_id) {
        this.origin_id = origin_id;
    }

    public SuppliesDTO() {

    }

    public SuppliesDTO(int supplies_id, String supplies_name, int supplies_import_price, int supplies_export_price, int unit_id, int supplies_group_id, int quality_id, int distributor_id, int origin_id) {

        this.supplies_id = supplies_id;
        this.supplies_name = supplies_name;
        this.supplies_import_price = supplies_import_price;
        this.supplies_export_price = supplies_export_price;
        this.unit_id = unit_id;
        this.supplies_group_id = supplies_group_id;
        this.quality_id = quality_id;
        this.distributor_id = distributor_id;
        this.origin_id = origin_id;
    }
}
