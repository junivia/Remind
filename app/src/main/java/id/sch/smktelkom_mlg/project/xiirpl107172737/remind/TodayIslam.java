package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TodayIslam extends AppCompatActivity {

    Integer REQUEST_CODE_ADD = 88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_islam);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goAdd();
            }
        });
    }

    private void goAdd() {
        startActivityForResult(new Intent(this, InputActivity.class), REQUEST_CODE_ADD);
    }
}
