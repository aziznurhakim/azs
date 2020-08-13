fun main() {
    val nilai = 80
    val kkm: String
    kkm = if (nilai >= 75){
        " ,Selamat yha!"
    }else if (nilai < 75){
        " ,Silahakan ikut Remidial"
    }else{
        ""
    }
    print("Nilai anda "+ nilai )
    println(kkm)
}