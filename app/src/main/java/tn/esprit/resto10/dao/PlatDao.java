package tn.esprit.resto10.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.resto10.Models.plat;


@Dao
public interface PlatDao {
    @Insert
    void insertPlat(plat plat);
    @Update
    void updatePlat(plat plat);
    @Delete
    void deletePlat(plat plat);

    @Query("SELECT * FROM plat")
    List<plat> getAllPlats();
}
