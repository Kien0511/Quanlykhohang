package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class WarehouseDTO {
    private int warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
    private String warehouse_phone_number;
    private String warehouse_manager;

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public String getWarehouse_phone_number() {
        return warehouse_phone_number;
    }

    public void setWarehouse_phone_number(String warehouse_phone_number) {
        this.warehouse_phone_number = warehouse_phone_number;
    }

    public String getWarehouse_manager() {
        return warehouse_manager;
    }

    public void setWarehouse_manager(String warehouse_manager) {
        this.warehouse_manager = warehouse_manager;
    }

    public String getWarehouse_note() {
        return warehouse_note;
    }

    public void setWarehouse_note(String warehouse_note) {
        this.warehouse_note = warehouse_note;
    }

    public WarehouseDTO() {

    }

    public WarehouseDTO(int warehouse_id, String warehouse_name, String warehouse_address, String warehouse_phone_number, String warehouse_manager, String warehouse_note) {

        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.warehouse_phone_number = warehouse_phone_number;
        this.warehouse_manager = warehouse_manager;
        this.warehouse_note = warehouse_note;
    }

    private String warehouse_note;
}
