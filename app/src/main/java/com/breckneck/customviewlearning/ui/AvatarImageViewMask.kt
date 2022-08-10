package com.breckneck.customviewlearning.ui

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import com.breckneck.customviewlearning.extention.dpToPx

class AvatarImageViewMask @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatImageView(context, attrs, defStyleAttr) {

    companion object{
        private const val DEFAULT_SIZE = 40
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e("TAG", "onAttachedToWindow")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.e("TAG", "onMeasure width: ${MeasureSpec.toString(widthMeasureSpec)}, " +
                "height: ${MeasureSpec.toString(heightMeasureSpec)}")

        val initSize = resolveDefaultSize(spec = widthMeasureSpec)
        setMeasuredDimension(initSize, initSize)
        Log.e("TAG", "onMeasure after set size: $measuredWidth $measuredHeight")
    }

    private fun resolveDefaultSize(spec: Int): Int {
        return when (MeasureSpec.getMode(spec)) {
            MeasureSpec.UNSPECIFIED -> context.dpToPx(DEFAULT_SIZE).toInt() //resolveDefaultSize()
            MeasureSpec.AT_MOST -> MeasureSpec.getSize(spec)
            MeasureSpec.EXACTLY -> MeasureSpec.getSize(spec)
            else -> MeasureSpec.getSize(spec)
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.e("TAG", "onSizeChanged")
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