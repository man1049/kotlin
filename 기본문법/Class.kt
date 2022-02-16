package com.man1049.Kotlin


/*
    constructor - 프라이머리 생성자
    특별한 조건이 없다면 생략이 가능
    -> class Class(param: String)
 */
class Class /*constructor(val param: String)*/ {
    // 클래스가 호출되면 실행되는 init
    // 클래스에 들어온 파라미터에 접근 할 수 있음
    // 생성자를 작성하지 않고 사용하면
    // default 생성자가 됨
    /*
    init {
        Log.d("class(init)","$param")
    }
    */

    // init 초기화 작업이 필요하지 않다면 작성하지 않고
    // class 파라미터에 val을 붙여서 변수로 만들고
    // 함수를 작성
    /*
    fun func(){
        print(param)
    }
    */
    
    // 세컨더리 생성자
    // constructor를 함수처럼 사용 할 수 있음
    // 파라미터 개수또는 파라미터타입이 다르다면 중복해서 만들 수 있음

    constructor(param: String){
        print(param)
    }
    constructor(param: Int){
        print(param)
    }
    constructor(param: Char){
        print(param)
    }
    
    // object 이름 {}
    // 자바의 static {} 과 같은 역할을 함
    object man{
        var name = "김백산"
        fun printName(){
            print(name)
        }
    }
}

// data class
// 간단한 데이터를 저장하는 용도로 사용
// val로 하면 수정이 불가능하고 var로 선언하면 수정이 가능함
data class People1 (val name: String, val age: Int)

// open class
// 상속하기 위해선 open class로 작성해야함
open class People{
    // open 을 붙이면 오버라이드가 가능함
    open var kim:String = "김백산"
    open fun man(man:String){
        print(man)
    }
    fun woman(woman:String){
        print(woman)
    }
}

// 상속받고 사용하기
class People2 : People() {
    // override로 부모의 kim을 수정

    fun whoAreYou(){
        man("김백산")
    }

    fun whoAreYou2(){
        woman("김백순")
    }

    override var kim: String = "태백산"

    override fun man(man: String) {
        print(kim)
    }
    // 코틀린은 클래스,메서드,프로퍼디에 대해 익스텐션을 지원함 - 추가
    fun People.clean(){
        print("매우 clean")
    }
    fun cl(){
        // 추가되어 사용이 가능함
        clean()
    }

}

// abstract - 추상화 후 사용하기
abstract class Abs{
    abstract fun name()
    abstract fun age()
    fun whoAmI(){
        print("나는 누구인가요?")
    }
}

class Impl: Abs(){
    override fun name() {
        print("김백산")
    }

    override fun age() {
        print("30")
    }
}

// 인터페이스 - 이름만 작성하는 메뉴판형식
interface Inter{
    fun name()
    fun age()
}

class InterImpl: Inter {
    override fun name() {
        // 구현 할 내용
    }

    override fun age() {
        // 구현 할 내용
    }
}

// 접근 제한자
open class Visibility{
    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaultVal = 4
}

class GetVisibility: Visibility(){
    fun call(){
        // privateVal은 호출이 되지않음 - 다른 클레스에서 접근 불가
        var num2 = protectedVal // 상속관계에서만 접근 가능
        var num3 = internalVal // 같은 모듈에서만 접근 가능
        var num4 = defaultVal // 접근가능
    }
}