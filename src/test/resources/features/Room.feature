Feature: Test Api

  @RoomGet
  Scenario: Roomlar icin get Api testi / Rooms Api with GET request

    Given Kullanici roomlar icin get request yapar
    And Kullanici gelen room datayi deserialise eder
    Then Kullanici room datasini validate eder


