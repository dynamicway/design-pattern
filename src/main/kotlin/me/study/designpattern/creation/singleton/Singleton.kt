package me.study.designpattern.creation.singleton

class Singleton private constructor() {
    private class SingletonInstanceHolder {
        companion object {
            val INSTANCE: Singleton = Singleton()
        }
    }

    companion object {
        fun getInstance() = SingletonInstanceHolder.INSTANCE
    }
}
