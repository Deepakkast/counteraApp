package app.ind.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var countText :TextView
    lateinit var button: Button
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countText = findViewById(R.id.textView)
        button = findViewById(R.id.countButton)


        button.setOnClickListener {
            count++
            countText.text = "Count is :$count"
        }
    }
}