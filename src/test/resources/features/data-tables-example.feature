Feature: Data Tables In Cucumber
  the data tables in cucumber allows you to pass as a parameter to a single step a more complex data structure
  There are multiple cases that we do not want to run our scenario with Outline multiple times
  Instead we need to pass a List or a Map at once to the Step
  This is done for:
  - Filling out a form
  - Passing expected values that we need to verify (Tabs)

  Here are few examples of what data can be converted to:
  - List
  - Map
  - List<List>
  _ List<Maps>
  - Custom data
@ListDataTable
  Example: Data Table as a list
    Given this is a data table as a list
    |Omar|
    |John|
    |Mark|
    |Asif|
    |Harry|
    |Bob  |
  @MapDataTable
Example: Data Table as a Map
  Given this is a data table as a map
  |firstName|Omar|
  |lastName |Rama|
  |middleName|John|
@ListOfLists
    Example: Data Table as a List of Lists
      Given this is a data table as list of lists
      |11111|Yoll|Academy|
      |14029|Michael Ch | Jackson|
      |14040|Kiana      |Jacob   |
@ListOfMaps
  Example: Data Table as a list of maps
    Given this is a data table as a list of maps
      |id|  firstName| lastName|
      |11111|Yoll|Academy|
      |14029|Michael Ch | Jackson|
      |14040|Kiana      |Jacob   |