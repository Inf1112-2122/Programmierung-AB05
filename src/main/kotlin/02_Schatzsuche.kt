import de.github.dudrie.hamster.imperative.de.*

fun main() {
    starteSchatzsucheSpiel(0)

    /**
     * Die Blickrichtung des Hamsters.
     *
     * 0 = Osten, 1 = Norden, 2 = Westen, 3 = Süden
     */
    var aktuelleBlickrichtung: Int = 0
    var kornAnzahlAufFeld: Int = zaehleKoernerAufFeld()

    while (kornAnzahlAufFeld != 1) {
        if (kornAnzahlAufFeld % 4 == 0) {
            dreheDichNach(0, aktuelleBlickrichtung)
            aktuelleBlickrichtung = 0
        } else if (kornAnzahlAufFeld % 3 == 0) {
            dreheDichNach(1, aktuelleBlickrichtung)
            aktuelleBlickrichtung = 1
        } else if (kornAnzahlAufFeld % 2 == 0) {
            dreheDichNach(2, aktuelleBlickrichtung)
            aktuelleBlickrichtung = 2
        } else {
            dreheDichNach(3, aktuelleBlickrichtung)
            aktuelleBlickrichtung = 3
        }

        laufeMehrfach(kornAnzahlAufFeld)
        kornAnzahlAufFeld = zaehleKoernerAufFeld()
    }

    sammleKornAuf()
    stoppeSpiel()
}

fun dreheDichNach(neueBlickrichtung: Int, aktuelleBlickrichtung: Int) {
    dreheDichMehrfachNachLinks((neueBlickrichtung + 4 - aktuelleBlickrichtung) % 4)
}

fun dreheDichMehrfachNachLinks(anzahl: Int) {
    repeat(anzahl) {
        dreheNachLinks()
    }
}
