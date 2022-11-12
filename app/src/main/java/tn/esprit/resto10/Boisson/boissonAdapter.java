package tn.esprit.resto10.Boisson;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

import tn.esprit.resto10.MainActivity;
import tn.esprit.resto10.MainActivity3;
import tn.esprit.resto10.Models.boisson;
import tn.esprit.resto10.R;
import tn.esprit.resto10.database.AppDataBase;

public class boissonAdapter extends RecyclerView.Adapter<BoissonViewHolder> implements Serializable {
    List<boisson> boissonList;
    public boisson bupdate;


    public boissonAdapter(Context context) {

        AppDataBase db = AppDataBase.getAppDatabase(context);
        boissonList = db.boissonDao().getAllBoissons();
    }

    @NonNull
    @Override
    public BoissonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_boisson, parent, false);
        return new BoissonViewHolder(v);
    }


    public BoissonViewHolder itemHolder;
    @Override
    public void onBindViewHolder(@NonNull BoissonViewHolder holder, int position) {
        itemHolder = holder;
        Uri uri = null;
        boisson b = boissonList.get(position);
        //holder.itemView.setBackgroundColor(Color.CYAN);
        holder.name.setText(b.getLebelleBoisson());
        holder.type.setText(b.getTypeBoisson());
        holder.price.setText(String.valueOf(b.getPrixBoisson()));
        holder.imageView.setImageURI(uri.parse(b.getImageBoisson()));
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //  Toast.makeText(v.getContext(), b.getLebelleBoisson() + " Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent( view.getContext(), DetailBoissonActivity.class);
                intent.putExtra("boisson", b);
                view.getContext().startActivity(intent);
                                               }
                                           }


        );

    }

    @Override
    public int getItemCount() {
        return boissonList.size();
    }



    public void addBoisson(boisson b) {
        boissonList.add(b);
        notifyItemInserted(boissonList.size() - 1);
    }

}
