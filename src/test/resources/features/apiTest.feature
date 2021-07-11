Feature: Users should be able check post codes

  @new
  # The user can check if these postcodes are correct
  Scenario Outline: The user can check the postcodes
    Given the user sets the base Url for postcode endpoint
    When the user calls GET request to check "<postcode>"
    Then the response status should be 200
    Examples:
      | postcode |
      | EN1 2RE  |
      | OX49 5NU |
      | M32 0JG  |
      | NE30 1DP |
      | AB8 1RA  |
      | DL8 1RA  |
      | AB42 3FB |
      | EC2M 2PF |
      | EX2M 2PF |
