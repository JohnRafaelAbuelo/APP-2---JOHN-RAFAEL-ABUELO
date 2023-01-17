package com.example.app2_johnrafaelabuelo
//importing necessary modules
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_final_screen.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.popup.view.*

//class for finalscreen activity
class FinalScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)

        //getting values of text variables from previous activity (using intent)
        val intent=getIntent()
        val size=intent.getStringExtra("Size")
        val pay=intent.getStringExtra("Pay")
        sizeword.text=size
        payword.text=pay

        //showing pop up message to user
        val view = View.inflate(this@FinalScreen, R.layout.username, null)

        val builder = AlertDialog.Builder(this@FinalScreen)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        //setting dismiss option for pop up
        view.returnbtn.setOnClickListener{
            dialog.dismiss()
        }
//creating button for using the app again
        val againButton = findViewById<Button>(R.id.button)
        againButton.setOnClickListener{
            val Intent = Intent(this, FirstScreen::class.java)
            startActivity(Intent)
        }


    }
}