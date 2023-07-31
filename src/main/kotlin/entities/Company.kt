package entities

class Company(name: String, income: Double, numberOfEmployees: Int) : Person(name, income)
{
    var numberOfEmployeers : Int = 0
        get ()
        {
            return field
        }
        set(value)
        {
            field = value
        }
    init
    {
        this.name = name
        this.income = income
        this.numberOfEmployeers = numberOfEmployeers
    }
     override fun TaxPayer() : Double
    {
         var tax : Double = 0.0

        if (numberOfEmployeers > 10)
        {
           tax = income*0.14
        }
        else
        {
           tax = income*0.15
        }
        return tax
    }
}