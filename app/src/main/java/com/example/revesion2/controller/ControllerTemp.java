package com.example.revesion2.controller;
import com.example.revesion2.model.ModelTemp;

public class ControllerTemp {
    // Déclaration de la variable statique pour l'instance unique de ModelTemp
    private static ModelTemp modelTemp;

    // Déclaration de la variable statique pour l'instance unique de ControllerTemp
    private static ControllerTemp instance = null;

    // Constructeur privé pour éviter la création d'instances supplémentaires
    private ControllerTemp() {
        super();
    }

    // Méthode statique pour obtenir l'instance unique de ControllerTemp
    public final static ControllerTemp getInsatance() {
        // Si l'instance n'a pas encore été créée, en créer une nouvelle
        if (ControllerTemp.instance == null) {
            ControllerTemp.instance = new ControllerTemp();
        }
        return ControllerTemp.instance;
    }

    // Méthode pour créer une instance de ModelTemp avec une température en Celsius en entrée
    public void createModelTemp(Double Temp) {
        modelTemp = new ModelTemp(Temp);
    }

    // Méthode pour obtenir la température convertie en Fahrenheit depuis ModelTemp
    public double getTemp() {
        return modelTemp.getNewTemp();
    }
}
