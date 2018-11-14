package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;
import com.bluecirclesquare.www.projecthelper.model.dao.JobsDao;
import java.util.Date;

public class Jobs {
  @ColumnInfo(name = "job_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getJobs() {
    return jobs;
  }

  public void setJobs(String jobs) {
    this.jobs = jobs;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @ColumnInfo(name="job_number", index= true, collate = ColumnInfo.NOCASE)
  private String jobs;

  private String description;
  private Date event;
}
