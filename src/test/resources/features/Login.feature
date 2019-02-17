Feature: Valid Login

  Login to the site with user and valid passwords, validated by captha.

  Scenario Outline: Login

    Given I am in the site http://showroom-painelfornecedor.finnet.com.br
    When  I click on "Acesso ao Cliente"
    And  i fill "<usuario>" and password "<senha>"
    And validate the captcha
#    //And click em "OK" button
#    //Then login must be successful
#    //And I should be directed to main page

    Examples:
      | usuario           | senha        |
      | candidato2.master | candidato2@  |


