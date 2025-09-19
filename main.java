// 1. Definimos la interfaz
interface Figura {
    double calcularArea();
}

// 2. Implementamos las figuras
class Circulo implements Figura {
    double radio;
    Circulo(double radio) { this.radio = radio; }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo implements Figura {
    double ancho, alto;
    Rectangulo(double ancho, double alto) {
        this.ancho = ancho; this.alto = alto;
    }
    public double calcularArea() {
        return ancho * alto;
    }
}

// 3. Calculadora que usa polimorfismo
class CalculadoraArea {
    public double calcular(Figura figura) {
        return figura.calcularArea();
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraArea calculadora = new CalculadoraArea();

        Figura c = new Circulo(5);
        Figura r = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + calculadora.calcular(c));
        System.out.println("Área del rectángulo: " + calculadora.calcular(r));

        // Si quiero agregar un triángulo:
        Figura t = new Triangulo(3, 4);
        System.out.println("Área del triángulo: " + calculadora.calcular(t));
    }
}

// Nueva figura sin tocar CalculadoraArea
class Triangulo implements Figura {
    double base, altura;
    Triangulo(double base, double altura) {
        this.base = base; this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
