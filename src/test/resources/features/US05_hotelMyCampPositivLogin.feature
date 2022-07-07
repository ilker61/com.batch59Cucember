Feature: US05 Dogru kullanici adi ve sifre ile giris yapilabilmeli

  @hmc
  Scenario: TC positive login test

    Given kullanici "HMCUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir


