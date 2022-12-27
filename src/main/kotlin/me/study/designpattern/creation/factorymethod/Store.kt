package me.study.designpattern.creation.factorymethod

abstract class Store {
    fun order(): Product {
        prepareOrder()
        return getProduct()
    }

    protected abstract fun prepareOrder()

    abstract fun getOwner(): String

    protected abstract fun getProduct(): Product
}
