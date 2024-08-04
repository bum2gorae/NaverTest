package com.example.navertest

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.FragmentActivity
import com.example.navertest.ui.theme.NaverTestTheme
import com.naver.maps.map.NaverMapSdk

class MapFragActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformClient("xywzbw98gd")
        enableEdgeToEdge()
        setContent {
            NaverTestTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    AndroidView(
                        modifier = Modifier.fillMaxSize(),
                        factory = { context ->
                            // Inflate the layout containing FragmentContainerView
                            val view = this@MapFragActivity.layoutInflater.inflate(R.layout.mapfragment, null, false)

                            // Return the inflated view
                            view
                        }
                    )
                }
            }
        }
    }
}