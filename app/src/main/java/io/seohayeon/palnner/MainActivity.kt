package io.seohayeon.palnner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var TodoList = arrayListOf<Todo>(
        Todo("수학",false,"수학 문제집 풀기"),
        Todo("영어",true,"영어 본문외우기"),
        Todo("역사",false,"족보닷컴 암기하기"),
        Todo("수학",true,"일품 고난도 문제 풀기")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.lv_today)

        val Adapter = TodoAdapter(this,TodoList)
        listview.adapter = Adapter

    }
}