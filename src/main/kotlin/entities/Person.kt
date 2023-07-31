package entities

abstract class Person(name : String, income : Double)
{
    var name : String = ""
        get()
    {
        return field
    }
        set(value)
        {
            field = value
        }

    var income : Double = 0.0
        get()
        {
            return field
        }
        set(value)
        {
            field = value
        }

    init
    {
        println("In init")
        this.name = name
        this.income = income
    }
    open fun TaxPayer(): Double {
        return 0.0
    }

}