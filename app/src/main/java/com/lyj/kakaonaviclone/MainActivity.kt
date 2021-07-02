package com.lyj.kakaonaviclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lyj.api.BaseApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var myInt: MyInt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lyjjj","module = ${myInt.myInf()}")
        var api = BaseApi();

        Log.d("lyjjj","module2 = ${api.test()}")
    }
}