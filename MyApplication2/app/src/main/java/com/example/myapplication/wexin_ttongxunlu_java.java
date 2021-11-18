package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wexin_ttongxunlu_java extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wexin_tongxunjiemian);
        // 存图片的id
        int[] imageid = new int[] {
                R.drawable.touxiang01, R.drawable.touxiang02,R.drawable.touxiang03,
                R.drawable.touxiang04,R.drawable.touxiang05,R.drawable.touxiang06,
                R.drawable.touxiang07,R.drawable.touxiang08,R.drawable.touxiang09,
        };
        //存名字
        String[] title = new String[] {
                "陈1","陈2","陈3","陈4","陈5","陈6","陈7","陈8","陈9"
        };
        // 数据源为 list，list是顺序容器,里面的元素类型为 Map()
        List<Map<String,Object>> listitem = new ArrayList<Map<String,Object>>();
        for (int i = 0; i < imageid.length; i++) {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("image",imageid[i]);
            map.put("name",title[i]);
            listitem.add(map);
        }
        //设置并将数据放入适配器，第一个参数为上下文指针，第二个参数为数据来源，第三个参数为XML实现文件
        //第四个参数为List中的两个子项，第五个参数为listitem中的两个TextView ID
        SimpleAdapter adapter =new SimpleAdapter(this,listitem,R.layout.main,
                new String[]{"name", "image"},new int[] {R.id.title,R.id.image});
        //获取xml中的listview
        ListView listView = (ListView) findViewById(R.id.listview);
        //将适配器放入listview中
        listView.setAdapter(adapter);
        //设置事件监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //获得List中的一个元素，此时获取适配器的配置并强制转化为Map
                Map<String,Object> map = (Map<String, Object>) adapterView.getItemAtPosition(i);
                Toast.makeText(wexin_ttongxunlu_java.this, map.get("name").toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
