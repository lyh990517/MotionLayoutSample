package yunho.app.motionlayoutsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Fregment()).commit()
        findViewById<Button>(R.id.button).setOnClickListener{
            Toast.makeText(this,"Test",Toast.LENGTH_SHORT).show()
        }
    }
}