package com.example.revesion2.model;

public class ModelTemp {
    // Déclaration des variables privées celsius et fahrenheit
    private Double c, f;

    // Constructeur prenant une température en Celsius en entrée
    public ModelTemp(Double Temp) {
        this.c = Temp;
        // Appel de la méthode de conversion
        convert1();
    }

    // Méthode privée pour convertir la température en Celsius en Fahrenheit
    private void convert1() {
        // Calcul de la température en Fahrenheit et stockage dans la variable fahrenheit
        f = (double) ((c * (9 / 5)) + 32);
    }

    // Méthode publique pour obtenir la nouvelle température en Fahrenheit
    public Double getNewTemp() {
        return f;
    }
}
