fun main() {
    val stringNames = listOf("Mwiyeria","Anne","Del","Maggie")
    println(stringNames)

    nums()
    var human1 = Person("Ess",23,5.2,50)
    var human2 = Person("Jem",25,5.9,60)
    var human3 = Person("Esther",23,5.5,50)
    var human4 = Person("Drake",20,5.2,50)
    var human = listOf<Person>(human1,human2,human3,human4)

    var man = human.sortedByDescending { human->human.age }
    println(man)

    var car1 = Car("kcz 468w",20)
    var car2 = Car("kcz 468w",20)
    var car3 = Car("kcz 468w",20)
    var car4 = Car("kcz 468w",20)

    var carList = listOf(car1,car2,car3,car4)
    println(carlists(carList))



}
//Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices i.e index 2,4,6 etc

fun stringNames(name: List<String>):List<String> {
    name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)

        }
    }
    return name
}
//Given a list of people’s heights in metres. Write a function that returns
//    the average height and the total height (2 points)
fun nums(){
    var numberz = mutableListOf(4,5,6,7,9,2,8)
    println(numberz.average())
    println(numberz.sum())
}
//    3. Given a list of Person objects, each with the attributes, name, age,
//    height and weight. Sort the list in order of descending age (2 points)

class Person(var name: String,var age: Int,var height: Double,var weight: Int)

//    4. Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
fun peoples(topple: List<Person>): List<Any>{
    return listOf()

}


//    5. Write a function that takes in a list of Car objects each with a
//            registration and mileage attribute and returns the average mileage of
//            all the vehicles in the list.

data class Car(var registration: String,var mileage: Int)
fun carlists(vehicle:List<Car>): Int{
    var average = 0
    vehicle.forEach { new -> new.mileage
    average+=new.mileage}

    var sumaverage = vehicle.count()
    return sumaverage
}




