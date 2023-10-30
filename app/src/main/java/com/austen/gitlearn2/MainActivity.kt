package com.austen.gitlearn2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.auste.share.Util

/**
 * Company: TAO_LE
 * ================================================
 * Description:
 * <p>
 * <p>
 * Created by austenYang on 2023/10/31
 * ================================================
 */
class MainActivity : AppCompatActivity() {
    private lateinit var tvOne: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        tvOne = findViewById(R.id.tvOne)

        val add = Util.add(1, 2)

        tvOne.text = "$add"
    }
}