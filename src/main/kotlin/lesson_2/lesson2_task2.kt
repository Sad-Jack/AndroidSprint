package lesson_2

fun main(){

    var workers = 50
    var workerSalary = 30000
    var interns = 30
    var internSalary = 20000

    var salaryOfWorkers = workers * workerSalary

    var salaryAll =  (interns * internSalary) + salaryOfWorkers

    var averageSalary = salaryAll / (workers + interns)

    println("| Выплаты сотрудникам штата:            | $salaryOfWorkers")

    println("| Выплаты сотрудникам штата + стажеры:  | $salaryAll")

    println("| Средняя зарплата сотрудникам:         | $averageSalary")

}