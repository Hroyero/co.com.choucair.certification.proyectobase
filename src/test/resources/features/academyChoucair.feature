# Autor: Hollmans Royero
@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screenplay at the Choucair academy with the automation course

  Scenario Outline: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
      | strUser      | strPassword       |
      | <strUser>    | <strPassword>     |
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called
      | strCourse    |
      | <strCourse>  |

    Examples:
      | strUser      | strPassword     |  strCourse                                             |
      | 11143456586  | Choucair2021*   |  Usted no tiene permiso para ver esta lista de cursos. |



