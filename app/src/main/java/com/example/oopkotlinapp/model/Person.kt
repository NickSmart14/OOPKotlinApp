package com.example.oopkotlinapp.model

import android.util.Log

open class Person(name: String, age: Int, address: String) {
    // Add private variables.
    private var name: String = ""
    private var age: Int = 0
    private var address: String = ""

    init
    {
        setName(name)
        setAge(age)
        setAddress(address)
    }

    fun getName(): String
    {
        return name
    }

    fun setName(name: String)
    {
        if (name.isNotBlank())
        {
            this.name = name
        }
    }

    fun getAge(): Int
    {
        return age
    }

    fun setAge(age: Int)
    {
    if (age in 0..120)
    {
        this.age = age
    }
    }
    fun getAddress(): String
    {
        return address
    }

    fun setAddress(address: String)
    {
        if (address.isNotBlank())
        {
            this.address = address
        }
    }

    // Add public getter and setter methods.
    open fun getDisplayName(): String {
            return "Person: $name"

    }



}

fun printPersonSummary(person: Person) {
    Log.d("TEST", person.getDisplayName())
    Log.d("TEST","Age: ${person.getAge()}")
    Log.d("TEST","Address: ${person.getAddress()}")
}