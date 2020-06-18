package br.com.senac.model.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import br.com.senac.model.vo.Cidade;
import br.com.senac.model.vo.Consulta;

public class MyORMLiteHelper extends OrmLiteSqliteOpenHelper {

    //Configuração do banco de dados
    private static final String DATABASE_NAME = "openweather.db";
    private static final int DATABASE_VERSION = 4;

    public MyORMLiteHelper(Context c){
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, Cidade.class);
            TableUtils.createTableIfNotExists(connectionSource, Consulta.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Cidade.class, true);
            TableUtils.dropTable(connectionSource, Consulta.class, true);
            onCreate(sqLiteDatabase, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
