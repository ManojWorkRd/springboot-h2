
springboot-h2-database

for storing database
http://localhost:8080/employees

post
{
    "department": "postal",
    "id": 1,
    "name": "manoj",
    "salary": 100.0
}

Get all employees
http://localhost:8080/employees
[
  {
    "department": "postal",
    "id": 1,
    "name": "manoj",
    "salary": 100
  }
]

Get with Id

http://localhost:8080/employees/1

{
  "department": "postal",
  "id": 1,
  "name": "manoj",
  "salary": 100
}
