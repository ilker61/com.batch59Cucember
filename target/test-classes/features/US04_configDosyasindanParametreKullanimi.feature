Feature: US04 Kullanici parametre ile configuration file yi kullanabilmeli


  Scenario: TC07 Configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" ana sayfasinda
    Then kullanici 3 saniye bekler
    And url'nin "amazon" icerdigini test eder
    Then sayfayi kapatir