package gt.edu.umg.p2c1.BaseDatos;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;


public class DbHelper extends SQLiteOpenHelper{

    private static final int DB_VERSION = 1;
    private static final String DB_NOMBRE = "db_umg.db";
    public static final String TABLE_CONTACTOS = "t_contastos";

    //Constructor

    public DbHelper(@Nullable Context context){
        super(context, DB_NOMBRE, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
