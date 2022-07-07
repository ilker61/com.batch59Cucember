# amazon sayfasina gidip sirasiyla nutella , java elma, armut aratip
# sonuclarin   aranmasini istdetigimiz kelimeleri icerip icermedigini kontrol eyleyelim

  Feature: US07 kullanici amazonda istedigi kelimeleri aratir

    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanici "amazonUrl" ana sayfasinda
      And kullanici "<istenenKelime>" icin arama yapar
      And url'nin "<istenenKelimeKontrol>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella             |
      |java         |java                |
      |elma         |elma                |
      |armut        |armut               |
