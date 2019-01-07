package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class DistributorDTO {
    private int distributor_id;
    private String distributor_name;
    private String distributor_address;
    private String distributor_phone_number;
    private String distributor_email;
    private String distributor_manager;

    public int getDistributor_id() {
        return distributor_id;
    }

    public void setDistributor_id(int distributor_id) {
        this.distributor_id = distributor_id;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }

    public String getDistributor_address() {
        return distributor_address;
    }

    public void setDistributor_address(String distributor_address) {
        this.distributor_address = distributor_address;
    }

    public String getDistributor_phone_number() {
        return distributor_phone_number;
    }

    public void setDistributor_phone_number(String distributor_phone_number) {
        this.distributor_phone_number = distributor_phone_number;
    }

    public String getDistributor_email() {
        return distributor_email;
    }

    public void setDistributor_email(String distributor_email) {
        this.distributor_email = distributor_email;
    }

    public String getDistributor_manager() {
        return distributor_manager;
    }

    public void setDistributor_manager(String distributor_manager) {
        this.distributor_manager = distributor_manager;
    }

    public DistributorDTO() {

    }

    public DistributorDTO(int distributor_id, String distributor_name, String distributor_address, String distributor_phone_number, String distributor_email, String distributor_manager) {

        this.distributor_id = distributor_id;
        this.distributor_name = distributor_name;
        this.distributor_address = distributor_address;
        this.distributor_phone_number = distributor_phone_number;
        this.distributor_email = distributor_email;
        this.distributor_manager = distributor_manager;
    }
}
