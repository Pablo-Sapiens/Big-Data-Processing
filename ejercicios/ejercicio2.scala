package Examen

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._


object ejercicio2 {
  def parImpar(numeros: DataFrame): DataFrame = {
    numeros.withColumn(
      "par-Impar",
      when(col("numero") % 2 === 0, "Par").otherwise("Impar")
    )

  }

}
