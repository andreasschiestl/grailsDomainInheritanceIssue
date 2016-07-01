import at.byte_code.businessSuite.customer.Address
import at.byte_code.businessSuite.customer.BusinessCustomer
import at.byte_code.businessSuite.customer.PrivateCustomer

class BootStrap {

    def init = { servletContext ->
        PrivateCustomer privateCustomer = PrivateCustomer.findByFirstNameAndLastName("Andreas", "Schiestl")
        if (!privateCustomer) {
            privateCustomer = new PrivateCustomer(firstName: "Andreas", lastName: "Schiestl")

            Address address = new Address(streetName: "Sesamstraße", streetNumber: "12", postalCode: "1010", city: "Wien")
            privateCustomer.addToAddresses(address)

            privateCustomer.save(flush: true)
        }

        BusinessCustomer businessCustomer = BusinessCustomer.findByName("byte-code.at IT-Dienstleistungen")
        if (!businessCustomer) {
            businessCustomer = new BusinessCustomer(name: "byte-code.at IT-Dienstleistungen")

            Address address = new Address(streetName: "Kümmelstraße", streetNumber: "21", postalCode: "1020", city: "Wien")
            businessCustomer.addToAddresses(address)

            businessCustomer.save(flush: true)
        }
    }

    def destroy = {
    }
}
