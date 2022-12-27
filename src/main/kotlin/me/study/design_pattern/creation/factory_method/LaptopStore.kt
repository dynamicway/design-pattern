package me.study.design_pattern.creation.factory_method

class LaptopStore : Store() {

    private var salesRate = 0

    override fun prepareOrder() {
        salesRate++
    }

    override fun getOwner() = "Notebook owner"

    override fun getProduct() = Laptop()

}
