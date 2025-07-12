BEGIN
    FOR res IN (
        SELECT c.name, c.CUSTOMERID, l.LOANID, l.ENDDATE
        FROM LOANS l
        JOIN CUSTOMERS c ON l.CUSTOMERID = c.CUSTOMERID
        WHERE l.ENDDATE BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('----------------------------------------');
        DBMS_OUTPUT.PUT_LINE('Customer ID : ' || res.CUSTOMERID);
        DBMS_OUTPUT.PUT_LINE('Name        : ' || res.name);
        DBMS_OUTPUT.PUT_LINE('Loan ID     : ' || res.LOANID);
        DBMS_OUTPUT.PUT_LINE('Due Date    : ' || TO_CHAR(res.ENDDATE, 'DD-Mon-YYYY'));
        DBMS_OUTPUT.PUT_LINE('Status      : Loan due within 30 days');
        DBMS_OUTPUT.PUT_LINE('----------------------------------------');
    END LOOP;

    COMMIT;
END;
/