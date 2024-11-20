package Examen

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object ejercicio4 {
  def ocurrencia(palabras: List[String])(implicit spark: SparkSession):RDD[(String,Int)] = {
    val rddPalabras = spark.sparkContext.parallelize(palabras)
      .map(palabra =>(palabra,1:Int))
      .reduceByKey(_+_)
    rddPalabras

  }

}
