package and5.finalproject.event

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout

class MainActivity : AppCompatActivity() {

    private lateinit var buttonToast: Button
    private lateinit var buttonSnackbar: Button
    private lateinit var buttonPindah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast = findViewById(R.id.button_toast)
        buttonSnackbar = findViewById(R.id.button_snackbar)
        buttonPindah = findViewById(R.id.button_pindah)

        buttonToast.setOnClickListener{
            Toast.makeText(this, "Button di klik", Toast.LENGTH_SHORT).show()
        }

        buttonSnackbar.setOnClickListener {
            Snackbar.make(it, "Button di klik", Snackbar.LENGTH_SHORT).show()
        }

        buttonPindah.setOnClickListener {
            //Untuk berpindah antar activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("nama orang", "Pakde Joko")
            startActivity(intent)
        }





    }
}