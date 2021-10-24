import de.github.dudrie.hamster.imperative.de.*

fun dreheUm() {
    repeat(2) {
        dreheNachLinks()
    }
}

fun dreheNachRechts() {
    repeat(3) {
        dreheNachLinks()
    }
}

fun laufeZurNaechstenWand() {
    while (istVorDirFrei()) {
        laufe()
    }
}

fun laufeMehrfach(anzahl: Int) {
    repeat(anzahl) {
        laufe()
    }
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

fun zaehleKoernerImMund(): Int {
    var kornAnzahl: Int = 0
    while (!istDeinMundLeer()) {
        legeKornAb()
        kornAnzahl++
    }

    repeat(kornAnzahl) {
        sammleKornAuf()
    }
    return kornAnzahl
}

fun zaehleKoernerAufFeld(): Int {
    var kornAnzahl: Int = 0
    while (liegtEinKornAufDeinemFeld()){
        sammleKornAuf()
        kornAnzahl++
    }

    repeat(kornAnzahl){
        legeKornAb()
    }
    return kornAnzahl
}
