package edu.uw.echee.activitylifecycleexamplespr21

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import edu.uw.echee.activitylifecycleexamplespr21.databinding.ActivityMainBinding

const val TAG = "LifecycleExample"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            title = "Yoooooo mammaaa"

            btnToB.setOnClickListener {
                startSecondActivity(this@MainActivity)
            }

        }
        Log.i(TAG, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }
}
