import de.github.dudrie.hamster.imperative.de.*

fun dreheDichMehrfachNachLinks(anzahl: Int) {
    // TODO: A2 b)
}

fun main() {
    starteSchatzsucheSpiel(0)

    /**
     * Die Blickrichtung des Hamsters.
     *
     * 0 = Osten, 1 = Norden, 2 = Westen, 3 = Süden
     */
    var aktuelleBlickrichtung: Int = 0
    // TODO: A2 c)
    var kornAnzahlAufFeld: Int = 0

    // TODO: A2 e)

    stoppeSpiel()
}

/**
 * Dreht Paule, sodass er in die [neueBlickrichtung] schaut.
 *
 * Dafür wird die [aktuelleBlickrichtung] benötigt.
 */
fun dreheDichNach(neueBlickrichtung: Int, aktuelleBlickrichtung: Int) {
    dreheDichMehrfachNachLinks((neueBlickrichtung + 4 - aktuelleBlickrichtung) % 4)
}
