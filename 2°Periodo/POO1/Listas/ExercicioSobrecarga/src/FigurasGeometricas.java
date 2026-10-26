public class FigurasGeometricas {
    private double lado, base, altura, xc, yc, raio;

    public FigurasGeometricas(double lado) {
        this.lado = lado;
    }

    public FigurasGeometricas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas(double xc, double yc, double raio) {
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
    } 
    public double areaQuadrado() {
        return lado * lado;
    }
    public double areaTriangulo() {
        return (base * altura) / 2;
    }
    public double areaCirculo() {
        return Math.PI * raio * raio;
    }
    public String exibeQuadrado() {
        return "Quadrado [Lado: " + lado + "]";
    }

    public String exibeTriangulo() {
        return "Triângulo [Base: " + base + ", Altura: " + altura + "]";
    }

    public String exibeCirculo() {
        return "Círculo [Centro: (" + xc + ", " + yc + "), Raio: " + raio + "]";
    }
}
