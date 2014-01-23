(ns oopstrange)

(defn strangeVet[]
  (proxy [oop.Vet] []
    (checkAnimal [animal]
      (str "SMALL23"))))
