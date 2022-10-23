package and5.finalproject.event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textView : TextView = findViewById(R.id.textView) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setOnClickListener{
            Toast.makeText(this, "Button di klik", Toast.LENGTH_SHORT).show()
        }





    }
}