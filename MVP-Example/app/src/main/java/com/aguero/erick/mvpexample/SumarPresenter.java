package com.aguero.erick.mvpexample;

public class SumarPresenter implements Sumar.Presenter {

    private Sumar.View view;
    private Sumar.Model model;

    public SumarPresenter(Sumar.View view){
        this.view = view;
        model = new SumarModel(this);
    }

    @Override
    public void showResult(String msj) {
        if(view != null){
            view.showResult(msj);
        }
    }

    @Override
    public void showError(String error) {
        if(view != null){
            view.showError(error);
        }
    }

    @Override
    public void sumarValores(String valor1, String valor2) {
        if(model != null){
            model.sumarValores(valor1,valor2);
        }
    }
}