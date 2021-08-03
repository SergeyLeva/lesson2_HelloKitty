


package ua.sergeylevchenko.hellokitty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

private lateinit var mHelloTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cat)
        mHelloTextView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.Kat)
        imageButton.setOnClickListener {
        mHelloTextView.setText("Рижик)")


        }
    }
}