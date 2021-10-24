import de.github.dudrie.hamster.imperative.de.*

fun laufeInNaechsteEcke() {
    // TODO: A1 a)
}

fun ermittleLaenge(): Int {
    var laenge: Int = 1

    // TODO: A1 b)

    return laenge
}

fun bestimmeUmfang(breite: Int, hoehe: Int): Int {
    TODO("A1 c)")
}

fun legeKoernerAmRandAb() {
    // TODO: A1 d)
}

fun main() {
    starteKornAnRandSpiel(0)

    laufeInNaechsteEcke()
    val breite: Int = ermittleLaenge()
    dreheNachLinks()
    val hoehe: Int = ermittleLaenge()
    dreheNachRechts()

    val anzahlKoernerImMund: Int = zaehleKoernerImMund()
    val umfang: Int = bestimmeUmfang(breite, hoehe)

    // TODO: A1 d)

    stoppeSpiel()
}
