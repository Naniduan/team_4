class Node(value: Long, exist: Boolean){
    public var value: Long
    public var exist: Boolean

    init {
        this.value = value
        this.exist = exist
    }

    constructor(value: Long){
        this.value = value
        this.exist = true
    }
}

class BinaryTree(root: Node){
    private var nodes: Array<Node>

    init {
        this.nodes = Array(1, {root})
    }

    public fun leftChild(i: Int): Node{
        return nodes[(i+2)*2-1]
    }

    public fun rightChild(i: Int): Node{
        return nodes[(i+2)*2]
    }

    public fun add(value: Long){

    }

    public fun find(value: Long){

    }

    public fun delete(value: Long){

    }
}
