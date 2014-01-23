package oop

import spock.lang.Specification

class LocalVetSpec extends Specification {

    def 'Checking local vet at work'() {
        given: 'An animal'
            def babe = new Pig()
        and: 'Its Vet'
            def johnTheVet = new LocalVet(name: 'john')
        expect: 'The pig to be healthy'
            johnTheVet.checkAnimal(babe) == 'not-so-good'
            johnTheVet.alternativeChecking(babe) == 'SMALL23'
    }

}
