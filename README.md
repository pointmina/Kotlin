# Kotlin

1. 변수 : 두 가지 유형으로 구분된다.    
1) val : 변경 불가능한 변수, immutable
 - ex. val message : String = "Hello World!"    
2) var : 변경 가능한 변수, mutable
 - ex. var userName = "ivy"    
      userName = "1234"

- && : And
- || : Or
- ! : Not

- 배열 : arrayOf 사용

2. 함수
- main 함수는 하나만 
- 네임드 알규먼트 : 파라미터가 많을 수록 유용함
- trailing comma : 바뀐 부분만 확인할 수 있움
- 반환하는 타입이 없으면 unit을 없애라
- 함수 분리하기 : 함수로 분리할 영역을 선택하고, 마우스 오른쪽을 클릭한다, refactor > function을 선택


3.when/if
-if 와 when은 서로 대체할 수 있다.
- when은 여러개의 branch로 조건식을 정의
- expression은 뭘깡? : 프로그래밍에서 하나의 값을 반환하는 것을 말한다.
- 블록의 마지막 값을 반환한당?
- 검사할 값을 ()에 넣고 블록 안에서 검사할 수 있다.
- 
  
when (x) {    
  1 -> print("x == 1")    
  2 -> print("x == 2")     
  else -> {    
    print("x is neither 1 nor 2)    
  }     
}    
     
when (x) {     
  0, 1 -> print("x == 0 or x == 1")     
  else -> print("otherwise")     
}
     
when (x) {     
  in 1..10 -> print("x is in the range")     
  in validNumbers -> print("x is valid")     
  ! in 10..20 -> print("x is outside the range")     

  else -> print("none of the above")     
}     
     
when {     
    x.isOdd() -> print("x is odd")     
    y.isEven() -> print("y is even")     
    else -> print("x+y is even.")     
}     

4. for / while

1) for
- 반복문(iteration) : 특정 부분의 코드가 반복적으로 수행될 수 있도록 하는 구문
- index활용, range 지정, 진행방향 번경(downTo), 간격 변경(step)

2) while
- 조건이 만족할때까지 돈당
- do while은 조건여부와 상관없이 do가 먼저 실행된다

5. class
- class 여러 정보를 묶어서 표현할 수 있다.
- 인스턴스 : 클래스로 만드는 객체 , 여러 정보를 전달하고, 변수에 할당할 수 있다.
- 하위클래스는 상위 클래스의 기능을 사용할 수 있다.
- open 키워드를 사용하면 하위 클래스에서 변수의 선언을 재정의 할 수 있다. open + override
- 클래스 이름은 대문자로 하고 단어를 연결할 때는 띄어쓰지 않고 대문자로 바꾼다. 


















