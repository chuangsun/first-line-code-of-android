package activitytest.example.com.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity", "Task id is " + getTaskId());
        setContentView(R.layout.third_activity);
        Button button = (Button) findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ActivityCollector.finishAll();
            }
        });
    }
}
