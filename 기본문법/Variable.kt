package com.man1049.Kotlin

import android.util.Log

/*
const는 자바의 static final임
const val 변수명 = 값
*/
const val MYNAME = 55

class Variable {

    fun variable() {
        /*
        변수 선언
        var 변수명 = 값
        아래와 같이 자료형을 지정하지 않는다면
        값에 맞는 자료형으로 추론함
         */
        var name = "김백산"

        /*
        var 변수명:자료형 = 값
         */
        var name2: String = "태백산"


        /*
        var 변수명:자료형
        변수명 = 값
        으로 초기화하지않고 선언만하고 사용가능
        */
        var age: Int
        age = 30

        // 문자열 "" 내에 $변수명을 입력하면 +변수+를 하지않고 값을 불러 올 수 있음
        Log.d("variable", "이름 : $name  나이 : $age")
        
        /*
        val은 한번 입력된 값은 변경을 할 수 없음 - 읽기전용
        val 변수명 = 값
        */
        val 이름 = "백산"
        var 성이름 = "김"+이름
        var 성이름2 = "태"+이름

        Log.d("variable","const = $MYNAME")
        
        /*
        문자열 내에서도 연산이 가능함
        "${변수+4}"
        
        가독성을 위해 ${변수}로 사용하기도 함
         */
        var num: Int = 1
        Log.d("variable", "${num+555}")



    }
}