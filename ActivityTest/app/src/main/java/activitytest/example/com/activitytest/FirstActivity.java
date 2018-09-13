package activitytest.example.com.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        // findViewById 方法返回一个View对象，向下转型为Button对象，通过调用setOnClickListener为按钮注册一个监听器，点击按钮则会执行监听器中的onClick()方法。
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Activity 类提供startActivity方法，传入intent 来启动activity
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                //在调用startActivity()时，自动给activity添加android.intent.category.DEFAULT这个默认的category
                //对于现在的 intent来说，它具有default和com.example.activitytest.MY_CATEGORY 两个category
                startActivity(intent);
            }
        });
    }
}
