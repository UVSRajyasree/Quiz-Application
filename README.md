Quiz Application (Spring Boot + MySQL)
Overview:
This is a Quiz Application built using Spring Boot and MySQL.
It allows:
Creating and managing quiz questions.
Categorizing questions (e.g., Java, Python).
Adding, updating, and deleting questions.
Taking a quiz and submitting responses.
Calculating results with right answers.

Tech Stack:
Java 17+
Spring Boot (REST APIs)
Spring Data JPA (Hibernate)
MySQL (Database)
Postman (API Testing)

Features:
Add questions with multiple-choice options.
Fetch all questions or by category.
Update and delete questions by ID.
Create quizzes from a set of questions.
Submit quiz answers and calculate score.
Return right/wrong answers with result.

 Project Structure :
src/main/java/com/QuizApplication
│── Controller     # REST Controllers
│── Entity         # JPA Entities (Question, Quiz, Response)
│── Repository     # JPA Repositories
│── Service        # Business Logic

Database :
Table: question
Column	Type
id (PK)	INT
category	VARCHAR
question_title	VARCHAR
option1	VARCHAR
option2	VARCHAR
option3	VARCHAR
option4	VARCHAR
right_answer	VARCHAR
difficulty_level	VARCHAR

API Endpoints :
Question APIs
GET /questions/allQuestions → Fetch all questions
GET /questions/category/{category} → Fetch questions by category
POST /questions/addQuestion → Add a new question
PUT /questions/updateQuestion → Update an existing question
DELETE /questions/delete/{id} → Delete question by ID

Quiz APIs
POST /quiz/create → Create quiz with question IDs
POST /quiz/submit/{id} → Submit quiz and calculate result
