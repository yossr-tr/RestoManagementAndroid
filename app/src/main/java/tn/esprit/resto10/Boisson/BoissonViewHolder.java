package tn.esprit.resto10.Boisson;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import tn.esprit.resto10.R;

public class BoissonViewHolder extends RecyclerView.ViewHolder{

     TextView name;
    TextView type;
     TextView price;
     EditText nameBoisson;
     ImageView imageView;


    public BoissonViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        imageView = itemView.findViewById(R.id.imageView);
        type = itemView.findViewById(R.id.type);
        price = itemView.findViewById(R.id.price);


    }


}
