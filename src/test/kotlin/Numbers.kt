fun main() {
    val panjang = "20"
    val tinggi = 12.6
    val lebar = 10
    val volume : Double
    val p:Float = panjang.toFloat()
    val l:Float = lebar.toFloat()
    hitungVolume("20", 12.6, 10, ) : Float
}
fun hitungVolume(p : Double, t : Double, l : Double) : Float
    {
    val v = p * l * t

        print(v)
        print("Volume dari balok yang mempunya panjang $p, lebar $l, tinggi $t, ini adalah $v")
        return v
}