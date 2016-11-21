package id.sch.smktelkom_mlg.project.xiirpl107172737.remind.ReminderAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.R;
import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.model.Reminder;

/**
 * Created by Fadhil Ikhsan on 21/11/2016.
 */

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {

    ArrayList<Reminder> reminderList;

    public ReminderAdapter(ArrayList<Reminder> reminderList) {
        this.reminderList = reminderList;
    }

    @Override
    public ReminderAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ReminderAdapter.ViewHolder holder, int position) {
        Reminder hotel = reminderList.get(position);
        holder.jam.setText(hotel.jam);
        holder.sholat.setText(hotel.sholat);
        holder.status.setText(hotel.status);

    }

    @Override
    public int getItemCount() {
        if (reminderList != null) return reminderList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView jam;
        TextView sholat;
        TextView status;
        ImageView sound;

        public ViewHolder(View itemView) {
            super(itemView);
            jam = (TextView) itemView.findViewById(R.id.JamDzuhur);
            sholat = (TextView) itemView.findViewById(R.id.SholatDzuhur);
            status = (TextView) itemView.findViewById(R.id.StatusDzuhur);
            sound = (ImageView) itemView.findViewById(R.id.AlarmDzuhur);
        }
    }
}


