package com.example.oopkotlinapp.model

open class Person(name: String, age: Int, address: String) {
    // Add private variables.
    private var name: String = ""
    private var age: Int = 0
    private var address: String = ""

    init
    {
        SetName(name)
        SetAge(age)
        SetAddress(address)
    }

    fun GetName(): String
    {
        return name
    }

    fun SetName(name: String)
    {
        if (name.isNotBlank())
        {
            this.name = name
        }
    }

    fun GetAge(): Int
    {
        return age
    }

    fun SetAge(age: Int)
    {
    if (age in 0..120)
    {
        this.age = age
    }
    }
    fun GetAddress(): String
    {
        return address
    }

    fun SetAddress(address: String)
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