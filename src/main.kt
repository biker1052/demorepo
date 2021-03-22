
fun bubbleSort(arr:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}
fun main(){
    val numbers = bubbleSort(intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3))
    for (k in numbers) print("$k ")

    println("3 commit")
    println("4 commit")

    println("5 commit")
    println("6 commit")

    println("7 commit")

}
