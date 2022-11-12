package tn.esprit.resto10.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.chromium.base.task.AsyncTask;

import tn.esprit.resto10.Models.boisson;
import tn.esprit.resto10.Models.commande;
import tn.esprit.resto10.Models.dessert;
import tn.esprit.resto10.Models.plat;
import tn.esprit.resto10.Models.table;
import tn.esprit.resto10.dao.BoissonDao;
import tn.esprit.resto10.dao.CommandeDao;
import tn.esprit.resto10.dao.DessertDao;
import tn.esprit.resto10.dao.PlatDao;
import tn.esprit.resto10.dao.TableDao;

@Database(entities = {boisson.class, commande.class, dessert.class, plat.class, table.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    // --- SINGLETON ---
    private static AppDataBase instance;
    // --- DAO ---
    public abstract BoissonDao boissonDao();
    public abstract CommandeDao commandeDao();
    public abstract DessertDao dessertDao();
    public abstract PlatDao platDao();
    public abstract TableDao tableDao();

    // --- Instance ---
    public static AppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class, "room_test_db")

                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
}
