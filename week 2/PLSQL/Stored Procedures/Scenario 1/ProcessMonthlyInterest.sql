CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
     UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
     WHERE AccountType = 'Savings';
     COMMIT;
END;
/
BEGIN
    ProcessMonthlyInterest;
END;
/

-- Before

-- ACCOUNTID CUSTOMERID ACCOUNTTYPE BALANCE  LASTMODIFIED              
-- --------- ---------- ----------- -------- ------------------------- 
-- 1         1          Savings     2545.301 06/28/2025, 11:14:36 PM   
-- 2         2          Checking    0        06/27/2025, 01:28:39 PM   

-- After

-- ACCOUNTID CUSTOMERID ACCOUNTTYPE BALANCE    LASTMODIFIED              
-- --------- ---------- ----------- ---------- ------------------------- 
-- 1         1          Savings     2570.75401 06/28/2025, 11:18:59 PM   
-- 2         2          Checking    0          06/27/2025, 01:28:39 PM   





