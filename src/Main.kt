//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
  printNationality("Egypt")
 val fruits = arrayOf("banana","Lemon")
   for(fruit in fruits)
  {
      println(fruit.reverse())
}
 }

fun printNationality(country:String) {
    if(country == "Eritrea"){
        println("Eritrea")
    }
    else if(country=="Djibouti") {
        println("Djiboutian")
    }
    else if(country=="Egypt") {
        println("Egypian")
    }
    else {
        println("Foreigner")
    }
}//no limit else if and else is a catch all
*/
//A better way
/*fun main() {
    printNationality("Egypt")
    printNationalitywhen("Djibouti")
    calculate(7, 9, "/")
    assignSchool(365)
    printSquare()
    //num()
    printSquare2()
    num()
    check()
    serve(14)
    println(long(arrayOf("seen", "been", "learn", "ask")))
}

fun printNationality(country: String) {
    if (country == "Eritrea") {
        println("Eritrea")
    } else if (country == "Djibouti") {
        println("Djiboutian")
    } else if (country == "Egypt") {
        println("Egypian")
    } else {
        println("Foreigner")
    }
}//no limit else if and else is a catch all

fun printNationalitywhen(country: String) {
    when (country) {
        "Eritrea" -> println("Eriterea")
        "Djibouti" -> println("Djiboutian")
        "Egypt" -> println("Egyptian")
        else -> println("Foreigner")
    }
}

fun calculate(x: Int, y: Int, sign: String): Int {
    var result = 0
    when (sign) {
        "+" -> {
            result = x + y

        }

        "-" -> {
            result = x - y

        }

        "*" -> {
            result = x * y

        }

        "x" -> {
            result = x * y  //can work

        }

        "." -> {
            result = x * y// same

        }

        "*", ".", "x" -> {
            result = x * y
//or
        }
        /* "/"  "*" -> {
               result = x * y
   //same line not in different line
           }*///combine them and call them at once
        "/" -> {
            result = x / y
        }

        "%" -> {
            result = x % y
        }
    }
    println(result)
    return result
}

fun assignSchool(marks: Int) {
    if (marks > 390) {
        println("National")
    } else if (marks > 350 && marks < 390) //marks in 350<..>390 ranges
    {
        println("Provinsial")
    } else {
        println("District")
    }
}

fun printSquare() {
    for (num in 1..100) {
        val square = num * num
        if (square < 1000) {
            println(square)
        }
    }
}

fun printSquare2() {
    for (num in 1..100) {
        val square = num * num
        if (square < 1000) {
            println(square)
        } else {
            break//breaks where the last number is
        }
    }
}

/*fun main() {
    /*var num = 9
   // var num1 = 100000000000000
    while(num>0) {
        println(num)
        num--
        //num1-=50000
    }*///evaluates first never print 0
    var num = 9
    do {
        println(num)
        num--
    }while(num > 0)
}//print first evaluate then gives out prints 0 before going to negative
//for loop does something repeatedly outside a collection*/

/*fun main() {
    var noiseMakers = arrayOf("Brenda","Brian","Betty","Bridgit")
    for(noisy in noiseMakers)
       /* if(noisy=="Betty"|| noisy=="Bernard") {
            continue//removes out an element by skipping to the next one
        }*/
        val myFriends = arrayOf("Betty","Bernard")
//    for in
//        if(noisy in myFriends){
//            continue
//        else {
//            println(noisy)
//        }
//}
*/

/*fun num() {
    for(i in 1..100)
    {println(
        (if(i%3<1)"fizz" else "") +
            (if(i%5<1)"buzz" else "") +
            if(!(i%3<1||i%5<1))"Fizzbuzz" else ""
    )}




}*/

fun num() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("fizz")
        } else if (i % 5 == 0) {
            println("buzz")
        } else {
            println(i)
        }
    }

}

fun check() {
    for (number in 1..100)
        if (number % 2 == 0) {
            println("$number is an even number")
        } else {
            println("$number is an odd number")
        }
}

fun long(names: Array<String>): Int {
    return names.count { it.length > 5 }
}


fun serve(i: Int) {
    if (i > 6) {
        println("Serve glass of milk")
    } else if (i < 6 && i > 15) {
        println("Serve a bottle of Fanta")
    } else {
        println("Get a bottle of coca cola")
    }
}

*/

//data class Products(var name: String,
//                    var category:String,
//                    var price: Double,
//                    var quantity: Int)
//

