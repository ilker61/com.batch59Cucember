# hotel my camp sitesinde 3 adet negative test senaryosu olustur eyleyelim
# 1- dogru username yanlis password
# 2- yanlis username   dogru password
# 3- yanlis username yanlis password

Feature:US06 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz

    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir


  Scenario:  TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir


   Scenario: TC11 yanlis username ve yanlis password ile giris yapilamaz
     Given kullanici "HMCUrl" ana sayfasinda
     Then Log in yazisina tiklar
     And gecersiz username girer
     And gecersiz password girer
     And Login butonuna basar
     Then sayfaya giris yapilamadigini kontrol eder
     And sayfayi kapatir