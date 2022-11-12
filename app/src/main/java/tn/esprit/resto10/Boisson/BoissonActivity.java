package tn.esprit.resto10.Boisson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.Serializable;

import tn.esprit.resto10.MainActivity3;
import tn.esprit.resto10.Models.boisson;
import tn.esprit.resto10.R;
import tn.esprit.resto10.database.AppDataBase;

public class BoissonActivity extends AppCompatActivity  {

    EditText name;
    EditText type;
    EditText price;
    Button addBoisson;
    Button uploadImageBoisson;
    RecyclerView recyclerView;
    ImageView imageBoisson;
    // constant to compare
    // the activity result code
    int SELECT_PICTURE = 200;
    String Uristring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boisson);

        name = findViewById(R.id.boissonName);
        type = findViewById(R.id.boissonType);
        price = findViewById(R.id.boissonPrice);
        addBoisson = findViewById(R.id.addBoisson);
        recyclerView = findViewById(R.id.boissons);
        uploadImageBoisson = findViewById(R.id.logout);
        imageBoisson  = findViewById(R.id.boissonImage);

        AppDataBase db = AppDataBase.getAppDatabase(BoissonActivity.this);
//        List<boisson> boissonList = db.BoissonDao().getAllBoissons();
        boissonAdapter adapter = new boissonAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));



        // handle the Choose Image button to trigger
        // the image chooser function
        uploadImageBoisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageChooser();
            }
        });

        addBoisson.setOnClickListener(v -> {
            String BoissonName = name.getText().toString();
            String BoissonType = type.getText().toString();
            float BoissonPrice = Float.parseFloat(price.getText().toString());
            boisson b = new boisson(BoissonName,BoissonType,BoissonPrice,Uristring);


            db.boissonDao().insertBoisson(b);


            adapter.addBoisson(b);

        });


       /* updateBoisson.setOnClickListener(v -> {
            sp.edit().clear().apply();
            finish();
        }); */


    }

    // this function is triggered when
    // the Select Image Button is clicked
    void imageChooser() {

        // create an instance of the
        // intent of the type image
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);

        // pass the constant to compare it
        // with the returned requestCode
        startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
    }
    // this function is triggered when user
    // selects the image from the imageChooser
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            // compare the resultCode with the
            // SELECT_PICTURE constant
            if (requestCode == SELECT_PICTURE) {
                // Get the url of the image from data
                Uri selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // update the preview image in the layout
                    Uristring = selectedImageUri.toString();
                    imageBoisson.setImageURI(selectedImageUri);
                }
            }
        }
    }
}