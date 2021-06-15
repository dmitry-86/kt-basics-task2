fun main() {
    val likes = 311

    val result = if(likes%10==1 && likes%100!=11)
        "человеку"
    else
        "людям"

    print("Понравилось $likes $result")
}