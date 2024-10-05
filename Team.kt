fun main(){
    val n = readln().toInt()
    var num = 0
    for (i in 1..n){
        val a = readln().toString()
        val character = '1'
        val count = a.count { it == character }
        if (count == 2 || count == 3){
            num ++
        }
    }
    print(num)
}