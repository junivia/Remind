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

public class InputActivity extends AppCompatActivity {
    private EditText etDeskripsi;
    private EditText etTanggal;
    private EditText etWaktu;
    private Button btnSimpan;

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputan);

        createDatabase();

        etDeskripsi = (EditText) findViewById(R.id.eDeskripsi);
        etTanggal = (EditText) findViewById(R.id.eTanggal);
        etWaktu = (EditText) findViewById(R.id.eWaktu);

        btnSimpan = (Button) findViewById(R.id.bSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertIntoDB();
            }
        });

    }

    protected void createDatabase() {
        db = openOrCreateDatabase("Agama", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS reminder(id_reminder INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, deskripsi VARCHAR(2000),tanggal DATE, waktu TIME);");
    }

    protected void insertIntoDB() {
        String name = etDeskripsi.getText().toString().trim();
        String date = etTanggal.getText().toString().trim();
        String time = etWaktu.getText().toString().trim();
        if (name.equals("") || date.equals("") || time.equals("")) {
            Toast.makeText(getApplicationContext(), "Data Belum Lengkap!", Toast.LENGTH_LONG).show();
            return;
        }

        String query = "INSERT INTO reminder (deskripsi, tanggal, waktu) VALUES('" + name + "', '" + date + "', '" + time + "');";
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

}
