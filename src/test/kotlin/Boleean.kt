fun main() {
    val nilai = 55

    val school = if (nilai >= 90 ){
        "A"
    }else if (nilai >=80 ){
        "B"
    }else if (nilai >=70 ){
        "C"
    }else if (nilai >=60 ){
        "D"
    }else if (nilai <=50 ){
        "E"
    }else{
        ""
    }

    print("Nilai anda : $school")

}