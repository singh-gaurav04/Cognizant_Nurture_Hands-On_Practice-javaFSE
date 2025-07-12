BEGIN
    FOR res IN (
        SELECT customerID, balance FROM CUSTOMERS
        WHERE balance > 10000
    ) LOOP
        UPDATE CUSTOMERS
        SET isvip = 'Y'
        WHERE customerID = res.customerID;
    END LOOP;

    COMMIT;
END;
/

-- BEFORE
-- CUSTOMERID NAME                DOB                       BALANCE LASTMODIFIED              IS_VIP 
-- ---------- ------------------- ------------------------- ------- ------------------------- ------ 
-- 1          John Doe            05/15/1985, 05:30:00 AM   1000     06/29/2025, 12:05:05 PM   N      
-- 2          Jane Smith          07/20/1990, 05:30:00 AM   1500     06/29/2025, 12:05:05 PM   N      
-- 3          Gaurav Singh        10/07/2004, 05:30:00 AM   150000   06/29/2025, 10:49:15 PM   N      

-- AFTER 
-- CUSTOMERID NAME                DOB                       BALANCE LASTMODIFIED              IS_VIP 
-- ---------- ------------------- ------------------------- ------- ------------------------- ------ 
-- 1          John Doe            05/15/1985, 05:30:00 AM   1000    06/29/2025, 12:05:05 PM   N      
-- 2          Jane Smith          07/20/1990, 05:30:00 AM   1500    06/29/2025, 12:05:05 PM   N      
-- 3          Gaurav Singh   05/05/2000, 05:30:00 AM   15000   06/29/2025, 10:49:15 PM   Y      
