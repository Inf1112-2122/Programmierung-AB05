import de.github.dudrie.hamster.imperative.de.*

fun laufeInNaechsteEcke() {
    while (istVorDirFrei()) {
        laufe()
    }
    dreheNachLinks()

    while (istVorDirFrei()) {
        laufe()
    }
    dreheNachLinks()
}

fun ermittleLaenge(): Int {
    var laenge: Int = 1
    while (istVorDirFrei()) {
        laufe()
        laenge++
    }
    dreheUm()

    laufeMehrfach(laenge-1)
    dreheUm()

    return laenge
}

fun bestimmeUmfang(breite: Int, hoehe: Int): Int {
    val umfang: Int

    if (breite == 1) {
        umfang = hoehe
    } else if (hoehe == 1) {
        umfang = breite
    } else {
        // Die Eckfelder dürfen nicht doppelt gezählt werden
        umfang = 2 * breite + 2 * hoehe - 4
    }

    return umfang
}

fun legeKoernerAmRandAb() {
    repeat(4) {
        while (istVorDirFrei()) {
            laufe()
            if (!liegtEinKornAufDeinemFeld()) {
                legeKornAb()
            }
        }
        dreheNachLinks()
    }
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

    if (anzahlKoernerImMund >= umfang) {
        legeKoernerAmRandAb()
    } else {
        sage("Ich habe leider nur $anzahlKoernerImMund Körner im Mund, benötige aber mindestens $umfang Körner.")
    }

    stoppeSpiel()
}
