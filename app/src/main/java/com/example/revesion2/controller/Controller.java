package com.example.revesion2.controller;
import com.example.revesion2.model.Model;

public final class Controller {
    // Déclaration de la variable statique pour l'instance unique de Model
    private static Model model;
    // Déclaration de la variable statique pour l'instance unique de Controller
    private static Controller instance = null;

    // Constructeur privé pour éviter la création d'instances supplémentaires
    private Controller() {
        super();
    }

    // Méthode statique pour obtenir l'instance unique de Controller
    public final static Controller getInsatance() {
        // Si l'instance n'a pas encore été créée, en créer une nouvelle
        if (Controller.instance == null) {
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }

    // Méthode pour créer une instance de Model avec un montant de dinars en entrée
    public void createModel(Double dinar) {
        model = new Model(dinar);
    }

    // Méthodes pour obtenir les taux de change convertis en euros, dollars américains et livres sterling depuis Model
    public double getEuro() {
        return model.getEuro();
    }
    public double getGbp() {
        return model.getGbp();
    }
    public double getUsd() {
        return model.getUsd();
    }
}


