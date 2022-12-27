package me.study.design_pattern.creation.factory_method

abstract class Store {
    fun order(): Product {
        prepareOrder()
        return getProduct()
    }

    protected abstract fun prepareOrder()

    abstract fun getOwner(): String

    protected abstract fun getProduct(): Product
}
