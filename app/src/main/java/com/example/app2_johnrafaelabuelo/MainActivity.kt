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

//creating class activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//taking user input from previous class using intent
        val intent=getIntent()
        val name=intent.getStringExtra("Name")
        usersname.text="Hello, "+name


        //showing pop up instruction to user
        val view = View.inflate(this@MainActivity, R.layout.popup, null)

        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        //setting dismiss option for pop up
        view.returnbtn.setOnClickListener{
            dialog.dismiss()
        }

        //creating button for jackets option
        val jacketsButton = findViewById<Button>(R.id.jacketbtn)
        jacketsButton.setOnClickListener{
            val Intent = Intent(this, Jackets::class.java)
            startActivity(Intent)
        }
        //creating button for shirts option
        val shirtsButton = findViewById<Button>(R.id.shirtbtn)
        shirtsButton.setOnClickListener{
            val Intent = Intent(this, Shirts::class.java)
            startActivity(Intent)
        }
        //creating button for bottoms option
        val bottomsButton = findViewById<Button>(R.id.bottombtn)
        bottomsButton.setOnClickListener{
            val Intent = Intent(this, Bottoms::class.java)
            startActivity(Intent)
        }
    }


}