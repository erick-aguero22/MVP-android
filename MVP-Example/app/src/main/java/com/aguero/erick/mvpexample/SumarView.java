package com.aguero.erick.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SumarView extends AppCompatActivity implements Sumar.View{


    private EditText etValor1, etValor2;
    private Button btnSumar;
    private TextView tvResultado;

    private Sumar.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText) findViewById(R.id.etValor1);
        etValor2 = (EditText) findViewById(R.id.etValor2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);

        presenter = new SumarPresenter(this);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.sumarValores(etValor1.getText().toString(),etValor2.getText().toString());
            }
        });
    }



    @Override
    public void showResult(String msj) {
        tvResultado.setText(msj);
    }

    @Override
    public void showError(String error) {
        tvResultado.setText(error);
    }
}
