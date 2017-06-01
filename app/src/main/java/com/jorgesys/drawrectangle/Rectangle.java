package com.jorgesys.drawrectangle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Rectangle extends View {
    Paint paint = new Paint();

    public Rectangle(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(3);
        canvas.drawRect(0, 0, 400, 200, paint);
    }

}