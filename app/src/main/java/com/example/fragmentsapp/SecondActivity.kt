import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var displayNumberText: TextView
    private lateinit var clickButton: Button
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        displayNumberText = findViewById(R.id.displayNumberText)
        clickButton = findViewById(R.id.clickButton)

        number = intent.getStringExtra("number")?.toInt() ?: 0

        displayNumberText.text = "Your number is: $number"

        clickButton.setOnClickListener {
            number -= 1
            displayNumberText.text = "Your number is: $number"
        }
    }
}
