fun main() {
    val likes = 61.toString()
    val result = if(likes.endsWith("1") && likes!="11")
        "человеку"
    else
        "людям"

    print("Понравилось $likes $result")
}