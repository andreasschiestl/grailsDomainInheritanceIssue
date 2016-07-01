package at.byte_code.businessSuite.customer

class BusinessCustomer extends Customer {

    String name

    static constraints = {
    }

    static mapping = {
        table ("bs_customer_businesscustomer")
    }

    @Override
    String getDisplayName() {
        return name
    }
}
