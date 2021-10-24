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

fun laufeMehrfach(anzahl: Int) {
    repeat(anzahl) {
        laufe()
    }
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
