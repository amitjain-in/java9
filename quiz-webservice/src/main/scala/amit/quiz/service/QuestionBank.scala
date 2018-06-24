package amit.quiz.service

import amit.quiz.model.Question

trait QuestionBank {
    def findByCriteria(questionCriteria: QuestionCriteria): List[Question]
    def loadAll()
    def reloadAll()
    def addNew(question: Question)
}
