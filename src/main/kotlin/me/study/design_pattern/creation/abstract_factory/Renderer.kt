package me.study.design_pattern.creation.abstract_factory

class Renderer(
    private val uiFactory: UiFactory
) {
    fun render() {
        val button = uiFactory.createButton()
        val pointer = uiFactory.createPointer()
        val window = uiFactory.createWindow()

        button.render()
        pointer.render()
        window.render()
    }
}
