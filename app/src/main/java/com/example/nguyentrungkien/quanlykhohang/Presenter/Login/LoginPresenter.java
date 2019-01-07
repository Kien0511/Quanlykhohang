package com.example.nguyentrungkien.quanlykhohang.Presenter.Login;

import android.content.Context;

import com.example.nguyentrungkien.quanlykhohang.Model.Login.LoginModel;
import com.example.nguyentrungkien.quanlykhohang.View.Login.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    private LoginModel loginModel;
    private ILoginView iLoginView;
    private Context context;

    public LoginPresenter(ILoginView iLoginView, Context context) {
        this.iLoginView = iLoginView;
        this.context = context;
        loginModel = new LoginModel();
    }


    @Override
    public void login(String username, String password) {
        String employee_name = loginModel.login(username,password);
        if(!employee_name.equals(""))
        {
            iLoginView.loginSuccess();
            iLoginView.employeeName(employee_name);

        }
        else
        {
            iLoginView.loginFailed();
        }
    }
}
