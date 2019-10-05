package com.antonio.mvpcalculadora.presenters;

import com.antonio.mvpcalculadora.interactors.InteractorImpl;
import com.antonio.mvpcalculadora.interfaces.Interactor;
import com.antonio.mvpcalculadora.interfaces.Presenter;
import com.antonio.mvpcalculadora.interfaces.View;

/**
 * Created by Antonio Sánchez -- 21/09/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public class PresenterImp implements Presenter {


    private View mView;//Es la Interfaz
    private Interactor mInteractor;//Es la Interfaz

    public PresenterImp(View view) {
        mView = view;
        mInteractor= new InteractorImpl(this);//Creamos un ejemplar a partir de la interfaz y le pasamos el Presenter
    }

    @Override
    public void Operacion(String number_one, String number_two) {
        mInteractor.Suma(number_one,number_two);
    }

    @Override
    public void showErrorPresenter(String error) {
        mView.showError(error);
    }

    @Override
    public void setResultPresenter(String result) {
    mView.setResult(result);
    }
}
