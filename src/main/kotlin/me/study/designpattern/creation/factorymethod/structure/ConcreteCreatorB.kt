package me.study.designpattern.creation.factorymethod.structure

class ConcreteCreatorB : Creator {
    override fun firstOperation() {
        TODO("Not yet implemented")
    }

    override fun secondOperation() {
        TODO("Not yet implemented")
    }

    override fun createProduct() = ConcreteProductB()
}
