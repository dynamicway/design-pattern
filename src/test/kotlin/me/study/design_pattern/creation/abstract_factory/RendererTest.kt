package me.study.design_pattern.creation.abstract_factory

import org.junit.jupiter.api.Test

/**
 * I know <strong>the test must be validated by self</strong>, but I did it.
 * */
internal class RendererTest {

    @Test
    internal fun inject_mac_factory_then_has_mac_aggregation_objects() {
        val renderer = Renderer(MacUiFactory())

        renderer.render()
    }

    @Test
    internal fun inject_window_factory_then_has_window_aggregation_objects() {
        val renderer = Renderer(WindowUiFactory())

        renderer.render()
    }

}
