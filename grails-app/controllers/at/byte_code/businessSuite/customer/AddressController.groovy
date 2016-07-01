package at.byte_code.businessSuite.customer

import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.NO_CONTENT

@Transactional(readOnly = true)
class AddressController {

    def edit(Address address) {
        println "insert breakpoint here"
        println address.customer.displayName

        render(status: NO_CONTENT)
    }
}
