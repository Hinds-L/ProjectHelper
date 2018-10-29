package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Invoice {
    @ColumnInfo(name="invoice_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    //TODO define other fields and columns


    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    @ColumnInfo(name="invoice_date")
    @PrimaryKey(autoGenerate = true)
    private int invDate;

    //TODO define other fields and columns


    public int getInvDate() {

        return invDate;
    }

    public void setInvDate(int invDate) {

        this.invDate = invDate;
    }

    @ColumnInfo(name="invoice_price")
    @PrimaryKey(autoGenerate = true)
    private invPrice;

    //TODO define other fields and columns


    public long getInvPrice() {
        return invPrice;
    }

    public void setInvPrice(long id) {

        this.invPrice = invPrice;
    }

    @ColumnInfo(name="invoice_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    //TODO define other fields and columns


    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }
}
