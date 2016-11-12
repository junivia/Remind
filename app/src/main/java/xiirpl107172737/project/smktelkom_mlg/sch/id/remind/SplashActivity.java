package xiirpl107172737.project.smktelkom_mlg.sch.id.remind;

/**
 * Created by rafiraharjo on 12/11/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, AwalActivity.class);
        startActivity(intent);
        finish();
    }
}
