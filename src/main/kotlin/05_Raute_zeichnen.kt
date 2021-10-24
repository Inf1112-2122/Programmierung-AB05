import de.github.dudrie.hamster.imperative.de.*

fun bestimmeKornAnzahlFuerRaute(breite: Int): Int {
    var anzahl: Int = breite

    for (i in 1 until breite step 2) {
        anzahl += 2 * i
    }

    return anzahl
}

fun bestimmeRautenBreite(territoriumsGroesse: Int, anzahlKoernerImMund: Int): Int {
    var rautenBreite: Int = 0

    for (i in 1..territoriumsGroesse step 2) {
        val benoetigteKoerner: Int = bestimmeKornAnzahlFuerRaute(i)

        if (anzahlKoernerImMund >= benoetigteKoerner) {
            rautenBreite = i
        }
    }

    return rautenBreite
}

fun laufeInsZentrum(territoriumsGroesse: Int) {
    val schritteBisZurMitte = territoriumsGroesse / 2

    laufeMehrfach(schritteBisZurMitte)
    dreheNachLinks()
    laufeMehrfach(schritteBisZurMitte)
}

fun zeichneRautenReihe(radius: Int) {
    legeKornAb()
    dreheNachLinks()
    repeat(radius) {
        laufe()
        legeKornAb()
    }
    dreheUm()
    laufeMehrfach(radius)
    repeat(radius) {
        laufe()
        legeKornAb()
    }
    dreheUm()
    laufeMehrfach(radius)
    dreheNachRechts()
}

fun main() {
    starteRauteZeichnenSpiel(0)
    setzeSpielGeschwindigkeit(10f)

    laufeInNaechsteEcke()

    val seitenlaenge: Int = ermittleLaenge()
    val anzahlKoernerImMund: Int = zaehleKoernerImMund()
    val rautenBreite: Int = bestimmeRautenBreite(seitenlaenge, anzahlKoernerImMund)
    val rautenRadius: Int = rautenBreite / 2 + 1

    laufeInsZentrum(seitenlaenge)
    laufeMehrfach(rautenRadius - 1)
    dreheUm()

    for (i in 0 until rautenRadius) {
        zeichneRautenReihe(i)
        laufe()
    }

    for (i in rautenRadius - 2 downTo 0) {
        zeichneRautenReihe(i)
        if (istVorDirFrei()) {
            laufe()
        }
    }

    stoppeSpiel()
}