// In an ecommerce app's checkout feature the cart is represented
// using a list of products from the above data class.
// The app needs to display a categorized total for all the checkout items
// The possible categories are:
// "groceries", "hygiene", "general", and "appliances"

// Write a function that would compute and return the category totals for each category
/*
data class Products(var name: String,
                var category:String,
                var price: Double,
                    var quantity: Int)

x

fun main(){
   create (listOf(
       Products("fruits","groceries",30.0,40),
       Products("clean","hygiene",40.0,26),
       Products("banana","general",20.3,10),
       Products("houses","appliance",80.0,,20)
   ))

}

data class Categories(var groceries: String,
                      var hygeine:String,
                      var general: Double,
                      var appliance: Int)
fun create(list: List<Products>): List<String>  {
    var groceries =0.0
    var hygeine=0.0
    var general= 0.0
    var appliance= 0.0
    for (product in list) {
        when(product.category){
            "hygiene" -> [hygiene =  ]
        }
        val totalPrice = product.price * product.quantity
       totals[product.category] = totals.[product.category, 0.0) + totalPrice
    }

    return totals
}


//fun employ(list: List<Employees>): List<Employees> {
//    var average = list.sumOf { it.salary } / list.size
//    println(average)
//    var give = list.filter { it.salary > average }
//    println(give)
//    return give

/*
data class Products(val name: String,
                    val category: String,
                    val price: Double,
                    val quantity: Int)

fun getCategoryTotals(products: List<Products>): Map<String, Double> {
    val totals = mutableMapOf<String, Double>()

    for (product in products) {
        val totalPrice = product.price * product.quantity
        totals[product.category] = totals.getOrDefault(product.category, 0.0) + totalPrice
    }

    return totals
}

// Sample data
val checkoutItems = listOf(
    Products("Product1", "groceries", 10.0, 2),
    Products("Product2", "hygiene", 5.0, 3),
    Products("Product3", "general", 15.0, 1),
    Products("Product4", "appliances", 100.0, 1),
    Products("Product5", "groceries", 20.0, 2),
    Products("Product6", "hygiene", 8.0, 4),
    Products("Product7", "general", 25.0, 2)
)
*//*fun main() {
 */
    // Create a HashMap to store users and their followers
    val users = hashMapOf<String, MutableSet<String>>()

    // Function to add a user
    fun addUser(user: String) {
        // Initialize the user's followers set if it doesn't exist yet
        if (!users.containsKey(user)) {
            users[user] = mutableSetOf()
        }
    }

    // Function to add a follower to a user
    fun addFollower(user: String, follower: String) {
        // Add the follower to the user's set of followers
        users[user]?.add(follower)
    }

    // Function to get a user's followers
    fun getFollowers(user: String): Set<String>? {
        // Return the user's set of followers
        return users[user]
    }

    // Example usage
    addUser("Alice")
    addUser("Bob")
    addUser("Charlie")

    addFollower("Alice", "Bob")
    addFollower("Alice", "Charlie")
    addFollower("Bob", "Charlie")

    println(getFollowers("Alice")) // Output: [Bob, Charlie]
}


// Calculate and display category totals
val categoryTotals = getCategoryTotals(checkoutItems)
categoryTotals.forEach { (category, total) -> println("$category total: $total") }*/


fun main() {
    // Create a HashMap to store users and their followers
    val users = hashMapOf<String, MutableSet<String>>()

    // Function to add a user
    fun addUser(user: String) {
        // Initialize the user's followers set if it doesn't exist yet
        if (!users.containsKey(user)) {
            users[user] = mutableSetOf()
        }
    }

    // Function to add a follower to a user
    fun addFollower(user: String, follower: String) {
        // Add the follower to the user's set of followers
        users[user]?.add(follower)
    }

    // Function to get a user's followers
    fun getFollowers(user: String): Set<String>? {
        // Return the user's set of followers
        return users[user]
    }

    // Example usage
    addUser("Alice")
    addUser("Bob")
    addUser("Charlie")

    addFollower("Alice", "Bob")
    addFollower("Alice", "Charlie")
    addFollower("Bob", "Charlie")

    println(getFollowers("Alice")) // Output: [Bob, Charlie]
}
//make a healthcare  appointment for sceduling doctors based on the doctors availability,
// patient preference and the  and giving out reminders on the appointed time.



//