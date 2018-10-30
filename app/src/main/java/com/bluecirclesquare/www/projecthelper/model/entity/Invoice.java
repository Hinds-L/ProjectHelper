package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Invoice {
    @ColumnInfo(name="invoice_id")
    @PrimaryKey(autoGenerate = true)
    private long id;




    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    @ColumnInfo(name="invoice_date")
    @PrimaryKey(autoGenerate = true)
    private int Date;


    public int getDate() {

        return Date;
    }

    public void setDate(int date) {

        this.Date = date;
    }

    @ColumnInfo(name="invoice_price")
    @PrimaryKey(autoGenerate = true)
    private  invPrice;

    public long getInvPrice() {
        return invPrice;
    }

    public void setInvPrice(long id) {

        this.invPrice = invPrice;
    }

}
