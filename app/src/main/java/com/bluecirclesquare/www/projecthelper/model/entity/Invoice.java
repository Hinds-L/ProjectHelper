package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

@Entity
public class Invoice {

    @ColumnInfo(name="invoice_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    private Date completed;
    @NonNull
    private Date invoiced = new Date();
    private long price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    @NonNull
    public Date getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(@NonNull Date invoiced) {
        this.invoiced = invoiced;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
