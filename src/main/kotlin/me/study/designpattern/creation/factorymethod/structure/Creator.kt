package me.study.designpattern.creation.factorymethod.structure

interface Creator {
    fun firstOperation()

    fun secondOperation()

    fun createProduct(): Product
}
