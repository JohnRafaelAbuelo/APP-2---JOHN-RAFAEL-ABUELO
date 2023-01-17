package com.example.app2_johnrafaelabuelo
//importing necessary modules
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_final_screen.*
import kotlinx.android.synthetic.main.activity_first_screen.*
import kotlinx.android.synthetic.main.activity_size_and_pay.*

//creating class
class SizeAndPay : AppCompatActivity() {

    //creating arrays for the spinners options
    val dropdownlist1= arrayOf("XS", "S", "M", "L", "XL")
    val dropdownlist2= arrayOf("PayPal", "Card", "Cash")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_size_and_pay)

        //creating adapters value for the view purposes
        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        //creating a variable name b1 for button

        var b1=findViewById(R.id.button) as Button


        //setting the adapters for the view purpose
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)


//setting the 1st spinner
        elements1.adapter=adapter
        elements1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements1.selectedItemPosition==0)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==1)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==2)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==3)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==4)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
            }
        }

        //setting the 2nd spinner
        elements2.adapter=adapter2
        elements2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements2.selectedItemPosition==0)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==1)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==2)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
            }
        }

        //Once the user clicks the button, they will be directed to a different screen which summarizes their purchase
        b1.setOnClickListener{
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==0)
            {

                val size = sizexs.text.toString()
                val pay = paypal.text.toString()
                val Intent = Intent(this@SizeAndPay, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==1)
            {
                val size = sizexs.text.toString()
                val pay = card.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==2)
            {
                val size = sizexs.text.toString()
                val pay = cash.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==0)
            {
                val size = sizes.text.toString()
                val pay = paypal.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==1)
            {
                val size = sizes.text.toString()
                val pay = card.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==2)
            {
                val size = sizes.text.toString()
                val pay = cash.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==0)
            {
                val size = sizem.text.toString()
                val pay = paypal.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==1)
            {
                val size = sizem.text.toString()
                val pay = card.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==2)
            {
                val size = sizem.text.toString()
                val pay = cash.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==0)
            {
                val size = sizel.text.toString()
                val pay = paypal.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }
            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==1)
            {
                val size = sizel.text.toString()
                val pay = card.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==2)
            {
                val size = sizel.text.toString()
                val pay = cash.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==4 && elements2.selectedItemPosition==0)
            {
                val size = sizexl.text.toString()
                val pay = paypal.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }
            if(elements1.selectedItemPosition==4 && elements2.selectedItemPosition==1)
            {
                val size = sizexl.text.toString()
                val pay = card.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

            if(elements1.selectedItemPosition==4 && elements2.selectedItemPosition==2)
            {
                val size = sizexl.text.toString()
                val pay = cash.text.toString()
                val Intent = Intent(this, FinalScreen::class.java)
                Intent.putExtra("Size",size)
                Intent.putExtra("Pay",pay)
                startActivity(Intent)
            }

        }
    }
}