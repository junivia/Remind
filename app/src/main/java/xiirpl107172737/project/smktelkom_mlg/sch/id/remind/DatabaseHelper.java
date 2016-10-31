package xiirpl107172737.project.smktelkom_mlg.sch.id.remind;

/**
 * Created by rafiraharjo on 31/10/2016.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Agama.db";
    public static final String TABLE_NAME = "sholat";
    public static final String COL_1 = "fajar";
    public static final String COL_2 = "sunrise";
    public static final String COL_3 = "dhuhur";
    public static final String COL_4 = "ashar";
    public static final String COL_5 = "sunset";
    public static final String COL_6 = "maghrib";
    public static final String COL_7 = "isya";
    public static final String COL_8 = "imsak";
    public static final String COL_9 = "midnight";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, fajar TIME, sunrise TIME, dhuhur TIME, ashar TIME, sunset TIME, maghrib TIME, isya TIME, imsak TIME, midnight TIME)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
