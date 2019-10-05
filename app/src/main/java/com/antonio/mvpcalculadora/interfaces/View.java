package com.antonio.mvpcalculadora.interfaces;

/**
 * Created by Antonio Sánchez -- 21/09/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public interface View {
    //Éstos son los métodos que se van a implementar en la vista
    void setResult(String result);
    void showError(String error);
}
