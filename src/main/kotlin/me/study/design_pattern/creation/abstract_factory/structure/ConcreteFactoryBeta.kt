package me.study.design_pattern.creation.abstract_factory.structure

class ConcreteFactoryBeta : AbstractFactory {
    override fun createProductA(): ProductA = BetaProductA()

    override fun createProductB(): ProductB = BetaProductB()
}
