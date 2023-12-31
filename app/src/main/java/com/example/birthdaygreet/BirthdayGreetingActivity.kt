package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name =intent.getStringExtra(Name_Extra)
        birthdayGreeting.text = "Happy Birthday\n $name!"
    }
}