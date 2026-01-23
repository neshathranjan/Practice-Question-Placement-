# SQL Student Database – README

## Database Creation

* `CREATE DATABASE college;`
  Creates a new database named **college**.

* `USE college;`
  Switches the active database to **college**.

## Table Creation

* `CREATE TABLE Student (...);`
  Creates a **Student** table with constraints like primary key, NOT NULL, and age check.

## Data Retrieval

* `SELECT * FROM student;`
  Retrieves all records from the **student** table.

## Data Insertion

* `INSERT INTO student(...) VALUES (...);`
  Inserts a student record into the **student** table.

* `INSERT INTO student(...) VALUES (...);`
  Inserts another student record.

* `INSERT INTO student(...) VALUES (...);`
  Inserts another student record.

## Conditional Query

* `SELECT * FROM student WHERE age=19;`
  Fetches students whose age is **19**.

* `SELECT * FROM student;`
  Displays all student records again.

## Table Modification

* `ALTER TABLE student ADD gender VARCHAR(1);`
  Adds a **gender** column to the student table.

## Data Update

* `UPDATE student SET gender='M' WHERE reg_no=67;`
  Updates gender for student with registration number **67**.

* `UPDATE student SET gender='M' WHERE reg_no=76;`
  Updates gender for student with registration number **76**.

* `UPDATE student SET gender='M' WHERE reg_no=101;`
  Updates gender for student with registration number **101**.

* `UPDATE student SET gender='M' WHERE reg_no=102;`
  Updates gender for student with registration number **102**.

## Additional Insertions

* `INSERT INTO student (...) VALUES (...);`
  Inserts a new student with gender specified.

* `INSERT INTO student (...) VALUES (...);`
  Inserts another student record with gender.

* `INSERT INTO student (...) VALUES (...);`
  Inserts another student record with gender.

## Table Rename

* `RENAME TABLE student TO student_db;`
  Renames the **student** table to **student_db**.

---
