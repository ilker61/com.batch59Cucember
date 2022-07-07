Feature: US08 kullanici farkli yanlis sifre ve kullanici adi ile giris yapamaz

  Scenario Outline: TC13 yanlis sifre ve kullanici adi ile giris yapamaz

    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
    |username|password|
    |Manager5!|Manager5!|
    |Manager6!|Manager6!|
    |Manager7!|Manager7!|
    |Manager8!|Manager8!|
    |Manager9!|Manager9!|