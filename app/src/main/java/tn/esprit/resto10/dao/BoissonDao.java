package tn.esprit.resto10.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.resto10.Models.boisson;

@Dao
public interface BoissonDao {
    @Insert
    void insertBoisson(boisson boisson);
    @Update
    void updateBoisson(boisson boisson);
    @Delete
    void deleteBoisson(boisson boisson);

    @Query("SELECT * FROM boisson WHERE 'idBoisson' = :idBoisson")
    LiveData<boisson> getBoisson(int idBoisson);

    @Query("SELECT * FROM boisson")
    List<boisson> getAllBoissons();
}
