package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;

/**
 * Created by HARSHIT on 15-Feb-18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DBNAME="db.sql";
    public  static final int DBVERSION=1;
    public DatabaseHelper(Context context) {

        super(context, DBNAME, null, DBVERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table person(srno integer primary key autoincrement,tournament_name1 text,address1 text,full_name1 text,last_name1 text)");
        Log.e("DB", "created");

        Log.e("error",db.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public ArrayList<Person> getAllPerson()
    {
        ArrayList<Person> arr=new ArrayList<Person>();

        SQLiteDatabase db=getWritableDatabase();

        String query="select * from person";

        Cursor cur=db.rawQuery(query, null);

        Log.e("rows ", cur.getCount()+"" );

        while(cur.moveToNext())
        {
            int srno=cur.getInt(0);
            String tournament_name1=cur.getString(1);
            String address1=cur.getString(2);
            String full_name1=cur.getString(3);
            String last_name1=cur.getString(4);
            Person p1=new Person(srno,tournament_name1,address1,full_name1,last_name1);
            arr.add(p1);
        }
        db.close();
        cur.close();
        return arr;
    }

    public boolean addPerson(Person p1)
    {
        SQLiteDatabase db=getWritableDatabase();
        boolean result=true;

        try{

            ContentValues cv=new ContentValues();
            cv.put("tournament_name1",p1.getTournament_name1());
            cv.put("address1",p1.getAddress1());
            cv.put("full_name1",p1.getFull_name1());
            cv.put("last_name1",p1.getLast_name1());
            db.insert("person",null,cv );

            Log.e("error Insert",db.toString());

        }catch(SQLiteException ex)
        {
            Log.e("error ", ex.toString());
            result=false;
        }

        db.close();
        return result;

    }

}
