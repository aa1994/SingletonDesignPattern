class NewClient {
    init {
        println("Inside New Client")

        DatabaseSingletonClass.updateVersion()

        DatabaseSingletonClass.name = "The Office"

        DatabaseSingletonClass.printNameAndVersion()
    }
}