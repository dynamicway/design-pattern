package me.study.design_pattern.creation.factory_method.structure

interface Creator {
    fun firstOperation()

    fun secondOperation()

    fun createProduct(): Product
}
