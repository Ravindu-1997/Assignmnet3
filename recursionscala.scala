package FP

import scala.io.StdIn

object Recursion {
  
  def main(args:Array[String])
  {
    
    //Q1 PRIME NUMBER OR NOT
    println("enter your number(to check PRIME NUMBER OR NOT ): ")
    var number = scala.io.StdIn.readInt()
    prime(number:Int,number/2:Int)
    
    
    //Q2 PRINT ALL PRIME NUMBERS LESS THAN N
    println("enter your number(FOR PRINT ALL PRIME NUMBERS LESS THAN N) : ")
    var number1 = scala.io.StdIn.readInt()
    var i = 2
    var a = printprime(number1:Int,i:Int)
    for(v<-0 to number1)
    
    //Q3 ADDITION OF NUMBERS
    println("enter your number(FOR ADDITION OF NUMBERS) : ")
    var number3 = scala.io.StdIn.readInt()
    var tot=0
    var res = sum(number3:Int,tot:Int)
    println("Sum - "+res)
    
    
    //Q4 EVEN AND ODD NUMBERS
    println("enter your destonantion number(CHECK EVEN AND ODD NUMBERS ) : ")
    var number4 = scala.io.StdIn.readInt()
    evenodd(number4:Int)
    
    //Q5 ADDITION OF ALL EVEN NUMBER LESSTHAN N
    println("enter your destonantion number(FOR ADDITION OF ALL EVEN NUMBER LESSTHAN N ) : ")
    var number5 = scala.io.StdIn.readInt()
    evenadd(number5:Int,tot:Int)
    
    //Q6 Fibonacci Sequence
    println("enter your number for fibonacci : ")
    var number6 = scala.io.StdIn.readInt()
    for(c <- 0 to number6)
    {
      var x =fibonacci(c)
      print(x+" , "  )
    }
    
    
  }
  
  def prime(n:Int, i:Int)
  {
    if(n<=1)
    {
      println("False")
    }
    else
    {
      if(n==2)
      {
        println("True")
      }
      else if(n%i==0)
      {
        println("False")
      }
      else
      {
        return prime(n-1,n)
      }
    }
  }
  
  
  def printprime(n:Int,i:Int)
  {
   
    if((n==1)||(n==2))
    {
      println("there is no prime numbers .")
    }
    else if(n%(n/2)==0)
    {
      
    }
    
  }
  
  
  def sum(n:Int,tot:Int):Int=
  {
    if(n<1)
    {
      return tot
    }
    else
    {
      return sum(n-1,tot+n)
    }
  }
  
  
  def evenodd(n:Int)
  {
    if(n>0)
    {
      if(n%2==0)
      {
        println("even - "+evenodd(n-1)+""+n)
      }
      else
      {
        println("odd - "+evenodd(n-1)+""+n)
      }
    }
  }
  
  
  def evenadd(n:Int,tot:Int)
  {
    if(n>0)
    {
      if(n%2==0)
      {
        return evenadd(n-1,tot+n)
      }
      else
      {
        return evenadd(n-1,tot)
      }
    }
    else
    {
      println("Sum - "+tot)
    }
  }
  
  def fibonacci(n:Int):Int=
  {
    if(n<=1)
    {
      return n
    }
    else
    {
      return (fibonacci(n-1)+fibonacci(n-2))
    }
  }
}