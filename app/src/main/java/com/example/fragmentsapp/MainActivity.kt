import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numberEditText: EditText
    private lateinit var numberTextView: TextView
    private lateinit var okButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        numberEditText = findViewById(R.id.numberEditText)
        numberTextView = findViewById(R.id.numberTextView)
        okButton = findViewById(R.id.okButton)
        nextButton = findViewById(R.id.nextButton)

        // When OK button is clicked, update the TextView with the number from EditText
        okButton.setOnClickListener {
            val enteredNumber = numberEditText.text.toString()
            numberTextView.text = "Your number is: $enteredNumber"
        }

        // When Next button is clicked, go to the second activity
        nextButton.setOnClickListener {
            val enteredNumber = numberEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("number", enteredNumber) // Pass the number to the second activity
            startActivity(intent)
        }
    }
}
