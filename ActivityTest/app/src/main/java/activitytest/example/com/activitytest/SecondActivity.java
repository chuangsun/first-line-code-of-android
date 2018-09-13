package activitytest.example.com.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        //获取启动SecondActivity的Intent
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("SecondActivity", data);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //intent没有任何跳转意图,只用来把数据存放在intent中
                intent.putExtra("data_return", "Hello,FirstActivity");
                //把intent传递回去
                setResult(RESULT_OK, intent);
                finish();
                //在activity被销毁后会回调上一个活动的onActivityResult()方法，需要在上一个activity中重写onActivityResult
            }
        });
    }
}
