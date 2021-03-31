package com.sandeep.mycurrentage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            Toast.makeText(this,"GetAge is Clicked",Toast.LENGTH_SHORT).show()
            buttonClicked()

        }
    }
    private fun buttonClicked(){
        val userDOB:Int = Integer.parseInt(etDOB.text.toString())
        val currentAge:Int = Calendar.getInstance().get(Calendar.YEAR)
        val userAge:Int = currentAge-userDOB

        tvShowDate.text = "Your age is $userAge years"
    }
}