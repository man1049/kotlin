package com.man1049.Kotlin

import android.util.Log

class Function {
    fun fun_(){
        /*
            함수
            자바의 public 반환자료형 이름(파라미터)의 기능임
        */
        // fun 함수명(변수명: 자료형):return자료형
        fun function(param: String):String{
            var str:String = "$param 을 받아왔습니다"
            return str
        }
        Log.d("fun","${function("김백산")}")

        // 파라미터를 0개 이상 받을 수 있음
        fun params(param1: String, param2: String):String {
            return "$param1 + $param2"
        }

        Log.d("fun(param2)","${params("김백산","태백산")}")

        fun paramsNoReturn(param1: String, param2: String) {
            Log.d("fun(paramsNoReturn)","$param1 + $param2")
        }
        
        // 기본값을 설정 할 수 있음
        fun defaultParam(param1: String = "김백산", param2: Int = 30){
            Log.d("fun(paramsNoReturn)","$param1 + $param2")
        }
        
        // 아래와 같이 인풋을 지정해서 값을 줄 수 있음
        Log.d("fun(default)","${defaultParam(param2 = 31)}")


    }



}