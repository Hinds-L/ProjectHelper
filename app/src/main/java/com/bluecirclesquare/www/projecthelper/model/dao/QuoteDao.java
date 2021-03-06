package com.bluecirclesquare.www.projecthelper.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.bluecirclesquare.www.projecthelper.model.entity.Quote;

import java.util.List;

@Dao
public interface QuoteDao {

    @Insert
    long insert (Quote quote);
    @Insert
    List<Long> insert(List<Quote> quotes);

    @Query("SELECT * FROM Quote ORDER BY event DESC")
    List<Quote> select();

    @Update
    int update(Quote quote);

    @Delete
    int delete(Quote quote);

    @Delete
    int delete(List<Quote> quotes);
}

