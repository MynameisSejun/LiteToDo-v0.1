package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding

// 교재 방식 TodoHolder를 밖으로 뺌
//class TodoHolder(val binding: TodoCardViewBinding): RecyclerView.ViewHolder(binding.root) {
//    //'Todo'를 전달하면 card_view를 우리한테 줘야함
//    fun binData(todo: Todo) {
//        binding.todo = todo
//    }
//}

class TodoAdapter: RecyclerView.Adapter<TodoAdapter.TodoHolder>() {
    //Todo를 TodoHolder에 있는 CardView로 변경해주는 어뎁터

    private val todoList: MutableList<Todo> = mutableListOf()
    //todolist에 있는 것을 cardView로 바꾸는 것이 목적

    override fun getItemCount(): Int = todoList.size

    class TodoHolder(private val binding: TodoCardViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun binData(todo: Todo) {
            binding.todo = todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        //Holder 만들기
        val binding = TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        //ViewHolder와 todo 연결
        holder.binData(todoList[position])
    }

    fun setTodoList(list: List<Todo>) {
        todoList.addAll(list)
    }
}