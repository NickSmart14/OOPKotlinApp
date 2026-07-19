package com.example.oopkotlinapp.model
import android.util.Log

class Manager(
    name: String,
    age: Int,
    address: String,
    val managerId: String,
    val teamName: String
) : Person(name, age, address) {

    override fun getDisplayName(): String {
        return "Manager: ${getName()}"
    }
// Pass both an Employee and a Manager to this function.
}