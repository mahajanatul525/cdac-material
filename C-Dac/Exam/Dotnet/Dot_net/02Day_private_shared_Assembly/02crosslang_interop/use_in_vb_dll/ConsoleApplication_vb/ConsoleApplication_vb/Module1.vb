Imports sumlib
Module Module1

    Sub Main()
        Dim obj As New sumlib.Class1
        Dim r As Integer
        r = obj.sub(10, 5)
        Console.WriteLine(r)
        Console.ReadLine()
        r = obj.sum(10, 5)
        Console.WriteLine(r)
        Console.ReadLine()
    End Sub

End Module
