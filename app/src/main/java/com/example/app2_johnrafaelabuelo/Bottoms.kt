package com.example.app2_johnrafaelabuelo
//importing necessary modules
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.popup.view.*

//activity class for bottoms
class Bottoms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottoms)


//creating purchase button for bottoms item number 1
        val buyButton1 = findViewById<Button>(R.id.bottombtn1)
        buyButton1.setOnClickListener{
            val Intent = Intent(this, SizeAndPay::class.java)
            startActivity(Intent)
        }
//creating purchase button for bottoms item number 2
        val buyButton2 = findViewById<Button>(R.id.bottombtn2)
        buyButton2.setOnClickListener{
            val Intent = Intent(this, SizeAndPay::class.java)
            startActivity(Intent)
        }
    }
}