package com.example.myvector

import android.content.Context
import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat

class AnimationUtil(context: Context) {
    private val sampleVector: AnimatedVectorDrawable = ContextCompat.getDrawable(context, R.drawable.sample_anim) as AnimatedVectorDrawable

    fun playAnimation(imageView: ImageView){
        imageView.setImageDrawable(sampleVector)
        imageView.visibility = View.VISIBLE
        sampleVector.start()
        sampleVector.registerAnimationCallback(object : Animatable2.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                super.onAnimationEnd(drawable)
                imageView.visibility = View.INVISIBLE
                sampleVector.stop()
            }
        })
    }
}