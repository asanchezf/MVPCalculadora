package com.antonio.mvpcalculadora.interfaces;

/**
 * Created by Antonio Sánchez -- 21/09/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public interface Presenter {
    //Éstos son los métodos que se van a implementar en el Presenter
    void Operacion(String number_one,String number_two);
    void showErrorPresenter(String error);
    void setResultPresenter(String result);
}
