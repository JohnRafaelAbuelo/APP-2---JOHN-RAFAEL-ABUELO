package com.example.app2_johnrafaelabuelo
//importing necessary modules
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

//creating class for splash screen
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


//making splash screen full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
//setting time delay for the splash screen before moving on to next screen
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, FirstScreen::class.java)
            startActivity(intent)
            finish()
        }, 6000)
    }
}