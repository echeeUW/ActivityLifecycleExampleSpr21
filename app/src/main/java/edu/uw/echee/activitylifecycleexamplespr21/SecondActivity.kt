package edu.uw.echee.activitylifecycleexamplespr21

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.uw.echee.activitylifecycleexamplespr21.databinding.ActivitySecondBinding

fun startSecondActivity(context: Context) {
    with(context) {
        val intent = Intent(context, SecondActivity::class.java)
        startActivity(intent)
    }
}

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).apply { setContentView(root) }

        title = "Second Activity"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        with(binding) {

            btnFinish.setOnClickListener {
                // Programmatically destroy the activity
                finish()
                Log.i(TAG, "I am still alive, mwhuahahaha")
            }

        }
        Log.i(TAG, "onCreate() - B")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() - B")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() - B")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() - B")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() - B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() - B")
    }

    override fun onSupportNavigateUp(): Boolean {
        // Handle when the Up button is clicked (top left arrow button)
        finish()
        return super.onSupportNavigateUp()
    }

}
