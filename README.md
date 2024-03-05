# Kotlin

When
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
     
