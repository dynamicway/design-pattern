package me.study.designpattern.creation.factorymethod

class CellPhoneStore: Store() {
    override fun prepareOrder() {}

    override fun getOwner() = "Cell phone store owner"

    override fun getProduct() = CellPhone()
}
