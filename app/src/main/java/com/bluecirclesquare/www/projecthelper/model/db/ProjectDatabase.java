package com.bluecirclesquare.www.projecthelper.model.db;

import android.app.Dialog;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import com.bluecirclesquare.www.projecthelper.model.dao.InvoiceDao;
import com.bluecirclesquare.www.projecthelper.model.entity.Invoice;
import com.bluecirclesquare.www.projecthelper.model.entity.Jobs;
import com.bluecirclesquare.www.projecthelper.model.entity.Quote;
import java.util.Calendar;


@Database(entities = {Invoice.class, Jobs.class, Quote.class}, version = 1, exportSchema = true)
public abstract class ProjectDatabase extends RoomDatabase {

  private static final String DATABASE_NAME = "invoice_db";

  private static long invoiceId = 0;

  private static ProjectDatabase instance = null;
  private Calendar calendar = null;
  private Mode mode = Mode.DATE;
  private OnChangeListener listener = null;

  public static synchronized ProjectDatabase getInstance(Context context) {

    if (instance == null) {

      instance = Room.databaseBuilder(context.getApplicationContext(),

          ProjectDatabase.class,
          DATABASE_NAME)

          .addCallback(new Callback(context.getApplicationContext()))
          .build();
    }
    return instance;
  }

    public static synchronized void forgetInstance(Context context){

      instance = null;

    }

    public abstract InvoiceDao getInvoiceDao();

  private static class Callback extends RoomDatabase.Callback {



    private Context context;



    public Callback(Context context) {

      this.context = context;

    }



    @Override

    public void onCreate(@NonNull SupportSQLiteDatabase db) {

      super.onCreate(db);

      new PrepopulateTask(context).execute();

      Dialog dialog = null;

      Calendar defaultValue = (calendar != null) ? calendar : Calendar.getInstance();

    }



    @Override
    public void onOpen(@NonNull SupportSQLiteDatabase db) {
      super.onCreate(db);
    }
  }

  private static class PrepopulateTask extends AsyncTask<Void, Void, Void> {

    private Context context;



    public PrepopulateTask(Context context) {

      this.context = context;

    }



    @Override

    protected Void doInBackground(Void... voids){

      ProjectDatabase db = getInstance(context);

      InvoiceDao dao= db.getInvoiceDao();

      Invoice invoice = new Invoice();

      invoiceId++;

      invoice.setId(Long.valueOf(invoiceId));



      invoice.setCompleted("");

      invoice.setInvoiced("13");

      invoice.setPrice("");
      dao.insert(invoice);

      forgetInstance(context);

      return null;

    }

  }



}

