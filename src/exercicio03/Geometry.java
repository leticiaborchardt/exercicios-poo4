package exercicio03;

/**
 * 3. Crie uma classe Geometry com métodos estáticos para operações de cálculo de área de:
 * quadrado, retangulo, triangulo, circulo, cubo, paralelepipedo, trapézio e esfera.
 * Cada método deve retornar o resultado da operação correspondente.
 */
public class Geometry {
    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double width, double length) {
        return width * length;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double circleArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double cubeArea(double side) {
        return 6 * (side * side);
    }

    public static double parallelepipedArea(double length, double width, double height) {
        return 2 * (length * width + width * height + height * length);
    }

    public static double trapezoidArea(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }

    public static double sphereArea(double radius) {
        return 4 * Math.PI * (radius * radius);
    }
}
