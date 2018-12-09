package com.glintec.app.paintpixel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = findViewById(R.id.Layaout_activityMain);
        Lienzo li = new Lienzo(this);
        layout.addView(li);

    }

    class Lienzo extends View{

        public Lienzo(Context context) {
            super(context);
        }
        protected void OnDraw(Canvas canvas){

            canvas.drawRGB(255,255,0);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Paint pincel1 = new Paint();
            pincel1.setARGB(255,255,0,0);
//            canvas.drawPoint(ancho/2, alto/2,pincel1);
            canvas.drawLine(0,30,ancho, 30,pincel1);
            pincel1.setStrokeWidth(4);
            canvas.drawLine(0,60,ancho,60,pincel1);

        }
    }
}
