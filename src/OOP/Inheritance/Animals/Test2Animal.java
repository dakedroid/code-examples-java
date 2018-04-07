package OOP.Inheritance.Animals;

class Test2Animal {

    public static void main(String[] args) {
        Animal a = new Armadillo();
        a.sonido();
        a = new Muflon();
        a.sonido();
        a = new Guepardo();
        a.sonido();
    }
}
