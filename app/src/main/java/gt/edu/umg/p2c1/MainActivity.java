package gt.edu.umg.p2c1;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import gt.edu.umg.p2c1.BaseDatos.DbHelper;

public class MainActivity extends AppCompatActivity {

    Button btnSaludo, btnCrearDb;
    TextView tvSaludo;





    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);






        // codigo nuevo
        btnSaludo = findViewById(R.id.btnSaludo);
        tvSaludo = findViewById(R.id.tvSaludo);
        btnCrearDb = findViewById(R.id.btnCrearDb);

        btnCrearDb.setOnClickListener(v -> {

            //crear base de datos
            DbHelper dbHelper = new DbHelper(this);
            dbHelper.getWritableDatabase();
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            if (db!=null) {
                Toast.makeText(this, "Base de datos creada", Toast.LENGTH_SHORT).show();
                        tvSaludo.setText("Base de datos creada");
            } else {
                Toast.makeText(this, "Error al crear base de datos", Toast.LENGTH_SHORT).show();
                tvSaludo.setText("Error al crear base de datos");
            }

                });




        btnSaludo.setOnClickListener (v -> {
            Toast.makeText(this, "Aviso Raquel", Toast.LENGTH_SHORT).show();
            tvSaludo.setText(("Hola Raquel"));

        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}