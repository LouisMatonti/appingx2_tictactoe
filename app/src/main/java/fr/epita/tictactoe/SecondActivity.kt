package fr.epita.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        /*val Intent = intent
        val PlaName = Intent.getStringExtra("Name")
        val PlayerName = this.findViewById<TextView>(R.id.textname)
        PlayerName.text = "O (Louis Matonti)"
        val Guest = findViewById<TextView>(R.id.Guest)
        Guest.text = "X (GUEST)"*/
    }

}