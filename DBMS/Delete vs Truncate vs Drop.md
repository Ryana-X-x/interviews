**Think of it as increasing severity**

- ==DELETE FROM table WHERE id=5== - removes specific rows, is a DML statement, can be rolled back(it's logged row-by-row) and triggers fire.
- ==TRUNCATE TABLE table== - removes all rows at once, much faster because it deallocates data pages rather than logging each row deletio; in most DMBSs it minimally logged and **often can't be rolled back**(depends on the DB - postgres actually rollback within a transaction, SQL Server does too, MySQL with InnoDB does not by default -- good nuance to mention).
- ==DROP TABLE table== - removes the table structure itself, including schema, indexes, constraints. Nothing's left to query

