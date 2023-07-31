import entities.Company
import entities.Individual
import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.UK)
    val sc = Scanner(System.`in`)

    val list1: MutableList<Individual> = ArrayList()
    val list2: MutableList<Company> = ArrayList()

    var expenditureIndividual: Double = 0.0
    var expenditureCompany: Double = 0.0

    print("Enter number of people that should be registered:")
    var number = sc.nextInt()

    for (i in 0 until number) {
        print("People data:\n" + i)
        System.out.printf("Individual(i) or company(c)?")
        var type = sc.next()

        sc.nextLine()

        System.out.printf("Name:\n")
        var name = sc.nextLine()
        System.out.printf("Income:\n")
        var income = sc.nextDouble()

        if (type == "i") {
            System.out.printf("Health expenditures:\n")
            var healthExpenditures = sc.nextDouble()

            val individual = Individual(name, income, healthExpenditures)
            list1.add(individual)

            println("Name of people: ${individual.name}\nTax payable: $ ${individual.TaxPayer()}")

        } else {
            System.out.printf("Number of employees: ")
            var numberOfEmployees = sc.nextInt()

            val company = Company(name, income, numberOfEmployees)
            list2.add(company)

            println("Name of people: ${company.name}\nTax payable: $ ${company.TaxPayer()} ")
        }
    }

    print("\n")
    print("TAXES PAID:")
    var sumTotalIndividuals: Double = 0.0
    var sumTotalCompanies: Double = 0.0
    var sumTotalTaxes: Double = 0.0

    for (individual in list1)

        sumTotalIndividuals += individual.TaxPayer()



    for (company in list2)
        sumTotalTaxes += company.TaxPayer()

    sumTotalTaxes = sumTotalIndividuals + sumTotalCompanies

    println("Sum : $ ${sumTotalTaxes}\n")
}











