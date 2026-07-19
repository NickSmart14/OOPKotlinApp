package com.example.oopkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.oopkotlinapp.ui.theme.OOPKotlinAppTheme
import com.example.oopkotlinapp.model.Person
import com.example.oopkotlinapp.model.Employee
import android.util.Log
import com.example.oopkotlinapp.model.Manager
import com.example.oopkotlinapp.model.printPersonSummary


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val person = Person("Jake", 22, "45 Somewhere Road")
        val employee = Employee("Jill", 29, "Nowhere Street", "05", "Level1")

        val manager = Manager("Bob", 45, "Galaxy Road", "M01", "Sales")

        person.setAge(26)

        Log.d("TEST", person.getDisplayName())
        Log.d("TEST", person.getAge().toString())
        Log.d("TEST", person.getAddress())

        Log.d("TEST", " ")

        printPersonSummary(employee)

        Log.d("TEST", " ")

        printPersonSummary(manager)





        enableEdgeToEdge()
        setContent {
            OOPKotlinAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OOPKotlinAppTheme {
        Greeting("Android")
    }
}