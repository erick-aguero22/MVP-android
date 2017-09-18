package com.aguero.erick.mvpexample;

public interface Sumar {

    interface View{
        void showResult(String msj);
        void showError(String error);
    }

    interface Presenter{
        void showResult(String msj);
        void showError(String error);
        void sumarValores(String valor1 , String valor2);
    }

    interface Model{
        void sumarValores(String valor1 , String valor2);
    }

} 