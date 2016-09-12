package com.fussymentari.abstraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Abstraction extends AppCompatActivity {

    //Abstraction
    abstract class BilanganPrima {
        int a,b;
        void cari(int nilaiA, int nilaiB) {
            a = nilaiA;
            b = nilaiB;
        }
        abstract void adalah();
        abstract void dapat();
        }
    //end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstraction);
    }
}
