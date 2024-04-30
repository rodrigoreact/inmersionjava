import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo Welcome!");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean includoEnPlanBasico = true;
        String nombre = "Matrix";
        double mediaEvaluacionusuario = 0;
        String sinopsis = """
                La mejor pelicula de fin de milenio
                """;

        System.out.println("Película:" + nombre);
        System.out.println("Fecha de lanzamiento:" + fechaDeLanzamiento);
        System.out.println("Evaluación:" + evaluacion);
        System.out.println("En Plan Básico:" + includoEnPlanBasico);

        double mediaEvaluacion = (4.5+4.8+3)/3;
        System.out.println("Media:" + mediaEvaluacion);

        if (fechaDeLanzamiento>2023) {
            System.out.println("Pelicula popular en el momento.");
        } else {
            System.out.println("Pelicula retro que vale la pena ver.");
        }


        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionusuario = (mediaEvaluacionusuario + notaMatrix);
        }
        System.out.println("La media de Matrix por usuario:"+mediaEvaluacion/3);
    }
}