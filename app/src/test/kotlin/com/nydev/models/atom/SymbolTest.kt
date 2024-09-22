package com.nydev.models.atom

import kotlin.test.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import com.nydev.models.atom.Symbol
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SymbolTest {
    @ParameterizedTest
    @EnumSource()
    fun display_returns(symbol: Symbol) {
        assertEquals(
            when (symbol) {
                Symbol.H -> "H"
                Symbol.HE -> "He"
                Symbol.LI -> "Li"
                Symbol.BE -> "Be"
                Symbol.B -> "B"
                Symbol.C -> "C"
                Symbol. N -> "N"
                Symbol.O -> "O"
                Symbol.F -> "F"
                Symbol.NE -> "Ne"
                Symbol.NA -> "Na"
                Symbol.MG -> "Mg"
                Symbol.AL -> "Al"
                Symbol.SI -> "Si"
                Symbol.P -> "P"
                Symbol.S -> "S"
                Symbol.CL -> "Cl"
                Symbol.AR -> "Ar"
            },
            symbol.display
        )
    }
}