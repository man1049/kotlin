package com.man1049.Kotlin

import android.util.Log

class ControlStatement {
    fun if_(){

        var num = 1
        var num2 = 2

        // if문은 java와 같음
        if (num == num2){
            Log.d("LogControl","$num 과 $num2 는 같습니다.")
        }else{
            Log.d("LogControl","$num 과 $num2 는 다릅니다.")
        }

        //변수에도 if문을 사용 할 수 있음
        var bigger = if (num<num2) num2 else num

        Log.d("LogControl","num(1)이 num2(2)중 더 큰 숫자는? $bigger")

        /*
        java와 같이 따로 if문을 사용해서 변수에 넣어주지 않아도 됨
        결과값의 마지막 줄을 변수에 대입함
        */
        var bigger2 = if(num>num2){
            var num3 = 30
            num
        }else{
            num2
        }

        /*
        if문의 수식이 false일 때 특정한 코드를 처리하기 위해서는 어떤 문법을 사용 할 수 있는가
         */
        var a: Int = 1
        if(a == 2){
            Log.d("answer","true")
        }else{
            Log.d("answer", "false이므로 else를 출력")
        }
    }

    fun when_(){

        //when은 자바의 switch와 비슷함
        when (17){
            // in을 사용하면 10~15를 표현 할 때 ..로 표현이 가능
            in 10..15 -> {
                Log.d("when","10~15사이입니다.")
            }
            16 -> {
                Log.d("when", "16입니다.")
            }
            else -> {
                Log.d("when", "잘 모르겠습니다.")
            }
        }

        // 파라미터 없이 사용이 가능함
        var whenNum = 17
        when {
            whenNum > 10 -> {
                Log.d("when", "whenNum이 큽니다.")
            }
            whenNum < 18 -> {
                Log.d("when", "whenNum이 작습니다.")
            }
        }

        //when문에서 범위값을 비교하기위해 무엇을 사용하는가
        var b: Int = 5
        when(b) {
            in 1..4 -> Log.d("answer","$b 는 1~4에 포함됩니다.")
            in 5..9 -> Log.d("answer","$b 는 5~9에 포함됩니다.")
        }
    }
}