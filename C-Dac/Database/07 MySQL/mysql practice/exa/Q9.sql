/*
9.	Create a stored function by the name of Age_calc. Your stored function should accept the date of birth of a person as a parameter. The stored function should calculate the age of the person in years, months and days e.g. 35 years, 3 months, 17 days. The stored function should return the age in years directly (with the help of Return statement). The months and days are to be returned in the form of OUT parameters. Write a mysql program to accept the date of birth of an employee from the user, call the stored function, and display the age of the employee on the screen. Display the above results on the screen.
*/
DROP PROCEDURE AGE_CALC$$

CREATE PROCEDURE Age_calc(STR VARCHAR(20), OUT OUTYY INT, OUT OUTMM INT, OUT OUTDD INT)
BEGIN
	DECLARE DOBYY INT;
	DECLARE DOBMM INT;
	DECLARE DOBDD INT;
	DECLARE NOWYY INT;
	DECLARE NOWMM INT;
	DECLARE NOWDD INT;
	DECLARE DOB DATE;
	DECLARE TODAY DATE;
	
	SET TODAY:=CURDATE();
	
	SET DOB:=STR_TO_DATE(STR,'%d-%m-%Y');
	
	
	SET DOBDD:=DAY(DOB);
	SET DOBMM:=MONTH(DOB);
	SET DOBYY:=YEAR(DOB);
	
	SET NOWDD:=DAY(TODAY);
	SET NOWMM:=MONTH(TODAY);
	SET NOWYY:=YEAR(TODAY);
	
	SET OUTDD:=NOWDD-DOBDD;
	SET OUTMM:=NOWMM-DOBMM;
	SET OUTYY:=NOWYY-DOBYY;
	
	IF (OUTMM<0) THEN
		SET OUTYY:=OUTYY-1;
		SET OUTMM:=OUTMM+12;
	END IF;
	
	IF (OUTDD<0) THEN
		SET OUTMM:=OUTMM-1;
		SET OUTDD:=OUTDD+30;
	END IF;	
END
$$


CALL AGE_CALC('24-2-1994',@Y,@M,@D)$$
SELECT @Y,@M,@D$$
#CURDATE() : TODYAS DATE
