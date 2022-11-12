package tn.esprit.resto10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tn.esprit.resto10.Boisson.BoissonActivity;
import tn.esprit.resto10.Commande.CommandeActivity;
import tn.esprit.resto10.Dessert.DessertActivity;
import tn.esprit.resto10.Plat.PlatActivity;
import tn.esprit.resto10.Table.TableActivity;

public class MainActivity extends AppCompatActivity {
    Button boisson,plat ,dessert ,tablep,commande;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plat = findViewById(R.id.plat);
        boisson = findViewById(R.id.boisson);
        dessert = findViewById(R.id.dessert);
        tablep = findViewById(R.id.tablep);
        commande = findViewById(R.id.commande);
        // plats ACTIVITY
        plat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked and passed to next activity
                Intent intent1 = new Intent(MainActivity.this, PlatActivity.class);
                startActivity(intent1);

            }
        });
        //boisson ACTIVITY
        boisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked and passed to next activity
                Intent intent2 = new Intent(MainActivity.this, BoissonActivity.class);
                 startActivity(intent2);

            }
        });
        //dessert Activity
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked and passed to next activity
                Intent intent3 = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(intent3);

            }
        });
        //tablep ACTIVITY
        tablep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked and passed to next activity
                Intent intent4 = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent4);

            }
        });
        //commande Activity
        commande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked and passed to next activity
                Intent intent5 = new Intent(MainActivity.this, CommandeActivity.class);
                startActivity(intent5);

            }
        });
    }





}