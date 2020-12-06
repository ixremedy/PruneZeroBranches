package com.forthreal.application.classes

import javax.xml.ws.Holder
import kotlin.random.Random

class Node
{
    val code = Random.nextInt()
    val myValue : Long
    val myChildren : MutableList<Node> = mutableListOf<Node>()

    constructor(children: List<Node>, value: Long )
    {
        children.forEach {
            element ->
                myChildren.add( element )
                System.out.println("adding ${element.hashCode()}")
        }
        myValue = value
        System.out.println("adding node elem ${hashCode()} val ${myValue} ch ${myChildren.size}")
    }

    constructor(element: Node, value: Long)
    {
        myChildren.add( element )
        System.out.println("adding ${element.hashCode()} val ${element.myValue}")

        myValue = value
        System.out.println("adding node elem ${hashCode()} val ${myValue} ch 1")
    }

    constructor(value: Long)
    {
        myValue = value
        System.out.println("adding empty elem ${hashCode()} val ${myValue}")
    }

    override fun hashCode(): Int
    {
        return code
    }
}