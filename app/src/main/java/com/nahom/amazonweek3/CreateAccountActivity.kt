package com.nahom.amazonweek3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity : AppCompatActivity() {

    private val registeredUsers = mutableListOf("user@example.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val createAccountButton = findViewById<Button>(R.id.createAccountButton)
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)

        createAccountButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val email = emailEditText.text.toString()

            if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                showToast("Please fill in all fields")
            } else if (registeredUsers.contains(username)) {
                showToast("Username already exists")
            } else {
                // Add new user to the list (simulate registration)
                registeredUsers.add(username)
                showToast("Account created successfully")
                // Redirect to sign-in activity
                startActivity(Intent(this, CategoryActivity::class.java))
                finish()
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
