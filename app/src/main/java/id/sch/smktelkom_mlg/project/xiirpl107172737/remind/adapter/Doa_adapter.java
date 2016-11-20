//package id.sch.smktelkom_mlg.project.xiirpl107172737.remind.adapter;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.R;
//import id.sch.smktelkom_mlg.project.xiirpl107172737.remind.model.Doa;
//
///**
// * Created by Tefani Ender on 11/15/2016.
// */
//
//public class Doa_adapter extends RecyclerView.Adapter<Doa_adapter.ViewHolder> {
//    ArrayList<Doa> Doa_list;
//
//    public Doa_adapter(ArrayList<Doa> Doa_list) {
//        this.Doa_list = Doa_list;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_design_doa, parent, false);
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        Doa doa = Doa_list.get(position);
//        holder.tvJudul.setText(doa.nama_doa);
//        holder.tvDoa.setText(doa.isi_doa);
//    }
//
//    @Override
//    public int getItemCount() {
//        if (Doa_list != null)
//            return Doa_list.size();
//        return 0;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView tvJudul, tvDoa;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
//            tvDoa = (TextView) itemView.findViewById(R.id.textViewDoa);
//        }
//    }
//}
