package tn.esprit.resto10.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName= "dessert")
public class dessert {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_dessert")
    int idDessert;
    @ColumnInfo(name = "description_dessert")
    String descriptionDessert;
    @ColumnInfo(name = "photo_dessert")
    String photoDessert;
    @ColumnInfo(name = "prix_dessert")
    float prixDessert;
    @ColumnInfo(name = "quantite_dessert")
    int quantiteDessert;

    public dessert() {
    }


    public int getIdDessert() {
        return idDessert;
    }

    public String getDescriptionDessert() {
        return descriptionDessert;
    }

    public String getPhotoDessert() {
        return photoDessert;
    }

    public float getPrixDessert() {
        return prixDessert;
    }

    public int getQuantiteDessert() {
        return quantiteDessert;
    }

    public void setIdDessert(int idDessert) {
        this.idDessert = idDessert;
    }

    public void setDescriptionDessert(String descriptionDessert) {
        this.descriptionDessert = descriptionDessert;
    }

    public void setPhotoDessert(String photoDessert) {
        this.photoDessert = photoDessert;
    }

    public void setPrixDessert(float prixDessert) {
        this.prixDessert = prixDessert;
    }

    public void setQuantiteDessert(int quantiteDessert) {
        this.quantiteDessert = quantiteDessert;
    }
}
