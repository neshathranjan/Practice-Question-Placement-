# 📘 SQL Reference Notes

## Database Operations

### Create Database

```sql
CREATE DATABASE college;
```

Creates a new database named `college`.

### Use Database

```sql
USE college;
```

Selects `college` as the active database.

---

## Table Operations

### Create Table

```sql
CREATE TABLE teacher_db(
employeeID INT PRIMARY KEY,
name VARCHAR(20),
department VARCHAR(10),
age INT
);
```

Creates a table with primary key and employee details.

### Rename Table

```sql
RENAME TABLE teacher_db TO employeedetails;
```

Changes the table name.

### Add Column

```sql
ALTER TABLE employeedetails ADD salary INT;
```

Adds a new column `salary` to the table.

### Drop Column

```sql
ALTER TABLE courses DROP COLUMN Credits;
```

Deletes the `Credits` column from the `courses` table.

---

## Insert Data

### Insert Records

```sql
INSERT INTO employeedetails VALUES
(5,'xxx','IT',28,64500),
(6,'yyy','AIDS',50,55300);
```

Inserts multiple rows into the table.

---

## Data Retrieval (SELECT)

### Select All Records

```sql
SELECT * FROM employeedetails;
```

Fetches all rows and columns.

---

## Filtering with WHERE

### Greater Than / Less Than

```sql
SELECT * FROM teacher_db WHERE age > 24;
```

Filters records where age is greater than 24.

### Using AND

```sql
SELECT * FROM teacher_db WHERE age >= 24 AND department='IT';
```

Applies multiple conditions using AND.

### Using OR

```sql
SELECT * FROM teacher_db WHERE age <= 24 OR department='CSE';
```

Returns records matching at least one condition.

---

## Update Records

### Update Salary

```sql
UPDATE employeedetails SET salary = 60000 WHERE employeeID = 1;
```

Updates salary for a specific employee.

---

## Range and Set Conditions

### BETWEEN

```sql
SELECT * FROM employeedetails 
WHERE salary BETWEEN 40000 AND 60000;
```

Selects values within a specified range.

### IN

```sql
SELECT * FROM employeedetails 
WHERE department IN('IT','CSE','ECE');
```

Filters rows matching multiple values.

---

## Pattern Matching (LIKE)

### Starts With

```sql
SELECT * FROM employeedetails WHERE name LIKE 'N%';
```

Finds names starting with `N`.

### Ends With

```sql
SELECT * FROM employeedetails WHERE name LIKE '%R';
```

Finds names ending with `R`.

### Contains

```sql
SELECT * FROM employeedetails WHERE name LIKE '%esh%';
```

Finds names containing `esh`.

---

## Sorting (ORDER BY)

### Ascending Order

```sql
SELECT * FROM employeedetails ORDER BY name;
```

Sorts records alphabetically by name.

### Descending Order

```sql
SELECT * FROM employeedetails ORDER BY department DESC;
```

Sorts records in descending order.

### Sort by Salary

```sql
SELECT department, salary 
FROM employeedetails 
ORDER BY salary ASC;
```

Sorts salaries in ascending order.

---

## Subqueries

### Above Average Salary

```sql
SELECT name, salary 
FROM employeedetails 
WHERE salary > (
    SELECT AVG(salary) FROM employeedetails
);
```

Finds employees earning more than average salary.

---

## Aggregate Functions

### Count Rows

```sql
SELECT COUNT(*) FROM employeedetails;
```

Returns total number of records.

### Count by Column

```sql
SELECT COUNT(department) FROM employeedetails;
```

Counts non-null department values.

### Sum

```sql
SELECT SUM(salary) FROM employeedetails;
```

Calculates total salary.

### Average

```sql
SELECT AVG(age) FROM employeedetails;
```

Calculates average age.

### Maximum

```sql
SELECT MAX(salary) FROM employeedetails;
```

Finds highest salary.

### Minimum

```sql
SELECT MIN(salary) FROM employeedetails;
```

Finds lowest salary.

---

## Grouping and Having

### Group By Department

```sql
SELECT department, COUNT(*) 
FROM employeedetails 
GROUP BY department;
```

Groups employees by department.

### Group With Condition

```sql
SELECT department, COUNT(*) AS emp_count 
FROM employeedetails 
GROUP BY department 
HAVING COUNT(*) > 1;
```

Filters grouped data using HAVING.

---
# 🔗 SQL Joins

## Inner Join

```sql
SELECT students.FirstName, students.lastname, courses.CourseID, courses.coursename
FROM students
INNER JOIN courses
ON students.courseid = courses.courseid;
```

Returns only records that have matching values in both tables.

## Left Join

```sql
SELECT students.firstname, students.courseid, courses.coursename
FROM students
LEFT JOIN courses
ON students.courseid = courses.courseid;
```

Returns all records from the left table and matching records from the right table.

## Right Join

```sql
SELECT students.firstname, students.courseid, courses.coursename
FROM students
RIGHT JOIN courses
ON students.courseid = courses.courseid;
```

Returns all records from the right table and matching records from the left table.

---

# 💳 Database Transactions (Bank System)

## Create Database

```sql
CREATE DATABASE bank;
```

Creates a new database named `bank`.

## Use Database

```sql
USE bank;
```

Selects `bank` as the active database.

---

## Account Table

## Transaction Control (TCL)

### Commit

```sql
COMMIT;
```

Permanently saves all changes made in the transaction.

### Start Transaction

```sql
START TRANSACTION;
```

Begins a new transaction block.

### Rollback

```sql
ROLLBACK;
```

Reverts all changes made after the last commit.

---

```
START TRANSACTION
UPDATE
ROLLBACK / COMMIT
```
---
