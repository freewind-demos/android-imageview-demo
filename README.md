# android-imageview-demo

## 简介

演示 ImageView 组件的使用方法，显示图片资源。

## 基本原理

- ImageView 用于在界面上显示图片
- 图片来源：drawable 资源、位图对象、网络 URL 等
- 通过 `setImageResource()` 或 `setImageBitmap()` 设置图片

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 运行应用查看图片显示效果

## 教程

### ImageView 基础

```xml
<ImageView
    android:id="@+id/imageView"
    android:layout_width="200dp"
    android:layout_height="200dp"
    android:src="@drawable/ic_launcher_foreground"
    android:contentDescription="图片描述" />
```

### 设置图片

```kotlin
// 通过资源 ID 设置图片
imageView.setImageResource(R.drawable.my_image)

// 通过代码设置
imageView.setImageBitmap(bitmap)
```

### 缩放类型

ImageView 支持多种缩放类型：

| 类型 | 说明 |
|------|------|
| fitCenter | 保持宽高比缩放，适应视图 |
| centerCrop | 保持宽高比缩放，充满视图 |
| center | 不缩放，居中显示 |
| fitXY | 拉伸适应视图 |

### 注意事项

- 记得设置 contentDescription，提高应用无障碍性
- 图片资源放在 res/drawable 目录下
- ConstraintLayout 中可以使用 0dp 配合约束实现自适应
