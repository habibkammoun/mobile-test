package com.example.revesion2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import com.example.revesion2.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    // Déclaration des variables membres
    private ImageView convertDevise, convertTemp;

    // Initialisation des variables membres
    private void init(){
        convertDevise=(ImageView)findViewById(R.id.imgConv);
        convertTemp=(ImageView)findViewById(R.id.imgTemp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Définition du layout associé à l'activité
        setContentView(R.layout.activity_home);

        // Initialisation des variables membres
        init();

        // Mise en place des listeners sur les ImageView
        ecouteClick();
    }

    // Méthode pour naviguer vers une autre activité
    private void navigateToActivity(Class nextActivity){
        Intent intent = new Intent(HomeActivity.this,nextActivity);
        startActivity(intent);
        //finish();
    }

    // Mise en place des listeners sur les ImageView
    private void ecouteClick(){
        convertDevise.setOnClickListener((View.OnClickListener)this);
        convertTemp.setOnClickListener((View.OnClickListener)this);
    }

    // Gestion des clics sur les ImageView
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.imgConv :
                navigateToActivity(MainActivity.class);
                break;
            case R.id.imgTemp :
                navigateToActivity(TempActivity.class);
                break;
        }
    }
}
