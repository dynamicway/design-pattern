package me.study.design_pattern.creation.abstract_factory.structure

interface AbstractFactory {
    fun createProductA(): ProductA
    fun createProductB(): ProductB
}
