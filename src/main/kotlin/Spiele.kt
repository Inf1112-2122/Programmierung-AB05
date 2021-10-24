import de.github.dudrie.hamster.imperative.de.starteSpiel

fun starteKornAnRandSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "koerner_am_rand"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteSchatzsucheSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "schatzsuche"
        override val interval: IntRange = 0..1
    }, spielNummer)
}

fun starteKornfeldSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "kornfeld"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteRauteZeichnenSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "raute_zeichnen"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteAddierenSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "addieren"
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
