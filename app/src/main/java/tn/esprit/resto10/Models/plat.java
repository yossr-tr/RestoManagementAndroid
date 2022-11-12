package tn.esprit.resto10.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName= "plat")
public class plat {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_plat")
    int idPlat;
    @ColumnInfo(name = "description_plat")
    String descriptionPlat;
    @ColumnInfo(name = "photo_plat")
    String photoPlat;
    @ColumnInfo(name = "prix_plat")
    float prixPlat;
    @ColumnInfo(name = "quantite_plat")
    int quantitePlat;

    public plat() {
    }

    public plat(int idPlat, String descriptionPlat, String photoPlat, float prixPlat, int quantitePlat) {
        this.idPlat = idPlat;
        this.descriptionPlat = descriptionPlat;
        this.photoPlat = photoPlat;
        this.prixPlat = prixPlat;
        this.quantitePlat = quantitePlat;
    }

    public plat(String descriptionPlat, String photoPlat, float prixPlat, int quantitePlat) {
        this.descriptionPlat = descriptionPlat;
        this.photoPlat = photoPlat;
        this.prixPlat = prixPlat;
        this.quantitePlat = quantitePlat;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public String getDescriptionPlat() {
        return descriptionPlat;
    }

    public String getPhotoPlat() {
        return photoPlat;
    }

    public float getPrixPlat() {
        return prixPlat;
    }

    public int getQuantitePlat() {
        return quantitePlat;
    }

    public void setIdPlat(int idPlat) {
        this.idPlat = idPlat;
    }

    public void setDescriptionPlat(String descriptionPlat) {
        this.descriptionPlat = descriptionPlat;
    }

    public void setPhotoPlat(String photoPlat) {
        this.photoPlat = photoPlat;
    }

    public void setPrixPlat(float prixPlat) {
        this.prixPlat = prixPlat;
    }

    public void setQuantitePlat(int quantitePlat) {
        this.quantitePlat = quantitePlat;
    }
}
