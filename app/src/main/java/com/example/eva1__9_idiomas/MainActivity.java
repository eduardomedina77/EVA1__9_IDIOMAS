package com.example.eva1__9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpIdioma;
    RadioButton rdBtnEspañol, rdBtnIngles, rdBtnMuch, rdBtnPoco, rdBtnPichu;
    TextView txtVwnom, txtVwApe, txtVwsex, txtVwNom , txtVwape;
    EditText edTxtNom, edTxtApe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpIdioma=findViewById(R.id.rdGrpIdioma);
        rdBtnIngles= findViewById(R.id.rdBtnIngles);
        rdBtnEspañol= findViewById(R.id.rdBtnEspañol);
        rdBtnMuch = findViewById(R.id.rdBtnMuch);
        rdBtnPoco = findViewById(R.id.rdBtnPoco);
        rdBtnPichu = findViewById(R.id.rdBtnPichu);
        txtVwnom =findViewById(R.id.edtTxtNom);
        txtVwNom=findViewById(R.id.txtVwNom);
        txtVwape=findViewById(R.id.txtVwApe);
        txtVwApe= findViewById(R.id.edtTxtApe);
        txtVwsex=findViewById(R.id.TxtViewSex);

        rdGrpIdioma.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton radioButton =findViewById(i);
                        if (i == R.id.rdBtnEspañol){
                            rdBtnEspañol.setText(R.string.btn_es_español);
                            rdBtnIngles.setText(R.string.btn_es_ingles);
                            txtVwsex.setText(R.string.txt_es_sexo);
                            rdBtnMuch.setText(R.string.btn_es_mucho);
                            rdBtnPoco.setText(R.string.btn_es_poco);
                            rdBtnPichu.setText(R.string.btn_es_PichulaDeprimida);
                            txtVwnom.setText(R.string.txt_es_nombre);
                            txtVwApe.setText(R.string.txt_es_apellido);
                            txtVwNom.setText(R.string.txt_es_nombre);
                            txtVwape.setText(R.string.txt_es_apellido);
                        }else if (i == R.id.rdBtnIngles){
                            rdBtnEspañol.setText(R.string.btn_en_español);
                            rdBtnIngles.setText(R.string.btn_en_ingles);
                            rdBtnEspañol.setText(R.string.btn_en_español);
                            rdBtnIngles.setText(R.string.btn_en_ingles);
                            txtVwsex.setText(R.string.txt_en_sexo);
                            rdBtnMuch.setText(R.string.btn_en_mucho);
                            rdBtnPoco.setText(R.string.btn_en_poco);
                            rdBtnPichu.setText(R.string.btn_en_PichulaDeprimida);
                            txtVwnom.setText(R.string.txt_en_nombre);
                            txtVwApe.setText(R.string.txt_en_apellido);
                            txtVwNom.setText(R.string.txt_en_nombre);
                            txtVwape.setText(R.string.txt_en_apellido);

                        }

                    }
                }
        );
    }
}