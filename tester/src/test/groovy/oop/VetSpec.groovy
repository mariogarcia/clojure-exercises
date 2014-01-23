package oop

import spock.lang.Specification

class VetSpec extends Specification {

    def 'Checking Vet work'() {
        given: 'An animal'
            def babe = new Pig()
        and: 'Its Vet'
            def johnTheVet = new Vet(name: 'john')
        expect: 'The pig to be healthy'
            johnTheVet.checkAnimal(babe) == 'good'
    }

}
