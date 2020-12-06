import com.forthreal.application.classes.Node


object Main {

    fun checkNodeForZero(node: Node) : Long
    {

        if( node.myChildren.size > 0 )
        {
            val iter = node.myChildren.iterator()

            while( iter.hasNext() )
            {
                val element = iter.next()

                val result = checkNodeForZero( element )

                if( result.compareTo( 0.toLong() ) == 0 )
                {
                    System.out.println("removing ${element.hashCode()} val ${element.myValue}")
                    iter.remove()
                }
            }

        }

        return node.myValue

    }

    @JvmStatic
    fun main(args: Array<String>) {

        val root =
            Node(
                listOf<Node>(
                    Node(1),
                    Node(
                        listOf<Node>(
                                Node( listOf<Node>( Node(0) , Node(0) ), 1)
                            )
                        ,0)
                   )
            , 0  )

        checkNodeForZero( root )
    }
}