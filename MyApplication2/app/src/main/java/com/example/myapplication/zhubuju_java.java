package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
public class zhubuju_java extends AppCompatActivity{
    //局部变量
//    Spinner spinner;
    static String str;
    Button btn;
    //创建活动 onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhubuju_layout);
        Spinner spinner=  findViewById(R.id.sipnner);//获取下拉菜单
        btn = findViewById(R.id.btn);//获取按钮
        // 创建点击事件 点击主界面的按钮跳转到第二界面
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //当点击spinner下拉列表时，获取里面的文本值，再把里面的值传给switch做判断条件
                 str = spinner.getSelectedItem().toString();
                Intent intent=new Intent(zhubuju_java.this, tiaozhuanjiemian_java.class);
                startActivity(intent);//开始这个活动
            }
        });

    }
}
