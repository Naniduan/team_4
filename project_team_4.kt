open class BSNode<T:Comparable<T>,S> (value: S, key: T){
    open val value: S = value
    open val key: T = key
    open var leftChild: BSNode<T,S>? = null
    open var rightChild: BSNode<T,S>? = null
}

enum class Color(){
    RED,
    BLACK
}

open class RBNode<T:Comparable<T>,S>(value: S, key: T): BSNode<T,S>(value, key){
    var color: Color = Color.BLACK
    var parent: RBNode<T,S>? = null
}

open class AVLNode<T:Comparable<T>,S>(value: S, key: T): BSNode<T,S>(value, key){
    var heght: Int = 0
}

open class BSTree<T:Comparable<T>,S> (root: BSNode<T,S>){
    private var root = root

    open fun find(key: T): BSNode<T,S>?{
        var currentNode = root
        while (true){
            if (currentNode.key == key) return currentNode
            else if (currentNode.key < key){
                if (currentNode.leftChild == null) return null
                currentNode = currentNode.leftChild!!
            }
            else{
                if (currentNode.rightChild == null) return null
                currentNode = currentNode.rightChild!!
            }
        }
    }
    open fun add(value: S, key: T): Boolean{ //true if successful false if not
        var currentNode = root

        while(true){
            if (currentNode.key < key){
                if (currentNode.leftChild == null) {
                    currentNode.leftChild = BSNode(value, key)
                    return true
                }
                currentNode = currentNode.leftChild!!
            }
            else if (currentNode.key > key){
                if (currentNode.rightChild == null) {
                    currentNode.rightChild = BSNode(value, key)
                    return true
                }
                currentNode = currentNode.rightChild!!
            }
            else if (currentNode.key == key) return false
        }
    }
    open fun delete(key: T): Boolean {
        var parent: BSNode<T, S>? = null
        var currentNode = root

        if (currentNode.key < key) {
            if (currentNode.leftChild == null) {
                return false
            }
            parent = currentNode
            currentNode = currentNode.leftChild!!
        } else if (currentNode.key > key) {
            if (currentNode.rightChild == null) {
                return false
            }
            parent = currentNode
            currentNode = currentNode.rightChild!!
        } else if (currentNode.key == key) {
            TODO()
        }
    }
    open fun iterate(){}
}

class RBTree<T:Comparable<T>,S>(root: RBNode<T,S>): BSTree<T,S>(root){
    override fun find(key:T): BSNode<T,S>? = TODO()
    override fun add(value: S, key: T): Boolean = TODO()
    override fun delete(key: T): Boolean = TODO()
    override fun iterate() = TODO()
    fun balance() = TODO()
}

class AVLTree<T:Comparable<T>,S>(root: AVLNode<T,S>): BSTree<T,S>(root){
    override fun find(key:T): BSNode<T,S>? = TODO()
    override fun add(value: S, key: T): Boolean = TODO()
    override fun delete(key: T): Boolean = TODO()
    override fun iterate() = TODO()
    fun balance() = TODO()
}

