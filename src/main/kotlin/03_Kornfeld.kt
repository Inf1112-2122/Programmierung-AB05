import de.github.dudrie.hamster.imperative.de.*

fun bestimmeBreite(): Int {
    var breite: Int = 1

    // TODO: A3 b)

    return breite
}

fun bestimmeHoehe(): Int {
    return bestimmeBreite()
}

fun graseSpalteAbUndZurueck(hoehe: Int) {
    // TODO: A3 e)
}

fun graseFeldAb(breite: Int, hoehe: Int) {
    // TODO: A3 f)
}

fun main() {
    starteKornfeldSpiel(0)

    val breite: Int = bestimmeBreite()
    // TODO: A3 c)
    val hoehe: Int = bestimmeHoehe()
    dreheUm()

    graseFeldAb(breite, hoehe)

    stoppeSpiel()
}
