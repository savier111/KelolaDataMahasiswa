package com.example.mahasiswaactivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "datamahasiswa.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table mahasiswa(nim char(8) primary key, nama text null, tempat_lahir text null, tanggal_lahir date, agama text null,jk text null,no_telpon text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO mahasiswa (nim, nama, tempat_lahir, tanggal_lahir, agama, jk, alamat, no_telpon) VALUES ('72140048', 'Arnold Stanley', 'Ujung Pandang', '27-11-1996','Kristen','Laki-Laki','Jl.Gajah Mada Perumahan Taman sari blok F.40 Tiban Batam','089623198283');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}