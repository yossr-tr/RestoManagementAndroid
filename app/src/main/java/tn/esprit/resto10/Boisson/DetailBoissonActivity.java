package tn.esprit.resto10.Boisson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.Serializable;

import tn.esprit.resto10.Models.boisson;
import tn.esprit.resto10.R;
import tn.esprit.resto10.database.AppDataBase;

public class DetailBoissonActivity extends AppCompatActivity {



    TextView t ;
    EditText boissonNameD ,boissonTypeD,boissonPrixD;
    ImageView boissonImageD;
    ImageButton edit,delete;
    Uri uri = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_boisson);
        boissonNameD  = findViewById(R.id.boissonNameD);
        boissonTypeD   = findViewById(R.id.boissonTypeD);
        boissonPrixD   = findViewById(R.id.boissonPrixD);
        boissonImageD   = findViewById(R.id.boissonImageD);
        edit = findViewById(R.id.edit);
        delete = findViewById(R.id.delete);
        // To retrieve object in second Activity
        boisson b = (boisson) getIntent().getParcelableExtra("boisson");
        boissonNameD.setText(b.getLebelleBoisson());
        boissonTypeD.setText(b.getTypeBoisson());
       boissonPrixD.setText(String.valueOf(b.getPrixBoisson()));

        boissonImageD.setImageURI(uri.parse(b.getImageBoisson()));
        AppDataBase db = AppDataBase.getAppDatabase(DetailBoissonActivity.this);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String BoissonName = boissonNameD.getText().toString();
                String BoissonType = boissonTypeD.getText().toString();
                float BoissonPrice = Float.parseFloat(boissonPrixD.getText().toString());
                b.setLebelleBoisson(BoissonName);
                b.setTypeBoisson(BoissonType);
                b.setPrixBoisson(BoissonPrice);
                db.boissonDao().updateBoisson(b);
                Toast.makeText(DetailBoissonActivity.this, b.getLebelleBoisson() + " Updated", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DetailBoissonActivity.this, BoissonActivity.class);
                startActivity(intent);

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.boissonDao().deleteBoisson(b);
                Toast.makeText(DetailBoissonActivity.this, b.getLebelleBoisson() + " deleted", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DetailBoissonActivity.this, BoissonActivity.class);
                startActivity(intent);
            }
        });


    }
}