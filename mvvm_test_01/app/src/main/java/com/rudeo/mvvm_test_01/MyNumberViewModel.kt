package com.rudeo.mvvm_test_01

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

enum class ActionType {
    PLUS, MINUS
}

// 데이터의 변경
// 뷰모델은 데이터의 변경사항을 알려주는 라이브 데이터를 가지고 있다.
class MyNumberViewModel : ViewModel() {

    companion object{
        private const val TAG : String = "로그"
    }
    // 뮤터블 라이브 데이터 - 수정 가능
    // 라이브 데이터 - 수정 불가능

    // 내부에서 설정하는 자료형은 뮤터블로
    // 변경가능하도록 설정
    private val _currentValue = MutableLiveData<Int>()

    // 초기값 설정
    init {
        Log.d(TAG, "MyNumberViewModel - 생성자 호출 ")
        _currentValue.value = 0
    }


    val currentValue: LiveData<Int>
        get() = _currentValue

    fun updateValue(actionType: ActionType, input: Int)
    {
        when(actionType){
            ActionType.PLUS ->
                _currentValue.value = _currentValue.value?.plus(input)
            ActionType.MINUS ->
                _currentValue.value = _currentValue.value?.minus(input)

        }
    }


}