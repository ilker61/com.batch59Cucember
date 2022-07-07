@tumu
Feature: US01 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici ana sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini kontrol eder
    And sayfayi kapatir

  @java
  Scenario: TC02 kullanici amazonda Java arattirir
    Given kullanici ana sayfasinda
    Then kullanici Java icin arama yapar
    And  sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @iphone
  Scenario: TC03 kullanici iphone aratir
    When kullanici ana sayfasinda
    And kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
