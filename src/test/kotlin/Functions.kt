fun main() {
    val user = setUser("Muhammad Aziz ", "Swimming ",16)

    println(user)
}
fun setUser(name: String, hobi: String, age: Int) = "My name is $name, i like $hobi, i'm $age years old"