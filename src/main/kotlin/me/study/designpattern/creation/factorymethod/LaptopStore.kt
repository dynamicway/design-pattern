package me.study.designpattern.creation.factorymethod

class LaptopStore : Store() {

    private val notebooks = ArrayDeque<Laptop>()

    override fun prepareOrder() {
        if (notebooks.isEmpty())
            notebooks.add(getProduct())
    }

    override fun getOwner() = "Notebook owner"

    override fun getProduct() = Laptop()

}
