package com.man1049.Kotlin

import android.util.Log

class ForAndWhile {
    fun for_(){
        // for는 자바와 기능은 동일하지만 사용법이 다름
        var i: Int
        // 1~10까지 진행 할 때 마다 반복하는 숫자를 i에 대입함
        for (i in 1..5){
            Log.d("for(in)", "in : $i")
        }
        
        /* 
        1부터 3까지 진행하면서 i에 대입
        until은 해당 숫자의 이전까지만 반복함
        4 면 -1 인 3까지
         */

        for(i in 1 until 4){
            Log.d("for(in)", "in : $i")
        }
        /*
        step은 건너뛰면서 진행함
        3이면 3씩 증가시킴
        자바의 for(int i = 0; i <= 100; i+3) 과 같은 개념임
         */
        for(i in 0..100 step 3){
            // 반복을 시작 할 때 0을 출력하고 +3 해서 출력함
            Log.d("for(step)","in : $i")
        }

        /*
        downTo는 -1과 같음
        step -1을 사용해도 같은 기능임
         */
        for(i in 100 downTo 0){
            Log.d("for(step)","in : $i")
        }

        /*
        배열,컬렉션 반복문
        자바에선 (자료형 변수명 : 배열또는 컬렉션명) 을 사용해서 구분했지만
        코틀린에서는 in을 사용하여 구분함
        자료형을 따로 지정하여 변수로 만들 필요가 없음
         */

        var ar = arrayOf<String>("김백산","태백산","소백산")
        for (i in ar){
            Log.d("for(array,collection)","in : $i")
        }
    }

    fun while_(){
        // while은 자바와 가능이 동일함
        var a: Int = 1
        var b: Int = 5
        while (a<b){
            Log.d("while","a = ${a++}")
        }
        /*
        do~while의 기능도 같음
        do를 먼저 실행하고 while로 제어하고 반복함
        조건에 맞지 않더라도 do를 먼저 실행함
         */
        a = 1
        do {
            Log.d("do~while","a = ${a++}")
        } while (a<b)

        /*
        break와 continue
        자바와 동일함
         */

         a = 1
        while (true){
            if (a < b){
                Log.d("while(continue,break)","a = ${a++}")
                continue
            }else{
                Log.d("while(continue,break)","break")
                break
            }
        }

    }
}