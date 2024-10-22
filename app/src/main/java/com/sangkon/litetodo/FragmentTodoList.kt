package com.sangkon.litetodo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sangkon.litetodo.databinding.FragmentTodoListBinding

class FragmentTodoList: Fragment() {
    private lateinit var binding: FragmentTodoListBinding
    private var todoList: MutableList<Todo> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodoListBinding.inflate(inflater, container, false)
        todoList.add(Todo(date = "2024.10.22", task = "task1"))
        todoList.add(Todo(date = "2024.10.22", task = "task2"))
        todoList.add(Todo(date = "2024.10.22", task = "task3"))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.todoList.layoutManager = LinearLayoutManager(requireContext())
        val todoAdapter: TodoAdapter = TodoAdapter()
        todoAdapter.setTodoList(todoList)
        binding.todoList.adapter = todoAdapter
    }
}