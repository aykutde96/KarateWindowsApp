Feature: windows calculator

  Scenario: Demo
    * robot {}
    * karate.fork('C:\\Windows\\system32\\notepad.exe')
    * input('Metin Düzenleyici', 'Karate Cop Toplantısına Hoşgeldiniz.')
    #* click('Dosya')
    * input(Key.CONTROL + 's')
    * retry(10).window('Farklı Kaydet')
    * input('#1001','deneme3')
    * click('Kaydet')
   # * def myFun = call read('mailSender') '"C:\Users\testinium\Desktop\deneme3.txt"'
   # * print myFun



