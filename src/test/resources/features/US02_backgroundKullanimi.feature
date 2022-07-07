@calisLo
Feature: US02 Kullanici Ortak Adimlari Background ile Calistirir

  Background: Ortak Adim
    Given kullanici ana sayfasinda

  Scenario: TC04 amazon nutella arama
    And kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini kontrol eder
    And sayfayi kapatir

  Scenario: TC05 amazon java arama
    And kullanici Java icin arama yapar
    Then sonuclarin Java icerdigini test eder
    And sayfayi kapatir