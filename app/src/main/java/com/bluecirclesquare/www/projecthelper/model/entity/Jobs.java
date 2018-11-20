package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.bluecirclesquare.www.projecthelper.model.dao.JobsDao;
import java.util.Date;

@Entity
public class Jobs {

  @ColumnInfo(name = "job_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "job_number", index = true, collate = ColumnInfo.NOCASE)
  private String jobNumber;
  private String description;
  private Date event;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getJobNumber() {
    return jobNumber;
  }

  public void setJobNumber(String jobs) {
    this.jobNumber = jobNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
