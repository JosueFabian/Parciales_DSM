package sv.edu.udb.loginparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
    }
    public void calcular(View view){
        double x1, x2;

        EditText valora = findViewById(R.id.txtvalora);
        EditText valorb = findViewById(R.id.txtvalorb);
        EditText valorc = findViewById(R.id.txtvalorc);
        TextView resultado = findViewById(R.id.tvResultado);

        double a = Double.parseDouble(valora.getText().toString());
        double b = Double.parseDouble(valorb.getText().toString());
        double c = Double.parseDouble(valorc.getText().toString());

        double d = ((Math.pow(b, 2))-(4*a*c));

        if(a == 0){resultado.setText("No se puede realizar división entre 0");
        } else {
            if (d < 0) {
                resultado.setText("No existe soluciones reales");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);

                x2 = (-b - Math.sqrt(d)) / (2 * a);

                resultado.setText("Solución X1: " + x1 + "\n Solución X2: " + x2);
            }
        }

    }
}