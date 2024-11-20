package Examen
import Examen.ejercicio1._
import utils.TestInit

class ejercicio1Test extends TestInit {
  import spark.implicits._

  "filterAndOrder" should "mostrar esquema en consola" in {
    val estudiantes = Seq(
      ("Rigoberto", 20, 8.5),
      ("Andrés", 17, 8.0),
      ("Pancracio", 17, 9.0),
      ("Antuán", 17, 9.0),
      ("Rogelio", 17, 9.0),
      ("Eustaquio", 17, 9.0),
      ("María", 17, 6.0),
      ("Carlos", 22, 7.0)
    ).toDF("nombre", "edad", "nota")


    filterAndOrder(estudiantes,8).show
  }
}
