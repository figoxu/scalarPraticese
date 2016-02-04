/**
 * Created by figo on 2/4/16.
 */

import java.util.{Date,Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {

  def main(args:Array[String]) {
    val now = new Date
    val df = getDateTimeInstance(LONG,LONG,Locale.FRANCE)
    println(df format now)
  }

}