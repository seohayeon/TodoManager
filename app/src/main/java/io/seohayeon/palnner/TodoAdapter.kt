package io.seohayeon.palnner

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class TodoAdapter (val context: Context, val TodoList:ArrayList<Todo>): BaseAdapter() {
    override fun getCount(): Int {
        return TodoList.size
    }

    override fun getItem(position: Int): Any {
        return TodoList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View= LayoutInflater.from(context).inflate(R.layout.list_item_todo, null)

        val iv_label = view.findViewById<ImageView>(R.id.iv_label)
        val content = view.findViewById<TextView>(R.id.tv_content)
        val isCheck = view.findViewById<CheckBox>(R.id.checkBox)

        val todo = TodoList[position]

        //iv_label.setImageResource(todo.label)
        var gd = iv_label.background as GradientDrawable

        if(todo.label == "수학") gd.setColor(ContextCompat.getColor(context,R.color.수학))
        if(todo.label === "국여") gd.setColor(ContextCompat.getColor(context,R.color.국어))
        if(todo.label === "영어") gd.setColor(ContextCompat.getColor(context,R.color.영어))
        if(todo.label === "역사") gd.setColor(ContextCompat.getColor(context,R.color.역사))
        if(todo.label === "사회") gd.setColor(ContextCompat.getColor(context,R.color.사회))
        if(todo.label === "과학") gd.setColor(ContextCompat.getColor(context,R.color.과학))


        isCheck.isChecked = todo.isCheck
        content.text = todo.content

        return view
    }
}