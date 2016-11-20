package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

/**
 * Created by rafiraharjo on 20/11/2016.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextName;
    private EditText editTextDate;
    private EditText editTextTime;
    private Button btnAdd;

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputan);

        createDatabase();

        editTextName = (EditText) findViewById(R.id.deskripsi);
        editTextDate = (EditText) findViewById(R.id.tanggal);
        editTextTime = (EditText) findViewById(R.id.waktu);

        btnAdd = (Button) findViewById(R.id.submit);

        btnAdd.setOnClickListener(this);

    }

    protected void createDatabase() {
        db = openOrCreateDatabase("Agama", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS reminder(id_reminder INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, deskripsi VARCHAR,tanggal VARCHAR,waktu VARCHAR);");
    }

    protected void insertIntoDB() {
        String name = editTextName.getText().toString().trim();
        String date = editTextDate.getText().toString().trim();
        String time = editTextTime.getText().toString().trim();
        if (name.equals("") || date.equals("") || time.equals("")) {
            Toast.makeText(getApplicationContext(), "Isi Semua Field!", Toast.LENGTH_LONG).show();
            return;
        }

        String query = "INSERT INTO reminder (deskripsi,tanggal,waktu) VALUES('" + name + "', '" + date + "', '" + time + "');";
        db.execSQL(query);
        Toast.makeText(getApplicationContext(), "Data Tersimpan!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == btnAdd) {
            insertIntoDB();
        }
    }

}
