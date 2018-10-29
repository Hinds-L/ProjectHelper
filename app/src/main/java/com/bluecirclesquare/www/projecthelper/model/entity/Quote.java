package com.bluecirclesquare.www.projecthelper.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.icu.math.BigDecimal;

@Entity
public class Quote {

    @ColumnInfo(name="quote_id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    //TODO define other fields and columns


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ColumnInfo(name="invoice_number")
    @PrimaryKey(autoGenerate = true)
    private String invoiceNum;

    //TODO define other fields and columns


    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoice(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    @ColumnInfo(name="Contact")
    @PrimaryKey(autoGenerate = true)
    private String contact;

    //TODO define other fields and columns


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {

        this.contact = contact;
    }

    @ColumnInfo(name="quote_amount")
    @PrimaryKey(autoGenerate = true)
    private BigDecimal quoteAmount ;

    //TODO define other fields and columns


    public BigDecimal getQuoteAmount() {
        return quoteAmount;
    }

    public void setId(BigDecimal quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    @ColumnInfo(name="quote_description")
    @PrimaryKey(autoGenerate = true)
    private String quoteDescription;

    //TODO define other fields and columns


    public String getQuoteDescription() {

        return quoteDescription;
    }

    public void setQuoteDescription(String quoteDescription) {
        this.quoteDescription = quoteDescription;
    }
}
