package com.man1049.Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.man1049.Kotlin.Basic.*
import com.man1049.Kotlin.Basic.Function
import com.man1049.Kotlin.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        LogOutput().log() // 로그사용
        Variable().variable() // 변수선언과 상수
        ControlStatement().if_() // if 제어문
        ControlStatement().when_() // when 제어문
        ArrayAndCollection().array() // 배열
        ArrayAndCollection().collection() // 컬렉션
        ForAndWhile().for_() // 반복문 for
        ForAndWhile().while_() // 반복문 while
        Function().fun_() // 함수
        NullSafety() // null을 허용
        LateinitAndLazy().lateinit() // lateinit - 지연초기화
        LateinitAndLazy().lazy() // lazy - 지연초기화
        ScopeFunction().runApplyWith() // this로 사용되는 스코프함수
        ScopeFunction().letAlso() // it으로 사용되는 스코프 함수
        ScopeFunction().applyAlso() // 호출 대상을 반환하는 함수
        ScopeFunction().letRunWith() // 마지막 코드를 반환하는 함수

    }
}