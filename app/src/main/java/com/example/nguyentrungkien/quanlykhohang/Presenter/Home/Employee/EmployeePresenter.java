package com.example.nguyentrungkien.quanlykhohang.Presenter.Home.Employee;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Home.Employee.EmployeeModel;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IEmployee;
import com.example.nguyentrungkien.quanlykhohang.View.Home.IWarehouse;

public class EmployeePresenter implements IEmployeePresenter{
    private EmployeeModel employeeModel;
    private IEmployee iEmployee;
    private Context context;

    public EmployeePresenter(IEmployee iEmployee, Context context) {
        this.iEmployee = iEmployee;
        this.context = context;

        employeeModel = new EmployeeModel();
    }

    @Override
    public void ListEmployee() {
        iEmployee.ListEmployee(employeeModel.ListEmployee());
    }
}
