package rsk

fun iter (seq: Sequence<String>){
    for (t in seq) println(t)
}

fun main(args: Array<String>) {

    val meetings = listOf<Meeting>(Meeting(1, "Ruracio Meeting"), Meeting(2, "Wedding Meeting"))

//    sequences allows us to work with large lists
    val title = meetings
        .asSequence()
        .filter { it -> it.title.endsWith("g") }
        .map { println("map($it)"); it.title }

//    sequences are lazing evaluated -> so can capture the iteration and pass it other function
    iter(title)

//    for (t in title) println(t)
//
////    here we see that in asSequence once it maps the 1st one and find it, no need to map the 2nd one, better than list
//    val title1 = meetings
//        .asSequence()
//        .map { println("map($it)"); it.title.toUpperCase() }
//        .find { it.startsWith("RURACIO") }
//
//    println(title1)
}

class Meeting (val id: Int, val title: String){
    val people = listOf<Person>(Person("Sam"), Person("Annie"))
}

data class Person(val name: String){

}