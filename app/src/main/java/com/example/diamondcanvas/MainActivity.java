package com.example.diamondcanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    // used for drawing
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint();
    private Bitmap mBitmap;
    private ImageView mImageView;

    // used for setting bounds
    private int counter = 0;
    private Rect mBounds = new Rect();

    // the color
    private int mColorLight;
    private int mColorMedium;
    private int mColorDark;
    private int mColorBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign color
        mColorLight = ResourcesCompat.getColor(getResources(), R.color.blue_light, null);
        mColorMedium = ResourcesCompat.getColor(getResources(), R.color.blue_medium, null);
        mColorDark = ResourcesCompat.getColor(getResources(), R.color.blue_dark, null);
        mColorBg = ResourcesCompat.getColor(getResources(), R.color.soft_pink, null);

        // setting paint
        mPaint.setColor(mColorBg);
        mPaintText.setColor(Color.BLACK);
        mPaintText.setTextSize(80);

        // assign image view
        mImageView = findViewById(R.id.main_image);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawDiamond(view);
            }
        });
    }

    private void drawDiamond(View view) {
        // TODO: Change background color
        int width = view.getWidth();
        int height = view.getHeight();
        int halfWidth = (view.getWidth()) / 2;
        int halfHeight = (view.getHeight()) / 2;
        if (counter == 0) {
            mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            mImageView.setImageBitmap(mBitmap);
            mCanvas = new Canvas(mBitmap);
            mCanvas.drawColor(mColorBg);
        } else if (counter == 1) {
            mPaint.setColor(mColorLight);
            Point point1a = new Point();
            Point point1b = new Point();
            Point point1c = new Point();
            point1a.set(halfWidth - 100, halfHeight - 150);
            point1b.set(halfWidth + 100, halfHeight - 150);
            point1c.set(halfWidth, halfHeight - 250);
            Path path1 = new Path();
            path1.setFillType(Path.FillType.EVEN_ODD);
            path1.lineTo(point1a.x, point1a.y);
            path1.lineTo(point1b.x, point1b.y);
            path1.lineTo(point1c.x, point1c.y);
            path1.lineTo(point1a.x, point1a.y);
            path1.close();
            mCanvas.drawPath(path1, mPaint);
        } else if (counter == 2) {
            mPaint.setColor(mColorMedium);
            Point point2a = new Point();
            Point point2b = new Point();
            Point point2c = new Point();
            point2a.set(halfWidth, halfHeight - 250);
            point2b.set(halfWidth - 200, halfHeight - 250);
            point2c.set(halfWidth - 100, halfHeight - 150);
            Path path2 = new Path();
            path2.setFillType(Path.FillType.EVEN_ODD);
            path2.lineTo(point2a.x, point2a.y);
            path2.lineTo(point2b.x, point2b.y);
            path2.lineTo(point2c.x, point2c.y);
            path2.lineTo(point2a.x, point2a.y);
            path2.close();
            mCanvas.drawPath(path2, mPaint);
        } else if (counter == 3) {
            mPaint.setColor(mColorMedium);
            Point point3a = new Point();
            Point point3b = new Point();
            Point point3c = new Point();
            point3a.set(halfWidth, halfHeight - 250);
            point3b.set(halfWidth + 200, halfHeight - 250);
            point3c.set(halfWidth + 100, halfHeight - 150);
            Path path3 = new Path();
            path3.setFillType(Path.FillType.EVEN_ODD);
            path3.lineTo(point3a.x, point3a.y);
            path3.lineTo(point3b.x, point3b.y);
            path3.lineTo(point3c.x, point3c.y);
            path3.lineTo(point3a.x, point3a.y);
            path3.close();
            mCanvas.drawPath(path3, mPaint);
        } else if (counter == 4) {
            mPaint.setColor(mColorDark);
            Point point4a = new Point();
            Point point4b = new Point();
            Point point4c = new Point();
            point4a.set(halfWidth - 100, halfHeight - 150);
            point4b.set(halfWidth - 300, halfHeight - 150);
            point4c.set(halfWidth - 200, halfHeight - 250);
            Path path4 = new Path();
            path4.setFillType(Path.FillType.EVEN_ODD);
            path4.lineTo(point4a.x, point4a.y);
            path4.lineTo(point4b.x, point4b.y);
            path4.lineTo(point4c.x, point4c.y);
            path4.lineTo(point4a.x, point4a.y);
            path4.close();
            mCanvas.drawPath(path4, mPaint);
        } else if (counter == 5) {
            mPaint.setColor(mColorDark);
            Point point5a = new Point();
            Point point5b = new Point();
            Point point5c = new Point();
            point5a.set(halfWidth + 100, halfHeight - 150);
            point5b.set(halfWidth + 300, halfHeight - 150);
            point5c.set(halfWidth + 200, halfHeight - 250);
            Path path5 = new Path();
            path5.setFillType(Path.FillType.EVEN_ODD);
            path5.lineTo(point5a.x, point5a.y);
            path5.lineTo(point5b.x, point5b.y);
            path5.lineTo(point5c.x, point5c.y);
            path5.lineTo(point5a.x, point5a.y);
            path5.close();
            mCanvas.drawPath(path5, mPaint);
        } else if (counter == 6) {
            mPaint.setColor(mColorDark);
            Point point6a = new Point();
            Point point6b = new Point();
            Point point6c = new Point();
            point6a.set(halfWidth - 100, halfHeight - 150);
            point6b.set(halfWidth + 100, halfHeight - 150);
            point6c.set(halfWidth, halfHeight + 300);
            Path path6 = new Path();
            path6.setFillType(Path.FillType.EVEN_ODD);
            path6.lineTo(point6a.x, point6a.y);
            path6.lineTo(point6b.x, point6b.y);
            path6.lineTo(point6c.x, point6c.y);
            path6.lineTo(point6a.x, point6a.y);
            path6.close();
            mCanvas.drawPath(path6, mPaint);
        } else if (counter == 7) {
            mPaint.setColor(mColorMedium);
            Point point7a = new Point();
            Point point7b = new Point();
            Point point7c = new Point();
            point7a.set(halfWidth - 100, halfHeight - 150);
            point7b.set(halfWidth - 300, halfHeight - 150);
            point7c.set(halfWidth, halfHeight + 300);
            Path path7 = new Path();
            path7.setFillType(Path.FillType.EVEN_ODD);
            path7.lineTo(point7a.x, point7a.y);
            path7.lineTo(point7b.x, point7b.y);
            path7.lineTo(point7c.x, point7c.y);
            path7.lineTo(point7a.x, point7a.y);
            path7.close();
            mCanvas.drawPath(path7, mPaint);
        } else if (counter == 8) {
            mPaint.setColor(mColorLight);
            Point point8a = new Point();
            Point point8b = new Point();
            Point point8c = new Point();
            point8a.set(halfWidth + 100, halfHeight - 150);
            point8b.set(halfWidth + 300, halfHeight - 150);
            point8c.set(halfWidth, halfHeight + 300);
            Path path8 = new Path();
            path8.setFillType(Path.FillType.EVEN_ODD);
            path8.lineTo(point8a.x, point8a.y);
            path8.lineTo(point8b.x, point8b.y);
            path8.lineTo(point8c.x, point8c.y);
            path8.lineTo(point8a.x, point8a.y);
            path8.close();
            mCanvas.drawPath(path8, mPaint);
        } else if (counter == 9) {
            String text = getString(R.string.main_title);
            mPaintText.getTextBounds(text, 0, text.length(), mBounds);
            int x = halfWidth - mBounds.centerX();
            int y = halfHeight/2;
            mCanvas.drawText(text, x, y, mPaintText);
        } else {
            mCanvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
            mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            mImageView.setImageBitmap(mBitmap);
            mCanvas = new Canvas(mBitmap);
            mCanvas.drawColor(mColorBg);
            counter = 0;
        }

        counter +=1;
        view.invalidate();
    }
}