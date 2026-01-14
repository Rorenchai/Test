package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test.databinding.ActivityIndexBinding;

public class IndexActivity extends AppCompatActivity {
    private ActivityIndexBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIndexBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 模拟车辆信息展示
        binding.tvVehicleInfo.setText("当前车辆：特斯拉 Model 3 \n续航剩余：320km");

        // 1. 跳转添加车辆
        binding.btnAddVehicle.setOnClickListener(v ->
                startActivity(new Intent(this, AddVehicleActivity.class)));

        // 2. 跳转添加充电桩
        binding.btnAddCharger.setOnClickListener(v ->
                startActivity(new Intent(this, AddChargerActivity.class)));

        // 3. 跳转订单
        binding.btnOrder.setOnClickListener(v ->
                startActivity(new Intent(this, OrderActivity.class)));

        // 4. 跳转个人中心
        binding.btnProfile.setOnClickListener(v ->
                startActivity(new Intent(this, ProfileActivity.class)));
    }
}