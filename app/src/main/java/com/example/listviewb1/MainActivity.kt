package com.example.listviewb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.rv_software)
        var list = mutableListOf<software>()

        list.add(software("Ruby", "Ruby is an open-source and fully object-oriented programming language", R.drawable.ruby))
        list.add(software("Ralis", "Ruby on Ralis is a server-side web" +
                "application development fremework written in Ruby language.", R.drawable.ralis))
        list.add(software("Phyton", "Phyton is interpreted scripting and object-oriented programming language", R.drawable.phyton))
        list.add(software("Java Script", "JavaScript is an object-based scripting language", R.drawable.js))
        list.add(software("PHP", "PHP is an is", R.drawable.php))


        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent, view, position, id -> Toast.makeText(this,
            "Anda memilih : ", Toast.LENGTH_SHORT).show()  }
    }
    }

