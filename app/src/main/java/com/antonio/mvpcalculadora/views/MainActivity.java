package com.antonio.mvpcalculadora.views;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.antonio.mvpcalculadora.R;
import com.antonio.mvpcalculadora.interfaces.Presenter;
import com.antonio.mvpcalculadora.presenters.PresenterImp;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements com.antonio.mvpcalculadora.interfaces.View {

    private EditText main_number_one,main_number_two;
    private Presenter mPresenter;//La interfaz del Presenter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_number_one = findViewById(R.id.main_number_one);
        main_number_two =  findViewById(R.id.main_number_two);
        mPresenter = new PresenterImp(this);//Creamos un ejemplar a partir de la interfaz y le pasamos la view
    }


    @Override
    public void setResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    public void calcularSuma(View view) {
        //Comunicamos con el Presenter...
        mPresenter.Operacion(main_number_one.getText().toString(),main_number_two.getText().toString());

    }
}
