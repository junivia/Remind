package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.ReminderAdapter.ReminderAdapter;
import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.model.Reminder;

public class ReminderIslam extends AppCompatActivity {
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    TextView tvHasil;
    String fajr, dzuhur, ashar, maghrib, isya;
    ArrayList<Reminder> mList = new ArrayList<>();
    ReminderAdapter mAdapter;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private double currentLatitude;
    private double currentLongitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder_islam);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ReminderAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        Ion.with(getApplicationContext())
                .load("http://api.aladhan.com/timings/1398332113?latitude=-7.976346&longitude=112.659908&timezonestring=Asia/Jakarta&method=2")
                .asString()
                .setCallback(new FutureCallback<String>() {
                    @Override
                    public void onCompleted(Exception e, String result) {
                        try {


                            JSONObject reader = new JSONObject(result);
                            JSONObject data = reader.getJSONObject("data");
                            JSONObject timings = data.getJSONObject("timings");
                            fajr = timings.getString("Fajr");
                            dzuhur = timings.getString("Dhuhr");
                            ashar = timings.getString("Asr");
                            maghrib = timings.getString("Maghrib");
                            isya = timings.getString("Isha");
                            mList.add(new Reminder(fajr, "Subuh", "Alarm off"));
                            mList.add(new Reminder(dzuhur, "Dzuhur", "Alarm off"));
                            mList.add(new Reminder(ashar, "Ashar", "Alarm off"));
                            mList.add(new Reminder(maghrib, "Maghrib", "Alarm off"));
                            mList.add(new Reminder(isya, "Isya'", "Alarm off"));
                            mAdapter.notifyDataSetChanged();


                        } catch (JSONException e1) {
                            e1.printStackTrace();
                            tvHasil.setText(e1.getMessage());
                        }

                    }
                });


    }


}
