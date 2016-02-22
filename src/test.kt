import Stack.Stack4
import java.util.*
import Stack.StackDynamic;
import Stack.StackStatic;

/**
 * 20.02.2016.
 */

fun testStaticStack(){
    var staticStack: StackStatic<String> = StackStatic()

    println(staticStack.isEmpty)
}

fun testDynamicStack(){
    var dynamicStack: Stack4<String> = Stack4()

    println(dynamicStack.isEmpty)

    var list: ArrayList<String> = ArrayList()

    for(i in 1..10000) list.add("test3rdCase")

    dynamicStack.push(list)



    val iterator: Iterator<String> = dynamicStack.iterator()
    while (iterator.hasNext()) {
        iterator.next()
    }
}

fun main(args: Array<String>) {
    testStaticStack()
    testDynamicStack()
}