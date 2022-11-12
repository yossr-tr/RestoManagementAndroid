package tn.esprit.resto10.Models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class boisson implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_boisson")
    int idBoisson;
    @ColumnInfo(name = "libelle_boisson")
    String lebelleBoisson;
    @ColumnInfo(name = "type_boisson")
    String typeBoisson;
    @ColumnInfo(name = "prix_boisson")
    float prixBoisson;

    @ColumnInfo(name = "image_boisson")
    String imageBoisson;



    public boisson(String lebelleBoisson, String typeBoisson, float prixBoisson, String imageBoisson) {
        this.lebelleBoisson = lebelleBoisson;
        this.typeBoisson = typeBoisson;
        this.prixBoisson = prixBoisson;
        this.imageBoisson = imageBoisson;
    }

    protected boisson(Parcel in) {
        idBoisson = in.readInt();
        lebelleBoisson = in.readString();
        typeBoisson = in.readString();
        prixBoisson = in.readFloat();
        imageBoisson = in.readString();
    }

    public static final Creator<boisson> CREATOR = new Creator<boisson>() {
        @Override
        public boisson createFromParcel(Parcel in) {
            return new boisson(in);
        }

        @Override
        public boisson[] newArray(int size) {
            return new boisson[size];
        }
    };

    public int getIdBoisson() {
        return idBoisson;
    }

    public String getLebelleBoisson() {
        return lebelleBoisson;
    }

    public String getTypeBoisson() {
        return typeBoisson;
    }

    public float getPrixBoisson() {
        return prixBoisson;
    }

    public String getImageBoisson() {return imageBoisson;}

    public void setIdBoisson(int idBoisson) {
        this.idBoisson = idBoisson;
    }

    public void setLebelleBoisson(String lebelleBoisson) {
        this.lebelleBoisson = lebelleBoisson;
    }

    public void setTypeBoisson(String typeBoisson) {
        this.typeBoisson = typeBoisson;
    }

    public void setPrixBoisson(float prixBoisson) {
        this.prixBoisson = prixBoisson;
    }

    public void setImageBoisson(String imageBoisson) {this.imageBoisson = imageBoisson;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(idBoisson);
        parcel.writeString(lebelleBoisson);
        parcel.writeString(typeBoisson);
        parcel.writeFloat(prixBoisson);
        parcel.writeString(imageBoisson);
    }
    private void readFromParcel(Parcel in ) {

        idBoisson = in.readInt();
        lebelleBoisson = in.readString();
        typeBoisson  = in.readString();
        prixBoisson       = in.readFloat();
        imageBoisson  = in.readString();
    }


}
