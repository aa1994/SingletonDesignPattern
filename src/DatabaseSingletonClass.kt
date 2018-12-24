object DatabaseSingletonClass {

    init {
        println("Inside the singleton class")
    }

    var version: Int? = null
    var name: String? = null

    fun printNameAndVersion() {
        println(" NAME : $name VERSION : $version")
    }

    fun updateVersion() {
        version = version?.inc()
    }
}