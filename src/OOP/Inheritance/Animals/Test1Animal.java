package OOP.Inheritance.Animals;

class Test1Animal {

    public static void main(String[] args) {
        adoptaAnimal(new Guepardo());
        Animal o = new Guepardo();
        o.sonido();
    }

    private static void adoptaAnimal(Animal a) {
        System.out.println("Ven, cachorrito!");
    }
}
