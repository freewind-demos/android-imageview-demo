package com.example.demo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * ImageView 演示 Activity
 * 展示如何在 Android 中显示图片
 */
class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化 ImageView
        imageView = findViewById(R.id.imageView)

        // 可以通过代码设置图片
        // imageView.setImageResource(R.drawable.ic_launcher_foreground)

        // 设置缩放类型
        // imageView.scaleType = ImageView.ScaleType.CENTER_CROP
    }
}
