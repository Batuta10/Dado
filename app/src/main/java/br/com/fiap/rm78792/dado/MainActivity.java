package br.com.fiap.rm78792.dado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgUsuario;
    ImageView imgPc;
    int [] dadoI = {R.drawable.dado1,
                    R.drawable.dado2,
                    R.drawable.dado3,
                    R.drawable.dado4,
                    R.drawable.dado5,
                    R.drawable.dado6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUsuario = (ImageView) findViewById(R.id.imgUsuario);
        imgPc = (ImageView) findViewById(R.id.imgPc);

    }//OnCreate

    public void rolar(View view) {
        Random roda = new Random();
        int usuario = roda.nextInt(6);
        int pc = roda.nextInt(6);

        imgUsuario.setImageResource(dadoI[usuario]);
        imgPc.setImageResource(dadoI[pc]);

        if (usuario > pc){
            Toast.makeText(this, R.string.strUGanha, Toast.LENGTH_SHORT).show();
        }else if (pc > usuario){
            Toast.makeText(this, R.string.strPGanha, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, R.string.strEmpate, Toast.LENGTH_SHORT).show();
        }
    }//Rolar
}//Main Class