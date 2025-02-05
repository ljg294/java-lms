# 학습 관리 시스템(Learning Management System)
## 진행 방법
* 학습 관리 시스템의 수강신청 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

step1
* refactor/delete-question
  * refactored QnAService deleteQuestion
    * refactored Question, Answer
    * used first-class collection
    * generated unit TestCodes
  * modified gradle.properties enable ./gradlew clean build 
    * add gradle option to enable access to unnamed module

step2
* refactor/feedback-step1
  * refactored codes based on feedback from step 1
* feature/session
  * implement domain model of session
    * test codes are also implemented
* feature/session-service
  * implement session service
    * test codes are also implemented
* refactor/feedback
  * refactored codes based on feedback