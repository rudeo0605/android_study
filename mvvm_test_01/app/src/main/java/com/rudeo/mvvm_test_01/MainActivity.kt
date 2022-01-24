package com.rudeo.mvvm_test_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rudeo.mvvm_test_01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val TAG: String = "로그"
    }

    // 나중에 값이 설정될거라고 lateinit 으로 설
    lateinit var myNumberViewModel: MyNumberViewModel
    lateinit var activityMainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 메인 액티비티 -> 액티비티 메인 바인딩
        // 자동으로 완성된 액티비티 메인 바인딩 클래스 인스턴스를 가져왔다.
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(activityMainBinding.root)

        // 레이아웃과 연결
        //setContentView(R.layout.activity_main)

        myNumberViewModel = ViewModelProvider(this)[MyNumberViewModel::class.java]

        myNumberViewModel.currentValue.observe(this, Observer {
            Log.d(TAG, "MainActivity - myNumberViewModel - currentValue 라이브 데이터 값 변경 : $it")
            activityMainBinding.numberTextview.text = it.toString()

        })

        // 리스너 연결
        activityMainBinding.plusButton.setOnClickListener(this)
        activityMainBinding.minusButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val userInput = activityMainBinding.userinputEdittext.text.toString().toInt()

        when(view){
            activityMainBinding.plusButton ->
                myNumberViewModel.updateValue(actionType = ActionType.PLUS, userInput)
            activityMainBinding.minusButton ->
                myNumberViewModel.updateValue(actionType = ActionType.MINUS, userInput)
        }
    }
}