CREATE OR REPLACE PROCEDURE UPDATEEMPLOYEEBONUS (
    P_DEPARTMENT IN VARCHAR2,
    P_BONUSRATE IN NUMBER
) IS
BEGIN
    UPDATE EMPLOYEES
    SET
     SALARY = SALARY + ( SALARY * P_BONUSRATE )
    WHERE   
     DEPARTMENT = P_DEPARTMENT;
    COMMIT;
END;
/
BEGIN
    UPDATEEMPLOYEEBONUS('IT', 0.10);
END;
/
SELECT * FROM EMPLOYEES;


--Before
-- EMPLOYEEID NAME            POSITION    SALARY DEPARTMENT HIREDATE                  
-- ---------- --------------- ----------- ------ ---------- ------------------------- 
-- 1          Alice Johnson   Manager     77000  HR         06/15/2015, 05:30:00 AM   
-- 2          Bob Brown       Developer   60000  IT         03/20/2017, 05:30:00 AM   

--After
-- EMPLOYEEID NAME            POSITION    SALARY DEPARTMENT HIREDATE                  
-- ---------- --------------- ----------- ------ ---------- ------------------------- 
-- 1          Alice Johnson   Manager     77000  HR         06/15/2015, 05:30:00 AM   
-- 2          Bob Brown       Developer   66000  IT         03/20/2017, 05:30:00 AM   




