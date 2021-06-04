package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Jéssica")
        val cartao = Cartao("7321")
        return Conta(
                "2145-5",
                "5669-5",
                "R$ 2541,23",
                "R$ 5622,00",
                cliente,
                cartao );
    }
}