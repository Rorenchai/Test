    package com.example.evapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> {
            // TODO: 这里添加登录校验逻辑
            Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
            startActivity(intent);
            finish(); // 登录成功后销毁登录页，防止用户按返回键回到登录页
        });
    }
}