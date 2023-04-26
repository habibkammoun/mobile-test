package com.example.revesion2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.revesion2.controller.Controller;

import com.example.revesion2.R;

public class MainActivity extends AppCompatActivity {
    private EditText txtTND; // Champ de saisie pour le montant en TND
    private Button btnConvert; // Bouton de conversion
    private TextView lbEUR,lbUSD,lbGBP; // Labels pour afficher le montant converti dans différentes devises
    Controller controller=Controller.getInsatance(); // Instance du contrôleur du modèle (Singleton)
    private void init(){ // Méthode d'initialisation des composants de l'interface utilisateur
        txtTND=(EditText)findViewById(R.id.txtTND); // Récupération du champ de saisie pour le montant en TND
        btnConvert=(Button)findViewById(R.id.button_id); // Récupération du bouton de conversion
        lbEUR=(TextView) findViewById(R.id.txtEuro); // Récupération du label pour afficher le montant converti en euros
        lbUSD=(TextView) findViewById(R.id.txtUSD); // Récupération du label pour afficher le montant converti en dollars américains
        lbGBP=(TextView) findViewById(R.id.txGBP); // Récupération du label pour afficher le montant converti en livres sterling
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init(); // Initialisation des composants de l'interface utilisateur

        // Ajout d'un listener sur le bouton de conversion pour déclencher la méthode convert() lorsqu'il est cliqué
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }
    private void convert() // Méthode de conversion
    {

        Double dinar = null;
        try
        {
            // Récupération du texte du montant en TND avec getText()
            dinar = Double.parseDouble(txtTND.getText().toString());
        }
        catch (Exception e){ } // Pour ne pas se planter

        // Action de l'utilisateur + mise à jour du modèle
        controller.createModel(dinar);

        /* Les opérations de conversion ne sont pas réalisées ici car elles ne font pas partie de la logique du contrôleur.
           Elles sont effectuées dans le modèle et les résultats sont renvoyés à la vue via les méthodes du contrôleur. */

        // Mise à jour des labels pour afficher les montants convertis en euros, dollars américains et livres sterling
        lbEUR.setText(Double.toString(controller.getEuro()));
        lbUSD.setText(Double.toString(controller.getUsd()));
        lbGBP.setText(Double.toString(controller.getGbp())); // Notify view
    }
}
