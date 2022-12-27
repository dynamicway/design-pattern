package me.study.design_pattern.creation.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors

class SingletonTest {

    @Test
    fun one_instance_is_guaranteed_even_if_created_multiple_times_at_the_same_time() {
        val singletons = hashSetOf<Singleton>()
        val executorService = Executors.newFixedThreadPool(100)
        val numberOfExecutions = 10000
        val countDownLatch = CountDownLatch(numberOfExecutions)

        repeat(numberOfExecutions) {
            executorService.execute {
                singletons.add(Singleton.getInstance())
                countDownLatch.countDown()
            }
        }
        countDownLatch.await()

        assertThat(singletons).hasSize(1)
    }

    @Test
    fun one_instance_is_guaranteed() {
        val singleton = Singleton.getInstance()
        val newInstance = Singleton.getInstance()

        assertThat(singleton).isEqualTo(newInstance)
    }

    @Test
    fun breaking_singletons_with_reflection() {
        val singleton = Singleton.getInstance()

        val newInstance = getNewInstanceByReflection(singleton)

        assertThat(singleton).isNotEqualTo(newInstance)
    }

    private fun getNewInstanceByReflection(singleton: Singleton): Singleton {
        val singletonDeclaredConstructor = singleton::class.java.getDeclaredConstructor()
        singletonDeclaredConstructor.isAccessible = true
        return singletonDeclaredConstructor.newInstance()
    }

}
