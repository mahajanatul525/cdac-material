USE [Sample]
GO

DECLARE	@return_value Int

EXEC	@return_value = [dbo].[store]
		@e_id = NULL,
		@e_nm = Null,
		@e_sal = NULL,
		@e_dept = NULL

SELECT	'Return Value' = @return_value

GO
