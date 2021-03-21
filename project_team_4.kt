open class BSNode<T,S> (){
    open lateinit val key: T
    open val value: S
    open var leftChild: BSNode
    open var rightChild: BSNode
}

enum class Color(){
    RED,
    BLACK
}

open class RBNode<T,S>: BSNode<T,S>(){
    var color: Color
    val parent: RBNode
}

open class AVLNode<T,S>: BSNode<T,S>(){
    var heght: Int
}

open class BSTree<T,S> (){
    open fun find(){}
    open fun add(){}
    open fun delete(){}
    open fun iterate(){}
}

open class RBTree<T,S>: BSTree<T,S>(){
    override fun find(){}
    override fun add(){}
    override fun delete(){}
    override fun iterate(){}
    fun balance(){}
}

open class AVLTree<T,S>: BSTree<T,S>(){
    override fun find(){}
    override fun add(){}
    override fun delete(){}
    override fun iterate(){}
    fun balance(){}
}

