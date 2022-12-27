package me.study.design_pattern.creation.abstract_factory.structure

class Client(
    private val factory: AbstractFactory
) {
    fun operation() {
        factory.createProductA()
        factory.createProductB()
    }
}
