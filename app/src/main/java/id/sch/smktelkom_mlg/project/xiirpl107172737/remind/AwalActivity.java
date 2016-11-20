package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_awal);

        findViewById(R.id.button_islam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AwalActivity.this, ReminderIslam.class));
            }
        });

        findViewById(R.id.button_hindu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AwalActivity.this, HinduActivity.class));
            }
        });

        findViewById(R.id.button_katholik).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AwalActivity.this, KatolikActivity.class));
            }
        });

        findViewById(R.id.button_kristen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AwalActivity.this, KristenActivity.class));
            }
        });

    }
}
