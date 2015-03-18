package com.kilomobi.thewaitinggame;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import java.util.List;

class ObjectDrawable extends Drawable {
    private Paint mPaint;

    public ObjectDrawable() {
        mPaint = new Paint();
        mPaint.setStrokeWidth(3);
    }

    @Override
    public void draw(Canvas canvas) {
    //    int x = getWidth();
    //    int y = getHeight();
        int radius;
        radius = 100;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#CD5C5C"));
    //    canvas.drawCircle(x / 2, y / 2, radius, paint);
    }

    @Override
    public void setAlpha(int alpha) {
    }

    @Override
    public void setColorFilter(ColorFilter cf) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}