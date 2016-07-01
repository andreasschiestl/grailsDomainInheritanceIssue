package at.byte_code.businessSuite.customer

class Address {

    String streetName

    String streetNumber

    String postalCode

    String city

    static belongsTo = [customer: Customer]

    static constraints = {
    }

    static mapping = {
        table ("bs_customer_address")
    }

    String toString() {
        return "${streetName} ${streetNumber}, ${postalCode} ${city}"
    }
}
