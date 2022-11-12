package tn.esprit.resto10.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.resto10.Models.dessert;


@Dao
public interface DessertDao {
    @Insert
    void insertDessert(dessert dessert);
    @Update
    void updateDessert(dessert dessert);
    @Delete
    void deleteDessert(dessert dessert);

    @Query("SELECT * FROM dessert")
    List<dessert> getAllDesserts();
}
