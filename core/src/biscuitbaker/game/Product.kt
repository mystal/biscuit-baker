package biscuitbaker.game

import java.util.*

//data class ProductInfo(val name: String, val price: Long, val bps: Double)
// NOTE: Can't use a data class since JsonBeans expects a default constructor
class ProductInfo() {
    public var name: String = ""
    public var price: Long = 0
    public var bps: Double = 0.0
    public var requirements: ProductRequirements? = null
}

class Product(info: ProductInfo) {
    public var info: ProductInfo = info
        private set

    public var owned: Int = 0

    public val name: String
        get() = info.name

    public val price: Long
        get() = info.price

    public val bps: Double
        get() = info.bps

    // Whether to display this product in the store. Once visible, it
    // will always be visible.
    private var visible: Boolean = false

    // TODO: Add several levels of visibility
    // e.g. show shadowed item first, then full item once it is affordable
    public fun isVisible(game: Game): Boolean {
        // Once visible, always visible
        if (!visible) {
            visible = info.requirements?.isSatisfied(game) ?: true
        }
        return visible
    }
}

class ProductInfos() {
    public var products: ArrayList<ProductInfo>? = null
}