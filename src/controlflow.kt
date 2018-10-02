fun main(args:Array<String>) {

   val a = 1
   val b = 2

    // if expression
    if (a < b) {
       println(b)
   }
    else{
       print(a)
   }
    // As expression
    val biggest=if (a<b) b else a
    println(biggest)


    // when with params
    when(a){
        1-> println("1")
        2-> println("2")
        else->{
            println("other")
        }

    }

    when(a){
        Math.abs(a)-> println("1")
        else->{
            println("other")
        }
    }
    val ordered=2

    when(ordered){ 0-> println("0");
       in 1..4 -> println("in range 1 to4 ")

        in 5..9 -> println("in range 5 to 9 ")
    }


    // when with without params

    when{
        ordered>0-> {
            print("sadasd")
            print("sadasd")

        }
        ordered===2-> print("two ordered")
    }


    // while loop
    var x=0
    while(x<10){
        println("while loop"+x)
        x+=3
    }



}