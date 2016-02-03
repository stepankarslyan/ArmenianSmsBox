package database;

import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by stepan on 2/2/16.
 */
public class DatabaseManager extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "SMS";
    public static final Integer DATABASE_VERSION = 1;
    public static final String CATEGORY_TABLE = "category";
    public static final String CATEGORY_COLUMN_ID = "_id";
    public static final String CATEGORY_COLUMN_TITLE = "title";
    public static final String CATEGORY_COLUMN_TYPE = "type";
    public static final String query = "CREATE TABLE IF NOT EXISTS " + CATEGORY_TABLE + "(" + CATEGORY_COLUMN_ID + " int , " + CATEGORY_COLUMN_TITLE + " VARCHAR," + CATEGORY_COLUMN_TYPE + " VARCHAR);";

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("info", "This is db manager on upgrade event");
    }
}
