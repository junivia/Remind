//package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.provider.Settings;
//import android.util.Log;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
///**
// * Created by Tefani Ender on 11/15/2016.
// */
//
//public class FirebaseToSQLLite  {
//    FirebaseDatabase fireDB = FirebaseDatabase.getInstance();
//    DatabaseReference myRef;
//
//    String[] myJ = new String[12];
//    SQLController dbController;
//    Context myContext;
//
//    public FirebaseToSQLLite(Context c){
//        dbController = new SQLController(c);
//        dbController.open();
//        myRef = fireDB.getReference();
//
//        myContext = c;
//    }
//
//    public void getDoa(){
//        myRef.child("0").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                ImportDataFromFirebase doa = dataSnapshot.getValue(ImportDataFromFirebase.class);
//                myJ[0] = doa.getId_doa();
//                myJ[1] = doa.getAgama();
//                myJ[2] = doa.getNama_doa();
//                myJ[3] = doa.getIsi_doa();
//                myJ[4] = doa.getArti_doa();
//                myJ[5] = doa.getWaktu_doa();
//
//                input("doa", myJ);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//        System.out.println("Harus tetap SEMANGAT dan BERSYUKUR yep!");
//    }
//
//    public void input(String doa, String[] myJ) {
//        try{
//            dbController.de
//        }catch (Exception e){
//
//        }
//        //INSERT KE SQLLITE
//        try {
//            dbController.insert(
//                    myJ[1],
//                    myJ[2],
//                    myJ[3],
//                    myJ[4],
//                    myJ[5]
//            );
//        } catch(Exception e) {
//            System.out.println("Harus tetap SEMANGAT dan BERSYUKUR yep!" + e.toString());
//        }
//    }
//
//    public String[] getArray(Integer id_doa){
//
//        Cursor cursor = dbController.getDB().rawQuery("SELECT nama_doa, isi_doa FROM doa WHERE id_doa = " + id_doa + "", null);
//
//        String[] doalist = new String[cursor.getColumnCount()]; //looping through all rows and adding to list
//
//        try {
//            if (cursor != null) {
//                if (cursor.moveToFirst()) {
//                    do {
//                        for (int i = 1; i < cursor.getColumnCount(); i++){
//                            doalist[i - 1] = cursor.getString(i);
//                        }
//                    } while (cursor.moveToNext());
//                }
//            }
//        } catch (Error e){
//
//        }
//
//        cursor.close();
//        return doalist;
//
//    }
//}
