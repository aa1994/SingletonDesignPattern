fun main(args: Array<String>) {

    DatabaseSingletonClass.name = "Aditya"
    DatabaseSingletonClass.version = 1

    DatabaseSingletonClass.printNameAndVersion()

    DatabaseSingletonClass.updateVersion()

    DatabaseSingletonClass.printNameAndVersion()

    var newClient = NewClient()

    DatabaseSingletonClass.updateVersion()

    DatabaseSingletonClass.printNameAndVersion()
}