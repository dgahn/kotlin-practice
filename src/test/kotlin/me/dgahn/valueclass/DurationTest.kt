package me.dgahn.valueclass

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DurationTest: FunSpec({

    test("millisec와 sec로 Duration을 구할 수 있다.") {
        Duration.millis(10_000) shouldBe Duration.seconds(10)
    }

})