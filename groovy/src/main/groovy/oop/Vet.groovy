package oop

class Vet {

    String name

    String checkAnimal(Animal animal) {
        def summary = """
            While $name was taking care of ${animal.type}
            it sounded like ${animal.sound} and he/she
            realized this ${animal.paws} paws animal health was ${animal.health}
        """

        println summary

        return animal.health
    }

    String checkAnimalArray(Animal...animals) {
        return animals.collect { animal -> checkAnimalArray(animal) }.join('\n')
    }

}
