package at.byte_code.businessSuite.customer

abstract class Customer {

    String info

    static hasMany = [
            addresses: Address,
    ]

    static constraints = {
        info (nullable: true)
    }

    static mapping = {
        tablePerHierarchy false
        table ("bs_customer_customer")

        info (type: "text")
    }

    static transients = ["displayName"]

    abstract String getDisplayName() //{
    //    return null
    //}

    @Override
    String toString() {
        return getDisplayName()
    }
}
