package lividan.proyecto.lividan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class HTML : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)
        val matar = findViewById<Switch>(R.id.switch1)
        matar.setOnCheckedChangeListener{
            buttonView, isChecked ->
            finish()
        }
    }
}
