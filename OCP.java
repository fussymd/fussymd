package com.fussymentari.ocp;

import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OCP extends AppCompatActivity {

    //base interface
    public interface Bentuk{
        public double KalkulasiLuas(); //abstract method
    }

    //overriding
    public class Persegi implements Bentuk{
        double panjang;
        double lebar;
        public double KalkulasiLuas() {
            return panjang * lebar;
        }
    }

    public class Lingkaran implements Bentuk{
        public double radius;
        public double KalkulasiLuas(){
            return (22/7)*radius*radius;
        }
    }

        //Open Closed Principle
//    public class PerhitunganLuas{
//        public double KalkulasiLuasBentuk(Shape bentuk){
//            return bentuk.KalkulasiLuas();
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocp);
    }
}
