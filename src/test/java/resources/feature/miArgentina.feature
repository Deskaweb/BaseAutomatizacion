Feature: Ingresar a la Web MI ARGENTINA

  Scenario Outline: Ingresar a la Web MI ARGENTINA
    Given se ingresa a la web Mi Argentina
    When se ingresa con el usuario "<User>" y la "<Pass>"
    Then se verifica menu princial
    When se ingresa al menu "<Menu>"

    Examples:
    |User        |Pass       |Menus      |
    |20387030019 |Pda@1305   |Billetera  |
    |20375568897 |37556889Ga |Salud      |

