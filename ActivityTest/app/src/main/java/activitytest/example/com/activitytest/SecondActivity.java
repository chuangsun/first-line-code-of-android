package activitytest.example.com.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button = (Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent.ACTION_VIEW 是一个系统内置的动作，其常量值为"android.intent.action.VIEW"
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //Uri.parse()将一个网页字符串解析成一个Uri对象，再调用Intent的setData()方法，将这个Uri对象传递进去
                //setData接受一个Uri对象，用于指定当前的Intent正在操作的数据，而这些数据通常都是以字符串的形式传递到Uri.parse()方法中解析产生的
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
