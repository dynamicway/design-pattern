package me.study.designpattern.creation.factorymethod.structure

class ConcreteCreatorA : Creator {
    override fun firstOperation() {
        TODO("Not yet implemented")
    }

    override fun secondOperation() {
        TODO("Not yet implemented")
    }

    override fun createProduct() = ConcreteProductA()
}
