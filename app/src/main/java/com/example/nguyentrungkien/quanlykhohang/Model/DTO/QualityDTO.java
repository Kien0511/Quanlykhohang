package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class QualityDTO {
    private int quality_id;
    private String quality_name;

    public int getQuality_id() {
        return quality_id;
    }

    public void setQuality_id(int quality_id) {
        this.quality_id = quality_id;
    }

    public String getQuality_name() {
        return quality_name;
    }

    public void setQuality_name(String quality_name) {
        this.quality_name = quality_name;
    }

    public QualityDTO() {

    }

    public QualityDTO(int quality_id, String quality_name) {

        this.quality_id = quality_id;
        this.quality_name = quality_name;
    }
}
