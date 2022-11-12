package tn.esprit.resto10.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName= "tablep")
public class table {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_table")
    int idTable;
    @ColumnInfo(name = "nbr_personnes")
    int nbrPersonnes;
    @ColumnInfo(name = "disponibilite_table")
    boolean diponibiliteTable;

    public table() {
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public void setNbrPersonnes(int nbrPersonnes) {
        this.nbrPersonnes = nbrPersonnes;
    }

    public void setDiponibiliteTable(boolean diponibiliteTable) {
        this.diponibiliteTable = diponibiliteTable;
    }

    public int getIdTable() {
        return idTable;
    }

    public int getNbrPersonnes() {
        return nbrPersonnes;
    }

    public boolean isDiponibiliteTable() {
        return diponibiliteTable;
    }
}
