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
  List<Long> insert(List<Jobs> jobs);

  @Query("SELECT * FROM Jobs ORDER BY event DESC")
  List<Jobs> select();

  @Query("SELECT * FROM Jobs ORDER BY event DESC")
  long getJobsId();

  @Update
  int update(Jobs jobs);

  @Delete
  int delete(Jobs jobs);

  @Delete
  int delete(List<Jobs> jobs);
}
