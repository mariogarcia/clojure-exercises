(ns oop
  (:require [oopstrange :as strange]))

(gen-class
  :name "oop.Dog"
  :prefix "dog-"
  :extends oop.Animal)

(defn dog-getSound [this]
  (str "guau"))

(defn dog-getType[this]
  (str "dog"))

(gen-class
  :name "oop.LocalVet"
  :prefix "vet-"
  :methods [
      [alternativeChecking [oop.Animal] String]
  ]
  :extends oop.Vet)

(defn vet-checkAnimal
  "The vet will the animal passed as argument"
  [this animal]
  (str "not-so-good"))

(defn vet-alternativeChecking [this animal]
  (let [hilario (strange/strangeVet)]
    (.checkAnimal hilario animal)))

(gen-class
  :name "oop.Hospital"
  :methods [
    [healAnimal [oop.Animal oop.Vet] String]
    [healAnimalsByStrangeVet [] String]
  ]
  :prefix "hos-")

(defn hos-healAnimal [this animal vet]
  (.checkAnimal vet animal))

(defn hos-healAnimalsByStrangeVet [this]
  (let [scooby (oop.Dog. "Doggy")
        hilario (strange/strangeVet)]
    (.checkAnimal hilario scooby)))

