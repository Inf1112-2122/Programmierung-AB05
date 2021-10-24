import de.github.dudrie.hamster.imperative.de.*

fun istRechtsVonDirFrei(): Boolean {
    dreheNachRechts()
    val istFrei: Boolean = istVorDirFrei()
    dreheNachLinks()
    return istFrei
}

fun geheInDieNaechsteReihe() {
    dreheNachRechts()
    laufe()
    dreheNachLinks()
}

fun berechnePotenz(basis: Int, exponent: Int): Int {
    var ergebnis: Int = 1

    repeat(exponent) {
        ergebnis *= basis
    }

    return ergebnis
}

fun hebeAlleKoernerAufUndZaehle(): Int {
    var anzahlAnKoernern: Int = 0
    while (liegtEinKornAufDeinemFeld()) {
        sammleKornAuf()
        anzahlAnKoernern++
    }
    return anzahlAnKoernern
}

fun holeZahlAusDerReihe(): Int {
    var zahlAusReihe: Int = 0
    var stelle: Int = 0

    while (istVorDirFrei()) {
        val anzahlAufFeld: Int = hebeAlleKoernerAufUndZaehle()
        zahlAusReihe += anzahlAufFeld * berechnePotenz(10, stelle)

        laufe()
        stelle++
    }

    zahlAusReihe += hebeAlleKoernerAufUndZaehle() * berechnePotenz(10, stelle)
    return zahlAusReihe
}

fun legeMehrereAb(anzahl: Int) {
    repeat(anzahl) {
        legeKornAb()
    }
}

fun main() {
    starteAddierenSpiel(0)

    laufeZurNaechstenWand()
    dreheUm()

    var summe: Int = 0

    while (istRechtsVonDirFrei()) {
        geheInDieNaechsteReihe()
        summe += holeZahlAusDerReihe()
        dreheUm()
        laufeZurNaechstenWand()
        dreheUm()
    }

    dreheNachLinks()
    laufeZurNaechstenWand()
    dreheNachRechts()

    while (summe > 0 && istVorDirFrei()) {
        val ziffer: Int = summe % 10
        summe /= 10

        legeMehrereAb(ziffer)
        laufe()
    }
    legeMehrereAb(summe % 10)

    stoppeSpiel()
}
