package me.study.design_pattern.creation.factory_method.structure

class ConcreteCreatorB : Creator {
    override fun firstOperation() {
        TODO("Not yet implemented")
    }

    override fun secondOperation() {
        TODO("Not yet implemented")
    }

    override fun createProduct() = ConcreteProductB()
}
