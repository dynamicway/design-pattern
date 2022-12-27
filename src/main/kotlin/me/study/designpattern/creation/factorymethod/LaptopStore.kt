package me.study.designpattern.creation.factorymethod

class LaptopStore : Store() {

    private var salesRate = 0

    override fun prepareOrder() {
        salesRate++
    }

    override fun getOwner() = "Notebook owner"

    override fun getProduct() = Laptop()

}
