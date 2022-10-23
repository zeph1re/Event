package and5.finalproject.event

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Secure.getString
import android.provider.Settings.System.getString
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textFromActivity1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textFromActivity1 = findViewById(R.id.text_activity2)

        val data = intent.getStringExtra("nama orang")

        textFromActivity1.text = data
    }
}