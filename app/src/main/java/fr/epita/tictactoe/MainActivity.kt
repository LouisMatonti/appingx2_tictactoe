package fr.epita.tictactoe
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import android.widget.TextView
import fr.epita.tictactoe.R.id.start
import fr.epita.tictactoe.R.id.textname
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.start -> {
                    goToSecondActivity()
                    Log.d("MainActivity/Intent", "Go to SecondActivity")
                }
            }
        }
    }

    private fun goToSecondActivity() {
        val explicitIntent = Intent(this, SecondActivity::class.java)
        val message = findViewById<TextView>(R.id.textname).text.toString()
        explicitIntent.putExtra("MESSAGE", message)
        startActivity(explicitIntent)
    }

}

