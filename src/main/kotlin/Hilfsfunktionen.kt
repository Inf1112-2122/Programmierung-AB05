import de.github.dudrie.hamster.imperative.de.*

fun zaehleKoernerImMund(): Int {
    TODO("A1 c)")
}

fun laufeMehrfach(anzahl: Int) {
    repeat(anzahl) {
        laufe()
    }
}

fun liegtVorDirEinKorn(): Boolean {
    TODO("A3 a) oder A4 a)")
}

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


fun legeMehrereAb(anzahl: Int) {
    repeat(anzahl) {
        legeKornAb()
    }
}

fun zaehleKoernerAufFeld(): Int {
    var kornAnzahl: Int = 0
    while (liegtEinKornAufDeinemFeld()) {
        sammleKornAuf()
        kornAnzahl++
    }

    repeat(kornAnzahl) {
        legeKornAb()
    }
    return kornAnzahl
}
