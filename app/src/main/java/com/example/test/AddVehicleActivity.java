package com.example.test;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test.databinding.ActivityAddVehicleBinding;

public class AddVehicleActivity extends AppCompatActivity {
    private ActivityAddVehicleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddVehicleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCancel.setOnClickListener(v -> finish()); // 关闭当前页

        binding.btnAdd.setOnClickListener(v -> {
            // 获取输入内容
            String brand = binding.etBrand.getText().toString();
            // TODO: 这里添加保存到数据库的逻辑
            Toast.makeText(this, "车辆 " + brand + " 已添加", Toast.LENGTH_SHORT).show();
            finish(); // 添加成功后返回上一页
        });
    }
}