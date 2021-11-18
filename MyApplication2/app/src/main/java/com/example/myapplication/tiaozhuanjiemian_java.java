package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tiaozhuanjiemian_java extends AppCompatActivity  {
    //局部变量
    Button btn1;
    ImageView imageView;
    TextView txt;
    zhubuju_java m;//给主界面类设一个变量，用来获取下拉列表的文本
    String Str = m.str;//把主界面下拉列表的文本（m.str）,给Str
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiemianer_layout);
        btn1 = findViewById(R.id.btn1);
        txt = findViewById(R.id.txt);
        imageView = findViewById(R.id.imageView);
        //当里面的判断条件成立时(Str)，就执行里面的语句
        switch (Str) {
            case "鼠":
                imageView.setImageResource(R.drawable.shu);
                txt.setText("夜间十一点至次日凌晨一点，属子时，正是老鼠趁夜深人静，频繁活动之时，称“子鼠”。");
                break;

            case "牛":
                imageView.setImageResource(R.drawable.niu);
                txt.setText("凌晨一点至三点，属丑时。牛习惯夜间吃草，农家常在深夜起来挑灯喂牛，故称“丑牛”。");
                break;

            case "虎":
                imageView.setImageResource(R.drawable.hu);
                txt.setText("凌晨三点至五点，属寅时。此时昼伏夜行的老虎最凶猛，古人常会在此时听到虎啸声，故称“寅虎。");
                break;

            case "兔":
                imageView.setImageResource(R.drawable.tu);
                txt.setText("清晨五点至七点，属卯时。天刚亮，兔子出窝，喜欢吃带有晨露的青草，故为“卯兔。");
                break;

            case "龙":
                imageView.setImageResource(R.drawable.lon);
                txt.setText("早晨七点至九点，属辰时。此时一般容易起雾，传说龙喜腾云驾雾，又值旭日东升，蒸蒸日上，故称“辰龙”。");
                break;

            case "蛇":
                imageView.setImageResource(R.drawable.she);
                txt.setText("上午九点至十一时，属巳时。大雾散去，艳阳高照，蛇类出洞觅食，故作“巳蛇。");
                break;

            case "马":
                imageView.setImageResource(R.drawable.ma);
                txt.setText("中午十一点至一点，属午时。古时野马未被人类驯服，每当午时，四处奔跑嘶鸣，故称“午马。");
                break;

            case "羊":
                imageView.setImageResource(R.drawable.yan);
                txt.setText("午后一点至三点，属未时。有的地方管此时为“羊出坡”，意思是放羊的好时候，故称“未羊”。");
                break;

            case "猴":
                imageView.setImageResource(R.drawable.hou);
                txt.setText("下午三点至五点，属申时。太阳偏西了，猴子喜在此时啼叫，故为“申猴”");
                break;

            case "鸡":
                imageView.setImageResource(R.drawable.ji);
                txt.setText("下午五点至七点，属酉时。太阳落山了，鸡在窝前打转，故称“酉鸡”。");
                break;

            case "狗":
                imageView.setImageResource(R.drawable.gou);
                txt.setText("傍晚七点至九点，属戌时。人劳碌一天，闩门准备休息了。狗卧门前守护，一有动静，就汪汪大叫，故为“戌狗”。");
                break;
            case "猪":
                imageView.setImageResource(R.drawable.zhu);
                txt.setText("夜间九点至十一点，属亥时。夜深人静，能听见猪拱槽的声音，于是称作“亥猪”。");
                break;
        }
        //点击按钮跳转到主界面
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tiaozhuanjiemian_java.this, zhubuju_java.class);
                startActivity(intent);
            }
        });
    }

}
