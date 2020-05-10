CREATE PROCEDURE store
       @e_id                     INT                      , 
       @e_nm                  VARCHAR(50)   , 
       @e_sal                    decimal                  
AS 
BEGIN 
          INSERT INTO dbo.tblemp
          ( Id                   ,            Name                     ,            Salary ) 
     VALUES          ( @e_id   ,  @e_nm     ,      @e_sal    )
		  End