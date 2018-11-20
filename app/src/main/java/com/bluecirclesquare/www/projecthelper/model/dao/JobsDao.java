package com.bluecirclesquare.www.projecthelper.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import com.bluecirclesquare.www.projecthelper.model.entity.Jobs;
import java.util.List;

@Dao
public interface JobsDao {

  @Insert
  long insert (Jobs jobs);
  @Insert
  List<Long> insert(List<Jobs> jobs);

  @Query("SELECT * FROM Jobs ORDER BY occasion DESC")
  List<Jobs> select();

  @Update
  int update(Jobs jobs);

  @Delete
  int delete(Jobs jobs);

  @Delete
  int delete(List<Jobs> jobs);
}
