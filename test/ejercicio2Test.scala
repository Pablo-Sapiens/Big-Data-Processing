package Examen
import Examen.ejercicio2._
import utils.TestInit

class ejercicio2Test extends TestInit {
  import spark.implicits._

  "parImpar" should "decir si un nùmero es par o impar añadiendo columna al DF" in {
   val listaNumeros = Seq(0,3,4,5,6,7,8,9,10).toDF("numero")
   parImpar(listaNumeros).show()

  }
}


