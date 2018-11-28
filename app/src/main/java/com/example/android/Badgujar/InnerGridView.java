package com.example.android.Badgujar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class InnerGridView extends GridView {

    public InnerGridView(Context context) {
            super(context);
        }

        public InnerGridView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }


        public InnerGridView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            // Max Height
            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                    MeasureSpec.AT_MOST);

            super.onMeasure(widthMeasureSpec, expandSpec);
        }
    }