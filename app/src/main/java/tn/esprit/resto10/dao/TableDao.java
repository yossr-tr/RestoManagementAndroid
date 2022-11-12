package tn.esprit.resto10.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.resto10.Models.table;

@Dao
public interface TableDao {
    @Insert
    void insertTable(table table);
    @Update
    void updateTable(table table);
    @Delete
    void deleteTable(table table);
    @Query("SELECT * FROM tablep")
    List<table> getAllTables();

}
