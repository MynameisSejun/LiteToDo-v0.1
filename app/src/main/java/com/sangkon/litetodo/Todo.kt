package com.sangkon.litetodo

data class Todo(val id: Int = generatedId() , val date: String, val task: String) {
    companion object {
        private var currentId: Int = 0
        //generatedId() : Id를 자동으로 생성해주는 메서드
        private fun generatedId(): Int {
            return ++currentId
        }
    }
}
