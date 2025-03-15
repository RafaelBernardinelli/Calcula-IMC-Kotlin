package br.edu.utfpr.calcula_imc_kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val resultado = MainActivity.calculaImc(90.00, 1.90, "pt")
        assertTrue("IMC calculado corretamente",
            MainActivity.calculaImc(90.00, 1.90, "pt") in 24.93 .. 24.94)
    }
}