package com.breckneck.customviewlearning.ui

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log

class AvatarImageViewMask @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatImageView(context, attrs, defStyleAttr) {

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e("TAG", "onAttachedToWindow")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.e("TAG", "onMeasure")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.e("TAG", "onLayout")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.e("TAG", "onDraw")
    }

}