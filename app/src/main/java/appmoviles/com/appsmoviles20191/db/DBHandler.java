package appmoviles.com.appsmoviles20191.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMoviles20191";
    public static final int DB_VERSION = 1;

    //TABLA AMIGOS
    public static final String TABLE_AMIGOS = "amigos";
    public static final String AMIGOS_ID = "id";
    public static final String AMIGOS_NOMBRE = "nombre";
    public static final String AMIGOS_EDAD = "edad";
    public static final String AMIGOS_CORREO = "correo";
    public static final String AMIGOS_TELEFONO = "telefono";
    public static final String CREATE_TABLE_AMIGOS = "CREATE TABLE "+TABLE_AMIGOS+" ("+AMIGOS_ID+" TEXT PRIMARY KEY, "+AMIGOS_NOMBRE+" TEXT, "+AMIGOS_EDAD+" TEXT, "+AMIGOS_CORREO+" TEXT, "+AMIGOS_TELEFONO+" TEXT)";

    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_AMIGOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
