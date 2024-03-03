package com.nahom.amazonweek3
import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
    }

    fun onCategoryClicked(view: View) {
        val category = when (view.id) {
            R.id.homeKitchenButton -> "Home & Kitchen"
            R.id.beauty -> "Beauty & Personal Care"
            R.id.petSuppliesButton -> "Pet Supplies"
            R.id.toysGamesButton -> "Toys & Games"
            else -> ""
        }
        showToast("Selected category: $category")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
