package com.example.myapplication.basicGrammar

import android.os.HandlerThread
import java.util.Scanner
import kotlin.math.max
import kotlin.random.Random


val num = 20

fun main() {
    println("Hello World")
    var i = 10
    var point : Double = 3.3
    //코틀린은 타입을 추정해준다
    //상수와 변수의 차이 변수는 재대입 가능

    i = 20
    val j = 32
    val l = i.toLong()

    var name = "mina"
    name.uppercase()
    println(name.uppercase()[0])
    println("제 이름은 $name 입니다")
    println("제 이름은 ${name}입니다")
    println(max(i,j))

    //0부터 99까지 랜덤 넘버
    val randomNumber = Random.nextInt(0,100)
    println(randomNumber)

    println("<-------------스캐너------------->")
    //Scanner
    val reader = Scanner(System.`in`)
    println("숫자를 입력하시오")
    //reader.next()

    println("<-------------조건문------------->")
    //조건문
    i = reader.nextInt()
    //알트 엔터 누르면 when으로 바꿀수 이뜸
    if (i > 10) {
        println("10 보다 크다")
    } else if (i > 5) {
        println("5 보다 크다")
    } else {
        println("")
    }

    //이런식으로도 사용가능하다
    var result = if (i > 10) {
        ("10 보다 크다")
    } else if (i > 5) {
        ("5 보다 크다")
    } else {
        ("!!!!!")
    }
    println(result)

    println("<-------------반복문------------->")
    //반복문

    val items = listOf(1,2,3,4,5)

    for (item in items){
        println(item)
    }

    //for (int i = 0; i < items.length; i++)
    for (i in 0..(items.size-1)){
        println(items[i])
    }

    println("<-------------while문------------->")
    //while문
    var num1 = 0;

    //num이 5보다 작을 때까지 반복
    while (num1 < 5){
        println(num1)
        num1++
    }

    println("<-------------리스트------------->")
    //변경이 가능한 리스트 만들기
    val items1 = mutableListOf(1,2,3,4,5)

    items1.add(6)
    items1.remove(3)

    println("<-------------배열------------->")
    val items2 = arrayOf(1,2,3)
    items2.set(0,10)
    items2[0] = 22

    for (i in items2){
        println(i)
    }
    //배열은 실질적으로 잘 쓰이지 않아서 웬만하믄 걍 리스트 쓰라고 하심

    println("<-------------예외처리------------->")

    try{
        val item = items2[5]
    } catch (e: Exception){
        println(e.message)
    }

    println("<-------------null safety------------->")
    //코틀린에서는 null은 type 뒤에 물음표를 넣어야 된다.
    var name2 : String? = null
    name2 = "Hanto"
    name2 = null

    //널이 아니면 블럭 실행
    name?.let {
        name2 = name
    }
    println("<-------------함수사용------------->")

    println(sum(10,20))

    println("<-------------클래스------------->")

    val mina = Person("Mina", 25)
    print(mina.name)
    print(mina.age)

    mina.age = 23

    val mina2 = Person("Mina", 25)
    println(mina)
    println(mina2)
    println(mina == mina2)




}
//a와 b를 합치는 함수 만들기 리턴 타입 INt
fun sum(a : Int, b: Int) = a + b
//오버로드 디폴트값을 만들어주면 된다.
fun sum(a : Int, b: Int, c: Int = 0) = a + b + c

//name은 val로 age는 var로 만들어서 나이만 변경 가능
class Person(
    val name: String,
    var age: Int
//이퀄즈 어쩌구 쓰면 값이 같으면 같은사람 취급으로 할 수 있땅
){
    var hobby = "코딩"
        private set // 외부에서 바꾸기 불가

    init {
        print("init")
    }

    fun some() {
        hobby = "컴퓨터 게임"
    }

}

//println("<-------------상속------------->")

abstract class Animal {
    //오버라이드를 위해서는 open이 필요하다
    open fun move() {
        println("이동")
    }
}

class Dog : Animal() {
    override fun move(){
        println("멍멍")
    }
}
class Cat : Animal(){
    override fun move(){
        println("냐옹")
    }
}