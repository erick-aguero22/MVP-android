package com.aguero.erick.mvpexample;

public class SumarModel implements Sumar.Model {

    private Sumar.Presenter presenter;
    int resultado;

    public SumarModel(Sumar.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void sumarValores(String valor1, String valor2) {
        if(valor1 == null || valor1.equals("")){
            presenter.showError("numero 1 con valor vacio");
        }
        else if(valor2 == null || valor2.equals("")){
            presenter.showError("numero 2 con valor vacio");
        }
        else {
            try {
                resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2);
                presenter.showResult(String.valueOf(resultado));
            }catch (NumberFormatException e){
                presenter.showError(e.getMessage());
            }
        }
    }
}