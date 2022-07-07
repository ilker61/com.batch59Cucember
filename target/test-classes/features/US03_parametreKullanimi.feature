
Feature: US03 kullanici parametre kullanarak arama yapabilmeli


  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici ana sayfasinda
    And kullanici "Nutella" icin arama yapar
    And sonuclarin "Nutella" icerdigini kontrol eder
    Then sayfayi kapatir

