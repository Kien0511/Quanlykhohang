package com.example.nguyentrungkien.quanlykhohang.Model.DTO;

public class EmployeeDTO {
    private int employee_id;
    private String employee_name;
    private String employee_address;
    private String employee_birthday;
    private String employee_phone_number;
    private String employee_email;
    private String employee_gender;
    private String employee_identity_card;
    private int permissions_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_phone_number() {
        return employee_phone_number;
    }

    public void setEmployee_phone_number(String employee_phone_number) {
        this.employee_phone_number = employee_phone_number;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_gender() {
        return employee_gender;
    }

    public void setEmployee_gender(String employee_gender) {
        this.employee_gender = employee_gender;
    }

    public String getEmployee_identity_card() {
        return employee_identity_card;
    }

    public void setEmployee_identity_card(String employee_identity_card) {
        this.employee_identity_card = employee_identity_card;
    }

    public int getPermissions_id() {
        return permissions_id;
    }

    public void setPermissions_id(int permissions_id) {
        this.permissions_id = permissions_id;
    }

    public EmployeeDTO() {

    }

    public EmployeeDTO(int employee_id, String employee_name, String employee_address, String employee_birthday, String employee_phone_number, String employee_email, String employee_gender, String employee_identity_card, int permissions_id) {

        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_address = employee_address;
        this.employee_birthday = employee_birthday;
        this.employee_phone_number = employee_phone_number;
        this.employee_email = employee_email;
        this.employee_gender = employee_gender;
        this.employee_identity_card = employee_identity_card;
        this.permissions_id = permissions_id;
    }
}
