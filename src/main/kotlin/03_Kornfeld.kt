import de.github.dudrie.hamster.imperative.de.*

fun bestimmeBreite(): Int {
    var breite: Int = 1
    while (istVorDirFrei() && liegtVorDirEinKorn()) {
        laufe()
        breite++
    }
    dreheUm()

    laufeMehrfach(breite - 1)

    while (istVorDirFrei() && liegtVorDirEinKorn()) {
        laufe()
        breite++
    }
    return breite
}

fun bestimmeHoehe(): Int {
    return bestimmeBreite()
}

fun liegtVorDirEinKorn(): Boolean {
    if (!istVorDirFrei()) {
        return false
    }
    laufe()
    val istKornDa: Boolean = liegtEinKornAufDeinemFeld()

    dreheUm()
    laufe()
    dreheUm()
    return istKornDa
}

fun graseFeldAb(breite: Int, hoehe: Int) {
    var nochAbzugrasendeSpalten: Int = breite
    while (nochAbzugrasendeSpalten > 0) {
        graseSpalteAbUndZurueck(hoehe)
        nochAbzugrasendeSpalten--
        if (nochAbzugrasendeSpalten > 0) {
            dreheNachRechts()
            laufe()
            dreheNachRechts()
        }
    }
}

fun graseSpalteAbUndZurueck(hoehe: Int) {
    sammleKornAuf()

    repeat(hoehe - 1) {
        laufe()
        sammleKornAuf()
    }

    dreheUm()
    laufeMehrfach(hoehe - 1)
}

fun main() {
    starteKornfeldSpiel(2)

    val breite: Int = bestimmeBreite()
    dreheNachLinks()
    val hoehe: Int = bestimmeHoehe()
    dreheUm()

    graseFeldAb(breite, hoehe)

    stoppeSpiel()
}
