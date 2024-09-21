package com.ismailmesutmujde.kotlinpopupmenu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import com.ismailmesutmujde.kotlinpopupmenu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonOpenMenu.setOnClickListener {

            val popup = PopupMenu(this@MainActivity, bindingMain.buttonOpenMenu)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_delete -> {
                        Toast.makeText(applicationContext, "Delete is selected.", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_edit -> {
                        Toast.makeText(applicationContext, "Edit is selected.", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }

            }
            popup.show()

        }

    }
}