package Examen
import ejercicio5._
import utils.TestInit


class ejercicio5Test extends TestInit {

  "readCSV" should "carga el fichero csv" in {
    val pathCSV = "C:/Users/Pablo/OneDrive/Keepcoding/11. " +
      "Big Data processing/" +
      "Bootcamp/dbProcessing/src" +
      "/test/resources/examen/ventas.csv"
    val Df = readCSV(pathCSV)(spark)
    Df.show()
  }

  "ingresoTotal" should "calcular en ingreso total" in{
    val pathCSV = "C:/Users/Pablo/OneDrive/Keepcoding/11. " +
      "Big Data processing/" +
      "Bootcamp/dbProcessing/src" +
      "/test/resources/examen/ventas.csv"
    val Df = readCSV(pathCSV)(spark)
    ingresoTotal(Df).show()


  }

}