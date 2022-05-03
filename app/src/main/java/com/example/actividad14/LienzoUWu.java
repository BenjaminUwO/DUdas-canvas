package com.example.actividad14;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class LienzoUWu extends View {

    public LienzoUWu(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        float ancho = claseAlmacenaValor.valor;
        float alto = claseAlmacenaValor.valor;
        float width = getWidth();
        float height = getHeight();

        Paint pincel = new Paint();
        pincel.setColor(Color.rgb(250, 0, 0));
        pincel.setStrokeWidth(10);
        canvas.drawRect(0, 0, claseAlmacenaValor.valor, claseAlmacenaValor.valor, pincel);

        pincel.setColor(Color.WHITE);


        canvas.drawCircle(0,0,ancho/2,pincel);
        canvas.drawCircle(ancho,0,ancho/2,pincel);
        canvas.drawCircle(0,alto,ancho/2,pincel);
        canvas.drawCircle(ancho,alto,ancho/2,pincel);

    }
}
