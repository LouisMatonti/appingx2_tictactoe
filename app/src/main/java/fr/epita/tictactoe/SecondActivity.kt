package fr.epita.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.game.*


class SecondActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        /*val Intent = intent
        val PlaName = Intent.getStringExtra("Name")
        val PlayerName = this.findViewById<TextView>(R.id.textname)
        PlayerName.text = "O ($PlaName)"*/

        button1.setOnClickListener(this@SecondActivity)
        button2.setOnClickListener(this@SecondActivity)
        button3.setOnClickListener(this@SecondActivity)
        button4.setOnClickListener(this@SecondActivity)
        button5.setOnClickListener(this@SecondActivity)
        button6.setOnClickListener(this@SecondActivity)
        button7.setOnClickListener(this@SecondActivity)
        button8.setOnClickListener(this@SecondActivity)
        button9.setOnClickListener(this@SecondActivity)

        var tour = 0
        var text = "0"
        if(tour % 2 == 0)
            text = "O"
        else
            text = "X"
        while (tour < 9)
        {
            tour = tour + 1
        }

    }

}