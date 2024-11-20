package Examen
import ejercicio3._
import utils.TestInit

class ejercicio3Test extends TestInit {
  import spark.implicits._

  "Unir2DF" should "unir dos dataframes" in {
    val estudiantes = Seq(
      (1,"Carlos"),
      (2,"Juan"),
      (3,"Marcos"),
      (4,"Julia"),
      (5,"Marta")
    ).toDF("id","nombre")

    val calificaciones = Seq(
      (1,"Matemáticas", 8.0),
      (1,"Física", 6.0),
      (1,"Inglés", 9.0),
      (2,"Matemáticas",7.0),
      (2,"Física", 6.0),
      (2,"Inglés", 4.0),
      (3,"Matemáticas",3.0 ),
      (3,"Física", 9.0),
      (3,"Inglés", 5.0),
      (4,"Matemáticas",4.0),
      (4,"Física", 6.0),
      (4,"Inglés", 8.0),
      (5,"Matemáticas",3.0),
      (5,"Física", 2.0),
      (5,"Inglés", 10.0)
    ).toDF("id","Asignatura","nota")

      unir2DF(estudiantes,calificaciones).show
      promedio(estudiantes, calificaciones).show

  }
}