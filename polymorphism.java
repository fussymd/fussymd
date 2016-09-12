package com.fussymentari.polymorphism;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class polymorphism extends AppCompatActivity {

    //overloading
    public class Raissa {
        public void Avissa() {System.out.print("R");}
    }
    public class Laissa {
        public void Dewarini(int i) {System.out.print("not R");}
    }
    

    //overriding
    public class RasiBintang {
        public void jenisBintang() {
            System.out.println("Scorpio");
        }
    }
    public class Vega extends RasiBintang {
        public void jenisBintang() {
            Log.d("Bentuk Rasi Bintang : ","Kalajengking");
        }
    }
    public class Capella extends RasiBintang {
        public void jenisBintang() {
            Log.d ("Bentuk Rasi Bintang : ","Ikan");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Vega object = new Vega();
        Capella object2 = new Capella();
        object.jenisBintang();
        object2.jenisBintang();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_polymorphism, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
