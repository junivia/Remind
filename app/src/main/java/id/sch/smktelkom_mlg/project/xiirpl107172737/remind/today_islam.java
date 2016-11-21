package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.ReminderAdapter.ReminderAdapter;
import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.model.Reminder;

/**
 * Created by Alherani Junivia on 20/11/2016.
 */

public class today_islam extends Fragment {
    TextView tvHasil;
    String fajr, dzuhur, ashar, maghrib, isya;
    ArrayList<Reminder> mList = new ArrayList<>();
    ReminderAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_today_islam, container, false);
        return rootView;
    }
}
