package com.example.practnumber12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick_RadioButtons(view: View){
        val imageViewFruit:ImageView = findViewById(R.id.imageView)
        when(view.id){
            R.id.radioButtonApple -> {
                imageViewFruit.setImageResource(R.drawable.apple)
            }
            R.id.radioButtonPear -> {
                imageViewFruit.setImageResource(R.drawable.pear)
            }
            R.id.radioButtonGrape -> {
                imageViewFruit.setImageResource(R.drawable.grape)
            }
        }
    }
    fun onClick_CheckedBoxes(view: View){
        when(view.id){
            R.id.checkBoxApple -> {
                val imageViewApple:ImageView = findViewById(R.id.imageViewApple)
                val checkBox:CheckBox = findViewById(R.id.checkBoxApple)
                if(checkBox.isChecked == true) {
                    imageViewApple.setImageResource(R.drawable.apple)
                }
                else{
                    imageViewApple.setImageResource(0)
                }
            }
            R.id.checkBoxPear -> {
                val checkBox:CheckBox = findViewById(R.id.checkBoxPear)
                val imageViewPear:ImageView = findViewById(R.id.imageViewPear)
                if(checkBox.isChecked == true) {
                    imageViewPear.setImageResource(R.drawable.pear)
                }
                else{
                    imageViewPear.setImageResource(0)
                }
            }
            R.id.checkBoxGrape -> {
                val checkBox:CheckBox = findViewById(R.id.checkBoxGrape)
                val imageViewGrape:ImageView = findViewById(R.id.imageViewGrape)
                if(checkBox.isChecked == true) {
                    imageViewGrape.setImageResource(R.drawable.grape)
                }
                else{
                    imageViewGrape.setImageResource(0)
                }
            }
        }
    }
}