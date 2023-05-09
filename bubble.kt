fun bubbleSort(arrayList: ArrayList<Int>) {

    var swapValue = 0

    for (outerIndex in 0 until arrayList.size) {
        for (innerIndex in 1 until arrayList.size) {
            if (arrayList[innerIndex - 1]  > arrayList[innerIndex]) {
                swapValue = arrayList[innerIndex - 1]
                arrayList[innerIndex - 1] = arrayList[innerIndex]
                arrayList[innerIndex] = swapValue
            }
        }
    }

    println(" bubble sort array list : $arrayList")
}
