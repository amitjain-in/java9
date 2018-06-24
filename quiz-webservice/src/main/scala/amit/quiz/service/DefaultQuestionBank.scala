package amit.quiz.service

import amit.quiz.model.Question

class DefaultQuestionBank extends QuestionBank {

    override def findByCriteria(questionCriteria: QuestionCriteria): List[Question] = {
        //TODO
        null
    }

    override def loadAll(): (Boolean, Throwable) = {
        //TODO implement
        (false, null)
    }

    override def reloadAll(): (Boolean, Throwable) = {
        //TODO implement
        (false, null)
    }

    override def addNew(question: Question): Boolean = {
        false
    }
}
