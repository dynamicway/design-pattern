package me.study.designpattern.creation.singleton

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

}
