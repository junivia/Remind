package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class TodayIslam extends AppCompatActivity {

    Integer REQUEST_CODE_ADD = 88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_islam);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("sini?", "onClick: ");
//                goAdd();
//            }
//        });
    }

    private void goAdd() {
        //startActivityForResult(new Intent(TodayIslam.this, InputActivity.class), REQUEST_CODE_ADD);
        //getParent().startActivity(new Intent(getParent().getBaseContext(), InputActivity.class));
        //startActivity(new Intent(TodayIslam.this, InputActivity.class));
        Log.d("sini?", "goAdd: ");
    }
}
