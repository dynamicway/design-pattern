package me.study.designpattern.creation.factorymethod

abstract class Store {
    fun order(): Product {
        verifyOrder()
        return getProduct()
    }

    protected abstract fun verifyOrder()

    abstract fun getOwner(): String

    protected abstract fun getProduct(): Product
}
