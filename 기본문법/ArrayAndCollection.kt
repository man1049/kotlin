package com.man1049.Kotlin

import android.util.Log

class ArrayAndCollection {
    fun array(){
        /*
        배열 선언
        var 변수명 = Array(개수)
         */
        var numArray1 = IntArray(5) // 5개의 index로 선언
        var numArray2 = intArrayOf(1,2,3,4,5) // 선언과 동시에 값을 넣어줌
        var stringArray = arrayOf("1","2","3","4","5") // 문자배열은 arrayOf를 사용
        var doubleArray = doubleArrayOf(3.14,5.14,3.33,1.25,1.27) // double형 배열

    }

    fun collection(){
        // list는 val의 기능과 같음
        var list = listOf<Int>(1,2,3,4,5)

        // 코틀린의 mutableList는 자바와 같거나 비슷함
        var mutableList = mutableListOf<Int>(1,2,3)
        // add를 이용해서 값을 넣을 수 있음
        mutableList.add(4)
        // get을 이용해서 불러 올 수 있음
        mutableList.get(3)
        // set을 이용해서 해당 index의 값을 수정 할 수 있음
        // 배열명[index] = 값 으로도 가능함
        mutableList.set(3,5)
        mutableList[3] = 4
        // removeAt을 이용해서 삭제 할 수 있음 이 때는 index값을 이용함
        mutableList.removeAt(3)
        // 해당하는 값을 삭제함
        mutableList.remove(3)

        // 개수를 가져옴
        mutableList.size
        
        // 자바의 set과 같음 - 중복된 값을 저장 할 수 없음
        var setList = mutableSetOf<Int>(1,1,2,2,3,3,4,4)
        Log.d("setList","setList : ${setList.toString()}")
        
        /*
        자바의 map과 부분적으로 같음 - <String,Object> 로 했을 때
        자바의 경우엔 Object에 String을 넣어도 대입이 가능했지만
        코틀린의 경우엔 에러가 발생함
        하지만 Object 대신 * 를 이용해 읽기는 가능 - *는 읽기전용 쓰기불가
         */
        fun maps(maps: Map<String, *>) {
            var map = maps
            Log.d("maps","${map.toString()}")
        }

        var map = mutableMapOf<String,String>()
        map.put("선수1","김백산")
        map.put("선수2","태백산")
        map.put("선수3","소백산")
        Log.d("Map","선수 1 : ${map.get("선수1")} , 선수 2 : ${map["선수2"]}")
        maps(map)


        // 데이터의 삭제는 remove(key)임
        map.remove("선수1")
        Log.d("mapRemove","${map.toString()}")


        


    }
}