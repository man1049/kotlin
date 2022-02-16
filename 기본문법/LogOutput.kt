package com.man1049.Kotlin

import android.util.Log

class LogOutput {
    fun log() {
        /*
        로그를 출력 할 때 사용
        Log.v - 상세한 로그
        Log.d - 디버그 로그
        Log.i - 정보성 로그
        Log.w - 경고메세지
        Log.e - 에러 메세지
        */
        Log.d("logTest","로그출력 method = Log.d")
    }
}