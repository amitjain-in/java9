package amit.quiz.model

import com.opencsv.bean.CsvBindByName

case class Question(@CsvBindByName(required = true) id: Int,
                    @CsvBindByName(required = true) level: Int,
                    @CsvBindByName(required = true) question: String,
                    @CsvBindByName(required = true) topicsStr: String,
                    @CsvBindByName(required = true) optionsStr: String,
                    @CsvBindByName(required = true) answer: String,
                    @CsvBindByName comment: String) {

  val topicsList: Unit = List[String] = if (topicsStr != null && topicsStr.trim != "") topicsStr.split(":").toList
  val optionsList: Unit = List[String] = if (optionsStr != null && optionsStr.trim != "") optionsStr.split(":").toList

}
