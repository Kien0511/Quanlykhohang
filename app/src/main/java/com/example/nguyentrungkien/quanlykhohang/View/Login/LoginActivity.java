package com.example.nguyentrungkien.quanlykhohang.View.Login;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.nguyentrungkien.quanlykhohang.Presenter.Login.ILoginPresenter;
import com.example.nguyentrungkien.quanlykhohang.Presenter.Login.LoginPresenter;
import com.example.nguyentrungkien.quanlykhohang.R;
import com.example.nguyentrungkien.quanlykhohang.View.Home.HomeActivity;


public class LoginActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener, ILoginView {

    private ImageButton ibtnShowpass;
    private EditText edtUsername, edtPassword;
    private Button btnLogin;
    private ProgressDialog progressDialog;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenter(LoginActivity.this,LoginActivity.this);

        ibtnShowpass = findViewById(R.id.ibtnShowpass);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        ibtnShowpass.setOnTouchListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId())
        {
            case R.id.ibtnShowpass:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                {
                    edtPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    ibtnShowpass.setBackgroundResource(R.color.colorGray);
                }
                else if(motionEvent.getAction() == MotionEvent.ACTION_UP)
                {
                    edtPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    ibtnShowpass.setBackgroundResource(R.color.colorWhite);
                    edtPassword.setSelection(edtPassword.length());
                }
                break;
        }
        return false;
    }



    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLogin:
                login();
                break;
        }
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);

        startActivity(intent);
    }

    @Override
    public void employeeName(String employeeName) {
        SharedPreferences sharedPreferences = LoginActivity.this.getSharedPreferences("Employee", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("employeeName",employeeName);
        editor.commit();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }

    private void login(){
        loginPresenter.login(edtUsername.getText().toString(),edtPassword.getText().toString());
    }
}
