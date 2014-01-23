package oop

import spock.lang.Specification

class DogSpec extends Specification {

    def 'Checking the clojure implementation of a dog'() {
        given: 'A dog'
            def chuck = new Dog()
        expect:
            chuck.type
    }

}
