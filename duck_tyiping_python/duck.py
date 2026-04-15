class Perro:
    def saludar(self):
        print("woof")
    
    def despedirse(self):
        print("woof woof")

class Gato:
    def saludar(self):
        print("miau")

    def despedirse(self):
        print("miau miau")

class Persona:
    def saludar(self):
        print("Hola")    
    def despedirse(self):
        print("Adios")

def interactuarAnimal(a):
    a.saludar()
    a.despedirse()

# Hicimos duck typing y todas las clases tienen los mismos metodos

def main():
    a = Persona()
    interactuarAnimal(a)
    interactuarAnimal(Perro())

if __name__ == "__main__":
    main()