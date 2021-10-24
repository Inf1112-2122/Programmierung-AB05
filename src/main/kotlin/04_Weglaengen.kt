import de.github.dudrie.hamster.imperative.de.*

fun folgeSpurBisAbzweigung(): Int {
    var anzahlSchritte: Int = 0

    while (liegtVorDirEinKorn()) {
        laufe()
        anzahlSchritte++
        sammleKornAuf()
    }

    return anzahlSchritte
}

fun liegtLinksVonDirEinKorn(): Boolean {
    dreheNachLinks()
    val liegtDaEinKorn: Boolean = liegtVorDirEinKorn()
    dreheNachRechts()
    return liegtDaEinKorn
}

fun liegtRechtsVonDirEinKorn(): Boolean {
    dreheNachRechts()
    val liegtDaEinKorn: Boolean = liegtVorDirEinKorn()
    dreheNachLinks()
    return liegtDaEinKorn
}

fun main() {
    starteKornspurSpiel(0)

    var istEndeErreicht: Boolean = false
    var anzahlSchritte: Int = 0

    while (!istEndeErreicht) {
        anzahlSchritte += folgeSpurBisAbzweigung()

        if (liegtLinksVonDirEinKorn()) {
            dreheNachLinks()
        } else if (liegtRechtsVonDirEinKorn()) {
            dreheNachRechts()
        } else {
            istEndeErreicht = true
        }
    }

    val laengeDerKornspur: Double = anzahlSchritte * holeFeldZuMeterSkalierung()
    val gelaufeneStrecke: Double = holeAnzahlSchritte() * holeFeldZuMeterSkalierung()
    sage("Die Kornspur war $laengeDerKornspur m lang.")
    sage("Ich bin dabei insgesamt $gelaufeneStrecke m gelaufen.")

    stoppeSpiel()
}
