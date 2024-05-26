Feature: Search functionality
  @Search
  Scenario Outline: User can search for a product
    Given user navigates to bestbuy
    When user enters "<productName>" in search box
    * quit the driver
    @Smartphones
    Examples:
    |productName|
    |iPhone Pro 15|
    |Samsung Galaxy 24|
    |Google Pixel 2024 |
@Laptops
    Examples:
    |productName|
    |MacBook Pro M3|
    |Acer 2024 laptop|
    |Hp 2024 laptop  |