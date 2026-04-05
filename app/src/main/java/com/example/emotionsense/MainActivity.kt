package com.example.emotionsense

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 简化版：直接跳转到无障碍设置
        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
        startActivity(intent)
        
        // 显示提示
        android.widget.Toast.makeText(
            this,
            "请在无障碍设置中找到'情绪感知'服务并开启",
            android.widget.Toast.LENGTH_LONG
        ).show()
    }
}
