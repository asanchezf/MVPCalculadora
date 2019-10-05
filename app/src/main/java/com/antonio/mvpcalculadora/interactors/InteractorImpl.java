package com.antonio.mvpcalculadora.interactors;

import com.antonio.mvpcalculadora.interfaces.Interactor;
import com.antonio.mvpcalculadora.interfaces.Presenter;

/**
 * Created by Antonio Sánchez -- 21/09/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public class InteractorImpl implements Interactor {
    private Presenter mPresenter;
    private double resultado;

    public InteractorImpl(Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void Suma(String number_one, String number_two) {
       //CÁLCULO FINAL. Aquí toda la lógica de negocio

        if(number_one.equals("") || number_two.equals("")){
            mPresenter.showErrorPresenter("No puede haber campos vacíos!!!");
        }
        else

            try{
                resultado=Double.parseDouble(number_one)+Double.parseDouble(number_two);
                mPresenter.setResultPresenter(String.valueOf(resultado));
            }
            catch(Exception e) {
                mPresenter.showErrorPresenter(e.getMessage());
            }





    }
}
