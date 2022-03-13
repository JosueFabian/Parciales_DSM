package sv.edu.udb.loginparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
    }

    public void contarvotos(View view) {

        int nulos = 0;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;

        double Votos0 = 0;
        double Votos1 = 0;
        double Votos2 = 0;
        double Votos3 = 0;
        double Votos4 = 0;


        EditText Tvotos = findViewById(R.id.etvotos);
        TextView resultado = findViewById(R.id.tvResultado);

        String voto = Tvotos.getText().toString();
        String[] Avotos = voto.split(",");
        int n = (voto.split(",").length);
        for(int i =0; i< n; i++ ){
            switch (Integer.valueOf(Avotos[i])){
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                default:
                    nulos++;
                    break;
            }
        }
        Votos0 = (nulos * 100) / n;
        Votos1 = (cand1 * 100) / n;
        Votos2 = (cand2 * 100) / n;
        Votos3 = (cand3 * 100) / n;
        Votos4 = (cand4 * 100) / n;

        resultado.setText("Candidato 1: votos: " +cand1+ "porcentaje:" + Votos1 + "%" + "\nCanditado 2: votos: " +cand2+ "porcentaje:" + Votos2+ "%" + "\n Canditado 3: votos:" +cand3+ "porcentaje:" + Votos3 + "%" + "\n Canditado 4: votos:" +cand4+ "porcentaje:" + Votos4 + "%" + "\n Votos Nulos: votos:" +nulos+ "porcentaje" + Votos0);




    }


    }