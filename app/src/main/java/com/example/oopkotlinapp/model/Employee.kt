package com.example.oopkotlinapp.model

class Employee(
    name: String,
    age: Int,
    address: String,
    val employeeId: String,
    val department: String
) : Person(name, age, address) {
    override fun getDisplayName(): String {
        return "Employee: ${getName()}"
    }
}