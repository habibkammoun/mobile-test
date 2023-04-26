package com.example.revesion2.model;

public class Model {
    // Déclaration des variables privées pour les montants en euro, USD, GBP et dinars
    private Double euro, usd, gbp, dinar;

    // Constructeur prenant un montant en dinars en entrée
    public Model(Double dinar) {
        this.dinar = dinar;
        // Appel de la méthode de conversion
        convert();
    }

    // Méthode privée pour convertir les montants de dinars en euro, USD et GBP
    private void convert() {
        // Conversion en euro avec un taux de change fixe
        euro = (double) dinar / 3.3360;
        // Conversion en USD avec un taux de change fixe
        usd = (double) dinar / 3.7830;
        // Conversion en GBP avec un taux de change fixe
        gbp = (double) dinar / 3.1130;
    }

    // Méthode publique pour obtenir le montant en euro converti
    public Double getEuro() {
        return euro;
    }

    // Méthode publique pour obtenir le montant en GBP converti
    public Double getGbp() {
        return gbp;
    }

    // Méthode publique pour obtenir le montant en USD converti
    public Double getUsd() {
        return usd;
    }
}

