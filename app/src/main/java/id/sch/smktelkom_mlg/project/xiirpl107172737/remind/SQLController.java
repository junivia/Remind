//package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;
//
///**
// * Created by Tefani Ender on 11/15/2016.
// */
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.SQLException;
//import android.database.sqlite.SQLiteDatabase;
//
//public class SQLController {
//    private DatabaseHelperforDoa dbHelper;
//    private Context ourcontext;
//    private SQLiteDatabase database;
//
//    public SQLController(Context c) {
//        ourcontext = c;
//    }
//
//    public SQLController open() throws SQLException {
//        dbHelper = new DatabaseHelperforDoa(ourcontext);
//        database = dbHelper.getWritableDatabase();
//        return this;
//
//    }
//
//    public void close() {
//        dbHelper.close();
//    }
//
//    public void insert(String agama, String nama_doa, String isi_doa, String arti_doa, String waktu_doa) {
//        ContentValues contentValue = new ContentValues();
//        contentValue.put(DatabaseHelperforDoa.COL_2, agama);
//        contentValue.put(DatabaseHelperforDoa.COL_3, nama_doa);
//        contentValue.put(DatabaseHelperforDoa.COL_4, isi_doa);
//        contentValue.put(DatabaseHelperforDoa.COL_5, arti_doa);
//        contentValue.put(DatabaseHelperforDoa.COL_6, waktu_doa);
//        database.insert(DatabaseHelperforDoa.TABLE_NAME, null, contentValue);
//    }
//
//    public SQLiteDatabase getDB(){
//        return database;
//    }
//
////    public Cursor fetch() {
////        String[] columns = new String[] { DatabaseHelperforDoa.COL_1, DatabaseHelperforDoa.TODO_SUBJECT,
////                DatabaseHelperforDoa.TODO_DESC };
////        Cursor cursor = database.query(DatabaseHelperforDoa.TABLE_NAME, columns, null,
////                null, null, null, null);
////        if (cursor != null) {
////            cursor.moveToFirst();
////        }
////        return cursor;
////    }
//
//    public void delete(long _id) {
//        database.delete(DatabaseHelperforDoa.TABLE_NAME, DatabaseHelperforDoa.COL_1 + "=" + _id, null);
//    }
//}
