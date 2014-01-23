package oop

import spock.lang.Specification

class HospitalSpec extends Specification {

    def 'Strange vet checks animals'() {
        given: 'A hospital'
            def hospital = new Hospital()
        expect:
            hospital.healAnimalsByStrangeVet() == 'SMALL23'
    }

}
