package tn.esprit.resto10.Models;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName= "commande",foreignKeys ={
        @ForeignKey(entity = plat.class,
                parentColumns = "id_plat",
                childColumns = "i_plat",
                onDelete = CASCADE),
        @ForeignKey(entity = boisson.class,
                parentColumns = "id_boisson",
                childColumns = "i_boisson",
                onDelete = CASCADE),
        @ForeignKey(entity = dessert.class,
                parentColumns = "id_dessert",
                childColumns = "i_dessert",
                onDelete = CASCADE),
        @ForeignKey(entity = table.class,
                parentColumns = "id_table",
                childColumns = "i_table",
                onDelete = CASCADE)
}
        )
public class commande {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_commande")
    int idCommande;
    @ColumnInfo(name = "total")
    float total;
    @ColumnInfo(name = "i_plat")
    public int iPlat;
    @ColumnInfo(name = "i_boisson")
    public int iBoisson;
    @ColumnInfo(name = "i_dessert")
    public int iDessert;
    @ColumnInfo(name = "i_table")
    public int iTable;

    public commande(int idCommande, float total) {
        this.idCommande = idCommande;
        this.total = total;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setiPlat(int iPlat) {
        this.iPlat = iPlat;
    }

    public void setiBoisson(int iBoisson) {
        this.iBoisson = iBoisson;
    }

    public void setiDessert(int iDessert) {
        this.iDessert = iDessert;
    }

    public void setiTable(int iTable) {
        this.iTable = iTable;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public float getTotal() {
        return total;
    }

    public int getiPlat() {
        return iPlat;
    }

    public int getiBoisson() {
        return iBoisson;
    }

    public int getiDessert() {
        return iDessert;
    }

    public int getiTable() {
        return iTable;
    }
}
