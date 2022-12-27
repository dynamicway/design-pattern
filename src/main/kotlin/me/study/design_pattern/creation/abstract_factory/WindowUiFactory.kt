package me.study.design_pattern.creation.abstract_factory

class WindowUiFactory : UiFactory {
    override fun createButton() = WindowButton()

    override fun createPointer() = WindowPointer()

    override fun createWindow() = WindowWindow()
}
