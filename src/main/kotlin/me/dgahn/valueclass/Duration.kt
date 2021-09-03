package me.dgahn.valueclass

@JvmInline
value class Duration(val millis: Long) {
    companion object {
        fun millis(millis: Long) = Duration(millis)

        fun seconds(seconds: Long) = Duration(seconds * 1000)
    }
}