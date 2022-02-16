package com.man1049.Kotlin

import android.util.Log

class ScopeFunction {
    /*
     lateinit과 함께 SafeCall 남용을 막아주는 열할을 하기때문에
     많이 사용함
     스코프함수에는 run, let, apply, also, with가 있음
     또, this와 it으로 사용되는 스코프함수가 나뉘어져 있음
     this -> run, apply, with
     it -> let, also
    */
    
    // this로 사용되는 스코프함수
    fun runApplyWith(){
        // run
        var list = mutableListOf("김백산","태백산")

        list.run {
            // list를 사용하기 위해 this를 사용하지 않아도 됨
            // list를 지정해놓고 스코프내에서 코드를 사용하기 떄문에
            // .뒤에 나올 함수들을 바로 사용하면 됨
            Log.d("runApplyWith(run)","$size")
            add("소백산")
            Log.d("runApplyWith(run)",toString())
        }

        list.apply {
            Log.d("runApplyWith(apply)",toString())
        }

        with(list) {
            Log.d("runApplyWith(with)",toString())
        }
    }

    // it으로 사용되는 스코프함수
    fun letAlso(){
        var ageList = mutableListOf(1,2,3,4,5)

        ageList.let {
            // 기본적으로 it으로 되어있지만
            // 원하는 이름 ->
            // 을 작성하면 원하는 이름으로 사용이 가능함
            list ->
            print("ageList -> ${list.toString()}")
        }

        ageList.also {
            list ->
            print("ageList -> ${list.toString()}")
        }
    }

    /*
    호출 대상인 this 자체를 반환하는 함수 : apply, also
    this로 호출한 대상을 반환하기때문에
    다른 코드와 상관없이 this에 관여된 값을 반환함
     */

    fun applyAlso(){
        var list = mutableListOf("김백산","태백산")
        val listSize = list.apply {
            // add는 list에 직접 관여하기떄문에 반환 됨
            add("소백산")
            // 아래 코드들은 반환이 되지 않음
            count()
            size
        }
        
        // it으로 사용되지만 apply와 같음
        val listSize2 = list.also {
            l ->
            l.add("장백산")
            l.count()
            l.size
        }
    }

    /*
    let, run, with
    위 3개는 마지막의 코드를 반환함
    */

    fun letRunWith(){
        var list = mutableListOf("김백산","태백산")
        val listCount = list.let {
            l ->
            l.add("소백산")
            l.size
            // 마지막 코드를 반환하기 때문에 listCount는 l.count()의 값을 가지게 됨
            l.count()
        }

        val listCount2 = list.run {
            add("장백산")
            size
            count()
        }

        val listSize = with(list){
            add("도지")
            count()
            size
        }
    }

}