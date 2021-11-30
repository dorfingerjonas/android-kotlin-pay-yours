package at.htl.payyours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {
    
    companion object {
        val LOG_TAG = SettingsActivity::class.java.simpleName
        
        val PREFERENCE_FILENAME = "PayYoursReferences"
        val PRICE_PER_UNIT_KEY = "PRICE_PER_UNIT"
        val PLAYER_KEY = "DEFAULT_PLAYERS"
        val COURTS_KEY = "DEFAULTS_COURTS"
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        btn_ok.setOnClickListener { onSave() }
    }

  private fun onSave() {
    finish()
  }

}
