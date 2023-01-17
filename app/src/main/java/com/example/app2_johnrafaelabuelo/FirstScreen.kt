package com.example.app2_johnrafaelabuelo
//importing necessary modules
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first_screen.*

//creating class for the first screen
class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
    }

//function for taking in user input (name)
    fun savebutton(view: View){
        val name = editText.text.toString()

        //transferring user input to another activity
        val intent=Intent(this@FirstScreen, MainActivity::class.java)
        intent.putExtra("Name",name)
        startActivity(intent)


    }
}