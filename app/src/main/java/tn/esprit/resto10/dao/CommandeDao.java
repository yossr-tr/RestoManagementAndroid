package tn.esprit.resto10.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.resto10.Models.commande;
import tn.esprit.resto10.Models.table;

@Dao
public interface CommandeDao {
   // @Query("SELECT * FROM Commande WHERE 'iTable' = :iTable")
   // LiveData<List<commande>> getCommande(int iTable);
    @Insert
    void insertCommande(commande commande);
    @Update
    void updateCommande(commande commande);
    @Delete
    void deleteCommande(commande commande);

    @Query("SELECT * FROM commande WHERE 'idCommande' = :idCommande")
    LiveData<commande> getCommande(int idCommande);

    @Query("SELECT * FROM commande")
    List<commande> getAllCommandes();
}
