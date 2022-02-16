package com.man1049.Kotlin

class NullSafety {
    // 코틀린은 기본적으로 null을 허용하지 않음
    // 자료형 뒤에 ?를 붙이면 null값을 허용 할 수 있음
    var variable: String? = null
    
    // 함수의 파라미터값에 null을 허용 할 수 있음
    fun canNull(str: String?){}
    // 아래와같이 리턴에도 null을 허용 할 수 있음
    fun canNullReturn(str: String?): String?{return null}

    // 안전한 호출
    fun testSafe(str:String?):Int?{
        // str이 null이면 length를 반환하지 않음
        var res: Int? = str?.length
        return res
    }

    // null값 대체하기
    fun testElvis(str:String?): Int{
        //str이 null 이고 length가 null이라면 0을 반환
        var length:Int = str?.length?:0
        return length
    }
}