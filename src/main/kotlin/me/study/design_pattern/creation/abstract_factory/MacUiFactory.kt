package me.study.design_pattern.creation.abstract_factory

class MacUiFactory : UiFactory {
    override fun createButton() = MacButton()

    override fun createPointer() = MacPointer()

    override fun createWindow() = MacWindow()
}
