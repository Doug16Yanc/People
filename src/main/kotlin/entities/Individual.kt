package entities

class Individual(name: String, income: Double, healthExpenditures: Double) : Person(name, income)
{
    var healthExpenditures : Double = 0.0
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
        this.name = name
        this.income = income
        this.healthExpenditures = healthExpenditures
    }
    override fun TaxPayer(): Double
    {
        var basicTax : Double = 0.0

        if (income > 10000.00)
        {
            basicTax = income*0.15
        }
        else
        {
            basicTax = income*0.5
        }
        if (basicTax < 0.0)
        {
            basicTax = 0.0
        }
        return basicTax
    }
}