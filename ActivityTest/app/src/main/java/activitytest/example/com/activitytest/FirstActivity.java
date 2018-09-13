package activitytest.example.com.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //调用getMenuInflater()方法得到MenuInflater对象，再调用inflate()方法就可以给当前活动创建菜单了
        //inflate传入两个方法，第一个参数：使用哪个参数创建菜单， 第二个参数：我们的菜单项将添加到那个Menu对象当中中，这里是用onCreateOptionsMenu()方法传入的menu
        getMenuInflater().inflate(R.menu.main, menu);
        //return true,表示允许创建的菜单显示出来
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //调用item.getItemId()来获取我们点击的是哪一个菜单项
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you click add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you click remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        // findViewById 方法返回一个View对象，向下转型为Button对象，通过调用setOnClickListener为按钮注册一个监听器，点击按钮则会执行监听器中的onClick()方法。
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
