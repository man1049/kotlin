package com.man1049.Kotlin

class LateinitAndLazy {
    /*
    미리 선언만 해놓고 나중에 초기화를 해야 할 상황이 생기는데
    이 경우 lateinit 을 사용 할 수 있음
    ?를 사용하지 않아서 가독성이 좋아짐
    
    var로 선언된 클래스의 프로퍼티에만 사용이 가능
    null은 허용하지 않음
    기본 자료형은 사용이 불가능
    반드시 값을 설정해줘야 함
    */

    lateinit var name: String
    init {
        name = "백산"
    }
    fun lateinit(){
        name = "김$name"
        print(name.length)
        print(name.subSequence(0,1))
    }

    /*
    lazy - 읽기전용인 val을 사용하는 지연초기화
     */
    var iam:String = "김백산"
    val name2: String by lazy { iam }
    // lazy는 선언과 동시에 초기화가 되기때문에 init을 사용하지않음
    fun lazy(){
        // 최초 호출하는 시점에 초기화가 됨
        // 간결한 코드이거나 메모리를 적게 먹는다면 괜찮지만
        // 그 반대되는 경우엔 속도가 느려져 사용하지 않고
        // 미리 초기화하는게 좋을 수도 있음
        print(name2)
    }
    

}