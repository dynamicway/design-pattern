package me.study.design_pattern.creation.factory_method

class CellPhoneStore: Store() {
    override fun prepareOrder() {}

    override fun getOwner() = "Cell phone store owner"

    override fun getProduct() = CellPhone()
}
