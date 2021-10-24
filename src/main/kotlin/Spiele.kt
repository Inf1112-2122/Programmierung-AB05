import de.github.dudrie.hamster.imperative.de.starteSpiel

fun starteXXSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "PREFIX"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

private fun starteSpielAusSpielMenge(menge: SpielMenge, spielNummer: Int) {
    require(spielNummer in menge.interval) { "Die Spielnummer $spielNummer ist ungültig. Sie muss zwischen ${menge.interval.first} und ${menge.interval.last} liegen." }

    starteSpiel("territories/${menge.spielPrefix}_$spielNummer")
}

private interface SpielMenge {
    val spielPrefix: String
    val interval: IntRange
}
