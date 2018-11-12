package com.bluecirclesquare.www.projecthelper.model.dao;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import com.bluecirclesquare.www.projecthelper.model.entity.Jobs;
import java.util.List;

@Dao
public interface JobsDao {

  @ColumnInfo(name="job_id")
  @PrimaryKey(autoGenerate = true)
  private long id;


  @Insert
  List<Long> insert(List<Jobs> jobs);

  @Query("SELECT * FROM Quote ORDER BY event DESC")
  List<Jobs> select();

  @Update
  int update(Jobs jobs);

  @Delete
  int delete(Jobs jobs);

  @Delete
  int delete(List<Jobs> jobs);
}
