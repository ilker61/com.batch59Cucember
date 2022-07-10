Feature: US09 Datatables sitesine 5 farkli giris yapalim

 @datatable
  Scenario Outline: TC13 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" ana sayfasinda
    Then new butonuna basar
   And kullanici 1 saniye bekler
    And firstname bolumune "<firstname>" yazar
   And kullanici 1 saniye bekler
   And lastname bolumune "<lastname>" yazar
   And kullanici 1 saniye bekler
   And position bolumune "<position>" yazar
   And kullanici 1 saniye bekler
   And office bolumune "<office>" yazar
   And kullanici 1 saniye bekler
   And extencion bolumune "<extencion>" yazar
   And kullanici 1 saniye bekler
   And startDate bolumune "<startDate>" yazar
   And kullanici 1 saniye bekler
   And salary bolumune "<salary>" yazar
   And kullanici 1 saniye bekler
    And Create tusuna basar
   And kullanici 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
   And kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" olustugunu kontrol eder
  And sayfayi kapatir

Examples:
    |firstname|lastname|position|office|extencion|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-5-5  |11000|
    |Huseyin  |Sahin   |PO      |berlin|-        |2022-03-12|40000|
    |Fatih    |Kacmaz  |BA      |berlin|-        |2022-07-10|45000|
    |Ahmet    |Kaya    |Tester  |bursa |database  |2022-06-09|11000|
