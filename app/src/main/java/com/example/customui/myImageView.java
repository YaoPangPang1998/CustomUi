package com.example.customui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/*高度与宽度相同的imageView*/
@SuppressLint("AppCompatCustomView")
public class myImageView extends ImageView {
    public myImageView(Context context) {
        super(context);
    }

    public myImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public myImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public myImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=Math.min(getMeasuredWidth(),getMeasuredWidth());
        setMeasuredDimension(width,width);
    }
}
