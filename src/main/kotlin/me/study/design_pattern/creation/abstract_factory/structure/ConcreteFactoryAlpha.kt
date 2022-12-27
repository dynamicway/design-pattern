package me.study.design_pattern.creation.abstract_factory.structure

class ConcreteFactoryAlpha : AbstractFactory {
    override fun createProductA(): ProductA = AlphaProductA()

    override fun createProductB(): ProductB = AlphaProductB()
}
