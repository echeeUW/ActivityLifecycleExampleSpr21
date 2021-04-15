package edu.uw.echee.activitylifecycleexamplespr21

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import edu.uw.echee.activitylifecycleexamplespr21.databinding.ActivityMainBinding

private const val TAG = "LifecycleExample"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

        }

    }
}
