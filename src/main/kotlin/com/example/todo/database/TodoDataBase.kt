package com.example.todo.database

data class TodoDataBase(
    var index: Int = 0,   // ✅ 기본값 0으로 설정
    var todoList:MutableList<Todo> = mutableListOf(),
    ) {

    fun init(){
        this.index = 0
        this.todoList = mutableListOf()
        println("[DEBUG] todo database init")
    }
}