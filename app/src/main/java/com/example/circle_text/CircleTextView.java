package com.example.circle_text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class CircleTextView extends View {

    private Paint mPaint;
    private Paint mTextPaint;
    private Path mCirclePath;

    public CircleTextView(Context context) {
        super(context);
        mPaint = new Paint();
        mTextPaint = new Paint();
        mCirclePath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        setBackgroundResource(R.drawable.ic_launcher_background);

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2.0f);
        mPaint.setAntiAlias(true);
    }
}
