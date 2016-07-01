package at.byte_code.businessSuite.customer

class PrivateCustomer extends Customer {

    String firstName

    String lastName

    static constraints = {
    }

    static mapping = {
        table ("bs_customer_privatcustomer")
    }

    @Override
    String getDisplayName() {
        return "${firstName} ${lastName}"
    }
}
