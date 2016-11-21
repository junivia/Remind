//package id.sch.smktelkom_mlg.project.xiirpl107172737.remind;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
///**
// * Created by Tefani Ender on 11/15/2016.
// */
//
//public class DatabaseHelperforDoa extends SQLiteOpenHelper {
//    public static final String DATABASE_NAME = "Doa.db";
//    public static final String TABLE_NAME = "doa";
//    public static final String COL_1 = "id_doa";
//    public static final String COL_2 = "agama";
//    public static final String COL_3 = "nama_doa";
//    public static final String COL_4 = "isi_doa";
//    public static final String COL_5 = "arti_doa";
////    public static final String COL_6 = "waktu_doa";
//
//    public DatabaseHelperforDoa(Context context) {
//        super(context, DATABASE_NAME, null, 1);
////        SQLiteDatabase db = this.getWritableDatabase();
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE " + TABLE_NAME + " ( " +
//                COL_1 + " INT(11) PRIMARY KEY AUTOINCREMENT ," +
//                COL_2 + " TEXT," +
//                COL_3 + " TEXT," +
//                COL_4 + " VARCHAR(2000)," +
//                COL_5 + " TEXT)");
//
////                COL_6 + " TIME)");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//}

