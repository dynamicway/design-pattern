package me.study.design_pattern.creation.abstract_factory

interface UiFactory {
    fun createButton(): Button

    fun createPointer(): Pointer

    fun createWindow(): Window
}
