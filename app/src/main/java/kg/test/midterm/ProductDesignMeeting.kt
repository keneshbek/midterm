package kg.test.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_design_meeting)
        val TextView = findViewById<TextView>(R.id.button)

        TextView.setOnClickListener {


                startActivity(Intent(this, ProductDesignMeeting2::class.java))
        }
    }
}